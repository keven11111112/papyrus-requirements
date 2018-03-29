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
package org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.*;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.AbstractionLevelReqCharac;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.AgreementStatusReqCharac;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.ApprovalAuthorityReqCharac;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.ImportanceReqCharac;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.LifeCyclePhaseReqCharac;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.MaturityReqCharac;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.OwnerReqCharac;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.PriorityReqCharac;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.QualificationStatusReqCharac;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.QualityNatureReqCharac;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.ReviewStatusReqCharac;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.SatifiactionStatusReqCharac;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.SourceReqCharac;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.ValidatorNameReqCharac;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.VerifierNameReqCharac;
import org.eclipse.papyrus.sysml14.requirements.Requirement;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementclassification.RequirementClassificationPackage
 * @generated
 */
public class RequirementClassificationSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RequirementClassificationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementClassificationSwitch() {
		if (modelPackage == null) {
			modelPackage = RequirementClassificationPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case RequirementClassificationPackage.PROJECT_REQUIREMENT: {
				ProjectRequirement projectRequirement = (ProjectRequirement)theEObject;
				T result = caseProjectRequirement(projectRequirement);
				if (result == null) result = caseRequirementGenericCharacteristics_Requirement(projectRequirement);
				if (result == null) result = caseAgreementStatusReqCharac(projectRequirement);
				if (result == null) result = caseImportanceReqCharac(projectRequirement);
				if (result == null) result = caseVerifierNameReqCharac(projectRequirement);
				if (result == null) result = caseAbstractionLevelReqCharac(projectRequirement);
				if (result == null) result = caseApprovalAuthorityReqCharac(projectRequirement);
				if (result == null) result = caseLifeCyclePhaseReqCharac(projectRequirement);
				if (result == null) result = caseMaturityReqCharac(projectRequirement);
				if (result == null) result = caseOwnerReqCharac(projectRequirement);
				if (result == null) result = casePriorityReqCharac(projectRequirement);
				if (result == null) result = caseQualificationStatusReqCharac(projectRequirement);
				if (result == null) result = caseQualityNatureReqCharac(projectRequirement);
				if (result == null) result = caseReviewStatusReqCharac(projectRequirement);
				if (result == null) result = caseSatifiactionStatusReqCharac(projectRequirement);
				if (result == null) result = caseSourceReqCharac(projectRequirement);
				if (result == null) result = caseValidatorNameReqCharac(projectRequirement);
				if (result == null) result = caseRequirement(projectRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequirementClassificationPackage.PROCESS_REQUIREMENT: {
				ProcessRequirement processRequirement = (ProcessRequirement)theEObject;
				T result = caseProcessRequirement(processRequirement);
				if (result == null) result = caseRequirementGenericCharacteristics_Requirement(processRequirement);
				if (result == null) result = caseAgreementStatusReqCharac(processRequirement);
				if (result == null) result = caseImportanceReqCharac(processRequirement);
				if (result == null) result = caseVerifierNameReqCharac(processRequirement);
				if (result == null) result = caseAbstractionLevelReqCharac(processRequirement);
				if (result == null) result = caseApprovalAuthorityReqCharac(processRequirement);
				if (result == null) result = caseLifeCyclePhaseReqCharac(processRequirement);
				if (result == null) result = caseMaturityReqCharac(processRequirement);
				if (result == null) result = caseOwnerReqCharac(processRequirement);
				if (result == null) result = casePriorityReqCharac(processRequirement);
				if (result == null) result = caseQualificationStatusReqCharac(processRequirement);
				if (result == null) result = caseQualityNatureReqCharac(processRequirement);
				if (result == null) result = caseReviewStatusReqCharac(processRequirement);
				if (result == null) result = caseSatifiactionStatusReqCharac(processRequirement);
				if (result == null) result = caseSourceReqCharac(processRequirement);
				if (result == null) result = caseValidatorNameReqCharac(processRequirement);
				if (result == null) result = caseRequirement(processRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequirementClassificationPackage.CONSTRAINT_REQUIREMENT: {
				ConstraintRequirement constraintRequirement = (ConstraintRequirement)theEObject;
				T result = caseConstraintRequirement(constraintRequirement);
				if (result == null) result = caseRequirementGenericCharacteristics_Requirement(constraintRequirement);
				if (result == null) result = caseAgreementStatusReqCharac(constraintRequirement);
				if (result == null) result = caseImportanceReqCharac(constraintRequirement);
				if (result == null) result = caseVerifierNameReqCharac(constraintRequirement);
				if (result == null) result = caseAbstractionLevelReqCharac(constraintRequirement);
				if (result == null) result = caseApprovalAuthorityReqCharac(constraintRequirement);
				if (result == null) result = caseLifeCyclePhaseReqCharac(constraintRequirement);
				if (result == null) result = caseMaturityReqCharac(constraintRequirement);
				if (result == null) result = caseOwnerReqCharac(constraintRequirement);
				if (result == null) result = casePriorityReqCharac(constraintRequirement);
				if (result == null) result = caseQualificationStatusReqCharac(constraintRequirement);
				if (result == null) result = caseQualityNatureReqCharac(constraintRequirement);
				if (result == null) result = caseReviewStatusReqCharac(constraintRequirement);
				if (result == null) result = caseSatifiactionStatusReqCharac(constraintRequirement);
				if (result == null) result = caseSourceReqCharac(constraintRequirement);
				if (result == null) result = caseValidatorNameReqCharac(constraintRequirement);
				if (result == null) result = caseRequirement(constraintRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequirementClassificationPackage.WORKLOAD_CAPACITY_REQUIREMENT: {
				WorkloadCapacityRequirement workloadCapacityRequirement = (WorkloadCapacityRequirement)theEObject;
				T result = caseWorkloadCapacityRequirement(workloadCapacityRequirement);
				if (result == null) result = caseRequirementGenericCharacteristics_Requirement(workloadCapacityRequirement);
				if (result == null) result = caseAgreementStatusReqCharac(workloadCapacityRequirement);
				if (result == null) result = caseImportanceReqCharac(workloadCapacityRequirement);
				if (result == null) result = caseVerifierNameReqCharac(workloadCapacityRequirement);
				if (result == null) result = caseAbstractionLevelReqCharac(workloadCapacityRequirement);
				if (result == null) result = caseApprovalAuthorityReqCharac(workloadCapacityRequirement);
				if (result == null) result = caseLifeCyclePhaseReqCharac(workloadCapacityRequirement);
				if (result == null) result = caseMaturityReqCharac(workloadCapacityRequirement);
				if (result == null) result = caseOwnerReqCharac(workloadCapacityRequirement);
				if (result == null) result = casePriorityReqCharac(workloadCapacityRequirement);
				if (result == null) result = caseQualificationStatusReqCharac(workloadCapacityRequirement);
				if (result == null) result = caseQualityNatureReqCharac(workloadCapacityRequirement);
				if (result == null) result = caseReviewStatusReqCharac(workloadCapacityRequirement);
				if (result == null) result = caseSatifiactionStatusReqCharac(workloadCapacityRequirement);
				if (result == null) result = caseSourceReqCharac(workloadCapacityRequirement);
				if (result == null) result = caseValidatorNameReqCharac(workloadCapacityRequirement);
				if (result == null) result = caseRequirement(workloadCapacityRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequirementClassificationPackage.QUALITY_REQUIREMENT: {
				QualityRequirement qualityRequirement = (QualityRequirement)theEObject;
				T result = caseQualityRequirement(qualityRequirement);
				if (result == null) result = caseRequirementGenericCharacteristics_Requirement(qualityRequirement);
				if (result == null) result = caseAgreementStatusReqCharac(qualityRequirement);
				if (result == null) result = caseImportanceReqCharac(qualityRequirement);
				if (result == null) result = caseVerifierNameReqCharac(qualityRequirement);
				if (result == null) result = caseAbstractionLevelReqCharac(qualityRequirement);
				if (result == null) result = caseApprovalAuthorityReqCharac(qualityRequirement);
				if (result == null) result = caseLifeCyclePhaseReqCharac(qualityRequirement);
				if (result == null) result = caseMaturityReqCharac(qualityRequirement);
				if (result == null) result = caseOwnerReqCharac(qualityRequirement);
				if (result == null) result = casePriorityReqCharac(qualityRequirement);
				if (result == null) result = caseQualificationStatusReqCharac(qualityRequirement);
				if (result == null) result = caseQualityNatureReqCharac(qualityRequirement);
				if (result == null) result = caseReviewStatusReqCharac(qualityRequirement);
				if (result == null) result = caseSatifiactionStatusReqCharac(qualityRequirement);
				if (result == null) result = caseSourceReqCharac(qualityRequirement);
				if (result == null) result = caseValidatorNameReqCharac(qualityRequirement);
				if (result == null) result = caseRequirement(qualityRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProjectRequirement(ProjectRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessRequirement(ProcessRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraintRequirement(ConstraintRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workload Capacity Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workload Capacity Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkloadCapacityRequirement(WorkloadCapacityRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quality Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quality Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQualityRequirement(QualityRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirement(Requirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Agreement Status Req Charac</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Agreement Status Req Charac</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAgreementStatusReqCharac(AgreementStatusReqCharac object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Importance Req Charac</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Importance Req Charac</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImportanceReqCharac(ImportanceReqCharac object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Verifier Name Req Charac</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Verifier Name Req Charac</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerifierNameReqCharac(VerifierNameReqCharac object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstraction Level Req Charac</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstraction Level Req Charac</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractionLevelReqCharac(AbstractionLevelReqCharac object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Approval Authority Req Charac</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Approval Authority Req Charac</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApprovalAuthorityReqCharac(ApprovalAuthorityReqCharac object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Life Cycle Phase Req Charac</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Life Cycle Phase Req Charac</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLifeCyclePhaseReqCharac(LifeCyclePhaseReqCharac object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Maturity Req Charac</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Maturity Req Charac</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaturityReqCharac(MaturityReqCharac object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Owner Req Charac</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Owner Req Charac</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOwnerReqCharac(OwnerReqCharac object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Priority Req Charac</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Priority Req Charac</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePriorityReqCharac(PriorityReqCharac object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qualification Status Req Charac</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qualification Status Req Charac</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQualificationStatusReqCharac(QualificationStatusReqCharac object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quality Nature Req Charac</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quality Nature Req Charac</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQualityNatureReqCharac(QualityNatureReqCharac object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Review Status Req Charac</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Review Status Req Charac</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReviewStatusReqCharac(ReviewStatusReqCharac object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Satifiaction Status Req Charac</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Satifiaction Status Req Charac</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSatifiactionStatusReqCharac(SatifiactionStatusReqCharac object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source Req Charac</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source Req Charac</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceReqCharac(SourceReqCharac object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Validator Name Req Charac</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Validator Name Req Charac</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValidatorNameReqCharac(ValidatorNameReqCharac object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirementGenericCharacteristics_Requirement(org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.Requirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //RequirementClassificationSwitch
