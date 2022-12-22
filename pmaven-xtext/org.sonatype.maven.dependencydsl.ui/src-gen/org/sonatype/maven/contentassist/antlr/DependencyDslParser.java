/*
* generated by Xtext
*/
package org.sonatype.maven.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.sonatype.maven.services.DependencyDslGrammarAccess;

public class DependencyDslParser extends AbstractContentAssistParser {
	
	@Inject
	private DependencyDslGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.sonatype.maven.contentassist.antlr.internal.InternalDependencyDslLexer createLexer(CharStream stream) {
		return new org.sonatype.maven.contentassist.antlr.internal.InternalDependencyDslLexer(stream);
	}
	
	@Override
	protected org.sonatype.maven.contentassist.antlr.internal.InternalDependencyDslParser createParser() {
		org.sonatype.maven.contentassist.antlr.internal.InternalDependencyDslParser result = new org.sonatype.maven.contentassist.antlr.internal.InternalDependencyDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				{
					put(grammarAccess.getDependencyAccess().getAlternatives_11(), "rule__Dependency__Alternatives_11");
					put(grammarAccess.getMappedDependencyAccess().getAlternatives_0(), "rule__MappedDependency__Alternatives_0");
					put(grammarAccess.getRegexAccess().getAlternatives_0(), "rule__Regex__Alternatives_0");
					put(grammarAccess.getRegexAccess().getAlternatives_2(), "rule__Regex__Alternatives_2");
					put(grammarAccess.getGroupIdAccess().getAlternatives_1(), "rule__GroupId__Alternatives_1");
					put(grammarAccess.getArtifactIdAccess().getAlternatives_1(), "rule__ArtifactId__Alternatives_1");
					put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
					put(grammarAccess.getProjectAccess().getGroup(), "rule__Project__Group__0");
					put(grammarAccess.getProjectAccess().getGroup_11(), "rule__Project__Group_11__0");
					put(grammarAccess.getProjectAccess().getGroup_12(), "rule__Project__Group_12__0");
					put(grammarAccess.getProjectAccess().getGroup_13(), "rule__Project__Group_13__0");
					put(grammarAccess.getProjectAccess().getGroup_14(), "rule__Project__Group_14__0");
					put(grammarAccess.getGAAccess().getGroup(), "rule__GA__Group__0");
					put(grammarAccess.getDependencyAccess().getGroup(), "rule__Dependency__Group__0");
					put(grammarAccess.getDependencyAccess().getGroup_11_0(), "rule__Dependency__Group_11_0__0");
					put(grammarAccess.getDependencyAccess().getGroup_12(), "rule__Dependency__Group_12__0");
					put(grammarAccess.getDependencyAccess().getGroup_13(), "rule__Dependency__Group_13__0");
					put(grammarAccess.getDependencyAccess().getGroup_14(), "rule__Dependency__Group_14__0");
					put(grammarAccess.getDependencyAccess().getGroup_15(), "rule__Dependency__Group_15__0");
					put(grammarAccess.getMappedDependencyAccess().getGroup(), "rule__MappedDependency__Group__0");
					put(grammarAccess.getMappedDependencyAccess().getGroup_3(), "rule__MappedDependency__Group_3__0");
					put(grammarAccess.getMappedDependencyAccess().getGroup_4(), "rule__MappedDependency__Group_4__0");
					put(grammarAccess.getMappedDependencyAccess().getGroup_5(), "rule__MappedDependency__Group_5__0");
					put(grammarAccess.getMappedDependencyAccess().getGroup_6(), "rule__MappedDependency__Group_6__0");
					put(grammarAccess.getPluginAccess().getGroup(), "rule__Plugin__Group__0");
					put(grammarAccess.getPluginAccess().getGroup_11(), "rule__Plugin__Group_11__0");
					put(grammarAccess.getPluginAccess().getGroup_12(), "rule__Plugin__Group_12__0");
					put(grammarAccess.getPluginAccess().getGroup_13(), "rule__Plugin__Group_13__0");
					put(grammarAccess.getExtensionAccess().getGroup(), "rule__Extension__Group__0");
					put(grammarAccess.getRegexAccess().getGroup(), "rule__Regex__Group__0");
					put(grammarAccess.getGroupIdAccess().getGroup(), "rule__GroupId__Group__0");
					put(grammarAccess.getArtifactIdAccess().getGroup(), "rule__ArtifactId__Group__0");
					put(grammarAccess.getVersionAccess().getGroup(), "rule__Version__Group__0");
					put(grammarAccess.getVersionAccess().getGroup_1(), "rule__Version__Group_1__0");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getImportAccess().getGroup(), "rule__Import__Group__0");
					put(grammarAccess.getSimpleTypeAccess().getGroup(), "rule__SimpleType__Group__0");
					put(grammarAccess.getEntityAccess().getGroup(), "rule__Entity__Group__0");
					put(grammarAccess.getEntityAccess().getGroup_2(), "rule__Entity__Group_2__0");
					put(grammarAccess.getPropertyAccess().getGroup(), "rule__Property__Group__0");
					put(grammarAccess.getProjectAccess().getGroupIdAssignment_4(), "rule__Project__GroupIdAssignment_4");
					put(grammarAccess.getProjectAccess().getArtifactIdAssignment_7(), "rule__Project__ArtifactIdAssignment_7");
					put(grammarAccess.getProjectAccess().getVersionAssignment_10(), "rule__Project__VersionAssignment_10");
					put(grammarAccess.getProjectAccess().getDependenciesAssignment_11_2(), "rule__Project__DependenciesAssignment_11_2");
					put(grammarAccess.getProjectAccess().getMappedDependenciesAssignment_12_2(), "rule__Project__MappedDependenciesAssignment_12_2");
					put(grammarAccess.getProjectAccess().getPluginsAssignment_13_2(), "rule__Project__PluginsAssignment_13_2");
					put(grammarAccess.getProjectAccess().getExtensionsAssignment_14_2(), "rule__Project__ExtensionsAssignment_14_2");
					put(grammarAccess.getGAAccess().getGroupIdAssignment_2(), "rule__GA__GroupIdAssignment_2");
					put(grammarAccess.getGAAccess().getArtifactIdAssignment_6(), "rule__GA__ArtifactIdAssignment_6");
					put(grammarAccess.getDependencyAccess().getGroupIdAssignment_2(), "rule__Dependency__GroupIdAssignment_2");
					put(grammarAccess.getDependencyAccess().getArtifactIdAssignment_6(), "rule__Dependency__ArtifactIdAssignment_6");
					put(grammarAccess.getDependencyAccess().getVersionAssignment_10(), "rule__Dependency__VersionAssignment_10");
					put(grammarAccess.getDependencyAccess().getExclusionsAssignment_15_3(), "rule__Dependency__ExclusionsAssignment_15_3");
					put(grammarAccess.getMappedDependencyAccess().getGroupIdAssignment_4_3(), "rule__MappedDependency__GroupIdAssignment_4_3");
					put(grammarAccess.getMappedDependencyAccess().getArtifactIdAssignment_5_3(), "rule__MappedDependency__ArtifactIdAssignment_5_3");
					put(grammarAccess.getMappedDependencyAccess().getVersionAssignment_6_3(), "rule__MappedDependency__VersionAssignment_6_3");
					put(grammarAccess.getPluginAccess().getGroupIdAssignment_2(), "rule__Plugin__GroupIdAssignment_2");
					put(grammarAccess.getPluginAccess().getArtifactIdAssignment_6(), "rule__Plugin__ArtifactIdAssignment_6");
					put(grammarAccess.getPluginAccess().getVersionAssignment_10(), "rule__Plugin__VersionAssignment_10");
					put(grammarAccess.getExtensionAccess().getGroupIdAssignment_2(), "rule__Extension__GroupIdAssignment_2");
					put(grammarAccess.getExtensionAccess().getArtifactIdAssignment_6(), "rule__Extension__ArtifactIdAssignment_6");
					put(grammarAccess.getExtensionAccess().getVersionAssignment_10(), "rule__Extension__VersionAssignment_10");
					put(grammarAccess.getModelAccess().getImportsAssignment_0(), "rule__Model__ImportsAssignment_0");
					put(grammarAccess.getModelAccess().getElementsAssignment_1(), "rule__Model__ElementsAssignment_1");
					put(grammarAccess.getImportAccess().getImportURIAssignment_1(), "rule__Import__ImportURIAssignment_1");
					put(grammarAccess.getSimpleTypeAccess().getNameAssignment_1(), "rule__SimpleType__NameAssignment_1");
					put(grammarAccess.getEntityAccess().getNameAssignment_1(), "rule__Entity__NameAssignment_1");
					put(grammarAccess.getEntityAccess().getExtendsAssignment_2_1(), "rule__Entity__ExtendsAssignment_2_1");
					put(grammarAccess.getEntityAccess().getPropertiesAssignment_4(), "rule__Entity__PropertiesAssignment_4");
					put(grammarAccess.getPropertyAccess().getNameAssignment_1(), "rule__Property__NameAssignment_1");
					put(grammarAccess.getPropertyAccess().getTypeAssignment_3(), "rule__Property__TypeAssignment_3");
					put(grammarAccess.getPropertyAccess().getManyAssignment_4(), "rule__Property__ManyAssignment_4");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.sonatype.maven.contentassist.antlr.internal.InternalDependencyDslParser typedParser = (org.sonatype.maven.contentassist.antlr.internal.InternalDependencyDslParser) parser;
			typedParser.entryRuleProject();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public DependencyDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(DependencyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
