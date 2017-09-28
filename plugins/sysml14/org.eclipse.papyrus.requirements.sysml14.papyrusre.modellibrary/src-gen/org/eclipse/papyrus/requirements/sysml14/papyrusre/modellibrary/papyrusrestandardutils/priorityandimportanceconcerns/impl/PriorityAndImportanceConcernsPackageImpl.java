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
package org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.priorityandimportanceconcerns.impl;

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.priorityandimportanceconcerns.ImportanceKind;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.priorityandimportanceconcerns.PriorityAndImportanceConcernsFactory;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.priorityandimportanceconcerns.PriorityAndImportanceConcernsPackage;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.priorityandimportanceconcerns.PriorityKind;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementandprocessconcerns.RequirementAndProcessConcernsPackage;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementandprocessconcerns.impl.RequirementAndProcessConcernsPackageImpl;

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
public class PriorityAndImportanceConcernsPackageImpl extends EPackageImpl implements PriorityAndImportanceConcernsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum priorityKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum importanceKindEEnum = null;

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
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.priorityandimportanceconcerns.PriorityAndImportanceConcernsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PriorityAndImportanceConcernsPackageImpl() {
		super(eNS_URI, PriorityAndImportanceConcernsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PriorityAndImportanceConcernsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PriorityAndImportanceConcernsPackage init() {
		if (isInited) return (PriorityAndImportanceConcernsPackage)EPackage.Registry.INSTANCE.getEPackage(PriorityAndImportanceConcernsPackage.eNS_URI);

		// Obtain or create and register package
		PriorityAndImportanceConcernsPackageImpl thePriorityAndImportanceConcernsPackage = (PriorityAndImportanceConcernsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PriorityAndImportanceConcernsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PriorityAndImportanceConcernsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		RequirementClassificationConcernsPackageImpl theRequirementClassificationConcernsPackage = (RequirementClassificationConcernsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RequirementClassificationConcernsPackage.eNS_URI) instanceof RequirementClassificationConcernsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RequirementClassificationConcernsPackage.eNS_URI) : RequirementClassificationConcernsPackage.eINSTANCE);
		RequirementsCharacteristicsConcernsPackageImpl theRequirementsCharacteristicsConcernsPackage = (RequirementsCharacteristicsConcernsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RequirementsCharacteristicsConcernsPackage.eNS_URI) instanceof RequirementsCharacteristicsConcernsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RequirementsCharacteristicsConcernsPackage.eNS_URI) : RequirementsCharacteristicsConcernsPackage.eINSTANCE);
		RequirementAndProcessConcernsPackageImpl theRequirementAndProcessConcernsPackage = (RequirementAndProcessConcernsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RequirementAndProcessConcernsPackage.eNS_URI) instanceof RequirementAndProcessConcernsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RequirementAndProcessConcernsPackage.eNS_URI) : RequirementAndProcessConcernsPackage.eINSTANCE);
		VerificationAndValidationConcernsPackageImpl theVerificationAndValidationConcernsPackage = (VerificationAndValidationConcernsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VerificationAndValidationConcernsPackage.eNS_URI) instanceof VerificationAndValidationConcernsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VerificationAndValidationConcernsPackage.eNS_URI) : VerificationAndValidationConcernsPackage.eINSTANCE);

		// Create package meta-data objects
		thePriorityAndImportanceConcernsPackage.createPackageContents();
		theRequirementClassificationConcernsPackage.createPackageContents();
		theRequirementsCharacteristicsConcernsPackage.createPackageContents();
		theRequirementAndProcessConcernsPackage.createPackageContents();
		theVerificationAndValidationConcernsPackage.createPackageContents();

		// Initialize created meta-data
		thePriorityAndImportanceConcernsPackage.initializePackageContents();
		theRequirementClassificationConcernsPackage.initializePackageContents();
		theRequirementsCharacteristicsConcernsPackage.initializePackageContents();
		theRequirementAndProcessConcernsPackage.initializePackageContents();
		theVerificationAndValidationConcernsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePriorityAndImportanceConcernsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PriorityAndImportanceConcernsPackage.eNS_URI, thePriorityAndImportanceConcernsPackage);
		return thePriorityAndImportanceConcernsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPriorityKind() {
		return priorityKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getImportanceKind() {
		return importanceKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PriorityAndImportanceConcernsFactory getPriorityAndImportanceConcernsFactory() {
		return (PriorityAndImportanceConcernsFactory)getEFactoryInstance();
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
		priorityKindEEnum = createEEnum(PRIORITY_KIND);
		importanceKindEEnum = createEEnum(IMPORTANCE_KIND);
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
		initEEnum(priorityKindEEnum, PriorityKind.class, "PriorityKind"); //$NON-NLS-1$
		addEEnumLiteral(priorityKindEEnum, PriorityKind.KEY);
		addEEnumLiteral(priorityKindEEnum, PriorityKind.MANDATORY);
		addEEnumLiteral(priorityKindEEnum, PriorityKind.OPTIONAL);
		addEEnumLiteral(priorityKindEEnum, PriorityKind.DESIRABLE);

		initEEnum(importanceKindEEnum, ImportanceKind.class, "ImportanceKind"); //$NON-NLS-1$
		addEEnumLiteral(importanceKindEEnum, ImportanceKind.IMPORTANCE1);
		addEEnumLiteral(importanceKindEEnum, ImportanceKind.IMPORTANCE2);
		addEEnumLiteral(importanceKindEEnum, ImportanceKind.IMPORTANCE3);
		addEEnumLiteral(importanceKindEEnum, ImportanceKind.IMPORTANCE4);
		addEEnumLiteral(importanceKindEEnum, ImportanceKind.IMPORTANCE5);
		addEEnumLiteral(importanceKindEEnum, ImportanceKind.IMPORTANCE6);
		addEEnumLiteral(importanceKindEEnum, ImportanceKind.IMPORTANCE7);
		addEEnumLiteral(importanceKindEEnum, ImportanceKind.IMPORTANCE8);
		addEEnumLiteral(importanceKindEEnum, ImportanceKind.IMPORTANCE9);
		addEEnumLiteral(importanceKindEEnum, ImportanceKind.IMPORTANCE10);

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
			 "originalName", "PriorityAndImportanceConcerns" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (importanceKindEEnum.getELiterals().get(0), 
		   source, 
		   new String[] {
			 "originalName", "_1" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (importanceKindEEnum.getELiterals().get(1), 
		   source, 
		   new String[] {
			 "originalName", "_2" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (importanceKindEEnum.getELiterals().get(2), 
		   source, 
		   new String[] {
			 "originalName", "_3" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (importanceKindEEnum.getELiterals().get(3), 
		   source, 
		   new String[] {
			 "originalName", "_4" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (importanceKindEEnum.getELiterals().get(4), 
		   source, 
		   new String[] {
			 "originalName", "_5" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (importanceKindEEnum.getELiterals().get(5), 
		   source, 
		   new String[] {
			 "originalName", "_6" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (importanceKindEEnum.getELiterals().get(6), 
		   source, 
		   new String[] {
			 "originalName", "_7" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (importanceKindEEnum.getELiterals().get(7), 
		   source, 
		   new String[] {
			 "originalName", "_8" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (importanceKindEEnum.getELiterals().get(8), 
		   source, 
		   new String[] {
			 "originalName", "_9" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (importanceKindEEnum.getELiterals().get(9), 
		   source, 
		   new String[] {
			 "originalName", "_10" //$NON-NLS-1$ //$NON-NLS-2$
		   });
	}

} //PriorityAndImportanceConcernsPackageImpl
