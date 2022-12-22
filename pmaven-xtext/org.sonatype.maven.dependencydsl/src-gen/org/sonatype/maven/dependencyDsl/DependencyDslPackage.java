/**
 * <copyright>
 * </copyright>
 *
 */
package org.sonatype.maven.dependencyDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.sonatype.maven.dependencyDsl.DependencyDslFactory
 * @model kind="package"
 * @generated
 */
public interface DependencyDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "dependencyDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.sonatype.org/maven/DependencyDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "dependencyDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DependencyDslPackage eINSTANCE = org.sonatype.maven.dependencyDsl.impl.DependencyDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.sonatype.maven.dependencyDsl.impl.ProjectImpl <em>Project</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sonatype.maven.dependencyDsl.impl.ProjectImpl
   * @see org.sonatype.maven.dependencyDsl.impl.DependencyDslPackageImpl#getProject()
   * @generated
   */
  int PROJECT = 0;

  /**
   * The feature id for the '<em><b>Group Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__GROUP_ID = 0;

  /**
   * The feature id for the '<em><b>Artifact Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__ARTIFACT_ID = 1;

  /**
   * The feature id for the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__VERSION = 2;

  /**
   * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__DEPENDENCIES = 3;

  /**
   * The feature id for the '<em><b>Mapped Dependencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__MAPPED_DEPENDENCIES = 4;

  /**
   * The feature id for the '<em><b>Plugins</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__PLUGINS = 5;

  /**
   * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__EXTENSIONS = 6;

  /**
   * The number of structural features of the '<em>Project</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link org.sonatype.maven.dependencyDsl.impl.GAImpl <em>GA</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sonatype.maven.dependencyDsl.impl.GAImpl
   * @see org.sonatype.maven.dependencyDsl.impl.DependencyDslPackageImpl#getGA()
   * @generated
   */
  int GA = 1;

  /**
   * The feature id for the '<em><b>Group Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GA__GROUP_ID = 0;

  /**
   * The feature id for the '<em><b>Artifact Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GA__ARTIFACT_ID = 1;

  /**
   * The number of structural features of the '<em>GA</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GA_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.sonatype.maven.dependencyDsl.impl.DependencyImpl <em>Dependency</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sonatype.maven.dependencyDsl.impl.DependencyImpl
   * @see org.sonatype.maven.dependencyDsl.impl.DependencyDslPackageImpl#getDependency()
   * @generated
   */
  int DEPENDENCY = 2;

  /**
   * The feature id for the '<em><b>Group Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY__GROUP_ID = 0;

  /**
   * The feature id for the '<em><b>Artifact Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY__ARTIFACT_ID = 1;

  /**
   * The feature id for the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY__VERSION = 2;

  /**
   * The feature id for the '<em><b>Exclusions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY__EXCLUSIONS = 3;

  /**
   * The number of structural features of the '<em>Dependency</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.sonatype.maven.dependencyDsl.impl.MappedDependencyImpl <em>Mapped Dependency</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sonatype.maven.dependencyDsl.impl.MappedDependencyImpl
   * @see org.sonatype.maven.dependencyDsl.impl.DependencyDslPackageImpl#getMappedDependency()
   * @generated
   */
  int MAPPED_DEPENDENCY = 3;

  /**
   * The feature id for the '<em><b>Group Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPED_DEPENDENCY__GROUP_ID = 0;

  /**
   * The feature id for the '<em><b>Artifact Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPED_DEPENDENCY__ARTIFACT_ID = 1;

  /**
   * The feature id for the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPED_DEPENDENCY__VERSION = 2;

  /**
   * The number of structural features of the '<em>Mapped Dependency</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPED_DEPENDENCY_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.sonatype.maven.dependencyDsl.impl.PluginImpl <em>Plugin</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sonatype.maven.dependencyDsl.impl.PluginImpl
   * @see org.sonatype.maven.dependencyDsl.impl.DependencyDslPackageImpl#getPlugin()
   * @generated
   */
  int PLUGIN = 4;

  /**
   * The feature id for the '<em><b>Group Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUGIN__GROUP_ID = 0;

  /**
   * The feature id for the '<em><b>Artifact Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUGIN__ARTIFACT_ID = 1;

  /**
   * The feature id for the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUGIN__VERSION = 2;

  /**
   * The number of structural features of the '<em>Plugin</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUGIN_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.sonatype.maven.dependencyDsl.impl.ExtensionImpl <em>Extension</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sonatype.maven.dependencyDsl.impl.ExtensionImpl
   * @see org.sonatype.maven.dependencyDsl.impl.DependencyDslPackageImpl#getExtension()
   * @generated
   */
  int EXTENSION = 5;

  /**
   * The feature id for the '<em><b>Group Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENSION__GROUP_ID = 0;

  /**
   * The feature id for the '<em><b>Artifact Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENSION__ARTIFACT_ID = 1;

  /**
   * The feature id for the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENSION__VERSION = 2;

  /**
   * The number of structural features of the '<em>Extension</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENSION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.sonatype.maven.dependencyDsl.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sonatype.maven.dependencyDsl.impl.ModelImpl
   * @see org.sonatype.maven.dependencyDsl.impl.DependencyDslPackageImpl#getModel()
   * @generated
   */
  int MODEL = 6;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__IMPORTS = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ELEMENTS = 1;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.sonatype.maven.dependencyDsl.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sonatype.maven.dependencyDsl.impl.ImportImpl
   * @see org.sonatype.maven.dependencyDsl.impl.DependencyDslPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 7;

  /**
   * The feature id for the '<em><b>Import URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORT_URI = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.sonatype.maven.dependencyDsl.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sonatype.maven.dependencyDsl.impl.TypeImpl
   * @see org.sonatype.maven.dependencyDsl.impl.DependencyDslPackageImpl#getType()
   * @generated
   */
  int TYPE = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__NAME = 0;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.sonatype.maven.dependencyDsl.impl.SimpleTypeImpl <em>Simple Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sonatype.maven.dependencyDsl.impl.SimpleTypeImpl
   * @see org.sonatype.maven.dependencyDsl.impl.DependencyDslPackageImpl#getSimpleType()
   * @generated
   */
  int SIMPLE_TYPE = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_TYPE__NAME = TYPE__NAME;

  /**
   * The number of structural features of the '<em>Simple Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.sonatype.maven.dependencyDsl.impl.EntityImpl <em>Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sonatype.maven.dependencyDsl.impl.EntityImpl
   * @see org.sonatype.maven.dependencyDsl.impl.DependencyDslPackageImpl#getEntity()
   * @generated
   */
  int ENTITY = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Extends</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__EXTENDS = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__PROPERTIES = TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.sonatype.maven.dependencyDsl.impl.PropertyImpl <em>Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sonatype.maven.dependencyDsl.impl.PropertyImpl
   * @see org.sonatype.maven.dependencyDsl.impl.DependencyDslPackageImpl#getProperty()
   * @generated
   */
  int PROPERTY = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__TYPE = 1;

  /**
   * The feature id for the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__MANY = 2;

  /**
   * The number of structural features of the '<em>Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FEATURE_COUNT = 3;


  /**
   * Returns the meta object for class '{@link org.sonatype.maven.dependencyDsl.Project <em>Project</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Project</em>'.
   * @see org.sonatype.maven.dependencyDsl.Project
   * @generated
   */
  EClass getProject();

  /**
   * Returns the meta object for the attribute '{@link org.sonatype.maven.dependencyDsl.Project#getGroupId <em>Group Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Group Id</em>'.
   * @see org.sonatype.maven.dependencyDsl.Project#getGroupId()
   * @see #getProject()
   * @generated
   */
  EAttribute getProject_GroupId();

  /**
   * Returns the meta object for the attribute '{@link org.sonatype.maven.dependencyDsl.Project#getArtifactId <em>Artifact Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Artifact Id</em>'.
   * @see org.sonatype.maven.dependencyDsl.Project#getArtifactId()
   * @see #getProject()
   * @generated
   */
  EAttribute getProject_ArtifactId();

  /**
   * Returns the meta object for the attribute '{@link org.sonatype.maven.dependencyDsl.Project#getVersion <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version</em>'.
   * @see org.sonatype.maven.dependencyDsl.Project#getVersion()
   * @see #getProject()
   * @generated
   */
  EAttribute getProject_Version();

  /**
   * Returns the meta object for the containment reference list '{@link org.sonatype.maven.dependencyDsl.Project#getDependencies <em>Dependencies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dependencies</em>'.
   * @see org.sonatype.maven.dependencyDsl.Project#getDependencies()
   * @see #getProject()
   * @generated
   */
  EReference getProject_Dependencies();

  /**
   * Returns the meta object for the containment reference list '{@link org.sonatype.maven.dependencyDsl.Project#getMappedDependencies <em>Mapped Dependencies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mapped Dependencies</em>'.
   * @see org.sonatype.maven.dependencyDsl.Project#getMappedDependencies()
   * @see #getProject()
   * @generated
   */
  EReference getProject_MappedDependencies();

  /**
   * Returns the meta object for the containment reference list '{@link org.sonatype.maven.dependencyDsl.Project#getPlugins <em>Plugins</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Plugins</em>'.
   * @see org.sonatype.maven.dependencyDsl.Project#getPlugins()
   * @see #getProject()
   * @generated
   */
  EReference getProject_Plugins();

  /**
   * Returns the meta object for the containment reference list '{@link org.sonatype.maven.dependencyDsl.Project#getExtensions <em>Extensions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Extensions</em>'.
   * @see org.sonatype.maven.dependencyDsl.Project#getExtensions()
   * @see #getProject()
   * @generated
   */
  EReference getProject_Extensions();

  /**
   * Returns the meta object for class '{@link org.sonatype.maven.dependencyDsl.GA <em>GA</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>GA</em>'.
   * @see org.sonatype.maven.dependencyDsl.GA
   * @generated
   */
  EClass getGA();

  /**
   * Returns the meta object for the attribute '{@link org.sonatype.maven.dependencyDsl.GA#getGroupId <em>Group Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Group Id</em>'.
   * @see org.sonatype.maven.dependencyDsl.GA#getGroupId()
   * @see #getGA()
   * @generated
   */
  EAttribute getGA_GroupId();

  /**
   * Returns the meta object for the attribute '{@link org.sonatype.maven.dependencyDsl.GA#getArtifactId <em>Artifact Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Artifact Id</em>'.
   * @see org.sonatype.maven.dependencyDsl.GA#getArtifactId()
   * @see #getGA()
   * @generated
   */
  EAttribute getGA_ArtifactId();

  /**
   * Returns the meta object for class '{@link org.sonatype.maven.dependencyDsl.Dependency <em>Dependency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dependency</em>'.
   * @see org.sonatype.maven.dependencyDsl.Dependency
   * @generated
   */
  EClass getDependency();

  /**
   * Returns the meta object for the attribute '{@link org.sonatype.maven.dependencyDsl.Dependency#getGroupId <em>Group Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Group Id</em>'.
   * @see org.sonatype.maven.dependencyDsl.Dependency#getGroupId()
   * @see #getDependency()
   * @generated
   */
  EAttribute getDependency_GroupId();

  /**
   * Returns the meta object for the attribute '{@link org.sonatype.maven.dependencyDsl.Dependency#getArtifactId <em>Artifact Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Artifact Id</em>'.
   * @see org.sonatype.maven.dependencyDsl.Dependency#getArtifactId()
   * @see #getDependency()
   * @generated
   */
  EAttribute getDependency_ArtifactId();

  /**
   * Returns the meta object for the attribute '{@link org.sonatype.maven.dependencyDsl.Dependency#getVersion <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version</em>'.
   * @see org.sonatype.maven.dependencyDsl.Dependency#getVersion()
   * @see #getDependency()
   * @generated
   */
  EAttribute getDependency_Version();

  /**
   * Returns the meta object for the containment reference list '{@link org.sonatype.maven.dependencyDsl.Dependency#getExclusions <em>Exclusions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exclusions</em>'.
   * @see org.sonatype.maven.dependencyDsl.Dependency#getExclusions()
   * @see #getDependency()
   * @generated
   */
  EReference getDependency_Exclusions();

  /**
   * Returns the meta object for class '{@link org.sonatype.maven.dependencyDsl.MappedDependency <em>Mapped Dependency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mapped Dependency</em>'.
   * @see org.sonatype.maven.dependencyDsl.MappedDependency
   * @generated
   */
  EClass getMappedDependency();

  /**
   * Returns the meta object for the attribute '{@link org.sonatype.maven.dependencyDsl.MappedDependency#getGroupId <em>Group Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Group Id</em>'.
   * @see org.sonatype.maven.dependencyDsl.MappedDependency#getGroupId()
   * @see #getMappedDependency()
   * @generated
   */
  EAttribute getMappedDependency_GroupId();

  /**
   * Returns the meta object for the attribute '{@link org.sonatype.maven.dependencyDsl.MappedDependency#getArtifactId <em>Artifact Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Artifact Id</em>'.
   * @see org.sonatype.maven.dependencyDsl.MappedDependency#getArtifactId()
   * @see #getMappedDependency()
   * @generated
   */
  EAttribute getMappedDependency_ArtifactId();

  /**
   * Returns the meta object for the attribute '{@link org.sonatype.maven.dependencyDsl.MappedDependency#getVersion <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version</em>'.
   * @see org.sonatype.maven.dependencyDsl.MappedDependency#getVersion()
   * @see #getMappedDependency()
   * @generated
   */
  EAttribute getMappedDependency_Version();

  /**
   * Returns the meta object for class '{@link org.sonatype.maven.dependencyDsl.Plugin <em>Plugin</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Plugin</em>'.
   * @see org.sonatype.maven.dependencyDsl.Plugin
   * @generated
   */
  EClass getPlugin();

  /**
   * Returns the meta object for the attribute '{@link org.sonatype.maven.dependencyDsl.Plugin#getGroupId <em>Group Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Group Id</em>'.
   * @see org.sonatype.maven.dependencyDsl.Plugin#getGroupId()
   * @see #getPlugin()
   * @generated
   */
  EAttribute getPlugin_GroupId();

  /**
   * Returns the meta object for the attribute '{@link org.sonatype.maven.dependencyDsl.Plugin#getArtifactId <em>Artifact Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Artifact Id</em>'.
   * @see org.sonatype.maven.dependencyDsl.Plugin#getArtifactId()
   * @see #getPlugin()
   * @generated
   */
  EAttribute getPlugin_ArtifactId();

  /**
   * Returns the meta object for the attribute '{@link org.sonatype.maven.dependencyDsl.Plugin#getVersion <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version</em>'.
   * @see org.sonatype.maven.dependencyDsl.Plugin#getVersion()
   * @see #getPlugin()
   * @generated
   */
  EAttribute getPlugin_Version();

  /**
   * Returns the meta object for class '{@link org.sonatype.maven.dependencyDsl.Extension <em>Extension</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Extension</em>'.
   * @see org.sonatype.maven.dependencyDsl.Extension
   * @generated
   */
  EClass getExtension();

  /**
   * Returns the meta object for the attribute '{@link org.sonatype.maven.dependencyDsl.Extension#getGroupId <em>Group Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Group Id</em>'.
   * @see org.sonatype.maven.dependencyDsl.Extension#getGroupId()
   * @see #getExtension()
   * @generated
   */
  EAttribute getExtension_GroupId();

  /**
   * Returns the meta object for the attribute '{@link org.sonatype.maven.dependencyDsl.Extension#getArtifactId <em>Artifact Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Artifact Id</em>'.
   * @see org.sonatype.maven.dependencyDsl.Extension#getArtifactId()
   * @see #getExtension()
   * @generated
   */
  EAttribute getExtension_ArtifactId();

  /**
   * Returns the meta object for the attribute '{@link org.sonatype.maven.dependencyDsl.Extension#getVersion <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version</em>'.
   * @see org.sonatype.maven.dependencyDsl.Extension#getVersion()
   * @see #getExtension()
   * @generated
   */
  EAttribute getExtension_Version();

  /**
   * Returns the meta object for class '{@link org.sonatype.maven.dependencyDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.sonatype.maven.dependencyDsl.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.sonatype.maven.dependencyDsl.Model#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see org.sonatype.maven.dependencyDsl.Model#getImports()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link org.sonatype.maven.dependencyDsl.Model#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.sonatype.maven.dependencyDsl.Model#getElements()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Elements();

  /**
   * Returns the meta object for class '{@link org.sonatype.maven.dependencyDsl.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see org.sonatype.maven.dependencyDsl.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link org.sonatype.maven.dependencyDsl.Import#getImportURI <em>Import URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Import URI</em>'.
   * @see org.sonatype.maven.dependencyDsl.Import#getImportURI()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportURI();

  /**
   * Returns the meta object for class '{@link org.sonatype.maven.dependencyDsl.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see org.sonatype.maven.dependencyDsl.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the attribute '{@link org.sonatype.maven.dependencyDsl.Type#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.sonatype.maven.dependencyDsl.Type#getName()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Name();

  /**
   * Returns the meta object for class '{@link org.sonatype.maven.dependencyDsl.SimpleType <em>Simple Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Type</em>'.
   * @see org.sonatype.maven.dependencyDsl.SimpleType
   * @generated
   */
  EClass getSimpleType();

  /**
   * Returns the meta object for class '{@link org.sonatype.maven.dependencyDsl.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity</em>'.
   * @see org.sonatype.maven.dependencyDsl.Entity
   * @generated
   */
  EClass getEntity();

  /**
   * Returns the meta object for the reference '{@link org.sonatype.maven.dependencyDsl.Entity#getExtends <em>Extends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Extends</em>'.
   * @see org.sonatype.maven.dependencyDsl.Entity#getExtends()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Extends();

  /**
   * Returns the meta object for the containment reference list '{@link org.sonatype.maven.dependencyDsl.Entity#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see org.sonatype.maven.dependencyDsl.Entity#getProperties()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Properties();

  /**
   * Returns the meta object for class '{@link org.sonatype.maven.dependencyDsl.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property</em>'.
   * @see org.sonatype.maven.dependencyDsl.Property
   * @generated
   */
  EClass getProperty();

  /**
   * Returns the meta object for the attribute '{@link org.sonatype.maven.dependencyDsl.Property#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.sonatype.maven.dependencyDsl.Property#getName()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_Name();

  /**
   * Returns the meta object for the reference '{@link org.sonatype.maven.dependencyDsl.Property#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.sonatype.maven.dependencyDsl.Property#getType()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_Type();

  /**
   * Returns the meta object for the attribute '{@link org.sonatype.maven.dependencyDsl.Property#isMany <em>Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Many</em>'.
   * @see org.sonatype.maven.dependencyDsl.Property#isMany()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_Many();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DependencyDslFactory getDependencyDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.sonatype.maven.dependencyDsl.impl.ProjectImpl <em>Project</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sonatype.maven.dependencyDsl.impl.ProjectImpl
     * @see org.sonatype.maven.dependencyDsl.impl.DependencyDslPackageImpl#getProject()
     * @generated
     */
    EClass PROJECT = eINSTANCE.getProject();

    /**
     * The meta object literal for the '<em><b>Group Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROJECT__GROUP_ID = eINSTANCE.getProject_GroupId();

    /**
     * The meta object literal for the '<em><b>Artifact Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROJECT__ARTIFACT_ID = eINSTANCE.getProject_ArtifactId();

    /**
     * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROJECT__VERSION = eINSTANCE.getProject_Version();

    /**
     * The meta object literal for the '<em><b>Dependencies</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROJECT__DEPENDENCIES = eINSTANCE.getProject_Dependencies();

    /**
     * The meta object literal for the '<em><b>Mapped Dependencies</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROJECT__MAPPED_DEPENDENCIES = eINSTANCE.getProject_MappedDependencies();

    /**
     * The meta object literal for the '<em><b>Plugins</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROJECT__PLUGINS = eINSTANCE.getProject_Plugins();

    /**
     * The meta object literal for the '<em><b>Extensions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROJECT__EXTENSIONS = eINSTANCE.getProject_Extensions();

    /**
     * The meta object literal for the '{@link org.sonatype.maven.dependencyDsl.impl.GAImpl <em>GA</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sonatype.maven.dependencyDsl.impl.GAImpl
     * @see org.sonatype.maven.dependencyDsl.impl.DependencyDslPackageImpl#getGA()
     * @generated
     */
    EClass GA = eINSTANCE.getGA();

    /**
     * The meta object literal for the '<em><b>Group Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GA__GROUP_ID = eINSTANCE.getGA_GroupId();

    /**
     * The meta object literal for the '<em><b>Artifact Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GA__ARTIFACT_ID = eINSTANCE.getGA_ArtifactId();

    /**
     * The meta object literal for the '{@link org.sonatype.maven.dependencyDsl.impl.DependencyImpl <em>Dependency</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sonatype.maven.dependencyDsl.impl.DependencyImpl
     * @see org.sonatype.maven.dependencyDsl.impl.DependencyDslPackageImpl#getDependency()
     * @generated
     */
    EClass DEPENDENCY = eINSTANCE.getDependency();

    /**
     * The meta object literal for the '<em><b>Group Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEPENDENCY__GROUP_ID = eINSTANCE.getDependency_GroupId();

    /**
     * The meta object literal for the '<em><b>Artifact Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEPENDENCY__ARTIFACT_ID = eINSTANCE.getDependency_ArtifactId();

    /**
     * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEPENDENCY__VERSION = eINSTANCE.getDependency_Version();

    /**
     * The meta object literal for the '<em><b>Exclusions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPENDENCY__EXCLUSIONS = eINSTANCE.getDependency_Exclusions();

    /**
     * The meta object literal for the '{@link org.sonatype.maven.dependencyDsl.impl.MappedDependencyImpl <em>Mapped Dependency</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sonatype.maven.dependencyDsl.impl.MappedDependencyImpl
     * @see org.sonatype.maven.dependencyDsl.impl.DependencyDslPackageImpl#getMappedDependency()
     * @generated
     */
    EClass MAPPED_DEPENDENCY = eINSTANCE.getMappedDependency();

    /**
     * The meta object literal for the '<em><b>Group Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAPPED_DEPENDENCY__GROUP_ID = eINSTANCE.getMappedDependency_GroupId();

    /**
     * The meta object literal for the '<em><b>Artifact Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAPPED_DEPENDENCY__ARTIFACT_ID = eINSTANCE.getMappedDependency_ArtifactId();

    /**
     * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAPPED_DEPENDENCY__VERSION = eINSTANCE.getMappedDependency_Version();

    /**
     * The meta object literal for the '{@link org.sonatype.maven.dependencyDsl.impl.PluginImpl <em>Plugin</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sonatype.maven.dependencyDsl.impl.PluginImpl
     * @see org.sonatype.maven.dependencyDsl.impl.DependencyDslPackageImpl#getPlugin()
     * @generated
     */
    EClass PLUGIN = eINSTANCE.getPlugin();

    /**
     * The meta object literal for the '<em><b>Group Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PLUGIN__GROUP_ID = eINSTANCE.getPlugin_GroupId();

    /**
     * The meta object literal for the '<em><b>Artifact Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PLUGIN__ARTIFACT_ID = eINSTANCE.getPlugin_ArtifactId();

    /**
     * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PLUGIN__VERSION = eINSTANCE.getPlugin_Version();

    /**
     * The meta object literal for the '{@link org.sonatype.maven.dependencyDsl.impl.ExtensionImpl <em>Extension</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sonatype.maven.dependencyDsl.impl.ExtensionImpl
     * @see org.sonatype.maven.dependencyDsl.impl.DependencyDslPackageImpl#getExtension()
     * @generated
     */
    EClass EXTENSION = eINSTANCE.getExtension();

    /**
     * The meta object literal for the '<em><b>Group Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXTENSION__GROUP_ID = eINSTANCE.getExtension_GroupId();

    /**
     * The meta object literal for the '<em><b>Artifact Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXTENSION__ARTIFACT_ID = eINSTANCE.getExtension_ArtifactId();

    /**
     * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXTENSION__VERSION = eINSTANCE.getExtension_Version();

    /**
     * The meta object literal for the '{@link org.sonatype.maven.dependencyDsl.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sonatype.maven.dependencyDsl.impl.ModelImpl
     * @see org.sonatype.maven.dependencyDsl.impl.DependencyDslPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__IMPORTS = eINSTANCE.getModel_Imports();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__ELEMENTS = eINSTANCE.getModel_Elements();

    /**
     * The meta object literal for the '{@link org.sonatype.maven.dependencyDsl.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sonatype.maven.dependencyDsl.impl.ImportImpl
     * @see org.sonatype.maven.dependencyDsl.impl.DependencyDslPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORT_URI = eINSTANCE.getImport_ImportURI();

    /**
     * The meta object literal for the '{@link org.sonatype.maven.dependencyDsl.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sonatype.maven.dependencyDsl.impl.TypeImpl
     * @see org.sonatype.maven.dependencyDsl.impl.DependencyDslPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__NAME = eINSTANCE.getType_Name();

    /**
     * The meta object literal for the '{@link org.sonatype.maven.dependencyDsl.impl.SimpleTypeImpl <em>Simple Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sonatype.maven.dependencyDsl.impl.SimpleTypeImpl
     * @see org.sonatype.maven.dependencyDsl.impl.DependencyDslPackageImpl#getSimpleType()
     * @generated
     */
    EClass SIMPLE_TYPE = eINSTANCE.getSimpleType();

    /**
     * The meta object literal for the '{@link org.sonatype.maven.dependencyDsl.impl.EntityImpl <em>Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sonatype.maven.dependencyDsl.impl.EntityImpl
     * @see org.sonatype.maven.dependencyDsl.impl.DependencyDslPackageImpl#getEntity()
     * @generated
     */
    EClass ENTITY = eINSTANCE.getEntity();

    /**
     * The meta object literal for the '<em><b>Extends</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__EXTENDS = eINSTANCE.getEntity_Extends();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__PROPERTIES = eINSTANCE.getEntity_Properties();

    /**
     * The meta object literal for the '{@link org.sonatype.maven.dependencyDsl.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sonatype.maven.dependencyDsl.impl.PropertyImpl
     * @see org.sonatype.maven.dependencyDsl.impl.DependencyDslPackageImpl#getProperty()
     * @generated
     */
    EClass PROPERTY = eINSTANCE.getProperty();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY__TYPE = eINSTANCE.getProperty_Type();

    /**
     * The meta object literal for the '<em><b>Many</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__MANY = eINSTANCE.getProperty_Many();

  }

} //DependencyDslPackage
