/**
 */
package org.eclipse.papyrus.proxy.proxy;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.proxy.proxy.ProxyPackage
 * @generated
 */
public interface ProxyFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProxyFactory eINSTANCE = org.eclipse.papyrus.proxy.proxy.impl.ProxyFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Ecore Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ecore Reference</em>'.
	 * @generated
	 */
	EcoreReference createEcoreReference();

	/**
	 * Returns a new object of class '<em>File Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Reference</em>'.
	 * @generated
	 */
	FileReference createFileReference();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ProxyPackage getProxyPackage();

} //ProxyFactory
