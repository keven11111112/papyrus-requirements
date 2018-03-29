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

import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.ApprovalAuthorityReqCharac;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.RequirementGenericCharacteristicsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Approval Authority Req Charac</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.ApprovalAuthorityReqCharacImpl#getApprovalAuthority <em>Approval Authority</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApprovalAuthorityReqCharacImpl extends MinimalEObjectImpl.Container implements ApprovalAuthorityReqCharac {
	/**
	 * The default value of the '{@link #getApprovalAuthority() <em>Approval Authority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApprovalAuthority()
	 * @generated
	 * @ordered
	 */
	protected static final String APPROVAL_AUTHORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApprovalAuthority() <em>Approval Authority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApprovalAuthority()
	 * @generated
	 * @ordered
	 */
	protected String approvalAuthority = APPROVAL_AUTHORITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApprovalAuthorityReqCharacImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementGenericCharacteristicsPackage.Literals.APPROVAL_AUTHORITY_REQ_CHARAC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApprovalAuthority() {
		return approvalAuthority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApprovalAuthority(String newApprovalAuthority) {
		String oldApprovalAuthority = approvalAuthority;
		approvalAuthority = newApprovalAuthority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementGenericCharacteristicsPackage.APPROVAL_AUTHORITY_REQ_CHARAC__APPROVAL_AUTHORITY, oldApprovalAuthority, approvalAuthority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RequirementGenericCharacteristicsPackage.APPROVAL_AUTHORITY_REQ_CHARAC__APPROVAL_AUTHORITY:
				return getApprovalAuthority();
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
			case RequirementGenericCharacteristicsPackage.APPROVAL_AUTHORITY_REQ_CHARAC__APPROVAL_AUTHORITY:
				setApprovalAuthority((String)newValue);
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
			case RequirementGenericCharacteristicsPackage.APPROVAL_AUTHORITY_REQ_CHARAC__APPROVAL_AUTHORITY:
				setApprovalAuthority(APPROVAL_AUTHORITY_EDEFAULT);
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
			case RequirementGenericCharacteristicsPackage.APPROVAL_AUTHORITY_REQ_CHARAC__APPROVAL_AUTHORITY:
				return APPROVAL_AUTHORITY_EDEFAULT == null ? approvalAuthority != null : !APPROVAL_AUTHORITY_EDEFAULT.equals(approvalAuthority);
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
		result.append(" (approvalAuthority: "); //$NON-NLS-1$
		result.append(approvalAuthority);
		result.append(')');
		return result.toString();
	}

} //ApprovalAuthorityReqCharacImpl
