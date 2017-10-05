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
 * 		Patrick Tessier (Patrick.tessier@cea.fr) CEA LIST - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.requirements.gendoc.queries;

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.sysml14.requirements.Requirement;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * this class contains all operation that can be called by SyML_Queries.mtl
 *
 */
public class SysML_Queries {

	/**
	 * 
	 * @param element
	 *            the given element
	 * @param stereotypeName
	 *            the name of the stereotype
	 * @param propertyName
	 *            the name of the property
	 * @return the value of the property of the stereotype.
	 */
	public static String getStringValue(Element element, String stereotypeName, String propertyName) {
		Object value = element.getValue(element.getAppliedStereotype(stereotypeName), propertyName);

		String listValue = "[";
		if (value instanceof EList) {
			if (!((EList<?>) value).isEmpty()) {
				if (((EList<?>) value).get(0) instanceof NamedElement) {
					@SuppressWarnings("unchecked")
					EList<NamedElement> namedElementList = (EList<NamedElement>) value;
					for (NamedElement namedElement : namedElementList) {
						listValue += namedElement.getName() + ", ";
					}
					listValue += "]";
					return listValue;
				}
			}
		}

		else {
			if (value instanceof NamedElement)
				return ((NamedElement) value).getName();
			else
				return (String) value;
		}

		return null;
	}

	/**
	 * 
	 * @param model
	 * @return the number of requirement contained in the model
	 */
	static public String countReq(Model model) {
		int counter = 0;
		Iterator<EObject> iterator = model.eAllContents();
		while (iterator.hasNext()) {
			EObject eObject = (EObject) iterator.next();
			if ((eObject instanceof org.eclipse.uml2.uml.Class)
					&& (UMLUtil.getStereotypeApplication(((org.eclipse.uml2.uml.Class) eObject), Requirement.class) != null)) {
				counter++;
			}
		}
		return "" + counter;
	}

	/**
	 * 
	 * @param model
	 * @return a string that is the list of requirement with id and text
	 */
	static public String basicPrintReq(Model model) {
		String out = "";
		int index = 0;
		Iterator<EObject> iterator = model.eAllContents();
		while (iterator.hasNext()) {
			EObject eObject = (EObject) iterator.next();
			if ((eObject instanceof org.eclipse.uml2.uml.Class)
					&& (UMLUtil.getStereotypeApplication(((org.eclipse.uml2.uml.Class) eObject), Requirement.class) != null)) {
				Requirement req = UMLUtil.getStereotypeApplication(((org.eclipse.uml2.uml.Class) eObject), Requirement.class);
				if (index < 10) {
					out = out + req.getId() + ":" + req.getText() + "\n\n";
				}
				index++;
			}

		}
		return out;
	}

	/**
	 * get all requirements contained in the model and give it inside a simple collection
	 * 
	 * @param model
	 * @return a simple collection of requirements
	 */
	static public ArrayList<NamedElement> getAllReq(org.eclipse.uml2.uml.Package model) {
		ArrayList<NamedElement> result = new ArrayList<NamedElement>();
		Iterator<EObject> iterator = model.eAllContents();
		while (iterator.hasNext()) {
			EObject eObject = (EObject) iterator.next();
			if ((eObject instanceof org.eclipse.uml2.uml.Class)
					&& (UMLUtil.getStereotypeApplication(((org.eclipse.uml2.uml.Class) eObject), Requirement.class) != null)) {
				Class currentReq = (Class) eObject;
				result.add(currentReq);
			}

		}
		return result;
	}

}