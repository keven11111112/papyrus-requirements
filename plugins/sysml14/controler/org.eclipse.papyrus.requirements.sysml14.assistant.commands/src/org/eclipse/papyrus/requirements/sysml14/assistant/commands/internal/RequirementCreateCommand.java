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
package org.eclipse.papyrus.requirements.sysml14.assistant.commands.internal;

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.papyrus.requirements.sysml14.common.I_SysMLStereotype;
import org.eclipse.papyrus.requirements.sysml14.common.Utils;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Stereotype;

/**
 * Creates a new based on the options chosen in the Papyrus Req preferences page.
 *
 */
public class RequirementCreateCommand extends RecordingCommand {
	protected Element owner;
	private String id;
	private String text;

	/**
	 * 
	 * Constructor.
	 *
	 * @param domain
	 * @param owner never null
	 * @param id can be null, in this case it is generated
	 * @param text can be null
	 */
	public RequirementCreateCommand(TransactionalEditingDomain domain, Element owner, String id,String text) {
		super(domain, "PapyrusReqSysMLRequirementCreateCommand");
		this.owner = owner;
		this.id = id;
		this.text = text;
	}

	protected static  void createRequirement(org.eclipse.uml2.uml.Package owner, String id,String text) {
		org.eclipse.uml2.uml.Class requirement = owner.createOwnedClass("tmpName", false);
		Stereotype reqStereotype = requirement.getApplicableStereotype(I_SysMLStereotype.REQUIREMENT_STEREOTYPE);
		requirement.applyStereotype(reqStereotype);
		if( id==null) {
			id = Utils.getNewRequirementID(owner);
		}
		requirement.setName(id);
		requirement.setValue(reqStereotype, I_SysMLStereotype.REQUIREMENT_ID_ATT, id);

		if( text!=null) {
			requirement.setValue(reqStereotype, I_SysMLStereotype.REQUIREMENT_TEXT_ATT, text);
		}
	}

	@Override
	protected void doExecute() {
		if (owner instanceof Package) {
			createRequirement((Package) owner, id, text);
		} else if (owner.getNearestPackage() != null) {
			createRequirement(owner.getNearestPackage(), id, text);
		}
	}
}