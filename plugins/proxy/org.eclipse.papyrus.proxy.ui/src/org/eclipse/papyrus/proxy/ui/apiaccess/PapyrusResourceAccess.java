/*****************************************************************************
 * Copyright (c) 2017 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Patrick Tessier (CEA LIST) patrick.tessier@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.proxy.ui.apiaccess;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.core.services.ServicesRegistry;
import org.eclipse.papyrus.infra.ui.editor.IMultiDiagramEditor;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.dialogs.PatternFilter;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.osgi.framework.ServiceException;


/**
 * This class is used to access of loading file by using papyrus
 * 
 */
public class PapyrusResourceAccess {

	protected ModelSet modelSet;

	/**
	 * 
	 * @return the editing domain of papyrus
	 */
	public TransactionalEditingDomain getDomain() {
		return getCurrentModelSet().getTransactionalEditingDomain();
	}

	public EObject getRootEObjectFromResource() {
		ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(Display.getDefault().getActiveShell(), new WorkbenchLabelProvider(), new BaseWorkbenchContentProvider());
		dialog.setInput(ResourcesPlugin.getWorkspace().getRoot());

		PatternFilter UMLPattern = new PatternFilter() {
			@Override
			public boolean isElementVisible(Viewer viewer, Object element) {
				if (viewer != null) {
					return super.isElementVisible(viewer, element);
				}
				return true;
			}
		};
		UMLPattern.setPattern("*.*");
		dialog.setAllowMultiple(false);
		dialog.addFilter(UMLPattern);
		dialog.open();
		if (dialog.getResult().length > 0) {
			Object object = dialog.getResult()[0];
			if (object instanceof IFile) {
				IFile aReviewModel = ((IFile) object);
				Resource tmpResource = getCurrentModelSet().getResource(URI.createPlatformResourceURI(aReviewModel.getFullPath().toOSString(), true), true);
				return tmpResource.getContents().get(0);

			}
		}
		return null;
	}

	/**
	 * used to get the the current workbenchPart
	 * 
	 * @return
	 */
	protected IWorkbenchPart getBootstrapPart() {


		IWorkbenchPart part = null;
		try {
			IWorkbenchWindow activeWorkbenchWindow = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
			if (activeWorkbenchWindow != null) {
				IWorkbenchPage activePage = activeWorkbenchWindow.getActivePage();
				if (activePage != null) {
					part = activePage.getActiveEditor();
				}
			}
		} catch (NullPointerException e) {
			// An element is not active yet
			return null;
		}
		if (isImportant(part)) {
			return part;
		}
		// The current active part is not for us.
		return null;
	}

	/**
	 * return true if the activated part is a {@link IMultiDiagramEditor}.
	 *
	 * @see org.eclipse.ui.part.PageBookView#isImportant(org.eclipse.ui.IWorkbenchPart)
	 *
	 * @param part
	 * @return
	 */
	protected boolean isImportant(IWorkbenchPart part) {


		if (part instanceof IMultiDiagramEditor) {
			return true;
		}

		return false;
	}

	/**
	 * 
	 * @return the current model set of papyrus.
	 */
	public ModelSet getCurrentModelSet() {
		if (modelSet != null) {
			return modelSet;
		}
		IWorkbenchPart part = getBootstrapPart();
		if (part instanceof IMultiDiagramEditor) {
			try {
				modelSet = getServiceRegistry().getService(ModelSet.class);
			} catch (ServiceException e) {
				e.printStackTrace();
			} catch (org.eclipse.papyrus.infra.core.services.ServiceException e) {
				e.printStackTrace();
			}
		}
		return modelSet;
	}

	/**
	 * @return current service registry
	 */
	public ServicesRegistry getServiceRegistry() {
		IWorkbenchPart part = getBootstrapPart();
		if (part instanceof IMultiDiagramEditor) {
			ServicesRegistry registry = ((IMultiDiagramEditor) part).getServicesRegistry();
			return registry;
		}
		return null;
	}

}
