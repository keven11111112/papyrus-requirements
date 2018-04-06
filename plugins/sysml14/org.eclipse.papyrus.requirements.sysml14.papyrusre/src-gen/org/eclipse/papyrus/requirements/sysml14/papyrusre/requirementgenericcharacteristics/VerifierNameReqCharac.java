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
package org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.verificationandvalidationconcerns.VV_MethodKind;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.verificationandvalidationconcerns.VV_StatusKind;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Verifier Name Req Charac</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.VerifierNameReqCharac#getVerifierName <em>Verifier Name</em>}</li>
 *   <li>{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.VerifierNameReqCharac#getVV_Method <em>VV Method</em>}</li>
 *   <li>{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.VerifierNameReqCharac#getVV_Status <em>VV Status</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.RequirementGenericCharacteristicsPackage#getVerifierNameReqCharac()
 * @model
 * @generated
 */
public interface VerifierNameReqCharac extends EObject {
	/**
	 * Returns the value of the '<em><b>Verifier Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verifier Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verifier Name</em>' attribute.
	 * @see #setVerifierName(String)
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.RequirementGenericCharacteristicsPackage#getVerifierNameReqCharac_VerifierName()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getVerifierName();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.VerifierNameReqCharac#getVerifierName <em>Verifier Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verifier Name</em>' attribute.
	 * @see #getVerifierName()
	 * @generated
	 */
	void setVerifierName(String value);

	/**
	 * Returns the value of the '<em><b>VV Method</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.verificationandvalidationconcerns.VV_MethodKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VV Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VV Method</em>' attribute.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.verificationandvalidationconcerns.VV_MethodKind
	 * @see #setVV_Method(VV_MethodKind)
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.RequirementGenericCharacteristicsPackage#getVerifierNameReqCharac_VV_Method()
	 * @model ordered="false"
	 * @generated
	 */
	VV_MethodKind getVV_Method();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.VerifierNameReqCharac#getVV_Method <em>VV Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VV Method</em>' attribute.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.verificationandvalidationconcerns.VV_MethodKind
	 * @see #getVV_Method()
	 * @generated
	 */
	void setVV_Method(VV_MethodKind value);

	/**
	 * Returns the value of the '<em><b>VV Status</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.verificationandvalidationconcerns.VV_StatusKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VV Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VV Status</em>' attribute.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.verificationandvalidationconcerns.VV_StatusKind
	 * @see #setVV_Status(VV_StatusKind)
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.RequirementGenericCharacteristicsPackage#getVerifierNameReqCharac_VV_Status()
	 * @model ordered="false"
	 * @generated
	 */
	VV_StatusKind getVV_Status();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.VerifierNameReqCharac#getVV_Status <em>VV Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VV Status</em>' attribute.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.verificationandvalidationconcerns.VV_StatusKind
	 * @see #getVV_Status()
	 * @generated
	 */
	void setVV_Status(VV_StatusKind value);

} // VerifierNameReqCharac
