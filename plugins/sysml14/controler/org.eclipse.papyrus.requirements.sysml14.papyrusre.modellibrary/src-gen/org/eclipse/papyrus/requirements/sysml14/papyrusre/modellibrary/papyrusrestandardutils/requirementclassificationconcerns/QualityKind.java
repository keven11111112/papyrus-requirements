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
package org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementclassificationconcerns;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Quality Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementclassificationconcerns.RequirementClassificationConcernsPackage#getQualityKind()
 * @model
 * @generated
 */
public enum QualityKind implements Enumerator {
	/**
	 * The '<em><b>Adaptability</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADAPTABILITY_VALUE
	 * @generated
	 * @ordered
	 */
	ADAPTABILITY(0, "Adaptability", "Adaptability"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Availability</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AVAILABILITY_VALUE
	 * @generated
	 * @ordered
	 */
	AVAILABILITY(1, "Availability", "Availability"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Compatability</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPATABILITY_VALUE
	 * @generated
	 * @ordered
	 */
	COMPATABILITY(2, "Compatability", "Compatability"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Maintainability</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAINTAINABILITY_VALUE
	 * @generated
	 * @ordered
	 */
	MAINTAINABILITY(3, "Maintainability", "Maintainability"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Portability</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PORTABILITY_VALUE
	 * @generated
	 * @ordered
	 */
	PORTABILITY(4, "Portability", "Portability"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Reliability</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELIABILITY_VALUE
	 * @generated
	 * @ordered
	 */
	RELIABILITY(5, "Reliability", "Reliability"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Safety</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAFETY_VALUE
	 * @generated
	 * @ordered
	 */
	SAFETY(6, "Safety", "Safety"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Security</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECURITY_VALUE
	 * @generated
	 * @ordered
	 */
	SECURITY(7, "Security", "Security"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Usability</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USABILITY_VALUE
	 * @generated
	 * @ordered
	 */
	USABILITY(8, "Usability", "Usability"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Variability</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VARIABILITY_VALUE
	 * @generated
	 * @ordered
	 */
	VARIABILITY(9, "Variability", "Variability"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Adaptability</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Adaptability</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ADAPTABILITY
	 * @model name="Adaptability"
	 * @generated
	 * @ordered
	 */
	public static final int ADAPTABILITY_VALUE = 0;

	/**
	 * The '<em><b>Availability</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Availability</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AVAILABILITY
	 * @model name="Availability"
	 * @generated
	 * @ordered
	 */
	public static final int AVAILABILITY_VALUE = 1;

	/**
	 * The '<em><b>Compatability</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Compatability</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPATABILITY
	 * @model name="Compatability"
	 * @generated
	 * @ordered
	 */
	public static final int COMPATABILITY_VALUE = 2;

	/**
	 * The '<em><b>Maintainability</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Maintainability</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAINTAINABILITY
	 * @model name="Maintainability"
	 * @generated
	 * @ordered
	 */
	public static final int MAINTAINABILITY_VALUE = 3;

	/**
	 * The '<em><b>Portability</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Portability</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PORTABILITY
	 * @model name="Portability"
	 * @generated
	 * @ordered
	 */
	public static final int PORTABILITY_VALUE = 4;

	/**
	 * The '<em><b>Reliability</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Reliability</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RELIABILITY
	 * @model name="Reliability"
	 * @generated
	 * @ordered
	 */
	public static final int RELIABILITY_VALUE = 5;

	/**
	 * The '<em><b>Safety</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Safety</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SAFETY
	 * @model name="Safety"
	 * @generated
	 * @ordered
	 */
	public static final int SAFETY_VALUE = 6;

	/**
	 * The '<em><b>Security</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Security</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SECURITY
	 * @model name="Security"
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_VALUE = 7;

	/**
	 * The '<em><b>Usability</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Usability</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #USABILITY
	 * @model name="Usability"
	 * @generated
	 * @ordered
	 */
	public static final int USABILITY_VALUE = 8;

	/**
	 * The '<em><b>Variability</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Variability</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VARIABILITY
	 * @model name="Variability"
	 * @generated
	 * @ordered
	 */
	public static final int VARIABILITY_VALUE = 9;

	/**
	 * An array of all the '<em><b>Quality Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final QualityKind[] VALUES_ARRAY =
		new QualityKind[] {
			ADAPTABILITY,
			AVAILABILITY,
			COMPATABILITY,
			MAINTAINABILITY,
			PORTABILITY,
			RELIABILITY,
			SAFETY,
			SECURITY,
			USABILITY,
			VARIABILITY,
		};

	/**
	 * A public read-only list of all the '<em><b>Quality Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<QualityKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Quality Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static QualityKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			QualityKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Quality Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static QualityKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			QualityKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Quality Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static QualityKind get(int value) {
		switch (value) {
			case ADAPTABILITY_VALUE: return ADAPTABILITY;
			case AVAILABILITY_VALUE: return AVAILABILITY;
			case COMPATABILITY_VALUE: return COMPATABILITY;
			case MAINTAINABILITY_VALUE: return MAINTAINABILITY;
			case PORTABILITY_VALUE: return PORTABILITY;
			case RELIABILITY_VALUE: return RELIABILITY;
			case SAFETY_VALUE: return SAFETY;
			case SECURITY_VALUE: return SECURITY;
			case USABILITY_VALUE: return USABILITY;
			case VARIABILITY_VALUE: return VARIABILITY;
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
	private QualityKind(int value, String name, String literal) {
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
	
} //QualityKind
