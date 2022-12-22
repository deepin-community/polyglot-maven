/**
 * <copyright>
 * </copyright>
 *
 */
package org.sonatype.maven.dependencyDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sonatype.maven.dependencyDsl.Entity#getExtends <em>Extends</em>}</li>
 *   <li>{@link org.sonatype.maven.dependencyDsl.Entity#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sonatype.maven.dependencyDsl.DependencyDslPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends Type
{
  /**
   * Returns the value of the '<em><b>Extends</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Extends</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extends</em>' reference.
   * @see #setExtends(Entity)
   * @see org.sonatype.maven.dependencyDsl.DependencyDslPackage#getEntity_Extends()
   * @model
   * @generated
   */
  Entity getExtends();

  /**
   * Sets the value of the '{@link org.sonatype.maven.dependencyDsl.Entity#getExtends <em>Extends</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Extends</em>' reference.
   * @see #getExtends()
   * @generated
   */
  void setExtends(Entity value);

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link org.sonatype.maven.dependencyDsl.Property}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see org.sonatype.maven.dependencyDsl.DependencyDslPackage#getEntity_Properties()
   * @model containment="true"
   * @generated
   */
  EList<Property> getProperties();

} // Entity
