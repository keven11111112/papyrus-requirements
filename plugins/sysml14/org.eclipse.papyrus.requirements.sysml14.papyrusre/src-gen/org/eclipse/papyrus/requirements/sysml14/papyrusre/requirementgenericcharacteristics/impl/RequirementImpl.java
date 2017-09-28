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
package org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.priorityandimportanceconcerns.ImportanceKind;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.priorityandimportanceconcerns.PriorityKind;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementandprocessconcerns.AgreementStatusKind;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementandprocessconcerns.QualificationStatusKind;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementandprocessconcerns.ReviewStatusKind;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementandprocessconcerns.SatisfactionStatusKind;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementclassificationconcerns.QualityKind;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementscharacteristicsconcerns.AbstractionLevelKind;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementscharacteristicsconcerns.LifeCyclePhaseKind;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.verificationandvalidationconcerns.VV_MethodKind;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.verificationandvalidationconcerns.VV_StatusKind;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.Requirement;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.RequirementGenericCharacteristicsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementImpl#getAgreementStatus <em>Agreement Status</em>}</li>
 *   <li>{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementImpl#getApprovalAuthority <em>Approval Authority</em>}</li>
 *   <li>{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementImpl#getImportance <em>Importance</em>}</li>
 *   <li>{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementImpl#getLifeCyclePhase <em>Life Cycle Phase</em>}</li>
 *   <li>{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementImpl#getMaturity <em>Maturity</em>}</li>
 *   <li>{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementImpl#getAbstractionLevel <em>Abstraction Level</em>}</li>
 *   <li>{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementImpl#getQualificationStatus <em>Qualification Status</em>}</li>
 *   <li>{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementImpl#getReviewStatus <em>Review Status</em>}</li>
 *   <li>{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementImpl#getSatisfactionRationale <em>Satisfaction Rationale</em>}</li>
 *   <li>{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementImpl#getSatisfactionStatus <em>Satisfaction Status</em>}</li>
 *   <li>{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementImpl#getValidationRationale <em>Validation Rationale</em>}</li>
 *   <li>{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementImpl#getValidatorName <em>Validator Name</em>}</li>
 *   <li>{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementImpl#getVerifierName <em>Verifier Name</em>}</li>
 *   <li>{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementImpl#getVV_Method <em>VV Method</em>}</li>
 *   <li>{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementImpl#getVV_Status <em>VV Status</em>}</li>
 *   <li>{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementImpl#getQualityNature <em>Quality Nature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequirementImpl extends org.eclipse.papyrus.sysml14.requirements.internal.impl.RequirementImpl implements Requirement {
	/**
	 * The default value of the '{@link #getAgreementStatus() <em>Agreement Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgreementStatus()
	 * @generated
	 * @ordered
	 */
	protected static final AgreementStatusKind AGREEMENT_STATUS_EDEFAULT = AgreementStatusKind.PROPOSED;

	/**
	 * The cached value of the '{@link #getAgreementStatus() <em>Agreement Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgreementStatus()
	 * @generated
	 * @ordered
	 */
	protected AgreementStatusKind agreementStatus = AGREEMENT_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getApprovalAuthority() <em>Approval Authority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApprovalAuthority()
	 * @generated
	 * @ordered
	 */
	protected static final String APPROVAL_AUTHORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApprovalAuthority() <em>Approval Authority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApprovalAuthority()
	 * @generated
	 * @ordered
	 */
	protected String approvalAuthority = APPROVAL_AUTHORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getImportance() <em>Importance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportance()
	 * @generated
	 * @ordered
	 */
	protected static final ImportanceKind IMPORTANCE_EDEFAULT = ImportanceKind.IMPORTANCE1;

	/**
	 * The cached value of the '{@link #getImportance() <em>Importance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportance()
	 * @generated
	 * @ordered
	 */
	protected ImportanceKind importance = IMPORTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLifeCyclePhase() <em>Life Cycle Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifeCyclePhase()
	 * @generated
	 * @ordered
	 */
	protected static final LifeCyclePhaseKind LIFE_CYCLE_PHASE_EDEFAULT = LifeCyclePhaseKind.PRE_CONCEPT;

	/**
	 * The cached value of the '{@link #getLifeCyclePhase() <em>Life Cycle Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifeCyclePhase()
	 * @generated
	 * @ordered
	 */
	protected LifeCyclePhaseKind lifeCyclePhase = LIFE_CYCLE_PHASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaturity() <em>Maturity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaturity()
	 * @generated
	 * @ordered
	 */
	protected static final int MATURITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaturity() <em>Maturity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaturity()
	 * @generated
	 * @ordered
	 */
	protected int maturity = MATURITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getAbstractionLevel() <em>Abstraction Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractionLevel()
	 * @generated
	 * @ordered
	 */
	protected static final AbstractionLevelKind ABSTRACTION_LEVEL_EDEFAULT = AbstractionLevelKind.SPECIFICATION_LEVEL;

	/**
	 * The cached value of the '{@link #getAbstractionLevel() <em>Abstraction Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractionLevel()
	 * @generated
	 * @ordered
	 */
	protected AbstractionLevelKind abstractionLevel = ABSTRACTION_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getOwner() <em>Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected static final String OWNER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected String owner = OWNER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final PriorityKind PRIORITY_EDEFAULT = PriorityKind.KEY;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected PriorityKind priority = PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getQualificationStatus() <em>Qualification Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualificationStatus()
	 * @generated
	 * @ordered
	 */
	protected static final QualificationStatusKind QUALIFICATION_STATUS_EDEFAULT = QualificationStatusKind.NOT_QUALIFIED;

	/**
	 * The cached value of the '{@link #getQualificationStatus() <em>Qualification Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualificationStatus()
	 * @generated
	 * @ordered
	 */
	protected QualificationStatusKind qualificationStatus = QUALIFICATION_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getReviewStatus() <em>Review Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ReviewStatusKind REVIEW_STATUS_EDEFAULT = ReviewStatusKind.TO_BE_REVIEWED;

	/**
	 * The cached value of the '{@link #getReviewStatus() <em>Review Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewStatus()
	 * @generated
	 * @ordered
	 */
	protected ReviewStatusKind reviewStatus = REVIEW_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSatisfactionRationale() <em>Satisfaction Rationale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatisfactionRationale()
	 * @generated
	 * @ordered
	 */
	protected static final String SATISFACTION_RATIONALE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSatisfactionRationale() <em>Satisfaction Rationale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatisfactionRationale()
	 * @generated
	 * @ordered
	 */
	protected String satisfactionRationale = SATISFACTION_RATIONALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSatisfactionStatus() <em>Satisfaction Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatisfactionStatus()
	 * @generated
	 * @ordered
	 */
	protected static final SatisfactionStatusKind SATISFACTION_STATUS_EDEFAULT = SatisfactionStatusKind.NOT_SATISFIED;

	/**
	 * The cached value of the '{@link #getSatisfactionStatus() <em>Satisfaction Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatisfactionStatus()
	 * @generated
	 * @ordered
	 */
	protected SatisfactionStatusKind satisfactionStatus = SATISFACTION_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected String source = SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValidationRationale() <em>Validation Rationale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidationRationale()
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATION_RATIONALE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValidationRationale() <em>Validation Rationale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidationRationale()
	 * @generated
	 * @ordered
	 */
	protected String validationRationale = VALIDATION_RATIONALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValidatorName() <em>Validator Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidatorName()
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATOR_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValidatorName() <em>Validator Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidatorName()
	 * @generated
	 * @ordered
	 */
	protected String validatorName = VALIDATOR_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVerifierName() <em>Verifier Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerifierName()
	 * @generated
	 * @ordered
	 */
	protected static final String VERIFIER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVerifierName() <em>Verifier Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerifierName()
	 * @generated
	 * @ordered
	 */
	protected String verifierName = VERIFIER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVV_Method() <em>VV Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVV_Method()
	 * @generated
	 * @ordered
	 */
	protected static final VV_MethodKind VV_METHOD_EDEFAULT = VV_MethodKind.ANALYSIS;

	/**
	 * The cached value of the '{@link #getVV_Method() <em>VV Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVV_Method()
	 * @generated
	 * @ordered
	 */
	protected VV_MethodKind vV_Method = VV_METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getVV_Status() <em>VV Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVV_Status()
	 * @generated
	 * @ordered
	 */
	protected static final VV_StatusKind VV_STATUS_EDEFAULT = VV_StatusKind.PENDING;

	/**
	 * The cached value of the '{@link #getVV_Status() <em>VV Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVV_Status()
	 * @generated
	 * @ordered
	 */
	protected VV_StatusKind vV_Status = VV_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getQualityNature() <em>Quality Nature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualityNature()
	 * @generated
	 * @ordered
	 */
	protected static final QualityKind QUALITY_NATURE_EDEFAULT = QualityKind.ADAPTABILITY;

	/**
	 * The cached value of the '{@link #getQualityNature() <em>Quality Nature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualityNature()
	 * @generated
	 * @ordered
	 */
	protected QualityKind qualityNature = QUALITY_NATURE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementGenericCharacteristicsPackage.Literals.REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgreementStatusKind getAgreementStatus() {
		return agreementStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAgreementStatus(AgreementStatusKind newAgreementStatus) {
		AgreementStatusKind oldAgreementStatus = agreementStatus;
		agreementStatus = newAgreementStatus == null ? AGREEMENT_STATUS_EDEFAULT : newAgreementStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementGenericCharacteristicsPackage.REQUIREMENT__AGREEMENT_STATUS, oldAgreementStatus, agreementStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApprovalAuthority() {
		return approvalAuthority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApprovalAuthority(String newApprovalAuthority) {
		String oldApprovalAuthority = approvalAuthority;
		approvalAuthority = newApprovalAuthority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementGenericCharacteristicsPackage.REQUIREMENT__APPROVAL_AUTHORITY, oldApprovalAuthority, approvalAuthority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportanceKind getImportance() {
		return importance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportance(ImportanceKind newImportance) {
		ImportanceKind oldImportance = importance;
		importance = newImportance == null ? IMPORTANCE_EDEFAULT : newImportance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementGenericCharacteristicsPackage.REQUIREMENT__IMPORTANCE, oldImportance, importance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LifeCyclePhaseKind getLifeCyclePhase() {
		return lifeCyclePhase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLifeCyclePhase(LifeCyclePhaseKind newLifeCyclePhase) {
		LifeCyclePhaseKind oldLifeCyclePhase = lifeCyclePhase;
		lifeCyclePhase = newLifeCyclePhase == null ? LIFE_CYCLE_PHASE_EDEFAULT : newLifeCyclePhase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementGenericCharacteristicsPackage.REQUIREMENT__LIFE_CYCLE_PHASE, oldLifeCyclePhase, lifeCyclePhase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaturity() {
		return maturity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaturity(int newMaturity) {
		int oldMaturity = maturity;
		maturity = newMaturity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementGenericCharacteristicsPackage.REQUIREMENT__MATURITY, oldMaturity, maturity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractionLevelKind getAbstractionLevel() {
		return abstractionLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstractionLevel(AbstractionLevelKind newAbstractionLevel) {
		AbstractionLevelKind oldAbstractionLevel = abstractionLevel;
		abstractionLevel = newAbstractionLevel == null ? ABSTRACTION_LEVEL_EDEFAULT : newAbstractionLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementGenericCharacteristicsPackage.REQUIREMENT__ABSTRACTION_LEVEL, oldAbstractionLevel, abstractionLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(String newOwner) {
		String oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementGenericCharacteristicsPackage.REQUIREMENT__OWNER, oldOwner, owner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PriorityKind getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(PriorityKind newPriority) {
		PriorityKind oldPriority = priority;
		priority = newPriority == null ? PRIORITY_EDEFAULT : newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementGenericCharacteristicsPackage.REQUIREMENT__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualificationStatusKind getQualificationStatus() {
		return qualificationStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualificationStatus(QualificationStatusKind newQualificationStatus) {
		QualificationStatusKind oldQualificationStatus = qualificationStatus;
		qualificationStatus = newQualificationStatus == null ? QUALIFICATION_STATUS_EDEFAULT : newQualificationStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementGenericCharacteristicsPackage.REQUIREMENT__QUALIFICATION_STATUS, oldQualificationStatus, qualificationStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReviewStatusKind getReviewStatus() {
		return reviewStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReviewStatus(ReviewStatusKind newReviewStatus) {
		ReviewStatusKind oldReviewStatus = reviewStatus;
		reviewStatus = newReviewStatus == null ? REVIEW_STATUS_EDEFAULT : newReviewStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementGenericCharacteristicsPackage.REQUIREMENT__REVIEW_STATUS, oldReviewStatus, reviewStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSatisfactionRationale() {
		return satisfactionRationale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSatisfactionRationale(String newSatisfactionRationale) {
		String oldSatisfactionRationale = satisfactionRationale;
		satisfactionRationale = newSatisfactionRationale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementGenericCharacteristicsPackage.REQUIREMENT__SATISFACTION_RATIONALE, oldSatisfactionRationale, satisfactionRationale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SatisfactionStatusKind getSatisfactionStatus() {
		return satisfactionStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSatisfactionStatus(SatisfactionStatusKind newSatisfactionStatus) {
		SatisfactionStatusKind oldSatisfactionStatus = satisfactionStatus;
		satisfactionStatus = newSatisfactionStatus == null ? SATISFACTION_STATUS_EDEFAULT : newSatisfactionStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementGenericCharacteristicsPackage.REQUIREMENT__SATISFACTION_STATUS, oldSatisfactionStatus, satisfactionStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(String newSource) {
		String oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementGenericCharacteristicsPackage.REQUIREMENT__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValidationRationale() {
		return validationRationale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidationRationale(String newValidationRationale) {
		String oldValidationRationale = validationRationale;
		validationRationale = newValidationRationale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementGenericCharacteristicsPackage.REQUIREMENT__VALIDATION_RATIONALE, oldValidationRationale, validationRationale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValidatorName() {
		return validatorName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidatorName(String newValidatorName) {
		String oldValidatorName = validatorName;
		validatorName = newValidatorName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementGenericCharacteristicsPackage.REQUIREMENT__VALIDATOR_NAME, oldValidatorName, validatorName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVerifierName() {
		return verifierName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerifierName(String newVerifierName) {
		String oldVerifierName = verifierName;
		verifierName = newVerifierName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementGenericCharacteristicsPackage.REQUIREMENT__VERIFIER_NAME, oldVerifierName, verifierName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VV_MethodKind getVV_Method() {
		return vV_Method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVV_Method(VV_MethodKind newVV_Method) {
		VV_MethodKind oldVV_Method = vV_Method;
		vV_Method = newVV_Method == null ? VV_METHOD_EDEFAULT : newVV_Method;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementGenericCharacteristicsPackage.REQUIREMENT__VV_METHOD, oldVV_Method, vV_Method));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VV_StatusKind getVV_Status() {
		return vV_Status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVV_Status(VV_StatusKind newVV_Status) {
		VV_StatusKind oldVV_Status = vV_Status;
		vV_Status = newVV_Status == null ? VV_STATUS_EDEFAULT : newVV_Status;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementGenericCharacteristicsPackage.REQUIREMENT__VV_STATUS, oldVV_Status, vV_Status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualityKind getQualityNature() {
		return qualityNature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualityNature(QualityKind newQualityNature) {
		QualityKind oldQualityNature = qualityNature;
		qualityNature = newQualityNature == null ? QUALITY_NATURE_EDEFAULT : newQualityNature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementGenericCharacteristicsPackage.REQUIREMENT__QUALITY_NATURE, oldQualityNature, qualityNature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__AGREEMENT_STATUS:
				return getAgreementStatus();
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__APPROVAL_AUTHORITY:
				return getApprovalAuthority();
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__IMPORTANCE:
				return getImportance();
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__LIFE_CYCLE_PHASE:
				return getLifeCyclePhase();
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__MATURITY:
				return getMaturity();
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__ABSTRACTION_LEVEL:
				return getAbstractionLevel();
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__OWNER:
				return getOwner();
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__PRIORITY:
				return getPriority();
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__QUALIFICATION_STATUS:
				return getQualificationStatus();
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__REVIEW_STATUS:
				return getReviewStatus();
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__SATISFACTION_RATIONALE:
				return getSatisfactionRationale();
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__SATISFACTION_STATUS:
				return getSatisfactionStatus();
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__SOURCE:
				return getSource();
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__VALIDATION_RATIONALE:
				return getValidationRationale();
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__VALIDATOR_NAME:
				return getValidatorName();
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__VERIFIER_NAME:
				return getVerifierName();
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__VV_METHOD:
				return getVV_Method();
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__VV_STATUS:
				return getVV_Status();
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__QUALITY_NATURE:
				return getQualityNature();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__AGREEMENT_STATUS:
				setAgreementStatus((AgreementStatusKind)newValue);
				return;
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__APPROVAL_AUTHORITY:
				setApprovalAuthority((String)newValue);
				return;
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__IMPORTANCE:
				setImportance((ImportanceKind)newValue);
				return;
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__LIFE_CYCLE_PHASE:
				setLifeCyclePhase((LifeCyclePhaseKind)newValue);
				return;
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__MATURITY:
				setMaturity((Integer)newValue);
				return;
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__ABSTRACTION_LEVEL:
				setAbstractionLevel((AbstractionLevelKind)newValue);
				return;
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__OWNER:
				setOwner((String)newValue);
				return;
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__PRIORITY:
				setPriority((PriorityKind)newValue);
				return;
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__QUALIFICATION_STATUS:
				setQualificationStatus((QualificationStatusKind)newValue);
				return;
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__REVIEW_STATUS:
				setReviewStatus((ReviewStatusKind)newValue);
				return;
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__SATISFACTION_RATIONALE:
				setSatisfactionRationale((String)newValue);
				return;
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__SATISFACTION_STATUS:
				setSatisfactionStatus((SatisfactionStatusKind)newValue);
				return;
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__SOURCE:
				setSource((String)newValue);
				return;
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__VALIDATION_RATIONALE:
				setValidationRationale((String)newValue);
				return;
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__VALIDATOR_NAME:
				setValidatorName((String)newValue);
				return;
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__VERIFIER_NAME:
				setVerifierName((String)newValue);
				return;
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__VV_METHOD:
				setVV_Method((VV_MethodKind)newValue);
				return;
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__VV_STATUS:
				setVV_Status((VV_StatusKind)newValue);
				return;
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__QUALITY_NATURE:
				setQualityNature((QualityKind)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__AGREEMENT_STATUS:
				setAgreementStatus(AGREEMENT_STATUS_EDEFAULT);
				return;
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__APPROVAL_AUTHORITY:
				setApprovalAuthority(APPROVAL_AUTHORITY_EDEFAULT);
				return;
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__IMPORTANCE:
				setImportance(IMPORTANCE_EDEFAULT);
				return;
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__LIFE_CYCLE_PHASE:
				setLifeCyclePhase(LIFE_CYCLE_PHASE_EDEFAULT);
				return;
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__MATURITY:
				setMaturity(MATURITY_EDEFAULT);
				return;
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__ABSTRACTION_LEVEL:
				setAbstractionLevel(ABSTRACTION_LEVEL_EDEFAULT);
				return;
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__OWNER:
				setOwner(OWNER_EDEFAULT);
				return;
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__QUALIFICATION_STATUS:
				setQualificationStatus(QUALIFICATION_STATUS_EDEFAULT);
				return;
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__REVIEW_STATUS:
				setReviewStatus(REVIEW_STATUS_EDEFAULT);
				return;
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__SATISFACTION_RATIONALE:
				setSatisfactionRationale(SATISFACTION_RATIONALE_EDEFAULT);
				return;
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__SATISFACTION_STATUS:
				setSatisfactionStatus(SATISFACTION_STATUS_EDEFAULT);
				return;
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__VALIDATION_RATIONALE:
				setValidationRationale(VALIDATION_RATIONALE_EDEFAULT);
				return;
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__VALIDATOR_NAME:
				setValidatorName(VALIDATOR_NAME_EDEFAULT);
				return;
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__VERIFIER_NAME:
				setVerifierName(VERIFIER_NAME_EDEFAULT);
				return;
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__VV_METHOD:
				setVV_Method(VV_METHOD_EDEFAULT);
				return;
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__VV_STATUS:
				setVV_Status(VV_STATUS_EDEFAULT);
				return;
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__QUALITY_NATURE:
				setQualityNature(QUALITY_NATURE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__AGREEMENT_STATUS:
				return agreementStatus != AGREEMENT_STATUS_EDEFAULT;
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__APPROVAL_AUTHORITY:
				return APPROVAL_AUTHORITY_EDEFAULT == null ? approvalAuthority != null : !APPROVAL_AUTHORITY_EDEFAULT.equals(approvalAuthority);
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__IMPORTANCE:
				return importance != IMPORTANCE_EDEFAULT;
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__LIFE_CYCLE_PHASE:
				return lifeCyclePhase != LIFE_CYCLE_PHASE_EDEFAULT;
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__MATURITY:
				return maturity != MATURITY_EDEFAULT;
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__ABSTRACTION_LEVEL:
				return abstractionLevel != ABSTRACTION_LEVEL_EDEFAULT;
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__OWNER:
				return OWNER_EDEFAULT == null ? owner != null : !OWNER_EDEFAULT.equals(owner);
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__QUALIFICATION_STATUS:
				return qualificationStatus != QUALIFICATION_STATUS_EDEFAULT;
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__REVIEW_STATUS:
				return reviewStatus != REVIEW_STATUS_EDEFAULT;
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__SATISFACTION_RATIONALE:
				return SATISFACTION_RATIONALE_EDEFAULT == null ? satisfactionRationale != null : !SATISFACTION_RATIONALE_EDEFAULT.equals(satisfactionRationale);
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__SATISFACTION_STATUS:
				return satisfactionStatus != SATISFACTION_STATUS_EDEFAULT;
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__SOURCE:
				return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__VALIDATION_RATIONALE:
				return VALIDATION_RATIONALE_EDEFAULT == null ? validationRationale != null : !VALIDATION_RATIONALE_EDEFAULT.equals(validationRationale);
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__VALIDATOR_NAME:
				return VALIDATOR_NAME_EDEFAULT == null ? validatorName != null : !VALIDATOR_NAME_EDEFAULT.equals(validatorName);
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__VERIFIER_NAME:
				return VERIFIER_NAME_EDEFAULT == null ? verifierName != null : !VERIFIER_NAME_EDEFAULT.equals(verifierName);
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__VV_METHOD:
				return vV_Method != VV_METHOD_EDEFAULT;
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__VV_STATUS:
				return vV_Status != VV_STATUS_EDEFAULT;
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__QUALITY_NATURE:
				return qualityNature != QUALITY_NATURE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (agreementStatus: "); //$NON-NLS-1$
		result.append(agreementStatus);
		result.append(", approvalAuthority: "); //$NON-NLS-1$
		result.append(approvalAuthority);
		result.append(", importance: "); //$NON-NLS-1$
		result.append(importance);
		result.append(", lifeCyclePhase: "); //$NON-NLS-1$
		result.append(lifeCyclePhase);
		result.append(", maturity: "); //$NON-NLS-1$
		result.append(maturity);
		result.append(", abstractionLevel: "); //$NON-NLS-1$
		result.append(abstractionLevel);
		result.append(", owner: "); //$NON-NLS-1$
		result.append(owner);
		result.append(", priority: "); //$NON-NLS-1$
		result.append(priority);
		result.append(", qualificationStatus: "); //$NON-NLS-1$
		result.append(qualificationStatus);
		result.append(", reviewStatus: "); //$NON-NLS-1$
		result.append(reviewStatus);
		result.append(", satisfactionRationale: "); //$NON-NLS-1$
		result.append(satisfactionRationale);
		result.append(", satisfactionStatus: "); //$NON-NLS-1$
		result.append(satisfactionStatus);
		result.append(", source: "); //$NON-NLS-1$
		result.append(source);
		result.append(", validationRationale: "); //$NON-NLS-1$
		result.append(validationRationale);
		result.append(", validatorName: "); //$NON-NLS-1$
		result.append(validatorName);
		result.append(", verifierName: "); //$NON-NLS-1$
		result.append(verifierName);
		result.append(", VV_Method: "); //$NON-NLS-1$
		result.append(vV_Method);
		result.append(", VV_Status: "); //$NON-NLS-1$
		result.append(vV_Status);
		result.append(", qualityNature: "); //$NON-NLS-1$
		result.append(qualityNature);
		result.append(')');
		return result.toString();
	}

} //RequirementImpl
