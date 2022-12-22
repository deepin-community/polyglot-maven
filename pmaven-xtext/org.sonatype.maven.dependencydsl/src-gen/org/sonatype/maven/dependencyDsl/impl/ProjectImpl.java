/**
 * <copyright>
 * </copyright>
 *
 */
package org.sonatype.maven.dependencyDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sonatype.maven.dependencyDsl.Dependency;
import org.sonatype.maven.dependencyDsl.DependencyDslPackage;
import org.sonatype.maven.dependencyDsl.Extension;
import org.sonatype.maven.dependencyDsl.MappedDependency;
import org.sonatype.maven.dependencyDsl.Plugin;
import org.sonatype.maven.dependencyDsl.Project;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sonatype.maven.dependencyDsl.impl.ProjectImpl#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link org.sonatype.maven.dependencyDsl.impl.ProjectImpl#getArtifactId <em>Artifact Id</em>}</li>
 *   <li>{@link org.sonatype.maven.dependencyDsl.impl.ProjectImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.sonatype.maven.dependencyDsl.impl.ProjectImpl#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link org.sonatype.maven.dependencyDsl.impl.ProjectImpl#getMappedDependencies <em>Mapped Dependencies</em>}</li>
 *   <li>{@link org.sonatype.maven.dependencyDsl.impl.ProjectImpl#getPlugins <em>Plugins</em>}</li>
 *   <li>{@link org.sonatype.maven.dependencyDsl.impl.ProjectImpl#getExtensions <em>Extensions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProjectImpl extends MinimalEObjectImpl.Container implements Project
{
  /**
   * The default value of the '{@link #getGroupId() <em>Group Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupId()
   * @generated
   * @ordered
   */
  protected static final String GROUP_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGroupId() <em>Group Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupId()
   * @generated
   * @ordered
   */
  protected String groupId = GROUP_ID_EDEFAULT;

  /**
   * The default value of the '{@link #getArtifactId() <em>Artifact Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArtifactId()
   * @generated
   * @ordered
   */
  protected static final String ARTIFACT_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getArtifactId() <em>Artifact Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArtifactId()
   * @generated
   * @ordered
   */
  protected String artifactId = ARTIFACT_ID_EDEFAULT;

  /**
   * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersion()
   * @generated
   * @ordered
   */
  protected static final String VERSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersion()
   * @generated
   * @ordered
   */
  protected String version = VERSION_EDEFAULT;

  /**
   * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDependencies()
   * @generated
   * @ordered
   */
  protected EList<Dependency> dependencies;

  /**
   * The cached value of the '{@link #getMappedDependencies() <em>Mapped Dependencies</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMappedDependencies()
   * @generated
   * @ordered
   */
  protected EList<MappedDependency> mappedDependencies;

  /**
   * The cached value of the '{@link #getPlugins() <em>Plugins</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlugins()
   * @generated
   * @ordered
   */
  protected EList<Plugin> plugins;

  /**
   * The cached value of the '{@link #getExtensions() <em>Extensions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtensions()
   * @generated
   * @ordered
   */
  protected EList<Extension> extensions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProjectImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DependencyDslPackage.Literals.PROJECT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getGroupId()
  {
    return groupId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGroupId(String newGroupId)
  {
    String oldGroupId = groupId;
    groupId = newGroupId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DependencyDslPackage.PROJECT__GROUP_ID, oldGroupId, groupId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getArtifactId()
  {
    return artifactId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArtifactId(String newArtifactId)
  {
    String oldArtifactId = artifactId;
    artifactId = newArtifactId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DependencyDslPackage.PROJECT__ARTIFACT_ID, oldArtifactId, artifactId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVersion()
  {
    return version;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVersion(String newVersion)
  {
    String oldVersion = version;
    version = newVersion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DependencyDslPackage.PROJECT__VERSION, oldVersion, version));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Dependency> getDependencies()
  {
    if (dependencies == null)
    {
      dependencies = new EObjectContainmentEList<Dependency>(Dependency.class, this, DependencyDslPackage.PROJECT__DEPENDENCIES);
    }
    return dependencies;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MappedDependency> getMappedDependencies()
  {
    if (mappedDependencies == null)
    {
      mappedDependencies = new EObjectContainmentEList<MappedDependency>(MappedDependency.class, this, DependencyDslPackage.PROJECT__MAPPED_DEPENDENCIES);
    }
    return mappedDependencies;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Plugin> getPlugins()
  {
    if (plugins == null)
    {
      plugins = new EObjectContainmentEList<Plugin>(Plugin.class, this, DependencyDslPackage.PROJECT__PLUGINS);
    }
    return plugins;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Extension> getExtensions()
  {
    if (extensions == null)
    {
      extensions = new EObjectContainmentEList<Extension>(Extension.class, this, DependencyDslPackage.PROJECT__EXTENSIONS);
    }
    return extensions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DependencyDslPackage.PROJECT__DEPENDENCIES:
        return ((InternalEList<?>)getDependencies()).basicRemove(otherEnd, msgs);
      case DependencyDslPackage.PROJECT__MAPPED_DEPENDENCIES:
        return ((InternalEList<?>)getMappedDependencies()).basicRemove(otherEnd, msgs);
      case DependencyDslPackage.PROJECT__PLUGINS:
        return ((InternalEList<?>)getPlugins()).basicRemove(otherEnd, msgs);
      case DependencyDslPackage.PROJECT__EXTENSIONS:
        return ((InternalEList<?>)getExtensions()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DependencyDslPackage.PROJECT__GROUP_ID:
        return getGroupId();
      case DependencyDslPackage.PROJECT__ARTIFACT_ID:
        return getArtifactId();
      case DependencyDslPackage.PROJECT__VERSION:
        return getVersion();
      case DependencyDslPackage.PROJECT__DEPENDENCIES:
        return getDependencies();
      case DependencyDslPackage.PROJECT__MAPPED_DEPENDENCIES:
        return getMappedDependencies();
      case DependencyDslPackage.PROJECT__PLUGINS:
        return getPlugins();
      case DependencyDslPackage.PROJECT__EXTENSIONS:
        return getExtensions();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DependencyDslPackage.PROJECT__GROUP_ID:
        setGroupId((String)newValue);
        return;
      case DependencyDslPackage.PROJECT__ARTIFACT_ID:
        setArtifactId((String)newValue);
        return;
      case DependencyDslPackage.PROJECT__VERSION:
        setVersion((String)newValue);
        return;
      case DependencyDslPackage.PROJECT__DEPENDENCIES:
        getDependencies().clear();
        getDependencies().addAll((Collection<? extends Dependency>)newValue);
        return;
      case DependencyDslPackage.PROJECT__MAPPED_DEPENDENCIES:
        getMappedDependencies().clear();
        getMappedDependencies().addAll((Collection<? extends MappedDependency>)newValue);
        return;
      case DependencyDslPackage.PROJECT__PLUGINS:
        getPlugins().clear();
        getPlugins().addAll((Collection<? extends Plugin>)newValue);
        return;
      case DependencyDslPackage.PROJECT__EXTENSIONS:
        getExtensions().clear();
        getExtensions().addAll((Collection<? extends Extension>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DependencyDslPackage.PROJECT__GROUP_ID:
        setGroupId(GROUP_ID_EDEFAULT);
        return;
      case DependencyDslPackage.PROJECT__ARTIFACT_ID:
        setArtifactId(ARTIFACT_ID_EDEFAULT);
        return;
      case DependencyDslPackage.PROJECT__VERSION:
        setVersion(VERSION_EDEFAULT);
        return;
      case DependencyDslPackage.PROJECT__DEPENDENCIES:
        getDependencies().clear();
        return;
      case DependencyDslPackage.PROJECT__MAPPED_DEPENDENCIES:
        getMappedDependencies().clear();
        return;
      case DependencyDslPackage.PROJECT__PLUGINS:
        getPlugins().clear();
        return;
      case DependencyDslPackage.PROJECT__EXTENSIONS:
        getExtensions().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DependencyDslPackage.PROJECT__GROUP_ID:
        return GROUP_ID_EDEFAULT == null ? groupId != null : !GROUP_ID_EDEFAULT.equals(groupId);
      case DependencyDslPackage.PROJECT__ARTIFACT_ID:
        return ARTIFACT_ID_EDEFAULT == null ? artifactId != null : !ARTIFACT_ID_EDEFAULT.equals(artifactId);
      case DependencyDslPackage.PROJECT__VERSION:
        return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
      case DependencyDslPackage.PROJECT__DEPENDENCIES:
        return dependencies != null && !dependencies.isEmpty();
      case DependencyDslPackage.PROJECT__MAPPED_DEPENDENCIES:
        return mappedDependencies != null && !mappedDependencies.isEmpty();
      case DependencyDslPackage.PROJECT__PLUGINS:
        return plugins != null && !plugins.isEmpty();
      case DependencyDslPackage.PROJECT__EXTENSIONS:
        return extensions != null && !extensions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (groupId: ");
    result.append(groupId);
    result.append(", artifactId: ");
    result.append(artifactId);
    result.append(", version: ");
    result.append(version);
    result.append(')');
    return result.toString();
  }

} //ProjectImpl
