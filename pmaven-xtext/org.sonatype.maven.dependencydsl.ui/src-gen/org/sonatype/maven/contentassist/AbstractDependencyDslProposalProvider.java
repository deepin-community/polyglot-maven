/*
* generated by Xtext
*/
package org.sonatype.maven.contentassist;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.*;
import org.eclipse.xtext.common.contentassist.TerminalsProposalProvider;
import org.eclipse.xtext.ui.core.editor.contentassist.ICompletionProposalAcceptor;
import org.eclipse.xtext.ui.core.editor.contentassist.ContentAssistContext;

/**
 * Represents a generated, default implementation of interface {@link IProposalProvider}.
 * Methods are dynamically dispatched on the first parameter, i.e., you can override them 
 * with a more concrete subtype. 
 */
public class AbstractDependencyDslProposalProvider extends TerminalsProposalProvider {
		
	private final static Logger logger = Logger.getLogger(AbstractDependencyDslProposalProvider.class);
	
	public void completeProject_GroupId(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeProject_GroupId feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeProject_ArtifactId(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeProject_ArtifactId feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeProject_Version(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeProject_Version feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeProject_Dependencies(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeProject_Dependencies feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeProject_MappedDependencies(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeProject_MappedDependencies feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeProject_Plugins(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeProject_Plugins feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeProject_Extensions(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeProject_Extensions feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeGA_GroupId(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeGA_GroupId feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeGA_ArtifactId(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeGA_ArtifactId feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeDependency_GroupId(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeDependency_GroupId feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeDependency_ArtifactId(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeDependency_ArtifactId feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeDependency_Version(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeDependency_Version feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeDependency_Exclusions(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeDependency_Exclusions feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeMappedDependency_GroupId(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeMappedDependency_GroupId feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeMappedDependency_ArtifactId(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeMappedDependency_ArtifactId feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeMappedDependency_Version(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeMappedDependency_Version feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completePlugin_GroupId(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completePlugin_GroupId feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completePlugin_ArtifactId(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completePlugin_ArtifactId feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completePlugin_Version(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completePlugin_Version feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeExtension_GroupId(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeExtension_GroupId feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeExtension_ArtifactId(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeExtension_ArtifactId feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeExtension_Version(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeExtension_Version feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeModel_Imports(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeModel_Imports feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeModel_Elements(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeModel_Elements feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeImport_ImportURI(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeImport_ImportURI feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeSimpleType_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeSimpleType_Name feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeEntity_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeEntity_Name feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeEntity_Extends(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeEntity_Extends feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		lookupCrossReference(((CrossReference)assignment.getTerminal()), context, acceptor);
	}
	public void completeEntity_Properties(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeEntity_Properties feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeProperty_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeProperty_Name feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeProperty_Type(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeProperty_Type feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		lookupCrossReference(((CrossReference)assignment.getTerminal()), context, acceptor);
	}
	public void completeProperty_Many(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeProperty_Many feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		// subclasses may override
	}
    
	public void complete_Project(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("complete_Project '" + ruleCall.getRule().getName() + "' cardinality '" + ruleCall.getCardinality()
					+ "' for model '" + context.getCurrentModel() + "' and prefix '" + context.getPrefix() + "'");
		}
		// subclasses may override
	}
	public void complete_GA(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("complete_GA '" + ruleCall.getRule().getName() + "' cardinality '" + ruleCall.getCardinality()
					+ "' for model '" + context.getCurrentModel() + "' and prefix '" + context.getPrefix() + "'");
		}
		// subclasses may override
	}
	public void complete_Dependency(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("complete_Dependency '" + ruleCall.getRule().getName() + "' cardinality '" + ruleCall.getCardinality()
					+ "' for model '" + context.getCurrentModel() + "' and prefix '" + context.getPrefix() + "'");
		}
		// subclasses may override
	}
	public void complete_MappedDependency(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("complete_MappedDependency '" + ruleCall.getRule().getName() + "' cardinality '" + ruleCall.getCardinality()
					+ "' for model '" + context.getCurrentModel() + "' and prefix '" + context.getPrefix() + "'");
		}
		// subclasses may override
	}
	public void complete_Plugin(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("complete_Plugin '" + ruleCall.getRule().getName() + "' cardinality '" + ruleCall.getCardinality()
					+ "' for model '" + context.getCurrentModel() + "' and prefix '" + context.getPrefix() + "'");
		}
		// subclasses may override
	}
	public void complete_Extension(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("complete_Extension '" + ruleCall.getRule().getName() + "' cardinality '" + ruleCall.getCardinality()
					+ "' for model '" + context.getCurrentModel() + "' and prefix '" + context.getPrefix() + "'");
		}
		// subclasses may override
	}
	public void complete_Regex(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("complete_Regex '" + ruleCall.getRule().getName() + "' cardinality '" + ruleCall.getCardinality()
					+ "' for model '" + context.getCurrentModel() + "' and prefix '" + context.getPrefix() + "'");
		}
		// subclasses may override
	}
	public void complete_GroupId(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("complete_GroupId '" + ruleCall.getRule().getName() + "' cardinality '" + ruleCall.getCardinality()
					+ "' for model '" + context.getCurrentModel() + "' and prefix '" + context.getPrefix() + "'");
		}
		// subclasses may override
	}
	public void complete_ArtifactId(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("complete_ArtifactId '" + ruleCall.getRule().getName() + "' cardinality '" + ruleCall.getCardinality()
					+ "' for model '" + context.getCurrentModel() + "' and prefix '" + context.getPrefix() + "'");
		}
		// subclasses may override
	}
	public void complete_Version(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("complete_Version '" + ruleCall.getRule().getName() + "' cardinality '" + ruleCall.getCardinality()
					+ "' for model '" + context.getCurrentModel() + "' and prefix '" + context.getPrefix() + "'");
		}
		// subclasses may override
	}
	public void complete_Model(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("complete_Model '" + ruleCall.getRule().getName() + "' cardinality '" + ruleCall.getCardinality()
					+ "' for model '" + context.getCurrentModel() + "' and prefix '" + context.getPrefix() + "'");
		}
		// subclasses may override
	}
	public void complete_Import(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("complete_Import '" + ruleCall.getRule().getName() + "' cardinality '" + ruleCall.getCardinality()
					+ "' for model '" + context.getCurrentModel() + "' and prefix '" + context.getPrefix() + "'");
		}
		// subclasses may override
	}
	public void complete_Type(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("complete_Type '" + ruleCall.getRule().getName() + "' cardinality '" + ruleCall.getCardinality()
					+ "' for model '" + context.getCurrentModel() + "' and prefix '" + context.getPrefix() + "'");
		}
		// subclasses may override
	}
	public void complete_SimpleType(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("complete_SimpleType '" + ruleCall.getRule().getName() + "' cardinality '" + ruleCall.getCardinality()
					+ "' for model '" + context.getCurrentModel() + "' and prefix '" + context.getPrefix() + "'");
		}
		// subclasses may override
	}
	public void complete_Entity(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("complete_Entity '" + ruleCall.getRule().getName() + "' cardinality '" + ruleCall.getCardinality()
					+ "' for model '" + context.getCurrentModel() + "' and prefix '" + context.getPrefix() + "'");
		}
		// subclasses may override
	}
	public void complete_Property(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("complete_Property '" + ruleCall.getRule().getName() + "' cardinality '" + ruleCall.getCardinality()
					+ "' for model '" + context.getCurrentModel() + "' and prefix '" + context.getPrefix() + "'");
		}
		// subclasses may override
	}
}