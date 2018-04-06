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
package org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementtraceability;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementandprocessconcerns.SatisfactionStatusKind;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Satisfy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementtraceability.Satisfy#getValidatorName <em>Validator Name</em>}</li>
 *   <li>{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementtraceability.Satisfy#getSatisfyStatus <em>Satisfy Status</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementtraceability.RequirementTraceabilityPackage#getSatisfy()
 * @model
 * @generated
 */
public interface Satisfy extends org.eclipse.papyrus.sysml14.requirements.Satisfy {
	/**
	 * Returns the value of the '<em><b>Validator Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validator Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validator Name</em>' attribute.
	 * @see #setValidatorName(String)
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementtraceability.RequirementTraceabilityPackage#getSatisfy_ValidatorName()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getValidatorName();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementtraceability.Satisfy#getValidatorName <em>Validator Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validator Name</em>' attribute.
	 * @see #getValidatorName()
	 * @generated
	 */
	void setValidatorName(String value);

	/**
	 * Returns the value of the '<em><b>Satisfy Status</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementandprocessconcerns.SatisfactionStatusKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Satisfy Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Satisfy Status</em>' attribute.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementandprocessconcerns.SatisfactionStatusKind
	 * @see #setSatisfyStatus(SatisfactionStatusKind)
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementtraceability.RequirementTraceabilityPackage#getSatisfy_SatisfyStatus()
	 * @model ordered="false"
	 * @generated
	 */
	SatisfactionStatusKind getSatisfyStatus();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementtraceability.Satisfy#getSatisfyStatus <em>Satisfy Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Satisfy Status</em>' attribute.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementandprocessconcerns.SatisfactionStatusKind
	 * @see #getSatisfyStatus()
	 * @generated
	 */
	void setSatisfyStatus(SatisfactionStatusKind value);

} // Satisfy
