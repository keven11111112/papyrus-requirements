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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RequirementClassificationFactoryImpl extends EFactoryImpl implements RequirementClassificationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RequirementClassificationFactory init() {
		try {
			RequirementClassificationFactory theRequirementClassificationFactory = (RequirementClassificationFactory)EPackage.Registry.INSTANCE.getEFactory(RequirementClassificationPackage.eNS_URI);
			if (theRequirementClassificationFactory != null) {
				return theRequirementClassificationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RequirementClassificationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementClassificationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RequirementClassificationPackage.PROJECT_REQUIREMENT: return createProjectRequirement();
			case RequirementClassificationPackage.PROCESS_REQUIREMENT: return createProcessRequirement();
			case RequirementClassificationPackage.CONSTRAINT_REQUIREMENT: return createConstraintRequirement();
			case RequirementClassificationPackage.WORKLOAD_CAPACITY_REQUIREMENT: return createWorkloadCapacityRequirement();
			case RequirementClassificationPackage.QUALITY_REQUIREMENT: return createQualityRequirement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectRequirement createProjectRequirement() {
		ProjectRequirementImpl projectRequirement = new ProjectRequirementImpl();
		return projectRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessRequirement createProcessRequirement() {
		ProcessRequirementImpl processRequirement = new ProcessRequirementImpl();
		return processRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintRequirement createConstraintRequirement() {
		ConstraintRequirementImpl constraintRequirement = new ConstraintRequirementImpl();
		return constraintRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkloadCapacityRequirement createWorkloadCapacityRequirement() {
		WorkloadCapacityRequirementImpl workloadCapacityRequirement = new WorkloadCapacityRequirementImpl();
		return workloadCapacityRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualityRequirement createQualityRequirement() {
		QualityRequirementImpl qualityRequirement = new QualityRequirementImpl();
		return qualityRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementClassificationPackage getRequirementClassificationPackage() {
		return (RequirementClassificationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RequirementClassificationPackage getPackage() {
		return RequirementClassificationPackage.eINSTANCE;
	}

} //RequirementClassificationFactoryImpl
