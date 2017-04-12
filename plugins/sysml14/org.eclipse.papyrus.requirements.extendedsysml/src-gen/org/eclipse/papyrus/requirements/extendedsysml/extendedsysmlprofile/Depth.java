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
package org.eclipse.papyrus.requirements.extendedsysml.extendedsysmlprofile;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Depth</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.requirements.extendedsysml.extendedsysmlprofile.ExtendedSysMLProfilePackage#getDepth()
 * @model
 * @generated
 */
public enum Depth implements Enumerator {
	/**
	 * The '<em><b>All Levels</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALL_LEVELS_VALUE
	 * @generated
	 * @ordered
	 */
	ALL_LEVELS(0, "All_Levels", "All_Levels"),

	/**
	 * The '<em><b>One Level</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONE_LEVEL_VALUE
	 * @generated
	 * @ordered
	 */
	ONE_LEVEL(1, "One_Level", "One_Level"),

	/**
	 * The '<em><b>Two Levels</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWO_LEVELS_VALUE
	 * @generated
	 * @ordered
	 */
	TWO_LEVELS(2, "Two_Levels", "Two_Levels"),

	/**
	 * The '<em><b>Three Levels</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THREE_LEVELS_VALUE
	 * @generated
	 * @ordered
	 */
	THREE_LEVELS(3, "Three_Levels", "Three_Levels"),

	/**
	 * The '<em><b>Four Levels</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FOUR_LEVELS_VALUE
	 * @generated
	 * @ordered
	 */
	FOUR_LEVELS(4, "Four_Levels", "Four_Levels");

	/**
	 * The '<em><b>All Levels</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>All Levels</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALL_LEVELS
	 * @model name="All_Levels"
	 * @generated
	 * @ordered
	 */
	public static final int ALL_LEVELS_VALUE = 0;

	/**
	 * The '<em><b>One Level</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>One Level</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ONE_LEVEL
	 * @model name="One_Level"
	 * @generated
	 * @ordered
	 */
	public static final int ONE_LEVEL_VALUE = 1;

	/**
	 * The '<em><b>Two Levels</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Two Levels</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TWO_LEVELS
	 * @model name="Two_Levels"
	 * @generated
	 * @ordered
	 */
	public static final int TWO_LEVELS_VALUE = 2;

	/**
	 * The '<em><b>Three Levels</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Three Levels</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #THREE_LEVELS
	 * @model name="Three_Levels"
	 * @generated
	 * @ordered
	 */
	public static final int THREE_LEVELS_VALUE = 3;

	/**
	 * The '<em><b>Four Levels</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Four Levels</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FOUR_LEVELS
	 * @model name="Four_Levels"
	 * @generated
	 * @ordered
	 */
	public static final int FOUR_LEVELS_VALUE = 4;

	/**
	 * An array of all the '<em><b>Depth</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Depth[] VALUES_ARRAY =
		new Depth[] {
			ALL_LEVELS,
			ONE_LEVEL,
			TWO_LEVELS,
			THREE_LEVELS,
			FOUR_LEVELS,
		};

	/**
	 * A public read-only list of all the '<em><b>Depth</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Depth> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Depth</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Depth get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Depth result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Depth</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Depth getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Depth result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Depth</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Depth get(int value) {
		switch (value) {
			case ALL_LEVELS_VALUE: return ALL_LEVELS;
			case ONE_LEVEL_VALUE: return ONE_LEVEL;
			case TWO_LEVELS_VALUE: return TWO_LEVELS;
			case THREE_LEVELS_VALUE: return THREE_LEVELS;
			case FOUR_LEVELS_VALUE: return FOUR_LEVELS;
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
	private Depth(int value, String name, String literal) {
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
	
} //Depth
