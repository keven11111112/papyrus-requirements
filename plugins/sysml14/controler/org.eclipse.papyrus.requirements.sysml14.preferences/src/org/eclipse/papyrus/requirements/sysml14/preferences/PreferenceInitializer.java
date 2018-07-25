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
 *     Mauricio Alferez (mauricio.alferez@cea.fr) CEA LIST - Bugs 477726, 478595, 481377, ...
 *     
 ******************************************************************************/
package org.eclipse.papyrus.requirements.sysml14.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * Initializes the preferences for the creation of Papyrus for Requirements SysML
 * requirements
 *
 */
public class PreferenceInitializer extends AbstractPreferenceInitializer {

	@Override
	public void initializeDefaultPreferences() {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();

		// Options for requirements creation
		store.setDefault(PreferenceConstants.REQUIREMENT_ID_PREFIX, "R-");
		store.setDefault(PreferenceConstants.REQUIREMENT_ID_DIGIT, 2);
		store.setDefault(PreferenceConstants.CHILD_REQUIREMENTS_SEPARATOR, "-");
		store.setDefault(PreferenceConstants.REQUIREMENT_ID_UNIQUE_IN_ENTIRE_MODEL, true);
		
		store.setDefault(PreferenceConstants.INITIAL_CHAR, "["); 
		store.setDefault(PreferenceConstants.FINAL_CHAR, "]");
		store.setDefault(PreferenceConstants.MEANING_OF_TEXT_BETWEEN_CHARS, "Stakeholder: ");
				
	}
}
