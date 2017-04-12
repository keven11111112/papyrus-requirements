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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirements Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.requirements.extendedsysml.extendedsysmlprofile.RequirementsPackage#getBase_Package <em>Base Package</em>}</li>
 *   <li>{@link org.eclipse.papyrus.requirements.extendedsysml.extendedsysmlprofile.RequirementsPackage#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.eclipse.papyrus.requirements.extendedsysml.extendedsysmlprofile.RequirementsPackage#getIdDepth <em>Id Depth</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.requirements.extendedsysml.extendedsysmlprofile.ExtendedSysMLProfilePackage#getRequirementsPackage()
 * @model
 * @generated
 */
public interface RequirementsPackage extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Package</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Package</em>' reference.
	 * @see #setBase_Package(org.eclipse.uml2.uml.Package)
	 * @see org.eclipse.papyrus.requirements.extendedsysml.extendedsysmlprofile.ExtendedSysMLProfilePackage#getRequirementsPackage_Base_Package()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Package getBase_Package();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.requirements.extendedsysml.extendedsysmlprofile.RequirementsPackage#getBase_Package <em>Base Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Package</em>' reference.
	 * @see #getBase_Package()
	 * @generated
	 */
	void setBase_Package(org.eclipse.uml2.uml.Package value);

	/**
	 * Returns the value of the '<em><b>Alias</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Alias is generally a two or three letters string that will be used to create the id of the requirements inside the package
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alias</em>' attribute.
	 * @see #setAlias(String)
	 * @see org.eclipse.papyrus.requirements.extendedsysml.extendedsysmlprofile.ExtendedSysMLProfilePackage#getRequirementsPackage_Alias()
	 * @model default="" dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getAlias();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.requirements.extendedsysml.extendedsysmlprofile.RequirementsPackage#getAlias <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias</em>' attribute.
	 * @see #getAlias()
	 * @generated
	 */
	void setAlias(String value);

	/**
	 * Returns the value of the '<em><b>Id Depth</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.requirements.extendedsysml.extendedsysmlprofile.Depth}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Depth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Depth</em>' attribute.
	 * @see org.eclipse.papyrus.requirements.extendedsysml.extendedsysmlprofile.Depth
	 * @see #setIdDepth(Depth)
	 * @see org.eclipse.papyrus.requirements.extendedsysml.extendedsysmlprofile.ExtendedSysMLProfilePackage#getRequirementsPackage_IdDepth()
	 * @model default="-1" required="true" ordered="false"
	 * @generated
	 */
	Depth getIdDepth();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.requirements.extendedsysml.extendedsysmlprofile.RequirementsPackage#getIdDepth <em>Id Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Depth</em>' attribute.
	 * @see org.eclipse.papyrus.requirements.extendedsysml.extendedsysmlprofile.Depth
	 * @see #getIdDepth()
	 * @generated
	 */
	void setIdDepth(Depth value);

} // RequirementsPackage
