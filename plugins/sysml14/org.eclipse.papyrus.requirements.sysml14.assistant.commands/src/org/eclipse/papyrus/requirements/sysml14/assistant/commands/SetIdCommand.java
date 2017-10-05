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
package org.eclipse.papyrus.requirements.sysml14.assistant.commands;

import java.text.DecimalFormat;

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.papyrus.requirements.sysml14.common.I_SysMLStereotype;
import org.eclipse.papyrus.requirements.sysml14.preferences.PreferenceConstants;
import org.eclipse.papyrus.sysml14.requirements.Requirement;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * Set Id to all sub requirement from a package by taking as prefix the name of the package
 *
 */
public class SetIdCommand extends RecordingCommand {
	protected org.eclipse.uml2.uml.Package selectedElement;
	protected TransactionalEditingDomain domain;


	public SetIdCommand(TransactionalEditingDomain domain, org.eclipse.uml2.uml.Package selectedElement) {
		super(domain, "SetIdFromPackageCommand");
		this.selectedElement = selectedElement;
		this.domain = domain;
	}

	@Override
	protected void doExecute() {
		IPreferenceStore store = org.eclipse.papyrus.requirements.sysml14.preferences.Activator.getDefault().getPreferenceStore();
		int digit = store.getInt(PreferenceConstants.REQUIREMENT_ID_DIGIT);// by
		String separator = store.getString(PreferenceConstants.CHILD_REQUIREMENTS_SEPARATOR);

		String concatenedString = "";
		org.eclipse.uml2.uml.Package owner = null;
		int index = 1;
		for (PackageableElement packageableElement : selectedElement.getPackagedElements()) {
			if (UMLUtil.getStereotypeApplication(packageableElement, Requirement.class) != null) {
				// set id

				Requirement req = UMLUtil.getStereotypeApplication(((org.eclipse.uml2.uml.Class) packageableElement), Requirement.class);
				DecimalFormat df = new DecimalFormat();
				df.setMinimumIntegerDigits(digit);
				String value = (df.format(index));
				req.setId("" + selectedElement.getName() + separator + value);
				index++;

				// if (req.getText() == null || req.getText().trim().equals("")) {
				// req.setText("QS should " + packageableElement.getName().toLowerCase());
				// }
				setIdforClassifier(req.getId(), (Class) packageableElement);
			}

			else {
				if (packageableElement instanceof Class) {
					Stereotype stereo = packageableElement.getApplicableStereotype(I_SysMLStereotype.REQUIREMENT_STEREOTYPE);
					packageableElement.applyStereotype(stereo);
					Requirement req = UMLUtil.getStereotypeApplication(((org.eclipse.uml2.uml.Class) packageableElement), Requirement.class);
					DecimalFormat df = new DecimalFormat();
					df.setMinimumIntegerDigits(digit);
					String value = (df.format(index));
					req.setId("" + selectedElement.getName() + separator + value);
					index++;
					// if (req.getText() == null || req.getText().trim().equals("")) {
					// req.setText("QS should have" + packageableElement.getName().toLowerCase());
					// }
					setIdforClassifier(req.getId(), (Class) packageableElement);

				}

			}
		}
	}

	protected void setIdforClassifier(String prefix, Classifier classifier) {
		IPreferenceStore store = org.eclipse.papyrus.requirements.sysml14.preferences.Activator.getDefault().getPreferenceStore();
		int digit = store.getInt(PreferenceConstants.REQUIREMENT_ID_DIGIT);// by
		String separator = store.getString(PreferenceConstants.CHILD_REQUIREMENTS_SEPARATOR);

		int index = 1;
		for (Classifier nestedClassifier : ((Class) classifier).getNestedClassifiers()) {
			if (UMLUtil.getStereotypeApplication(nestedClassifier, Requirement.class) != null) {
				// setID
				Requirement req = UMLUtil.getStereotypeApplication(((org.eclipse.uml2.uml.Class) nestedClassifier), Requirement.class);
				DecimalFormat df = new DecimalFormat();
				df.setMinimumIntegerDigits(digit);
				String value = (df.format(index));
				req.setId(prefix + separator + value);
				index++;
				setIdforClassifier(req.getId(), nestedClassifier);
				// // set Text
				// if (req.getText() == null || req.getText().trim().equals("")) {
				// req.setText("QS should have" + nestedClassifier.getName().toLowerCase());
				// }
			}

			else {
				Stereotype stereo = nestedClassifier.getApplicableStereotype(I_SysMLStereotype.REQUIREMENT_STEREOTYPE);
				nestedClassifier.applyStereotype(stereo);
				Requirement req = UMLUtil.getStereotypeApplication(((org.eclipse.uml2.uml.Class) nestedClassifier), Requirement.class);
				DecimalFormat df = new DecimalFormat();
				df.setMinimumIntegerDigits(digit);
				String value = (df.format(index));
				req.setId("" + selectedElement.getName() + separator + value);
				index++;
				// if (req.getText() == null || req.getText().trim().equals("")) {
				// req.setText("QS should have" + nestedClassifier.getName().toLowerCase());
				// }
				setIdforClassifier(req.getId(), nestedClassifier);

			}
		}
	}



}