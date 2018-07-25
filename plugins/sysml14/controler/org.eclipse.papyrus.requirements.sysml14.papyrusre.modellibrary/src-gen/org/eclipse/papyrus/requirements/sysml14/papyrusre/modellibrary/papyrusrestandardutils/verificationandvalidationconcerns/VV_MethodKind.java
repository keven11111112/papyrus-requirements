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
package org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.verificationandvalidationconcerns;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>VV Method Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.verificationandvalidationconcerns.VerificationAndValidationConcernsPackage#getVV_MethodKind()
 * @model
 * @generated
 */
public enum VV_MethodKind implements Enumerator {
	/**
	 * The '<em><b>Analysis</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANALYSIS_VALUE
	 * @generated
	 * @ordered
	 */
	ANALYSIS(0, "Analysis", "Analysis"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Inspection</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSPECTION_VALUE
	 * @generated
	 * @ordered
	 */
	INSPECTION(1, "Inspection", "Inspection"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>System Test</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYSTEM_TEST_VALUE
	 * @generated
	 * @ordered
	 */
	SYSTEM_TEST(2, "SystemTest", "SystemTest"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Component Test</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPONENT_TEST_VALUE
	 * @generated
	 * @ordered
	 */
	COMPONENT_TEST(3, "ComponentTest", "ComponentTest"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Analysis</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Analysis</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANALYSIS
	 * @model name="Analysis"
	 * @generated
	 * @ordered
	 */
	public static final int ANALYSIS_VALUE = 0;

	/**
	 * The '<em><b>Inspection</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Inspection</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INSPECTION
	 * @model name="Inspection"
	 * @generated
	 * @ordered
	 */
	public static final int INSPECTION_VALUE = 1;

	/**
	 * The '<em><b>System Test</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>System Test</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SYSTEM_TEST
	 * @model name="SystemTest"
	 * @generated
	 * @ordered
	 */
	public static final int SYSTEM_TEST_VALUE = 2;

	/**
	 * The '<em><b>Component Test</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Component Test</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPONENT_TEST
	 * @model name="ComponentTest"
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT_TEST_VALUE = 3;

	/**
	 * An array of all the '<em><b>VV Method Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final VV_MethodKind[] VALUES_ARRAY =
		new VV_MethodKind[] {
			ANALYSIS,
			INSPECTION,
			SYSTEM_TEST,
			COMPONENT_TEST,
		};

	/**
	 * A public read-only list of all the '<em><b>VV Method Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<VV_MethodKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>VV Method Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VV_MethodKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VV_MethodKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>VV Method Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VV_MethodKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VV_MethodKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>VV Method Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VV_MethodKind get(int value) {
		switch (value) {
			case ANALYSIS_VALUE: return ANALYSIS;
			case INSPECTION_VALUE: return INSPECTION;
			case SYSTEM_TEST_VALUE: return SYSTEM_TEST;
			case COMPONENT_TEST_VALUE: return COMPONENT_TEST;
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
	private VV_MethodKind(int value, String name, String literal) {
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
	
} //VV_MethodKind
