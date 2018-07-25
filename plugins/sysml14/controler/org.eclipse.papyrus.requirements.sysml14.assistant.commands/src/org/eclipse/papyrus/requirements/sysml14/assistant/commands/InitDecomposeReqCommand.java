/*****************************************************************************
 * Copyright (c) 2016 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 
 * 		Mauricio Alferez (mauricio.alferez@cea.fr) CEA LIST - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.requirements.sysml14.assistant.commands;

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.papyrus.requirements.sysml14.common.I_SysMLStereotype;
import org.eclipse.papyrus.requirements.sysml14.common.Utils;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Stereotype;

/**
 * Creates a requirement and adds a decomposition link from the selected
 * requirement to the new requirement. The names are based on the Papyrus for Requirements
 * preferences.
 *
 */
public class InitDecomposeReqCommand extends RecordingCommand {
	protected Element selectedElement;
	TransactionalEditingDomain domain;

	public InitDecomposeReqCommand(TransactionalEditingDomain domain, Element selectedElement) {
		super(domain, "DecomposeReqCommand");
		this.selectedElement = selectedElement;
		this.domain = domain;
	}

	@Override
	protected void doExecute() {
		String concatenedString = "";
		org.eclipse.uml2.uml.Package owner = null;
		if (selectedElement.getAppliedStereotype(I_SysMLStereotype.REQUIREMENT_STEREOTYPE) != null) {
			Stereotype stereotype = selectedElement.getAppliedStereotype(I_SysMLStereotype.REQUIREMENT_STEREOTYPE);
			concatenedString = concatenedString + selectedElement.getValue(stereotype, I_SysMLStereotype.REQUIREMENT_TEXT_ATT);
			owner = selectedElement.getNearestPackage();
			String id = Utils.getNewRequirementID((Class) selectedElement);
			Class req = owner.createOwnedClass(id, false);
			Stereotype reqStereotype = req.getApplicableStereotype(I_SysMLStereotype.REQUIREMENT_STEREOTYPE);
			req.applyStereotype(reqStereotype);
			req.setValue(reqStereotype, I_SysMLStereotype.REQUIREMENT_TEXT_ATT, concatenedString);
			req.setValue(reqStereotype, I_SysMLStereotype.REQUIREMENT_ID_ATT, id);
			DecomposeReqCommand decompositionReqCreateCommand = new DecomposeReqCommand(domain, req,
					(Class) selectedElement);
			decompositionReqCreateCommand.execute();
		}
	}

}