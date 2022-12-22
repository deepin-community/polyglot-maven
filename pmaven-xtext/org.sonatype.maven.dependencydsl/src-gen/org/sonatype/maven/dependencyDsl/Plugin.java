/**
 * <copyright>
 * </copyright>
 *
 */
package org.sonatype.maven.dependencyDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plugin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sonatype.maven.dependencyDsl.Plugin#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link org.sonatype.maven.dependencyDsl.Plugin#getArtifactId <em>Artifact Id</em>}</li>
 *   <li>{@link org.sonatype.maven.dependencyDsl.Plugin#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sonatype.maven.dependencyDsl.DependencyDslPackage#getPlugin()
 * @model
 * @generated
 */
public interface Plugin extends EObject
{
  /**
   * Returns the value of the '<em><b>Group Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Group Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Group Id</em>' attribute.
   * @see #setGroupId(String)
   * @see org.sonatype.maven.dependencyDsl.DependencyDslPackage#getPlugin_GroupId()
   * @model
   * @generated
   */
  String getGroupId();

  /**
   * Sets the value of the '{@link org.sonatype.maven.dependencyDsl.Plugin#getGroupId <em>Group Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Group Id</em>' attribute.
   * @see #getGroupId()
   * @generated
   */
  void setGroupId(String value);

  /**
   * Returns the value of the '<em><b>Artifact Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Artifact Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Artifact Id</em>' attribute.
   * @see #setArtifactId(String)
   * @see org.sonatype.maven.dependencyDsl.DependencyDslPackage#getPlugin_ArtifactId()
   * @model
   * @generated
   */
  String getArtifactId();

  /**
   * Sets the value of the '{@link org.sonatype.maven.dependencyDsl.Plugin#getArtifactId <em>Artifact Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Artifact Id</em>' attribute.
   * @see #getArtifactId()
   * @generated
   */
  void setArtifactId(String value);

  /**
   * Returns the value of the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Version</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Version</em>' attribute.
   * @see #setVersion(String)
   * @see org.sonatype.maven.dependencyDsl.DependencyDslPackage#getPlugin_Version()
   * @model
   * @generated
   */
  String getVersion();

  /**
   * Sets the value of the '{@link org.sonatype.maven.dependencyDsl.Plugin#getVersion <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Version</em>' attribute.
   * @see #getVersion()
   * @generated
   */
  void setVersion(String value);

} // Plugin
