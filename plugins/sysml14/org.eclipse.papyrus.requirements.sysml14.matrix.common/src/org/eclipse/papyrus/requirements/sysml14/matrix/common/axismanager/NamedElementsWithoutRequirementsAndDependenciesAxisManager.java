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
package org.eclipse.papyrus.requirements.sysml14.matrix.common.axismanager;

import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.TreeFillingConfiguration;
import org.eclipse.papyrus.sysml14.requirements.Requirement;
import org.eclipse.papyrus.uml.nattable.manager.axis.UMLElementTreeAxisManagerForEventList;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.util.UMLUtil;

public class NamedElementsWithoutRequirementsAndDependenciesAxisManager extends UMLElementTreeAxisManagerForEventList {

	@Override
	public boolean isAllowedContents(Object objectToTest, Object semanticParent, TreeFillingConfiguration conf,
			int depth) {
		if (objectToTest instanceof NamedElement) {
			if (!(objectToTest instanceof Dependency)) {
				if (UMLUtil.getStereotypeApplication((Element) objectToTest, Requirement.class) == null) {
					return true;
				}
			}
		}
		return false;
	}
}
