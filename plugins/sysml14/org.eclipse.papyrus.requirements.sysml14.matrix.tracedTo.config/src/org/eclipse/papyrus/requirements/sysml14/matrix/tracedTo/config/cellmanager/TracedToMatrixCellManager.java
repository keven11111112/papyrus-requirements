/*****************************************************************************
 * Copyright (c) 2016 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 
 * 		Mauricio Alferez (mauricio.alferez@cea.fr) CEA LIST - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.requirements.sysml14.matrix.tracedTo.config.cellmanager;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.papyrus.infra.nattable.manager.cell.AbstractCellManager;
import org.eclipse.papyrus.infra.nattable.manager.table.INattableModelManager;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.ITreeItemAxis;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.AxisManagerRepresentation;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableconfiguration.TableConfiguration;
import org.eclipse.papyrus.infra.nattable.utils.AxisUtils;
import org.eclipse.papyrus.requirements.sysml14.common.I_SysMLStereotype;
import org.eclipse.papyrus.requirements.sysml14.matrix.common.utils.IntersectionEditingUtil;
import org.eclipse.papyrus.requirements.sysml14.matrix.tracedTo.config.Activator;
import org.eclipse.papyrus.sysml14.requirements.Requirement;
import org.eclipse.papyrus.sysml14.service.types.util.SysMLServiceTypeUtil;
import org.eclipse.uml2.uml.Abstraction;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.util.UMLUtil;

public class TracedToMatrixCellManager extends AbstractCellManager {
	public static final String CELL_MANAGER_ID = Activator.PLUGIN_ID + ".cellmanager.TracedToMatrixCellManager";

	@Override
	public boolean handles(Object columnElement, Object rowElement) {
		// Supports Requirement x Element
		Object column = AxisUtils.getRepresentedElement(columnElement);
		Object row = AxisUtils.getRepresentedElement(rowElement);
		if (rowElement instanceof ITreeItemAxis) {
			ITreeItemAxis axis = (ITreeItemAxis) rowElement;
			AxisManagerRepresentation manager = axis.getManager();
			TableConfiguration conf = (TableConfiguration) manager.eContainer().eContainer();
			String tableName = conf.getName();
			if (!tableName.equals("TracedToMatrixSysML14")) {
				return false;
			}
		}

		if (column instanceof Element) {
			Element colUMLElement = (Element) column;
			if (UMLUtil.getStereotypeApplication(colUMLElement, Requirement.class) != null) {
				if (row instanceof Element) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	protected Object doGetValue(Object columnElement, Object rowElement, INattableModelManager tableManager) {
		Object column = AxisUtils.getRepresentedElement(columnElement);
		Object row = AxisUtils.getRepresentedElement(rowElement);
		EObject eObjectInRow = (EObject) row;
		if (column instanceof Element) {
			Element colUMLElement = (Element) column;
			if (UMLUtil.getStereotypeApplication(colUMLElement, Requirement.class) != null) {
				Stereotype reqStereotype = colUMLElement.getAppliedStereotype(I_SysMLStereotype.REQUIREMENT_STEREOTYPE);
				Object listOfObjectsTracedToRequirement = colUMLElement.getValue(reqStereotype,
						I_SysMLStereotype.REQUIREMENT_TRACEDTO_ATT);
				if (listOfObjectsTracedToRequirement instanceof EList<?>) {
					@SuppressWarnings("unchecked")
					EList<EObject> list = (EList<EObject>) listOfObjectsTracedToRequirement;
					for (EObject eObjectTracedToRequirement : list) {
						if (eObjectInRow.equals(eObjectTracedToRequirement)) {
							return true;
						}
					}
				}

			}
		}
		return false;
	}

	@Override
	public void setValue(TransactionalEditingDomain domain, Object columnElement, Object rowElement, Object newValue,
			INattableModelManager tableManager) {
		Object column = AxisUtils.getRepresentedElement(columnElement);
		Object row = AxisUtils.getRepresentedElement(rowElement);

		if (column instanceof Element) {
			Element colUMLElement = (Element) column;

			if (Boolean.FALSE.equals(newValue)) {
				if (UMLUtil.getStereotypeApplication(colUMLElement, Requirement.class) != null) {
					IntersectionEditingUtil.deleteRelationshipInIntersection(domain, row, colUMLElement,
							I_SysMLStereotype.REQUIREMENT_STEREOTYPE, I_SysMLStereotype.REQUIREMENT_TRACEDTO_ATT,
							I_SysMLStereotype.TRACE_STEREOTYPE);
				}
			} else if (Boolean.TRUE.equals(newValue)
					|| (newValue instanceof Abstraction && ((Abstraction) newValue).eContainer() == null)) {
				IElementType type = ElementTypeRegistry.getInstance()
						.getType(SysMLServiceTypeUtil.ORG_ECLIPSE_PAPYRUS_SYSML14_TRACE_ABSTRACTION);
				if (row instanceof Element) {
					IntersectionEditingUtil.createRelationshipInIntersection(domain, row, colUMLElement, type);
				}
			}
		}
	}

	@Override
	public Command getSetValueCommand(TransactionalEditingDomain domain, Object columnElement, Object rowElement,
			Object newValue, INattableModelManager tableManager) {
		return super.getSetValueCommand(domain, columnElement, rowElement, newValue, tableManager);
	}

	@Override
	public boolean isCellEditable(Object columnElement, Object rowElement) {
		Object column = AxisUtils.getRepresentedElement(columnElement);
		Object row = AxisUtils.getRepresentedElement(rowElement);
		if (row instanceof NamedElement && column instanceof Element) {
			return UMLUtil.getStereotypeApplication((Element) column, Requirement.class) != null;
		}
		return false;
	}
}
