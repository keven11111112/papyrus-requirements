/*****************************************************************************
 * Copyright (c)  2017 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Patrick Tessier (CEA LIST) patrick.tessier@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.proxy.command;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.papyrus.proxy.proxy.EcoreReference;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * this command is used to create a refeence to an EcoreReference Sterotype application
 *
 */
public class SetEReferenceCommand extends RecordingCommand {


	private Element ecoreReferenceElement;
	private EObject eobject;

	/**
	 * use to create a review
	 * 
	 * @param domain
	 *            the transactional editing domain in order to execute the command
	 * @param ecoreReferenceElement
	 *            the uml element that can reference an eObject
	 * @param eobject
	 *            the eobject
	 */
	public SetEReferenceCommand(TransactionalEditingDomain domain, Element ecoreReferenceElement, EObject eobject) {
		super(domain, "create Review");
		this.ecoreReferenceElement = ecoreReferenceElement;
		this.eobject = eobject;
	}

	@Override
	protected void doExecute() {

		EcoreReference ecoreReferenceApp = UMLUtil.getStereotypeApplication(ecoreReferenceElement, EcoreReference.class);
		ecoreReferenceApp.setRef(eobject);
	}

}
