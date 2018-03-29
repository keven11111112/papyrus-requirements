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
package org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementtraceability.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.RequirementClassificationPackage;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.impl.RequirementClassificationPackageImpl;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.RequirementGenericCharacteristicsPackage;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementGenericCharacteristicsPackageImpl;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementtraceability.RequirementTraceabilityFactory;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementtraceability.RequirementTraceabilityPackage;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementtraceability.Satisfy;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementtraceability.Verify;

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
public class RequirementTraceabilityPackageImpl extends EPackageImpl implements RequirementTraceabilityPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass satisfyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verifyEClass = null;

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
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementtraceability.RequirementTraceabilityPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RequirementTraceabilityPackageImpl() {
		super(eNS_URI, RequirementTraceabilityFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RequirementTraceabilityPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RequirementTraceabilityPackage init() {
		if (isInited) return (RequirementTraceabilityPackage)EPackage.Registry.INSTANCE.getEPackage(RequirementTraceabilityPackage.eNS_URI);

		// Obtain or create and register package
		RequirementTraceabilityPackageImpl theRequirementTraceabilityPackage = (RequirementTraceabilityPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RequirementTraceabilityPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RequirementTraceabilityPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		sysmlPackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		RequirementGenericCharacteristicsPackageImpl theRequirementGenericCharacteristicsPackage = (RequirementGenericCharacteristicsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RequirementGenericCharacteristicsPackage.eNS_URI) instanceof RequirementGenericCharacteristicsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RequirementGenericCharacteristicsPackage.eNS_URI) : RequirementGenericCharacteristicsPackage.eINSTANCE);
		RequirementClassificationPackageImpl theRequirementClassificationPackage = (RequirementClassificationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RequirementClassificationPackage.eNS_URI) instanceof RequirementClassificationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RequirementClassificationPackage.eNS_URI) : RequirementClassificationPackage.eINSTANCE);

		// Create package meta-data objects
		theRequirementTraceabilityPackage.createPackageContents();
		theRequirementGenericCharacteristicsPackage.createPackageContents();
		theRequirementClassificationPackage.createPackageContents();

		// Initialize created meta-data
		theRequirementTraceabilityPackage.initializePackageContents();
		theRequirementGenericCharacteristicsPackage.initializePackageContents();
		theRequirementClassificationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRequirementTraceabilityPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RequirementTraceabilityPackage.eNS_URI, theRequirementTraceabilityPackage);
		return theRequirementTraceabilityPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSatisfy() {
		return satisfyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSatisfy_ValidatorName() {
		return (EAttribute)satisfyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSatisfy_SatisfyStatus() {
		return (EAttribute)satisfyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVerify() {
		return verifyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerify_VerifierName() {
		return (EAttribute)verifyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerify_VerifyStatus() {
		return (EAttribute)verifyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerify_VV_Method() {
		return (EAttribute)verifyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementTraceabilityFactory getRequirementTraceabilityFactory() {
		return (RequirementTraceabilityFactory)getEFactoryInstance();
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
		satisfyEClass = createEClass(SATISFY);
		createEAttribute(satisfyEClass, SATISFY__VALIDATOR_NAME);
		createEAttribute(satisfyEClass, SATISFY__SATISFY_STATUS);

		verifyEClass = createEClass(VERIFY);
		createEAttribute(verifyEClass, VERIFY__VERIFIER_NAME);
		createEAttribute(verifyEClass, VERIFY__VERIFY_STATUS);
		createEAttribute(verifyEClass, VERIFY__VV_METHOD);
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
		satisfyEClass.getESuperTypes().add(theRequirementsPackage.getSatisfy());
		verifyEClass.getESuperTypes().add(theRequirementsPackage.getVerify());

		// Initialize classes, features, and operations; add parameters
		initEClass(satisfyEClass, Satisfy.class, "Satisfy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getSatisfy_ValidatorName(), theTypesPackage.getString(), "validatorName", null, 0, 1, Satisfy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getSatisfy_SatisfyStatus(), ecorePackage.getEJavaObject(), "satisfyStatus", null, 0, 1, Satisfy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(verifyEClass, Verify.class, "Verify", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getVerify_VerifierName(), theTypesPackage.getString(), "verifierName", null, 0, 1, Verify.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getVerify_VerifyStatus(), ecorePackage.getEJavaObject(), "verifyStatus", null, 0, 1, Verify.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getVerify_VV_Method(), ecorePackage.getEJavaObject(), "VV_Method", null, 0, 1, Verify.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

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
			 "originalName", "RequirementTraceability" //$NON-NLS-1$ //$NON-NLS-2$
		   });
	}

} //RequirementTraceabilityPackageImpl
