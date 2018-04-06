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

import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementandprocessconcerns.ReviewStatusKind;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.RequirementGenericCharacteristicsPackage;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.ReviewStatusReqCharac;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Review Status Req Charac</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.ReviewStatusReqCharacImpl#getReviewStatus <em>Review Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReviewStatusReqCharacImpl extends MinimalEObjectImpl.Container implements ReviewStatusReqCharac {
	/**
	 * The default value of the '{@link #getReviewStatus() <em>Review Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ReviewStatusKind REVIEW_STATUS_EDEFAULT = ReviewStatusKind.TO_BE_REVIEWED;

	/**
	 * The cached value of the '{@link #getReviewStatus() <em>Review Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewStatus()
	 * @generated
	 * @ordered
	 */
	protected ReviewStatusKind reviewStatus = REVIEW_STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReviewStatusReqCharacImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementGenericCharacteristicsPackage.Literals.REVIEW_STATUS_REQ_CHARAC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReviewStatusKind getReviewStatus() {
		return reviewStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReviewStatus(ReviewStatusKind newReviewStatus) {
		ReviewStatusKind oldReviewStatus = reviewStatus;
		reviewStatus = newReviewStatus == null ? REVIEW_STATUS_EDEFAULT : newReviewStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementGenericCharacteristicsPackage.REVIEW_STATUS_REQ_CHARAC__REVIEW_STATUS, oldReviewStatus, reviewStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RequirementGenericCharacteristicsPackage.REVIEW_STATUS_REQ_CHARAC__REVIEW_STATUS:
				return getReviewStatus();
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
			case RequirementGenericCharacteristicsPackage.REVIEW_STATUS_REQ_CHARAC__REVIEW_STATUS:
				setReviewStatus((ReviewStatusKind)newValue);
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
			case RequirementGenericCharacteristicsPackage.REVIEW_STATUS_REQ_CHARAC__REVIEW_STATUS:
				setReviewStatus(REVIEW_STATUS_EDEFAULT);
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
			case RequirementGenericCharacteristicsPackage.REVIEW_STATUS_REQ_CHARAC__REVIEW_STATUS:
				return reviewStatus != REVIEW_STATUS_EDEFAULT;
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
		result.append(" (reviewStatus: "); //$NON-NLS-1$
		result.append(reviewStatus);
		result.append(')');
		return result.toString();
	}

} //ReviewStatusReqCharacImpl
