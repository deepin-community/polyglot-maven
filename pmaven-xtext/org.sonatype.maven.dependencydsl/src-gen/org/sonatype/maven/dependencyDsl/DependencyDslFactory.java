/**
 * <copyright>
 * </copyright>
 *
 */
package org.sonatype.maven.dependencyDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.sonatype.maven.dependencyDsl.DependencyDslPackage
 * @generated
 */
public interface DependencyDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DependencyDslFactory eINSTANCE = org.sonatype.maven.dependencyDsl.impl.DependencyDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Project</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Project</em>'.
   * @generated
   */
  Project createProject();

  /**
   * Returns a new object of class '<em>GA</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>GA</em>'.
   * @generated
   */
  GA createGA();

  /**
   * Returns a new object of class '<em>Dependency</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dependency</em>'.
   * @generated
   */
  Dependency createDependency();

  /**
   * Returns a new object of class '<em>Mapped Dependency</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mapped Dependency</em>'.
   * @generated
   */
  MappedDependency createMappedDependency();

  /**
   * Returns a new object of class '<em>Plugin</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Plugin</em>'.
   * @generated
   */
  Plugin createPlugin();

  /**
   * Returns a new object of class '<em>Extension</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Extension</em>'.
   * @generated
   */
  Extension createExtension();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import</em>'.
   * @generated
   */
  Import createImport();

  /**
   * Returns a new object of class '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type</em>'.
   * @generated
   */
  Type createType();

  /**
   * Returns a new object of class '<em>Simple Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simple Type</em>'.
   * @generated
   */
  SimpleType createSimpleType();

  /**
   * Returns a new object of class '<em>Entity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entity</em>'.
   * @generated
   */
  Entity createEntity();

  /**
   * Returns a new object of class '<em>Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property</em>'.
   * @generated
   */
  Property createProperty();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  DependencyDslPackage getDependencyDslPackage();

} //DependencyDslFactory
