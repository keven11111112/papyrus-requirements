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

import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.AbstractionLevelReqCharac;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.RequirementGenericCharacteristicsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstraction Level Req Charac</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.AbstractionLevelReqCharacImpl#getAbstractionLevel <em>Abstraction Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbstractionLevelReqCharacImpl extends MinimalEObjectImpl.Container implements AbstractionLevelReqCharac {
	/**
	 * The default value of the '{@link #getAbstractionLevel() <em>Abstraction Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractionLevel()
	 * @generated
	 * @ordered
	 */
	protected static final Object ABSTRACTION_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAbstractionLevel() <em>Abstraction Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractionLevel()
	 * @generated
	 * @ordered
	 */
	protected Object abstractionLevel = ABSTRACTION_LEVEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractionLevelReqCharacImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementGenericCharacteristicsPackage.Literals.ABSTRACTION_LEVEL_REQ_CHARAC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getAbstractionLevel() {
		return abstractionLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstractionLevel(Object newAbstractionLevel) {
		Object oldAbstractionLevel = abstractionLevel;
		abstractionLevel = newAbstractionLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementGenericCharacteristicsPackage.ABSTRACTION_LEVEL_REQ_CHARAC__ABSTRACTION_LEVEL, oldAbstractionLevel, abstractionLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RequirementGenericCharacteristicsPackage.ABSTRACTION_LEVEL_REQ_CHARAC__ABSTRACTION_LEVEL:
				return getAbstractionLevel();
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
			case RequirementGenericCharacteristicsPackage.ABSTRACTION_LEVEL_REQ_CHARAC__ABSTRACTION_LEVEL:
				setAbstractionLevel(newValue);
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
			case RequirementGenericCharacteristicsPackage.ABSTRACTION_LEVEL_REQ_CHARAC__ABSTRACTION_LEVEL:
				setAbstractionLevel(ABSTRACTION_LEVEL_EDEFAULT);
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
			case RequirementGenericCharacteristicsPackage.ABSTRACTION_LEVEL_REQ_CHARAC__ABSTRACTION_LEVEL:
				return ABSTRACTION_LEVEL_EDEFAULT == null ? abstractionLevel != null : !ABSTRACTION_LEVEL_EDEFAULT.equals(abstractionLevel);
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
		result.append(" (abstractionLevel: "); //$NON-NLS-1$
		result.append(abstractionLevel);
		result.append(')');
		return result.toString();
	}

} //AbstractionLevelReqCharacImpl
