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

import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.ConstraintRequirement;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.ProcessRequirement;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.ProjectRequirement;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.QualityRequirement;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.RequirementClassificationFactory;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.RequirementClassificationPackage;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.WorkloadCapacityRequirement;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.RequirementGenericCharacteristicsPackage;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementGenericCharacteristicsPackageImpl;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementtraceability.RequirementTraceabilityPackage;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementtraceability.impl.RequirementTraceabilityPackageImpl;

import org.eclipse.papyrus.sysml14.sysmlPackage;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RequirementClassificationPackageImpl extends EPackageImpl implements RequirementClassificationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workloadCapacityRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualityRequirementEClass = null;

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
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.RequirementClassificationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RequirementClassificationPackageImpl() {
		super(eNS_URI, RequirementClassificationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RequirementClassificationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RequirementClassificationPackage init() {
		if (isInited) return (RequirementClassificationPackage)EPackage.Registry.INSTANCE.getEPackage(RequirementClassificationPackage.eNS_URI);

		// Obtain or create and register package
		RequirementClassificationPackageImpl theRequirementClassificationPackage = (RequirementClassificationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RequirementClassificationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RequirementClassificationPackageImpl());

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
		RequirementGenericCharacteristicsPackageImpl theRequirementGenericCharacteristicsPackage = (RequirementGenericCharacteristicsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RequirementGenericCharacteristicsPackage.eNS_URI) instanceof RequirementGenericCharacteristicsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RequirementGenericCharacteristicsPackage.eNS_URI) : RequirementGenericCharacteristicsPackage.eINSTANCE);
		RequirementTraceabilityPackageImpl theRequirementTraceabilityPackage = (RequirementTraceabilityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RequirementTraceabilityPackage.eNS_URI) instanceof RequirementTraceabilityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RequirementTraceabilityPackage.eNS_URI) : RequirementTraceabilityPackage.eINSTANCE);

		// Create package meta-data objects
		theRequirementClassificationPackage.createPackageContents();
		thePapyrusREPackage.createPackageContents();
		theRequirementGenericCharacteristicsPackage.createPackageContents();
		theRequirementTraceabilityPackage.createPackageContents();

		// Initialize created meta-data
		theRequirementClassificationPackage.initializePackageContents();
		thePapyrusREPackage.initializePackageContents();
		theRequirementGenericCharacteristicsPackage.initializePackageContents();
		theRequirementTraceabilityPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRequirementClassificationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RequirementClassificationPackage.eNS_URI, theRequirementClassificationPackage);
		return theRequirementClassificationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProjectRequirement() {
		return projectRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessRequirement() {
		return processRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraintRequirement() {
		return constraintRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraintRequirement_ConstraintKind() {
		return (EAttribute)constraintRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkloadCapacityRequirement() {
		return workloadCapacityRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkloadCapacityRequirement_WorkloadCapacity() {
		return (EAttribute)workloadCapacityRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQualityRequirement() {
		return qualityRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQualityRequirement_SpecificQualityKind() {
		return (EAttribute)qualityRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementClassificationFactory getRequirementClassificationFactory() {
		return (RequirementClassificationFactory)getEFactoryInstance();
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
		projectRequirementEClass = createEClass(PROJECT_REQUIREMENT);

		processRequirementEClass = createEClass(PROCESS_REQUIREMENT);

		constraintRequirementEClass = createEClass(CONSTRAINT_REQUIREMENT);
		createEAttribute(constraintRequirementEClass, CONSTRAINT_REQUIREMENT__CONSTRAINT_KIND);

		workloadCapacityRequirementEClass = createEClass(WORKLOAD_CAPACITY_REQUIREMENT);
		createEAttribute(workloadCapacityRequirementEClass, WORKLOAD_CAPACITY_REQUIREMENT__WORKLOAD_CAPACITY);

		qualityRequirementEClass = createEClass(QUALITY_REQUIREMENT);
		createEAttribute(qualityRequirementEClass, QUALITY_REQUIREMENT__SPECIFIC_QUALITY_KIND);
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
		RequirementGenericCharacteristicsPackage theRequirementGenericCharacteristicsPackage = (RequirementGenericCharacteristicsPackage)EPackage.Registry.INSTANCE.getEPackage(RequirementGenericCharacteristicsPackage.eNS_URI);
		RequirementClassificationConcernsPackage theRequirementClassificationConcernsPackage = (RequirementClassificationConcernsPackage)EPackage.Registry.INSTANCE.getEPackage(RequirementClassificationConcernsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		projectRequirementEClass.getESuperTypes().add(theRequirementGenericCharacteristicsPackage.getRequirement());
		processRequirementEClass.getESuperTypes().add(theRequirementGenericCharacteristicsPackage.getRequirement());
		constraintRequirementEClass.getESuperTypes().add(theRequirementGenericCharacteristicsPackage.getRequirement());
		workloadCapacityRequirementEClass.getESuperTypes().add(theRequirementGenericCharacteristicsPackage.getRequirement());
		qualityRequirementEClass.getESuperTypes().add(theRequirementGenericCharacteristicsPackage.getRequirement());

		// Initialize classes, features, and operations; add parameters
		initEClass(projectRequirementEClass, ProjectRequirement.class, "ProjectRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(processRequirementEClass, ProcessRequirement.class, "ProcessRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(constraintRequirementEClass, ConstraintRequirement.class, "ConstraintRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getConstraintRequirement_ConstraintKind(), theRequirementClassificationConcernsPackage.getConstraintKind(), "constraintKind", null, 1, 1, ConstraintRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(workloadCapacityRequirementEClass, WorkloadCapacityRequirement.class, "WorkloadCapacityRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getWorkloadCapacityRequirement_WorkloadCapacity(), theRequirementClassificationConcernsPackage.getWorkloadCapacitiesKind(), "workloadCapacity", null, 1, 1, WorkloadCapacityRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(qualityRequirementEClass, QualityRequirement.class, "QualityRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getQualityRequirement_SpecificQualityKind(), theRequirementClassificationConcernsPackage.getQualityKind(), "specificQualityKind", null, 1, 1, QualityRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

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
			 "originalName", "RequirementClassification" //$NON-NLS-1$ //$NON-NLS-2$
		   });
	}

} //RequirementClassificationPackageImpl
