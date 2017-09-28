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
package org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementclassificationconcerns.WorkloadCapacitiesKind;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.Requirement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workload Capacity Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.WorkloadCapacityRequirement#getWorkloadCapacity <em>Workload Capacity</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.RequirementClassificationPackage#getWorkloadCapacityRequirement()
 * @model
 * @generated
 */
public interface WorkloadCapacityRequirement extends Requirement {
	/**
	 * Returns the value of the '<em><b>Workload Capacity</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementclassificationconcerns.WorkloadCapacitiesKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workload Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workload Capacity</em>' attribute.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementclassificationconcerns.WorkloadCapacitiesKind
	 * @see #setWorkloadCapacity(WorkloadCapacitiesKind)
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.RequirementClassificationPackage#getWorkloadCapacityRequirement_WorkloadCapacity()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	WorkloadCapacitiesKind getWorkloadCapacity();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.WorkloadCapacityRequirement#getWorkloadCapacity <em>Workload Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workload Capacity</em>' attribute.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementclassificationconcerns.WorkloadCapacitiesKind
	 * @see #getWorkloadCapacity()
	 * @generated
	 */
	void setWorkloadCapacity(WorkloadCapacitiesKind value);

} // WorkloadCapacityRequirement
