/*******************************************************************************
 * Copyright (c) 2017 CEA List.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Yupanqui Munoz Julho (CEA LIST) <yupanqui.munozjulho@cea.fr> - initial API and implementation
 *******************************************************************************/
package org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.impl;

import java.util.Iterator;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreEList.UnmodifiableEList;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementgenericcharacteristics.Requirement;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementtraceability.Satisfy;
import org.eclipse.papyrus.requirements.sysml14.papyrusre.requirementtraceability.Verify;
import org.eclipse.papyrus.sysml14.requirements.Copy;
import org.eclipse.papyrus.sysml14.requirements.DeriveReqt;
import org.eclipse.papyrus.sysml14.requirements.Refine;
import org.eclipse.papyrus.sysml14.requirements.RequirementsPackage;
import org.eclipse.papyrus.sysml14.requirements.Trace;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * This class has been implemented in order to calculate derived properties of "Requirement" stereotype.
 *
 */
public class RequirementCustomImpl extends RequirementImpl implements Requirement {

	/**
	 * @see org.eclipse.papyrus.sysml14.requirements.impl.RequiremenCustomtImpl#basicGetMaster()
	 *
	 * @return the Requirement
	 */
	@Override
	public Requirement basicGetMaster() {
		// The Requirement is the supplier of the Copy link between the master
		// Requirement and
		// current
		// This should return the TestCase verifying current Requirement
		Requirement master = null;
		if (getBase_Class() != null) {
			Iterator<Dependency> itDep = getBase_Class().getClientDependencies().iterator();

			// Find Copy link
			while (itDep.hasNext()) {
				Dependency currentDep = itDep.next();
				Copy currentCopy = UMLUtil.getStereotypeApplication(currentDep, Copy.class);

				if (currentCopy != null) {
					EList<NamedElement> suppliers = currentCopy.getBase_Abstraction().getSuppliers();
					Iterator<NamedElement> it = suppliers.iterator();
					while (it.hasNext() && (master == null)) {
						Requirement currentRequirement = UMLUtil.getStereotypeApplication(it.next(), Requirement.class);
						if (currentRequirement != null) {
							master = currentRequirement;
						}
					}
				}
			}
		}
		return master;
	}


	/**
	 * @see org.eclipse.papyrus.sysml14.requirements.impl.RequiremenCustomtImpl#getDerived()
	 *
	 * @return the list of Requirement
	 */
	@Override
	public EList<org.eclipse.papyrus.sysml14.requirements.Requirement> getDerived() {
		// This should return the Requirement(s) derived from current
		EList<Requirement> derived = new BasicEList<>();
		if (getBase_Class() != null) {
			Iterator<DirectedRelationship> itDep = getBase_Class().getTargetDirectedRelationships().iterator();

			// Find DeriveReqt link
			while (itDep.hasNext()) {
				DirectedRelationship currentDirectedRelationship = itDep.next();
				DeriveReqt currentDeriveReqt = UMLUtil.getStereotypeApplication(currentDirectedRelationship, DeriveReqt.class);

				if (currentDeriveReqt != null) {
					EList<NamedElement> clients = currentDeriveReqt.getBase_Abstraction().getClients();
					Iterator<NamedElement> it = clients.iterator();
					while (it.hasNext()) {
						Requirement currentRequirement = UMLUtil.getStereotypeApplication(it.next(), Requirement.class);
						if (currentRequirement != null) {
							derived.add(currentRequirement);
						}
					}
				}
			}
		}

		return new UnmodifiableEList<>(this, RequirementsPackage.eINSTANCE.getRequirement_Derived(), derived.size(), derived.toArray());
	}

	/**
	 * @see org.eclipse.papyrus.sysml14.requirements.impl.RequiremenCustomtImpl#getDerivedFrom()
	 *
	 * @return the list of Requirement
	 */
	@Override
	public EList<org.eclipse.papyrus.sysml14.requirements.Requirement> getDerivedFrom() {
		// This should return the Requirement(s) this Requirement is derived
		// from
		EList<Requirement> derivedFrom = new BasicEList<>();
		if (getBase_Class() != null) {
			Iterator<DirectedRelationship> itDep = getBase_Class().getSourceDirectedRelationships().iterator();

			// Find DeriveReqt link
			while (itDep.hasNext()) {
				DirectedRelationship currentDRelationship = itDep.next();
				DeriveReqt currentDeriveReqt = UMLUtil.getStereotypeApplication(currentDRelationship, DeriveReqt.class);

				if (currentDeriveReqt != null) {
					EList<NamedElement> suppliers = currentDeriveReqt.getBase_Abstraction().getSuppliers();
					Iterator<NamedElement> it = suppliers.iterator();
					while (it.hasNext()) {
						Requirement currentRequirement = UMLUtil.getStereotypeApplication(it.next(), Requirement.class);
						if (currentRequirement != null) {
							derivedFrom.add(currentRequirement);
						}
					}
				}
			}
		}

		return new UnmodifiableEList<>(this, RequirementsPackage.eINSTANCE.getRequirement_DerivedFrom(), derivedFrom.size(), derivedFrom.toArray());
	}

	/**
	 * @see org.eclipse.papyrus.sysml14.requirements.impl.RequiremenCustomtImpl#getRefinedBy()
	 *
	 * @return the list of refining NamedElements
	 */
	@Override
	public EList<NamedElement> getRefinedBy() {
		// This should return the NamedElement(s) that refine current
		// Requirement
		EList<NamedElement> refinedBy = new BasicEList<>();
		if (getBase_Class() != null) {
			Iterator<DirectedRelationship> itDep = getBase_Class().getTargetDirectedRelationships().iterator();

			// Find Refine link
			while (itDep.hasNext()) {
				DirectedRelationship currentDRelationship = itDep.next();
				Refine currentRefine = UMLUtil.getStereotypeApplication(currentDRelationship, Refine.class);

				if (currentRefine != null) {
					refinedBy.addAll(currentRefine.getBase_Abstraction().getClients());
				}
			}
		}

		return new UnmodifiableEList<>(this, RequirementsPackage.eINSTANCE.getRequirement_RefinedBy(), refinedBy.size(), refinedBy.toArray());
	}

	/**
	 * @see org.eclipse.papyrus.sysml14.requirements.impl.RequiremenCustomtImpl#getSatisfiedBy()
	 *
	 * @return the list of statisfying NamedElements
	 */
	@Override
	public EList<NamedElement> getSatisfiedBy() {
		// This should return the NamedElement(s) that satisfy current
		// Requirement
		EList<NamedElement> satisfyBy = new BasicEList<>();
		if (getBase_Class() != null) {
			Iterator<DirectedRelationship> itDep = getBase_Class().getTargetDirectedRelationships().iterator();

			// Find Satisfy link
			while (itDep.hasNext()) {
				DirectedRelationship currentDRelationship = itDep.next();
				Satisfy currentSatisfy = UMLUtil.getStereotypeApplication(currentDRelationship, Satisfy.class);

				if (currentSatisfy != null) {
					satisfyBy.addAll(currentSatisfy.getBase_Abstraction().getClients());
				}
			}
		}

		return new UnmodifiableEList<>(this, RequirementsPackage.eINSTANCE.getRequirement_SatisfiedBy(), satisfyBy.size(), satisfyBy.toArray());
	}

	/**
	 * @see org.eclipse.papyrus.sysml14.requirements.impl.RequiremenCustomtImpl#getTracedTo()
	 *
	 * @return the list of tracing NamedElements
	 */
	@Override
	public EList<NamedElement> getTracedTo() {
		// This should return the NamedElement(s) traced by current Requirement
		// SysML spec. : Derived from all elements that are the client of a
		// <<trace>> relationship
		// for which this requirement is a supplier.
		EList<NamedElement> tracedTo = new BasicEList<>();
		if (getBase_Class() != null) {
			Iterator<DirectedRelationship> itDep = getBase_Class().getTargetDirectedRelationships().iterator();

			// Find Trace link
			while (itDep.hasNext()) {
				DirectedRelationship currentDR = itDep.next();
				Trace currentTrace = UMLUtil.getStereotypeApplication(currentDR, Trace.class);

				// Must be a Trace not a subtype (see bug #352563).
				if (currentTrace != null && currentTrace.eClass() == RequirementsPackage.eINSTANCE.getTrace()) {
					EList<NamedElement> suppliers = currentTrace.getBase_Abstraction().getClients();
					tracedTo.addAll(suppliers);
				}
			}
		}

		return new UnmodifiableEList<>(this, RequirementsPackage.eINSTANCE.getRequirement_TracedTo(), tracedTo.size(), tracedTo.toArray());
	}

	/**
	 * @see org.eclipse.papyrus.sysml14.requirements.impl.RequiremenCustomtImpl#getVerifiedBy()
	 *
	 * @return the list of verifying NamedElements
	 */
	@Override
	public EList<NamedElement> getVerifiedBy() {
		// This should return the list of NamedElement verifying current
		// Requirement
		EList<NamedElement> verifiedBy = new BasicEList<>();
		if (getBase_Class() != null) {
			Iterator<DirectedRelationship> itDep = getBase_Class().getTargetDirectedRelationships().iterator();

			// Find Verify link
			while (itDep.hasNext()) {
				DirectedRelationship currentDRelationship = itDep.next();
				Verify currentVerify = UMLUtil.getStereotypeApplication(currentDRelationship, Verify.class);

				if (currentVerify != null) {
					verifiedBy.addAll(currentVerify.getBase_Abstraction().getClients());
				}
			}
		}
		return new UnmodifiableEList<>(this, RequirementsPackage.eINSTANCE.getRequirement_VerifiedBy(), verifiedBy.size(), verifiedBy.toArray());
	}
}
