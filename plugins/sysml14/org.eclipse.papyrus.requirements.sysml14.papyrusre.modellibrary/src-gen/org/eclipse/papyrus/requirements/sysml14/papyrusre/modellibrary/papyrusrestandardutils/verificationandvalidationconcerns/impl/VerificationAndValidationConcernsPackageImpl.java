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
package org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.verificationandvalidationconcerns.impl;

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.priorityandimportanceconcerns.PriorityAndImportanceConcernsPackage;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.priorityandimportanceconcerns.impl.PriorityAndImportanceConcernsPackageImpl;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementandprocessconcerns.RequirementAndProcessConcernsPackage;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementandprocessconcerns.impl.RequirementAndProcessConcernsPackageImpl;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementclassificationconcerns.RequirementClassificationConcernsPackage;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementclassificationconcerns.impl.RequirementClassificationConcernsPackageImpl;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementscharacteristicsconcerns.RequirementsCharacteristicsConcernsPackage;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementscharacteristicsconcerns.impl.RequirementsCharacteristicsConcernsPackageImpl;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.verificationandvalidationconcerns.VV_MethodKind;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.verificationandvalidationconcerns.VV_StatusKind;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.verificationandvalidationconcerns.VerificationAndValidationConcernsFactory;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.verificationandvalidationconcerns.VerificationAndValidationConcernsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VerificationAndValidationConcernsPackageImpl extends EPackageImpl implements VerificationAndValidationConcernsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum vV_MethodKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum vV_StatusKindEEnum = null;

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
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.verificationandvalidationconcerns.VerificationAndValidationConcernsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VerificationAndValidationConcernsPackageImpl() {
		super(eNS_URI, VerificationAndValidationConcernsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link VerificationAndValidationConcernsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static VerificationAndValidationConcernsPackage init() {
		if (isInited) return (VerificationAndValidationConcernsPackage)EPackage.Registry.INSTANCE.getEPackage(VerificationAndValidationConcernsPackage.eNS_URI);

		// Obtain or create and register package
		VerificationAndValidationConcernsPackageImpl theVerificationAndValidationConcernsPackage = (VerificationAndValidationConcernsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof VerificationAndValidationConcernsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new VerificationAndValidationConcernsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		RequirementClassificationConcernsPackageImpl theRequirementClassificationConcernsPackage = (RequirementClassificationConcernsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RequirementClassificationConcernsPackage.eNS_URI) instanceof RequirementClassificationConcernsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RequirementClassificationConcernsPackage.eNS_URI) : RequirementClassificationConcernsPackage.eINSTANCE);
		RequirementsCharacteristicsConcernsPackageImpl theRequirementsCharacteristicsConcernsPackage = (RequirementsCharacteristicsConcernsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RequirementsCharacteristicsConcernsPackage.eNS_URI) instanceof RequirementsCharacteristicsConcernsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RequirementsCharacteristicsConcernsPackage.eNS_URI) : RequirementsCharacteristicsConcernsPackage.eINSTANCE);
		PriorityAndImportanceConcernsPackageImpl thePriorityAndImportanceConcernsPackage = (PriorityAndImportanceConcernsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PriorityAndImportanceConcernsPackage.eNS_URI) instanceof PriorityAndImportanceConcernsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PriorityAndImportanceConcernsPackage.eNS_URI) : PriorityAndImportanceConcernsPackage.eINSTANCE);
		RequirementAndProcessConcernsPackageImpl theRequirementAndProcessConcernsPackage = (RequirementAndProcessConcernsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RequirementAndProcessConcernsPackage.eNS_URI) instanceof RequirementAndProcessConcernsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RequirementAndProcessConcernsPackage.eNS_URI) : RequirementAndProcessConcernsPackage.eINSTANCE);

		// Create package meta-data objects
		theVerificationAndValidationConcernsPackage.createPackageContents();
		theRequirementClassificationConcernsPackage.createPackageContents();
		theRequirementsCharacteristicsConcernsPackage.createPackageContents();
		thePriorityAndImportanceConcernsPackage.createPackageContents();
		theRequirementAndProcessConcernsPackage.createPackageContents();

		// Initialize created meta-data
		theVerificationAndValidationConcernsPackage.initializePackageContents();
		theRequirementClassificationConcernsPackage.initializePackageContents();
		theRequirementsCharacteristicsConcernsPackage.initializePackageContents();
		thePriorityAndImportanceConcernsPackage.initializePackageContents();
		theRequirementAndProcessConcernsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theVerificationAndValidationConcernsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(VerificationAndValidationConcernsPackage.eNS_URI, theVerificationAndValidationConcernsPackage);
		return theVerificationAndValidationConcernsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVV_MethodKind() {
		return vV_MethodKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVV_StatusKind() {
		return vV_StatusKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerificationAndValidationConcernsFactory getVerificationAndValidationConcernsFactory() {
		return (VerificationAndValidationConcernsFactory)getEFactoryInstance();
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
		vV_MethodKindEEnum = createEEnum(VV_METHOD_KIND);
		vV_StatusKindEEnum = createEEnum(VV_STATUS_KIND);
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
		initEEnum(vV_MethodKindEEnum, VV_MethodKind.class, "VV_MethodKind"); //$NON-NLS-1$
		addEEnumLiteral(vV_MethodKindEEnum, VV_MethodKind.ANALYSIS);
		addEEnumLiteral(vV_MethodKindEEnum, VV_MethodKind.INSPECTION);
		addEEnumLiteral(vV_MethodKindEEnum, VV_MethodKind.SYSTEM_TEST);
		addEEnumLiteral(vV_MethodKindEEnum, VV_MethodKind.COMPONENT_TEST);

		initEEnum(vV_StatusKindEEnum, VV_StatusKind.class, "VV_StatusKind"); //$NON-NLS-1$
		addEEnumLiteral(vV_StatusKindEEnum, VV_StatusKind.PENDING);
		addEEnumLiteral(vV_StatusKindEEnum, VV_StatusKind.PASSED);
		addEEnumLiteral(vV_StatusKindEEnum, VV_StatusKind.FAILED);
		addEEnumLiteral(vV_StatusKindEEnum, VV_StatusKind.INCONCLUSIVE);

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
			 "originalName", "VerificationAndValidationConcerns" //$NON-NLS-1$ //$NON-NLS-2$
		   });
	}

} //VerificationAndValidationConcernsPackageImpl
