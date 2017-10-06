/*******************************************************************************
 * Copyright (c) 2017 CEA LIST.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Yupanqui Munoz Julho (CEA LIST) <yupanqui.munozjulho@cea.fr> - initial API and implementation
 *******************************************************************************/
package org.eclipse.papyrus.requirements.sysml14.migrationtoreq;

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.core.services.ServicesRegistry;
import org.eclipse.papyrus.infra.emf.utils.ServiceUtilsForEObject;
import org.eclipse.papyrus.sysml14.requirements.Requirement;
import org.eclipse.papyrus.uml.tools.utils.PackageUtil;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * This class executes the migration from SysML 1.4 model to another domain model. 
 *
 */
public class MigrationToSysML14Requirement {

	/** Label of the command to apply annotation on the UML model. */
	private static final String CMD_LABEL_APPLY_ANNOTATION_ON_UML_MODEL = "Apply Annotation on the UML model"; //$NON-NLS-1$

	/** Message of the error during the service registry search. */
	private static final String ERROR_SERVICE_REAGITRY_SEARCH = "Error during the service registry search"; //$NON-NLS-1$

	public static void executeMigration(final Package rootPackage, final MigrationFromSysML14Rules migrationRules, final Profile targetProfile, Model topModel) {

		TransactionalEditingDomain domain = getTransactionalEditingDomain(rootPackage);

		RecordingCommand applyAnnotationCmd = new RecordingCommand(domain, CMD_LABEL_APPLY_ANNOTATION_ON_UML_MODEL) {
			@Override
			protected void doExecute() {
				if (!topModel.isProfileApplied(targetProfile)) {
					PackageUtil.applyProfile(topModel, targetProfile, true);
				}

				if (topModel.isProfileApplied(targetProfile)) {
					walkThroughPackageAndApplyRules(rootPackage, migrationRules);
				}
			}
		};

		try {
			domain.getCommandStack().execute(applyAnnotationCmd);
		} catch (final IllegalArgumentException exception) {
			Activator.log.error("Error during the the migration from SysML 1.4 model to another domain model", exception); //$NON-NLS-1$

		}
	}

	protected static void walkThroughPackageAndApplyRules(Package rootPackage, MigrationFromSysML14Rules migrationRules) {
		for (Element element : rootPackage.allOwnedElements()) {
			Requirement sysmlRequirement = UMLUtil.getStereotypeApplication(element, Requirement.class);

			if (sysmlRequirement != null) {
				migrationRules.setRequirement(element, sysmlRequirement);
				element.unapplyStereotype(UMLUtil.getStereotype(sysmlRequirement));
			}
		}

	}


	/**
	 * Get transactional editing domain.
	 *
	 * @param element
	 *            Element for which an editing domain is searched
	 * @return TransactionalEditingDomain found
	 */
	private static TransactionalEditingDomain getTransactionalEditingDomain(final Element element) {
		TransactionalEditingDomain editingDomain = null;

		ServicesRegistry vServiceRegistry = null;
		try {
			vServiceRegistry = ServiceUtilsForEObject.getInstance().getServiceRegistry(element);
		} catch (final ServiceException exception) {
			Activator.log.error(ERROR_SERVICE_REAGITRY_SEARCH, exception);
		}

		try {
			editingDomain = vServiceRegistry.getService(TransactionalEditingDomain.class);
		} catch (final ServiceException exception) {
			Activator.log.error(ERROR_SERVICE_REAGITRY_SEARCH, exception);
		}

		return editingDomain;
	}
}
