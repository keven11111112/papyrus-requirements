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
package org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementscharacteristicsconcerns;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Life Cycle Phase Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementscharacteristicsconcerns.RequirementsCharacteristicsConcernsPackage#getLifeCyclePhaseKind()
 * @model
 * @generated
 */
public enum LifeCyclePhaseKind implements Enumerator {
	/**
	 * The '<em><b>Pre Concept</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRE_CONCEPT_VALUE
	 * @generated
	 * @ordered
	 */
	PRE_CONCEPT(0, "PreConcept", "PreConcept"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Concept</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONCEPT_VALUE
	 * @generated
	 * @ordered
	 */
	CONCEPT(1, "Concept", "Concept"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Development</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEVELOPMENT_VALUE
	 * @generated
	 * @ordered
	 */
	DEVELOPMENT(2, "Development", "Development"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Manufacturing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANUFACTURING_VALUE
	 * @generated
	 * @ordered
	 */
	MANUFACTURING(3, "Manufacturing", "Manufacturing"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Integration</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGRATION_VALUE
	 * @generated
	 * @ordered
	 */
	INTEGRATION(4, "Integration", "Integration"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Test</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEST_VALUE
	 * @generated
	 * @ordered
	 */
	TEST(5, "Test", "Test"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Deployment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPLOYMENT_VALUE
	 * @generated
	 * @ordered
	 */
	DEPLOYMENT(6, "Deployment", "Deployment"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Delivery</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELIVERY_VALUE
	 * @generated
	 * @ordered
	 */
	DELIVERY(7, "Delivery", "Delivery"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Installation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSTALLATION_VALUE
	 * @generated
	 * @ordered
	 */
	INSTALLATION(8, "Installation", "Installation"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Operation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPERATION_VALUE
	 * @generated
	 * @ordered
	 */
	OPERATION(9, "Operation", "Operation"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Support</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUPPORT_VALUE
	 * @generated
	 * @ordered
	 */
	SUPPORT(10, "Support", "Support"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Disposal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISPOSAL_VALUE
	 * @generated
	 * @ordered
	 */
	DISPOSAL(11, "Disposal", "Disposal"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Pre Concept</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pre Concept</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRE_CONCEPT
	 * @model name="PreConcept"
	 * @generated
	 * @ordered
	 */
	public static final int PRE_CONCEPT_VALUE = 0;

	/**
	 * The '<em><b>Concept</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Concept</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONCEPT
	 * @model name="Concept"
	 * @generated
	 * @ordered
	 */
	public static final int CONCEPT_VALUE = 1;

	/**
	 * The '<em><b>Development</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Development</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEVELOPMENT
	 * @model name="Development"
	 * @generated
	 * @ordered
	 */
	public static final int DEVELOPMENT_VALUE = 2;

	/**
	 * The '<em><b>Manufacturing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Manufacturing</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MANUFACTURING
	 * @model name="Manufacturing"
	 * @generated
	 * @ordered
	 */
	public static final int MANUFACTURING_VALUE = 3;

	/**
	 * The '<em><b>Integration</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Integration</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTEGRATION
	 * @model name="Integration"
	 * @generated
	 * @ordered
	 */
	public static final int INTEGRATION_VALUE = 4;

	/**
	 * The '<em><b>Test</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Test</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEST
	 * @model name="Test"
	 * @generated
	 * @ordered
	 */
	public static final int TEST_VALUE = 5;

	/**
	 * The '<em><b>Deployment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Deployment</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEPLOYMENT
	 * @model name="Deployment"
	 * @generated
	 * @ordered
	 */
	public static final int DEPLOYMENT_VALUE = 6;

	/**
	 * The '<em><b>Delivery</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Delivery</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DELIVERY
	 * @model name="Delivery"
	 * @generated
	 * @ordered
	 */
	public static final int DELIVERY_VALUE = 7;

	/**
	 * The '<em><b>Installation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Installation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INSTALLATION
	 * @model name="Installation"
	 * @generated
	 * @ordered
	 */
	public static final int INSTALLATION_VALUE = 8;

	/**
	 * The '<em><b>Operation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Operation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPERATION
	 * @model name="Operation"
	 * @generated
	 * @ordered
	 */
	public static final int OPERATION_VALUE = 9;

	/**
	 * The '<em><b>Support</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Support</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUPPORT
	 * @model name="Support"
	 * @generated
	 * @ordered
	 */
	public static final int SUPPORT_VALUE = 10;

	/**
	 * The '<em><b>Disposal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Disposal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISPOSAL
	 * @model name="Disposal"
	 * @generated
	 * @ordered
	 */
	public static final int DISPOSAL_VALUE = 11;

	/**
	 * An array of all the '<em><b>Life Cycle Phase Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LifeCyclePhaseKind[] VALUES_ARRAY =
		new LifeCyclePhaseKind[] {
			PRE_CONCEPT,
			CONCEPT,
			DEVELOPMENT,
			MANUFACTURING,
			INTEGRATION,
			TEST,
			DEPLOYMENT,
			DELIVERY,
			INSTALLATION,
			OPERATION,
			SUPPORT,
			DISPOSAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Life Cycle Phase Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LifeCyclePhaseKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Life Cycle Phase Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LifeCyclePhaseKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LifeCyclePhaseKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Life Cycle Phase Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LifeCyclePhaseKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LifeCyclePhaseKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Life Cycle Phase Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LifeCyclePhaseKind get(int value) {
		switch (value) {
			case PRE_CONCEPT_VALUE: return PRE_CONCEPT;
			case CONCEPT_VALUE: return CONCEPT;
			case DEVELOPMENT_VALUE: return DEVELOPMENT;
			case MANUFACTURING_VALUE: return MANUFACTURING;
			case INTEGRATION_VALUE: return INTEGRATION;
			case TEST_VALUE: return TEST;
			case DEPLOYMENT_VALUE: return DEPLOYMENT;
			case DELIVERY_VALUE: return DELIVERY;
			case INSTALLATION_VALUE: return INSTALLATION;
			case OPERATION_VALUE: return OPERATION;
			case SUPPORT_VALUE: return SUPPORT;
			case DISPOSAL_VALUE: return DISPOSAL;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private LifeCyclePhaseKind(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //LifeCyclePhaseKind
