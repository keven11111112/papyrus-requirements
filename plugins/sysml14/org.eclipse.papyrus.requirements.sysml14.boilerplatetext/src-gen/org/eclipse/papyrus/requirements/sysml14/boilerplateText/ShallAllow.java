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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shall Allow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.requirements.sysml14.boilerplateText.ShallAllow#getEntity <em>Entity</em>}</li>
 *   <li>{@link org.eclipse.papyrus.requirements.sysml14.boilerplateText.ShallAllow#getActionPerformedByEntity <em>Action Performed By Entity</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.requirements.sysml14.boilerplateText.BoilerplateTextPackage#getShallAllow()
 * @model
 * @generated
 */
public interface ShallAllow extends Predicate
{
  /**
   * Returns the value of the '<em><b>Entity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entity</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entity</em>' attribute.
   * @see #setEntity(String)
   * @see org.eclipse.papyrus.requirements.sysml14.boilerplateText.BoilerplateTextPackage#getShallAllow_Entity()
   * @model
   * @generated
   */
  String getEntity();

  /**
   * Sets the value of the '{@link org.eclipse.papyrus.requirements.sysml14.boilerplateText.ShallAllow#getEntity <em>Entity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entity</em>' attribute.
   * @see #getEntity()
   * @generated
   */
  void setEntity(String value);

  /**
   * Returns the value of the '<em><b>Action Performed By Entity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action Performed By Entity</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action Performed By Entity</em>' attribute.
   * @see #setActionPerformedByEntity(String)
   * @see org.eclipse.papyrus.requirements.sysml14.boilerplateText.BoilerplateTextPackage#getShallAllow_ActionPerformedByEntity()
   * @model
   * @generated
   */
  String getActionPerformedByEntity();

  /**
   * Sets the value of the '{@link org.eclipse.papyrus.requirements.sysml14.boilerplateText.ShallAllow#getActionPerformedByEntity <em>Action Performed By Entity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action Performed By Entity</em>' attribute.
   * @see #getActionPerformedByEntity()
   * @generated
   */
  void setActionPerformedByEntity(String value);

} // ShallAllow
