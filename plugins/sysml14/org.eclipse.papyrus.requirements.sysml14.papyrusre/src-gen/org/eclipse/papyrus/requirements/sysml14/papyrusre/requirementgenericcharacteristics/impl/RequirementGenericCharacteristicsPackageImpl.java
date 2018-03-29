/**
 * Copyright (c) 2017 CEA LIST.
 * 
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   S�bastien Gerard (CEA LIST) <sebastien.gerard@cea.fr> - Initial API and implementation
 *   Yupanqui Munoz Julho (CEA LIST) <yupanqui.munozjulho@cea.fr> - Initial API and implementation
 * 
 */
package org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.RequirementClassificationPackage;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.impl.RequirementClassificationPackageImpl;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.AbstractionLevelReqCharac;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.AgreementStatusReqCharac;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.ApprovalAuthorityReqCharac;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.ImportanceReqCharac;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.LifeCyclePhaseReqCharac;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.MaturityReqCharac;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.OwnerReqCharac;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.PriorityReqCharac;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.QualificationStatusReqCharac;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.QualityNatureReqCharac;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.Requirement;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.RequirementGenericCharacteristicsFactory;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.RequirementGenericCharacteristicsPackage;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.ReviewStatusReqCharac;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.SatifiactionStatusReqCharac;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.SourceReqCharac;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.ValidatorNameReqCharac;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.VerifierNameReqCharac;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementtraceability.RequirementTraceabilityPackage;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementtraceability.impl.RequirementTraceabilityPackageImpl;

import org.eclipse.papyrus.sysml14.requirements.RequirementsPackage;

import org.eclipse.papyrus.sysml14.sysmlPackage;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RequirementGenericCharacteristicsPackageImpl extends EPackageImpl implements RequirementGenericCharacteristicsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ownerReqCharacEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importanceReqCharacEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass approvalAuthorityReqCharacEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agreementStatusReqCharacEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maturityReqCharacEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lifeCyclePhaseReqCharacEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractionLevelReqCharacEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass priorityReqCharacEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceReqCharacEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualificationStatusReqCharacEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reviewStatusReqCharacEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass validatorNameReqCharacEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualityNatureReqCharacEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verifierNameReqCharacEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass satifiactionStatusReqCharacEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.RequirementGenericCharacteristicsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RequirementGenericCharacteristicsPackageImpl() {
		super(eNS_URI, RequirementGenericCharacteristicsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link RequirementGenericCharacteristicsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RequirementGenericCharacteristicsPackage init() {
		if (isInited) return (RequirementGenericCharacteristicsPackage)EPackage.Registry.INSTANCE.getEPackage(RequirementGenericCharacteristicsPackage.eNS_URI);

		// Obtain or create and register package
		RequirementGenericCharacteristicsPackageImpl theRequirementGenericCharacteristicsPackage = (RequirementGenericCharacteristicsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RequirementGenericCharacteristicsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RequirementGenericCharacteristicsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		sysmlPackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		RequirementClassificationPackageImpl theRequirementClassificationPackage = (RequirementClassificationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RequirementClassificationPackage.eNS_URI) instanceof RequirementClassificationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RequirementClassificationPackage.eNS_URI) : RequirementClassificationPackage.eINSTANCE);
		RequirementTraceabilityPackageImpl theRequirementTraceabilityPackage = (RequirementTraceabilityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RequirementTraceabilityPackage.eNS_URI) instanceof RequirementTraceabilityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RequirementTraceabilityPackage.eNS_URI) : RequirementTraceabilityPackage.eINSTANCE);

		// Create package meta-data objects
		theRequirementGenericCharacteristicsPackage.createPackageContents();
		theRequirementClassificationPackage.createPackageContents();
		theRequirementTraceabilityPackage.createPackageContents();

		// Initialize created meta-data
		theRequirementGenericCharacteristicsPackage.initializePackageContents();
		theRequirementClassificationPackage.initializePackageContents();
		theRequirementTraceabilityPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRequirementGenericCharacteristicsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RequirementGenericCharacteristicsPackage.eNS_URI, theRequirementGenericCharacteristicsPackage);
		return theRequirementGenericCharacteristicsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequirement() {
		return requirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOwnerReqCharac() {
		return ownerReqCharacEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOwnerReqCharac_Owner() {
		return (EAttribute)ownerReqCharacEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImportanceReqCharac() {
		return importanceReqCharacEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImportanceReqCharac_Importance() {
		return (EAttribute)importanceReqCharacEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApprovalAuthorityReqCharac() {
		return approvalAuthorityReqCharacEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApprovalAuthorityReqCharac_ApprovalAuthority() {
		return (EAttribute)approvalAuthorityReqCharacEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAgreementStatusReqCharac() {
		return agreementStatusReqCharacEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgreementStatusReqCharac_AgreementStatus() {
		return (EAttribute)agreementStatusReqCharacEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaturityReqCharac() {
		return maturityReqCharacEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaturityReqCharac_Maturity() {
		return (EAttribute)maturityReqCharacEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLifeCyclePhaseReqCharac() {
		return lifeCyclePhaseReqCharacEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLifeCyclePhaseReqCharac_LifeCyclePhase() {
		return (EAttribute)lifeCyclePhaseReqCharacEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractionLevelReqCharac() {
		return abstractionLevelReqCharacEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractionLevelReqCharac_AbstractionLevel() {
		return (EAttribute)abstractionLevelReqCharacEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPriorityReqCharac() {
		return priorityReqCharacEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPriorityReqCharac_Priority() {
		return (EAttribute)priorityReqCharacEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceReqCharac() {
		return sourceReqCharacEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceReqCharac_Source() {
		return (EAttribute)sourceReqCharacEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQualificationStatusReqCharac() {
		return qualificationStatusReqCharacEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQualificationStatusReqCharac_QualificationStatus() {
		return (EAttribute)qualificationStatusReqCharacEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReviewStatusReqCharac() {
		return reviewStatusReqCharacEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReviewStatusReqCharac_ReviewStatus() {
		return (EAttribute)reviewStatusReqCharacEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValidatorNameReqCharac() {
		return validatorNameReqCharacEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValidatorNameReqCharac_ValidatorName() {
		return (EAttribute)validatorNameReqCharacEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQualityNatureReqCharac() {
		return qualityNatureReqCharacEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQualityNatureReqCharac_QualityNature() {
		return (EAttribute)qualityNatureReqCharacEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVerifierNameReqCharac() {
		return verifierNameReqCharacEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerifierNameReqCharac_VerifierName() {
		return (EAttribute)verifierNameReqCharacEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerifierNameReqCharac_VV_Method() {
		return (EAttribute)verifierNameReqCharacEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerifierNameReqCharac_VV_Status() {
		return (EAttribute)verifierNameReqCharacEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSatifiactionStatusReqCharac() {
		return satifiactionStatusReqCharacEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSatifiactionStatusReqCharac_SatisfactionStatus() {
		return (EAttribute)satifiactionStatusReqCharacEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementGenericCharacteristicsFactory getRequirementGenericCharacteristicsFactory() {
		return (RequirementGenericCharacteristicsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		requirementEClass = createEClass(REQUIREMENT);

		ownerReqCharacEClass = createEClass(OWNER_REQ_CHARAC);
		createEAttribute(ownerReqCharacEClass, OWNER_REQ_CHARAC__OWNER);

		importanceReqCharacEClass = createEClass(IMPORTANCE_REQ_CHARAC);
		createEAttribute(importanceReqCharacEClass, IMPORTANCE_REQ_CHARAC__IMPORTANCE);

		approvalAuthorityReqCharacEClass = createEClass(APPROVAL_AUTHORITY_REQ_CHARAC);
		createEAttribute(approvalAuthorityReqCharacEClass, APPROVAL_AUTHORITY_REQ_CHARAC__APPROVAL_AUTHORITY);

		agreementStatusReqCharacEClass = createEClass(AGREEMENT_STATUS_REQ_CHARAC);
		createEAttribute(agreementStatusReqCharacEClass, AGREEMENT_STATUS_REQ_CHARAC__AGREEMENT_STATUS);

		maturityReqCharacEClass = createEClass(MATURITY_REQ_CHARAC);
		createEAttribute(maturityReqCharacEClass, MATURITY_REQ_CHARAC__MATURITY);

		lifeCyclePhaseReqCharacEClass = createEClass(LIFE_CYCLE_PHASE_REQ_CHARAC);
		createEAttribute(lifeCyclePhaseReqCharacEClass, LIFE_CYCLE_PHASE_REQ_CHARAC__LIFE_CYCLE_PHASE);

		abstractionLevelReqCharacEClass = createEClass(ABSTRACTION_LEVEL_REQ_CHARAC);
		createEAttribute(abstractionLevelReqCharacEClass, ABSTRACTION_LEVEL_REQ_CHARAC__ABSTRACTION_LEVEL);

		priorityReqCharacEClass = createEClass(PRIORITY_REQ_CHARAC);
		createEAttribute(priorityReqCharacEClass, PRIORITY_REQ_CHARAC__PRIORITY);

		sourceReqCharacEClass = createEClass(SOURCE_REQ_CHARAC);
		createEAttribute(sourceReqCharacEClass, SOURCE_REQ_CHARAC__SOURCE);

		qualificationStatusReqCharacEClass = createEClass(QUALIFICATION_STATUS_REQ_CHARAC);
		createEAttribute(qualificationStatusReqCharacEClass, QUALIFICATION_STATUS_REQ_CHARAC__QUALIFICATION_STATUS);

		reviewStatusReqCharacEClass = createEClass(REVIEW_STATUS_REQ_CHARAC);
		createEAttribute(reviewStatusReqCharacEClass, REVIEW_STATUS_REQ_CHARAC__REVIEW_STATUS);

		validatorNameReqCharacEClass = createEClass(VALIDATOR_NAME_REQ_CHARAC);
		createEAttribute(validatorNameReqCharacEClass, VALIDATOR_NAME_REQ_CHARAC__VALIDATOR_NAME);

		qualityNatureReqCharacEClass = createEClass(QUALITY_NATURE_REQ_CHARAC);
		createEAttribute(qualityNatureReqCharacEClass, QUALITY_NATURE_REQ_CHARAC__QUALITY_NATURE);

		verifierNameReqCharacEClass = createEClass(VERIFIER_NAME_REQ_CHARAC);
		createEAttribute(verifierNameReqCharacEClass, VERIFIER_NAME_REQ_CHARAC__VERIFIER_NAME);
		createEAttribute(verifierNameReqCharacEClass, VERIFIER_NAME_REQ_CHARAC__VV_METHOD);
		createEAttribute(verifierNameReqCharacEClass, VERIFIER_NAME_REQ_CHARAC__VV_STATUS);

		satifiactionStatusReqCharacEClass = createEClass(SATIFIACTION_STATUS_REQ_CHARAC);
		createEAttribute(satifiactionStatusReqCharacEClass, SATIFIACTION_STATUS_REQ_CHARAC__SATISFACTION_STATUS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		RequirementsPackage theRequirementsPackage = (RequirementsPackage)EPackage.Registry.INSTANCE.getEPackage(RequirementsPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		requirementEClass.getESuperTypes().add(this.getAgreementStatusReqCharac());
		requirementEClass.getESuperTypes().add(this.getImportanceReqCharac());
		requirementEClass.getESuperTypes().add(theRequirementsPackage.getRequirement());
		requirementEClass.getESuperTypes().add(this.getVerifierNameReqCharac());
		requirementEClass.getESuperTypes().add(this.getAbstractionLevelReqCharac());
		requirementEClass.getESuperTypes().add(this.getApprovalAuthorityReqCharac());
		requirementEClass.getESuperTypes().add(this.getLifeCyclePhaseReqCharac());
		requirementEClass.getESuperTypes().add(this.getMaturityReqCharac());
		requirementEClass.getESuperTypes().add(this.getOwnerReqCharac());
		requirementEClass.getESuperTypes().add(this.getPriorityReqCharac());
		requirementEClass.getESuperTypes().add(this.getQualificationStatusReqCharac());
		requirementEClass.getESuperTypes().add(this.getQualityNatureReqCharac());
		requirementEClass.getESuperTypes().add(this.getReviewStatusReqCharac());
		requirementEClass.getESuperTypes().add(this.getSatifiactionStatusReqCharac());
		requirementEClass.getESuperTypes().add(this.getSourceReqCharac());
		requirementEClass.getESuperTypes().add(this.getValidatorNameReqCharac());
		importanceReqCharacEClass.getESuperTypes().add(theRequirementsPackage.getRequirement());
		agreementStatusReqCharacEClass.getESuperTypes().add(theRequirementsPackage.getRequirement());

		// Initialize classes, features, and operations; add parameters
		initEClass(requirementEClass, Requirement.class, "Requirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(ownerReqCharacEClass, OwnerReqCharac.class, "OwnerReqCharac", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getOwnerReqCharac_Owner(), theTypesPackage.getString(), "owner", null, 0, 1, OwnerReqCharac.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(importanceReqCharacEClass, ImportanceReqCharac.class, "ImportanceReqCharac", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getImportanceReqCharac_Importance(), ecorePackage.getEJavaObject(), "importance", null, 0, 1, ImportanceReqCharac.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(approvalAuthorityReqCharacEClass, ApprovalAuthorityReqCharac.class, "ApprovalAuthorityReqCharac", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getApprovalAuthorityReqCharac_ApprovalAuthority(), theTypesPackage.getString(), "approvalAuthority", null, 0, 1, ApprovalAuthorityReqCharac.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(agreementStatusReqCharacEClass, AgreementStatusReqCharac.class, "AgreementStatusReqCharac", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getAgreementStatusReqCharac_AgreementStatus(), ecorePackage.getEJavaObject(), "agreementStatus", null, 0, 1, AgreementStatusReqCharac.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(maturityReqCharacEClass, MaturityReqCharac.class, "MaturityReqCharac", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getMaturityReqCharac_Maturity(), theTypesPackage.getInteger(), "maturity", null, 0, 1, MaturityReqCharac.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(lifeCyclePhaseReqCharacEClass, LifeCyclePhaseReqCharac.class, "LifeCyclePhaseReqCharac", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getLifeCyclePhaseReqCharac_LifeCyclePhase(), ecorePackage.getEJavaObject(), "lifeCyclePhase", null, 0, 1, LifeCyclePhaseReqCharac.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(abstractionLevelReqCharacEClass, AbstractionLevelReqCharac.class, "AbstractionLevelReqCharac", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getAbstractionLevelReqCharac_AbstractionLevel(), ecorePackage.getEJavaObject(), "abstractionLevel", null, 0, 1, AbstractionLevelReqCharac.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(priorityReqCharacEClass, PriorityReqCharac.class, "PriorityReqCharac", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getPriorityReqCharac_Priority(), ecorePackage.getEJavaObject(), "priority", null, 0, 1, PriorityReqCharac.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(sourceReqCharacEClass, SourceReqCharac.class, "SourceReqCharac", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getSourceReqCharac_Source(), theTypesPackage.getString(), "source", null, 0, 1, SourceReqCharac.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(qualificationStatusReqCharacEClass, QualificationStatusReqCharac.class, "QualificationStatusReqCharac", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getQualificationStatusReqCharac_QualificationStatus(), ecorePackage.getEJavaObject(), "qualificationStatus", null, 0, 1, QualificationStatusReqCharac.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(reviewStatusReqCharacEClass, ReviewStatusReqCharac.class, "ReviewStatusReqCharac", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getReviewStatusReqCharac_ReviewStatus(), ecorePackage.getEJavaObject(), "reviewStatus", null, 0, 1, ReviewStatusReqCharac.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(validatorNameReqCharacEClass, ValidatorNameReqCharac.class, "ValidatorNameReqCharac", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getValidatorNameReqCharac_ValidatorName(), theTypesPackage.getString(), "validatorName", null, 0, 1, ValidatorNameReqCharac.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(qualityNatureReqCharacEClass, QualityNatureReqCharac.class, "QualityNatureReqCharac", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getQualityNatureReqCharac_QualityNature(), ecorePackage.getEJavaObject(), "qualityNature", null, 0, 1, QualityNatureReqCharac.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(verifierNameReqCharacEClass, VerifierNameReqCharac.class, "VerifierNameReqCharac", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getVerifierNameReqCharac_VerifierName(), theTypesPackage.getString(), "verifierName", null, 0, 1, VerifierNameReqCharac.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getVerifierNameReqCharac_VV_Method(), ecorePackage.getEJavaObject(), "VV_Method", null, 0, 1, VerifierNameReqCharac.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getVerifierNameReqCharac_VV_Status(), ecorePackage.getEJavaObject(), "VV_Status", null, 0, 1, VerifierNameReqCharac.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(satifiactionStatusReqCharacEClass, SatifiactionStatusReqCharac.class, "SatifiactionStatusReqCharac", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getSatifiactionStatusReqCharac_SatisfactionStatus(), ecorePackage.getEJavaObject(), "satisfactionStatus", null, 0, 1, SatifiactionStatusReqCharac.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/2.0.0/UML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUMLAnnotations() {
		String source = "http://www.eclipse.org/uml2/2.0.0/UML"; //$NON-NLS-1$	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "originalName", "RequirementGenericCharacteristics" //$NON-NLS-1$ //$NON-NLS-2$
		   });
	}

} //RequirementGenericCharacteristicsPackageImpl
