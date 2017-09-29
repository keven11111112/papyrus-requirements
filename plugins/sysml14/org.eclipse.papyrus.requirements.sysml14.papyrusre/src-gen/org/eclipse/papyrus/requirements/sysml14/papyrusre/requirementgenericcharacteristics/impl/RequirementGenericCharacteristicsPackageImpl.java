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
package org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.PapyrusREPackage;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.impl.PapyrusREPackageImpl;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.priorityandimportanceconcerns.PriorityAndImportanceConcernsPackage;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementandprocessconcerns.RequirementAndProcessConcernsPackage;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementclassificationconcerns.RequirementClassificationConcernsPackage;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementscharacteristicsconcerns.RequirementsCharacteristicsConcernsPackage;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.verificationandvalidationconcerns.VerificationAndValidationConcernsPackage;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.RequirementClassificationPackage;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.impl.RequirementClassificationPackageImpl;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.Requirement;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.RequirementGenericCharacteristicsFactory;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.RequirementGenericCharacteristicsPackage;

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
		RequirementClassificationConcernsPackage.eINSTANCE.eClass();
		RequirementsCharacteristicsConcernsPackage.eINSTANCE.eClass();
		PriorityAndImportanceConcernsPackage.eINSTANCE.eClass();
		RequirementAndProcessConcernsPackage.eINSTANCE.eClass();
		VerificationAndValidationConcernsPackage.eINSTANCE.eClass();
		sysmlPackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		PapyrusREPackageImpl thePapyrusREPackage = (PapyrusREPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PapyrusREPackage.eNS_URI) instanceof PapyrusREPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PapyrusREPackage.eNS_URI) : PapyrusREPackage.eINSTANCE);
		RequirementClassificationPackageImpl theRequirementClassificationPackage = (RequirementClassificationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RequirementClassificationPackage.eNS_URI) instanceof RequirementClassificationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RequirementClassificationPackage.eNS_URI) : RequirementClassificationPackage.eINSTANCE);
		RequirementTraceabilityPackageImpl theRequirementTraceabilityPackage = (RequirementTraceabilityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RequirementTraceabilityPackage.eNS_URI) instanceof RequirementTraceabilityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RequirementTraceabilityPackage.eNS_URI) : RequirementTraceabilityPackage.eINSTANCE);

		// Create package meta-data objects
		theRequirementGenericCharacteristicsPackage.createPackageContents();
		thePapyrusREPackage.createPackageContents();
		theRequirementClassificationPackage.createPackageContents();
		theRequirementTraceabilityPackage.createPackageContents();

		// Initialize created meta-data
		theRequirementGenericCharacteristicsPackage.initializePackageContents();
		thePapyrusREPackage.initializePackageContents();
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
	public EAttribute getRequirement_AgreementStatus() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_ApprovalAuthority() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_Importance() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_LifeCyclePhase() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_Maturity() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_AbstractionLevel() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_Owner() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_Priority() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_QualificationStatus() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_ReviewStatus() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_SatisfactionRationale() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_SatisfactionStatus() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_Source() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_ValidationRationale() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_ValidatorName() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_VerifierName() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_VV_Method() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_VV_Status() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_QualityNature() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(18);
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
		createEAttribute(requirementEClass, REQUIREMENT__AGREEMENT_STATUS);
		createEAttribute(requirementEClass, REQUIREMENT__APPROVAL_AUTHORITY);
		createEAttribute(requirementEClass, REQUIREMENT__IMPORTANCE);
		createEAttribute(requirementEClass, REQUIREMENT__LIFE_CYCLE_PHASE);
		createEAttribute(requirementEClass, REQUIREMENT__MATURITY);
		createEAttribute(requirementEClass, REQUIREMENT__ABSTRACTION_LEVEL);
		createEAttribute(requirementEClass, REQUIREMENT__OWNER);
		createEAttribute(requirementEClass, REQUIREMENT__PRIORITY);
		createEAttribute(requirementEClass, REQUIREMENT__QUALIFICATION_STATUS);
		createEAttribute(requirementEClass, REQUIREMENT__REVIEW_STATUS);
		createEAttribute(requirementEClass, REQUIREMENT__SATISFACTION_RATIONALE);
		createEAttribute(requirementEClass, REQUIREMENT__SATISFACTION_STATUS);
		createEAttribute(requirementEClass, REQUIREMENT__SOURCE);
		createEAttribute(requirementEClass, REQUIREMENT__VALIDATION_RATIONALE);
		createEAttribute(requirementEClass, REQUIREMENT__VALIDATOR_NAME);
		createEAttribute(requirementEClass, REQUIREMENT__VERIFIER_NAME);
		createEAttribute(requirementEClass, REQUIREMENT__VV_METHOD);
		createEAttribute(requirementEClass, REQUIREMENT__VV_STATUS);
		createEAttribute(requirementEClass, REQUIREMENT__QUALITY_NATURE);
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
		RequirementAndProcessConcernsPackage theRequirementAndProcessConcernsPackage = (RequirementAndProcessConcernsPackage)EPackage.Registry.INSTANCE.getEPackage(RequirementAndProcessConcernsPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		PriorityAndImportanceConcernsPackage thePriorityAndImportanceConcernsPackage = (PriorityAndImportanceConcernsPackage)EPackage.Registry.INSTANCE.getEPackage(PriorityAndImportanceConcernsPackage.eNS_URI);
		RequirementsCharacteristicsConcernsPackage theRequirementsCharacteristicsConcernsPackage = (RequirementsCharacteristicsConcernsPackage)EPackage.Registry.INSTANCE.getEPackage(RequirementsCharacteristicsConcernsPackage.eNS_URI);
		VerificationAndValidationConcernsPackage theVerificationAndValidationConcernsPackage = (VerificationAndValidationConcernsPackage)EPackage.Registry.INSTANCE.getEPackage(VerificationAndValidationConcernsPackage.eNS_URI);
		RequirementClassificationConcernsPackage theRequirementClassificationConcernsPackage = (RequirementClassificationConcernsPackage)EPackage.Registry.INSTANCE.getEPackage(RequirementClassificationConcernsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		requirementEClass.getESuperTypes().add(theRequirementsPackage.getRequirement());

		// Initialize classes, features, and operations; add parameters
		initEClass(requirementEClass, Requirement.class, "Requirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getRequirement_AgreementStatus(), theRequirementAndProcessConcernsPackage.getAgreementStatusKind(), "agreementStatus", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRequirement_ApprovalAuthority(), theTypesPackage.getString(), "approvalAuthority", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRequirement_Importance(), thePriorityAndImportanceConcernsPackage.getImportanceKind(), "importance", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRequirement_LifeCyclePhase(), theRequirementsCharacteristicsConcernsPackage.getLifeCyclePhaseKind(), "lifeCyclePhase", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRequirement_Maturity(), theTypesPackage.getInteger(), "maturity", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRequirement_AbstractionLevel(), theRequirementsCharacteristicsConcernsPackage.getAbstractionLevelKind(), "abstractionLevel", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRequirement_Owner(), theTypesPackage.getString(), "owner", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRequirement_Priority(), thePriorityAndImportanceConcernsPackage.getPriorityKind(), "priority", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRequirement_QualificationStatus(), theRequirementAndProcessConcernsPackage.getQualificationStatusKind(), "qualificationStatus", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRequirement_ReviewStatus(), theRequirementAndProcessConcernsPackage.getReviewStatusKind(), "reviewStatus", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRequirement_SatisfactionRationale(), theTypesPackage.getString(), "satisfactionRationale", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRequirement_SatisfactionStatus(), theRequirementAndProcessConcernsPackage.getSatisfactionStatusKind(), "satisfactionStatus", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRequirement_Source(), theTypesPackage.getString(), "source", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRequirement_ValidationRationale(), theTypesPackage.getString(), "validationRationale", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRequirement_ValidatorName(), theTypesPackage.getString(), "validatorName", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRequirement_VerifierName(), theTypesPackage.getString(), "verifierName", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRequirement_VV_Method(), theVerificationAndValidationConcernsPackage.getVV_MethodKind(), "VV_Method", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRequirement_VV_Status(), theVerificationAndValidationConcernsPackage.getVV_StatusKind(), "VV_Status", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRequirement_QualityNature(), theRequirementClassificationConcernsPackage.getQualityKind(), "qualityNature", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

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
