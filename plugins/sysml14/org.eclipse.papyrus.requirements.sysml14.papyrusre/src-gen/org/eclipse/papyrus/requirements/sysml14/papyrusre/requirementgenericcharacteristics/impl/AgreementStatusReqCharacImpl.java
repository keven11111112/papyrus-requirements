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

import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.AgreementStatusReqCharac;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.RequirementGenericCharacteristicsPackage;

import org.eclipse.papyrus.sysml14.requirements.internal.impl.RequirementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agreement Status Req Charac</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.AgreementStatusReqCharacImpl#getAgreementStatus <em>Agreement Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AgreementStatusReqCharacImpl extends RequirementImpl implements AgreementStatusReqCharac {
	/**
	 * The default value of the '{@link #getAgreementStatus() <em>Agreement Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgreementStatus()
	 * @generated
	 * @ordered
	 */
	protected static final Object AGREEMENT_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAgreementStatus() <em>Agreement Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgreementStatus()
	 * @generated
	 * @ordered
	 */
	protected Object agreementStatus = AGREEMENT_STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgreementStatusReqCharacImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementGenericCharacteristicsPackage.Literals.AGREEMENT_STATUS_REQ_CHARAC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getAgreementStatus() {
		return agreementStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAgreementStatus(Object newAgreementStatus) {
		Object oldAgreementStatus = agreementStatus;
		agreementStatus = newAgreementStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementGenericCharacteristicsPackage.AGREEMENT_STATUS_REQ_CHARAC__AGREEMENT_STATUS, oldAgreementStatus, agreementStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RequirementGenericCharacteristicsPackage.AGREEMENT_STATUS_REQ_CHARAC__AGREEMENT_STATUS:
				return getAgreementStatus();
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
			case RequirementGenericCharacteristicsPackage.AGREEMENT_STATUS_REQ_CHARAC__AGREEMENT_STATUS:
				setAgreementStatus(newValue);
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
			case RequirementGenericCharacteristicsPackage.AGREEMENT_STATUS_REQ_CHARAC__AGREEMENT_STATUS:
				setAgreementStatus(AGREEMENT_STATUS_EDEFAULT);
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
			case RequirementGenericCharacteristicsPackage.AGREEMENT_STATUS_REQ_CHARAC__AGREEMENT_STATUS:
				return AGREEMENT_STATUS_EDEFAULT == null ? agreementStatus != null : !AGREEMENT_STATUS_EDEFAULT.equals(agreementStatus);
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
		result.append(" (agreementStatus: "); //$NON-NLS-1$
		result.append(agreementStatus);
		result.append(')');
		return result.toString();
	}

} //AgreementStatusReqCharacImpl
