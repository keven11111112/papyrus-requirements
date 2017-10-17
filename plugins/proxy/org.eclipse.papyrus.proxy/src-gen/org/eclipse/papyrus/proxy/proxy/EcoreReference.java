/**
 */
package org.eclipse.papyrus.proxy.proxy;

import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ecore Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.proxy.proxy.EcoreReference#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.proxy.proxy.ProxyPackage#getEcoreReference()
 * @model
 * @generated
 */
public interface EcoreReference extends Proxy {

	/**
	 * Returns the value of the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' reference.
	 * @see #setRef(EObject)
	 * @see org.eclipse.papyrus.proxy.proxy.ProxyPackage#getEcoreReference_Ref()
	 * @model ordered="false"
	 * @generated
	 */
	EObject getRef();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.proxy.proxy.EcoreReference#getRef <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(EObject value);
} // EcoreReference
