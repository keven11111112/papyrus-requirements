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

import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementscharacteristicsconcerns.LifeCyclePhaseKind;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.LifeCyclePhaseReqCharac;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.RequirementGenericCharacteristicsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Life Cycle Phase Req Charac</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.LifeCyclePhaseReqCharacImpl#getLifeCyclePhase <em>Life Cycle Phase</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LifeCyclePhaseReqCharacImpl extends MinimalEObjectImpl.Container implements LifeCyclePhaseReqCharac {
	/**
	 * The default value of the '{@link #getLifeCyclePhase() <em>Life Cycle Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifeCyclePhase()
	 * @generated
	 * @ordered
	 */
	protected static final LifeCyclePhaseKind LIFE_CYCLE_PHASE_EDEFAULT = LifeCyclePhaseKind.PRE_CONCEPT;

	/**
	 * The cached value of the '{@link #getLifeCyclePhase() <em>Life Cycle Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifeCyclePhase()
	 * @generated
	 * @ordered
	 */
	protected LifeCyclePhaseKind lifeCyclePhase = LIFE_CYCLE_PHASE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LifeCyclePhaseReqCharacImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementGenericCharacteristicsPackage.Literals.LIFE_CYCLE_PHASE_REQ_CHARAC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LifeCyclePhaseKind getLifeCyclePhase() {
		return lifeCyclePhase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLifeCyclePhase(LifeCyclePhaseKind newLifeCyclePhase) {
		LifeCyclePhaseKind oldLifeCyclePhase = lifeCyclePhase;
		lifeCyclePhase = newLifeCyclePhase == null ? LIFE_CYCLE_PHASE_EDEFAULT : newLifeCyclePhase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementGenericCharacteristicsPackage.LIFE_CYCLE_PHASE_REQ_CHARAC__LIFE_CYCLE_PHASE, oldLifeCyclePhase, lifeCyclePhase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RequirementGenericCharacteristicsPackage.LIFE_CYCLE_PHASE_REQ_CHARAC__LIFE_CYCLE_PHASE:
				return getLifeCyclePhase();
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
			case RequirementGenericCharacteristicsPackage.LIFE_CYCLE_PHASE_REQ_CHARAC__LIFE_CYCLE_PHASE:
				setLifeCyclePhase((LifeCyclePhaseKind)newValue);
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
			case RequirementGenericCharacteristicsPackage.LIFE_CYCLE_PHASE_REQ_CHARAC__LIFE_CYCLE_PHASE:
				setLifeCyclePhase(LIFE_CYCLE_PHASE_EDEFAULT);
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
			case RequirementGenericCharacteristicsPackage.LIFE_CYCLE_PHASE_REQ_CHARAC__LIFE_CYCLE_PHASE:
				return lifeCyclePhase != LIFE_CYCLE_PHASE_EDEFAULT;
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
		result.append(" (lifeCyclePhase: "); //$NON-NLS-1$
		result.append(lifeCyclePhase);
		result.append(')');
		return result.toString();
	}

} //LifeCyclePhaseReqCharacImpl
