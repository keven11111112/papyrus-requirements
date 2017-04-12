/**
 * Copyright (c) 2017 CEA LIST.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  
 *  	Mauricio Alferez (mauricio.alferez@cea.fr) CEA LIST - Initial API and implementation
 * 
 */
package org.eclipse.papyrus.requirements.extendedsysml.extendedsysmlprofile.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.papyrus.requirements.extendedsysml.extendedsysmlprofile.Depth;
import org.eclipse.papyrus.requirements.extendedsysml.extendedsysmlprofile.ExtendedSysMLProfilePackage;
import org.eclipse.papyrus.requirements.extendedsysml.extendedsysmlprofile.RequirementsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirements Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.requirements.extendedsysml.extendedsysmlprofile.impl.RequirementsPackageImpl#getBase_Package <em>Base Package</em>}</li>
 *   <li>{@link org.eclipse.papyrus.requirements.extendedsysml.extendedsysmlprofile.impl.RequirementsPackageImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.eclipse.papyrus.requirements.extendedsysml.extendedsysmlprofile.impl.RequirementsPackageImpl#getIdDepth <em>Id Depth</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequirementsPackageImpl extends MinimalEObjectImpl.Container implements RequirementsPackage {
	/**
	 * The cached value of the '{@link #getBase_Package() <em>Base Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Package()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Package base_Package;

	/**
	 * The default value of the '{@link #getAlias() <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected static final String ALIAS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getAlias() <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected String alias = ALIAS_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdDepth() <em>Id Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdDepth()
	 * @generated
	 * @ordered
	 */
	protected static final Depth ID_DEPTH_EDEFAULT = Depth.ALL_LEVELS;

	/**
	 * The cached value of the '{@link #getIdDepth() <em>Id Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdDepth()
	 * @generated
	 * @ordered
	 */
	protected Depth idDepth = ID_DEPTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementsPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtendedSysMLProfilePackage.Literals.REQUIREMENTS_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Package getBase_Package() {
		if (base_Package != null && base_Package.eIsProxy()) {
			InternalEObject oldBase_Package = (InternalEObject)base_Package;
			base_Package = (org.eclipse.uml2.uml.Package)eResolveProxy(oldBase_Package);
			if (base_Package != oldBase_Package) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExtendedSysMLProfilePackage.REQUIREMENTS_PACKAGE__BASE_PACKAGE, oldBase_Package, base_Package));
			}
		}
		return base_Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Package basicGetBase_Package() {
		return base_Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Package(org.eclipse.uml2.uml.Package newBase_Package) {
		org.eclipse.uml2.uml.Package oldBase_Package = base_Package;
		base_Package = newBase_Package;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedSysMLProfilePackage.REQUIREMENTS_PACKAGE__BASE_PACKAGE, oldBase_Package, base_Package));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlias() {
		return alias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlias(String newAlias) {
		String oldAlias = alias;
		alias = newAlias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedSysMLProfilePackage.REQUIREMENTS_PACKAGE__ALIAS, oldAlias, alias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Depth getIdDepth() {
		return idDepth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdDepth(Depth newIdDepth) {
		Depth oldIdDepth = idDepth;
		idDepth = newIdDepth == null ? ID_DEPTH_EDEFAULT : newIdDepth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedSysMLProfilePackage.REQUIREMENTS_PACKAGE__ID_DEPTH, oldIdDepth, idDepth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExtendedSysMLProfilePackage.REQUIREMENTS_PACKAGE__BASE_PACKAGE:
				if (resolve) return getBase_Package();
				return basicGetBase_Package();
			case ExtendedSysMLProfilePackage.REQUIREMENTS_PACKAGE__ALIAS:
				return getAlias();
			case ExtendedSysMLProfilePackage.REQUIREMENTS_PACKAGE__ID_DEPTH:
				return getIdDepth();
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
			case ExtendedSysMLProfilePackage.REQUIREMENTS_PACKAGE__BASE_PACKAGE:
				setBase_Package((org.eclipse.uml2.uml.Package)newValue);
				return;
			case ExtendedSysMLProfilePackage.REQUIREMENTS_PACKAGE__ALIAS:
				setAlias((String)newValue);
				return;
			case ExtendedSysMLProfilePackage.REQUIREMENTS_PACKAGE__ID_DEPTH:
				setIdDepth((Depth)newValue);
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
			case ExtendedSysMLProfilePackage.REQUIREMENTS_PACKAGE__BASE_PACKAGE:
				setBase_Package((org.eclipse.uml2.uml.Package)null);
				return;
			case ExtendedSysMLProfilePackage.REQUIREMENTS_PACKAGE__ALIAS:
				setAlias(ALIAS_EDEFAULT);
				return;
			case ExtendedSysMLProfilePackage.REQUIREMENTS_PACKAGE__ID_DEPTH:
				setIdDepth(ID_DEPTH_EDEFAULT);
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
			case ExtendedSysMLProfilePackage.REQUIREMENTS_PACKAGE__BASE_PACKAGE:
				return base_Package != null;
			case ExtendedSysMLProfilePackage.REQUIREMENTS_PACKAGE__ALIAS:
				return ALIAS_EDEFAULT == null ? alias != null : !ALIAS_EDEFAULT.equals(alias);
			case ExtendedSysMLProfilePackage.REQUIREMENTS_PACKAGE__ID_DEPTH:
				return idDepth != ID_DEPTH_EDEFAULT;
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
		result.append(" (alias: ");
		result.append(alias);
		result.append(", idDepth: ");
		result.append(idDepth);
		result.append(')');
		return result.toString();
	}

} //RequirementsPackageImpl
