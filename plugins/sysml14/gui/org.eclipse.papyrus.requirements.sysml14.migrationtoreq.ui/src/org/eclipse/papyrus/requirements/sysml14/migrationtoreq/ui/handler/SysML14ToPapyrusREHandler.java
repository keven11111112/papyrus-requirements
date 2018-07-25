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

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.requirements.sysml14.migrationtoreq.MigrationToSysML14Requirement;
import org.eclipse.papyrus.requirements.sysml14.migrationtoreq.SysML14ToPapyrusRERules;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.set.PapyrusRESet;
import org.eclipse.papyrus.uml.tools.utils.PackageUtil;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;

/**
 * Handler class for migrating a SysML 1.4 model to a PapyrusRE model.
 *
 */
public class SysML14ToPapyrusREHandler extends MigartionToSysML14RequirementHandler {

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
			MigrationToSysML14Requirement.executeMigration(selectedPackage, rules, papyrusREProfile, topModel);
		}

		return null;
	}

}
