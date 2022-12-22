
/*
 * generated by Xtext
 */
package org.sonatype.maven;

import org.sonatype.maven.DependencyDslRuntimeModule;

/**
 * Manual modifications go to {org.sonatype.maven.DependencyDslUiModule}
 */
public abstract class AbstractDependencyDslUiModule extends DependencyDslRuntimeModule {
	
	
	// contributed by org.eclipse.xtext.ui.generator.ImplicitUiFragment
	public Class<? extends org.eclipse.xtext.ui.core.ILocationInFileProvider> bindILocationInFileProvider() {
		return org.eclipse.xtext.ui.core.DefaultLocationInFileProvider.class;
	}

	// contributed by org.eclipse.xtext.ui.generator.ImplicitUiFragment
	public Class<? extends org.eclipse.jface.text.hyperlink.IHyperlinkDetector> bindIHyperlinkDetector() {
		return org.eclipse.xtext.ui.common.editor.hyperlinking.DefaultHyperlinkDetector.class;
	}

	// contributed by org.eclipse.xtext.ui.generator.ImplicitUiFragment
	public Class<? extends org.eclipse.jface.text.reconciler.IReconciler> bindIReconciler() {
		return org.eclipse.xtext.ui.core.editor.reconciler.XtextReconciler.class;
	}

	// contributed by org.eclipse.xtext.ui.generator.ImplicitUiFragment
	public Class<? extends org.eclipse.xtext.ui.core.editor.toggleComments.ISingleLineCommentHelper> bindISingleLineCommentHelper() {
		return org.eclipse.xtext.ui.common.editor.toggleComments.DefaultSingleLineCommentHelper.class;
	}

	// contributed by org.eclipse.xtext.ui.generator.ImplicitUiFragment
	public Class<? extends org.eclipse.xtext.ui.common.editor.outline.ITreeProvider> bindITreeProvider() {
		return org.eclipse.xtext.ui.common.editor.outline.transformer.TransformingTreeProvider.class;
	}

	// contributed by org.eclipse.xtext.ui.generator.ImplicitUiFragment
	public Class<? extends org.eclipse.ui.views.contentoutline.IContentOutlinePage> bindIContentOutlinePage() {
		return org.eclipse.xtext.ui.common.editor.outline.XtextContentOutlinePage.class;
	}

	// contributed by org.eclipse.xtext.ui.generator.ImplicitUiFragment
	public Class<? extends org.eclipse.xtext.ui.common.editor.outline.actions.IActionBarContributor> bindIActionBarContributor() {
		return org.eclipse.xtext.ui.common.editor.outline.actions.IActionBarContributor.DefaultActionBarContributor.class;
	}

	// contributed by org.eclipse.xtext.ui.generator.ImplicitUiFragment
	public Class<? extends org.eclipse.xtext.ui.core.editor.syntaxcoloring.IHighlightingHelper> bindIHighlightingHelper() {
		return org.eclipse.xtext.ui.common.editor.syntaxcoloring.HighlightingHelper.class;
	}

	// contributed by org.eclipse.xtext.ui.generator.ImplicitUiFragment
	public Class<? extends org.eclipse.emf.common.notify.AdapterFactory> bindAdapterFactory() {
		return org.eclipse.xtext.ui.core.InjectableAdapterFactory.class;
	}

	// contributed by org.eclipse.xtext.ui.generator.ImplicitUiFragment
	public Class<? extends org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider> bindAdapterFactoryLabelProvider() {
		return org.eclipse.xtext.ui.core.InjectableAdapterFactoryLabelProvider.class;
	}

	// contributed by org.eclipse.xtext.ui.generator.ImplicitUiFragment
	public org.eclipse.emf.edit.provider.ComposedAdapterFactory.Descriptor.Registry bindComposedAdapterFactory$Descriptor$RegistryToInstance() {
		return org.eclipse.emf.edit.provider.ComposedAdapterFactory.Descriptor.Registry.INSTANCE;
	}

	// contributed by org.eclipse.xtext.ui.generator.ImplicitUiFragment
	public Class<? extends org.eclipse.xtext.ui.core.editor.contentassist.IContentAssistantFactory> bindIContentAssistantFactory() {
		return org.eclipse.xtext.ui.common.editor.contentassist.DefaultContentAssistantFactory.class;
	}

	// contributed by org.eclipse.xtext.ui.generator.ImplicitUiFragment
	public Class<? extends org.eclipse.jface.text.contentassist.IContentAssistProcessor> bindIContentAssistProcessor() {
		return org.eclipse.xtext.ui.core.editor.contentassist.XtextContentAssistProcessor.class;
	}

	// contributed by org.eclipse.xtext.ui.generator.ImplicitUiFragment
	public Class<? extends org.eclipse.xtext.ui.core.editor.contentassist.ICompletionProposalPostProcessor> bindICompletionProposalPostProcessor() {
		return org.eclipse.xtext.ui.common.editor.contentassist.DefaultCompletionProposalPostProcessor.class;
	}

	// contributed by org.eclipse.xtext.ui.generator.ImplicitUiFragment
	public Class<? extends org.eclipse.xtext.ui.core.editor.contentassist.IFollowElementCalculator> bindIFollowElementCalculator() {
		return org.eclipse.xtext.ui.common.editor.contentassist.DefaultFollowElementCalculator.class;
	}

	// contributed by org.eclipse.xtext.ui.generator.ImplicitUiFragment
	public Class<? extends org.eclipse.xtext.ui.core.editor.contentassist.ITemplateProposalProvider> bindITemplateProposalProvider() {
		return org.eclipse.xtext.ui.common.editor.templates.DefaultTemplateProposalProvider.class;
	}

	// contributed by org.eclipse.xtext.ui.generator.ImplicitUiFragment
	public Class<? extends org.eclipse.jface.text.templates.persistence.TemplateStore> bindTemplateStore() {
		return org.eclipse.xtext.ui.common.editor.templates.XtextTemplateStore.class;
	}

	// contributed by org.eclipse.xtext.ui.generator.ImplicitUiFragment
	public Class<? extends org.eclipse.jface.text.templates.ContextTypeRegistry> bindContextTypeRegistry() {
		return org.eclipse.xtext.ui.common.editor.templates.XtextTemplateContextTypeRegistry.class;
	}

	// contributed by org.eclipse.xtext.ui.generator.ImplicitUiFragment
	public Class<? extends org.eclipse.xtext.ui.core.editor.formatting.IContentFormatterFactory> bindIContentFormatterFactory() {
		return org.eclipse.xtext.ui.core.editor.formatting.ContentFormatterFactory.class;
	}

	// contributed by org.eclipse.xtext.ui.generator.ImplicitUiFragment
	public Class<? extends org.eclipse.xtext.ui.core.editor.utils.ValidationJob.Factory> bindValidationJob$Factory() {
		return org.eclipse.xtext.ui.core.editor.utils.DefaultValidationJobFactory.class;
	}

	// contributed by org.eclipse.xtext.ui.generator.ImplicitUiFragment
	public Class<? extends org.eclipse.xtext.ui.core.editor.IXtextResourceChecker> bindIXtextResourceChecker() {
		return org.eclipse.xtext.ui.core.editor.DefaultXtextResourceChecker.class;
	}

	// contributed by de.itemis.xtext.antlr.XtextAntlrGeneratorFragment
	public Class<? extends org.eclipse.jface.text.rules.ITokenScanner> bindITokenScanner() {
		return org.eclipse.xtext.ui.common.editor.syntaxcoloring.antlr.AntlrTokenScanner.class;
	}

	// contributed by de.itemis.xtext.antlr.XtextAntlrGeneratorFragment
	public Class<? extends org.eclipse.xtext.ui.common.editor.contentassist.IProposalConflictHelper> bindIProposalConflictHelper() {
		return org.eclipse.xtext.ui.common.editor.contentassist.antlr.AntlrProposalConflictHelper.class;
	}

	// contributed by de.itemis.xtext.antlr.XtextAntlrGeneratorFragment
	public Class<? extends org.eclipse.xtext.ui.core.editor.IDamagerRepairer> bindIDamagerRepairer() {
		return org.eclipse.xtext.ui.core.editor.XtextDamagerRepairer.class;
	}

	// contributed by org.eclipse.xtext.ui.generator.labeling.LabelProviderFragment
	public Class<? extends org.eclipse.jface.viewers.ILabelProvider> bindILabelProvider() {
		return org.sonatype.maven.labeling.DependencyDslLabelProvider.class;
	}

	// contributed by org.eclipse.xtext.ui.generator.outline.TransformerFragment
	public Class<? extends org.eclipse.xtext.ui.common.editor.outline.transformer.ISemanticModelTransformer> bindISemanticModelTransformer() {
		return org.sonatype.maven.outline.DependencyDslTransformer.class;
	}

	// contributed by org.eclipse.xtext.ui.generator.outline.OutlineNodeAdapterFactoryFragment
	public Class<? extends org.eclipse.xtext.ui.common.editor.outline.actions.IContentOutlineNodeAdapterFactory> bindIContentOutlineNodeAdapterFactory() {
		return org.sonatype.maven.outline.DependencyDslOutlineNodeAdapterFactory.class;
	}

	// contributed by org.eclipse.xtext.ui.generator.contentAssist.JavaBasedContentAssistFragment
	public Class<? extends org.eclipse.xtext.ui.core.editor.contentassist.IContentProposalProvider> bindIContentProposalProvider() {
		return org.sonatype.maven.contentassist.DependencyDslProposalProvider.class;
	}

	// contributed by de.itemis.xtext.antlr.XtextAntlrUiGeneratorFragment
	public Class<? extends org.eclipse.xtext.ui.core.editor.contentassist.ContentAssistContext.Factory> bindContentAssistContext$Factory() {
		return org.eclipse.xtext.ui.common.editor.contentassist.antlr.ParserBasedContentAssistContextFactory.class;
	}

	// contributed by de.itemis.xtext.antlr.XtextAntlrUiGeneratorFragment
	public Class<? extends org.eclipse.xtext.ui.common.editor.contentassist.antlr.IContentAssistParser> bindIContentAssistParser() {
		return org.sonatype.maven.contentassist.antlr.DependencyDslParser.class;
	}


}
