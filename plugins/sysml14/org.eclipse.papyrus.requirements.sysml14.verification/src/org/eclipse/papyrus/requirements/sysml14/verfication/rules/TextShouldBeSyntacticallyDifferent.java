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
package org.eclipse.papyrus.requirements.sysml14.verfication.rules;

import org.apache.commons.lang.StringUtils;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.EMFEventType;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.papyrus.requirements.sysml14.common.I_SysMLStereotype;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;

public class TextShouldBeSyntacticallyDifferent extends AbstractModelConstraint {

	@Override
	public IStatus validate(IValidationContext context) {
		Class clazz = (Class) context.getTarget();
		EMFEventType eType = context.getEventType();
		double normalizedSimilarityIndex = 0.0;
		int distance=0;
		String text2 ="";
		String text1 ="";
		// In the case of batch mode
		if (eType == EMFEventType.NULL) {
			if (clazz.getAppliedStereotype(I_SysMLStereotype.REQUIREMENT_STEREOTYPE) != null) {
				text1 = (String) clazz.getValue(clazz.getAppliedStereotype(I_SysMLStereotype.REQUIREMENT_STEREOTYPE), "text");
				for (Element element : clazz.getModel().allOwnedElements()) {
					if (!element.equals(clazz)) {
						if (element.getAppliedStereotype(I_SysMLStereotype.REQUIREMENT_STEREOTYPE) != null) {
							text2 = (String) element.getValue(
									element.getAppliedStereotype(I_SysMLStereotype.REQUIREMENT_STEREOTYPE), "text");
							distance = StringUtils.getLevenshteinDistance(text1, text2);
							normalizedSimilarityIndex = (double) distance
									/ (double) Math.max(text1.length(), text2.length());
							if (normalizedSimilarityIndex <= 0.2) {
								return context.createFailureStatus(clazz.getName() + " has " + (1- normalizedSimilarityIndex) * 100
										+ "%  of sintactic similarity than requirement "
										+ ((NamedElement) element).getName());
							} else if (normalizedSimilarityIndex == 0.0) {
								return context.createFailureStatus(clazz.getName()
										+ " has the same text than requirement " + ((NamedElement) element).getName());
							}
						}
					}
				}
			}
		}
		return context.createSuccessStatus();
	}
}
