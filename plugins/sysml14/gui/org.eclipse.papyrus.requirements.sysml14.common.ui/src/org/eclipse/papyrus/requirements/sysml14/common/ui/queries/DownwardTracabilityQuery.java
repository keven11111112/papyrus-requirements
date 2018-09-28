/*****************************************************************************
 * Copyright (c) 2016,2018 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 
 * 		Patrick Tessier (Patrick.tessier@cea.fr) CEA LIST
 *
 *****************************************************************************/
package org.eclipse.papyrus.requirements.sysml14.common.ui.queries;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.papyrus.emf.facet.efacet.core.IFacetManager;
import org.eclipse.papyrus.emf.facet.efacet.core.exception.DerivedTypedElementException;
import org.eclipse.papyrus.emf.facet.query.java.core.IJavaQuery2;
import org.eclipse.papyrus.emf.facet.query.java.core.IParameterValueList2;
import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.resource.UMLResource;

/**
 * Req03: Papyrus Req  shall provides a means to display downward traceability in the model explorer
 *
 */
public class DownwardTracabilityQuery implements IJavaQuery2<NamedElement,  Collection<EObject>> {
	public Collection<EObject>  evaluate(final NamedElement context, 
			final IParameterValueList2 parameterValues,
			final IFacetManager facetManager)
					throws DerivedTypedElementException {


		ArrayList<EObject> result= new ArrayList<EObject>();
		if( context  instanceof DirectedRelationship) {
			result.addAll(((DirectedRelationship)context).getSources());
		}
		else {

			ResourceSet resourceSet=context.eResource().getResourceSet();
			for (Iterator<Resource> iteratorResource = resourceSet.getResources().iterator(); iteratorResource.hasNext();) {
				Resource resource = (Resource) iteratorResource.next();
				if( resource instanceof UMLResource) {

					for (Iterator<EObject> iteratorObject = resource.getAllContents(); iteratorObject.hasNext();) {
						EObject ownedElement = (EObject) iteratorObject.next();
						if(ownedElement instanceof DirectedRelationship) {
							if(((DirectedRelationship)ownedElement).getTargets().contains(context)) {
								result.add(ownedElement);
							}
						}
					}
				}
			}
		}
		return result;

	}

	/**
	 * @param elem
	 *            UML model element
	 * @return the highest level Package of the element
	 */
	public static Package getToPackage(Element elememt) {
		Package tmp = elememt.getNearestPackage();
		while (tmp.getOwner() != null && (tmp.getOwner() instanceof Package)) {
			tmp = (Package) tmp.getOwner();
		}
		return tmp;
	}
}
