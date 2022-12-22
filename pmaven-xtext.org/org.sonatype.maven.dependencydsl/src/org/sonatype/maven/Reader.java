package org.sonatype.maven;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import com.google.inject.Injector;

public class Reader {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Injector injector = new DependencyDslStandaloneSetup().initializeAndInjector();
		ResourceSet resSet = injector.getInstance(ResourceSet.class);
		Resource res = resource.getResource(URI.createURI("file:fbdbf"), true);
		res.load(null);
		PRoject p = res.getContents().get(0);
	}

}
