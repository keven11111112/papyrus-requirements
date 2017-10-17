/**
 */
package org.eclipse.papyrus.proxy.proxy.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.papyrus.proxy.proxy.*;
import org.eclipse.papyrus.proxy.proxy.EcoreReference;
import org.eclipse.papyrus.proxy.proxy.FileReference;
import org.eclipse.papyrus.proxy.proxy.ProxyFactory;
import org.eclipse.papyrus.proxy.proxy.ProxyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProxyFactoryImpl extends EFactoryImpl implements ProxyFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProxyFactory init() {
		try {
			ProxyFactory theProxyFactory = (ProxyFactory)EPackage.Registry.INSTANCE.getEFactory(ProxyPackage.eNS_URI);
			if (theProxyFactory != null) {
				return theProxyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ProxyFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProxyFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ProxyPackage.ECORE_REFERENCE: return createEcoreReference();
			case ProxyPackage.FILE_REFERENCE: return createFileReference();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreReference createEcoreReference() {
		EcoreReferenceImpl ecoreReference = new EcoreReferenceImpl();
		return ecoreReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileReference createFileReference() {
		FileReferenceImpl fileReference = new FileReferenceImpl();
		return fileReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProxyPackage getProxyPackage() {
		return (ProxyPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ProxyPackage getPackage() {
		return ProxyPackage.eINSTANCE;
	}

} // ProxyFactoryImpl
