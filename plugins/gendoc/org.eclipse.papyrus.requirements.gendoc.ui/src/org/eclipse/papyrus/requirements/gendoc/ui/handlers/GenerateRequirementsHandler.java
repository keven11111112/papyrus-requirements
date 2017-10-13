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

package org.eclipse.papyrus.requirements.gendoc.ui.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.papyrus.emf.facet.custom.metamodel.v0_2_0.internal.treeproxy.EObjectTreeElement;
import org.eclipse.papyrus.requirements.gendoc.ui.wizards.GenerateRequirementsWizard;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * The handler to generate the requirements file.
 */
public class GenerateRequirementsHandler extends AbstractHandler {

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final ISelection selection = HandlerUtil.getCurrentSelection(event);
		if (selection instanceof IStructuredSelection) {

			final IStructuredSelection selec = (IStructuredSelection) selection;
			Object firstElement = selec.getFirstElement();
			
			if(firstElement instanceof EObjectTreeElement) {
				firstElement = ((EObjectTreeElement)firstElement).getEObject();
			}

			if (null != firstElement && firstElement instanceof EObject) {
				final EObject selectedEObject = (EObject) firstElement;
				final GenerateRequirementsWizard designPhaseReportWizard = new GenerateRequirementsWizard("Generate the requirements file", "This allows to generate the requirements document from a template file", getFile(selectedEObject.eResource())); //$NON-NLS-1$ //$NON-NLS-2$
				designPhaseReportWizard.init(PlatformUI.getWorkbench(), (IStructuredSelection) selection);
				final WizardDialog dialog = new WizardDialog(Display.getDefault().getActiveShell(), designPhaseReportWizard);
				dialog.open();
			}
		}

		return null;
	}

	/**
	 * This allows to get IFile from a resource.
	 * 
	 * @param resource
	 *            The initial resource from the EObject selected.
	 * @return The IFile corresponding.
	 */
	protected IFile getFile(final Resource resource) {
		if (null != resource) {
			URI uri = resource.getURI();
			uri = resource.getResourceSet().getURIConverter().normalize(uri);
			final String scheme = uri.scheme();
			if ("platform".equals(scheme) && uri.segmentCount() > 1 && "resource".equals(uri.segment(0))) { //$NON-NLS-1$ //$NON-NLS-2$
				final StringBuffer platformResourcePath = new StringBuffer();
				for (int j = 1, size = uri.segmentCount(); j < size; ++j) {
					platformResourcePath.append('/'); // $NON-NLS-1$
					platformResourcePath.append(uri.segment(j));
				}
				return ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(platformResourcePath.toString()));
			}
		}
		return null;
	}
}
