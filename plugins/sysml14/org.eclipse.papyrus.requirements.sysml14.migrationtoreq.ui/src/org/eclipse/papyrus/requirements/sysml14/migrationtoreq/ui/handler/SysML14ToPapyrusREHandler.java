/*******************************************************************************
 * Copyright (c) 2017 CEA LIST.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Yupanqui Munoz Julho (CEA LIST) <yupanqui.munozjulho@cea.fr> - initial API and implementation
 *******************************************************************************/
package org.eclipse.papyrus.requirements.sysml14.migrationtoreq.ui.handler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.requirements.sysml14.migrationtoreq.SysML14ToPapyrusRE;
import org.eclipse.papyrus.requirements.sysml14.migrationtoreq.SysML14ToPapyrusRERules;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.set.PapyrusRESet;
import org.eclipse.papyrus.uml.tools.utils.PackageUtil;
import org.eclipse.ui.PlatformUI;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;

/**
 * Handler class for migrating a SysML 1.4 model to a PapyrusRE model.
 *
 */
public class SysML14ToPapyrusREHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		EObject selectedEObject = getEObjectOfSelection();

		if (selectedEObject == null) {
			return null;
		}

		if (selectedEObject instanceof Package) {
			Package selectedPackage = (Package) selectedEObject;

			Model topModel = (Model) getTopElement(selectedPackage);

			Profile papyrusREProfile = (Profile) PackageUtil.loadPackage(URI.createURI(PapyrusRESet.PROFILE_PATH), topModel.eResource().getResourceSet());
			SysML14ToPapyrusRERules rules = new SysML14ToPapyrusRERules();
			SysML14ToPapyrusRE.executeMigration(selectedPackage, rules, papyrusREProfile, topModel);
		}

		return null;
	}

	/**
	 * Get top owner element of the given element.
	 *
	 * @param element
	 *            Starting point of the search
	 * @return Top model found
	 */
	private static Element getTopElement(final Element element) {

		if (element.getOwner() != null) {
			return getTopElement(element.getOwner());
		} else {
			return element;
		}

	}

	/**
	 * Get the selected EObject from Model Explorer.
	 * 
	 * @return
	 */
	private static EObject getEObjectOfSelection() {
		IStructuredSelection selection = (IStructuredSelection) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService().getSelection();
		EObject selectedEObject = null;

		if (selection != null) {
			selectedEObject = EMFHelper.getEObject(selection.getFirstElement());
		}

		return selectedEObject;
	}

	/**
	 * The handler is capable of executing at this time if the selected element is a UML Class.
	 * 
	 * {@inheritDoc}
	 */
	@Override
	public boolean isEnabled() {
		if (getEObjectOfSelection() instanceof Package) {
			return true;
		}
		return super.isEnabled();
	}

}
