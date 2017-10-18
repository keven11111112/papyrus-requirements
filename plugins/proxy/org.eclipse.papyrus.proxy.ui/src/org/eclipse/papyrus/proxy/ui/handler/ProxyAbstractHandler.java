/*****************************************************************************
 * Copyright (c) 2014, 2017 CEA LIST.
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
package org.eclipse.papyrus.proxy.ui.handler;

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.PlatformUI;
import org.eclipse.uml2.uml.Element;

/**
 * This is an abstract handler that can be used by other handlers. it provides methods to get list of selected elements.
 *
 */
public abstract class ProxyAbstractHandler extends AbstractHandler {

	/**
	 * the constructor
	 */
	public ProxyAbstractHandler() {
		super();
	}

	/**
	 * getSelected element in the diagram or in hte model explorer
	 * 
	 * @return Element or null
	 */
	protected Element getSelection() {
		org.eclipse.uml2.uml.Element selectedElement = null;
		final ISelectionService selectionService = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService();
		final ISelection selection = selectionService.getSelection();

		if (selection instanceof IStructuredSelection) {
			final Object selectedobject = ((IStructuredSelection) selection).getFirstElement();

			if (selectedobject instanceof IAdaptable) {
				final EObject selectedEObject = ((IAdaptable) selectedobject).getAdapter(EObject.class);
				if (selectedEObject instanceof org.eclipse.uml2.uml.Element) {
					selectedElement = (Element) selectedEObject;
				}
			}

			return selectedElement;
		}
		return null;
	}

	/**
	 * getSelected element in the diagram or in hte model explorer
	 * 
	 * @return Element or null
	 */
	protected ArrayList<Element> getSelectionSet() {
		ArrayList<Element> selectedSet = new ArrayList<Element>();
		ISelectionService selectionService = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService();
		ISelection selection = selectionService.getSelection();

		// look for papyrus

		if (selection instanceof IStructuredSelection) {
			@SuppressWarnings("rawtypes")
			Iterator selectedobjectIteractor = ((IStructuredSelection) selection).iterator();
			while (selectedobjectIteractor.hasNext()) {
				Object currentSelection = selectedobjectIteractor.next();
				if (currentSelection instanceof org.eclipse.uml2.uml.Element) {
					selectedSet.add((Element) currentSelection);
				}
			}


		}
		return selectedSet;
	}
}