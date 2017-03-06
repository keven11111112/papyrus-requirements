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
 * 
 * 		Mauricio Alferez (mauricio.alferez@cea.fr) CEA LIST - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.requirements.cheatsheet.handlers;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.papyrus.bmm.diagram.ui.NewBmmProjectWizard;
import org.eclipse.ui.INewWizard;

public class CreateBmmProjectWizardHandler extends AbstractOpenWizardHandler{

	@Override
	protected INewWizard getConcreteWizard() throws CoreException {
		return new NewBmmProjectWizard();
	}
}
