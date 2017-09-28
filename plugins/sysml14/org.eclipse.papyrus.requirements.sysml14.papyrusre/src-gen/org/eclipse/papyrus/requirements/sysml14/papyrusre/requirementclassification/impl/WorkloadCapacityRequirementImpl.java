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

import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementclassificationconcerns.WorkloadCapacitiesKind;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.RequirementClassificationPackage;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.WorkloadCapacityRequirement;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workload Capacity Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.impl.WorkloadCapacityRequirementImpl#getWorkloadCapacity <em>Workload Capacity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkloadCapacityRequirementImpl extends RequirementImpl implements WorkloadCapacityRequirement {
	/**
	 * The default value of the '{@link #getWorkloadCapacity() <em>Workload Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkloadCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final WorkloadCapacitiesKind WORKLOAD_CAPACITY_EDEFAULT = WorkloadCapacitiesKind.BOUND;

	/**
	 * The cached value of the '{@link #getWorkloadCapacity() <em>Workload Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkloadCapacity()
	 * @generated
	 * @ordered
	 */
	protected WorkloadCapacitiesKind workloadCapacity = WORKLOAD_CAPACITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkloadCapacityRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementClassificationPackage.Literals.WORKLOAD_CAPACITY_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkloadCapacitiesKind getWorkloadCapacity() {
		return workloadCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkloadCapacity(WorkloadCapacitiesKind newWorkloadCapacity) {
		WorkloadCapacitiesKind oldWorkloadCapacity = workloadCapacity;
		workloadCapacity = newWorkloadCapacity == null ? WORKLOAD_CAPACITY_EDEFAULT : newWorkloadCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementClassificationPackage.WORKLOAD_CAPACITY_REQUIREMENT__WORKLOAD_CAPACITY, oldWorkloadCapacity, workloadCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RequirementClassificationPackage.WORKLOAD_CAPACITY_REQUIREMENT__WORKLOAD_CAPACITY:
				return getWorkloadCapacity();
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
			case RequirementClassificationPackage.WORKLOAD_CAPACITY_REQUIREMENT__WORKLOAD_CAPACITY:
				setWorkloadCapacity((WorkloadCapacitiesKind)newValue);
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
			case RequirementClassificationPackage.WORKLOAD_CAPACITY_REQUIREMENT__WORKLOAD_CAPACITY:
				setWorkloadCapacity(WORKLOAD_CAPACITY_EDEFAULT);
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
			case RequirementClassificationPackage.WORKLOAD_CAPACITY_REQUIREMENT__WORKLOAD_CAPACITY:
				return workloadCapacity != WORKLOAD_CAPACITY_EDEFAULT;
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
		result.append(" (workloadCapacity: "); //$NON-NLS-1$
		result.append(workloadCapacity);
		result.append(')');
		return result.toString();
	}

} //WorkloadCapacityRequirementImpl
