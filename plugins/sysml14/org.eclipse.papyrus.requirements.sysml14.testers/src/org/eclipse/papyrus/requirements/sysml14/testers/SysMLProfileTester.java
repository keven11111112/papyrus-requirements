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
package org.eclipse.papyrus.requirements.sysml14.testers;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.papyrus.sysml14.sysmlPackage;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * This class helps to test if the selected element applies the SysMLRequirements Profile or not
 */
public class SysMLProfileTester extends PropertyTester {

	public static final String propertyToTest = "appliesSysMLProfile";// NLS

	@Override
	public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
		if (propertyToTest.equals(property)) {
			boolean testResult = isExpected((IStructuredSelection) receiver);

			return expectedValue.equals(testResult);
		}
		return false;
	}

	private boolean isExpected(IStructuredSelection receiver) {

		for (Object current : receiver.toArray()) {
			// Adapt current selection to EObject
			if (current instanceof IAdaptable) {
				EObject eObj = (EObject) ((IAdaptable) current)
						.getAdapter(EObject.class);
				if (eObj instanceof Element) {
					Profile profile = UMLUtil.getProfile(sysmlPackage.eINSTANCE, eObj);
					if (profile != null) {
						final String packageQN = profile.getQualifiedName();
						return (((Element) eObj).getNearestPackage().getAppliedProfile(packageQN, true) != null) ? true : false;
					}
				}
			}
			return false;
		}
		return false;
	}

}
