/*****************************************************************************
 * Copyright (c) 2017 CEA LIST and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Nicolas FAUVERGUE (CEA LIST) nicolas.fauvergue@cea.fr - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrus.requirements.gendoc.ui.wizards;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.gendoc.GendocProcess;
import org.eclipse.gendoc.services.GendocServices;
import org.eclipse.gendoc.services.IGendocDiagnostician;
import org.eclipse.gendoc.services.IProgressMonitorService;
import org.eclipse.gendoc.services.exception.GenDocException;
import org.eclipse.gendoc.tags.handlers.IConfigurationService;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.papyrus.infra.widgets.util.ImageConstants;
import org.eclipse.papyrus.requirements.gendoc.ui.Activator;
import org.eclipse.papyrus.requirements.gendoc.ui.wizards.pages.GenerateRequirementsPage;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.ui.PlatformUI;

/**
 * The wizard for the design phase report generation.
 */
public class GenerateRequirementsWizard extends Wizard implements IWorkbenchWizard {

	/**
	 * The page name.
	 */
	private static final String DEFAULT_PAGE_NAME = "Generate the document"; //$NON-NLS-1$

	/**
	 * The page description.
	 */
	private static final String DEFAULT_PAGE_DESCRIPTION = "This allows to generate the document from a template file"; //$NON-NLS-1$

	/**
	 * The output key for gendoc.
	 */
	private final String OUTPUT_KEY = "generic_generation_output"; //$NON-NLS-1$

	/**
	 * The model key for gendoc.
	 */
	private final String MODEL_KEY = "generic_generation_model"; //$NON-NLS-1$

	/**
	 * The page name.
	 */
	private final String pageName;

	/**
	 * The page description.
	 */
	private final String pageDescription;

	/**
	 * The wizard page.
	 */
	private GenerateRequirementsPage generateDesignPhaseReportWizardPage;

	/**
	 * The initial path.
	 */
	private IFile papyrusFile;

	/**
	 * Constructor.
	 *
	 * @param initialPath
	 *            The initial path.
	 */
	public GenerateRequirementsWizard(final IFile papyrusFile) {
		this(DEFAULT_PAGE_NAME, DEFAULT_PAGE_DESCRIPTION, papyrusFile);
	}

	/**
	 * Constructor.
	 *
	 * @param pageName
	 *            The page name.
	 * @param pageDescription
	 *            the page description.
	 * @param initialPath
	 *            The initial path.
	 */
	public GenerateRequirementsWizard(final String pageName, final String pageDescription, final IFile papyrusFile) {
		this.pageName = pageName;
		this.pageDescription = pageDescription;
		this.papyrusFile = papyrusFile;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.wizard.Wizard#createPageControls(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createPageControls(Composite pageContainer) {
		super.createPageControls(pageContainer);
		// Set the papyrus icon to the wizard shell
		getShell().setImage(
				org.eclipse.papyrus.infra.widgets.Activator.getDefault().getImage(ImageConstants.PAPYRUS_ICON_PATH));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.ui.IWorkbenchWizard#init(org.eclipse.ui.IWorkbench,
	 *      org.eclipse.jface.viewers.IStructuredSelection)
	 */
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		setWindowTitle(pageName);
		final String pluginId = Activator.PLUGIN_ID;
		final String path = "resources/icons/PapyrusWizban_75x66.gif"; //$NON-NLS-1$
		final ImageDescriptor desc = org.eclipse.papyrus.infra.widgets.Activator.getDefault()
				.getImageDescriptor(pluginId, path);
		setDefaultPageImageDescriptor(desc);
		setNeedsProgressMonitor(true);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.wizard.Wizard#addPages()
	 */
	@Override
	public void addPages() {
		super.addPages();
		// Initialize and add the wizard page
		IPath parentPath = null;
		if (null != this.papyrusFile && null != this.papyrusFile.getParent()) {
			parentPath = this.papyrusFile.getParent().getFullPath();
		}
		generateDesignPhaseReportWizardPage = new GenerateRequirementsPage(pageName, pageDescription, parentPath); // $NON-NLS-1$
		addPage(this.generateDesignPhaseReportWizardPage);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.wizard.Wizard#performFinish()
	 */
	@Override
	public boolean performFinish() {

		final String outputFileName = generateDesignPhaseReportWizardPage.getOutputFileName();
		final String templateFile = generateDesignPhaseReportWizardPage.getFilePath();
		final IPath outputFolder = generateDesignPhaseReportWizardPage.getOutputFolder();

		try {
			getContainer().run(true, true, new IRunnableWithProgress() {
				public void run(final IProgressMonitor monitor) {
					generateDocument(papyrusFile, outputFileName, templateFile, ResourcesPlugin.getWorkspace().getRoot()
							.findMember(outputFolder).getLocation().toOSString(), monitor);
				}
			});
		} catch (final InvocationTargetException e) {
			Activator.getLogHelper().error(e);
		} catch (final InterruptedException e) {
			Activator.getLogHelper().error(e);
		}

		return true;
	}

	/**
	 * Get the template path as URL.
	 * 
	 * @return The URL of the template path.
	 * @throws MalformedURLException
	 *             The possible Malformed URL exception.
	 */
	protected URL getTemplate(final String templateFile) throws MalformedURLException {
		URL result = null;
		if (templateFile.startsWith("platform:/")) { //$NON-NLS-1$
			result = new URL(templateFile);
		} else {
			final File file = new File(templateFile);
			if (file.exists()) {
				result = file.toURI().toURL();
			}
		}
		return result;
	}

	/**
	 * Build the output path.
	 * 
	 * @param outputContainer
	 *            The declared output container.
	 * @param outputFileName
	 *            The output file name.
	 * @return The built output path.
	 */
	protected String getOutputPath(final String outputContainer, final String outputFileName) {
		return outputContainer + File.separator + outputFileName;
	}

	/**
	 * This allows to generate the docx file (with gendoc and poi).
	 * 
	 * @param papyrusFile
	 *            The file representing the papyrus model.
	 * @param templateFile
	 *            The template file as String.
	 * @param outputContainer
	 *            The output container chosen by the user.
	 */
	protected void generateDocument(final IFile papyrusFile, final String outputFileName, final String templateFile,
			final String outputContainer, final IProgressMonitor monitor) {

		monitor.beginTask("Generate DesignPhase Report", -1);

		final IGendocDiagnostician diagnostician = GendocServices.getDefault().getService(IGendocDiagnostician.class);
		diagnostician.init();
		final IProgressMonitorService monitorService = (IProgressMonitorService) GendocServices.getDefault()
				.getService(IProgressMonitorService.class);
		monitorService.setMonitor(new NullProgressMonitor());

		try {
			monitor.subTask("Generate document with model data");

			final IConfigurationService configurationService = GendocServices.getDefault()
					.getService(IConfigurationService.class);
			configurationService.addParameter(OUTPUT_KEY, getOutputPath(outputContainer, outputFileName));
			String input = URI.createPlatformResourceURI(papyrusFile.getFullPath().toString(), false).toString();
			if (input.matches(".*\\.notation\\z")) { //$NON-NLS-1$
				input = input.replaceAll(".notation\\z", ".uml"); //$NON-NLS-1$
			} else {
				input = input.replaceAll(".di\\z", ".uml"); //$NON-NLS-1$
			}
			configurationService.addParameter(MODEL_KEY, input);
			final GendocProcess gendocProcess = new GendocProcess();
			final String resultFile = gendocProcess.runProcess(getTemplate(templateFile));

			doPostSubTasks(resultFile, monitor);

			monitor.done();
			
			// Refresh the project
			for (final IProject project : ResourcesPlugin.getWorkspace().getRoot().getProjects()) {
				if(null == resultFile || resultFile.isEmpty() || resultFile.contains(project.getFullPath().toOSString())){
					project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
				}
			}

			handleDiagnostic(diagnostician.getResultDiagnostic(), "The file has been generated but contains errors :\n", //$NON-NLS-1$
					resultFile);
		} catch (GenDocException e) {
			monitor.done();
			Activator.getLogHelper().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getUIMessage(), e));
			diagnostician.addDiagnostic(
					new BasicDiagnostic(Diagnostic.ERROR, Activator.PLUGIN_ID, 0, e.getUIMessage(), null));
			handleDiagnostic(diagnostician.getResultDiagnostic(), "An error occured during generation.", null); //$NON-NLS-1$
		} catch (Throwable t) {
			monitor.done();
			Activator.getLogHelper().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, t.getMessage(), t));
			diagnostician.addDiagnostic(
					new BasicDiagnostic(Diagnostic.ERROR, Activator.PLUGIN_ID, 0, t.getMessage(), t.getStackTrace()));
			handleDiagnostic(diagnostician.getResultDiagnostic(), "An unexpected error occured during the generation.", //$NON-NLS-1$
					null);
		} finally {
			GendocServices.getDefault().clear();
		}
	}

	/**
	 * This allows to do some tasks after the gendoc process.
	 * 
	 * @param resultFile
	 *            The result file.
	 * @param monitor
	 *            The progress monitor.
	 */
	protected void doPostSubTasks(final String resultFile, final IProgressMonitor monitor) {
		// Do nothing here
	}

	/**
	 * Handle diagnostic.
	 *
	 * @param resultDiagnostic
	 *            The result diagnostic.
	 * @param message
	 *            The message to display.
	 * @param resultFilePath
	 *            The result file path.
	 */
	public static void handleDiagnostic(final Diagnostic resultDiagnostic, final String message,
			final String resultFilePath) {
		if (resultDiagnostic.getSeverity() == Diagnostic.OK) {
			Display.getDefault().syncExec(new Runnable() {
				@Override
				public void run() {
					MessageDialog.openInformation(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
							"Document generator", message + resultFilePath); //$NON-NLS-1$
				}
			});
		} else if (resultDiagnostic.getSeverity() == Diagnostic.WARNING) {
			Display.getDefault().syncExec(new Runnable() {

				@Override
				public void run() {
					ErrorDialog.openError(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
							"Document generator", message + resultFilePath + "\n but contains some warnings:\n", //$NON-NLS-1$ //$NON-NLS-2$
							BasicDiagnostic.toIStatus(resultDiagnostic));
				}
			});
		} else {
			Display.getDefault().syncExec(new Runnable() {
				@Override
				public void run() {
					ErrorDialog.openError(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
							"Document generator", message, BasicDiagnostic.toIStatus(resultDiagnostic)); //$NON-NLS-1$
				}
			});
		}
	}
}
