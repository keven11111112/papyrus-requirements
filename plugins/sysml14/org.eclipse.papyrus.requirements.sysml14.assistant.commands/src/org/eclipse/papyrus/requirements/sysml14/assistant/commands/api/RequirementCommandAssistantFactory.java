/*****************************************************************************
 * Copyright (c) 2018 CEA LIST and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   CEA LIST - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrus.requirements.sysml14.assistant.commands.api;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.papyrus.requirements.sysml14.assistant.commands.PapyrusReqSysMLRequirementCreateCommand;
import org.eclipse.papyrus.requirements.sysml14.assistant.commands.internal.RequirementCreateCommand;
import org.eclipse.uml2.uml.Element;

/**
 *This Factory lists all possible command to create Requirements
 *
 */
public class RequirementCommandAssistantFactory {

	/**
	 * 
	 * @param domain
	 * @param owner the owner of the requirement
	 * @return a command to create a requirement
	 */
	public Command createRequirementCommand(TransactionalEditingDomain domain, Element owner, String id, String text) {
		 return  new RequirementCreateCommand(domain, owner, id, text);
	}
}
