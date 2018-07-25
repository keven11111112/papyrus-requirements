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
 * A representation of the literals of the enumeration '<em><b>Abstraction Level Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementscharacteristicsconcerns.RequirementsCharacteristicsConcernsPackage#getAbstractionLevelKind()
 * @model
 * @generated
 */
public enum AbstractionLevelKind implements Enumerator {
	/**
	 * The '<em><b>Specification Level</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPECIFICATION_LEVEL_VALUE
	 * @generated
	 * @ordered
	 */
	SPECIFICATION_LEVEL(0, "SpecificationLevel", "SpecificationLevel"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Analysis Level</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANALYSIS_LEVEL_VALUE
	 * @generated
	 * @ordered
	 */
	ANALYSIS_LEVEL(1, "AnalysisLevel", "AnalysisLevel"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Design Level</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DESIGN_LEVEL_VALUE
	 * @generated
	 * @ordered
	 */
	DESIGN_LEVEL(2, "DesignLevel", "DesignLevel"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Implementation Level</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMPLEMENTATION_LEVEL_VALUE
	 * @generated
	 * @ordered
	 */
	IMPLEMENTATION_LEVEL(3, "ImplementationLevel", "ImplementationLevel"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Specfication level</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPECFICATION_LEVEL_VALUE
	 * @generated
	 * @ordered
	 */
	SPECFICATION_LEVEL(4, "Specfication_level", "Specfication_level"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Operational Level</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPERATIONAL_LEVEL_VALUE
	 * @generated
	 * @ordered
	 */
	OPERATIONAL_LEVEL(5, "OperationalLevel", "OperationalLevel"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Specification Level</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Specification Level</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPECIFICATION_LEVEL
	 * @model name="SpecificationLevel"
	 * @generated
	 * @ordered
	 */
	public static final int SPECIFICATION_LEVEL_VALUE = 0;

	/**
	 * The '<em><b>Analysis Level</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Analysis Level</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANALYSIS_LEVEL
	 * @model name="AnalysisLevel"
	 * @generated
	 * @ordered
	 */
	public static final int ANALYSIS_LEVEL_VALUE = 1;

	/**
	 * The '<em><b>Design Level</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Design Level</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DESIGN_LEVEL
	 * @model name="DesignLevel"
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN_LEVEL_VALUE = 2;

	/**
	 * The '<em><b>Implementation Level</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Implementation Level</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IMPLEMENTATION_LEVEL
	 * @model name="ImplementationLevel"
	 * @generated
	 * @ordered
	 */
	public static final int IMPLEMENTATION_LEVEL_VALUE = 3;

	/**
	 * The '<em><b>Specfication level</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Specfication level</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPECFICATION_LEVEL
	 * @model name="Specfication_level"
	 * @generated
	 * @ordered
	 */
	public static final int SPECFICATION_LEVEL_VALUE = 4;

	/**
	 * The '<em><b>Operational Level</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Operational Level</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPERATIONAL_LEVEL
	 * @model name="OperationalLevel"
	 * @generated
	 * @ordered
	 */
	public static final int OPERATIONAL_LEVEL_VALUE = 5;

	/**
	 * An array of all the '<em><b>Abstraction Level Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AbstractionLevelKind[] VALUES_ARRAY =
		new AbstractionLevelKind[] {
			SPECIFICATION_LEVEL,
			ANALYSIS_LEVEL,
			DESIGN_LEVEL,
			IMPLEMENTATION_LEVEL,
			SPECFICATION_LEVEL,
			OPERATIONAL_LEVEL,
		};

	/**
	 * A public read-only list of all the '<em><b>Abstraction Level Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AbstractionLevelKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Abstraction Level Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AbstractionLevelKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AbstractionLevelKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Abstraction Level Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AbstractionLevelKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AbstractionLevelKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Abstraction Level Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AbstractionLevelKind get(int value) {
		switch (value) {
			case SPECIFICATION_LEVEL_VALUE: return SPECIFICATION_LEVEL;
			case ANALYSIS_LEVEL_VALUE: return ANALYSIS_LEVEL;
			case DESIGN_LEVEL_VALUE: return DESIGN_LEVEL;
			case IMPLEMENTATION_LEVEL_VALUE: return IMPLEMENTATION_LEVEL;
			case SPECFICATION_LEVEL_VALUE: return SPECFICATION_LEVEL;
			case OPERATIONAL_LEVEL_VALUE: return OPERATIONAL_LEVEL;
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
	private AbstractionLevelKind(int value, String name, String literal) {
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
	
} //AbstractionLevelKind
