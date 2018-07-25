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
package org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementtraceability;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.papyrus.sysml14.requirements.RequirementsPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementtraceability.RequirementTraceabilityFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='RequirementTraceability'"
 * @generated
 */
public interface RequirementTraceabilityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "requirementtraceability"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/papyrus/requirements/sysml14/0.7.0/PapyrusRE/RequirementTraceability"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "RequirementTraceability"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RequirementTraceabilityPackage eINSTANCE = org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementtraceability.impl.RequirementTraceabilityPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementtraceability.impl.SatisfyImpl <em>Satisfy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementtraceability.impl.SatisfyImpl
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementtraceability.impl.RequirementTraceabilityPackageImpl#getSatisfy()
	 * @generated
	 */
	int SATISFY = 0;

	/**
	 * The feature id for the '<em><b>Base Directed Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFY__BASE_DIRECTED_RELATIONSHIP = RequirementsPackage.SATISFY__BASE_DIRECTED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Source Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFY__SOURCE_CONTEXT = RequirementsPackage.SATISFY__SOURCE_CONTEXT;

	/**
	 * The feature id for the '<em><b>Source Property Path</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFY__SOURCE_PROPERTY_PATH = RequirementsPackage.SATISFY__SOURCE_PROPERTY_PATH;

	/**
	 * The feature id for the '<em><b>Target Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFY__TARGET_CONTEXT = RequirementsPackage.SATISFY__TARGET_CONTEXT;

	/**
	 * The feature id for the '<em><b>Target Property Path</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFY__TARGET_PROPERTY_PATH = RequirementsPackage.SATISFY__TARGET_PROPERTY_PATH;

	/**
	 * The feature id for the '<em><b>Base Abstraction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFY__BASE_ABSTRACTION = RequirementsPackage.SATISFY__BASE_ABSTRACTION;

	/**
	 * The feature id for the '<em><b>Validator Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFY__VALIDATOR_NAME = RequirementsPackage.SATISFY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Satisfy Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFY__SATISFY_STATUS = RequirementsPackage.SATISFY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Satisfy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFY_FEATURE_COUNT = RequirementsPackage.SATISFY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Traced From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFY___GET_TRACED_FROM__NAMEDELEMENT_ELIST = RequirementsPackage.SATISFY___GET_TRACED_FROM__NAMEDELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Get Satisfies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFY___GET_SATISFIES__NAMEDELEMENT_ELIST = RequirementsPackage.SATISFY___GET_SATISFIES__NAMEDELEMENT_ELIST;

	/**
	 * The number of operations of the '<em>Satisfy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFY_OPERATION_COUNT = RequirementsPackage.SATISFY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementtraceability.impl.VerifyImpl <em>Verify</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementtraceability.impl.VerifyImpl
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementtraceability.impl.RequirementTraceabilityPackageImpl#getVerify()
	 * @generated
	 */
	int VERIFY = 1;

	/**
	 * The feature id for the '<em><b>Base Directed Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFY__BASE_DIRECTED_RELATIONSHIP = RequirementsPackage.VERIFY__BASE_DIRECTED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Source Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFY__SOURCE_CONTEXT = RequirementsPackage.VERIFY__SOURCE_CONTEXT;

	/**
	 * The feature id for the '<em><b>Source Property Path</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFY__SOURCE_PROPERTY_PATH = RequirementsPackage.VERIFY__SOURCE_PROPERTY_PATH;

	/**
	 * The feature id for the '<em><b>Target Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFY__TARGET_CONTEXT = RequirementsPackage.VERIFY__TARGET_CONTEXT;

	/**
	 * The feature id for the '<em><b>Target Property Path</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFY__TARGET_PROPERTY_PATH = RequirementsPackage.VERIFY__TARGET_PROPERTY_PATH;

	/**
	 * The feature id for the '<em><b>Base Abstraction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFY__BASE_ABSTRACTION = RequirementsPackage.VERIFY__BASE_ABSTRACTION;

	/**
	 * The feature id for the '<em><b>Verifier Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFY__VERIFIER_NAME = RequirementsPackage.VERIFY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Verify Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFY__VERIFY_STATUS = RequirementsPackage.VERIFY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>VV Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFY__VV_METHOD = RequirementsPackage.VERIFY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Verify</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFY_FEATURE_COUNT = RequirementsPackage.VERIFY_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Traced From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFY___GET_TRACED_FROM__NAMEDELEMENT_ELIST = RequirementsPackage.VERIFY___GET_TRACED_FROM__NAMEDELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Get Verifies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFY___GET_VERIFIES__NAMEDELEMENT_ELIST = RequirementsPackage.VERIFY___GET_VERIFIES__NAMEDELEMENT_ELIST;

	/**
	 * The number of operations of the '<em>Verify</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFY_OPERATION_COUNT = RequirementsPackage.VERIFY_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementtraceability.Satisfy <em>Satisfy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Satisfy</em>'.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementtraceability.Satisfy
	 * @generated
	 */
	EClass getSatisfy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementtraceability.Satisfy#getValidatorName <em>Validator Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validator Name</em>'.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementtraceability.Satisfy#getValidatorName()
	 * @see #getSatisfy()
	 * @generated
	 */
	EAttribute getSatisfy_ValidatorName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementtraceability.Satisfy#getSatisfyStatus <em>Satisfy Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Satisfy Status</em>'.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementtraceability.Satisfy#getSatisfyStatus()
	 * @see #getSatisfy()
	 * @generated
	 */
	EAttribute getSatisfy_SatisfyStatus();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementtraceability.Verify <em>Verify</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verify</em>'.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementtraceability.Verify
	 * @generated
	 */
	EClass getVerify();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementtraceability.Verify#getVerifierName <em>Verifier Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Verifier Name</em>'.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementtraceability.Verify#getVerifierName()
	 * @see #getVerify()
	 * @generated
	 */
	EAttribute getVerify_VerifierName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementtraceability.Verify#getVerifyStatus <em>Verify Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Verify Status</em>'.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementtraceability.Verify#getVerifyStatus()
	 * @see #getVerify()
	 * @generated
	 */
	EAttribute getVerify_VerifyStatus();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementtraceability.Verify#getVV_Method <em>VV Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>VV Method</em>'.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementtraceability.Verify#getVV_Method()
	 * @see #getVerify()
	 * @generated
	 */
	EAttribute getVerify_VV_Method();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RequirementTraceabilityFactory getRequirementTraceabilityFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementtraceability.impl.SatisfyImpl <em>Satisfy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementtraceability.impl.SatisfyImpl
		 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementtraceability.impl.RequirementTraceabilityPackageImpl#getSatisfy()
		 * @generated
		 */
		EClass SATISFY = eINSTANCE.getSatisfy();

		/**
		 * The meta object literal for the '<em><b>Validator Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SATISFY__VALIDATOR_NAME = eINSTANCE.getSatisfy_ValidatorName();

		/**
		 * The meta object literal for the '<em><b>Satisfy Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SATISFY__SATISFY_STATUS = eINSTANCE.getSatisfy_SatisfyStatus();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementtraceability.impl.VerifyImpl <em>Verify</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementtraceability.impl.VerifyImpl
		 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementtraceability.impl.RequirementTraceabilityPackageImpl#getVerify()
		 * @generated
		 */
		EClass VERIFY = eINSTANCE.getVerify();

		/**
		 * The meta object literal for the '<em><b>Verifier Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERIFY__VERIFIER_NAME = eINSTANCE.getVerify_VerifierName();

		/**
		 * The meta object literal for the '<em><b>Verify Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERIFY__VERIFY_STATUS = eINSTANCE.getVerify_VerifyStatus();

		/**
		 * The meta object literal for the '<em><b>VV Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERIFY__VV_METHOD = eINSTANCE.getVerify_VV_Method();

	}

} //RequirementTraceabilityPackage
