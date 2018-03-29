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

import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.QualificationStatusReqCharac;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.RequirementGenericCharacteristicsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Qualification Status Req Charac</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.QualificationStatusReqCharacImpl#getQualificationStatus <em>Qualification Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QualificationStatusReqCharacImpl extends MinimalEObjectImpl.Container implements QualificationStatusReqCharac {
	/**
	 * The default value of the '{@link #getQualificationStatus() <em>Qualification Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualificationStatus()
	 * @generated
	 * @ordered
	 */
	protected static final Object QUALIFICATION_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQualificationStatus() <em>Qualification Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualificationStatus()
	 * @generated
	 * @ordered
	 */
	protected Object qualificationStatus = QUALIFICATION_STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QualificationStatusReqCharacImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementGenericCharacteristicsPackage.Literals.QUALIFICATION_STATUS_REQ_CHARAC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getQualificationStatus() {
		return qualificationStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualificationStatus(Object newQualificationStatus) {
		Object oldQualificationStatus = qualificationStatus;
		qualificationStatus = newQualificationStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementGenericCharacteristicsPackage.QUALIFICATION_STATUS_REQ_CHARAC__QUALIFICATION_STATUS, oldQualificationStatus, qualificationStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RequirementGenericCharacteristicsPackage.QUALIFICATION_STATUS_REQ_CHARAC__QUALIFICATION_STATUS:
				return getQualificationStatus();
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
			case RequirementGenericCharacteristicsPackage.QUALIFICATION_STATUS_REQ_CHARAC__QUALIFICATION_STATUS:
				setQualificationStatus(newValue);
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
			case RequirementGenericCharacteristicsPackage.QUALIFICATION_STATUS_REQ_CHARAC__QUALIFICATION_STATUS:
				setQualificationStatus(QUALIFICATION_STATUS_EDEFAULT);
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
			case RequirementGenericCharacteristicsPackage.QUALIFICATION_STATUS_REQ_CHARAC__QUALIFICATION_STATUS:
				return QUALIFICATION_STATUS_EDEFAULT == null ? qualificationStatus != null : !QUALIFICATION_STATUS_EDEFAULT.equals(qualificationStatus);
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
		result.append(" (qualificationStatus: "); //$NON-NLS-1$
		result.append(qualificationStatus);
		result.append(')');
		return result.toString();
	}

} //QualificationStatusReqCharacImpl
