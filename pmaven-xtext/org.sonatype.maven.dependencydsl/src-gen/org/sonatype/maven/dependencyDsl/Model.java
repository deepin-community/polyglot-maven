/**
 * <copyright>
 * </copyright>
 *
 */
package org.sonatype.maven.dependencyDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sonatype.maven.dependencyDsl.Model#getImports <em>Imports</em>}</li>
 *   <li>{@link org.sonatype.maven.dependencyDsl.Model#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sonatype.maven.dependencyDsl.DependencyDslPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link org.sonatype.maven.dependencyDsl.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see org.sonatype.maven.dependencyDsl.DependencyDslPackage#getModel_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.sonatype.maven.dependencyDsl.Type}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see org.sonatype.maven.dependencyDsl.DependencyDslPackage#getModel_Elements()
   * @model containment="true"
   * @generated
   */
  EList<Type> getElements();

} // Model
