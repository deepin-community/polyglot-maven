package org.sonatype.maven;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.sonatype.maven.dependencyDsl.Project;

import com.google.inject.Injector;

public class Reader {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		Injector injector = new DependencyDslStandaloneSetup().createInjectorAndDoEMFRegistration();
		ResourceSet resSet = injector.getInstance(ResourceSet.class);
		Resource res = resSet.getResource(URI.createURI("file:fbdbf"), true);
		res.load(null);
		Project p = (Project) res.getContents().get(0);		
	}

}
