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
 *     CEA LIST - initial API and implementation
 *     Mauricio Alferez (mauricio.alferez@cea.fr) CEA LIST - Bugs 477726, 478595, 481377, etc.
 *     
 *******************************************************************************/

package org.eclipse.papyrus.requirements.sysml14.preferences;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IntegerFieldEditor;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Group;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

/**
 * Preference page related to SysML Papyrus for Requirements
 *
 */
public class PreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	public PreferencePage() {
		super(GRID);
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		setDescription("Papyrus SysML Requirements");
	}

	/**
	 * Creates the field editors. Field editors are abstractions of the common
	 * GUI blocks needed to manipulate various types of preferences. Each field
	 * editor knows how to save and restore itself.
	 */
	@Override
	public void createFieldEditors() {
		Group reqCreationOptions = createGroup("Requirements creation");
		addField(new StringFieldEditor(PreferenceConstants.REQUIREMENT_ID_PREFIX, "Prefix for requirement ID",
				reqCreationOptions));
		addField(new IntegerFieldEditor(PreferenceConstants.REQUIREMENT_ID_DIGIT, "Number of digits for requirement ID",
				reqCreationOptions));
		addField(new StringFieldEditor(PreferenceConstants.CHILD_REQUIREMENTS_SEPARATOR,
				"Separator between parent and child requirements IDs", reqCreationOptions));
		addField(new BooleanFieldEditor(PreferenceConstants.REQUIREMENT_ID_UNIQUE_IN_ENTIRE_MODEL,
				"ID must be unique in the entire model?", reqCreationOptions));
		
		Group annotationsOptions = createGroup("Requirements extract annotations as comments");
		addField(new StringFieldEditor(PreferenceConstants.INITIAL_CHAR, "Initial character",
				annotationsOptions));
		addField(new StringFieldEditor(PreferenceConstants.FINAL_CHAR, "Final character",
				annotationsOptions));
		addField(new StringFieldEditor(PreferenceConstants.MEANING_OF_TEXT_BETWEEN_CHARS, "Label to identify what is between the initial and characters",
				annotationsOptions));

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
	}

	private Group createGroup(String text) {
		Group group = new Group(getFieldEditorParent(), SWT.NONE);
		// group.setLayout(new GridLayout(1, false));

		GridLayout gridLayout = new GridLayout(2, false);
		GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
		gridData.grabExcessHorizontalSpace = true;
		gridData.horizontalSpan = 2;

		group.setLayoutData(gridData);
		group.setLayout(gridLayout);

		group.setText(text);

		return group;
	}
}