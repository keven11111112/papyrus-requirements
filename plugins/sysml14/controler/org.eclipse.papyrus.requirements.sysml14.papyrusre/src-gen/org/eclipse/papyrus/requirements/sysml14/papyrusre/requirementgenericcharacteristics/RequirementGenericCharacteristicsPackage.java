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
package org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.papyrus.sysml14.requirements.RequirementsPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.RequirementGenericCharacteristicsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='RequirementGenericCharacteristics'"
 * @generated
 */
public interface RequirementGenericCharacteristicsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "requirementgenericcharacteristics"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/papyrus/requirements/sysml14/0.7.0/PapyrusRE/RequirementGenericCharacteristics"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "RequirementGenericCharacteristics"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RequirementGenericCharacteristicsPackage eINSTANCE = org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementGenericCharacteristicsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.AgreementStatusReqCharacImpl <em>Agreement Status Req Charac</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.AgreementStatusReqCharacImpl
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementGenericCharacteristicsPackageImpl#getAgreementStatusReqCharac()
	 * @generated
	 */
	int AGREEMENT_STATUS_REQ_CHARAC = 4;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_STATUS_REQ_CHARAC__BASE_CLASS = RequirementsPackage.REQUIREMENT__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_STATUS_REQ_CHARAC__DERIVED = RequirementsPackage.REQUIREMENT__DERIVED;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_STATUS_REQ_CHARAC__DERIVED_FROM = RequirementsPackage.REQUIREMENT__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_STATUS_REQ_CHARAC__ID = RequirementsPackage.REQUIREMENT__ID;

	/**
	 * The feature id for the '<em><b>Master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_STATUS_REQ_CHARAC__MASTER = RequirementsPackage.REQUIREMENT__MASTER;

	/**
	 * The feature id for the '<em><b>Refined By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_STATUS_REQ_CHARAC__REFINED_BY = RequirementsPackage.REQUIREMENT__REFINED_BY;

	/**
	 * The feature id for the '<em><b>Satisfied By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_STATUS_REQ_CHARAC__SATISFIED_BY = RequirementsPackage.REQUIREMENT__SATISFIED_BY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_STATUS_REQ_CHARAC__TEXT = RequirementsPackage.REQUIREMENT__TEXT;

	/**
	 * The feature id for the '<em><b>Traced To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_STATUS_REQ_CHARAC__TRACED_TO = RequirementsPackage.REQUIREMENT__TRACED_TO;

	/**
	 * The feature id for the '<em><b>Verified By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_STATUS_REQ_CHARAC__VERIFIED_BY = RequirementsPackage.REQUIREMENT__VERIFIED_BY;

	/**
	 * The feature id for the '<em><b>Agreement Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_STATUS_REQ_CHARAC__AGREEMENT_STATUS = RequirementsPackage.REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Agreement Status Req Charac</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_STATUS_REQ_CHARAC_FEATURE_COUNT = RequirementsPackage.REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Agreement Status Req Charac</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_STATUS_REQ_CHARAC_OPERATION_COUNT = RequirementsPackage.REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementImpl <em>Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementImpl
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementGenericCharacteristicsPackageImpl#getRequirement()
	 * @generated
	 */
	int REQUIREMENT = 0;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__BASE_CLASS = AGREEMENT_STATUS_REQ_CHARAC__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__DERIVED = AGREEMENT_STATUS_REQ_CHARAC__DERIVED;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__DERIVED_FROM = AGREEMENT_STATUS_REQ_CHARAC__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ID = AGREEMENT_STATUS_REQ_CHARAC__ID;

	/**
	 * The feature id for the '<em><b>Master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__MASTER = AGREEMENT_STATUS_REQ_CHARAC__MASTER;

	/**
	 * The feature id for the '<em><b>Refined By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__REFINED_BY = AGREEMENT_STATUS_REQ_CHARAC__REFINED_BY;

	/**
	 * The feature id for the '<em><b>Satisfied By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__SATISFIED_BY = AGREEMENT_STATUS_REQ_CHARAC__SATISFIED_BY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__TEXT = AGREEMENT_STATUS_REQ_CHARAC__TEXT;

	/**
	 * The feature id for the '<em><b>Traced To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__TRACED_TO = AGREEMENT_STATUS_REQ_CHARAC__TRACED_TO;

	/**
	 * The feature id for the '<em><b>Verified By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__VERIFIED_BY = AGREEMENT_STATUS_REQ_CHARAC__VERIFIED_BY;

	/**
	 * The feature id for the '<em><b>Agreement Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__AGREEMENT_STATUS = AGREEMENT_STATUS_REQ_CHARAC__AGREEMENT_STATUS;

	/**
	 * The feature id for the '<em><b>Importance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__IMPORTANCE = AGREEMENT_STATUS_REQ_CHARAC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Verifier Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__VERIFIER_NAME = AGREEMENT_STATUS_REQ_CHARAC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>VV Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__VV_METHOD = AGREEMENT_STATUS_REQ_CHARAC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>VV Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__VV_STATUS = AGREEMENT_STATUS_REQ_CHARAC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Abstraction Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ABSTRACTION_LEVEL = AGREEMENT_STATUS_REQ_CHARAC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Approval Authority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__APPROVAL_AUTHORITY = AGREEMENT_STATUS_REQ_CHARAC_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Life Cycle Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__LIFE_CYCLE_PHASE = AGREEMENT_STATUS_REQ_CHARAC_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Maturity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__MATURITY = AGREEMENT_STATUS_REQ_CHARAC_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__OWNER = AGREEMENT_STATUS_REQ_CHARAC_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__PRIORITY = AGREEMENT_STATUS_REQ_CHARAC_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Qualification Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__QUALIFICATION_STATUS = AGREEMENT_STATUS_REQ_CHARAC_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Quality Nature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__QUALITY_NATURE = AGREEMENT_STATUS_REQ_CHARAC_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Review Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__REVIEW_STATUS = AGREEMENT_STATUS_REQ_CHARAC_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Satisfaction Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__SATISFACTION_STATUS = AGREEMENT_STATUS_REQ_CHARAC_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__SOURCE = AGREEMENT_STATUS_REQ_CHARAC_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Validator Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__VALIDATOR_NAME = AGREEMENT_STATUS_REQ_CHARAC_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_FEATURE_COUNT = AGREEMENT_STATUS_REQ_CHARAC_FEATURE_COUNT + 16;

	/**
	 * The number of operations of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_OPERATION_COUNT = AGREEMENT_STATUS_REQ_CHARAC_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.OwnerReqCharacImpl <em>Owner Req Charac</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.OwnerReqCharacImpl
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementGenericCharacteristicsPackageImpl#getOwnerReqCharac()
	 * @generated
	 */
	int OWNER_REQ_CHARAC = 1;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNER_REQ_CHARAC__OWNER = 0;

	/**
	 * The number of structural features of the '<em>Owner Req Charac</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNER_REQ_CHARAC_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Owner Req Charac</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNER_REQ_CHARAC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.ImportanceReqCharacImpl <em>Importance Req Charac</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.ImportanceReqCharacImpl
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementGenericCharacteristicsPackageImpl#getImportanceReqCharac()
	 * @generated
	 */
	int IMPORTANCE_REQ_CHARAC = 2;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTANCE_REQ_CHARAC__BASE_CLASS = RequirementsPackage.REQUIREMENT__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTANCE_REQ_CHARAC__DERIVED = RequirementsPackage.REQUIREMENT__DERIVED;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTANCE_REQ_CHARAC__DERIVED_FROM = RequirementsPackage.REQUIREMENT__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTANCE_REQ_CHARAC__ID = RequirementsPackage.REQUIREMENT__ID;

	/**
	 * The feature id for the '<em><b>Master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTANCE_REQ_CHARAC__MASTER = RequirementsPackage.REQUIREMENT__MASTER;

	/**
	 * The feature id for the '<em><b>Refined By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTANCE_REQ_CHARAC__REFINED_BY = RequirementsPackage.REQUIREMENT__REFINED_BY;

	/**
	 * The feature id for the '<em><b>Satisfied By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTANCE_REQ_CHARAC__SATISFIED_BY = RequirementsPackage.REQUIREMENT__SATISFIED_BY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTANCE_REQ_CHARAC__TEXT = RequirementsPackage.REQUIREMENT__TEXT;

	/**
	 * The feature id for the '<em><b>Traced To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTANCE_REQ_CHARAC__TRACED_TO = RequirementsPackage.REQUIREMENT__TRACED_TO;

	/**
	 * The feature id for the '<em><b>Verified By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTANCE_REQ_CHARAC__VERIFIED_BY = RequirementsPackage.REQUIREMENT__VERIFIED_BY;

	/**
	 * The feature id for the '<em><b>Importance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTANCE_REQ_CHARAC__IMPORTANCE = RequirementsPackage.REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Importance Req Charac</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTANCE_REQ_CHARAC_FEATURE_COUNT = RequirementsPackage.REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Importance Req Charac</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTANCE_REQ_CHARAC_OPERATION_COUNT = RequirementsPackage.REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.ApprovalAuthorityReqCharacImpl <em>Approval Authority Req Charac</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.ApprovalAuthorityReqCharacImpl
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementGenericCharacteristicsPackageImpl#getApprovalAuthorityReqCharac()
	 * @generated
	 */
	int APPROVAL_AUTHORITY_REQ_CHARAC = 3;

	/**
	 * The feature id for the '<em><b>Approval Authority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROVAL_AUTHORITY_REQ_CHARAC__APPROVAL_AUTHORITY = 0;

	/**
	 * The number of structural features of the '<em>Approval Authority Req Charac</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROVAL_AUTHORITY_REQ_CHARAC_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Approval Authority Req Charac</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROVAL_AUTHORITY_REQ_CHARAC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.MaturityReqCharacImpl <em>Maturity Req Charac</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.MaturityReqCharacImpl
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementGenericCharacteristicsPackageImpl#getMaturityReqCharac()
	 * @generated
	 */
	int MATURITY_REQ_CHARAC = 5;

	/**
	 * The feature id for the '<em><b>Maturity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATURITY_REQ_CHARAC__MATURITY = 0;

	/**
	 * The number of structural features of the '<em>Maturity Req Charac</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATURITY_REQ_CHARAC_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Maturity Req Charac</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATURITY_REQ_CHARAC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.LifeCyclePhaseReqCharacImpl <em>Life Cycle Phase Req Charac</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.LifeCyclePhaseReqCharacImpl
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementGenericCharacteristicsPackageImpl#getLifeCyclePhaseReqCharac()
	 * @generated
	 */
	int LIFE_CYCLE_PHASE_REQ_CHARAC = 6;

	/**
	 * The feature id for the '<em><b>Life Cycle Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFE_CYCLE_PHASE_REQ_CHARAC__LIFE_CYCLE_PHASE = 0;

	/**
	 * The number of structural features of the '<em>Life Cycle Phase Req Charac</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFE_CYCLE_PHASE_REQ_CHARAC_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Life Cycle Phase Req Charac</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFE_CYCLE_PHASE_REQ_CHARAC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.AbstractionLevelReqCharacImpl <em>Abstraction Level Req Charac</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.AbstractionLevelReqCharacImpl
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementGenericCharacteristicsPackageImpl#getAbstractionLevelReqCharac()
	 * @generated
	 */
	int ABSTRACTION_LEVEL_REQ_CHARAC = 7;

	/**
	 * The feature id for the '<em><b>Abstraction Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION_LEVEL_REQ_CHARAC__ABSTRACTION_LEVEL = 0;

	/**
	 * The number of structural features of the '<em>Abstraction Level Req Charac</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION_LEVEL_REQ_CHARAC_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Abstraction Level Req Charac</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION_LEVEL_REQ_CHARAC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.PriorityReqCharacImpl <em>Priority Req Charac</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.PriorityReqCharacImpl
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementGenericCharacteristicsPackageImpl#getPriorityReqCharac()
	 * @generated
	 */
	int PRIORITY_REQ_CHARAC = 8;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITY_REQ_CHARAC__PRIORITY = 0;

	/**
	 * The number of structural features of the '<em>Priority Req Charac</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITY_REQ_CHARAC_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Priority Req Charac</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITY_REQ_CHARAC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.SourceReqCharacImpl <em>Source Req Charac</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.SourceReqCharacImpl
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementGenericCharacteristicsPackageImpl#getSourceReqCharac()
	 * @generated
	 */
	int SOURCE_REQ_CHARAC = 9;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_REQ_CHARAC__SOURCE = 0;

	/**
	 * The number of structural features of the '<em>Source Req Charac</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_REQ_CHARAC_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Source Req Charac</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_REQ_CHARAC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.QualificationStatusReqCharacImpl <em>Qualification Status Req Charac</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.QualificationStatusReqCharacImpl
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementGenericCharacteristicsPackageImpl#getQualificationStatusReqCharac()
	 * @generated
	 */
	int QUALIFICATION_STATUS_REQ_CHARAC = 10;

	/**
	 * The feature id for the '<em><b>Qualification Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFICATION_STATUS_REQ_CHARAC__QUALIFICATION_STATUS = 0;

	/**
	 * The number of structural features of the '<em>Qualification Status Req Charac</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFICATION_STATUS_REQ_CHARAC_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Qualification Status Req Charac</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFICATION_STATUS_REQ_CHARAC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.ReviewStatusReqCharacImpl <em>Review Status Req Charac</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.ReviewStatusReqCharacImpl
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementGenericCharacteristicsPackageImpl#getReviewStatusReqCharac()
	 * @generated
	 */
	int REVIEW_STATUS_REQ_CHARAC = 11;

	/**
	 * The feature id for the '<em><b>Review Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_STATUS_REQ_CHARAC__REVIEW_STATUS = 0;

	/**
	 * The number of structural features of the '<em>Review Status Req Charac</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_STATUS_REQ_CHARAC_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Review Status Req Charac</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_STATUS_REQ_CHARAC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.ValidatorNameReqCharacImpl <em>Validator Name Req Charac</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.ValidatorNameReqCharacImpl
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementGenericCharacteristicsPackageImpl#getValidatorNameReqCharac()
	 * @generated
	 */
	int VALIDATOR_NAME_REQ_CHARAC = 12;

	/**
	 * The feature id for the '<em><b>Validator Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATOR_NAME_REQ_CHARAC__VALIDATOR_NAME = 0;

	/**
	 * The number of structural features of the '<em>Validator Name Req Charac</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATOR_NAME_REQ_CHARAC_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Validator Name Req Charac</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATOR_NAME_REQ_CHARAC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.QualityNatureReqCharacImpl <em>Quality Nature Req Charac</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.QualityNatureReqCharacImpl
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementGenericCharacteristicsPackageImpl#getQualityNatureReqCharac()
	 * @generated
	 */
	int QUALITY_NATURE_REQ_CHARAC = 13;

	/**
	 * The feature id for the '<em><b>Quality Nature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_NATURE_REQ_CHARAC__QUALITY_NATURE = 0;

	/**
	 * The number of structural features of the '<em>Quality Nature Req Charac</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_NATURE_REQ_CHARAC_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Quality Nature Req Charac</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_NATURE_REQ_CHARAC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.VerifierNameReqCharacImpl <em>Verifier Name Req Charac</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.VerifierNameReqCharacImpl
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementGenericCharacteristicsPackageImpl#getVerifierNameReqCharac()
	 * @generated
	 */
	int VERIFIER_NAME_REQ_CHARAC = 14;

	/**
	 * The feature id for the '<em><b>Verifier Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIER_NAME_REQ_CHARAC__VERIFIER_NAME = 0;

	/**
	 * The feature id for the '<em><b>VV Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIER_NAME_REQ_CHARAC__VV_METHOD = 1;

	/**
	 * The feature id for the '<em><b>VV Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIER_NAME_REQ_CHARAC__VV_STATUS = 2;

	/**
	 * The number of structural features of the '<em>Verifier Name Req Charac</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIER_NAME_REQ_CHARAC_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Verifier Name Req Charac</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIER_NAME_REQ_CHARAC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.SatifiactionStatusReqCharacImpl <em>Satifiaction Status Req Charac</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.SatifiactionStatusReqCharacImpl
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementGenericCharacteristicsPackageImpl#getSatifiactionStatusReqCharac()
	 * @generated
	 */
	int SATIFIACTION_STATUS_REQ_CHARAC = 15;

	/**
	 * The feature id for the '<em><b>Satisfaction Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATIFIACTION_STATUS_REQ_CHARAC__SATISFACTION_STATUS = 0;

	/**
	 * The number of structural features of the '<em>Satifiaction Status Req Charac</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATIFIACTION_STATUS_REQ_CHARAC_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Satifiaction Status Req Charac</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATIFIACTION_STATUS_REQ_CHARAC_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement</em>'.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.Requirement
	 * @generated
	 */
	EClass getRequirement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.OwnerReqCharac <em>Owner Req Charac</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Owner Req Charac</em>'.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.OwnerReqCharac
	 * @generated
	 */
	EClass getOwnerReqCharac();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.OwnerReqCharac#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owner</em>'.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.OwnerReqCharac#getOwner()
	 * @see #getOwnerReqCharac()
	 * @generated
	 */
	EAttribute getOwnerReqCharac_Owner();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.ImportanceReqCharac <em>Importance Req Charac</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Importance Req Charac</em>'.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.ImportanceReqCharac
	 * @generated
	 */
	EClass getImportanceReqCharac();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.ImportanceReqCharac#getImportance <em>Importance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Importance</em>'.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.ImportanceReqCharac#getImportance()
	 * @see #getImportanceReqCharac()
	 * @generated
	 */
	EAttribute getImportanceReqCharac_Importance();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.ApprovalAuthorityReqCharac <em>Approval Authority Req Charac</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Approval Authority Req Charac</em>'.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.ApprovalAuthorityReqCharac
	 * @generated
	 */
	EClass getApprovalAuthorityReqCharac();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.ApprovalAuthorityReqCharac#getApprovalAuthority <em>Approval Authority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Approval Authority</em>'.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.ApprovalAuthorityReqCharac#getApprovalAuthority()
	 * @see #getApprovalAuthorityReqCharac()
	 * @generated
	 */
	EAttribute getApprovalAuthorityReqCharac_ApprovalAuthority();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.AgreementStatusReqCharac <em>Agreement Status Req Charac</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agreement Status Req Charac</em>'.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.AgreementStatusReqCharac
	 * @generated
	 */
	EClass getAgreementStatusReqCharac();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.AgreementStatusReqCharac#getAgreementStatus <em>Agreement Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Agreement Status</em>'.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.AgreementStatusReqCharac#getAgreementStatus()
	 * @see #getAgreementStatusReqCharac()
	 * @generated
	 */
	EAttribute getAgreementStatusReqCharac_AgreementStatus();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.MaturityReqCharac <em>Maturity Req Charac</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Maturity Req Charac</em>'.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.MaturityReqCharac
	 * @generated
	 */
	EClass getMaturityReqCharac();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.MaturityReqCharac#getMaturity <em>Maturity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maturity</em>'.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.MaturityReqCharac#getMaturity()
	 * @see #getMaturityReqCharac()
	 * @generated
	 */
	EAttribute getMaturityReqCharac_Maturity();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.LifeCyclePhaseReqCharac <em>Life Cycle Phase Req Charac</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Life Cycle Phase Req Charac</em>'.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.LifeCyclePhaseReqCharac
	 * @generated
	 */
	EClass getLifeCyclePhaseReqCharac();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.LifeCyclePhaseReqCharac#getLifeCyclePhase <em>Life Cycle Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Life Cycle Phase</em>'.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.LifeCyclePhaseReqCharac#getLifeCyclePhase()
	 * @see #getLifeCyclePhaseReqCharac()
	 * @generated
	 */
	EAttribute getLifeCyclePhaseReqCharac_LifeCyclePhase();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.AbstractionLevelReqCharac <em>Abstraction Level Req Charac</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstraction Level Req Charac</em>'.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.AbstractionLevelReqCharac
	 * @generated
	 */
	EClass getAbstractionLevelReqCharac();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.AbstractionLevelReqCharac#getAbstractionLevel <em>Abstraction Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstraction Level</em>'.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.AbstractionLevelReqCharac#getAbstractionLevel()
	 * @see #getAbstractionLevelReqCharac()
	 * @generated
	 */
	EAttribute getAbstractionLevelReqCharac_AbstractionLevel();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.PriorityReqCharac <em>Priority Req Charac</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Priority Req Charac</em>'.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.PriorityReqCharac
	 * @generated
	 */
	EClass getPriorityReqCharac();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.PriorityReqCharac#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.PriorityReqCharac#getPriority()
	 * @see #getPriorityReqCharac()
	 * @generated
	 */
	EAttribute getPriorityReqCharac_Priority();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.SourceReqCharac <em>Source Req Charac</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Req Charac</em>'.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.SourceReqCharac
	 * @generated
	 */
	EClass getSourceReqCharac();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.SourceReqCharac#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.SourceReqCharac#getSource()
	 * @see #getSourceReqCharac()
	 * @generated
	 */
	EAttribute getSourceReqCharac_Source();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.QualificationStatusReqCharac <em>Qualification Status Req Charac</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qualification Status Req Charac</em>'.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.QualificationStatusReqCharac
	 * @generated
	 */
	EClass getQualificationStatusReqCharac();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.QualificationStatusReqCharac#getQualificationStatus <em>Qualification Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualification Status</em>'.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.QualificationStatusReqCharac#getQualificationStatus()
	 * @see #getQualificationStatusReqCharac()
	 * @generated
	 */
	EAttribute getQualificationStatusReqCharac_QualificationStatus();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.ReviewStatusReqCharac <em>Review Status Req Charac</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Review Status Req Charac</em>'.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.ReviewStatusReqCharac
	 * @generated
	 */
	EClass getReviewStatusReqCharac();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.ReviewStatusReqCharac#getReviewStatus <em>Review Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Review Status</em>'.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.ReviewStatusReqCharac#getReviewStatus()
	 * @see #getReviewStatusReqCharac()
	 * @generated
	 */
	EAttribute getReviewStatusReqCharac_ReviewStatus();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.ValidatorNameReqCharac <em>Validator Name Req Charac</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Validator Name Req Charac</em>'.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.ValidatorNameReqCharac
	 * @generated
	 */
	EClass getValidatorNameReqCharac();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.ValidatorNameReqCharac#getValidatorName <em>Validator Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validator Name</em>'.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.ValidatorNameReqCharac#getValidatorName()
	 * @see #getValidatorNameReqCharac()
	 * @generated
	 */
	EAttribute getValidatorNameReqCharac_ValidatorName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.QualityNatureReqCharac <em>Quality Nature Req Charac</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quality Nature Req Charac</em>'.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.QualityNatureReqCharac
	 * @generated
	 */
	EClass getQualityNatureReqCharac();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.QualityNatureReqCharac#getQualityNature <em>Quality Nature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quality Nature</em>'.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.QualityNatureReqCharac#getQualityNature()
	 * @see #getQualityNatureReqCharac()
	 * @generated
	 */
	EAttribute getQualityNatureReqCharac_QualityNature();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.VerifierNameReqCharac <em>Verifier Name Req Charac</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verifier Name Req Charac</em>'.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.VerifierNameReqCharac
	 * @generated
	 */
	EClass getVerifierNameReqCharac();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.VerifierNameReqCharac#getVerifierName <em>Verifier Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Verifier Name</em>'.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.VerifierNameReqCharac#getVerifierName()
	 * @see #getVerifierNameReqCharac()
	 * @generated
	 */
	EAttribute getVerifierNameReqCharac_VerifierName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.VerifierNameReqCharac#getVV_Method <em>VV Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>VV Method</em>'.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.VerifierNameReqCharac#getVV_Method()
	 * @see #getVerifierNameReqCharac()
	 * @generated
	 */
	EAttribute getVerifierNameReqCharac_VV_Method();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.VerifierNameReqCharac#getVV_Status <em>VV Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>VV Status</em>'.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.VerifierNameReqCharac#getVV_Status()
	 * @see #getVerifierNameReqCharac()
	 * @generated
	 */
	EAttribute getVerifierNameReqCharac_VV_Status();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.SatifiactionStatusReqCharac <em>Satifiaction Status Req Charac</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Satifiaction Status Req Charac</em>'.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.SatifiactionStatusReqCharac
	 * @generated
	 */
	EClass getSatifiactionStatusReqCharac();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.SatifiactionStatusReqCharac#getSatisfactionStatus <em>Satisfaction Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Satisfaction Status</em>'.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.SatifiactionStatusReqCharac#getSatisfactionStatus()
	 * @see #getSatifiactionStatusReqCharac()
	 * @generated
	 */
	EAttribute getSatifiactionStatusReqCharac_SatisfactionStatus();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RequirementGenericCharacteristicsFactory getRequirementGenericCharacteristicsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementImpl <em>Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementImpl
		 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementGenericCharacteristicsPackageImpl#getRequirement()
		 * @generated
		 */
		EClass REQUIREMENT = eINSTANCE.getRequirement();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.OwnerReqCharacImpl <em>Owner Req Charac</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.OwnerReqCharacImpl
		 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementGenericCharacteristicsPackageImpl#getOwnerReqCharac()
		 * @generated
		 */
		EClass OWNER_REQ_CHARAC = eINSTANCE.getOwnerReqCharac();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OWNER_REQ_CHARAC__OWNER = eINSTANCE.getOwnerReqCharac_Owner();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.ImportanceReqCharacImpl <em>Importance Req Charac</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.ImportanceReqCharacImpl
		 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementGenericCharacteristicsPackageImpl#getImportanceReqCharac()
		 * @generated
		 */
		EClass IMPORTANCE_REQ_CHARAC = eINSTANCE.getImportanceReqCharac();

		/**
		 * The meta object literal for the '<em><b>Importance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORTANCE_REQ_CHARAC__IMPORTANCE = eINSTANCE.getImportanceReqCharac_Importance();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.ApprovalAuthorityReqCharacImpl <em>Approval Authority Req Charac</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.ApprovalAuthorityReqCharacImpl
		 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementGenericCharacteristicsPackageImpl#getApprovalAuthorityReqCharac()
		 * @generated
		 */
		EClass APPROVAL_AUTHORITY_REQ_CHARAC = eINSTANCE.getApprovalAuthorityReqCharac();

		/**
		 * The meta object literal for the '<em><b>Approval Authority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPROVAL_AUTHORITY_REQ_CHARAC__APPROVAL_AUTHORITY = eINSTANCE.getApprovalAuthorityReqCharac_ApprovalAuthority();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.AgreementStatusReqCharacImpl <em>Agreement Status Req Charac</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.AgreementStatusReqCharacImpl
		 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementGenericCharacteristicsPackageImpl#getAgreementStatusReqCharac()
		 * @generated
		 */
		EClass AGREEMENT_STATUS_REQ_CHARAC = eINSTANCE.getAgreementStatusReqCharac();

		/**
		 * The meta object literal for the '<em><b>Agreement Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT_STATUS_REQ_CHARAC__AGREEMENT_STATUS = eINSTANCE.getAgreementStatusReqCharac_AgreementStatus();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.MaturityReqCharacImpl <em>Maturity Req Charac</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.MaturityReqCharacImpl
		 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementGenericCharacteristicsPackageImpl#getMaturityReqCharac()
		 * @generated
		 */
		EClass MATURITY_REQ_CHARAC = eINSTANCE.getMaturityReqCharac();

		/**
		 * The meta object literal for the '<em><b>Maturity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATURITY_REQ_CHARAC__MATURITY = eINSTANCE.getMaturityReqCharac_Maturity();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.LifeCyclePhaseReqCharacImpl <em>Life Cycle Phase Req Charac</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.LifeCyclePhaseReqCharacImpl
		 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementGenericCharacteristicsPackageImpl#getLifeCyclePhaseReqCharac()
		 * @generated
		 */
		EClass LIFE_CYCLE_PHASE_REQ_CHARAC = eINSTANCE.getLifeCyclePhaseReqCharac();

		/**
		 * The meta object literal for the '<em><b>Life Cycle Phase</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIFE_CYCLE_PHASE_REQ_CHARAC__LIFE_CYCLE_PHASE = eINSTANCE.getLifeCyclePhaseReqCharac_LifeCyclePhase();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.AbstractionLevelReqCharacImpl <em>Abstraction Level Req Charac</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.AbstractionLevelReqCharacImpl
		 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementGenericCharacteristicsPackageImpl#getAbstractionLevelReqCharac()
		 * @generated
		 */
		EClass ABSTRACTION_LEVEL_REQ_CHARAC = eINSTANCE.getAbstractionLevelReqCharac();

		/**
		 * The meta object literal for the '<em><b>Abstraction Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACTION_LEVEL_REQ_CHARAC__ABSTRACTION_LEVEL = eINSTANCE.getAbstractionLevelReqCharac_AbstractionLevel();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.PriorityReqCharacImpl <em>Priority Req Charac</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.PriorityReqCharacImpl
		 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementGenericCharacteristicsPackageImpl#getPriorityReqCharac()
		 * @generated
		 */
		EClass PRIORITY_REQ_CHARAC = eINSTANCE.getPriorityReqCharac();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIORITY_REQ_CHARAC__PRIORITY = eINSTANCE.getPriorityReqCharac_Priority();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.SourceReqCharacImpl <em>Source Req Charac</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.SourceReqCharacImpl
		 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementGenericCharacteristicsPackageImpl#getSourceReqCharac()
		 * @generated
		 */
		EClass SOURCE_REQ_CHARAC = eINSTANCE.getSourceReqCharac();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_REQ_CHARAC__SOURCE = eINSTANCE.getSourceReqCharac_Source();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.QualificationStatusReqCharacImpl <em>Qualification Status Req Charac</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.QualificationStatusReqCharacImpl
		 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementGenericCharacteristicsPackageImpl#getQualificationStatusReqCharac()
		 * @generated
		 */
		EClass QUALIFICATION_STATUS_REQ_CHARAC = eINSTANCE.getQualificationStatusReqCharac();

		/**
		 * The meta object literal for the '<em><b>Qualification Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALIFICATION_STATUS_REQ_CHARAC__QUALIFICATION_STATUS = eINSTANCE.getQualificationStatusReqCharac_QualificationStatus();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.ReviewStatusReqCharacImpl <em>Review Status Req Charac</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.ReviewStatusReqCharacImpl
		 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementGenericCharacteristicsPackageImpl#getReviewStatusReqCharac()
		 * @generated
		 */
		EClass REVIEW_STATUS_REQ_CHARAC = eINSTANCE.getReviewStatusReqCharac();

		/**
		 * The meta object literal for the '<em><b>Review Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REVIEW_STATUS_REQ_CHARAC__REVIEW_STATUS = eINSTANCE.getReviewStatusReqCharac_ReviewStatus();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.ValidatorNameReqCharacImpl <em>Validator Name Req Charac</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.ValidatorNameReqCharacImpl
		 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementGenericCharacteristicsPackageImpl#getValidatorNameReqCharac()
		 * @generated
		 */
		EClass VALIDATOR_NAME_REQ_CHARAC = eINSTANCE.getValidatorNameReqCharac();

		/**
		 * The meta object literal for the '<em><b>Validator Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALIDATOR_NAME_REQ_CHARAC__VALIDATOR_NAME = eINSTANCE.getValidatorNameReqCharac_ValidatorName();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.QualityNatureReqCharacImpl <em>Quality Nature Req Charac</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.QualityNatureReqCharacImpl
		 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementGenericCharacteristicsPackageImpl#getQualityNatureReqCharac()
		 * @generated
		 */
		EClass QUALITY_NATURE_REQ_CHARAC = eINSTANCE.getQualityNatureReqCharac();

		/**
		 * The meta object literal for the '<em><b>Quality Nature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALITY_NATURE_REQ_CHARAC__QUALITY_NATURE = eINSTANCE.getQualityNatureReqCharac_QualityNature();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.VerifierNameReqCharacImpl <em>Verifier Name Req Charac</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.VerifierNameReqCharacImpl
		 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementGenericCharacteristicsPackageImpl#getVerifierNameReqCharac()
		 * @generated
		 */
		EClass VERIFIER_NAME_REQ_CHARAC = eINSTANCE.getVerifierNameReqCharac();

		/**
		 * The meta object literal for the '<em><b>Verifier Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERIFIER_NAME_REQ_CHARAC__VERIFIER_NAME = eINSTANCE.getVerifierNameReqCharac_VerifierName();

		/**
		 * The meta object literal for the '<em><b>VV Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERIFIER_NAME_REQ_CHARAC__VV_METHOD = eINSTANCE.getVerifierNameReqCharac_VV_Method();

		/**
		 * The meta object literal for the '<em><b>VV Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERIFIER_NAME_REQ_CHARAC__VV_STATUS = eINSTANCE.getVerifierNameReqCharac_VV_Status();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.SatifiactionStatusReqCharacImpl <em>Satifiaction Status Req Charac</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.SatifiactionStatusReqCharacImpl
		 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl.RequirementGenericCharacteristicsPackageImpl#getSatifiactionStatusReqCharac()
		 * @generated
		 */
		EClass SATIFIACTION_STATUS_REQ_CHARAC = eINSTANCE.getSatifiactionStatusReqCharac();

		/**
		 * The meta object literal for the '<em><b>Satisfaction Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SATIFIACTION_STATUS_REQ_CHARAC__SATISFACTION_STATUS = eINSTANCE.getSatifiactionStatusReqCharac_SatisfactionStatus();

	}

} //RequirementGenericCharacteristicsPackage
