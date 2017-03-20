/**
 * ****************************************************************************
 * Copyright (c) 2017 CEA LIST.
 *  *
 *  *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  *
 * Contributors:
 * 
 * 		Mauricio Alferez (mauricio.alferez@cea.fr) CEA LIST - Initial API and implementation
 *  *
 *  ****************************************************************************
 * 
 * generated by Xtext 2.11.0
 */
package org.eclipse.papyrus.requirements.sysml14.boilerplateText;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subject</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.requirements.sysml14.boilerplateText.Subject#getSystem <em>System</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.requirements.sysml14.boilerplateText.BoilerplateTextPackage#getSubject()
 * @model
 * @generated
 */
public interface Subject extends EObject
{
  /**
   * Returns the value of the '<em><b>System</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>System</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>System</em>' attribute.
   * @see #setSystem(String)
   * @see org.eclipse.papyrus.requirements.sysml14.boilerplateText.BoilerplateTextPackage#getSubject_System()
   * @model
   * @generated
   */
  String getSystem();

  /**
   * Sets the value of the '{@link org.eclipse.papyrus.requirements.sysml14.boilerplateText.Subject#getSystem <em>System</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>System</em>' attribute.
   * @see #getSystem()
   * @generated
   */
  void setSystem(String value);

} // Subject
