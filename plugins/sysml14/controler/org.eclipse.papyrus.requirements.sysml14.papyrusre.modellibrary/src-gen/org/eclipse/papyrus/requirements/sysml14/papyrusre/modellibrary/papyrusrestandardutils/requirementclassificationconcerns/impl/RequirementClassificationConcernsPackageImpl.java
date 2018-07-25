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
package org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementclassificationconcerns.impl;

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.priorityandimportanceconcerns.PriorityAndImportanceConcernsPackage;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.priorityandimportanceconcerns.impl.PriorityAndImportanceConcernsPackageImpl;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementandprocessconcerns.RequirementAndProcessConcernsPackage;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementandprocessconcerns.impl.RequirementAndProcessConcernsPackageImpl;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementclassificationconcerns.ConstraintKind;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementclassificationconcerns.QualityKind;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementclassificationconcerns.RequirementClassificationConcernsFactory;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementclassificationconcerns.RequirementClassificationConcernsPackage;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementclassificationconcerns.WorkloadCapacitiesKind;

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
public class RequirementClassificationConcernsPackageImpl extends EPackageImpl implements RequirementClassificationConcernsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum qualityKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum constraintKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum workloadCapacitiesKindEEnum = null;

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
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementclassificationconcerns.RequirementClassificationConcernsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RequirementClassificationConcernsPackageImpl() {
		super(eNS_URI, RequirementClassificationConcernsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RequirementClassificationConcernsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RequirementClassificationConcernsPackage init() {
		if (isInited) return (RequirementClassificationConcernsPackage)EPackage.Registry.INSTANCE.getEPackage(RequirementClassificationConcernsPackage.eNS_URI);

		// Obtain or create and register package
		RequirementClassificationConcernsPackageImpl theRequirementClassificationConcernsPackage = (RequirementClassificationConcernsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RequirementClassificationConcernsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RequirementClassificationConcernsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		RequirementsCharacteristicsConcernsPackageImpl theRequirementsCharacteristicsConcernsPackage = (RequirementsCharacteristicsConcernsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RequirementsCharacteristicsConcernsPackage.eNS_URI) instanceof RequirementsCharacteristicsConcernsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RequirementsCharacteristicsConcernsPackage.eNS_URI) : RequirementsCharacteristicsConcernsPackage.eINSTANCE);
		PriorityAndImportanceConcernsPackageImpl thePriorityAndImportanceConcernsPackage = (PriorityAndImportanceConcernsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PriorityAndImportanceConcernsPackage.eNS_URI) instanceof PriorityAndImportanceConcernsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PriorityAndImportanceConcernsPackage.eNS_URI) : PriorityAndImportanceConcernsPackage.eINSTANCE);
		RequirementAndProcessConcernsPackageImpl theRequirementAndProcessConcernsPackage = (RequirementAndProcessConcernsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RequirementAndProcessConcernsPackage.eNS_URI) instanceof RequirementAndProcessConcernsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RequirementAndProcessConcernsPackage.eNS_URI) : RequirementAndProcessConcernsPackage.eINSTANCE);
		VerificationAndValidationConcernsPackageImpl theVerificationAndValidationConcernsPackage = (VerificationAndValidationConcernsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VerificationAndValidationConcernsPackage.eNS_URI) instanceof VerificationAndValidationConcernsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VerificationAndValidationConcernsPackage.eNS_URI) : VerificationAndValidationConcernsPackage.eINSTANCE);

		// Create package meta-data objects
		theRequirementClassificationConcernsPackage.createPackageContents();
		theRequirementsCharacteristicsConcernsPackage.createPackageContents();
		thePriorityAndImportanceConcernsPackage.createPackageContents();
		theRequirementAndProcessConcernsPackage.createPackageContents();
		theVerificationAndValidationConcernsPackage.createPackageContents();

		// Initialize created meta-data
		theRequirementClassificationConcernsPackage.initializePackageContents();
		theRequirementsCharacteristicsConcernsPackage.initializePackageContents();
		thePriorityAndImportanceConcernsPackage.initializePackageContents();
		theRequirementAndProcessConcernsPackage.initializePackageContents();
		theVerificationAndValidationConcernsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRequirementClassificationConcernsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RequirementClassificationConcernsPackage.eNS_URI, theRequirementClassificationConcernsPackage);
		return theRequirementClassificationConcernsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getQualityKind() {
		return qualityKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConstraintKind() {
		return constraintKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWorkloadCapacitiesKind() {
		return workloadCapacitiesKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementClassificationConcernsFactory getRequirementClassificationConcernsFactory() {
		return (RequirementClassificationConcernsFactory)getEFactoryInstance();
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
		qualityKindEEnum = createEEnum(QUALITY_KIND);
		constraintKindEEnum = createEEnum(CONSTRAINT_KIND);
		workloadCapacitiesKindEEnum = createEEnum(WORKLOAD_CAPACITIES_KIND);
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
		initEEnum(qualityKindEEnum, QualityKind.class, "QualityKind"); //$NON-NLS-1$
		addEEnumLiteral(qualityKindEEnum, QualityKind.ADAPTABILITY);
		addEEnumLiteral(qualityKindEEnum, QualityKind.AVAILABILITY);
		addEEnumLiteral(qualityKindEEnum, QualityKind.COMPATABILITY);
		addEEnumLiteral(qualityKindEEnum, QualityKind.MAINTAINABILITY);
		addEEnumLiteral(qualityKindEEnum, QualityKind.PORTABILITY);
		addEEnumLiteral(qualityKindEEnum, QualityKind.RELIABILITY);
		addEEnumLiteral(qualityKindEEnum, QualityKind.SAFETY);
		addEEnumLiteral(qualityKindEEnum, QualityKind.SECURITY);
		addEEnumLiteral(qualityKindEEnum, QualityKind.USABILITY);
		addEEnumLiteral(qualityKindEEnum, QualityKind.VARIABILITY);

		initEEnum(constraintKindEEnum, ConstraintKind.class, "ConstraintKind"); //$NON-NLS-1$
		addEEnumLiteral(constraintKindEEnum, ConstraintKind.CULTURAL);
		addEEnumLiteral(constraintKindEEnum, ConstraintKind.DESIGN);
		addEEnumLiteral(constraintKindEEnum, ConstraintKind.ENVIRONMENT);
		addEEnumLiteral(constraintKindEEnum, ConstraintKind.IMPLEMENTATION);
		addEEnumLiteral(constraintKindEEnum, ConstraintKind.INTERFACE);
		addEEnumLiteral(constraintKindEEnum, ConstraintKind.PHYSICAL);
		addEEnumLiteral(constraintKindEEnum, ConstraintKind.STANDARD);
		addEEnumLiteral(constraintKindEEnum, ConstraintKind.OTHER);
		addEEnumLiteral(constraintKindEEnum, ConstraintKind.UNDEFINED);

		initEEnum(workloadCapacitiesKindEEnum, WorkloadCapacitiesKind.class, "WorkloadCapacitiesKind"); //$NON-NLS-1$
		addEEnumLiteral(workloadCapacitiesKindEEnum, WorkloadCapacitiesKind.BOUND);
		addEEnumLiteral(workloadCapacitiesKindEEnum, WorkloadCapacitiesKind.MEMORY);
		addEEnumLiteral(workloadCapacitiesKindEEnum, WorkloadCapacitiesKind.SPEED);
		addEEnumLiteral(workloadCapacitiesKindEEnum, WorkloadCapacitiesKind.THROUGHPUT);
		addEEnumLiteral(workloadCapacitiesKindEEnum, WorkloadCapacitiesKind.TIME);
		addEEnumLiteral(workloadCapacitiesKindEEnum, WorkloadCapacitiesKind.VOLUME);

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
			 "originalName", "RequirementClassificationConcerns" //$NON-NLS-1$ //$NON-NLS-2$
		   });
	}

} //RequirementClassificationConcernsPackageImpl
