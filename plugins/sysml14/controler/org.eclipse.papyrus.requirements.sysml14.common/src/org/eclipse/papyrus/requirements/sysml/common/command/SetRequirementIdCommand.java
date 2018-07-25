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
package org.eclipse.papyrus.requirements.sysml.common.command;

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.papyrus.requirements.sysml14.common.I_SysMLStereotype;
import org.eclipse.papyrus.requirements.sysml14.common.Utils;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Stereotype;

/**
 * Set Id to all sub requirement from a package by taking as prefix the name of the package
 *
 */
public class SetRequirementIdCommand extends RecordingCommand {
	protected org.eclipse.uml2.uml.Element selectedElement;
	protected TransactionalEditingDomain domain;


	public SetRequirementIdCommand(TransactionalEditingDomain domain, Element selectedElement) {
		super(domain, "PapyrusReqSysMLRequirementCreateCommand");
		this.selectedElement = selectedElement;
	}

	protected void setID(org.eclipse.uml2.uml.Class  reqclass, String text) {
		Stereotype reqStereotype = reqclass.getApplicableStereotype(I_SysMLStereotype.REQUIREMENT_STEREOTYPE);
		String id = Utils.getNewRequirementID(reqclass.getOwner());
		reqclass.setName(id);
		reqclass.setValue(reqStereotype, I_SysMLStereotype.REQUIREMENT_ID_ATT, id);
	}

	@Override
	protected void doExecute() {
		if (selectedElement instanceof Class) {
			setID((Class) selectedElement, "");
		}
	}

}