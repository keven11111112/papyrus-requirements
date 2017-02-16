/**
 * Copyright (c) 2016 CEA LIST.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   CEA LIST - Initial API and implementation
 * 
 */
package org.omg.smm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ranking Measure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.smm.RankingMeasure#getInterval <em>Interval</em>}</li>
 * </ul>
 *
 * @see org.omg.smm.SmmPackage#getRankingMeasure()
 * @model
 * @generated
 */
public interface RankingMeasure extends DimensionalMeasure {
	/**
	 * Returns the value of the '<em><b>Interval</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.smm.RankingInterval}.
	 * It is bidirectional and its opposite is '{@link org.omg.smm.RankingInterval#getRanking <em>Ranking</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interval</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval</em>' containment reference list.
	 * @see org.omg.smm.SmmPackage#getRankingMeasure_Interval()
	 * @see org.omg.smm.RankingInterval#getRanking
	 * @model opposite="ranking" containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<RankingInterval> getInterval();

} // RankingMeasure
