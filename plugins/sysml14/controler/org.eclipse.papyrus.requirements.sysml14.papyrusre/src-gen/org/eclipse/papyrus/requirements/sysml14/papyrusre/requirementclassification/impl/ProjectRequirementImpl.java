/**
 * Copyright (c) 2017 CEA LIST.
 * 
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Sébastien Gerard (CEA LIST) <sebastien.gerard@cea.fr> - Initial API and implementation
 *   Yupanqui Munoz Julho (CEA LIST) <yupanqui.munozjulho@cea.fr> - Initial API and implementation
 * 
 */
package org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.ProjectRequirement;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.RequirementClassificationPackage;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ProjectRequirementImpl extends RequirementImpl implements ProjectRequirement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementClassificationPackage.Literals.PROJECT_REQUIREMENT;
	}

} //ProjectRequirementImpl
