/**
 * <copyright>
 * </copyright>
 *
 */
package org.sonatype.maven.dependencyDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.sonatype.maven.dependencyDsl.DependencyDslPackage;
import org.sonatype.maven.dependencyDsl.GA;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sonatype.maven.dependencyDsl.impl.GAImpl#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link org.sonatype.maven.dependencyDsl.impl.GAImpl#getArtifactId <em>Artifact Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GAImpl extends MinimalEObjectImpl.Container implements GA
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GAImpl()
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
    return DependencyDslPackage.Literals.GA;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DependencyDslPackage.GA__GROUP_ID, oldGroupId, groupId));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DependencyDslPackage.GA__ARTIFACT_ID, oldArtifactId, artifactId));
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
      case DependencyDslPackage.GA__GROUP_ID:
        return getGroupId();
      case DependencyDslPackage.GA__ARTIFACT_ID:
        return getArtifactId();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DependencyDslPackage.GA__GROUP_ID:
        setGroupId((String)newValue);
        return;
      case DependencyDslPackage.GA__ARTIFACT_ID:
        setArtifactId((String)newValue);
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
      case DependencyDslPackage.GA__GROUP_ID:
        setGroupId(GROUP_ID_EDEFAULT);
        return;
      case DependencyDslPackage.GA__ARTIFACT_ID:
        setArtifactId(ARTIFACT_ID_EDEFAULT);
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
      case DependencyDslPackage.GA__GROUP_ID:
        return GROUP_ID_EDEFAULT == null ? groupId != null : !GROUP_ID_EDEFAULT.equals(groupId);
      case DependencyDslPackage.GA__ARTIFACT_ID:
        return ARTIFACT_ID_EDEFAULT == null ? artifactId != null : !ARTIFACT_ID_EDEFAULT.equals(artifactId);
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
    result.append(')');
    return result.toString();
  }

} //GAImpl
