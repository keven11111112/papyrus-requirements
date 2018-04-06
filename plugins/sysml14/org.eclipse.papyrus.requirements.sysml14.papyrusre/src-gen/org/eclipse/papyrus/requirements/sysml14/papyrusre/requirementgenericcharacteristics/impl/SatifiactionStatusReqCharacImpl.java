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

import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementandprocessconcerns.SatisfactionStatusKind;
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
	protected static final SatisfactionStatusKind SATISFACTION_STATUS_EDEFAULT = SatisfactionStatusKind.NOT_SATISFIED;

	/**
	 * The cached value of the '{@link #getSatisfactionStatus() <em>Satisfaction Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatisfactionStatus()
	 * @generated
	 * @ordered
	 */
	protected SatisfactionStatusKind satisfactionStatus = SATISFACTION_STATUS_EDEFAULT;

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
	public SatisfactionStatusKind getSatisfactionStatus() {
		return satisfactionStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSatisfactionStatus(SatisfactionStatusKind newSatisfactionStatus) {
		SatisfactionStatusKind oldSatisfactionStatus = satisfactionStatus;
		satisfactionStatus = newSatisfactionStatus == null ? SATISFACTION_STATUS_EDEFAULT : newSatisfactionStatus;
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
				setSatisfactionStatus((SatisfactionStatusKind)newValue);
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
				return satisfactionStatus != SATISFACTION_STATUS_EDEFAULT;
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
