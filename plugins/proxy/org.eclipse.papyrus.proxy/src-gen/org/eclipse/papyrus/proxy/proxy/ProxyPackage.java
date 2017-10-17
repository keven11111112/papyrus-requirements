/**
 */
package org.eclipse.papyrus.proxy.proxy;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.eclipse.papyrus.proxy.proxy.ProxyFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Proxy'"
 * @generated
 */
public interface ProxyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "proxy";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.eclipse.papyrus/proxy";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Proxy";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProxyPackage eINSTANCE = org.eclipse.papyrus.proxy.proxy.impl.ProxyPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.proxy.proxy.impl.ProxyImpl <em>Proxy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.proxy.proxy.impl.ProxyImpl
	 * @see org.eclipse.papyrus.proxy.proxy.impl.ProxyPackageImpl#getProxy()
	 * @generated
	 */
	int PROXY = 1;

	/**
	 * The feature id for the '<em><b>Base Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY__BASE_ELEMENT = 0;

	/**
	 * The number of structural features of the '<em>Proxy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Proxy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.proxy.proxy.impl.EcoreReferenceImpl <em>Ecore Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.proxy.proxy.impl.EcoreReferenceImpl
	 * @see org.eclipse.papyrus.proxy.proxy.impl.ProxyPackageImpl#getEcoreReference()
	 * @generated
	 */
	int ECORE_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Base Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_REFERENCE__BASE_ELEMENT = PROXY__BASE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_REFERENCE__REF = PROXY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ecore Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_REFERENCE_FEATURE_COUNT = PROXY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ecore Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_REFERENCE_OPERATION_COUNT = PROXY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.proxy.proxy.impl.FileReferenceImpl <em>File Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.proxy.proxy.impl.FileReferenceImpl
	 * @see org.eclipse.papyrus.proxy.proxy.impl.ProxyPackageImpl#getFileReference()
	 * @generated
	 */
	int FILE_REFERENCE = 2;

	/**
	 * The feature id for the '<em><b>Base Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_REFERENCE__BASE_ELEMENT = PROXY__BASE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_REFERENCE__REF = PROXY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>File Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_REFERENCE_FEATURE_COUNT = PROXY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>File Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_REFERENCE_OPERATION_COUNT = PROXY_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.proxy.proxy.EcoreReference <em>Ecore Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ecore Reference</em>'.
	 * @see org.eclipse.papyrus.proxy.proxy.EcoreReference
	 * @generated
	 */
	EClass getEcoreReference();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.proxy.proxy.EcoreReference#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see org.eclipse.papyrus.proxy.proxy.EcoreReference#getRef()
	 * @see #getEcoreReference()
	 * @generated
	 */
	EReference getEcoreReference_Ref();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.proxy.proxy.Proxy <em>Proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proxy</em>'.
	 * @see org.eclipse.papyrus.proxy.proxy.Proxy
	 * @generated
	 */
	EClass getProxy();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.proxy.proxy.Proxy#getBase_Element <em>Base Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Element</em>'.
	 * @see org.eclipse.papyrus.proxy.proxy.Proxy#getBase_Element()
	 * @see #getProxy()
	 * @generated
	 */
	EReference getProxy_Base_Element();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.proxy.proxy.FileReference <em>File Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Reference</em>'.
	 * @see org.eclipse.papyrus.proxy.proxy.FileReference
	 * @generated
	 */
	EClass getFileReference();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.proxy.proxy.FileReference#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see org.eclipse.papyrus.proxy.proxy.FileReference#getRef()
	 * @see #getFileReference()
	 * @generated
	 */
	EAttribute getFileReference_Ref();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProxyFactory getProxyFactory();

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
		 * The meta object literal for the '{@link org.eclipse.papyrus.proxy.proxy.impl.EcoreReferenceImpl <em>Ecore Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.proxy.proxy.impl.EcoreReferenceImpl
		 * @see org.eclipse.papyrus.proxy.proxy.impl.ProxyPackageImpl#getEcoreReference()
		 * @generated
		 */
		EClass ECORE_REFERENCE = eINSTANCE.getEcoreReference();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECORE_REFERENCE__REF = eINSTANCE.getEcoreReference_Ref();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.proxy.proxy.impl.ProxyImpl <em>Proxy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.proxy.proxy.impl.ProxyImpl
		 * @see org.eclipse.papyrus.proxy.proxy.impl.ProxyPackageImpl#getProxy()
		 * @generated
		 */
		EClass PROXY = eINSTANCE.getProxy();

		/**
		 * The meta object literal for the '<em><b>Base Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROXY__BASE_ELEMENT = eINSTANCE.getProxy_Base_Element();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.proxy.proxy.impl.FileReferenceImpl <em>File Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.proxy.proxy.impl.FileReferenceImpl
		 * @see org.eclipse.papyrus.proxy.proxy.impl.ProxyPackageImpl#getFileReference()
		 * @generated
		 */
		EClass FILE_REFERENCE = eINSTANCE.getFileReference();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_REFERENCE__REF = eINSTANCE.getFileReference_Ref();

	}

} //ProxyPackage
