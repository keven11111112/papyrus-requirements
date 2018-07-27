package org.eclipse.papyrus.bmm.ui;

/*****************************************************************************
 * Copyright (c) 2015 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Benoit Maggi (CEA LIST) benoit.maggi@cea.fr - Initial API and implementation
 *  Benoit Maggi (CEA LIST) benoit.maggi@cea.fr - #483870: Add uml standard and primitive
 *****************************************************************************/


import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.uml.diagram.common.commands.ModelCreationCommandBase;
import org.eclipse.papyrus.uml.tools.utils.PackageUtil;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.UMLFactory;


/**
 * The Class CreateBMNModelCommand.
 */
public class CreateBMMModelCommand extends ModelCreationCommandBase {

	/**
	 * @see org.eclipse.papyrus.infra.core.extension.commands.ModelCreationCommandBase#createRootElement()
	 *
	 * @return
	 */

	@Override
	protected EObject createRootElement() {
		return UMLFactory.eINSTANCE.createModel();
	}

	/**
	 * A standard BMM model should have :
	 *  - the BMM profile applied
	 *  -
	 * 
	 * @see org.eclipse.papyrus.infra.core.extension.commands.ModelCreationCommandBase#initializeModel(org.eclipse.emf.ecore.EObject)
	 *
	 * @param owner
	 */

	@Override
	protected void initializeModel(EObject owner) {
		super.initializeModel(owner);
		Package packageOwner = (Package) owner;

		// Retrieve SysML profile and apply with Sub-profile
		Profile Bmn = (Profile) PackageUtil.loadPackage(URI.createURI("pathmap://BMM_PROFILE_1.3/Bmm.profile.uml"), owner.eResource().getResourceSet());
		if (Bmn != null) {
			PackageUtil.applyProfile(packageOwner, Bmn, true);
		}

		
	}

}
