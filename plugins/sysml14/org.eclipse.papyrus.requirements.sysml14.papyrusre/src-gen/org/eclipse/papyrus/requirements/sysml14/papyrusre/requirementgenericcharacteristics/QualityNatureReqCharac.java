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
package org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementclassificationconcerns.QualityKind;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quality Nature Req Charac</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.QualityNatureReqCharac#getQualityNature <em>Quality Nature</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.RequirementGenericCharacteristicsPackage#getQualityNatureReqCharac()
 * @model
 * @generated
 */
public interface QualityNatureReqCharac extends EObject {
	/**
	 * Returns the value of the '<em><b>Quality Nature</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementclassificationconcerns.QualityKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quality Nature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quality Nature</em>' attribute.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementclassificationconcerns.QualityKind
	 * @see #setQualityNature(QualityKind)
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.RequirementGenericCharacteristicsPackage#getQualityNatureReqCharac_QualityNature()
	 * @model ordered="false"
	 * @generated
	 */
	QualityKind getQualityNature();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.QualityNatureReqCharac#getQualityNature <em>Quality Nature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quality Nature</em>' attribute.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementclassificationconcerns.QualityKind
	 * @see #getQualityNature()
	 * @generated
	 */
	void setQualityNature(QualityKind value);

} // QualityNatureReqCharac
