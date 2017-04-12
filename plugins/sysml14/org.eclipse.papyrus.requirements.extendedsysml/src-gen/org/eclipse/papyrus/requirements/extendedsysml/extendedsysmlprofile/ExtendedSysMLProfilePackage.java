/**
 * Copyright (c) 2017 CEA LIST.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  
 *  	Mauricio Alferez (mauricio.alferez@cea.fr) CEA LIST - Initial API and implementation
 * 
 */
package org.eclipse.papyrus.requirements.extendedsysml.extendedsysmlprofile;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.eclipse.papyrus.requirements.extendedsysml.extendedsysmlprofile.ExtendedSysMLProfileFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ExtendedSysMLProfile'"
 * @generated
 */
public interface ExtendedSysMLProfilePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "extendedsysmlprofile";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://www.eclipse.org/papyrus/requirements/sysml14/extendedsysml/ExtendedSysMLProfile";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ExtendedSysMLProfile";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExtendedSysMLProfilePackage eINSTANCE = org.eclipse.papyrus.requirements.extendedsysml.extendedsysmlprofile.impl.ExtendedSysMLProfilePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.requirements.extendedsysml.extendedsysmlprofile.impl.RequirementsPackageImpl <em>Requirements Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.requirements.extendedsysml.extendedsysmlprofile.impl.RequirementsPackageImpl
	 * @see org.eclipse.papyrus.requirements.extendedsysml.extendedsysmlprofile.impl.ExtendedSysMLProfilePackageImpl#getRequirementsPackage()
	 * @generated
	 */
	int REQUIREMENTS_PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_PACKAGE__BASE_PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_PACKAGE__ALIAS = 1;

	/**
	 * The feature id for the '<em><b>Id Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_PACKAGE__ID_DEPTH = 2;

	/**
	 * The number of structural features of the '<em>Requirements Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_PACKAGE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Requirements Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_PACKAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.requirements.extendedsysml.extendedsysmlprofile.Depth <em>Depth</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.requirements.extendedsysml.extendedsysmlprofile.Depth
	 * @see org.eclipse.papyrus.requirements.extendedsysml.extendedsysmlprofile.impl.ExtendedSysMLProfilePackageImpl#getDepth()
	 * @generated
	 */
	int DEPTH = 1;


	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.requirements.extendedsysml.extendedsysmlprofile.RequirementsPackage <em>Requirements Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirements Package</em>'.
	 * @see org.eclipse.papyrus.requirements.extendedsysml.extendedsysmlprofile.RequirementsPackage
	 * @generated
	 */
	EClass getRequirementsPackage();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.requirements.extendedsysml.extendedsysmlprofile.RequirementsPackage#getBase_Package <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Package</em>'.
	 * @see org.eclipse.papyrus.requirements.extendedsysml.extendedsysmlprofile.RequirementsPackage#getBase_Package()
	 * @see #getRequirementsPackage()
	 * @generated
	 */
	EReference getRequirementsPackage_Base_Package();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.requirements.extendedsysml.extendedsysmlprofile.RequirementsPackage#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see org.eclipse.papyrus.requirements.extendedsysml.extendedsysmlprofile.RequirementsPackage#getAlias()
	 * @see #getRequirementsPackage()
	 * @generated
	 */
	EAttribute getRequirementsPackage_Alias();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.requirements.extendedsysml.extendedsysmlprofile.RequirementsPackage#getIdDepth <em>Id Depth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Depth</em>'.
	 * @see org.eclipse.papyrus.requirements.extendedsysml.extendedsysmlprofile.RequirementsPackage#getIdDepth()
	 * @see #getRequirementsPackage()
	 * @generated
	 */
	EAttribute getRequirementsPackage_IdDepth();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.requirements.extendedsysml.extendedsysmlprofile.Depth <em>Depth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Depth</em>'.
	 * @see org.eclipse.papyrus.requirements.extendedsysml.extendedsysmlprofile.Depth
	 * @generated
	 */
	EEnum getDepth();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExtendedSysMLProfileFactory getExtendedSysMLProfileFactory();

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
		 * The meta object literal for the '{@link org.eclipse.papyrus.requirements.extendedsysml.extendedsysmlprofile.impl.RequirementsPackageImpl <em>Requirements Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.requirements.extendedsysml.extendedsysmlprofile.impl.RequirementsPackageImpl
		 * @see org.eclipse.papyrus.requirements.extendedsysml.extendedsysmlprofile.impl.ExtendedSysMLProfilePackageImpl#getRequirementsPackage()
		 * @generated
		 */
		EClass REQUIREMENTS_PACKAGE = eINSTANCE.getRequirementsPackage();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENTS_PACKAGE__BASE_PACKAGE = eINSTANCE.getRequirementsPackage_Base_Package();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENTS_PACKAGE__ALIAS = eINSTANCE.getRequirementsPackage_Alias();

		/**
		 * The meta object literal for the '<em><b>Id Depth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENTS_PACKAGE__ID_DEPTH = eINSTANCE.getRequirementsPackage_IdDepth();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.requirements.extendedsysml.extendedsysmlprofile.Depth <em>Depth</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.requirements.extendedsysml.extendedsysmlprofile.Depth
		 * @see org.eclipse.papyrus.requirements.extendedsysml.extendedsysmlprofile.impl.ExtendedSysMLProfilePackageImpl#getDepth()
		 * @generated
		 */
		EEnum DEPTH = eINSTANCE.getDepth();

	}

} //ExtendedSysMLProfilePackage
