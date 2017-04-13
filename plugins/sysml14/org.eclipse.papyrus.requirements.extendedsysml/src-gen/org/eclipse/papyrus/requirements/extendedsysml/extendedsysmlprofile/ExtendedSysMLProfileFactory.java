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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.requirements.extendedsysml.extendedsysmlprofile.ExtendedSysMLProfilePackage
 * @generated
 */
public interface ExtendedSysMLProfileFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExtendedSysMLProfileFactory eINSTANCE = org.eclipse.papyrus.requirements.extendedsysml.extendedsysmlprofile.impl.ExtendedSysMLProfileFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Requirements Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requirements Package</em>'.
	 * @generated
	 */
	RequirementsPackage createRequirementsPackage();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ExtendedSysMLProfilePackage getExtendedSysMLProfilePackage();

} //ExtendedSysMLProfileFactory
