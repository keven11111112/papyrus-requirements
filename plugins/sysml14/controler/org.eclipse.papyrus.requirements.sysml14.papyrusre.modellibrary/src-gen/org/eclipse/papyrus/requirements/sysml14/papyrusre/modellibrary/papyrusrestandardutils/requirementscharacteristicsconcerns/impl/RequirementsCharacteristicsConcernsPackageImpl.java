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
package org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementscharacteristicsconcerns.impl;

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.priorityandimportanceconcerns.PriorityAndImportanceConcernsPackage;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.priorityandimportanceconcerns.impl.PriorityAndImportanceConcernsPackageImpl;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementandprocessconcerns.RequirementAndProcessConcernsPackage;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementandprocessconcerns.impl.RequirementAndProcessConcernsPackageImpl;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementclassificationconcerns.RequirementClassificationConcernsPackage;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementclassificationconcerns.impl.RequirementClassificationConcernsPackageImpl;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementscharacteristicsconcerns.AbstractionLevelKind;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementscharacteristicsconcerns.LifeCyclePhaseKind;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementscharacteristicsconcerns.RequirementsCharacteristicsConcernsFactory;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementscharacteristicsconcerns.RequirementsCharacteristicsConcernsPackage;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.verificationandvalidationconcerns.VerificationAndValidationConcernsPackage;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.verificationandvalidationconcerns.impl.VerificationAndValidationConcernsPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RequirementsCharacteristicsConcernsPackageImpl extends EPackageImpl implements RequirementsCharacteristicsConcernsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum lifeCyclePhaseKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum abstractionLevelKindEEnum = null;

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
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementscharacteristicsconcerns.RequirementsCharacteristicsConcernsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RequirementsCharacteristicsConcernsPackageImpl() {
		super(eNS_URI, RequirementsCharacteristicsConcernsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RequirementsCharacteristicsConcernsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RequirementsCharacteristicsConcernsPackage init() {
		if (isInited) return (RequirementsCharacteristicsConcernsPackage)EPackage.Registry.INSTANCE.getEPackage(RequirementsCharacteristicsConcernsPackage.eNS_URI);

		// Obtain or create and register package
		RequirementsCharacteristicsConcernsPackageImpl theRequirementsCharacteristicsConcernsPackage = (RequirementsCharacteristicsConcernsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RequirementsCharacteristicsConcernsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RequirementsCharacteristicsConcernsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		RequirementClassificationConcernsPackageImpl theRequirementClassificationConcernsPackage = (RequirementClassificationConcernsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RequirementClassificationConcernsPackage.eNS_URI) instanceof RequirementClassificationConcernsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RequirementClassificationConcernsPackage.eNS_URI) : RequirementClassificationConcernsPackage.eINSTANCE);
		PriorityAndImportanceConcernsPackageImpl thePriorityAndImportanceConcernsPackage = (PriorityAndImportanceConcernsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PriorityAndImportanceConcernsPackage.eNS_URI) instanceof PriorityAndImportanceConcernsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PriorityAndImportanceConcernsPackage.eNS_URI) : PriorityAndImportanceConcernsPackage.eINSTANCE);
		RequirementAndProcessConcernsPackageImpl theRequirementAndProcessConcernsPackage = (RequirementAndProcessConcernsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RequirementAndProcessConcernsPackage.eNS_URI) instanceof RequirementAndProcessConcernsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RequirementAndProcessConcernsPackage.eNS_URI) : RequirementAndProcessConcernsPackage.eINSTANCE);
		VerificationAndValidationConcernsPackageImpl theVerificationAndValidationConcernsPackage = (VerificationAndValidationConcernsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VerificationAndValidationConcernsPackage.eNS_URI) instanceof VerificationAndValidationConcernsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VerificationAndValidationConcernsPackage.eNS_URI) : VerificationAndValidationConcernsPackage.eINSTANCE);

		// Create package meta-data objects
		theRequirementsCharacteristicsConcernsPackage.createPackageContents();
		theRequirementClassificationConcernsPackage.createPackageContents();
		thePriorityAndImportanceConcernsPackage.createPackageContents();
		theRequirementAndProcessConcernsPackage.createPackageContents();
		theVerificationAndValidationConcernsPackage.createPackageContents();

		// Initialize created meta-data
		theRequirementsCharacteristicsConcernsPackage.initializePackageContents();
		theRequirementClassificationConcernsPackage.initializePackageContents();
		thePriorityAndImportanceConcernsPackage.initializePackageContents();
		theRequirementAndProcessConcernsPackage.initializePackageContents();
		theVerificationAndValidationConcernsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRequirementsCharacteristicsConcernsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RequirementsCharacteristicsConcernsPackage.eNS_URI, theRequirementsCharacteristicsConcernsPackage);
		return theRequirementsCharacteristicsConcernsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLifeCyclePhaseKind() {
		return lifeCyclePhaseKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAbstractionLevelKind() {
		return abstractionLevelKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementsCharacteristicsConcernsFactory getRequirementsCharacteristicsConcernsFactory() {
		return (RequirementsCharacteristicsConcernsFactory)getEFactoryInstance();
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
		lifeCyclePhaseKindEEnum = createEEnum(LIFE_CYCLE_PHASE_KIND);
		abstractionLevelKindEEnum = createEEnum(ABSTRACTION_LEVEL_KIND);
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
		initEEnum(lifeCyclePhaseKindEEnum, LifeCyclePhaseKind.class, "LifeCyclePhaseKind"); //$NON-NLS-1$
		addEEnumLiteral(lifeCyclePhaseKindEEnum, LifeCyclePhaseKind.PRE_CONCEPT);
		addEEnumLiteral(lifeCyclePhaseKindEEnum, LifeCyclePhaseKind.CONCEPT);
		addEEnumLiteral(lifeCyclePhaseKindEEnum, LifeCyclePhaseKind.DEVELOPMENT);
		addEEnumLiteral(lifeCyclePhaseKindEEnum, LifeCyclePhaseKind.MANUFACTURING);
		addEEnumLiteral(lifeCyclePhaseKindEEnum, LifeCyclePhaseKind.INTEGRATION);
		addEEnumLiteral(lifeCyclePhaseKindEEnum, LifeCyclePhaseKind.TEST);
		addEEnumLiteral(lifeCyclePhaseKindEEnum, LifeCyclePhaseKind.DEPLOYMENT);
		addEEnumLiteral(lifeCyclePhaseKindEEnum, LifeCyclePhaseKind.DELIVERY);
		addEEnumLiteral(lifeCyclePhaseKindEEnum, LifeCyclePhaseKind.INSTALLATION);
		addEEnumLiteral(lifeCyclePhaseKindEEnum, LifeCyclePhaseKind.OPERATION);
		addEEnumLiteral(lifeCyclePhaseKindEEnum, LifeCyclePhaseKind.SUPPORT);
		addEEnumLiteral(lifeCyclePhaseKindEEnum, LifeCyclePhaseKind.DISPOSAL);

		initEEnum(abstractionLevelKindEEnum, AbstractionLevelKind.class, "AbstractionLevelKind"); //$NON-NLS-1$
		addEEnumLiteral(abstractionLevelKindEEnum, AbstractionLevelKind.SPECIFICATION_LEVEL);
		addEEnumLiteral(abstractionLevelKindEEnum, AbstractionLevelKind.ANALYSIS_LEVEL);
		addEEnumLiteral(abstractionLevelKindEEnum, AbstractionLevelKind.DESIGN_LEVEL);
		addEEnumLiteral(abstractionLevelKindEEnum, AbstractionLevelKind.IMPLEMENTATION_LEVEL);
		addEEnumLiteral(abstractionLevelKindEEnum, AbstractionLevelKind.SPECFICATION_LEVEL);
		addEEnumLiteral(abstractionLevelKindEEnum, AbstractionLevelKind.OPERATIONAL_LEVEL);

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
			 "originalName", "RequirementsCharacteristicsConcerns" //$NON-NLS-1$ //$NON-NLS-2$
		   });
	}

} //RequirementsCharacteristicsConcernsPackageImpl
