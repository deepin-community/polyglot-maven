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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sonatype.maven.dependencyDsl.DependencyDslPackage;
import org.sonatype.maven.dependencyDsl.Entity;
import org.sonatype.maven.dependencyDsl.Property;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sonatype.maven.dependencyDsl.impl.EntityImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link org.sonatype.maven.dependencyDsl.impl.EntityImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityImpl extends TypeImpl implements Entity
{
  /**
   * The cached value of the '{@link #getExtends() <em>Extends</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtends()
   * @generated
   * @ordered
   */
  protected Entity extends_;

  /**
   * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperties()
   * @generated
   * @ordered
   */
  protected EList<Property> properties;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EntityImpl()
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
    return DependencyDslPackage.Literals.ENTITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity getExtends()
  {
    if (extends_ != null && extends_.eIsProxy())
    {
      InternalEObject oldExtends = (InternalEObject)extends_;
      extends_ = (Entity)eResolveProxy(oldExtends);
      if (extends_ != oldExtends)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DependencyDslPackage.ENTITY__EXTENDS, oldExtends, extends_));
      }
    }
    return extends_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity basicGetExtends()
  {
    return extends_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExtends(Entity newExtends)
  {
    Entity oldExtends = extends_;
    extends_ = newExtends;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DependencyDslPackage.ENTITY__EXTENDS, oldExtends, extends_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Property> getProperties()
  {
    if (properties == null)
    {
      properties = new EObjectContainmentEList<Property>(Property.class, this, DependencyDslPackage.ENTITY__PROPERTIES);
    }
    return properties;
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
      case DependencyDslPackage.ENTITY__PROPERTIES:
        return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
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
      case DependencyDslPackage.ENTITY__EXTENDS:
        if (resolve) return getExtends();
        return basicGetExtends();
      case DependencyDslPackage.ENTITY__PROPERTIES:
        return getProperties();
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
      case DependencyDslPackage.ENTITY__EXTENDS:
        setExtends((Entity)newValue);
        return;
      case DependencyDslPackage.ENTITY__PROPERTIES:
        getProperties().clear();
        getProperties().addAll((Collection<? extends Property>)newValue);
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
      case DependencyDslPackage.ENTITY__EXTENDS:
        setExtends((Entity)null);
        return;
      case DependencyDslPackage.ENTITY__PROPERTIES:
        getProperties().clear();
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
      case DependencyDslPackage.ENTITY__EXTENDS:
        return extends_ != null;
      case DependencyDslPackage.ENTITY__PROPERTIES:
        return properties != null && !properties.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //EntityImpl
