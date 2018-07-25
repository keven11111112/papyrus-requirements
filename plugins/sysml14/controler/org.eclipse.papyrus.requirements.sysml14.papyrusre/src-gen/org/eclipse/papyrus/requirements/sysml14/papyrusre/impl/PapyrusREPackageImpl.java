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
package org.eclipse.papyrus.requirements.sysml14.papyrusre.impl;

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.Dummy;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.PapyrusREFactory;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.PapyrusREPackage;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.priorityandimportanceconcerns.PriorityAndImportanceConcernsPackage;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementandprocessconcerns.RequirementAndProcessConcernsPackage;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementclassificationconcerns.RequirementClassificationConcernsPackage;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementscharacteristicsconcerns.RequirementsCharacteristicsConcernsPackage;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.verificationandvalidationconcerns.VerificationAndValidationConcernsPackage;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.RequirementClassificationPackage;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.impl.RequirementClassificationPackageImpl;

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
public class PapyrusREPackageImpl extends EPackageImpl implements PapyrusREPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dummyEEnum = null;

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
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.PapyrusREPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PapyrusREPackageImpl() {
		super(eNS_URI, PapyrusREFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PapyrusREPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PapyrusREPackage init() {
		if (isInited) return (PapyrusREPackage)EPackage.Registry.INSTANCE.getEPackage(PapyrusREPackage.eNS_URI);

		// Obtain or create and register package
		PapyrusREPackageImpl thePapyrusREPackage = (PapyrusREPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PapyrusREPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PapyrusREPackageImpl());

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
		RequirementGenericCharacteristicsPackageImpl theRequirementGenericCharacteristicsPackage = (RequirementGenericCharacteristicsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RequirementGenericCharacteristicsPackage.eNS_URI) instanceof RequirementGenericCharacteristicsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RequirementGenericCharacteristicsPackage.eNS_URI) : RequirementGenericCharacteristicsPackage.eINSTANCE);
		RequirementClassificationPackageImpl theRequirementClassificationPackage = (RequirementClassificationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RequirementClassificationPackage.eNS_URI) instanceof RequirementClassificationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RequirementClassificationPackage.eNS_URI) : RequirementClassificationPackage.eINSTANCE);
		RequirementTraceabilityPackageImpl theRequirementTraceabilityPackage = (RequirementTraceabilityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RequirementTraceabilityPackage.eNS_URI) instanceof RequirementTraceabilityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RequirementTraceabilityPackage.eNS_URI) : RequirementTraceabilityPackage.eINSTANCE);

		// Create package meta-data objects
		thePapyrusREPackage.createPackageContents();
		theRequirementGenericCharacteristicsPackage.createPackageContents();
		theRequirementClassificationPackage.createPackageContents();
		theRequirementTraceabilityPackage.createPackageContents();

		// Initialize created meta-data
		thePapyrusREPackage.initializePackageContents();
		theRequirementGenericCharacteristicsPackage.initializePackageContents();
		theRequirementClassificationPackage.initializePackageContents();
		theRequirementTraceabilityPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePapyrusREPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PapyrusREPackage.eNS_URI, thePapyrusREPackage);
		return thePapyrusREPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDummy() {
		return dummyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PapyrusREFactory getPapyrusREFactory() {
		return (PapyrusREFactory)getEFactoryInstance();
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
		dummyEEnum = createEEnum(DUMMY);
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
		RequirementClassificationPackage theRequirementClassificationPackage = (RequirementClassificationPackage)EPackage.Registry.INSTANCE.getEPackage(RequirementClassificationPackage.eNS_URI);
		RequirementTraceabilityPackage theRequirementTraceabilityPackage = (RequirementTraceabilityPackage)EPackage.Registry.INSTANCE.getEPackage(RequirementTraceabilityPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theRequirementGenericCharacteristicsPackage);
		getESubpackages().add(theRequirementClassificationPackage);
		getESubpackages().add(theRequirementTraceabilityPackage);

		// Initialize enums and add enum literals
		initEEnum(dummyEEnum, Dummy.class, "Dummy"); //$NON-NLS-1$

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
			 "originalName", "PapyrusRE" //$NON-NLS-1$ //$NON-NLS-2$
		   });
	}

} //PapyrusREPackageImpl
