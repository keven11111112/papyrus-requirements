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

package org.eclipse.papyrus.requirements.gendoc.ui.wizards.pages;

import java.io.File;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.papyrus.infra.widgets.editors.StringFileSelector;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;

/**
 * The wizard page for the requirements generation.
 */
public class GenerateRequirementsPage extends WizardPage {

	/**
	 * The template file path.
	 */
	private final String DEFAULT_TEMPLATE_FILE = "platform:/plugin/org.eclipse.papyrus.requirements.gendoc.templates/resources/RequirementDoc.docx"; //$NON-NLS-1$

	/**
	 * Files allowed to be managed as template file.
	 */
	private static final String[] allowedFiles = new String[] { "*.docx" }; //$NON-NLS-1$

	/**
	 * The selected file path.
	 */
	private String selectedFilePath;

	/**
	 * The selected output folder.
	 */
	private IPath outputFolder;

	/**
	 * the output file name.
	 */
	private String outputFileName;

	/**
	 * 
	 * Constructor.
	 *
	 * @param pageName
	 *            The page name.
	 * @param pageDescription
	 *            The page description.
	 */
	public GenerateRequirementsPage(final String pageName, final String pageDescription) {
		this(pageName, pageDescription, null);
	}

	/**
	 * 
	 * Constructor.
	 *
	 * @param pageName
	 *            The page name.
	 * @param pageDescription
	 *            The page description.
	 * @param initialPath
	 *            The initial path where generate the document.
	 */
	public GenerateRequirementsPage(final String pageName, final String pageDescription, final IPath initialPath) {
		super(pageName, pageName, null);
		setDescription(pageDescription);
		// set the initial values
		setFilePath(DEFAULT_TEMPLATE_FILE);
		setOutputFolder(initialPath);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createControl(Composite parent) {
		final Composite localComposite = new Composite(parent, SWT.NONE);
		setControl(localComposite);
		localComposite.setLayout(new GridLayout(1, false));

		// Create the template group
		final Group outputFileNameGroup = new Group(localComposite, SWT.FILL);
		outputFileNameGroup.setText("Output file"); //$NON-NLS-1$
		outputFileNameGroup.setLayoutData(new GridData(SWT.FILL, SWT.NONE, true, false));
		outputFileNameGroup.setLayout(new GridLayout(2, false));

		final Label outputFileNameLabel = new Label(outputFileNameGroup, SWT.NONE);
		outputFileNameLabel.setText("Output file name:"); //$NON-NLS-1$

		// Create the destination text (not editable, only by the button)
		final Text outputFileNameText = new Text(outputFileNameGroup, SWT.BORDER);
		final GridData outputFileNameTextLayoutData = new GridData(1, 1);
		outputFileNameTextLayoutData.horizontalAlignment = SWT.FILL;
		outputFileNameTextLayoutData.grabExcessHorizontalSpace = true;
		outputFileNameTextLayoutData.verticalAlignment = SWT.FILL;
		outputFileNameTextLayoutData.grabExcessVerticalSpace = true;
		outputFileNameTextLayoutData.minimumHeight = 21;
		outputFileNameText.setLayoutData(outputFileNameTextLayoutData);
		outputFileNameText.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				setOutputFileName(outputFileNameText.getText());
				setPageComplete(isPageComplete());
			}
		});

		// Create the template group
		final Group templateGroup = new Group(localComposite, SWT.FILL);
		templateGroup.setText("Template file"); //$NON-NLS-1$
		templateGroup.setLayoutData(new GridData(SWT.FILL, SWT.NONE, true, false));
		templateGroup.setLayout(new GridLayout(2, false));

		// Create the default template button
		final Button defaultTemplate = new Button(templateGroup, SWT.RADIO);
		final GridData defaultTemplateLayoutData = new GridData(SWT.FILL, SWT.NONE, true, false);
		defaultTemplateLayoutData.horizontalSpan = 2;
		defaultTemplate.setLayoutData(defaultTemplateLayoutData);
		defaultTemplate.setText("Use default template file"); //$NON-NLS-1$
		// Change the file path when the default template button is selected
		defaultTemplate.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (defaultTemplate.getSelection()) {
					setFilePath(DEFAULT_TEMPLATE_FILE);
					setPageComplete(isPageComplete());
				}
			}
		});
		// Initialize the default template button as selected
		defaultTemplate.setSelection(true);

		// Create the custom template button
		final Button customTemplate = new Button(templateGroup, SWT.RADIO);
		customTemplate.setSelection(false);
		customTemplate.setText("Use custom template file:"); //$NON-NLS-1$

		// Create the file selector available only when the custom template button is
		// selected
		final StringFileSelector selector = new StringFileSelector(templateGroup, SWT.NONE);
		final GridData customTemplateLayoutData = new GridData(1, 1);
		customTemplateLayoutData.grabExcessVerticalSpace = true;
		selector.setLayoutData(customTemplateLayoutData);
		selector.setEnabled(customTemplate.getSelection());
		selector.getText().setEditable(customTemplate.getSelection());
		selector.setAllowFileSystem(true);
		selector.setAllowWorkspace(false);
		selector.setFilterExtensions(allowedFiles);
		selector.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		// Set a minimum width to the selector text
		if (selector.getText().getLayoutData() instanceof GridData) {
			((GridData) selector.getText().getLayoutData()).minimumWidth = 300;
		}
		// Manage the selector modification
		selector.getText().addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				if (customTemplate.getSelection()) {
					setFilePath(selector.getText().getText());
					setPageComplete(isPageComplete());
				}
			}
		});

		// Change the file path with the selector text when the custom template is
		// selected
		customTemplate.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				final boolean customTemplateSelection = customTemplate.getSelection();
				selector.setEnabled(customTemplateSelection);
				selector.getText().setEditable(customTemplateSelection);
				if (customTemplateSelection) {
					final Object value = selector.getValue();
					if (value instanceof String) {
						setFilePath((String) value);
					}
				}
				setPageComplete(isPageComplete());
			}
		});

		// Create the destination group
		final Group destinationGroup = new Group(localComposite, SWT.FILL);
		destinationGroup.setText("Destination"); //$NON-NLS-1$
		destinationGroup.setLayoutData(new GridData(SWT.FILL, SWT.NONE, true, false));
		destinationGroup.setLayout(new GridLayout(3, false));

		// Create the destination label
		final Label destinationLabel = new Label(destinationGroup, SWT.NONE);
		destinationLabel.setText("Destination:"); //$NON-NLS-1$

		// Create the destination text (not editable, only by the button)
		final Text destinationText = new Text(destinationGroup, SWT.BORDER);
		final GridData destinationTextLayoutData = new GridData(1, 1);
		destinationTextLayoutData.horizontalAlignment = SWT.FILL;
		destinationTextLayoutData.grabExcessHorizontalSpace = true;
		destinationTextLayoutData.verticalAlignment = SWT.FILL;
		destinationTextLayoutData.grabExcessVerticalSpace = true;
		destinationText.setLayoutData(destinationTextLayoutData);
		destinationText.setEditable(false);

		// Initialize the destination text with the initial output folder
		if (null != outputFolder) {
			destinationText.setText(outputFolder.toOSString());
		}

		// Create the destination browse button
		final Button browseButton = new Button(destinationGroup, SWT.PUSH);
		browseButton.setText("Browse..."); //$NON-NLS-1$
		browseButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				final ContainerSelectionDialog dialog = new ContainerSelectionDialog(
						Display.getCurrent().getActiveShell(), ResourcesPlugin.getWorkspace().getRoot(), true,
						"Select output container: "); //$NON-NLS-1$
				dialog.setTitle("Container Selection"); //$NON-NLS-1$
				if (dialog.open() == Window.OK) {
					final Object[] results = dialog.getResult();
					if (results.length == 1) {
						if (results[0] instanceof Path) {
							setOutputFolder((org.eclipse.core.runtime.Path) results[0]);
							destinationText.setText(outputFolder.toOSString());
							setPageComplete(isPageComplete());
						}
					}
				}
			}
		});
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.wizard.WizardPage#isPageComplete()
	 */
	@Override
	public boolean isPageComplete() {
		final boolean isValidOutputFileName = getOutputFileName() != null && !getOutputFileName().isEmpty();
		final boolean isValidFilePath = getFilePath() != null && !getFilePath().isEmpty();
		final boolean isValidOutputFolder = getOutputFolder() != null && !getOutputFolder().toOSString().isEmpty();
		final boolean isFileExist = getFilePath() != null && !getFilePath().startsWith("platform:/")
				? new File(getFilePath()).exists()
				: true;

		if (!isValidOutputFileName) {
			setErrorMessage("The output file name must be filled"); //$NON-NLS-1$
		} else if (!isValidFilePath) {
			setErrorMessage("The template file must be filled"); //$NON-NLS-1$
		} else if (!isFileExist) {
			setErrorMessage("The template file does not exist"); //$NON-NLS-1$
		} else if (!isValidOutputFolder) {
			setErrorMessage("The destination must be filled"); //$NON-NLS-1$
		} else {
			setErrorMessage(null);
		}

		return isValidFilePath && isValidOutputFolder && isFileExist;
	}

	/**
	 * This allows to replace the percent char by spaces.
	 * 
	 * @param theString
	 *            The string containing space character.
	 * @return The string with percentage character.
	 */
	protected String formatStringForURL(final String theString) {
		return theString.replaceAll(" ", "%20").replaceAll("\\\\", "/"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	}

	/**
	 * This allows to get the selected file.
	 * 
	 * @return The selected file.
	 */
	public String getFilePath() {
		return this.selectedFilePath;
	}

	/**
	 * This allows to set the file path.
	 * 
	 * @param filePath
	 *            Find the file from the filePath and set it.
	 */
	public void setFilePath(final String filePath) {
		if (filePath == null || filePath.length() == 0) {
			this.selectedFilePath = null;
		} else {
			this.selectedFilePath = formatStringForURL(filePath);
		}
	}

	/**
	 * This allows to get the output folder.
	 * 
	 * @return The output folder.
	 */
	public IPath getOutputFolder() {
		return this.outputFolder;
	}

	/**
	 * This allows to set the output folder.
	 * 
	 * @param outputFolder
	 *            Find the file from the output folder and set it.
	 */
	public void setOutputFolder(final IPath outputFolder) {
		if (outputFolder == null || outputFolder.toOSString().length() == 0) {
			this.outputFolder = null;
		} else {
			this.outputFolder = outputFolder;
		}
	}

	/**
	 * This allows to get the output file name.
	 * 
	 * @return The output file name.
	 */
	public String getOutputFileName() {
		return this.outputFileName;
	}

	/**
	 * This allows to set the output file name.
	 * 
	 * @param outputFileName
	 *            Find the file from the output file name and set it.
	 */
	public void setOutputFileName(final String outputFileName) {
		if (outputFileName == null || outputFileName.isEmpty()) {
			this.outputFileName = null;
		} else {
			this.outputFileName = outputFileName;
			if(!this.outputFileName.endsWith(".docx")) { //$NON-NLS-1$
				this.outputFileName = this.outputFileName + ".docx"; //$NON-NLS-1$
			}
		}
	}

}
