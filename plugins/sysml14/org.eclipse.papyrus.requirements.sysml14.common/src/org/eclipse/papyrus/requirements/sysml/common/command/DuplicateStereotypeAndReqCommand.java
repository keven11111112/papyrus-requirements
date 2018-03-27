/*****************************************************************************
 * Copyright (c) 2018 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Patrick Tessier (CEA LIST)  - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.requirements.sysml.common.command;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.papyrus.requirements.sysml14.common.Utils;
import org.eclipse.papyrus.sysml14.requirements.Requirement;
import org.eclipse.papyrus.uml.tools.commands.DuplicateStereotypeCommand;
import org.eclipse.uml2.uml.Element;

/**
 * A Command to apply a Stereotype and its data to an UML Element
 *
 * @author Patrick Tessier
 */
public class DuplicateStereotypeAndReqCommand extends DuplicateStereotypeCommand {

	/**
	 *
	 * Constructor.
	 *
	 * @param domain
	 *            The editing domain
	 * @param element
	 *            The UML Element on which the stereotype will be applied
	 * @param stereotypeApplication
	 *            The stereotype to apply
	 */
	public DuplicateStereotypeAndReqCommand(TransactionalEditingDomain domain, Element element, EObject stereotypeApplication) {
		this(domain, element, element, stereotypeApplication);
	}

	/**
	 *
	 * Constructor.
	 *
	 * @param domain
	 *            The editing domain
	 * @param element
	 *            The UML Element on which the stereotype will be applied
	 * @param targetContainer
	 *            target container for the element. This information is required to reload the stereotype to the target context.
	 *            It can not be deduced from the element, since the latter has not been added to the target container yet.
	 * @param stereotypeApplication
	 *            The stereotype to apply
	 */
	public DuplicateStereotypeAndReqCommand(TransactionalEditingDomain domain, Element element, Element targetContainer, EObject stereotypeApplication) {
		super(domain, element, targetContainer, stereotypeApplication);
	}


	@Override
	protected void doExecute() {
		super.doExecute();
		
		// Retrieve the stereotype application for the element
		EObject applyStereotype = element.getStereotypeApplication(stereotypeInTargetContext);
		
		if(applyStereotype instanceof Requirement) {
			String id = Utils.getNewRequirementID(((Requirement) applyStereotype).getBase_Class().getOwner());
			((Requirement) applyStereotype).getBase_Class().setName(id);
			((Requirement)applyStereotype).setId(id);
		}
	}
}
