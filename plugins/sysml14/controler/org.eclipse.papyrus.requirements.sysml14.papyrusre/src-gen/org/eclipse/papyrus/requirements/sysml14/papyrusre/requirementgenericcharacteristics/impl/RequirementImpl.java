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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.priorityandimportanceconcerns.ImportanceKind;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.priorityandimportanceconcerns.PriorityKind;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementandprocessconcerns.QualificationStatusKind;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementandprocessconcerns.ReviewStatusKind;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementandprocessconcerns.SatisfactionStatusKind;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementclassificationconcerns.QualityKind;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementscharacteristicsconcerns.AbstractionLevelKind;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.requirementscharacteristicsconcerns.LifeCyclePhaseKind;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.verificationandvalidationconcerns.VV_MethodKind;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.modellibrary.papyrusrestandardutils.verificationandvalidationconcerns.VV_StatusKind;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.AbstractionLevelReqCharac;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.ApprovalAuthorityReqCharac;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.ImportanceReqCharac;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.LifeCyclePhaseReqCharac;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.MaturityReqCharac;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.OwnerReqCharac;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.PriorityReqCharac;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.QualificationStatusReqCharac;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.QualityNatureReqCharac;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.Requirement;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.RequirementGenericCharacteristicsPackage;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.ReviewStatusReqCharac;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.SatifiactionStatusReqCharac;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.SourceReqCharac;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.ValidatorNameReqCharac;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.VerifierNameReqCharac;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementImpl#getImportance <em>Importance</em>}</li>
 *   <li>{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementImpl#getVerifierName <em>Verifier Name</em>}</li>
 *   <li>{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementImpl#getVV_Method <em>VV Method</em>}</li>
 *   <li>{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementImpl#getVV_Status <em>VV Status</em>}</li>
 *   <li>{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementImpl#getAbstractionLevel <em>Abstraction Level</em>}</li>
 *   <li>{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementImpl#getApprovalAuthority <em>Approval Authority</em>}</li>
 *   <li>{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementImpl#getLifeCyclePhase <em>Life Cycle Phase</em>}</li>
 *   <li>{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementImpl#getMaturity <em>Maturity</em>}</li>
 *   <li>{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementImpl#getQualificationStatus <em>Qualification Status</em>}</li>
 *   <li>{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementImpl#getQualityNature <em>Quality Nature</em>}</li>
 *   <li>{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementImpl#getReviewStatus <em>Review Status</em>}</li>
 *   <li>{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementImpl#getSatisfactionStatus <em>Satisfaction Status</em>}</li>
 *   <li>{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementImpl#getValidatorName <em>Validator Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequirementImpl extends AgreementStatusReqCharacImpl implements Requirement {
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
	protected static final PriorityKind PRIORITY_EDEFAULT = PriorityKind.MANDATORY;

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
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__IMPORTANCE:
				return getImportance();
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__VERIFIER_NAME:
				return getVerifierName();
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__VV_METHOD:
				return getVV_Method();
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__VV_STATUS:
				return getVV_Status();
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__ABSTRACTION_LEVEL:
				return getAbstractionLevel();
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__APPROVAL_AUTHORITY:
				return getApprovalAuthority();
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__LIFE_CYCLE_PHASE:
				return getLifeCyclePhase();
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__MATURITY:
				return getMaturity();
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__OWNER:
				return getOwner();
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__PRIORITY:
				return getPriority();
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__QUALIFICATION_STATUS:
				return getQualificationStatus();
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__QUALITY_NATURE:
				return getQualityNature();
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__REVIEW_STATUS:
				return getReviewStatus();
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__SATISFACTION_STATUS:
				return getSatisfactionStatus();
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__SOURCE:
				return getSource();
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__VALIDATOR_NAME:
				return getValidatorName();
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
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__IMPORTANCE:
				setImportance((ImportanceKind)newValue);
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
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__ABSTRACTION_LEVEL:
				setAbstractionLevel((AbstractionLevelKind)newValue);
				return;
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__APPROVAL_AUTHORITY:
				setApprovalAuthority((String)newValue);
				return;
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__LIFE_CYCLE_PHASE:
				setLifeCyclePhase((LifeCyclePhaseKind)newValue);
				return;
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__MATURITY:
				setMaturity((Integer)newValue);
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
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__QUALITY_NATURE:
				setQualityNature((QualityKind)newValue);
				return;
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__REVIEW_STATUS:
				setReviewStatus((ReviewStatusKind)newValue);
				return;
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__SATISFACTION_STATUS:
				setSatisfactionStatus((SatisfactionStatusKind)newValue);
				return;
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__SOURCE:
				setSource((String)newValue);
				return;
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__VALIDATOR_NAME:
				setValidatorName((String)newValue);
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
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__IMPORTANCE:
				setImportance(IMPORTANCE_EDEFAULT);
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
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__ABSTRACTION_LEVEL:
				setAbstractionLevel(ABSTRACTION_LEVEL_EDEFAULT);
				return;
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__APPROVAL_AUTHORITY:
				setApprovalAuthority(APPROVAL_AUTHORITY_EDEFAULT);
				return;
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__LIFE_CYCLE_PHASE:
				setLifeCyclePhase(LIFE_CYCLE_PHASE_EDEFAULT);
				return;
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__MATURITY:
				setMaturity(MATURITY_EDEFAULT);
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
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__QUALITY_NATURE:
				setQualityNature(QUALITY_NATURE_EDEFAULT);
				return;
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__REVIEW_STATUS:
				setReviewStatus(REVIEW_STATUS_EDEFAULT);
				return;
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__SATISFACTION_STATUS:
				setSatisfactionStatus(SATISFACTION_STATUS_EDEFAULT);
				return;
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__VALIDATOR_NAME:
				setValidatorName(VALIDATOR_NAME_EDEFAULT);
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
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__IMPORTANCE:
				return importance != IMPORTANCE_EDEFAULT;
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__VERIFIER_NAME:
				return VERIFIER_NAME_EDEFAULT == null ? verifierName != null : !VERIFIER_NAME_EDEFAULT.equals(verifierName);
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__VV_METHOD:
				return vV_Method != VV_METHOD_EDEFAULT;
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__VV_STATUS:
				return vV_Status != VV_STATUS_EDEFAULT;
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__ABSTRACTION_LEVEL:
				return abstractionLevel != ABSTRACTION_LEVEL_EDEFAULT;
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__APPROVAL_AUTHORITY:
				return APPROVAL_AUTHORITY_EDEFAULT == null ? approvalAuthority != null : !APPROVAL_AUTHORITY_EDEFAULT.equals(approvalAuthority);
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__LIFE_CYCLE_PHASE:
				return lifeCyclePhase != LIFE_CYCLE_PHASE_EDEFAULT;
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__MATURITY:
				return maturity != MATURITY_EDEFAULT;
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__OWNER:
				return OWNER_EDEFAULT == null ? owner != null : !OWNER_EDEFAULT.equals(owner);
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__QUALIFICATION_STATUS:
				return qualificationStatus != QUALIFICATION_STATUS_EDEFAULT;
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__QUALITY_NATURE:
				return qualityNature != QUALITY_NATURE_EDEFAULT;
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__REVIEW_STATUS:
				return reviewStatus != REVIEW_STATUS_EDEFAULT;
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__SATISFACTION_STATUS:
				return satisfactionStatus != SATISFACTION_STATUS_EDEFAULT;
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__SOURCE:
				return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
			case RequirementGenericCharacteristicsPackage.REQUIREMENT__VALIDATOR_NAME:
				return VALIDATOR_NAME_EDEFAULT == null ? validatorName != null : !VALIDATOR_NAME_EDEFAULT.equals(validatorName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ImportanceReqCharac.class) {
			switch (derivedFeatureID) {
				case RequirementGenericCharacteristicsPackage.REQUIREMENT__IMPORTANCE: return RequirementGenericCharacteristicsPackage.IMPORTANCE_REQ_CHARAC__IMPORTANCE;
				default: return -1;
			}
		}
		if (baseClass == VerifierNameReqCharac.class) {
			switch (derivedFeatureID) {
				case RequirementGenericCharacteristicsPackage.REQUIREMENT__VERIFIER_NAME: return RequirementGenericCharacteristicsPackage.VERIFIER_NAME_REQ_CHARAC__VERIFIER_NAME;
				case RequirementGenericCharacteristicsPackage.REQUIREMENT__VV_METHOD: return RequirementGenericCharacteristicsPackage.VERIFIER_NAME_REQ_CHARAC__VV_METHOD;
				case RequirementGenericCharacteristicsPackage.REQUIREMENT__VV_STATUS: return RequirementGenericCharacteristicsPackage.VERIFIER_NAME_REQ_CHARAC__VV_STATUS;
				default: return -1;
			}
		}
		if (baseClass == AbstractionLevelReqCharac.class) {
			switch (derivedFeatureID) {
				case RequirementGenericCharacteristicsPackage.REQUIREMENT__ABSTRACTION_LEVEL: return RequirementGenericCharacteristicsPackage.ABSTRACTION_LEVEL_REQ_CHARAC__ABSTRACTION_LEVEL;
				default: return -1;
			}
		}
		if (baseClass == ApprovalAuthorityReqCharac.class) {
			switch (derivedFeatureID) {
				case RequirementGenericCharacteristicsPackage.REQUIREMENT__APPROVAL_AUTHORITY: return RequirementGenericCharacteristicsPackage.APPROVAL_AUTHORITY_REQ_CHARAC__APPROVAL_AUTHORITY;
				default: return -1;
			}
		}
		if (baseClass == LifeCyclePhaseReqCharac.class) {
			switch (derivedFeatureID) {
				case RequirementGenericCharacteristicsPackage.REQUIREMENT__LIFE_CYCLE_PHASE: return RequirementGenericCharacteristicsPackage.LIFE_CYCLE_PHASE_REQ_CHARAC__LIFE_CYCLE_PHASE;
				default: return -1;
			}
		}
		if (baseClass == MaturityReqCharac.class) {
			switch (derivedFeatureID) {
				case RequirementGenericCharacteristicsPackage.REQUIREMENT__MATURITY: return RequirementGenericCharacteristicsPackage.MATURITY_REQ_CHARAC__MATURITY;
				default: return -1;
			}
		}
		if (baseClass == OwnerReqCharac.class) {
			switch (derivedFeatureID) {
				case RequirementGenericCharacteristicsPackage.REQUIREMENT__OWNER: return RequirementGenericCharacteristicsPackage.OWNER_REQ_CHARAC__OWNER;
				default: return -1;
			}
		}
		if (baseClass == PriorityReqCharac.class) {
			switch (derivedFeatureID) {
				case RequirementGenericCharacteristicsPackage.REQUIREMENT__PRIORITY: return RequirementGenericCharacteristicsPackage.PRIORITY_REQ_CHARAC__PRIORITY;
				default: return -1;
			}
		}
		if (baseClass == QualificationStatusReqCharac.class) {
			switch (derivedFeatureID) {
				case RequirementGenericCharacteristicsPackage.REQUIREMENT__QUALIFICATION_STATUS: return RequirementGenericCharacteristicsPackage.QUALIFICATION_STATUS_REQ_CHARAC__QUALIFICATION_STATUS;
				default: return -1;
			}
		}
		if (baseClass == QualityNatureReqCharac.class) {
			switch (derivedFeatureID) {
				case RequirementGenericCharacteristicsPackage.REQUIREMENT__QUALITY_NATURE: return RequirementGenericCharacteristicsPackage.QUALITY_NATURE_REQ_CHARAC__QUALITY_NATURE;
				default: return -1;
			}
		}
		if (baseClass == ReviewStatusReqCharac.class) {
			switch (derivedFeatureID) {
				case RequirementGenericCharacteristicsPackage.REQUIREMENT__REVIEW_STATUS: return RequirementGenericCharacteristicsPackage.REVIEW_STATUS_REQ_CHARAC__REVIEW_STATUS;
				default: return -1;
			}
		}
		if (baseClass == SatifiactionStatusReqCharac.class) {
			switch (derivedFeatureID) {
				case RequirementGenericCharacteristicsPackage.REQUIREMENT__SATISFACTION_STATUS: return RequirementGenericCharacteristicsPackage.SATIFIACTION_STATUS_REQ_CHARAC__SATISFACTION_STATUS;
				default: return -1;
			}
		}
		if (baseClass == SourceReqCharac.class) {
			switch (derivedFeatureID) {
				case RequirementGenericCharacteristicsPackage.REQUIREMENT__SOURCE: return RequirementGenericCharacteristicsPackage.SOURCE_REQ_CHARAC__SOURCE;
				default: return -1;
			}
		}
		if (baseClass == ValidatorNameReqCharac.class) {
			switch (derivedFeatureID) {
				case RequirementGenericCharacteristicsPackage.REQUIREMENT__VALIDATOR_NAME: return RequirementGenericCharacteristicsPackage.VALIDATOR_NAME_REQ_CHARAC__VALIDATOR_NAME;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ImportanceReqCharac.class) {
			switch (baseFeatureID) {
				case RequirementGenericCharacteristicsPackage.IMPORTANCE_REQ_CHARAC__IMPORTANCE: return RequirementGenericCharacteristicsPackage.REQUIREMENT__IMPORTANCE;
				default: return -1;
			}
		}
		if (baseClass == VerifierNameReqCharac.class) {
			switch (baseFeatureID) {
				case RequirementGenericCharacteristicsPackage.VERIFIER_NAME_REQ_CHARAC__VERIFIER_NAME: return RequirementGenericCharacteristicsPackage.REQUIREMENT__VERIFIER_NAME;
				case RequirementGenericCharacteristicsPackage.VERIFIER_NAME_REQ_CHARAC__VV_METHOD: return RequirementGenericCharacteristicsPackage.REQUIREMENT__VV_METHOD;
				case RequirementGenericCharacteristicsPackage.VERIFIER_NAME_REQ_CHARAC__VV_STATUS: return RequirementGenericCharacteristicsPackage.REQUIREMENT__VV_STATUS;
				default: return -1;
			}
		}
		if (baseClass == AbstractionLevelReqCharac.class) {
			switch (baseFeatureID) {
				case RequirementGenericCharacteristicsPackage.ABSTRACTION_LEVEL_REQ_CHARAC__ABSTRACTION_LEVEL: return RequirementGenericCharacteristicsPackage.REQUIREMENT__ABSTRACTION_LEVEL;
				default: return -1;
			}
		}
		if (baseClass == ApprovalAuthorityReqCharac.class) {
			switch (baseFeatureID) {
				case RequirementGenericCharacteristicsPackage.APPROVAL_AUTHORITY_REQ_CHARAC__APPROVAL_AUTHORITY: return RequirementGenericCharacteristicsPackage.REQUIREMENT__APPROVAL_AUTHORITY;
				default: return -1;
			}
		}
		if (baseClass == LifeCyclePhaseReqCharac.class) {
			switch (baseFeatureID) {
				case RequirementGenericCharacteristicsPackage.LIFE_CYCLE_PHASE_REQ_CHARAC__LIFE_CYCLE_PHASE: return RequirementGenericCharacteristicsPackage.REQUIREMENT__LIFE_CYCLE_PHASE;
				default: return -1;
			}
		}
		if (baseClass == MaturityReqCharac.class) {
			switch (baseFeatureID) {
				case RequirementGenericCharacteristicsPackage.MATURITY_REQ_CHARAC__MATURITY: return RequirementGenericCharacteristicsPackage.REQUIREMENT__MATURITY;
				default: return -1;
			}
		}
		if (baseClass == OwnerReqCharac.class) {
			switch (baseFeatureID) {
				case RequirementGenericCharacteristicsPackage.OWNER_REQ_CHARAC__OWNER: return RequirementGenericCharacteristicsPackage.REQUIREMENT__OWNER;
				default: return -1;
			}
		}
		if (baseClass == PriorityReqCharac.class) {
			switch (baseFeatureID) {
				case RequirementGenericCharacteristicsPackage.PRIORITY_REQ_CHARAC__PRIORITY: return RequirementGenericCharacteristicsPackage.REQUIREMENT__PRIORITY;
				default: return -1;
			}
		}
		if (baseClass == QualificationStatusReqCharac.class) {
			switch (baseFeatureID) {
				case RequirementGenericCharacteristicsPackage.QUALIFICATION_STATUS_REQ_CHARAC__QUALIFICATION_STATUS: return RequirementGenericCharacteristicsPackage.REQUIREMENT__QUALIFICATION_STATUS;
				default: return -1;
			}
		}
		if (baseClass == QualityNatureReqCharac.class) {
			switch (baseFeatureID) {
				case RequirementGenericCharacteristicsPackage.QUALITY_NATURE_REQ_CHARAC__QUALITY_NATURE: return RequirementGenericCharacteristicsPackage.REQUIREMENT__QUALITY_NATURE;
				default: return -1;
			}
		}
		if (baseClass == ReviewStatusReqCharac.class) {
			switch (baseFeatureID) {
				case RequirementGenericCharacteristicsPackage.REVIEW_STATUS_REQ_CHARAC__REVIEW_STATUS: return RequirementGenericCharacteristicsPackage.REQUIREMENT__REVIEW_STATUS;
				default: return -1;
			}
		}
		if (baseClass == SatifiactionStatusReqCharac.class) {
			switch (baseFeatureID) {
				case RequirementGenericCharacteristicsPackage.SATIFIACTION_STATUS_REQ_CHARAC__SATISFACTION_STATUS: return RequirementGenericCharacteristicsPackage.REQUIREMENT__SATISFACTION_STATUS;
				default: return -1;
			}
		}
		if (baseClass == SourceReqCharac.class) {
			switch (baseFeatureID) {
				case RequirementGenericCharacteristicsPackage.SOURCE_REQ_CHARAC__SOURCE: return RequirementGenericCharacteristicsPackage.REQUIREMENT__SOURCE;
				default: return -1;
			}
		}
		if (baseClass == ValidatorNameReqCharac.class) {
			switch (baseFeatureID) {
				case RequirementGenericCharacteristicsPackage.VALIDATOR_NAME_REQ_CHARAC__VALIDATOR_NAME: return RequirementGenericCharacteristicsPackage.REQUIREMENT__VALIDATOR_NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (importance: "); //$NON-NLS-1$
		result.append(importance);
		result.append(", verifierName: "); //$NON-NLS-1$
		result.append(verifierName);
		result.append(", VV_Method: "); //$NON-NLS-1$
		result.append(vV_Method);
		result.append(", VV_Status: "); //$NON-NLS-1$
		result.append(vV_Status);
		result.append(", abstractionLevel: "); //$NON-NLS-1$
		result.append(abstractionLevel);
		result.append(", approvalAuthority: "); //$NON-NLS-1$
		result.append(approvalAuthority);
		result.append(", lifeCyclePhase: "); //$NON-NLS-1$
		result.append(lifeCyclePhase);
		result.append(", maturity: "); //$NON-NLS-1$
		result.append(maturity);
		result.append(", owner: "); //$NON-NLS-1$
		result.append(owner);
		result.append(", priority: "); //$NON-NLS-1$
		result.append(priority);
		result.append(", qualificationStatus: "); //$NON-NLS-1$
		result.append(qualificationStatus);
		result.append(", qualityNature: "); //$NON-NLS-1$
		result.append(qualityNature);
		result.append(", reviewStatus: "); //$NON-NLS-1$
		result.append(reviewStatus);
		result.append(", satisfactionStatus: "); //$NON-NLS-1$
		result.append(satisfactionStatus);
		result.append(", source: "); //$NON-NLS-1$
		result.append(source);
		result.append(", validatorName: "); //$NON-NLS-1$
		result.append(validatorName);
		result.append(')');
		return result.toString();
	}

} //RequirementImpl
