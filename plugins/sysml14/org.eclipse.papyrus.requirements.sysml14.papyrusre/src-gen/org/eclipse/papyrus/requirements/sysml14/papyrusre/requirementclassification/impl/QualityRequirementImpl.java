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
package org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementclassificationconcerns.QualityKind;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.QualityRequirement;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.RequirementClassificationPackage;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quality Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.impl.QualityRequirementImpl#getSpecificQualityKind <em>Specific Quality Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QualityRequirementImpl extends RequirementImpl implements QualityRequirement {
	/**
	 * The default value of the '{@link #getSpecificQualityKind() <em>Specific Quality Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificQualityKind()
	 * @generated
	 * @ordered
	 */
	protected static final QualityKind SPECIFIC_QUALITY_KIND_EDEFAULT = QualityKind.ADAPTABILITY;

	/**
	 * The cached value of the '{@link #getSpecificQualityKind() <em>Specific Quality Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificQualityKind()
	 * @generated
	 * @ordered
	 */
	protected QualityKind specificQualityKind = SPECIFIC_QUALITY_KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QualityRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementClassificationPackage.Literals.QUALITY_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualityKind getSpecificQualityKind() {
		return specificQualityKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecificQualityKind(QualityKind newSpecificQualityKind) {
		QualityKind oldSpecificQualityKind = specificQualityKind;
		specificQualityKind = newSpecificQualityKind == null ? SPECIFIC_QUALITY_KIND_EDEFAULT : newSpecificQualityKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementClassificationPackage.QUALITY_REQUIREMENT__SPECIFIC_QUALITY_KIND, oldSpecificQualityKind, specificQualityKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RequirementClassificationPackage.QUALITY_REQUIREMENT__SPECIFIC_QUALITY_KIND:
				return getSpecificQualityKind();
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
			case RequirementClassificationPackage.QUALITY_REQUIREMENT__SPECIFIC_QUALITY_KIND:
				setSpecificQualityKind((QualityKind)newValue);
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
			case RequirementClassificationPackage.QUALITY_REQUIREMENT__SPECIFIC_QUALITY_KIND:
				setSpecificQualityKind(SPECIFIC_QUALITY_KIND_EDEFAULT);
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
			case RequirementClassificationPackage.QUALITY_REQUIREMENT__SPECIFIC_QUALITY_KIND:
				return specificQualityKind != SPECIFIC_QUALITY_KIND_EDEFAULT;
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
		result.append(" (specificQualityKind: "); //$NON-NLS-1$
		result.append(specificQualityKind);
		result.append(')');
		return result.toString();
	}

} //QualityRequirementImpl
