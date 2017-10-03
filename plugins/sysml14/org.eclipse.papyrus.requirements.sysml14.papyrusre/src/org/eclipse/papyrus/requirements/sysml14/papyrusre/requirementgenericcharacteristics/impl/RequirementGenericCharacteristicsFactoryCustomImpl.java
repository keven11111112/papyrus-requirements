/*******************************************************************************
 * Copyright (c) 2017 CEA List.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Yupanqui Munoz Julho (CEA LIST) <yupanqui.munozjulho@cea.fr> - initial API and implementation
 *******************************************************************************/
package org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.Requirement;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.RequirementGenericCharacteristicsFactory;

/**
 * This class has been added in order to integrated specific implementation of Stereotypes: Requirement.
 *
 */
public class RequirementGenericCharacteristicsFactoryCustomImpl extends RequirementGenericCharacteristicsFactoryImpl implements RequirementGenericCharacteristicsFactory {

	/**
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementGenericCharacteristicsFactoryImpl#createRequirement()
	 *
	 * @return
	 */
	@Override
	public Requirement createRequirement() {
		return new RequirementCustomImpl();
	}
}
