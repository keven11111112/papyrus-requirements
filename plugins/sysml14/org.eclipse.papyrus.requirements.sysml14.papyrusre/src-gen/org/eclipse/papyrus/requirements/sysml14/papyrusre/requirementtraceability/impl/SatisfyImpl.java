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
package org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementtraceability.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementandprocessconcerns.SatisfactionStatusKind;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementtraceability.RequirementTraceabilityPackage;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementtraceability.Satisfy;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Satisfy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementtraceability.impl.SatisfyImpl#getValidatorName <em>Validator Name</em>}</li>
 *   <li>{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementtraceability.impl.SatisfyImpl#getSatisfyStatus <em>Satisfy Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SatisfyImpl extends org.eclipse.papyrus.sysml14.requirements.internal.impl.SatisfyImpl implements Satisfy {
	/**
	 * The default value of the '{@link #getValidatorName() <em>Validator Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidatorName()
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATOR_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValidatorName() <em>Validator Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidatorName()
	 * @generated
	 * @ordered
	 */
	protected String validatorName = VALIDATOR_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSatisfyStatus() <em>Satisfy Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatisfyStatus()
	 * @generated
	 * @ordered
	 */
	protected static final SatisfactionStatusKind SATISFY_STATUS_EDEFAULT = SatisfactionStatusKind.NOT_SATISFIED;

	/**
	 * The cached value of the '{@link #getSatisfyStatus() <em>Satisfy Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatisfyStatus()
	 * @generated
	 * @ordered
	 */
	protected SatisfactionStatusKind satisfyStatus = SATISFY_STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SatisfyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementTraceabilityPackage.Literals.SATISFY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValidatorName() {
		return validatorName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidatorName(String newValidatorName) {
		String oldValidatorName = validatorName;
		validatorName = newValidatorName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementTraceabilityPackage.SATISFY__VALIDATOR_NAME, oldValidatorName, validatorName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SatisfactionStatusKind getSatisfyStatus() {
		return satisfyStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSatisfyStatus(SatisfactionStatusKind newSatisfyStatus) {
		SatisfactionStatusKind oldSatisfyStatus = satisfyStatus;
		satisfyStatus = newSatisfyStatus == null ? SATISFY_STATUS_EDEFAULT : newSatisfyStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementTraceabilityPackage.SATISFY__SATISFY_STATUS, oldSatisfyStatus, satisfyStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RequirementTraceabilityPackage.SATISFY__VALIDATOR_NAME:
				return getValidatorName();
			case RequirementTraceabilityPackage.SATISFY__SATISFY_STATUS:
				return getSatisfyStatus();
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
			case RequirementTraceabilityPackage.SATISFY__VALIDATOR_NAME:
				setValidatorName((String)newValue);
				return;
			case RequirementTraceabilityPackage.SATISFY__SATISFY_STATUS:
				setSatisfyStatus((SatisfactionStatusKind)newValue);
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
			case RequirementTraceabilityPackage.SATISFY__VALIDATOR_NAME:
				setValidatorName(VALIDATOR_NAME_EDEFAULT);
				return;
			case RequirementTraceabilityPackage.SATISFY__SATISFY_STATUS:
				setSatisfyStatus(SATISFY_STATUS_EDEFAULT);
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
			case RequirementTraceabilityPackage.SATISFY__VALIDATOR_NAME:
				return VALIDATOR_NAME_EDEFAULT == null ? validatorName != null : !VALIDATOR_NAME_EDEFAULT.equals(validatorName);
			case RequirementTraceabilityPackage.SATISFY__SATISFY_STATUS:
				return satisfyStatus != SATISFY_STATUS_EDEFAULT;
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
		result.append(" (validatorName: "); //$NON-NLS-1$
		result.append(validatorName);
		result.append(", satisfyStatus: "); //$NON-NLS-1$
		result.append(satisfyStatus);
		result.append(')');
		return result.toString();
	}

} //SatisfyImpl
