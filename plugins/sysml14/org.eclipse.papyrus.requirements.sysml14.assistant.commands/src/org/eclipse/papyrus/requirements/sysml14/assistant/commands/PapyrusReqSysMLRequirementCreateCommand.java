/*****************************************************************************
 * Copyright (c) 2015 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
*     CEA LIST. - initial API and implementation
*******************************************************************************/
package org.eclipse.papyrus.requirements.sysml14.assistant.commands;

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.papyrus.requirements.sysml14.common.I_SysMLStereotype;
import org.eclipse.papyrus.requirements.sysml14.common.Utils;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Stereotype;

/**
 * Creates a new SysML requirement based on the options chosen in the Papyrus Req preferences page.
 *
 */
public class PapyrusReqSysMLRequirementCreateCommand extends RecordingCommand {
	protected Element selectedElement;

	public PapyrusReqSysMLRequirementCreateCommand(TransactionalEditingDomain domain, Element selectedElements) {
		super(domain, "PapyrusReqSysMLRequirementCreateCommand");
		this.selectedElement = selectedElements;
	}

	protected void createRequirement(org.eclipse.uml2.uml.Package owner, String text) {
		org.eclipse.uml2.uml.Class requirement = owner.createOwnedClass("tmpName", false);
		Stereotype reqStereotype = requirement.getApplicableStereotype(I_SysMLStereotype.REQUIREMENT_STEREOTYPE);
		requirement.applyStereotype(reqStereotype);
		String id = Utils.getNewRequirementID(owner);
		requirement.setName(id);
		requirement.setValue(reqStereotype, I_SysMLStereotype.REQUIREMENT_ID_ATT, id);
	}

	@Override
	protected void doExecute() {
		if (selectedElement instanceof Package) {
			createRequirement((Package) selectedElement, "");
		} else if (selectedElement.getNearestPackage() != null) {
			createRequirement(selectedElement.getNearestPackage(), "");
		}
	}
}