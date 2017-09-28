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
package org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.papyrus.sysml14.requirements.RequirementsPackage;

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
 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.RequirementGenericCharacteristicsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='RequirementGenericCharacteristics'"
 * @generated
 */
public interface RequirementGenericCharacteristicsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "requirementgenericcharacteristics"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/papyrus/requirements/sysml14/0.7.0/PapyrusRE/RequirementGenericCharacteristics"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "RequirementGenericCharacteristics"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RequirementGenericCharacteristicsPackage eINSTANCE = org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementGenericCharacteristicsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementImpl <em>Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementImpl
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementGenericCharacteristicsPackageImpl#getRequirement()
	 * @generated
	 */
	int REQUIREMENT = 0;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__BASE_CLASS = RequirementsPackage.REQUIREMENT__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__DERIVED = RequirementsPackage.REQUIREMENT__DERIVED;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__DERIVED_FROM = RequirementsPackage.REQUIREMENT__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ID = RequirementsPackage.REQUIREMENT__ID;

	/**
	 * The feature id for the '<em><b>Master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__MASTER = RequirementsPackage.REQUIREMENT__MASTER;

	/**
	 * The feature id for the '<em><b>Refined By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__REFINED_BY = RequirementsPackage.REQUIREMENT__REFINED_BY;

	/**
	 * The feature id for the '<em><b>Satisfied By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__SATISFIED_BY = RequirementsPackage.REQUIREMENT__SATISFIED_BY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__TEXT = RequirementsPackage.REQUIREMENT__TEXT;

	/**
	 * The feature id for the '<em><b>Traced To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__TRACED_TO = RequirementsPackage.REQUIREMENT__TRACED_TO;

	/**
	 * The feature id for the '<em><b>Verified By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__VERIFIED_BY = RequirementsPackage.REQUIREMENT__VERIFIED_BY;

	/**
	 * The feature id for the '<em><b>Agreement Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__AGREEMENT_STATUS = RequirementsPackage.REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Approval Authority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__APPROVAL_AUTHORITY = RequirementsPackage.REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Importance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__IMPORTANCE = RequirementsPackage.REQUIREMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Life Cycle Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__LIFE_CYCLE_PHASE = RequirementsPackage.REQUIREMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Maturity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__MATURITY = RequirementsPackage.REQUIREMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Abstraction Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ABSTRACTION_LEVEL = RequirementsPackage.REQUIREMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__OWNER = RequirementsPackage.REQUIREMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__PRIORITY = RequirementsPackage.REQUIREMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Qualification Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__QUALIFICATION_STATUS = RequirementsPackage.REQUIREMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Review Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__REVIEW_STATUS = RequirementsPackage.REQUIREMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Satisfaction Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__SATISFACTION_RATIONALE = RequirementsPackage.REQUIREMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Satisfaction Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__SATISFACTION_STATUS = RequirementsPackage.REQUIREMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__SOURCE = RequirementsPackage.REQUIREMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Validation Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__VALIDATION_RATIONALE = RequirementsPackage.REQUIREMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Validator Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__VALIDATOR_NAME = RequirementsPackage.REQUIREMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Verifier Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__VERIFIER_NAME = RequirementsPackage.REQUIREMENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>VV Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__VV_METHOD = RequirementsPackage.REQUIREMENT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>VV Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__VV_STATUS = RequirementsPackage.REQUIREMENT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Quality Nature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__QUALITY_NATURE = RequirementsPackage.REQUIREMENT_FEATURE_COUNT + 18;

	/**
	 * The number of structural features of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_FEATURE_COUNT = RequirementsPackage.REQUIREMENT_FEATURE_COUNT + 19;

	/**
	 * The number of operations of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_OPERATION_COUNT = RequirementsPackage.REQUIREMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement</em>'.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.Requirement
	 * @generated
	 */
	EClass getRequirement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.Requirement#getAgreementStatus <em>Agreement Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Agreement Status</em>'.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.Requirement#getAgreementStatus()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_AgreementStatus();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.Requirement#getApprovalAuthority <em>Approval Authority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Approval Authority</em>'.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.Requirement#getApprovalAuthority()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_ApprovalAuthority();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.Requirement#getImportance <em>Importance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Importance</em>'.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.Requirement#getImportance()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Importance();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.Requirement#getLifeCyclePhase <em>Life Cycle Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Life Cycle Phase</em>'.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.Requirement#getLifeCyclePhase()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_LifeCyclePhase();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.Requirement#getMaturity <em>Maturity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maturity</em>'.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.Requirement#getMaturity()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Maturity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.Requirement#getAbstractionLevel <em>Abstraction Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstraction Level</em>'.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.Requirement#getAbstractionLevel()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_AbstractionLevel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.Requirement#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owner</em>'.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.Requirement#getOwner()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Owner();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.Requirement#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.Requirement#getPriority()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Priority();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.Requirement#getQualificationStatus <em>Qualification Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualification Status</em>'.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.Requirement#getQualificationStatus()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_QualificationStatus();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.Requirement#getReviewStatus <em>Review Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Review Status</em>'.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.Requirement#getReviewStatus()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_ReviewStatus();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.Requirement#getSatisfactionRationale <em>Satisfaction Rationale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Satisfaction Rationale</em>'.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.Requirement#getSatisfactionRationale()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_SatisfactionRationale();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.Requirement#getSatisfactionStatus <em>Satisfaction Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Satisfaction Status</em>'.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.Requirement#getSatisfactionStatus()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_SatisfactionStatus();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.Requirement#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.Requirement#getSource()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Source();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.Requirement#getValidationRationale <em>Validation Rationale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validation Rationale</em>'.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.Requirement#getValidationRationale()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_ValidationRationale();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.Requirement#getValidatorName <em>Validator Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validator Name</em>'.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.Requirement#getValidatorName()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_ValidatorName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.Requirement#getVerifierName <em>Verifier Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Verifier Name</em>'.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.Requirement#getVerifierName()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_VerifierName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.Requirement#getVV_Method <em>VV Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>VV Method</em>'.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.Requirement#getVV_Method()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_VV_Method();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.Requirement#getVV_Status <em>VV Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>VV Status</em>'.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.Requirement#getVV_Status()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_VV_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.Requirement#getQualityNature <em>Quality Nature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quality Nature</em>'.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.Requirement#getQualityNature()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_QualityNature();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RequirementGenericCharacteristicsFactory getRequirementGenericCharacteristicsFactory();

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
		 * The meta object literal for the '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementImpl <em>Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementImpl
		 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementGenericCharacteristicsPackageImpl#getRequirement()
		 * @generated
		 */
		EClass REQUIREMENT = eINSTANCE.getRequirement();

		/**
		 * The meta object literal for the '<em><b>Agreement Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__AGREEMENT_STATUS = eINSTANCE.getRequirement_AgreementStatus();

		/**
		 * The meta object literal for the '<em><b>Approval Authority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__APPROVAL_AUTHORITY = eINSTANCE.getRequirement_ApprovalAuthority();

		/**
		 * The meta object literal for the '<em><b>Importance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__IMPORTANCE = eINSTANCE.getRequirement_Importance();

		/**
		 * The meta object literal for the '<em><b>Life Cycle Phase</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__LIFE_CYCLE_PHASE = eINSTANCE.getRequirement_LifeCyclePhase();

		/**
		 * The meta object literal for the '<em><b>Maturity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__MATURITY = eINSTANCE.getRequirement_Maturity();

		/**
		 * The meta object literal for the '<em><b>Abstraction Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__ABSTRACTION_LEVEL = eINSTANCE.getRequirement_AbstractionLevel();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__OWNER = eINSTANCE.getRequirement_Owner();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__PRIORITY = eINSTANCE.getRequirement_Priority();

		/**
		 * The meta object literal for the '<em><b>Qualification Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__QUALIFICATION_STATUS = eINSTANCE.getRequirement_QualificationStatus();

		/**
		 * The meta object literal for the '<em><b>Review Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__REVIEW_STATUS = eINSTANCE.getRequirement_ReviewStatus();

		/**
		 * The meta object literal for the '<em><b>Satisfaction Rationale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__SATISFACTION_RATIONALE = eINSTANCE.getRequirement_SatisfactionRationale();

		/**
		 * The meta object literal for the '<em><b>Satisfaction Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__SATISFACTION_STATUS = eINSTANCE.getRequirement_SatisfactionStatus();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__SOURCE = eINSTANCE.getRequirement_Source();

		/**
		 * The meta object literal for the '<em><b>Validation Rationale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__VALIDATION_RATIONALE = eINSTANCE.getRequirement_ValidationRationale();

		/**
		 * The meta object literal for the '<em><b>Validator Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__VALIDATOR_NAME = eINSTANCE.getRequirement_ValidatorName();

		/**
		 * The meta object literal for the '<em><b>Verifier Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__VERIFIER_NAME = eINSTANCE.getRequirement_VerifierName();

		/**
		 * The meta object literal for the '<em><b>VV Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__VV_METHOD = eINSTANCE.getRequirement_VV_Method();

		/**
		 * The meta object literal for the '<em><b>VV Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__VV_STATUS = eINSTANCE.getRequirement_VV_Status();

		/**
		 * The meta object literal for the '<em><b>Quality Nature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__QUALITY_NATURE = eINSTANCE.getRequirement_QualityNature();

	}

} //RequirementGenericCharacteristicsPackage
