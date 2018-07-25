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
package org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementclassificationconcerns.ConstraintKind;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.ConstraintRequirement;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.RequirementClassificationPackage;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.impl.ConstraintRequirementImpl#getConstraintKind <em>Constraint Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstraintRequirementImpl extends RequirementImpl implements ConstraintRequirement {
	/**
	 * The default value of the '{@link #getConstraintKind() <em>Constraint Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintKind()
	 * @generated
	 * @ordered
	 */
	protected static final ConstraintKind CONSTRAINT_KIND_EDEFAULT = ConstraintKind.CULTURAL;

	/**
	 * The cached value of the '{@link #getConstraintKind() <em>Constraint Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintKind()
	 * @generated
	 * @ordered
	 */
	protected ConstraintKind constraintKind = CONSTRAINT_KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementClassificationPackage.Literals.CONSTRAINT_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintKind getConstraintKind() {
		return constraintKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraintKind(ConstraintKind newConstraintKind) {
		ConstraintKind oldConstraintKind = constraintKind;
		constraintKind = newConstraintKind == null ? CONSTRAINT_KIND_EDEFAULT : newConstraintKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementClassificationPackage.CONSTRAINT_REQUIREMENT__CONSTRAINT_KIND, oldConstraintKind, constraintKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RequirementClassificationPackage.CONSTRAINT_REQUIREMENT__CONSTRAINT_KIND:
				return getConstraintKind();
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
			case RequirementClassificationPackage.CONSTRAINT_REQUIREMENT__CONSTRAINT_KIND:
				setConstraintKind((ConstraintKind)newValue);
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
			case RequirementClassificationPackage.CONSTRAINT_REQUIREMENT__CONSTRAINT_KIND:
				setConstraintKind(CONSTRAINT_KIND_EDEFAULT);
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
			case RequirementClassificationPackage.CONSTRAINT_REQUIREMENT__CONSTRAINT_KIND:
				return constraintKind != CONSTRAINT_KIND_EDEFAULT;
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
		result.append(" (constraintKind: "); //$NON-NLS-1$
		result.append(constraintKind);
		result.append(')');
		return result.toString();
	}

} //ConstraintRequirementImpl
