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

import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.RequirementGenericCharacteristicsPackage;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.SatifiactionStatusReqCharac;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Satifiaction Status Req Charac</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.SatifiactionStatusReqCharacImpl#getSatisfactionStatus <em>Satisfaction Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SatifiactionStatusReqCharacImpl extends MinimalEObjectImpl.Container implements SatifiactionStatusReqCharac {
	/**
	 * The default value of the '{@link #getSatisfactionStatus() <em>Satisfaction Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatisfactionStatus()
	 * @generated
	 * @ordered
	 */
	protected static final Object SATISFACTION_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSatisfactionStatus() <em>Satisfaction Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatisfactionStatus()
	 * @generated
	 * @ordered
	 */
	protected Object satisfactionStatus = SATISFACTION_STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SatifiactionStatusReqCharacImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementGenericCharacteristicsPackage.Literals.SATIFIACTION_STATUS_REQ_CHARAC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getSatisfactionStatus() {
		return satisfactionStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSatisfactionStatus(Object newSatisfactionStatus) {
		Object oldSatisfactionStatus = satisfactionStatus;
		satisfactionStatus = newSatisfactionStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementGenericCharacteristicsPackage.SATIFIACTION_STATUS_REQ_CHARAC__SATISFACTION_STATUS, oldSatisfactionStatus, satisfactionStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RequirementGenericCharacteristicsPackage.SATIFIACTION_STATUS_REQ_CHARAC__SATISFACTION_STATUS:
				return getSatisfactionStatus();
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
			case RequirementGenericCharacteristicsPackage.SATIFIACTION_STATUS_REQ_CHARAC__SATISFACTION_STATUS:
				setSatisfactionStatus(newValue);
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
			case RequirementGenericCharacteristicsPackage.SATIFIACTION_STATUS_REQ_CHARAC__SATISFACTION_STATUS:
				setSatisfactionStatus(SATISFACTION_STATUS_EDEFAULT);
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
			case RequirementGenericCharacteristicsPackage.SATIFIACTION_STATUS_REQ_CHARAC__SATISFACTION_STATUS:
				return SATISFACTION_STATUS_EDEFAULT == null ? satisfactionStatus != null : !SATISFACTION_STATUS_EDEFAULT.equals(satisfactionStatus);
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
		result.append(" (satisfactionStatus: "); //$NON-NLS-1$
		result.append(satisfactionStatus);
		result.append(')');
		return result.toString();
	}

} //SatifiactionStatusReqCharacImpl
