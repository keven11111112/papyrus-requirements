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
package org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.*;

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
 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.RequirementGenericCharacteristicsPackage
 * @generated
 */
public class RequirementGenericCharacteristicsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RequirementGenericCharacteristicsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementGenericCharacteristicsSwitch() {
		if (modelPackage == null) {
			modelPackage = RequirementGenericCharacteristicsPackage.eINSTANCE;
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
			case RequirementGenericCharacteristicsPackage.REQUIREMENT: {
				Requirement requirement = (Requirement)theEObject;
				T result = caseRequirement(requirement);
				if (result == null) result = caseAgreementStatusReqCharac(requirement);
				if (result == null) result = caseImportanceReqCharac(requirement);
				if (result == null) result = caseVerifierNameReqCharac(requirement);
				if (result == null) result = caseAbstractionLevelReqCharac(requirement);
				if (result == null) result = caseApprovalAuthorityReqCharac(requirement);
				if (result == null) result = caseLifeCyclePhaseReqCharac(requirement);
				if (result == null) result = caseMaturityReqCharac(requirement);
				if (result == null) result = caseOwnerReqCharac(requirement);
				if (result == null) result = casePriorityReqCharac(requirement);
				if (result == null) result = caseQualificationStatusReqCharac(requirement);
				if (result == null) result = caseQualityNatureReqCharac(requirement);
				if (result == null) result = caseReviewStatusReqCharac(requirement);
				if (result == null) result = caseSatifiactionStatusReqCharac(requirement);
				if (result == null) result = caseSourceReqCharac(requirement);
				if (result == null) result = caseValidatorNameReqCharac(requirement);
				if (result == null) result = caseRequirements_Requirement(requirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequirementGenericCharacteristicsPackage.OWNER_REQ_CHARAC: {
				OwnerReqCharac ownerReqCharac = (OwnerReqCharac)theEObject;
				T result = caseOwnerReqCharac(ownerReqCharac);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequirementGenericCharacteristicsPackage.IMPORTANCE_REQ_CHARAC: {
				ImportanceReqCharac importanceReqCharac = (ImportanceReqCharac)theEObject;
				T result = caseImportanceReqCharac(importanceReqCharac);
				if (result == null) result = caseRequirements_Requirement(importanceReqCharac);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequirementGenericCharacteristicsPackage.APPROVAL_AUTHORITY_REQ_CHARAC: {
				ApprovalAuthorityReqCharac approvalAuthorityReqCharac = (ApprovalAuthorityReqCharac)theEObject;
				T result = caseApprovalAuthorityReqCharac(approvalAuthorityReqCharac);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequirementGenericCharacteristicsPackage.AGREEMENT_STATUS_REQ_CHARAC: {
				AgreementStatusReqCharac agreementStatusReqCharac = (AgreementStatusReqCharac)theEObject;
				T result = caseAgreementStatusReqCharac(agreementStatusReqCharac);
				if (result == null) result = caseRequirements_Requirement(agreementStatusReqCharac);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequirementGenericCharacteristicsPackage.MATURITY_REQ_CHARAC: {
				MaturityReqCharac maturityReqCharac = (MaturityReqCharac)theEObject;
				T result = caseMaturityReqCharac(maturityReqCharac);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequirementGenericCharacteristicsPackage.LIFE_CYCLE_PHASE_REQ_CHARAC: {
				LifeCyclePhaseReqCharac lifeCyclePhaseReqCharac = (LifeCyclePhaseReqCharac)theEObject;
				T result = caseLifeCyclePhaseReqCharac(lifeCyclePhaseReqCharac);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequirementGenericCharacteristicsPackage.ABSTRACTION_LEVEL_REQ_CHARAC: {
				AbstractionLevelReqCharac abstractionLevelReqCharac = (AbstractionLevelReqCharac)theEObject;
				T result = caseAbstractionLevelReqCharac(abstractionLevelReqCharac);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequirementGenericCharacteristicsPackage.PRIORITY_REQ_CHARAC: {
				PriorityReqCharac priorityReqCharac = (PriorityReqCharac)theEObject;
				T result = casePriorityReqCharac(priorityReqCharac);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequirementGenericCharacteristicsPackage.SOURCE_REQ_CHARAC: {
				SourceReqCharac sourceReqCharac = (SourceReqCharac)theEObject;
				T result = caseSourceReqCharac(sourceReqCharac);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequirementGenericCharacteristicsPackage.QUALIFICATION_STATUS_REQ_CHARAC: {
				QualificationStatusReqCharac qualificationStatusReqCharac = (QualificationStatusReqCharac)theEObject;
				T result = caseQualificationStatusReqCharac(qualificationStatusReqCharac);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequirementGenericCharacteristicsPackage.REVIEW_STATUS_REQ_CHARAC: {
				ReviewStatusReqCharac reviewStatusReqCharac = (ReviewStatusReqCharac)theEObject;
				T result = caseReviewStatusReqCharac(reviewStatusReqCharac);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequirementGenericCharacteristicsPackage.VALIDATOR_NAME_REQ_CHARAC: {
				ValidatorNameReqCharac validatorNameReqCharac = (ValidatorNameReqCharac)theEObject;
				T result = caseValidatorNameReqCharac(validatorNameReqCharac);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequirementGenericCharacteristicsPackage.QUALITY_NATURE_REQ_CHARAC: {
				QualityNatureReqCharac qualityNatureReqCharac = (QualityNatureReqCharac)theEObject;
				T result = caseQualityNatureReqCharac(qualityNatureReqCharac);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequirementGenericCharacteristicsPackage.VERIFIER_NAME_REQ_CHARAC: {
				VerifierNameReqCharac verifierNameReqCharac = (VerifierNameReqCharac)theEObject;
				T result = caseVerifierNameReqCharac(verifierNameReqCharac);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequirementGenericCharacteristicsPackage.SATIFIACTION_STATUS_REQ_CHARAC: {
				SatifiactionStatusReqCharac satifiactionStatusReqCharac = (SatifiactionStatusReqCharac)theEObject;
				T result = caseSatifiactionStatusReqCharac(satifiactionStatusReqCharac);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	public T caseRequirements_Requirement(org.eclipse.papyrus.sysml14.requirements.Requirement object) {
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

} //RequirementGenericCharacteristicsSwitch
