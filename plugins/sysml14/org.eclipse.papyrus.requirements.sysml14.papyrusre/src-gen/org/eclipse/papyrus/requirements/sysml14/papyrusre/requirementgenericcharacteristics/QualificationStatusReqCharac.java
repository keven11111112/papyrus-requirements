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
import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementandprocessconcerns.QualificationStatusKind;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qualification Status Req Charac</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.QualificationStatusReqCharac#getQualificationStatus <em>Qualification Status</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.RequirementGenericCharacteristicsPackage#getQualificationStatusReqCharac()
 * @model
 * @generated
 */
public interface QualificationStatusReqCharac extends EObject {
	/**
	 * Returns the value of the '<em><b>Qualification Status</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementandprocessconcerns.QualificationStatusKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualification Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualification Status</em>' attribute.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementandprocessconcerns.QualificationStatusKind
	 * @see #setQualificationStatus(QualificationStatusKind)
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.RequirementGenericCharacteristicsPackage#getQualificationStatusReqCharac_QualificationStatus()
	 * @model ordered="false"
	 * @generated
	 */
	QualificationStatusKind getQualificationStatus();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.QualificationStatusReqCharac#getQualificationStatus <em>Qualification Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualification Status</em>' attribute.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementandprocessconcerns.QualificationStatusKind
	 * @see #getQualificationStatus()
	 * @generated
	 */
	void setQualificationStatus(QualificationStatusKind value);

} // QualificationStatusReqCharac
