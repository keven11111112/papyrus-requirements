/*****************************************************************************
 * Copyright (c) 2018 CEA LIST and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   CEA LIST - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrus.requirements.sysml14.common.ui.queries;

import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.emf.facet.custom.metamodel.custompt.IColor;
import org.eclipse.papyrus.emf.facet.custom.ui.internal.custompt.Color;
import org.eclipse.papyrus.emf.facet.efacet.core.IFacetManager;
import org.eclipse.papyrus.emf.facet.efacet.core.exception.DerivedTypedElementException;
import org.eclipse.papyrus.emf.facet.query.java.core.IJavaQuery2;
import org.eclipse.papyrus.emf.facet.query.java.core.IParameterValueList2;
import org.eclipse.papyrus.requirements.sysml14.common.I_SysMLStereotype;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Stereotype;

/**
 * @author PT202707
 *
 */
public class ReqSatisfied implements  IJavaQuery2<NamedElement, IColor> {

	/**
	 * test if the stereotype is a SysML Requirement Stereotype
	 * 
	 * @param stereotype
	 *            a given stereotype
	 * @return return true if this is a SysML stereotype or inherits directly or indirectly from requirement
	 */
	protected boolean isRequirementStereotype(Stereotype stereotype) {
		if (I_SysMLStereotype.REQUIREMENT_STEREOTYPE.equals(stereotype.getQualifiedName())) {
			return true;
		}
		for (org.eclipse.uml2.uml.Class superStereotype : stereotype.getSuperClasses()) {
			if (superStereotype instanceof Stereotype) {
				if (isRequirementStereotype((Stereotype) superStereotype)) {
					return true;
				}
			}
		}
		return false;
	}

	public IColor evaluate(final NamedElement context, final IParameterValueList2 parameterValues, final IFacetManager facetManager)
			throws DerivedTypedElementException {



		Stereotype appStereotype = null;
		if (context.getAppliedStereotypes().size() > 0) {
			appStereotype = context.getAppliedStereotypes().get(0);
		}

		if ((context instanceof org.eclipse.uml2.uml.Class) && (appStereotype != null) && (isRequirementStereotype(appStereotype))) {
			Object value= context.getValue(appStereotype, I_SysMLStereotype.REQUIREMENT_SATISFIEDBY_ATT);
			if (context.getValue(appStereotype, I_SysMLStereotype.REQUIREMENT_SATISFIEDBY_ATT)==null)	{
				return new Color(255, 204, 0);
			}
			else if (((EList)(context.getValue(appStereotype, I_SysMLStereotype.REQUIREMENT_SATISFIEDBY_ATT))).size()==0)	{
				return new Color(255, 204, 0);
			}
			else {
				return new Color(0, 0, 0);
			}
		}
		return new Color(0, 0, 0);
	}
}

