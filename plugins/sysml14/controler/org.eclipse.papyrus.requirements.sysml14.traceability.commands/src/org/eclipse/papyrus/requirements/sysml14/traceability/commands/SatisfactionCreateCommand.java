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
 * 
 * 		Patrick Tessier (patrick.tessier@cea.fr) CEA LIST - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.requirements.sysml14.traceability.commands;

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.papyrus.requirements.sysml14.common.I_SysMLStereotype;
import org.eclipse.uml2.uml.Abstraction;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLFactory;


/**
 * this command is used to create a link "satisfyBy" between requirement and namedElement
 *
 */
public class SatisfactionCreateCommand extends RecordingCommand {
	private NamedElement source;
	private NamedElement target;
	/**
	 * use to make an abstraction 
	 * @param domain the domain to execute a transaction
	 * @param source the source of the abstraction (the more concrete element)
	 * @param target the target of the abstraction (the more abstract element)

	 */
	public SatisfactionCreateCommand(TransactionalEditingDomain domain, NamedElement source, NamedElement target){ 
		super(domain,"Create an Abstraction");
		this.source=source;
		this.target=target;
	}

	@Override
	protected void doExecute() {
		Abstraction theAbstraction= UMLFactory.eINSTANCE.createAbstraction();
		target.getNearestPackage().getPackagedElements().add(theAbstraction);
		theAbstraction.getSuppliers().add(source);
		theAbstraction.getClients().add(target);
		theAbstraction.setName("SatisfactionOf_"+this.source.getName());
		Stereotype satisfyStereotype= theAbstraction.getApplicableStereotype(I_SysMLStereotype.SATISFY_STEREOTYPE);
		theAbstraction.applyStereotype(satisfyStereotype);
	}

}
