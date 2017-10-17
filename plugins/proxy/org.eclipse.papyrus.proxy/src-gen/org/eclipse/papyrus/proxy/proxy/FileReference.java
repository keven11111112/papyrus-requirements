/**
 */
package org.eclipse.papyrus.proxy.proxy;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.proxy.proxy.FileReference#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.proxy.proxy.ProxyPackage#getFileReference()
 * @model
 * @generated
 */
public interface FileReference extends Proxy {

	/**
	 * Returns the value of the '<em><b>Ref</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' attribute.
	 * @see #setRef(String)
	 * @see org.eclipse.papyrus.proxy.proxy.ProxyPackage#getFileReference_Ref()
	 * @model default=" " dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getRef();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.proxy.proxy.FileReference#getRef <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' attribute.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(String value);
} // FileReference
