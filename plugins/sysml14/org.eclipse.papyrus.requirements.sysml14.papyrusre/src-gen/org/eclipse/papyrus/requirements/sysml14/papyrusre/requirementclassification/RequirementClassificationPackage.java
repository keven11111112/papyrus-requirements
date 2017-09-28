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
package org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.RequirementGenericCharacteristicsPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.RequirementClassificationFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='RequirementClassification'"
 * @generated
 */
public interface RequirementClassificationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "requirementclassification"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/papyrus/requirements/sysml14/0.7.0/PapyrusRE/RequirementClassification"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "RequirementClassification"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RequirementClassificationPackage eINSTANCE = org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.impl.RequirementClassificationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.impl.ProjectRequirementImpl <em>Project Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.impl.ProjectRequirementImpl
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.impl.RequirementClassificationPackageImpl#getProjectRequirement()
	 * @generated
	 */
	int PROJECT_REQUIREMENT = 0;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_REQUIREMENT__BASE_CLASS = RequirementGenericCharacteristicsPackage.REQUIREMENT__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_REQUIREMENT__DERIVED = RequirementGenericCharacteristicsPackage.REQUIREMENT__DERIVED;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_REQUIREMENT__DERIVED_FROM = RequirementGenericCharacteristicsPackage.REQUIREMENT__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_REQUIREMENT__ID = RequirementGenericCharacteristicsPackage.REQUIREMENT__ID;

	/**
	 * The feature id for the '<em><b>Master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_REQUIREMENT__MASTER = RequirementGenericCharacteristicsPackage.REQUIREMENT__MASTER;

	/**
	 * The feature id for the '<em><b>Refined By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_REQUIREMENT__REFINED_BY = RequirementGenericCharacteristicsPackage.REQUIREMENT__REFINED_BY;

	/**
	 * The feature id for the '<em><b>Satisfied By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_REQUIREMENT__SATISFIED_BY = RequirementGenericCharacteristicsPackage.REQUIREMENT__SATISFIED_BY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_REQUIREMENT__TEXT = RequirementGenericCharacteristicsPackage.REQUIREMENT__TEXT;

	/**
	 * The feature id for the '<em><b>Traced To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_REQUIREMENT__TRACED_TO = RequirementGenericCharacteristicsPackage.REQUIREMENT__TRACED_TO;

	/**
	 * The feature id for the '<em><b>Verified By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_REQUIREMENT__VERIFIED_BY = RequirementGenericCharacteristicsPackage.REQUIREMENT__VERIFIED_BY;

	/**
	 * The feature id for the '<em><b>Agreement Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_REQUIREMENT__AGREEMENT_STATUS = RequirementGenericCharacteristicsPackage.REQUIREMENT__AGREEMENT_STATUS;

	/**
	 * The feature id for the '<em><b>Approval Authority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_REQUIREMENT__APPROVAL_AUTHORITY = RequirementGenericCharacteristicsPackage.REQUIREMENT__APPROVAL_AUTHORITY;

	/**
	 * The feature id for the '<em><b>Importance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_REQUIREMENT__IMPORTANCE = RequirementGenericCharacteristicsPackage.REQUIREMENT__IMPORTANCE;

	/**
	 * The feature id for the '<em><b>Life Cycle Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_REQUIREMENT__LIFE_CYCLE_PHASE = RequirementGenericCharacteristicsPackage.REQUIREMENT__LIFE_CYCLE_PHASE;

	/**
	 * The feature id for the '<em><b>Maturity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_REQUIREMENT__MATURITY = RequirementGenericCharacteristicsPackage.REQUIREMENT__MATURITY;

	/**
	 * The feature id for the '<em><b>Abstraction Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_REQUIREMENT__ABSTRACTION_LEVEL = RequirementGenericCharacteristicsPackage.REQUIREMENT__ABSTRACTION_LEVEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_REQUIREMENT__OWNER = RequirementGenericCharacteristicsPackage.REQUIREMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_REQUIREMENT__PRIORITY = RequirementGenericCharacteristicsPackage.REQUIREMENT__PRIORITY;

	/**
	 * The feature id for the '<em><b>Qualification Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_REQUIREMENT__QUALIFICATION_STATUS = RequirementGenericCharacteristicsPackage.REQUIREMENT__QUALIFICATION_STATUS;

	/**
	 * The feature id for the '<em><b>Review Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_REQUIREMENT__REVIEW_STATUS = RequirementGenericCharacteristicsPackage.REQUIREMENT__REVIEW_STATUS;

	/**
	 * The feature id for the '<em><b>Satisfaction Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_REQUIREMENT__SATISFACTION_RATIONALE = RequirementGenericCharacteristicsPackage.REQUIREMENT__SATISFACTION_RATIONALE;

	/**
	 * The feature id for the '<em><b>Satisfaction Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_REQUIREMENT__SATISFACTION_STATUS = RequirementGenericCharacteristicsPackage.REQUIREMENT__SATISFACTION_STATUS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_REQUIREMENT__SOURCE = RequirementGenericCharacteristicsPackage.REQUIREMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Validation Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_REQUIREMENT__VALIDATION_RATIONALE = RequirementGenericCharacteristicsPackage.REQUIREMENT__VALIDATION_RATIONALE;

	/**
	 * The feature id for the '<em><b>Validator Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_REQUIREMENT__VALIDATOR_NAME = RequirementGenericCharacteristicsPackage.REQUIREMENT__VALIDATOR_NAME;

	/**
	 * The feature id for the '<em><b>Verifier Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_REQUIREMENT__VERIFIER_NAME = RequirementGenericCharacteristicsPackage.REQUIREMENT__VERIFIER_NAME;

	/**
	 * The feature id for the '<em><b>VV Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_REQUIREMENT__VV_METHOD = RequirementGenericCharacteristicsPackage.REQUIREMENT__VV_METHOD;

	/**
	 * The feature id for the '<em><b>VV Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_REQUIREMENT__VV_STATUS = RequirementGenericCharacteristicsPackage.REQUIREMENT__VV_STATUS;

	/**
	 * The feature id for the '<em><b>Quality Nature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_REQUIREMENT__QUALITY_NATURE = RequirementGenericCharacteristicsPackage.REQUIREMENT__QUALITY_NATURE;

	/**
	 * The number of structural features of the '<em>Project Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_REQUIREMENT_FEATURE_COUNT = RequirementGenericCharacteristicsPackage.REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Project Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_REQUIREMENT_OPERATION_COUNT = RequirementGenericCharacteristicsPackage.REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.impl.ProcessRequirementImpl <em>Process Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.impl.ProcessRequirementImpl
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.impl.RequirementClassificationPackageImpl#getProcessRequirement()
	 * @generated
	 */
	int PROCESS_REQUIREMENT = 1;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REQUIREMENT__BASE_CLASS = RequirementGenericCharacteristicsPackage.REQUIREMENT__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REQUIREMENT__DERIVED = RequirementGenericCharacteristicsPackage.REQUIREMENT__DERIVED;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REQUIREMENT__DERIVED_FROM = RequirementGenericCharacteristicsPackage.REQUIREMENT__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REQUIREMENT__ID = RequirementGenericCharacteristicsPackage.REQUIREMENT__ID;

	/**
	 * The feature id for the '<em><b>Master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REQUIREMENT__MASTER = RequirementGenericCharacteristicsPackage.REQUIREMENT__MASTER;

	/**
	 * The feature id for the '<em><b>Refined By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REQUIREMENT__REFINED_BY = RequirementGenericCharacteristicsPackage.REQUIREMENT__REFINED_BY;

	/**
	 * The feature id for the '<em><b>Satisfied By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REQUIREMENT__SATISFIED_BY = RequirementGenericCharacteristicsPackage.REQUIREMENT__SATISFIED_BY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REQUIREMENT__TEXT = RequirementGenericCharacteristicsPackage.REQUIREMENT__TEXT;

	/**
	 * The feature id for the '<em><b>Traced To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REQUIREMENT__TRACED_TO = RequirementGenericCharacteristicsPackage.REQUIREMENT__TRACED_TO;

	/**
	 * The feature id for the '<em><b>Verified By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REQUIREMENT__VERIFIED_BY = RequirementGenericCharacteristicsPackage.REQUIREMENT__VERIFIED_BY;

	/**
	 * The feature id for the '<em><b>Agreement Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REQUIREMENT__AGREEMENT_STATUS = RequirementGenericCharacteristicsPackage.REQUIREMENT__AGREEMENT_STATUS;

	/**
	 * The feature id for the '<em><b>Approval Authority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REQUIREMENT__APPROVAL_AUTHORITY = RequirementGenericCharacteristicsPackage.REQUIREMENT__APPROVAL_AUTHORITY;

	/**
	 * The feature id for the '<em><b>Importance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REQUIREMENT__IMPORTANCE = RequirementGenericCharacteristicsPackage.REQUIREMENT__IMPORTANCE;

	/**
	 * The feature id for the '<em><b>Life Cycle Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REQUIREMENT__LIFE_CYCLE_PHASE = RequirementGenericCharacteristicsPackage.REQUIREMENT__LIFE_CYCLE_PHASE;

	/**
	 * The feature id for the '<em><b>Maturity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REQUIREMENT__MATURITY = RequirementGenericCharacteristicsPackage.REQUIREMENT__MATURITY;

	/**
	 * The feature id for the '<em><b>Abstraction Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REQUIREMENT__ABSTRACTION_LEVEL = RequirementGenericCharacteristicsPackage.REQUIREMENT__ABSTRACTION_LEVEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REQUIREMENT__OWNER = RequirementGenericCharacteristicsPackage.REQUIREMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REQUIREMENT__PRIORITY = RequirementGenericCharacteristicsPackage.REQUIREMENT__PRIORITY;

	/**
	 * The feature id for the '<em><b>Qualification Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REQUIREMENT__QUALIFICATION_STATUS = RequirementGenericCharacteristicsPackage.REQUIREMENT__QUALIFICATION_STATUS;

	/**
	 * The feature id for the '<em><b>Review Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REQUIREMENT__REVIEW_STATUS = RequirementGenericCharacteristicsPackage.REQUIREMENT__REVIEW_STATUS;

	/**
	 * The feature id for the '<em><b>Satisfaction Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REQUIREMENT__SATISFACTION_RATIONALE = RequirementGenericCharacteristicsPackage.REQUIREMENT__SATISFACTION_RATIONALE;

	/**
	 * The feature id for the '<em><b>Satisfaction Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REQUIREMENT__SATISFACTION_STATUS = RequirementGenericCharacteristicsPackage.REQUIREMENT__SATISFACTION_STATUS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REQUIREMENT__SOURCE = RequirementGenericCharacteristicsPackage.REQUIREMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Validation Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REQUIREMENT__VALIDATION_RATIONALE = RequirementGenericCharacteristicsPackage.REQUIREMENT__VALIDATION_RATIONALE;

	/**
	 * The feature id for the '<em><b>Validator Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REQUIREMENT__VALIDATOR_NAME = RequirementGenericCharacteristicsPackage.REQUIREMENT__VALIDATOR_NAME;

	/**
	 * The feature id for the '<em><b>Verifier Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REQUIREMENT__VERIFIER_NAME = RequirementGenericCharacteristicsPackage.REQUIREMENT__VERIFIER_NAME;

	/**
	 * The feature id for the '<em><b>VV Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REQUIREMENT__VV_METHOD = RequirementGenericCharacteristicsPackage.REQUIREMENT__VV_METHOD;

	/**
	 * The feature id for the '<em><b>VV Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REQUIREMENT__VV_STATUS = RequirementGenericCharacteristicsPackage.REQUIREMENT__VV_STATUS;

	/**
	 * The feature id for the '<em><b>Quality Nature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REQUIREMENT__QUALITY_NATURE = RequirementGenericCharacteristicsPackage.REQUIREMENT__QUALITY_NATURE;

	/**
	 * The number of structural features of the '<em>Process Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REQUIREMENT_FEATURE_COUNT = RequirementGenericCharacteristicsPackage.REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Process Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REQUIREMENT_OPERATION_COUNT = RequirementGenericCharacteristicsPackage.REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.impl.ConstraintRequirementImpl <em>Constraint Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.impl.ConstraintRequirementImpl
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.impl.RequirementClassificationPackageImpl#getConstraintRequirement()
	 * @generated
	 */
	int CONSTRAINT_REQUIREMENT = 2;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_REQUIREMENT__BASE_CLASS = RequirementGenericCharacteristicsPackage.REQUIREMENT__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_REQUIREMENT__DERIVED = RequirementGenericCharacteristicsPackage.REQUIREMENT__DERIVED;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_REQUIREMENT__DERIVED_FROM = RequirementGenericCharacteristicsPackage.REQUIREMENT__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_REQUIREMENT__ID = RequirementGenericCharacteristicsPackage.REQUIREMENT__ID;

	/**
	 * The feature id for the '<em><b>Master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_REQUIREMENT__MASTER = RequirementGenericCharacteristicsPackage.REQUIREMENT__MASTER;

	/**
	 * The feature id for the '<em><b>Refined By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_REQUIREMENT__REFINED_BY = RequirementGenericCharacteristicsPackage.REQUIREMENT__REFINED_BY;

	/**
	 * The feature id for the '<em><b>Satisfied By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_REQUIREMENT__SATISFIED_BY = RequirementGenericCharacteristicsPackage.REQUIREMENT__SATISFIED_BY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_REQUIREMENT__TEXT = RequirementGenericCharacteristicsPackage.REQUIREMENT__TEXT;

	/**
	 * The feature id for the '<em><b>Traced To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_REQUIREMENT__TRACED_TO = RequirementGenericCharacteristicsPackage.REQUIREMENT__TRACED_TO;

	/**
	 * The feature id for the '<em><b>Verified By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_REQUIREMENT__VERIFIED_BY = RequirementGenericCharacteristicsPackage.REQUIREMENT__VERIFIED_BY;

	/**
	 * The feature id for the '<em><b>Agreement Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_REQUIREMENT__AGREEMENT_STATUS = RequirementGenericCharacteristicsPackage.REQUIREMENT__AGREEMENT_STATUS;

	/**
	 * The feature id for the '<em><b>Approval Authority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_REQUIREMENT__APPROVAL_AUTHORITY = RequirementGenericCharacteristicsPackage.REQUIREMENT__APPROVAL_AUTHORITY;

	/**
	 * The feature id for the '<em><b>Importance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_REQUIREMENT__IMPORTANCE = RequirementGenericCharacteristicsPackage.REQUIREMENT__IMPORTANCE;

	/**
	 * The feature id for the '<em><b>Life Cycle Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_REQUIREMENT__LIFE_CYCLE_PHASE = RequirementGenericCharacteristicsPackage.REQUIREMENT__LIFE_CYCLE_PHASE;

	/**
	 * The feature id for the '<em><b>Maturity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_REQUIREMENT__MATURITY = RequirementGenericCharacteristicsPackage.REQUIREMENT__MATURITY;

	/**
	 * The feature id for the '<em><b>Abstraction Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_REQUIREMENT__ABSTRACTION_LEVEL = RequirementGenericCharacteristicsPackage.REQUIREMENT__ABSTRACTION_LEVEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_REQUIREMENT__OWNER = RequirementGenericCharacteristicsPackage.REQUIREMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_REQUIREMENT__PRIORITY = RequirementGenericCharacteristicsPackage.REQUIREMENT__PRIORITY;

	/**
	 * The feature id for the '<em><b>Qualification Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_REQUIREMENT__QUALIFICATION_STATUS = RequirementGenericCharacteristicsPackage.REQUIREMENT__QUALIFICATION_STATUS;

	/**
	 * The feature id for the '<em><b>Review Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_REQUIREMENT__REVIEW_STATUS = RequirementGenericCharacteristicsPackage.REQUIREMENT__REVIEW_STATUS;

	/**
	 * The feature id for the '<em><b>Satisfaction Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_REQUIREMENT__SATISFACTION_RATIONALE = RequirementGenericCharacteristicsPackage.REQUIREMENT__SATISFACTION_RATIONALE;

	/**
	 * The feature id for the '<em><b>Satisfaction Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_REQUIREMENT__SATISFACTION_STATUS = RequirementGenericCharacteristicsPackage.REQUIREMENT__SATISFACTION_STATUS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_REQUIREMENT__SOURCE = RequirementGenericCharacteristicsPackage.REQUIREMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Validation Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_REQUIREMENT__VALIDATION_RATIONALE = RequirementGenericCharacteristicsPackage.REQUIREMENT__VALIDATION_RATIONALE;

	/**
	 * The feature id for the '<em><b>Validator Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_REQUIREMENT__VALIDATOR_NAME = RequirementGenericCharacteristicsPackage.REQUIREMENT__VALIDATOR_NAME;

	/**
	 * The feature id for the '<em><b>Verifier Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_REQUIREMENT__VERIFIER_NAME = RequirementGenericCharacteristicsPackage.REQUIREMENT__VERIFIER_NAME;

	/**
	 * The feature id for the '<em><b>VV Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_REQUIREMENT__VV_METHOD = RequirementGenericCharacteristicsPackage.REQUIREMENT__VV_METHOD;

	/**
	 * The feature id for the '<em><b>VV Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_REQUIREMENT__VV_STATUS = RequirementGenericCharacteristicsPackage.REQUIREMENT__VV_STATUS;

	/**
	 * The feature id for the '<em><b>Quality Nature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_REQUIREMENT__QUALITY_NATURE = RequirementGenericCharacteristicsPackage.REQUIREMENT__QUALITY_NATURE;

	/**
	 * The feature id for the '<em><b>Constraint Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_REQUIREMENT__CONSTRAINT_KIND = RequirementGenericCharacteristicsPackage.REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constraint Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_REQUIREMENT_FEATURE_COUNT = RequirementGenericCharacteristicsPackage.REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Constraint Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_REQUIREMENT_OPERATION_COUNT = RequirementGenericCharacteristicsPackage.REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.impl.WorkloadCapacityRequirementImpl <em>Workload Capacity Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.impl.WorkloadCapacityRequirementImpl
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.impl.RequirementClassificationPackageImpl#getWorkloadCapacityRequirement()
	 * @generated
	 */
	int WORKLOAD_CAPACITY_REQUIREMENT = 3;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_CAPACITY_REQUIREMENT__BASE_CLASS = RequirementGenericCharacteristicsPackage.REQUIREMENT__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_CAPACITY_REQUIREMENT__DERIVED = RequirementGenericCharacteristicsPackage.REQUIREMENT__DERIVED;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_CAPACITY_REQUIREMENT__DERIVED_FROM = RequirementGenericCharacteristicsPackage.REQUIREMENT__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_CAPACITY_REQUIREMENT__ID = RequirementGenericCharacteristicsPackage.REQUIREMENT__ID;

	/**
	 * The feature id for the '<em><b>Master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_CAPACITY_REQUIREMENT__MASTER = RequirementGenericCharacteristicsPackage.REQUIREMENT__MASTER;

	/**
	 * The feature id for the '<em><b>Refined By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_CAPACITY_REQUIREMENT__REFINED_BY = RequirementGenericCharacteristicsPackage.REQUIREMENT__REFINED_BY;

	/**
	 * The feature id for the '<em><b>Satisfied By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_CAPACITY_REQUIREMENT__SATISFIED_BY = RequirementGenericCharacteristicsPackage.REQUIREMENT__SATISFIED_BY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_CAPACITY_REQUIREMENT__TEXT = RequirementGenericCharacteristicsPackage.REQUIREMENT__TEXT;

	/**
	 * The feature id for the '<em><b>Traced To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_CAPACITY_REQUIREMENT__TRACED_TO = RequirementGenericCharacteristicsPackage.REQUIREMENT__TRACED_TO;

	/**
	 * The feature id for the '<em><b>Verified By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_CAPACITY_REQUIREMENT__VERIFIED_BY = RequirementGenericCharacteristicsPackage.REQUIREMENT__VERIFIED_BY;

	/**
	 * The feature id for the '<em><b>Agreement Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_CAPACITY_REQUIREMENT__AGREEMENT_STATUS = RequirementGenericCharacteristicsPackage.REQUIREMENT__AGREEMENT_STATUS;

	/**
	 * The feature id for the '<em><b>Approval Authority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_CAPACITY_REQUIREMENT__APPROVAL_AUTHORITY = RequirementGenericCharacteristicsPackage.REQUIREMENT__APPROVAL_AUTHORITY;

	/**
	 * The feature id for the '<em><b>Importance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_CAPACITY_REQUIREMENT__IMPORTANCE = RequirementGenericCharacteristicsPackage.REQUIREMENT__IMPORTANCE;

	/**
	 * The feature id for the '<em><b>Life Cycle Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_CAPACITY_REQUIREMENT__LIFE_CYCLE_PHASE = RequirementGenericCharacteristicsPackage.REQUIREMENT__LIFE_CYCLE_PHASE;

	/**
	 * The feature id for the '<em><b>Maturity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_CAPACITY_REQUIREMENT__MATURITY = RequirementGenericCharacteristicsPackage.REQUIREMENT__MATURITY;

	/**
	 * The feature id for the '<em><b>Abstraction Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_CAPACITY_REQUIREMENT__ABSTRACTION_LEVEL = RequirementGenericCharacteristicsPackage.REQUIREMENT__ABSTRACTION_LEVEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_CAPACITY_REQUIREMENT__OWNER = RequirementGenericCharacteristicsPackage.REQUIREMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_CAPACITY_REQUIREMENT__PRIORITY = RequirementGenericCharacteristicsPackage.REQUIREMENT__PRIORITY;

	/**
	 * The feature id for the '<em><b>Qualification Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_CAPACITY_REQUIREMENT__QUALIFICATION_STATUS = RequirementGenericCharacteristicsPackage.REQUIREMENT__QUALIFICATION_STATUS;

	/**
	 * The feature id for the '<em><b>Review Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_CAPACITY_REQUIREMENT__REVIEW_STATUS = RequirementGenericCharacteristicsPackage.REQUIREMENT__REVIEW_STATUS;

	/**
	 * The feature id for the '<em><b>Satisfaction Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_CAPACITY_REQUIREMENT__SATISFACTION_RATIONALE = RequirementGenericCharacteristicsPackage.REQUIREMENT__SATISFACTION_RATIONALE;

	/**
	 * The feature id for the '<em><b>Satisfaction Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_CAPACITY_REQUIREMENT__SATISFACTION_STATUS = RequirementGenericCharacteristicsPackage.REQUIREMENT__SATISFACTION_STATUS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_CAPACITY_REQUIREMENT__SOURCE = RequirementGenericCharacteristicsPackage.REQUIREMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Validation Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_CAPACITY_REQUIREMENT__VALIDATION_RATIONALE = RequirementGenericCharacteristicsPackage.REQUIREMENT__VALIDATION_RATIONALE;

	/**
	 * The feature id for the '<em><b>Validator Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_CAPACITY_REQUIREMENT__VALIDATOR_NAME = RequirementGenericCharacteristicsPackage.REQUIREMENT__VALIDATOR_NAME;

	/**
	 * The feature id for the '<em><b>Verifier Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_CAPACITY_REQUIREMENT__VERIFIER_NAME = RequirementGenericCharacteristicsPackage.REQUIREMENT__VERIFIER_NAME;

	/**
	 * The feature id for the '<em><b>VV Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_CAPACITY_REQUIREMENT__VV_METHOD = RequirementGenericCharacteristicsPackage.REQUIREMENT__VV_METHOD;

	/**
	 * The feature id for the '<em><b>VV Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_CAPACITY_REQUIREMENT__VV_STATUS = RequirementGenericCharacteristicsPackage.REQUIREMENT__VV_STATUS;

	/**
	 * The feature id for the '<em><b>Quality Nature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_CAPACITY_REQUIREMENT__QUALITY_NATURE = RequirementGenericCharacteristicsPackage.REQUIREMENT__QUALITY_NATURE;

	/**
	 * The feature id for the '<em><b>Workload Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_CAPACITY_REQUIREMENT__WORKLOAD_CAPACITY = RequirementGenericCharacteristicsPackage.REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Workload Capacity Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_CAPACITY_REQUIREMENT_FEATURE_COUNT = RequirementGenericCharacteristicsPackage.REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Workload Capacity Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_CAPACITY_REQUIREMENT_OPERATION_COUNT = RequirementGenericCharacteristicsPackage.REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.impl.QualityRequirementImpl <em>Quality Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.impl.QualityRequirementImpl
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.impl.RequirementClassificationPackageImpl#getQualityRequirement()
	 * @generated
	 */
	int QUALITY_REQUIREMENT = 4;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__BASE_CLASS = RequirementGenericCharacteristicsPackage.REQUIREMENT__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__DERIVED = RequirementGenericCharacteristicsPackage.REQUIREMENT__DERIVED;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__DERIVED_FROM = RequirementGenericCharacteristicsPackage.REQUIREMENT__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__ID = RequirementGenericCharacteristicsPackage.REQUIREMENT__ID;

	/**
	 * The feature id for the '<em><b>Master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__MASTER = RequirementGenericCharacteristicsPackage.REQUIREMENT__MASTER;

	/**
	 * The feature id for the '<em><b>Refined By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__REFINED_BY = RequirementGenericCharacteristicsPackage.REQUIREMENT__REFINED_BY;

	/**
	 * The feature id for the '<em><b>Satisfied By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__SATISFIED_BY = RequirementGenericCharacteristicsPackage.REQUIREMENT__SATISFIED_BY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__TEXT = RequirementGenericCharacteristicsPackage.REQUIREMENT__TEXT;

	/**
	 * The feature id for the '<em><b>Traced To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__TRACED_TO = RequirementGenericCharacteristicsPackage.REQUIREMENT__TRACED_TO;

	/**
	 * The feature id for the '<em><b>Verified By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__VERIFIED_BY = RequirementGenericCharacteristicsPackage.REQUIREMENT__VERIFIED_BY;

	/**
	 * The feature id for the '<em><b>Agreement Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__AGREEMENT_STATUS = RequirementGenericCharacteristicsPackage.REQUIREMENT__AGREEMENT_STATUS;

	/**
	 * The feature id for the '<em><b>Approval Authority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__APPROVAL_AUTHORITY = RequirementGenericCharacteristicsPackage.REQUIREMENT__APPROVAL_AUTHORITY;

	/**
	 * The feature id for the '<em><b>Importance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__IMPORTANCE = RequirementGenericCharacteristicsPackage.REQUIREMENT__IMPORTANCE;

	/**
	 * The feature id for the '<em><b>Life Cycle Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__LIFE_CYCLE_PHASE = RequirementGenericCharacteristicsPackage.REQUIREMENT__LIFE_CYCLE_PHASE;

	/**
	 * The feature id for the '<em><b>Maturity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__MATURITY = RequirementGenericCharacteristicsPackage.REQUIREMENT__MATURITY;

	/**
	 * The feature id for the '<em><b>Abstraction Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__ABSTRACTION_LEVEL = RequirementGenericCharacteristicsPackage.REQUIREMENT__ABSTRACTION_LEVEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__OWNER = RequirementGenericCharacteristicsPackage.REQUIREMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__PRIORITY = RequirementGenericCharacteristicsPackage.REQUIREMENT__PRIORITY;

	/**
	 * The feature id for the '<em><b>Qualification Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__QUALIFICATION_STATUS = RequirementGenericCharacteristicsPackage.REQUIREMENT__QUALIFICATION_STATUS;

	/**
	 * The feature id for the '<em><b>Review Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__REVIEW_STATUS = RequirementGenericCharacteristicsPackage.REQUIREMENT__REVIEW_STATUS;

	/**
	 * The feature id for the '<em><b>Satisfaction Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__SATISFACTION_RATIONALE = RequirementGenericCharacteristicsPackage.REQUIREMENT__SATISFACTION_RATIONALE;

	/**
	 * The feature id for the '<em><b>Satisfaction Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__SATISFACTION_STATUS = RequirementGenericCharacteristicsPackage.REQUIREMENT__SATISFACTION_STATUS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__SOURCE = RequirementGenericCharacteristicsPackage.REQUIREMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Validation Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__VALIDATION_RATIONALE = RequirementGenericCharacteristicsPackage.REQUIREMENT__VALIDATION_RATIONALE;

	/**
	 * The feature id for the '<em><b>Validator Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__VALIDATOR_NAME = RequirementGenericCharacteristicsPackage.REQUIREMENT__VALIDATOR_NAME;

	/**
	 * The feature id for the '<em><b>Verifier Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__VERIFIER_NAME = RequirementGenericCharacteristicsPackage.REQUIREMENT__VERIFIER_NAME;

	/**
	 * The feature id for the '<em><b>VV Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__VV_METHOD = RequirementGenericCharacteristicsPackage.REQUIREMENT__VV_METHOD;

	/**
	 * The feature id for the '<em><b>VV Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__VV_STATUS = RequirementGenericCharacteristicsPackage.REQUIREMENT__VV_STATUS;

	/**
	 * The feature id for the '<em><b>Quality Nature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__QUALITY_NATURE = RequirementGenericCharacteristicsPackage.REQUIREMENT__QUALITY_NATURE;

	/**
	 * The feature id for the '<em><b>Specific Quality Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__SPECIFIC_QUALITY_KIND = RequirementGenericCharacteristicsPackage.REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Quality Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT_FEATURE_COUNT = RequirementGenericCharacteristicsPackage.REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Quality Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT_OPERATION_COUNT = RequirementGenericCharacteristicsPackage.REQUIREMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.ProjectRequirement <em>Project Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project Requirement</em>'.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.ProjectRequirement
	 * @generated
	 */
	EClass getProjectRequirement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.ProcessRequirement <em>Process Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Requirement</em>'.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.ProcessRequirement
	 * @generated
	 */
	EClass getProcessRequirement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.ConstraintRequirement <em>Constraint Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint Requirement</em>'.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.ConstraintRequirement
	 * @generated
	 */
	EClass getConstraintRequirement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.ConstraintRequirement#getConstraintKind <em>Constraint Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint Kind</em>'.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.ConstraintRequirement#getConstraintKind()
	 * @see #getConstraintRequirement()
	 * @generated
	 */
	EAttribute getConstraintRequirement_ConstraintKind();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.WorkloadCapacityRequirement <em>Workload Capacity Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workload Capacity Requirement</em>'.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.WorkloadCapacityRequirement
	 * @generated
	 */
	EClass getWorkloadCapacityRequirement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.WorkloadCapacityRequirement#getWorkloadCapacity <em>Workload Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Workload Capacity</em>'.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.WorkloadCapacityRequirement#getWorkloadCapacity()
	 * @see #getWorkloadCapacityRequirement()
	 * @generated
	 */
	EAttribute getWorkloadCapacityRequirement_WorkloadCapacity();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.QualityRequirement <em>Quality Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quality Requirement</em>'.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.QualityRequirement
	 * @generated
	 */
	EClass getQualityRequirement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.QualityRequirement#getSpecificQualityKind <em>Specific Quality Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Specific Quality Kind</em>'.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.QualityRequirement#getSpecificQualityKind()
	 * @see #getQualityRequirement()
	 * @generated
	 */
	EAttribute getQualityRequirement_SpecificQualityKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RequirementClassificationFactory getRequirementClassificationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.impl.ProjectRequirementImpl <em>Project Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.impl.ProjectRequirementImpl
		 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.impl.RequirementClassificationPackageImpl#getProjectRequirement()
		 * @generated
		 */
		EClass PROJECT_REQUIREMENT = eINSTANCE.getProjectRequirement();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.impl.ProcessRequirementImpl <em>Process Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.impl.ProcessRequirementImpl
		 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.impl.RequirementClassificationPackageImpl#getProcessRequirement()
		 * @generated
		 */
		EClass PROCESS_REQUIREMENT = eINSTANCE.getProcessRequirement();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.impl.ConstraintRequirementImpl <em>Constraint Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.impl.ConstraintRequirementImpl
		 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.impl.RequirementClassificationPackageImpl#getConstraintRequirement()
		 * @generated
		 */
		EClass CONSTRAINT_REQUIREMENT = eINSTANCE.getConstraintRequirement();

		/**
		 * The meta object literal for the '<em><b>Constraint Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT_REQUIREMENT__CONSTRAINT_KIND = eINSTANCE.getConstraintRequirement_ConstraintKind();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.impl.WorkloadCapacityRequirementImpl <em>Workload Capacity Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.impl.WorkloadCapacityRequirementImpl
		 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.impl.RequirementClassificationPackageImpl#getWorkloadCapacityRequirement()
		 * @generated
		 */
		EClass WORKLOAD_CAPACITY_REQUIREMENT = eINSTANCE.getWorkloadCapacityRequirement();

		/**
		 * The meta object literal for the '<em><b>Workload Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKLOAD_CAPACITY_REQUIREMENT__WORKLOAD_CAPACITY = eINSTANCE.getWorkloadCapacityRequirement_WorkloadCapacity();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.impl.QualityRequirementImpl <em>Quality Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.impl.QualityRequirementImpl
		 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.impl.RequirementClassificationPackageImpl#getQualityRequirement()
		 * @generated
		 */
		EClass QUALITY_REQUIREMENT = eINSTANCE.getQualityRequirement();

		/**
		 * The meta object literal for the '<em><b>Specific Quality Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALITY_REQUIREMENT__SPECIFIC_QUALITY_KIND = eINSTANCE.getQualityRequirement_SpecificQualityKind();

	}

} //RequirementClassificationPackage
