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
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sonatype.maven.dependencyDsl.Project#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link org.sonatype.maven.dependencyDsl.Project#getArtifactId <em>Artifact Id</em>}</li>
 *   <li>{@link org.sonatype.maven.dependencyDsl.Project#getVersion <em>Version</em>}</li>
 *   <li>{@link org.sonatype.maven.dependencyDsl.Project#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link org.sonatype.maven.dependencyDsl.Project#getMappedDependencies <em>Mapped Dependencies</em>}</li>
 *   <li>{@link org.sonatype.maven.dependencyDsl.Project#getPlugins <em>Plugins</em>}</li>
 *   <li>{@link org.sonatype.maven.dependencyDsl.Project#getExtensions <em>Extensions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sonatype.maven.dependencyDsl.DependencyDslPackage#getProject()
 * @model
 * @generated
 */
public interface Project extends EObject
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
   * @see org.sonatype.maven.dependencyDsl.DependencyDslPackage#getProject_GroupId()
   * @model
   * @generated
   */
  String getGroupId();

  /**
   * Sets the value of the '{@link org.sonatype.maven.dependencyDsl.Project#getGroupId <em>Group Id</em>}' attribute.
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
   * @see org.sonatype.maven.dependencyDsl.DependencyDslPackage#getProject_ArtifactId()
   * @model
   * @generated
   */
  String getArtifactId();

  /**
   * Sets the value of the '{@link org.sonatype.maven.dependencyDsl.Project#getArtifactId <em>Artifact Id</em>}' attribute.
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
   * @see org.sonatype.maven.dependencyDsl.DependencyDslPackage#getProject_Version()
   * @model
   * @generated
   */
  String getVersion();

  /**
   * Sets the value of the '{@link org.sonatype.maven.dependencyDsl.Project#getVersion <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Version</em>' attribute.
   * @see #getVersion()
   * @generated
   */
  void setVersion(String value);

  /**
   * Returns the value of the '<em><b>Dependencies</b></em>' containment reference list.
   * The list contents are of type {@link org.sonatype.maven.dependencyDsl.Dependency}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dependencies</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dependencies</em>' containment reference list.
   * @see org.sonatype.maven.dependencyDsl.DependencyDslPackage#getProject_Dependencies()
   * @model containment="true"
   * @generated
   */
  EList<Dependency> getDependencies();

  /**
   * Returns the value of the '<em><b>Mapped Dependencies</b></em>' containment reference list.
   * The list contents are of type {@link org.sonatype.maven.dependencyDsl.MappedDependency}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mapped Dependencies</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mapped Dependencies</em>' containment reference list.
   * @see org.sonatype.maven.dependencyDsl.DependencyDslPackage#getProject_MappedDependencies()
   * @model containment="true"
   * @generated
   */
  EList<MappedDependency> getMappedDependencies();

  /**
   * Returns the value of the '<em><b>Plugins</b></em>' containment reference list.
   * The list contents are of type {@link org.sonatype.maven.dependencyDsl.Plugin}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Plugins</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Plugins</em>' containment reference list.
   * @see org.sonatype.maven.dependencyDsl.DependencyDslPackage#getProject_Plugins()
   * @model containment="true"
   * @generated
   */
  EList<Plugin> getPlugins();

  /**
   * Returns the value of the '<em><b>Extensions</b></em>' containment reference list.
   * The list contents are of type {@link org.sonatype.maven.dependencyDsl.Extension}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Extensions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extensions</em>' containment reference list.
   * @see org.sonatype.maven.dependencyDsl.DependencyDslPackage#getProject_Extensions()
   * @model containment="true"
   * @generated
   */
  EList<Extension> getExtensions();

} // Project
