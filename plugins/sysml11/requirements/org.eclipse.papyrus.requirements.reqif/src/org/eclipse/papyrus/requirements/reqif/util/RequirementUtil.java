/*******************************************************************************
 *   Copyright (c) 2017 CEA LIST and others.
 *  
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v1.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 *  
 *   Contributors:
 *  	CEA LIST - Initial API and implementation
 *******************************************************************************/
package org.eclipse.papyrus.requirements.reqif.util;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.rmf.reqif10.Identifiable;
import org.eclipse.uml2.uml.Element;

public class RequirementUtil {

	protected static final String REQIF_IDENTIFIER = "REQIF_Identifier";

	public static void addID(Identifiable identifiable, Element element) {
		EAnnotation eAnnotation = element.createEAnnotation(REQIF_IDENTIFIER);
		eAnnotation.getDetails().put(REQIF_IDENTIFIER, identifiable.getIdentifier());
	}

	public static String getID(EObject eObject) {
		if(eObject instanceof EModelElement) {
			EModelElement eModelElement = (EModelElement)eObject;
			if(eModelElement.getEAnnotation(REQIF_IDENTIFIER) != null) {
				return eModelElement.getEAnnotation(REQIF_IDENTIFIER).getDetails().get(REQIF_IDENTIFIER);
			}
		}
		return null;
	}
}
