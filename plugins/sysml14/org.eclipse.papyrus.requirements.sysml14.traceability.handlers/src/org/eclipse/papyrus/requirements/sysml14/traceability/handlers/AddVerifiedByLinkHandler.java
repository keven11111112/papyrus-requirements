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
package org.eclipse.papyrus.requirements.sysml14.traceability.handlers;

import java.util.ArrayList;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.papyrus.requirements.sysml14.common.PapyrusAbstractHandler;
import org.eclipse.papyrus.requirements.sysml14.traceability.commands.AddVerifiedByLinkCommand;
import org.eclipse.papyrus.requirements.sysml14.traceability.commands.VerifyCreateCommand;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;

/**
 * Executes the addition of Verify links based on a selected requirement
 *
 */
public class AddVerifiedByLinkHandler extends PapyrusAbstractHandler {

	public Object execute(ExecutionEvent event) throws ExecutionException {
		super.execute(event);
		ArrayList<Element> selectedElements = getSelectionSet();
		if (selectedElements.size() == 2) {
			VerifyCreateCommand addVerifyCreateCommand = new VerifyCreateCommand(transactionalEditingDomain,
					(NamedElement) selectedElements.get(1), (NamedElement) selectedElements.get(0));
			transactionalEditingDomain.getCommandStack().execute(addVerifyCreateCommand);
		} else {
			Element selectedElement = getSelection();
			if (selectedElement != null) {
				AddVerifiedByLinkCommand addVerifiedByLinkCommand = new AddVerifiedByLinkCommand(transactionalEditingDomain,
						selectedElement);
				transactionalEditingDomain.getCommandStack().execute(addVerifiedByLinkCommand);
			}
		}
		return null;
	}

	/**
	 * 
	 * @see org.eclipse.core.commands.AbstractHandler#isEnabled()
	 * 
	 * @return true if the handler is possible
	 */
	@Override
	public boolean isEnabled() {
		Element selectedElement = getSelection();
		if (selectedElement != null) {
			return true;
		} else {
			return false;
		}
	}

}