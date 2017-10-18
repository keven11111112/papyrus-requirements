/*****************************************************************************
 * Copyright (c) 2017 CEA LIST.
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
package org.eclipse.papyrus.proxy.ui.handler;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.proxy.command.SetEReferenceCommand;
import org.eclipse.papyrus.proxy.proxy.EcoreReference;
import org.eclipse.papyrus.proxy.ui.apiaccess.PapyrusResourceAccess;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.util.UMLUtil;

public class LinkToEcoreModelHandler extends ProxyAbstractHandler {


	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		PapyrusResourceAccess papyrusResourceAccess = new PapyrusResourceAccess();
		EObject root = papyrusResourceAccess.getRootEObjectFromResource();
		if (root != null) {
			SetEReferenceCommand setEReferenceCommand = new SetEReferenceCommand(papyrusResourceAccess.getDomain(), getSelection(), root);
			papyrusResourceAccess.getDomain().getCommandStack().execute(setEReferenceCommand);
		}
		return null;
	}


	@Override
	public boolean isEnabled() {
		Element selectedElement = getSelection();
		if (UMLUtil.getStereotypeApplication(selectedElement, EcoreReference.class) != null) {
			return true;
		}
		return false;
	}
}
