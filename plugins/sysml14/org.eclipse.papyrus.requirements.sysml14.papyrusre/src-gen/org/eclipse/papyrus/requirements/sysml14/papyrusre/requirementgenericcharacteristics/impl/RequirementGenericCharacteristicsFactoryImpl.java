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
package org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RequirementGenericCharacteristicsFactoryImpl extends EFactoryImpl implements RequirementGenericCharacteristicsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RequirementGenericCharacteristicsFactory init() {
		try {
			RequirementGenericCharacteristicsFactory theRequirementGenericCharacteristicsFactory = (RequirementGenericCharacteristicsFactory)EPackage.Registry.INSTANCE.getEFactory(RequirementGenericCharacteristicsPackage.eNS_URI);
			if (theRequirementGenericCharacteristicsFactory != null) {
				return theRequirementGenericCharacteristicsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RequirementGenericCharacteristicsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementGenericCharacteristicsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RequirementGenericCharacteristicsPackage.REQUIREMENT: return createRequirement();
			case RequirementGenericCharacteristicsPackage.OWNER_REQ_CHARAC: return createOwnerReqCharac();
			case RequirementGenericCharacteristicsPackage.IMPORTANCE_REQ_CHARAC: return createImportanceReqCharac();
			case RequirementGenericCharacteristicsPackage.APPROVAL_AUTHORITY_REQ_CHARAC: return createApprovalAuthorityReqCharac();
			case RequirementGenericCharacteristicsPackage.AGREEMENT_STATUS_REQ_CHARAC: return createAgreementStatusReqCharac();
			case RequirementGenericCharacteristicsPackage.MATURITY_REQ_CHARAC: return createMaturityReqCharac();
			case RequirementGenericCharacteristicsPackage.LIFE_CYCLE_PHASE_REQ_CHARAC: return createLifeCyclePhaseReqCharac();
			case RequirementGenericCharacteristicsPackage.ABSTRACTION_LEVEL_REQ_CHARAC: return createAbstractionLevelReqCharac();
			case RequirementGenericCharacteristicsPackage.PRIORITY_REQ_CHARAC: return createPriorityReqCharac();
			case RequirementGenericCharacteristicsPackage.SOURCE_REQ_CHARAC: return createSourceReqCharac();
			case RequirementGenericCharacteristicsPackage.QUALIFICATION_STATUS_REQ_CHARAC: return createQualificationStatusReqCharac();
			case RequirementGenericCharacteristicsPackage.REVIEW_STATUS_REQ_CHARAC: return createReviewStatusReqCharac();
			case RequirementGenericCharacteristicsPackage.VALIDATOR_NAME_REQ_CHARAC: return createValidatorNameReqCharac();
			case RequirementGenericCharacteristicsPackage.QUALITY_NATURE_REQ_CHARAC: return createQualityNatureReqCharac();
			case RequirementGenericCharacteristicsPackage.VERIFIER_NAME_REQ_CHARAC: return createVerifierNameReqCharac();
			case RequirementGenericCharacteristicsPackage.SATIFIACTION_STATUS_REQ_CHARAC: return createSatifiactionStatusReqCharac();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement createRequirement() {
		RequirementImpl requirement = new RequirementImpl();
		return requirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwnerReqCharac createOwnerReqCharac() {
		OwnerReqCharacImpl ownerReqCharac = new OwnerReqCharacImpl();
		return ownerReqCharac;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportanceReqCharac createImportanceReqCharac() {
		ImportanceReqCharacImpl importanceReqCharac = new ImportanceReqCharacImpl();
		return importanceReqCharac;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApprovalAuthorityReqCharac createApprovalAuthorityReqCharac() {
		ApprovalAuthorityReqCharacImpl approvalAuthorityReqCharac = new ApprovalAuthorityReqCharacImpl();
		return approvalAuthorityReqCharac;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgreementStatusReqCharac createAgreementStatusReqCharac() {
		AgreementStatusReqCharacImpl agreementStatusReqCharac = new AgreementStatusReqCharacImpl();
		return agreementStatusReqCharac;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaturityReqCharac createMaturityReqCharac() {
		MaturityReqCharacImpl maturityReqCharac = new MaturityReqCharacImpl();
		return maturityReqCharac;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LifeCyclePhaseReqCharac createLifeCyclePhaseReqCharac() {
		LifeCyclePhaseReqCharacImpl lifeCyclePhaseReqCharac = new LifeCyclePhaseReqCharacImpl();
		return lifeCyclePhaseReqCharac;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractionLevelReqCharac createAbstractionLevelReqCharac() {
		AbstractionLevelReqCharacImpl abstractionLevelReqCharac = new AbstractionLevelReqCharacImpl();
		return abstractionLevelReqCharac;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PriorityReqCharac createPriorityReqCharac() {
		PriorityReqCharacImpl priorityReqCharac = new PriorityReqCharacImpl();
		return priorityReqCharac;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceReqCharac createSourceReqCharac() {
		SourceReqCharacImpl sourceReqCharac = new SourceReqCharacImpl();
		return sourceReqCharac;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualificationStatusReqCharac createQualificationStatusReqCharac() {
		QualificationStatusReqCharacImpl qualificationStatusReqCharac = new QualificationStatusReqCharacImpl();
		return qualificationStatusReqCharac;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReviewStatusReqCharac createReviewStatusReqCharac() {
		ReviewStatusReqCharacImpl reviewStatusReqCharac = new ReviewStatusReqCharacImpl();
		return reviewStatusReqCharac;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidatorNameReqCharac createValidatorNameReqCharac() {
		ValidatorNameReqCharacImpl validatorNameReqCharac = new ValidatorNameReqCharacImpl();
		return validatorNameReqCharac;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualityNatureReqCharac createQualityNatureReqCharac() {
		QualityNatureReqCharacImpl qualityNatureReqCharac = new QualityNatureReqCharacImpl();
		return qualityNatureReqCharac;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerifierNameReqCharac createVerifierNameReqCharac() {
		VerifierNameReqCharacImpl verifierNameReqCharac = new VerifierNameReqCharacImpl();
		return verifierNameReqCharac;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SatifiactionStatusReqCharac createSatifiactionStatusReqCharac() {
		SatifiactionStatusReqCharacImpl satifiactionStatusReqCharac = new SatifiactionStatusReqCharacImpl();
		return satifiactionStatusReqCharac;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementGenericCharacteristicsPackage getRequirementGenericCharacteristicsPackage() {
		return (RequirementGenericCharacteristicsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RequirementGenericCharacteristicsPackage getPackage() {
		return RequirementGenericCharacteristicsPackage.eINSTANCE;
	}

} //RequirementGenericCharacteristicsFactoryImpl
