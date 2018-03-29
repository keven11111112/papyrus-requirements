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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.RequirementGenericCharacteristicsPackage
 * @generated
 */
public class RequirementGenericCharacteristicsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RequirementGenericCharacteristicsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementGenericCharacteristicsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RequirementGenericCharacteristicsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementGenericCharacteristicsSwitch<Adapter> modelSwitch =
		new RequirementGenericCharacteristicsSwitch<Adapter>() {
			@Override
			public Adapter caseRequirement(Requirement object) {
				return createRequirementAdapter();
			}
			@Override
			public Adapter caseOwnerReqCharac(OwnerReqCharac object) {
				return createOwnerReqCharacAdapter();
			}
			@Override
			public Adapter caseImportanceReqCharac(ImportanceReqCharac object) {
				return createImportanceReqCharacAdapter();
			}
			@Override
			public Adapter caseApprovalAuthorityReqCharac(ApprovalAuthorityReqCharac object) {
				return createApprovalAuthorityReqCharacAdapter();
			}
			@Override
			public Adapter caseAgreementStatusReqCharac(AgreementStatusReqCharac object) {
				return createAgreementStatusReqCharacAdapter();
			}
			@Override
			public Adapter caseMaturityReqCharac(MaturityReqCharac object) {
				return createMaturityReqCharacAdapter();
			}
			@Override
			public Adapter caseLifeCyclePhaseReqCharac(LifeCyclePhaseReqCharac object) {
				return createLifeCyclePhaseReqCharacAdapter();
			}
			@Override
			public Adapter caseAbstractionLevelReqCharac(AbstractionLevelReqCharac object) {
				return createAbstractionLevelReqCharacAdapter();
			}
			@Override
			public Adapter casePriorityReqCharac(PriorityReqCharac object) {
				return createPriorityReqCharacAdapter();
			}
			@Override
			public Adapter caseSourceReqCharac(SourceReqCharac object) {
				return createSourceReqCharacAdapter();
			}
			@Override
			public Adapter caseQualificationStatusReqCharac(QualificationStatusReqCharac object) {
				return createQualificationStatusReqCharacAdapter();
			}
			@Override
			public Adapter caseReviewStatusReqCharac(ReviewStatusReqCharac object) {
				return createReviewStatusReqCharacAdapter();
			}
			@Override
			public Adapter caseValidatorNameReqCharac(ValidatorNameReqCharac object) {
				return createValidatorNameReqCharacAdapter();
			}
			@Override
			public Adapter caseQualityNatureReqCharac(QualityNatureReqCharac object) {
				return createQualityNatureReqCharacAdapter();
			}
			@Override
			public Adapter caseVerifierNameReqCharac(VerifierNameReqCharac object) {
				return createVerifierNameReqCharacAdapter();
			}
			@Override
			public Adapter caseSatifiactionStatusReqCharac(SatifiactionStatusReqCharac object) {
				return createSatifiactionStatusReqCharacAdapter();
			}
			@Override
			public Adapter caseRequirements_Requirement(org.eclipse.papyrus.sysml14.requirements.Requirement object) {
				return createRequirements_RequirementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.Requirement
	 * @generated
	 */
	public Adapter createRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.OwnerReqCharac <em>Owner Req Charac</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.OwnerReqCharac
	 * @generated
	 */
	public Adapter createOwnerReqCharacAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.ImportanceReqCharac <em>Importance Req Charac</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.ImportanceReqCharac
	 * @generated
	 */
	public Adapter createImportanceReqCharacAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.ApprovalAuthorityReqCharac <em>Approval Authority Req Charac</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.ApprovalAuthorityReqCharac
	 * @generated
	 */
	public Adapter createApprovalAuthorityReqCharacAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.AgreementStatusReqCharac <em>Agreement Status Req Charac</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.AgreementStatusReqCharac
	 * @generated
	 */
	public Adapter createAgreementStatusReqCharacAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.MaturityReqCharac <em>Maturity Req Charac</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.MaturityReqCharac
	 * @generated
	 */
	public Adapter createMaturityReqCharacAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.LifeCyclePhaseReqCharac <em>Life Cycle Phase Req Charac</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.LifeCyclePhaseReqCharac
	 * @generated
	 */
	public Adapter createLifeCyclePhaseReqCharacAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.AbstractionLevelReqCharac <em>Abstraction Level Req Charac</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.AbstractionLevelReqCharac
	 * @generated
	 */
	public Adapter createAbstractionLevelReqCharacAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.PriorityReqCharac <em>Priority Req Charac</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.PriorityReqCharac
	 * @generated
	 */
	public Adapter createPriorityReqCharacAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.SourceReqCharac <em>Source Req Charac</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.SourceReqCharac
	 * @generated
	 */
	public Adapter createSourceReqCharacAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.QualificationStatusReqCharac <em>Qualification Status Req Charac</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.QualificationStatusReqCharac
	 * @generated
	 */
	public Adapter createQualificationStatusReqCharacAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.ReviewStatusReqCharac <em>Review Status Req Charac</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.ReviewStatusReqCharac
	 * @generated
	 */
	public Adapter createReviewStatusReqCharacAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.ValidatorNameReqCharac <em>Validator Name Req Charac</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.ValidatorNameReqCharac
	 * @generated
	 */
	public Adapter createValidatorNameReqCharacAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.QualityNatureReqCharac <em>Quality Nature Req Charac</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.QualityNatureReqCharac
	 * @generated
	 */
	public Adapter createQualityNatureReqCharacAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.VerifierNameReqCharac <em>Verifier Name Req Charac</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.VerifierNameReqCharac
	 * @generated
	 */
	public Adapter createVerifierNameReqCharacAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.SatifiactionStatusReqCharac <em>Satifiaction Status Req Charac</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.SatifiactionStatusReqCharac
	 * @generated
	 */
	public Adapter createSatifiactionStatusReqCharacAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.sysml14.requirements.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.sysml14.requirements.Requirement
	 * @generated
	 */
	public Adapter createRequirements_RequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RequirementGenericCharacteristicsAdapterFactory
