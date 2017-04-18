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
package org.eclipse.papyrus.requirements.sysml14.ui.editor;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.papyrus.extensionpoints.editors.Activator;
import org.eclipse.papyrus.extensionpoints.editors.utils.IDirectEditorsIds;
import org.eclipse.papyrus.requirements.sysml14.ui.contribution.RequirementsTextBoilerplatesXtextDirectEditorConfiguration;
import org.eclipse.papyrus.uml.xtext.integration.DefaultXtextDirectEditorConfiguration;

public class RequirementsTextBoilerplatesLanguageEditor extends XtextLanguageEditor {
	@Override
	protected DefaultXtextDirectEditorConfiguration getConfigurationFromSelection() {
		EObject semanticElement = getEObject();
		if (semanticElement != null) {
			IPreferenceStore store = Activator.getDefault().getPreferenceStore();
			String semanticClassName = semanticElement.eClass().getInstanceClassName();
			String key = IDirectEditorsIds.EDITOR_FOR_ELEMENT + semanticClassName;
			if (key.endsWith("org.eclipse.uml2.uml.Class")) {
				RequirementsTextBoilerplatesXtextDirectEditorConfiguration cfg = new RequirementsTextBoilerplatesXtextDirectEditorConfiguration();
				cfg.preEditAction(semanticElement);
				return cfg;
			}
		}
		return super.getConfigurationFromSelection();
	}
}
