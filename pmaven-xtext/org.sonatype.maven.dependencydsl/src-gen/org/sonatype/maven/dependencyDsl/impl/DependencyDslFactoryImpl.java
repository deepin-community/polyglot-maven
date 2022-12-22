/**
 * <copyright>
 * </copyright>
 *
 */
package org.sonatype.maven.dependencyDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.sonatype.maven.dependencyDsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DependencyDslFactoryImpl extends EFactoryImpl implements DependencyDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DependencyDslFactory init()
  {
    try
    {
      DependencyDslFactory theDependencyDslFactory = (DependencyDslFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.sonatype.org/maven/DependencyDsl"); 
      if (theDependencyDslFactory != null)
      {
        return theDependencyDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DependencyDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DependencyDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case DependencyDslPackage.PROJECT: return createProject();
      case DependencyDslPackage.GA: return createGA();
      case DependencyDslPackage.DEPENDENCY: return createDependency();
      case DependencyDslPackage.MAPPED_DEPENDENCY: return createMappedDependency();
      case DependencyDslPackage.PLUGIN: return createPlugin();
      case DependencyDslPackage.EXTENSION: return createExtension();
      case DependencyDslPackage.MODEL: return createModel();
      case DependencyDslPackage.IMPORT: return createImport();
      case DependencyDslPackage.TYPE: return createType();
      case DependencyDslPackage.SIMPLE_TYPE: return createSimpleType();
      case DependencyDslPackage.ENTITY: return createEntity();
      case DependencyDslPackage.PROPERTY: return createProperty();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Project createProject()
  {
    ProjectImpl project = new ProjectImpl();
    return project;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GA createGA()
  {
    GAImpl ga = new GAImpl();
    return ga;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dependency createDependency()
  {
    DependencyImpl dependency = new DependencyImpl();
    return dependency;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MappedDependency createMappedDependency()
  {
    MappedDependencyImpl mappedDependency = new MappedDependencyImpl();
    return mappedDependency;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Plugin createPlugin()
  {
    PluginImpl plugin = new PluginImpl();
    return plugin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Extension createExtension()
  {
    ExtensionImpl extension = new ExtensionImpl();
    return extension;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleType createSimpleType()
  {
    SimpleTypeImpl simpleType = new SimpleTypeImpl();
    return simpleType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity createEntity()
  {
    EntityImpl entity = new EntityImpl();
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property createProperty()
  {
    PropertyImpl property = new PropertyImpl();
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DependencyDslPackage getDependencyDslPackage()
  {
    return (DependencyDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DependencyDslPackage getPackage()
  {
    return DependencyDslPackage.eINSTANCE;
  }

} //DependencyDslFactoryImpl
