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
package org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.verificationandvalidationconcerns.VV_MethodKind;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.verificationandvalidationconcerns.VV_StatusKind;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.RequirementGenericCharacteristicsPackage;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.VerifierNameReqCharac;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Verifier Name Req Charac</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.VerifierNameReqCharacImpl#getVerifierName <em>Verifier Name</em>}</li>
 *   <li>{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.VerifierNameReqCharacImpl#getVV_Method <em>VV Method</em>}</li>
 *   <li>{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.VerifierNameReqCharacImpl#getVV_Status <em>VV Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VerifierNameReqCharacImpl extends MinimalEObjectImpl.Container implements VerifierNameReqCharac {
	/**
	 * The default value of the '{@link #getVerifierName() <em>Verifier Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerifierName()
	 * @generated
	 * @ordered
	 */
	protected static final String VERIFIER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVerifierName() <em>Verifier Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerifierName()
	 * @generated
	 * @ordered
	 */
	protected String verifierName = VERIFIER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVV_Method() <em>VV Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVV_Method()
	 * @generated
	 * @ordered
	 */
	protected static final VV_MethodKind VV_METHOD_EDEFAULT = VV_MethodKind.ANALYSIS;

	/**
	 * The cached value of the '{@link #getVV_Method() <em>VV Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVV_Method()
	 * @generated
	 * @ordered
	 */
	protected VV_MethodKind vV_Method = VV_METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getVV_Status() <em>VV Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVV_Status()
	 * @generated
	 * @ordered
	 */
	protected static final VV_StatusKind VV_STATUS_EDEFAULT = VV_StatusKind.PENDING;

	/**
	 * The cached value of the '{@link #getVV_Status() <em>VV Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVV_Status()
	 * @generated
	 * @ordered
	 */
	protected VV_StatusKind vV_Status = VV_STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VerifierNameReqCharacImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementGenericCharacteristicsPackage.Literals.VERIFIER_NAME_REQ_CHARAC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVerifierName() {
		return verifierName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerifierName(String newVerifierName) {
		String oldVerifierName = verifierName;
		verifierName = newVerifierName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementGenericCharacteristicsPackage.VERIFIER_NAME_REQ_CHARAC__VERIFIER_NAME, oldVerifierName, verifierName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VV_MethodKind getVV_Method() {
		return vV_Method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVV_Method(VV_MethodKind newVV_Method) {
		VV_MethodKind oldVV_Method = vV_Method;
		vV_Method = newVV_Method == null ? VV_METHOD_EDEFAULT : newVV_Method;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementGenericCharacteristicsPackage.VERIFIER_NAME_REQ_CHARAC__VV_METHOD, oldVV_Method, vV_Method));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VV_StatusKind getVV_Status() {
		return vV_Status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVV_Status(VV_StatusKind newVV_Status) {
		VV_StatusKind oldVV_Status = vV_Status;
		vV_Status = newVV_Status == null ? VV_STATUS_EDEFAULT : newVV_Status;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementGenericCharacteristicsPackage.VERIFIER_NAME_REQ_CHARAC__VV_STATUS, oldVV_Status, vV_Status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RequirementGenericCharacteristicsPackage.VERIFIER_NAME_REQ_CHARAC__VERIFIER_NAME:
				return getVerifierName();
			case RequirementGenericCharacteristicsPackage.VERIFIER_NAME_REQ_CHARAC__VV_METHOD:
				return getVV_Method();
			case RequirementGenericCharacteristicsPackage.VERIFIER_NAME_REQ_CHARAC__VV_STATUS:
				return getVV_Status();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RequirementGenericCharacteristicsPackage.VERIFIER_NAME_REQ_CHARAC__VERIFIER_NAME:
				setVerifierName((String)newValue);
				return;
			case RequirementGenericCharacteristicsPackage.VERIFIER_NAME_REQ_CHARAC__VV_METHOD:
				setVV_Method((VV_MethodKind)newValue);
				return;
			case RequirementGenericCharacteristicsPackage.VERIFIER_NAME_REQ_CHARAC__VV_STATUS:
				setVV_Status((VV_StatusKind)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RequirementGenericCharacteristicsPackage.VERIFIER_NAME_REQ_CHARAC__VERIFIER_NAME:
				setVerifierName(VERIFIER_NAME_EDEFAULT);
				return;
			case RequirementGenericCharacteristicsPackage.VERIFIER_NAME_REQ_CHARAC__VV_METHOD:
				setVV_Method(VV_METHOD_EDEFAULT);
				return;
			case RequirementGenericCharacteristicsPackage.VERIFIER_NAME_REQ_CHARAC__VV_STATUS:
				setVV_Status(VV_STATUS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RequirementGenericCharacteristicsPackage.VERIFIER_NAME_REQ_CHARAC__VERIFIER_NAME:
				return VERIFIER_NAME_EDEFAULT == null ? verifierName != null : !VERIFIER_NAME_EDEFAULT.equals(verifierName);
			case RequirementGenericCharacteristicsPackage.VERIFIER_NAME_REQ_CHARAC__VV_METHOD:
				return vV_Method != VV_METHOD_EDEFAULT;
			case RequirementGenericCharacteristicsPackage.VERIFIER_NAME_REQ_CHARAC__VV_STATUS:
				return vV_Status != VV_STATUS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (verifierName: "); //$NON-NLS-1$
		result.append(verifierName);
		result.append(", VV_Method: "); //$NON-NLS-1$
		result.append(vV_Method);
		result.append(", VV_Status: "); //$NON-NLS-1$
		result.append(vV_Status);
		result.append(')');
		return result.toString();
	}

} //VerifierNameReqCharacImpl
