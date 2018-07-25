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
package org.eclipse.papyrus.requirements.sysml14.migrationtoreq;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.Requirement;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.RequirementGenericCharacteristicsPackage;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * This class to define the migration rules from SysML 1.4 model to PapyrusRE model. 
 *
 */
public class SysML14ToPapyrusRERules implements MigrationFromSysML14Rules {

	/**
	 * @see org.eclipse.papyrus.requirements.sysml14.migrationtoreq.MigrationFromSysML14Rules#setRequirement(org.eclipse.uml2.uml.Element, org.eclipse.papyrus.sysml14.requirements.Requirement)
	 *
	 * @param element
	 * @param sysmlRequirement
	 */
	@Override
	public void setRequirement(Element element, org.eclipse.papyrus.sysml14.requirements.Requirement sysmlRequirement) {
		UMLUtil.StereotypeApplicationHelper.getInstance(element).applyStereotype(element, RequirementGenericCharacteristicsPackage.eINSTANCE.getRequirement());

		Requirement requirement = UMLUtil.getStereotypeApplication(element, Requirement.class);

		requirement.setId(sysmlRequirement.getId());
		requirement.setText(sysmlRequirement.getText());
	}

}
