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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementtraceability.RequirementTraceabilityPackage;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementtraceability.Verify;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Verify</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementtraceability.impl.VerifyImpl#getVerifierName <em>Verifier Name</em>}</li>
 *   <li>{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementtraceability.impl.VerifyImpl#getVerifyStatus <em>Verify Status</em>}</li>
 *   <li>{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementtraceability.impl.VerifyImpl#getVV_Method <em>VV Method</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VerifyImpl extends org.eclipse.papyrus.sysml14.requirements.internal.impl.VerifyImpl implements Verify {
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
	 * The default value of the '{@link #getVerifyStatus() <em>Verify Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerifyStatus()
	 * @generated
	 * @ordered
	 */
	protected static final Object VERIFY_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVerifyStatus() <em>Verify Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerifyStatus()
	 * @generated
	 * @ordered
	 */
	protected Object verifyStatus = VERIFY_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getVV_Method() <em>VV Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVV_Method()
	 * @generated
	 * @ordered
	 */
	protected static final Object VV_METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVV_Method() <em>VV Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVV_Method()
	 * @generated
	 * @ordered
	 */
	protected Object vV_Method = VV_METHOD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VerifyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementTraceabilityPackage.Literals.VERIFY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementTraceabilityPackage.VERIFY__VERIFIER_NAME, oldVerifierName, verifierName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getVerifyStatus() {
		return verifyStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerifyStatus(Object newVerifyStatus) {
		Object oldVerifyStatus = verifyStatus;
		verifyStatus = newVerifyStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementTraceabilityPackage.VERIFY__VERIFY_STATUS, oldVerifyStatus, verifyStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getVV_Method() {
		return vV_Method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVV_Method(Object newVV_Method) {
		Object oldVV_Method = vV_Method;
		vV_Method = newVV_Method;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementTraceabilityPackage.VERIFY__VV_METHOD, oldVV_Method, vV_Method));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RequirementTraceabilityPackage.VERIFY__VERIFIER_NAME:
				return getVerifierName();
			case RequirementTraceabilityPackage.VERIFY__VERIFY_STATUS:
				return getVerifyStatus();
			case RequirementTraceabilityPackage.VERIFY__VV_METHOD:
				return getVV_Method();
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
			case RequirementTraceabilityPackage.VERIFY__VERIFIER_NAME:
				setVerifierName((String)newValue);
				return;
			case RequirementTraceabilityPackage.VERIFY__VERIFY_STATUS:
				setVerifyStatus(newValue);
				return;
			case RequirementTraceabilityPackage.VERIFY__VV_METHOD:
				setVV_Method(newValue);
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
			case RequirementTraceabilityPackage.VERIFY__VERIFIER_NAME:
				setVerifierName(VERIFIER_NAME_EDEFAULT);
				return;
			case RequirementTraceabilityPackage.VERIFY__VERIFY_STATUS:
				setVerifyStatus(VERIFY_STATUS_EDEFAULT);
				return;
			case RequirementTraceabilityPackage.VERIFY__VV_METHOD:
				setVV_Method(VV_METHOD_EDEFAULT);
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
			case RequirementTraceabilityPackage.VERIFY__VERIFIER_NAME:
				return VERIFIER_NAME_EDEFAULT == null ? verifierName != null : !VERIFIER_NAME_EDEFAULT.equals(verifierName);
			case RequirementTraceabilityPackage.VERIFY__VERIFY_STATUS:
				return VERIFY_STATUS_EDEFAULT == null ? verifyStatus != null : !VERIFY_STATUS_EDEFAULT.equals(verifyStatus);
			case RequirementTraceabilityPackage.VERIFY__VV_METHOD:
				return VV_METHOD_EDEFAULT == null ? vV_Method != null : !VV_METHOD_EDEFAULT.equals(vV_Method);
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
		result.append(", verifyStatus: "); //$NON-NLS-1$
		result.append(verifyStatus);
		result.append(", VV_Method: "); //$NON-NLS-1$
		result.append(vV_Method);
		result.append(')');
		return result.toString();
	}

} //VerifyImpl
