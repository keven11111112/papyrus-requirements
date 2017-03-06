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
 *  Mauricio Alferez (CEA LIST) mauricio.alferez@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.requirements.sysml14.matrix.common.axismanager;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.papyrus.sysml14.nattable.common.manager.axis.RequirementAxisManager;
import org.eclipse.papyrus.sysml14.requirements.Requirement;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.util.UMLUtil;


/**
 * AxisManager for SysML Requirements tables showing all sub-requirements from all the containment levels in the same line that identifies the columns.
 *
 * @author Mauricio ALFEREZ
 *
 */
public class RequirementAndSubRequirementsAxisManager extends RequirementAxisManager {

	/* (non-Javadoc)
	 * @see org.eclipse.papyrus.infra.emf.nattable.manager.axis.AbstractSynchronizedOnEStructuralFeatureAxisManager#getFeaturesValue()
	 */
	@Override
	protected List<Object> getFeaturesValue() {
		final List<Object> featureValue = new ArrayList<Object>();

		if (getTableContext() instanceof Package) {
			Package pk = (Package) getTableContext();
			for (Element element : pk.allOwnedElements()) {
				if (null != UMLUtil.getStereotypeApplication(element, Requirement.class)) {
					featureValue.add(element);
				}
			}
		}
		return featureValue;
	}
}
