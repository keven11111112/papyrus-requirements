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
package org.eclipse.papyrus.requirements.sysml14.ui.contribution;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.extensionpoints.editors.configuration.IDirectEditorConstraint;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.sysml14.requirements.Requirement;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.util.UMLUtil;

public class RequirementConstraint implements IDirectEditorConstraint {
	private static final String REQ_TEXT_BOILERPLATES_LANGUAGE_NAME = "Text boilerplates";
	public RequirementConstraint() {
	}

	/* (non-Javadoc)
	 * @see org.eclipse.papyrus.extensionpoints.editors.configuration.IDirectEditorConstraint#getLabel()
	 */
	@Override
	public String getLabel() {
		return REQ_TEXT_BOILERPLATES_LANGUAGE_NAME;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.papyrus.extensionpoints.editors.configuration.IDirectEditorConstraint#appliesTo(java.lang.Object)
	 */
	@Override
	public boolean appliesTo(Object selection) {
		EObject resolveEobject = EMFHelper.getEObject(selection);
		if (resolveEobject instanceof Class) {
			Class klass = (Class) resolveEobject;
			return (null != UMLUtil.getStereotypeApplication(klass, Requirement.class));
		}
		return false;
	}
}
