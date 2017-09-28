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
package org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementandprocessconcerns.impl;

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.priorityandimportanceconcerns.PriorityAndImportanceConcernsPackage;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.priorityandimportanceconcerns.impl.PriorityAndImportanceConcernsPackageImpl;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementandprocessconcerns.AgreementStatusKind;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementandprocessconcerns.QualificationStatusKind;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementandprocessconcerns.RequirementAndProcessConcernsFactory;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementandprocessconcerns.RequirementAndProcessConcernsPackage;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementandprocessconcerns.ReviewStatusKind;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementandprocessconcerns.SatisfactionStatusKind;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementclassificationconcerns.RequirementClassificationConcernsPackage;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementclassificationconcerns.impl.RequirementClassificationConcernsPackageImpl;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementscharacteristicsconcerns.RequirementsCharacteristicsConcernsPackage;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementscharacteristicsconcerns.impl.RequirementsCharacteristicsConcernsPackageImpl;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.verificationandvalidationconcerns.VerificationAndValidationConcernsPackage;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.verificationandvalidationconcerns.impl.VerificationAndValidationConcernsPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RequirementAndProcessConcernsPackageImpl extends EPackageImpl implements RequirementAndProcessConcernsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum agreementStatusKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum qualificationStatusKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum satisfactionStatusKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum reviewStatusKindEEnum = null;

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
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementandprocessconcerns.RequirementAndProcessConcernsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RequirementAndProcessConcernsPackageImpl() {
		super(eNS_URI, RequirementAndProcessConcernsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RequirementAndProcessConcernsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RequirementAndProcessConcernsPackage init() {
		if (isInited) return (RequirementAndProcessConcernsPackage)EPackage.Registry.INSTANCE.getEPackage(RequirementAndProcessConcernsPackage.eNS_URI);

		// Obtain or create and register package
		RequirementAndProcessConcernsPackageImpl theRequirementAndProcessConcernsPackage = (RequirementAndProcessConcernsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RequirementAndProcessConcernsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RequirementAndProcessConcernsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		RequirementClassificationConcernsPackageImpl theRequirementClassificationConcernsPackage = (RequirementClassificationConcernsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RequirementClassificationConcernsPackage.eNS_URI) instanceof RequirementClassificationConcernsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RequirementClassificationConcernsPackage.eNS_URI) : RequirementClassificationConcernsPackage.eINSTANCE);
		RequirementsCharacteristicsConcernsPackageImpl theRequirementsCharacteristicsConcernsPackage = (RequirementsCharacteristicsConcernsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RequirementsCharacteristicsConcernsPackage.eNS_URI) instanceof RequirementsCharacteristicsConcernsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RequirementsCharacteristicsConcernsPackage.eNS_URI) : RequirementsCharacteristicsConcernsPackage.eINSTANCE);
		PriorityAndImportanceConcernsPackageImpl thePriorityAndImportanceConcernsPackage = (PriorityAndImportanceConcernsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PriorityAndImportanceConcernsPackage.eNS_URI) instanceof PriorityAndImportanceConcernsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PriorityAndImportanceConcernsPackage.eNS_URI) : PriorityAndImportanceConcernsPackage.eINSTANCE);
		VerificationAndValidationConcernsPackageImpl theVerificationAndValidationConcernsPackage = (VerificationAndValidationConcernsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VerificationAndValidationConcernsPackage.eNS_URI) instanceof VerificationAndValidationConcernsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VerificationAndValidationConcernsPackage.eNS_URI) : VerificationAndValidationConcernsPackage.eINSTANCE);

		// Create package meta-data objects
		theRequirementAndProcessConcernsPackage.createPackageContents();
		theRequirementClassificationConcernsPackage.createPackageContents();
		theRequirementsCharacteristicsConcernsPackage.createPackageContents();
		thePriorityAndImportanceConcernsPackage.createPackageContents();
		theVerificationAndValidationConcernsPackage.createPackageContents();

		// Initialize created meta-data
		theRequirementAndProcessConcernsPackage.initializePackageContents();
		theRequirementClassificationConcernsPackage.initializePackageContents();
		theRequirementsCharacteristicsConcernsPackage.initializePackageContents();
		thePriorityAndImportanceConcernsPackage.initializePackageContents();
		theVerificationAndValidationConcernsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRequirementAndProcessConcernsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RequirementAndProcessConcernsPackage.eNS_URI, theRequirementAndProcessConcernsPackage);
		return theRequirementAndProcessConcernsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAgreementStatusKind() {
		return agreementStatusKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getQualificationStatusKind() {
		return qualificationStatusKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSatisfactionStatusKind() {
		return satisfactionStatusKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getReviewStatusKind() {
		return reviewStatusKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementAndProcessConcernsFactory getRequirementAndProcessConcernsFactory() {
		return (RequirementAndProcessConcernsFactory)getEFactoryInstance();
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

		// Create enums
		agreementStatusKindEEnum = createEEnum(AGREEMENT_STATUS_KIND);
		qualificationStatusKindEEnum = createEEnum(QUALIFICATION_STATUS_KIND);
		satisfactionStatusKindEEnum = createEEnum(SATISFACTION_STATUS_KIND);
		reviewStatusKindEEnum = createEEnum(REVIEW_STATUS_KIND);
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

		// Initialize enums and add enum literals
		initEEnum(agreementStatusKindEEnum, AgreementStatusKind.class, "AgreementStatusKind"); //$NON-NLS-1$
		addEEnumLiteral(agreementStatusKindEEnum, AgreementStatusKind.PROPOSED);
		addEEnumLiteral(agreementStatusKindEEnum, AgreementStatusKind.TO_BE_REFINED);
		addEEnumLiteral(agreementStatusKindEEnum, AgreementStatusKind.ACCEPTED);
		addEEnumLiteral(agreementStatusKindEEnum, AgreementStatusKind.DRAFT);
		addEEnumLiteral(agreementStatusKindEEnum, AgreementStatusKind.REJECTED);

		initEEnum(qualificationStatusKindEEnum, QualificationStatusKind.class, "QualificationStatusKind"); //$NON-NLS-1$
		addEEnumLiteral(qualificationStatusKindEEnum, QualificationStatusKind.NOT_QUALIFIED);
		addEEnumLiteral(qualificationStatusKindEEnum, QualificationStatusKind.QUALIFIED);
		addEEnumLiteral(qualificationStatusKindEEnum, QualificationStatusKind.SUSPECT);

		initEEnum(satisfactionStatusKindEEnum, SatisfactionStatusKind.class, "SatisfactionStatusKind"); //$NON-NLS-1$
		addEEnumLiteral(satisfactionStatusKindEEnum, SatisfactionStatusKind.NOT_SATISFIED);
		addEEnumLiteral(satisfactionStatusKindEEnum, SatisfactionStatusKind.SATISFIED);
		addEEnumLiteral(satisfactionStatusKindEEnum, SatisfactionStatusKind.SUSPECT);

		initEEnum(reviewStatusKindEEnum, ReviewStatusKind.class, "ReviewStatusKind"); //$NON-NLS-1$
		addEEnumLiteral(reviewStatusKindEEnum, ReviewStatusKind.TO_BE_REVIEWED);
		addEEnumLiteral(reviewStatusKindEEnum, ReviewStatusKind.ACCEPTED);
		addEEnumLiteral(reviewStatusKindEEnum, ReviewStatusKind.REJECTED);

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
			 "originalName", "RequirementAndProcessConcerns" //$NON-NLS-1$ //$NON-NLS-2$
		   });
	}

} //RequirementAndProcessConcernsPackageImpl
