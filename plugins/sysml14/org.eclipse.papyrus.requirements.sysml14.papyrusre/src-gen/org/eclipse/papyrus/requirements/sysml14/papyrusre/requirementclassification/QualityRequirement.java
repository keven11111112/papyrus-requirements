/**
 * Copyright (c) 2017 CEA LIST.
 * 
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   S�bastien Gerard (CEA LIST) <sebastien.gerard@cea.fr> - Initial API and implementation
 *   Yupanqui Munoz Julho (CEA LIST) <yupanqui.munozjulho@cea.fr> - Initial API and implementation
 * 
 */
package org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.Requirement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quality Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.QualityRequirement#getSpecificQualityKind <em>Specific Quality Kind</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.RequirementClassificationPackage#getQualityRequirement()
 * @model
 * @generated
 */
public interface QualityRequirement extends Requirement {
	/**
	 * Returns the value of the '<em><b>Specific Quality Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specific Quality Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specific Quality Kind</em>' attribute.
	 * @see #setSpecificQualityKind(Object)
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.RequirementClassificationPackage#getQualityRequirement_SpecificQualityKind()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Object getSpecificQualityKind();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.QualityRequirement#getSpecificQualityKind <em>Specific Quality Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specific Quality Kind</em>' attribute.
	 * @see #getSpecificQualityKind()
	 * @generated
	 */
	void setSpecificQualityKind(Object value);

} // QualityRequirement
