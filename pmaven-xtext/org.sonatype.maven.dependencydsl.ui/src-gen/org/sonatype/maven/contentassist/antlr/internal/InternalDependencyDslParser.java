package org.sonatype.maven.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.sonatype.maven.services.DependencyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalDependencyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'url'", "'path'", "'.'", "'-'", "'project'", "'{'", "'groupId'", "':'", "'artifactId'", "'version'", "'}'", "'dependencies'", "'mappedDependencies'", "'plugins'", "'extensions'", "','", "'scope'", "'classifier'", "'type'", "'exclusions'", "'exclude'", "'phase'", "'extensionId'", "'execute'", "'import'", "'entity'", "'extends'", "'property'", "'[]'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

        public InternalDependencyDslParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g"; }


     
     	private DependencyDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(DependencyDslGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start entryRuleProject
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:60:1: entryRuleProject : ruleProject EOF ;
    public final void entryRuleProject() throws RecognitionException {
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:60:18: ( ruleProject EOF )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:61:1: ruleProject EOF
            {
             before(grammarAccess.getProjectRule()); 
            pushFollow(FOLLOW_ruleProject_in_entryRuleProject60);
            ruleProject();
            _fsp--;

             after(grammarAccess.getProjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProject67); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleProject


    // $ANTLR start ruleProject
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:68:1: ruleProject : ( ( rule__Project__Group__0 ) ) ;
    public final void ruleProject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:72:2: ( ( ( rule__Project__Group__0 ) ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:73:1: ( ( rule__Project__Group__0 ) )
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:73:1: ( ( rule__Project__Group__0 ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:74:1: ( rule__Project__Group__0 )
            {
             before(grammarAccess.getProjectAccess().getGroup()); 
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:75:1: ( rule__Project__Group__0 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:75:2: rule__Project__Group__0
            {
            pushFollow(FOLLOW_rule__Project__Group__0_in_ruleProject94);
            rule__Project__Group__0();
            _fsp--;


            }

             after(grammarAccess.getProjectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleProject


    // $ANTLR start entryRuleGA
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:87:1: entryRuleGA : ruleGA EOF ;
    public final void entryRuleGA() throws RecognitionException {
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:87:13: ( ruleGA EOF )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:88:1: ruleGA EOF
            {
             before(grammarAccess.getGARule()); 
            pushFollow(FOLLOW_ruleGA_in_entryRuleGA120);
            ruleGA();
            _fsp--;

             after(grammarAccess.getGARule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGA127); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleGA


    // $ANTLR start ruleGA
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:95:1: ruleGA : ( ( rule__GA__Group__0 ) ) ;
    public final void ruleGA() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:99:2: ( ( ( rule__GA__Group__0 ) ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:100:1: ( ( rule__GA__Group__0 ) )
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:100:1: ( ( rule__GA__Group__0 ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:101:1: ( rule__GA__Group__0 )
            {
             before(grammarAccess.getGAAccess().getGroup()); 
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:102:1: ( rule__GA__Group__0 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:102:2: rule__GA__Group__0
            {
            pushFollow(FOLLOW_rule__GA__Group__0_in_ruleGA154);
            rule__GA__Group__0();
            _fsp--;


            }

             after(grammarAccess.getGAAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleGA


    // $ANTLR start entryRuleDependency
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:114:1: entryRuleDependency : ruleDependency EOF ;
    public final void entryRuleDependency() throws RecognitionException {
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:114:21: ( ruleDependency EOF )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:115:1: ruleDependency EOF
            {
             before(grammarAccess.getDependencyRule()); 
            pushFollow(FOLLOW_ruleDependency_in_entryRuleDependency180);
            ruleDependency();
            _fsp--;

             after(grammarAccess.getDependencyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependency187); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleDependency


    // $ANTLR start ruleDependency
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:122:1: ruleDependency : ( ( rule__Dependency__Group__0 ) ) ;
    public final void ruleDependency() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:126:2: ( ( ( rule__Dependency__Group__0 ) ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:127:1: ( ( rule__Dependency__Group__0 ) )
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:127:1: ( ( rule__Dependency__Group__0 ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:128:1: ( rule__Dependency__Group__0 )
            {
             before(grammarAccess.getDependencyAccess().getGroup()); 
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:129:1: ( rule__Dependency__Group__0 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:129:2: rule__Dependency__Group__0
            {
            pushFollow(FOLLOW_rule__Dependency__Group__0_in_ruleDependency214);
            rule__Dependency__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDependencyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDependency


    // $ANTLR start entryRuleMappedDependency
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:141:1: entryRuleMappedDependency : ruleMappedDependency EOF ;
    public final void entryRuleMappedDependency() throws RecognitionException {
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:141:27: ( ruleMappedDependency EOF )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:142:1: ruleMappedDependency EOF
            {
             before(grammarAccess.getMappedDependencyRule()); 
            pushFollow(FOLLOW_ruleMappedDependency_in_entryRuleMappedDependency240);
            ruleMappedDependency();
            _fsp--;

             after(grammarAccess.getMappedDependencyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMappedDependency247); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleMappedDependency


    // $ANTLR start ruleMappedDependency
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:149:1: ruleMappedDependency : ( ( rule__MappedDependency__Group__0 ) ) ;
    public final void ruleMappedDependency() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:153:2: ( ( ( rule__MappedDependency__Group__0 ) ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:154:1: ( ( rule__MappedDependency__Group__0 ) )
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:154:1: ( ( rule__MappedDependency__Group__0 ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:155:1: ( rule__MappedDependency__Group__0 )
            {
             before(grammarAccess.getMappedDependencyAccess().getGroup()); 
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:156:1: ( rule__MappedDependency__Group__0 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:156:2: rule__MappedDependency__Group__0
            {
            pushFollow(FOLLOW_rule__MappedDependency__Group__0_in_ruleMappedDependency274);
            rule__MappedDependency__Group__0();
            _fsp--;


            }

             after(grammarAccess.getMappedDependencyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleMappedDependency


    // $ANTLR start entryRulePlugin
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:168:1: entryRulePlugin : rulePlugin EOF ;
    public final void entryRulePlugin() throws RecognitionException {
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:168:17: ( rulePlugin EOF )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:169:1: rulePlugin EOF
            {
             before(grammarAccess.getPluginRule()); 
            pushFollow(FOLLOW_rulePlugin_in_entryRulePlugin300);
            rulePlugin();
            _fsp--;

             after(grammarAccess.getPluginRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlugin307); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRulePlugin


    // $ANTLR start rulePlugin
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:176:1: rulePlugin : ( ( rule__Plugin__Group__0 ) ) ;
    public final void rulePlugin() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:180:2: ( ( ( rule__Plugin__Group__0 ) ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:181:1: ( ( rule__Plugin__Group__0 ) )
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:181:1: ( ( rule__Plugin__Group__0 ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:182:1: ( rule__Plugin__Group__0 )
            {
             before(grammarAccess.getPluginAccess().getGroup()); 
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:183:1: ( rule__Plugin__Group__0 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:183:2: rule__Plugin__Group__0
            {
            pushFollow(FOLLOW_rule__Plugin__Group__0_in_rulePlugin334);
            rule__Plugin__Group__0();
            _fsp--;


            }

             after(grammarAccess.getPluginAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulePlugin


    // $ANTLR start entryRuleExtension
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:195:1: entryRuleExtension : ruleExtension EOF ;
    public final void entryRuleExtension() throws RecognitionException {
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:195:20: ( ruleExtension EOF )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:196:1: ruleExtension EOF
            {
             before(grammarAccess.getExtensionRule()); 
            pushFollow(FOLLOW_ruleExtension_in_entryRuleExtension360);
            ruleExtension();
            _fsp--;

             after(grammarAccess.getExtensionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtension367); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleExtension


    // $ANTLR start ruleExtension
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:203:1: ruleExtension : ( ( rule__Extension__Group__0 ) ) ;
    public final void ruleExtension() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:207:2: ( ( ( rule__Extension__Group__0 ) ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:208:1: ( ( rule__Extension__Group__0 ) )
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:208:1: ( ( rule__Extension__Group__0 ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:209:1: ( rule__Extension__Group__0 )
            {
             before(grammarAccess.getExtensionAccess().getGroup()); 
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:210:1: ( rule__Extension__Group__0 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:210:2: rule__Extension__Group__0
            {
            pushFollow(FOLLOW_rule__Extension__Group__0_in_ruleExtension394);
            rule__Extension__Group__0();
            _fsp--;


            }

             after(grammarAccess.getExtensionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleExtension


    // $ANTLR start entryRuleGroupId
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:224:1: entryRuleGroupId : ruleGroupId EOF ;
    public final void entryRuleGroupId() throws RecognitionException {
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:224:18: ( ruleGroupId EOF )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:225:1: ruleGroupId EOF
            {
             before(grammarAccess.getGroupIdRule()); 
            pushFollow(FOLLOW_ruleGroupId_in_entryRuleGroupId422);
            ruleGroupId();
            _fsp--;

             after(grammarAccess.getGroupIdRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroupId429); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleGroupId


    // $ANTLR start ruleGroupId
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:232:1: ruleGroupId : ( ( rule__GroupId__Group__0 )* ) ;
    public final void ruleGroupId() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:236:2: ( ( ( rule__GroupId__Group__0 )* ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:237:1: ( ( rule__GroupId__Group__0 )* )
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:237:1: ( ( rule__GroupId__Group__0 )* )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:238:1: ( rule__GroupId__Group__0 )*
            {
             before(grammarAccess.getGroupIdAccess().getGroup()); 
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:239:1: ( rule__GroupId__Group__0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:239:2: rule__GroupId__Group__0
            	    {
            	    pushFollow(FOLLOW_rule__GroupId__Group__0_in_ruleGroupId456);
            	    rule__GroupId__Group__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getGroupIdAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleGroupId


    // $ANTLR start entryRuleArtifactId
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:251:1: entryRuleArtifactId : ruleArtifactId EOF ;
    public final void entryRuleArtifactId() throws RecognitionException {
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:251:21: ( ruleArtifactId EOF )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:252:1: ruleArtifactId EOF
            {
             before(grammarAccess.getArtifactIdRule()); 
            pushFollow(FOLLOW_ruleArtifactId_in_entryRuleArtifactId483);
            ruleArtifactId();
            _fsp--;

             after(grammarAccess.getArtifactIdRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArtifactId490); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleArtifactId


    // $ANTLR start ruleArtifactId
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:259:1: ruleArtifactId : ( ( rule__ArtifactId__Group__0 )* ) ;
    public final void ruleArtifactId() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:263:2: ( ( ( rule__ArtifactId__Group__0 )* ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:264:1: ( ( rule__ArtifactId__Group__0 )* )
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:264:1: ( ( rule__ArtifactId__Group__0 )* )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:265:1: ( rule__ArtifactId__Group__0 )*
            {
             before(grammarAccess.getArtifactIdAccess().getGroup()); 
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:266:1: ( rule__ArtifactId__Group__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:266:2: rule__ArtifactId__Group__0
            	    {
            	    pushFollow(FOLLOW_rule__ArtifactId__Group__0_in_ruleArtifactId517);
            	    rule__ArtifactId__Group__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getArtifactIdAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleArtifactId


    // $ANTLR start entryRuleVersion
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:278:1: entryRuleVersion : ruleVersion EOF ;
    public final void entryRuleVersion() throws RecognitionException {
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:278:18: ( ruleVersion EOF )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:279:1: ruleVersion EOF
            {
             before(grammarAccess.getVersionRule()); 
            pushFollow(FOLLOW_ruleVersion_in_entryRuleVersion544);
            ruleVersion();
            _fsp--;

             after(grammarAccess.getVersionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVersion551); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleVersion


    // $ANTLR start ruleVersion
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:286:1: ruleVersion : ( ( rule__Version__Group__0 ) ) ;
    public final void ruleVersion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:290:2: ( ( ( rule__Version__Group__0 ) ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:291:1: ( ( rule__Version__Group__0 ) )
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:291:1: ( ( rule__Version__Group__0 ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:292:1: ( rule__Version__Group__0 )
            {
             before(grammarAccess.getVersionAccess().getGroup()); 
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:293:1: ( rule__Version__Group__0 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:293:2: rule__Version__Group__0
            {
            pushFollow(FOLLOW_rule__Version__Group__0_in_ruleVersion578);
            rule__Version__Group__0();
            _fsp--;


            }

             after(grammarAccess.getVersionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleVersion


    // $ANTLR start entryRuleImport
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:307:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:307:17: ( ruleImport EOF )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:308:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport606);
            ruleImport();
            _fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport613); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleImport


    // $ANTLR start ruleImport
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:315:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:319:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:320:1: ( ( rule__Import__Group__0 ) )
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:320:1: ( ( rule__Import__Group__0 ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:321:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:322:1: ( rule__Import__Group__0 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:322:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport640);
            rule__Import__Group__0();
            _fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleImport


    // $ANTLR start entryRuleType
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:334:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:334:15: ( ruleType EOF )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:335:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType666);
            ruleType();
            _fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType673); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleType


    // $ANTLR start ruleType
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:342:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:346:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:347:1: ( ( rule__Type__Alternatives ) )
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:347:1: ( ( rule__Type__Alternatives ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:348:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:349:1: ( rule__Type__Alternatives )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:349:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType700);
            rule__Type__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleType


    // $ANTLR start entryRuleSimpleType
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:361:1: entryRuleSimpleType : ruleSimpleType EOF ;
    public final void entryRuleSimpleType() throws RecognitionException {
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:361:21: ( ruleSimpleType EOF )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:362:1: ruleSimpleType EOF
            {
             before(grammarAccess.getSimpleTypeRule()); 
            pushFollow(FOLLOW_ruleSimpleType_in_entryRuleSimpleType726);
            ruleSimpleType();
            _fsp--;

             after(grammarAccess.getSimpleTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleType733); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleSimpleType


    // $ANTLR start ruleSimpleType
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:369:1: ruleSimpleType : ( ( rule__SimpleType__Group__0 ) ) ;
    public final void ruleSimpleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:373:2: ( ( ( rule__SimpleType__Group__0 ) ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:374:1: ( ( rule__SimpleType__Group__0 ) )
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:374:1: ( ( rule__SimpleType__Group__0 ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:375:1: ( rule__SimpleType__Group__0 )
            {
             before(grammarAccess.getSimpleTypeAccess().getGroup()); 
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:376:1: ( rule__SimpleType__Group__0 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:376:2: rule__SimpleType__Group__0
            {
            pushFollow(FOLLOW_rule__SimpleType__Group__0_in_ruleSimpleType760);
            rule__SimpleType__Group__0();
            _fsp--;


            }

             after(grammarAccess.getSimpleTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleSimpleType


    // $ANTLR start entryRuleEntity
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:388:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:388:17: ( ruleEntity EOF )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:389:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity786);
            ruleEntity();
            _fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity793); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleEntity


    // $ANTLR start ruleEntity
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:396:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:400:2: ( ( ( rule__Entity__Group__0 ) ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:401:1: ( ( rule__Entity__Group__0 ) )
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:401:1: ( ( rule__Entity__Group__0 ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:402:1: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:403:1: ( rule__Entity__Group__0 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:403:2: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_rule__Entity__Group__0_in_ruleEntity820);
            rule__Entity__Group__0();
            _fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleEntity


    // $ANTLR start entryRuleProperty
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:415:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:415:19: ( ruleProperty EOF )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:416:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty846);
            ruleProperty();
            _fsp--;

             after(grammarAccess.getPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty853); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleProperty


    // $ANTLR start ruleProperty
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:423:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:427:2: ( ( ( rule__Property__Group__0 ) ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:428:1: ( ( rule__Property__Group__0 ) )
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:428:1: ( ( rule__Property__Group__0 ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:429:1: ( rule__Property__Group__0 )
            {
             before(grammarAccess.getPropertyAccess().getGroup()); 
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:430:1: ( rule__Property__Group__0 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:430:2: rule__Property__Group__0
            {
            pushFollow(FOLLOW_rule__Property__Group__0_in_ruleProperty880);
            rule__Property__Group__0();
            _fsp--;


            }

             after(grammarAccess.getPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleProperty


    // $ANTLR start rule__Dependency__Alternatives_11
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:442:1: rule__Dependency__Alternatives_11 : ( ( ( rule__Dependency__Group_11_0__0 ) ) | ( 'url' ) );
    public final void rule__Dependency__Alternatives_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:446:1: ( ( ( rule__Dependency__Group_11_0__0 ) ) | ( 'url' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==26) ) {
                alt3=1;
            }
            else if ( (LA3_0==11) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("442:1: rule__Dependency__Alternatives_11 : ( ( ( rule__Dependency__Group_11_0__0 ) ) | ( 'url' ) );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:447:1: ( ( rule__Dependency__Group_11_0__0 ) )
                    {
                    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:447:1: ( ( rule__Dependency__Group_11_0__0 ) )
                    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:448:1: ( rule__Dependency__Group_11_0__0 )
                    {
                     before(grammarAccess.getDependencyAccess().getGroup_11_0()); 
                    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:449:1: ( rule__Dependency__Group_11_0__0 )
                    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:449:2: rule__Dependency__Group_11_0__0
                    {
                    pushFollow(FOLLOW_rule__Dependency__Group_11_0__0_in_rule__Dependency__Alternatives_11916);
                    rule__Dependency__Group_11_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getDependencyAccess().getGroup_11_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:453:6: ( 'url' )
                    {
                    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:453:6: ( 'url' )
                    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:454:1: 'url'
                    {
                     before(grammarAccess.getDependencyAccess().getUrlKeyword_11_1()); 
                    match(input,11,FOLLOW_11_in_rule__Dependency__Alternatives_11935); 
                     after(grammarAccess.getDependencyAccess().getUrlKeyword_11_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Dependency__Alternatives_11


    // $ANTLR start rule__MappedDependency__Alternatives_0
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:466:1: rule__MappedDependency__Alternatives_0 : ( ( 'path' ) | ( 'url' ) );
    public final void rule__MappedDependency__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:470:1: ( ( 'path' ) | ( 'url' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            else if ( (LA4_0==11) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("466:1: rule__MappedDependency__Alternatives_0 : ( ( 'path' ) | ( 'url' ) );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:471:1: ( 'path' )
                    {
                    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:471:1: ( 'path' )
                    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:472:1: 'path'
                    {
                     before(grammarAccess.getMappedDependencyAccess().getPathKeyword_0_0()); 
                    match(input,12,FOLLOW_12_in_rule__MappedDependency__Alternatives_0970); 
                     after(grammarAccess.getMappedDependencyAccess().getPathKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:479:6: ( 'url' )
                    {
                    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:479:6: ( 'url' )
                    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:480:1: 'url'
                    {
                     before(grammarAccess.getMappedDependencyAccess().getUrlKeyword_0_1()); 
                    match(input,11,FOLLOW_11_in_rule__MappedDependency__Alternatives_0990); 
                     after(grammarAccess.getMappedDependencyAccess().getUrlKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MappedDependency__Alternatives_0


    // $ANTLR start rule__GroupId__Alternatives_1
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:494:1: rule__GroupId__Alternatives_1 : ( ( '.' ) | ( '-' ) );
    public final void rule__GroupId__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:498:1: ( ( '.' ) | ( '-' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            else if ( (LA5_0==14) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("494:1: rule__GroupId__Alternatives_1 : ( ( '.' ) | ( '-' ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:499:1: ( '.' )
                    {
                    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:499:1: ( '.' )
                    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:500:1: '.'
                    {
                     before(grammarAccess.getGroupIdAccess().getFullStopKeyword_1_0()); 
                    match(input,13,FOLLOW_13_in_rule__GroupId__Alternatives_11027); 
                     after(grammarAccess.getGroupIdAccess().getFullStopKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:507:6: ( '-' )
                    {
                    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:507:6: ( '-' )
                    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:508:1: '-'
                    {
                     before(grammarAccess.getGroupIdAccess().getHyphenMinusKeyword_1_1()); 
                    match(input,14,FOLLOW_14_in_rule__GroupId__Alternatives_11047); 
                     after(grammarAccess.getGroupIdAccess().getHyphenMinusKeyword_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__GroupId__Alternatives_1


    // $ANTLR start rule__ArtifactId__Alternatives_1
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:520:1: rule__ArtifactId__Alternatives_1 : ( ( '.' ) | ( '-' ) );
    public final void rule__ArtifactId__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:524:1: ( ( '.' ) | ( '-' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            else if ( (LA6_0==14) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("520:1: rule__ArtifactId__Alternatives_1 : ( ( '.' ) | ( '-' ) );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:525:1: ( '.' )
                    {
                    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:525:1: ( '.' )
                    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:526:1: '.'
                    {
                     before(grammarAccess.getArtifactIdAccess().getFullStopKeyword_1_0()); 
                    match(input,13,FOLLOW_13_in_rule__ArtifactId__Alternatives_11082); 
                     after(grammarAccess.getArtifactIdAccess().getFullStopKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:533:6: ( '-' )
                    {
                    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:533:6: ( '-' )
                    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:534:1: '-'
                    {
                     before(grammarAccess.getArtifactIdAccess().getHyphenMinusKeyword_1_1()); 
                    match(input,14,FOLLOW_14_in_rule__ArtifactId__Alternatives_11102); 
                     after(grammarAccess.getArtifactIdAccess().getHyphenMinusKeyword_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ArtifactId__Alternatives_1


    // $ANTLR start rule__Type__Alternatives
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:546:1: rule__Type__Alternatives : ( ( ruleSimpleType ) | ( ruleEntity ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:550:1: ( ( ruleSimpleType ) | ( ruleEntity ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==29) ) {
                alt7=1;
            }
            else if ( (LA7_0==36) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("546:1: rule__Type__Alternatives : ( ( ruleSimpleType ) | ( ruleEntity ) );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:551:1: ( ruleSimpleType )
                    {
                    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:551:1: ( ruleSimpleType )
                    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:552:1: ruleSimpleType
                    {
                     before(grammarAccess.getTypeAccess().getSimpleTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSimpleType_in_rule__Type__Alternatives1136);
                    ruleSimpleType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getSimpleTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:557:6: ( ruleEntity )
                    {
                    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:557:6: ( ruleEntity )
                    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:558:1: ruleEntity
                    {
                     before(grammarAccess.getTypeAccess().getEntityParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEntity_in_rule__Type__Alternatives1153);
                    ruleEntity();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getEntityParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Type__Alternatives


    // $ANTLR start rule__Project__Group__0
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:570:1: rule__Project__Group__0 : ( 'project' ) rule__Project__Group__1 ;
    public final void rule__Project__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:574:1: ( ( 'project' ) rule__Project__Group__1 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:575:1: ( 'project' ) rule__Project__Group__1
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:575:1: ( 'project' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:576:1: 'project'
            {
             before(grammarAccess.getProjectAccess().getProjectKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Project__Group__01188); 
             after(grammarAccess.getProjectAccess().getProjectKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Project__Group__1_in_rule__Project__Group__01198);
            rule__Project__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Project__Group__0


    // $ANTLR start rule__Project__Group__1
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:590:1: rule__Project__Group__1 : ( '{' ) rule__Project__Group__2 ;
    public final void rule__Project__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:594:1: ( ( '{' ) rule__Project__Group__2 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:595:1: ( '{' ) rule__Project__Group__2
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:595:1: ( '{' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:596:1: '{'
            {
             before(grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__Project__Group__11227); 
             after(grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__Project__Group__2_in_rule__Project__Group__11237);
            rule__Project__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Project__Group__1


    // $ANTLR start rule__Project__Group__2
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:610:1: rule__Project__Group__2 : ( 'groupId' ) rule__Project__Group__3 ;
    public final void rule__Project__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:614:1: ( ( 'groupId' ) rule__Project__Group__3 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:615:1: ( 'groupId' ) rule__Project__Group__3
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:615:1: ( 'groupId' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:616:1: 'groupId'
            {
             before(grammarAccess.getProjectAccess().getGroupIdKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__Project__Group__21266); 
             after(grammarAccess.getProjectAccess().getGroupIdKeyword_2()); 

            }

            pushFollow(FOLLOW_rule__Project__Group__3_in_rule__Project__Group__21276);
            rule__Project__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Project__Group__2


    // $ANTLR start rule__Project__Group__3
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:630:1: rule__Project__Group__3 : ( ':' ) rule__Project__Group__4 ;
    public final void rule__Project__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:634:1: ( ( ':' ) rule__Project__Group__4 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:635:1: ( ':' ) rule__Project__Group__4
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:635:1: ( ':' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:636:1: ':'
            {
             before(grammarAccess.getProjectAccess().getColonKeyword_3()); 
            match(input,18,FOLLOW_18_in_rule__Project__Group__31305); 
             after(grammarAccess.getProjectAccess().getColonKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__Project__Group__4_in_rule__Project__Group__31315);
            rule__Project__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Project__Group__3


    // $ANTLR start rule__Project__Group__4
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:650:1: rule__Project__Group__4 : ( ( rule__Project__GroupIdAssignment_4 ) ) rule__Project__Group__5 ;
    public final void rule__Project__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:654:1: ( ( ( rule__Project__GroupIdAssignment_4 ) ) rule__Project__Group__5 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:655:1: ( ( rule__Project__GroupIdAssignment_4 ) ) rule__Project__Group__5
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:655:1: ( ( rule__Project__GroupIdAssignment_4 ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:656:1: ( rule__Project__GroupIdAssignment_4 )
            {
             before(grammarAccess.getProjectAccess().getGroupIdAssignment_4()); 
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:657:1: ( rule__Project__GroupIdAssignment_4 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:657:2: rule__Project__GroupIdAssignment_4
            {
            pushFollow(FOLLOW_rule__Project__GroupIdAssignment_4_in_rule__Project__Group__41343);
            rule__Project__GroupIdAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getProjectAccess().getGroupIdAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__Project__Group__5_in_rule__Project__Group__41352);
            rule__Project__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Project__Group__4


    // $ANTLR start rule__Project__Group__5
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:668:1: rule__Project__Group__5 : ( 'artifactId' ) rule__Project__Group__6 ;
    public final void rule__Project__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:672:1: ( ( 'artifactId' ) rule__Project__Group__6 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:673:1: ( 'artifactId' ) rule__Project__Group__6
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:673:1: ( 'artifactId' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:674:1: 'artifactId'
            {
             before(grammarAccess.getProjectAccess().getArtifactIdKeyword_5()); 
            match(input,19,FOLLOW_19_in_rule__Project__Group__51381); 
             after(grammarAccess.getProjectAccess().getArtifactIdKeyword_5()); 

            }

            pushFollow(FOLLOW_rule__Project__Group__6_in_rule__Project__Group__51391);
            rule__Project__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Project__Group__5


    // $ANTLR start rule__Project__Group__6
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:688:1: rule__Project__Group__6 : ( ':' ) rule__Project__Group__7 ;
    public final void rule__Project__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:692:1: ( ( ':' ) rule__Project__Group__7 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:693:1: ( ':' ) rule__Project__Group__7
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:693:1: ( ':' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:694:1: ':'
            {
             before(grammarAccess.getProjectAccess().getColonKeyword_6()); 
            match(input,18,FOLLOW_18_in_rule__Project__Group__61420); 
             after(grammarAccess.getProjectAccess().getColonKeyword_6()); 

            }

            pushFollow(FOLLOW_rule__Project__Group__7_in_rule__Project__Group__61430);
            rule__Project__Group__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Project__Group__6


    // $ANTLR start rule__Project__Group__7
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:708:1: rule__Project__Group__7 : ( ( rule__Project__ArtifactIdAssignment_7 ) ) rule__Project__Group__8 ;
    public final void rule__Project__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:712:1: ( ( ( rule__Project__ArtifactIdAssignment_7 ) ) rule__Project__Group__8 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:713:1: ( ( rule__Project__ArtifactIdAssignment_7 ) ) rule__Project__Group__8
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:713:1: ( ( rule__Project__ArtifactIdAssignment_7 ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:714:1: ( rule__Project__ArtifactIdAssignment_7 )
            {
             before(grammarAccess.getProjectAccess().getArtifactIdAssignment_7()); 
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:715:1: ( rule__Project__ArtifactIdAssignment_7 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:715:2: rule__Project__ArtifactIdAssignment_7
            {
            pushFollow(FOLLOW_rule__Project__ArtifactIdAssignment_7_in_rule__Project__Group__71458);
            rule__Project__ArtifactIdAssignment_7();
            _fsp--;


            }

             after(grammarAccess.getProjectAccess().getArtifactIdAssignment_7()); 

            }

            pushFollow(FOLLOW_rule__Project__Group__8_in_rule__Project__Group__71467);
            rule__Project__Group__8();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Project__Group__7


    // $ANTLR start rule__Project__Group__8
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:726:1: rule__Project__Group__8 : ( 'version' ) rule__Project__Group__9 ;
    public final void rule__Project__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:730:1: ( ( 'version' ) rule__Project__Group__9 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:731:1: ( 'version' ) rule__Project__Group__9
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:731:1: ( 'version' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:732:1: 'version'
            {
             before(grammarAccess.getProjectAccess().getVersionKeyword_8()); 
            match(input,20,FOLLOW_20_in_rule__Project__Group__81496); 
             after(grammarAccess.getProjectAccess().getVersionKeyword_8()); 

            }

            pushFollow(FOLLOW_rule__Project__Group__9_in_rule__Project__Group__81506);
            rule__Project__Group__9();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Project__Group__8


    // $ANTLR start rule__Project__Group__9
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:746:1: rule__Project__Group__9 : ( ':' ) rule__Project__Group__10 ;
    public final void rule__Project__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:750:1: ( ( ':' ) rule__Project__Group__10 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:751:1: ( ':' ) rule__Project__Group__10
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:751:1: ( ':' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:752:1: ':'
            {
             before(grammarAccess.getProjectAccess().getColonKeyword_9()); 
            match(input,18,FOLLOW_18_in_rule__Project__Group__91535); 
             after(grammarAccess.getProjectAccess().getColonKeyword_9()); 

            }

            pushFollow(FOLLOW_rule__Project__Group__10_in_rule__Project__Group__91545);
            rule__Project__Group__10();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Project__Group__9


    // $ANTLR start rule__Project__Group__10
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:766:1: rule__Project__Group__10 : ( ( rule__Project__VersionAssignment_10 ) ) rule__Project__Group__11 ;
    public final void rule__Project__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:770:1: ( ( ( rule__Project__VersionAssignment_10 ) ) rule__Project__Group__11 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:771:1: ( ( rule__Project__VersionAssignment_10 ) ) rule__Project__Group__11
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:771:1: ( ( rule__Project__VersionAssignment_10 ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:772:1: ( rule__Project__VersionAssignment_10 )
            {
             before(grammarAccess.getProjectAccess().getVersionAssignment_10()); 
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:773:1: ( rule__Project__VersionAssignment_10 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:773:2: rule__Project__VersionAssignment_10
            {
            pushFollow(FOLLOW_rule__Project__VersionAssignment_10_in_rule__Project__Group__101573);
            rule__Project__VersionAssignment_10();
            _fsp--;


            }

             after(grammarAccess.getProjectAccess().getVersionAssignment_10()); 

            }

            pushFollow(FOLLOW_rule__Project__Group__11_in_rule__Project__Group__101582);
            rule__Project__Group__11();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Project__Group__10


    // $ANTLR start rule__Project__Group__11
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:784:1: rule__Project__Group__11 : ( ( rule__Project__Group_11__0 )? ) rule__Project__Group__12 ;
    public final void rule__Project__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:788:1: ( ( ( rule__Project__Group_11__0 )? ) rule__Project__Group__12 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:789:1: ( ( rule__Project__Group_11__0 )? ) rule__Project__Group__12
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:789:1: ( ( rule__Project__Group_11__0 )? )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:790:1: ( rule__Project__Group_11__0 )?
            {
             before(grammarAccess.getProjectAccess().getGroup_11()); 
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:791:1: ( rule__Project__Group_11__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:791:2: rule__Project__Group_11__0
                    {
                    pushFollow(FOLLOW_rule__Project__Group_11__0_in_rule__Project__Group__111610);
                    rule__Project__Group_11__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProjectAccess().getGroup_11()); 

            }

            pushFollow(FOLLOW_rule__Project__Group__12_in_rule__Project__Group__111620);
            rule__Project__Group__12();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Project__Group__11


    // $ANTLR start rule__Project__Group__12
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:802:1: rule__Project__Group__12 : ( ( rule__Project__Group_12__0 )? ) rule__Project__Group__13 ;
    public final void rule__Project__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:806:1: ( ( ( rule__Project__Group_12__0 )? ) rule__Project__Group__13 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:807:1: ( ( rule__Project__Group_12__0 )? ) rule__Project__Group__13
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:807:1: ( ( rule__Project__Group_12__0 )? )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:808:1: ( rule__Project__Group_12__0 )?
            {
             before(grammarAccess.getProjectAccess().getGroup_12()); 
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:809:1: ( rule__Project__Group_12__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:809:2: rule__Project__Group_12__0
                    {
                    pushFollow(FOLLOW_rule__Project__Group_12__0_in_rule__Project__Group__121648);
                    rule__Project__Group_12__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProjectAccess().getGroup_12()); 

            }

            pushFollow(FOLLOW_rule__Project__Group__13_in_rule__Project__Group__121658);
            rule__Project__Group__13();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Project__Group__12


    // $ANTLR start rule__Project__Group__13
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:820:1: rule__Project__Group__13 : ( ( rule__Project__Group_13__0 )? ) rule__Project__Group__14 ;
    public final void rule__Project__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:824:1: ( ( ( rule__Project__Group_13__0 )? ) rule__Project__Group__14 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:825:1: ( ( rule__Project__Group_13__0 )? ) rule__Project__Group__14
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:825:1: ( ( rule__Project__Group_13__0 )? )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:826:1: ( rule__Project__Group_13__0 )?
            {
             before(grammarAccess.getProjectAccess().getGroup_13()); 
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:827:1: ( rule__Project__Group_13__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:827:2: rule__Project__Group_13__0
                    {
                    pushFollow(FOLLOW_rule__Project__Group_13__0_in_rule__Project__Group__131686);
                    rule__Project__Group_13__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProjectAccess().getGroup_13()); 

            }

            pushFollow(FOLLOW_rule__Project__Group__14_in_rule__Project__Group__131696);
            rule__Project__Group__14();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Project__Group__13


    // $ANTLR start rule__Project__Group__14
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:838:1: rule__Project__Group__14 : ( ( rule__Project__Group_14__0 )? ) rule__Project__Group__15 ;
    public final void rule__Project__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:842:1: ( ( ( rule__Project__Group_14__0 )? ) rule__Project__Group__15 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:843:1: ( ( rule__Project__Group_14__0 )? ) rule__Project__Group__15
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:843:1: ( ( rule__Project__Group_14__0 )? )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:844:1: ( rule__Project__Group_14__0 )?
            {
             before(grammarAccess.getProjectAccess().getGroup_14()); 
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:845:1: ( rule__Project__Group_14__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:845:2: rule__Project__Group_14__0
                    {
                    pushFollow(FOLLOW_rule__Project__Group_14__0_in_rule__Project__Group__141724);
                    rule__Project__Group_14__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProjectAccess().getGroup_14()); 

            }

            pushFollow(FOLLOW_rule__Project__Group__15_in_rule__Project__Group__141734);
            rule__Project__Group__15();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Project__Group__14


    // $ANTLR start rule__Project__Group__15
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:856:1: rule__Project__Group__15 : ( '}' ) ;
    public final void rule__Project__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:860:1: ( ( '}' ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:861:1: ( '}' )
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:861:1: ( '}' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:862:1: '}'
            {
             before(grammarAccess.getProjectAccess().getRightCurlyBracketKeyword_15()); 
            match(input,21,FOLLOW_21_in_rule__Project__Group__151763); 
             after(grammarAccess.getProjectAccess().getRightCurlyBracketKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Project__Group__15


    // $ANTLR start rule__Project__Group_11__0
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:907:1: rule__Project__Group_11__0 : ( 'dependencies' ) rule__Project__Group_11__1 ;
    public final void rule__Project__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:911:1: ( ( 'dependencies' ) rule__Project__Group_11__1 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:912:1: ( 'dependencies' ) rule__Project__Group_11__1
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:912:1: ( 'dependencies' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:913:1: 'dependencies'
            {
             before(grammarAccess.getProjectAccess().getDependenciesKeyword_11_0()); 
            match(input,22,FOLLOW_22_in_rule__Project__Group_11__01831); 
             after(grammarAccess.getProjectAccess().getDependenciesKeyword_11_0()); 

            }

            pushFollow(FOLLOW_rule__Project__Group_11__1_in_rule__Project__Group_11__01841);
            rule__Project__Group_11__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Project__Group_11__0


    // $ANTLR start rule__Project__Group_11__1
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:927:1: rule__Project__Group_11__1 : ( '{' ) rule__Project__Group_11__2 ;
    public final void rule__Project__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:931:1: ( ( '{' ) rule__Project__Group_11__2 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:932:1: ( '{' ) rule__Project__Group_11__2
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:932:1: ( '{' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:933:1: '{'
            {
             before(grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_11_1()); 
            match(input,16,FOLLOW_16_in_rule__Project__Group_11__11870); 
             after(grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_11_1()); 

            }

            pushFollow(FOLLOW_rule__Project__Group_11__2_in_rule__Project__Group_11__11880);
            rule__Project__Group_11__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Project__Group_11__1


    // $ANTLR start rule__Project__Group_11__2
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:947:1: rule__Project__Group_11__2 : ( ( rule__Project__DependenciesAssignment_11_2 )* ) rule__Project__Group_11__3 ;
    public final void rule__Project__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:951:1: ( ( ( rule__Project__DependenciesAssignment_11_2 )* ) rule__Project__Group_11__3 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:952:1: ( ( rule__Project__DependenciesAssignment_11_2 )* ) rule__Project__Group_11__3
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:952:1: ( ( rule__Project__DependenciesAssignment_11_2 )* )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:953:1: ( rule__Project__DependenciesAssignment_11_2 )*
            {
             before(grammarAccess.getProjectAccess().getDependenciesAssignment_11_2()); 
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:954:1: ( rule__Project__DependenciesAssignment_11_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==17) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:954:2: rule__Project__DependenciesAssignment_11_2
            	    {
            	    pushFollow(FOLLOW_rule__Project__DependenciesAssignment_11_2_in_rule__Project__Group_11__21908);
            	    rule__Project__DependenciesAssignment_11_2();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getProjectAccess().getDependenciesAssignment_11_2()); 

            }

            pushFollow(FOLLOW_rule__Project__Group_11__3_in_rule__Project__Group_11__21918);
            rule__Project__Group_11__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Project__Group_11__2


    // $ANTLR start rule__Project__Group_11__3
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:965:1: rule__Project__Group_11__3 : ( '}' ) ;
    public final void rule__Project__Group_11__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:969:1: ( ( '}' ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:970:1: ( '}' )
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:970:1: ( '}' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:971:1: '}'
            {
             before(grammarAccess.getProjectAccess().getRightCurlyBracketKeyword_11_3()); 
            match(input,21,FOLLOW_21_in_rule__Project__Group_11__31947); 
             after(grammarAccess.getProjectAccess().getRightCurlyBracketKeyword_11_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Project__Group_11__3


    // $ANTLR start rule__Project__Group_12__0
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:992:1: rule__Project__Group_12__0 : ( 'mappedDependencies' ) rule__Project__Group_12__1 ;
    public final void rule__Project__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:996:1: ( ( 'mappedDependencies' ) rule__Project__Group_12__1 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:997:1: ( 'mappedDependencies' ) rule__Project__Group_12__1
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:997:1: ( 'mappedDependencies' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:998:1: 'mappedDependencies'
            {
             before(grammarAccess.getProjectAccess().getMappedDependenciesKeyword_12_0()); 
            match(input,23,FOLLOW_23_in_rule__Project__Group_12__01991); 
             after(grammarAccess.getProjectAccess().getMappedDependenciesKeyword_12_0()); 

            }

            pushFollow(FOLLOW_rule__Project__Group_12__1_in_rule__Project__Group_12__02001);
            rule__Project__Group_12__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Project__Group_12__0


    // $ANTLR start rule__Project__Group_12__1
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1012:1: rule__Project__Group_12__1 : ( '{' ) rule__Project__Group_12__2 ;
    public final void rule__Project__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1016:1: ( ( '{' ) rule__Project__Group_12__2 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1017:1: ( '{' ) rule__Project__Group_12__2
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1017:1: ( '{' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1018:1: '{'
            {
             before(grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_12_1()); 
            match(input,16,FOLLOW_16_in_rule__Project__Group_12__12030); 
             after(grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_12_1()); 

            }

            pushFollow(FOLLOW_rule__Project__Group_12__2_in_rule__Project__Group_12__12040);
            rule__Project__Group_12__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Project__Group_12__1


    // $ANTLR start rule__Project__Group_12__2
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1032:1: rule__Project__Group_12__2 : ( ( rule__Project__MappedDependenciesAssignment_12_2 )* ) rule__Project__Group_12__3 ;
    public final void rule__Project__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1036:1: ( ( ( rule__Project__MappedDependenciesAssignment_12_2 )* ) rule__Project__Group_12__3 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1037:1: ( ( rule__Project__MappedDependenciesAssignment_12_2 )* ) rule__Project__Group_12__3
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1037:1: ( ( rule__Project__MappedDependenciesAssignment_12_2 )* )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1038:1: ( rule__Project__MappedDependenciesAssignment_12_2 )*
            {
             before(grammarAccess.getProjectAccess().getMappedDependenciesAssignment_12_2()); 
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1039:1: ( rule__Project__MappedDependenciesAssignment_12_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=11 && LA13_0<=12)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1039:2: rule__Project__MappedDependenciesAssignment_12_2
            	    {
            	    pushFollow(FOLLOW_rule__Project__MappedDependenciesAssignment_12_2_in_rule__Project__Group_12__22068);
            	    rule__Project__MappedDependenciesAssignment_12_2();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getProjectAccess().getMappedDependenciesAssignment_12_2()); 

            }

            pushFollow(FOLLOW_rule__Project__Group_12__3_in_rule__Project__Group_12__22078);
            rule__Project__Group_12__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Project__Group_12__2


    // $ANTLR start rule__Project__Group_12__3
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1050:1: rule__Project__Group_12__3 : ( '}' ) ;
    public final void rule__Project__Group_12__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1054:1: ( ( '}' ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1055:1: ( '}' )
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1055:1: ( '}' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1056:1: '}'
            {
             before(grammarAccess.getProjectAccess().getRightCurlyBracketKeyword_12_3()); 
            match(input,21,FOLLOW_21_in_rule__Project__Group_12__32107); 
             after(grammarAccess.getProjectAccess().getRightCurlyBracketKeyword_12_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Project__Group_12__3


    // $ANTLR start rule__Project__Group_13__0
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1077:1: rule__Project__Group_13__0 : ( 'plugins' ) rule__Project__Group_13__1 ;
    public final void rule__Project__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1081:1: ( ( 'plugins' ) rule__Project__Group_13__1 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1082:1: ( 'plugins' ) rule__Project__Group_13__1
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1082:1: ( 'plugins' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1083:1: 'plugins'
            {
             before(grammarAccess.getProjectAccess().getPluginsKeyword_13_0()); 
            match(input,24,FOLLOW_24_in_rule__Project__Group_13__02151); 
             after(grammarAccess.getProjectAccess().getPluginsKeyword_13_0()); 

            }

            pushFollow(FOLLOW_rule__Project__Group_13__1_in_rule__Project__Group_13__02161);
            rule__Project__Group_13__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Project__Group_13__0


    // $ANTLR start rule__Project__Group_13__1
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1097:1: rule__Project__Group_13__1 : ( '{' ) rule__Project__Group_13__2 ;
    public final void rule__Project__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1101:1: ( ( '{' ) rule__Project__Group_13__2 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1102:1: ( '{' ) rule__Project__Group_13__2
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1102:1: ( '{' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1103:1: '{'
            {
             before(grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_13_1()); 
            match(input,16,FOLLOW_16_in_rule__Project__Group_13__12190); 
             after(grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_13_1()); 

            }

            pushFollow(FOLLOW_rule__Project__Group_13__2_in_rule__Project__Group_13__12200);
            rule__Project__Group_13__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Project__Group_13__1


    // $ANTLR start rule__Project__Group_13__2
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1117:1: rule__Project__Group_13__2 : ( ( rule__Project__PluginsAssignment_13_2 )* ) rule__Project__Group_13__3 ;
    public final void rule__Project__Group_13__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1121:1: ( ( ( rule__Project__PluginsAssignment_13_2 )* ) rule__Project__Group_13__3 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1122:1: ( ( rule__Project__PluginsAssignment_13_2 )* ) rule__Project__Group_13__3
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1122:1: ( ( rule__Project__PluginsAssignment_13_2 )* )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1123:1: ( rule__Project__PluginsAssignment_13_2 )*
            {
             before(grammarAccess.getProjectAccess().getPluginsAssignment_13_2()); 
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1124:1: ( rule__Project__PluginsAssignment_13_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==17) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1124:2: rule__Project__PluginsAssignment_13_2
            	    {
            	    pushFollow(FOLLOW_rule__Project__PluginsAssignment_13_2_in_rule__Project__Group_13__22228);
            	    rule__Project__PluginsAssignment_13_2();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getProjectAccess().getPluginsAssignment_13_2()); 

            }

            pushFollow(FOLLOW_rule__Project__Group_13__3_in_rule__Project__Group_13__22238);
            rule__Project__Group_13__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Project__Group_13__2


    // $ANTLR start rule__Project__Group_13__3
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1135:1: rule__Project__Group_13__3 : ( '}' ) ;
    public final void rule__Project__Group_13__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1139:1: ( ( '}' ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1140:1: ( '}' )
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1140:1: ( '}' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1141:1: '}'
            {
             before(grammarAccess.getProjectAccess().getRightCurlyBracketKeyword_13_3()); 
            match(input,21,FOLLOW_21_in_rule__Project__Group_13__32267); 
             after(grammarAccess.getProjectAccess().getRightCurlyBracketKeyword_13_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Project__Group_13__3


    // $ANTLR start rule__Project__Group_14__0
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1162:1: rule__Project__Group_14__0 : ( 'extensions' ) rule__Project__Group_14__1 ;
    public final void rule__Project__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1166:1: ( ( 'extensions' ) rule__Project__Group_14__1 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1167:1: ( 'extensions' ) rule__Project__Group_14__1
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1167:1: ( 'extensions' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1168:1: 'extensions'
            {
             before(grammarAccess.getProjectAccess().getExtensionsKeyword_14_0()); 
            match(input,25,FOLLOW_25_in_rule__Project__Group_14__02311); 
             after(grammarAccess.getProjectAccess().getExtensionsKeyword_14_0()); 

            }

            pushFollow(FOLLOW_rule__Project__Group_14__1_in_rule__Project__Group_14__02321);
            rule__Project__Group_14__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Project__Group_14__0


    // $ANTLR start rule__Project__Group_14__1
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1182:1: rule__Project__Group_14__1 : ( '{' ) rule__Project__Group_14__2 ;
    public final void rule__Project__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1186:1: ( ( '{' ) rule__Project__Group_14__2 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1187:1: ( '{' ) rule__Project__Group_14__2
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1187:1: ( '{' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1188:1: '{'
            {
             before(grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_14_1()); 
            match(input,16,FOLLOW_16_in_rule__Project__Group_14__12350); 
             after(grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_14_1()); 

            }

            pushFollow(FOLLOW_rule__Project__Group_14__2_in_rule__Project__Group_14__12360);
            rule__Project__Group_14__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Project__Group_14__1


    // $ANTLR start rule__Project__Group_14__2
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1202:1: rule__Project__Group_14__2 : ( ( rule__Project__ExtensionsAssignment_14_2 )* ) rule__Project__Group_14__3 ;
    public final void rule__Project__Group_14__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1206:1: ( ( ( rule__Project__ExtensionsAssignment_14_2 )* ) rule__Project__Group_14__3 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1207:1: ( ( rule__Project__ExtensionsAssignment_14_2 )* ) rule__Project__Group_14__3
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1207:1: ( ( rule__Project__ExtensionsAssignment_14_2 )* )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1208:1: ( rule__Project__ExtensionsAssignment_14_2 )*
            {
             before(grammarAccess.getProjectAccess().getExtensionsAssignment_14_2()); 
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1209:1: ( rule__Project__ExtensionsAssignment_14_2 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==17) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1209:2: rule__Project__ExtensionsAssignment_14_2
            	    {
            	    pushFollow(FOLLOW_rule__Project__ExtensionsAssignment_14_2_in_rule__Project__Group_14__22388);
            	    rule__Project__ExtensionsAssignment_14_2();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getProjectAccess().getExtensionsAssignment_14_2()); 

            }

            pushFollow(FOLLOW_rule__Project__Group_14__3_in_rule__Project__Group_14__22398);
            rule__Project__Group_14__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Project__Group_14__2


    // $ANTLR start rule__Project__Group_14__3
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1220:1: rule__Project__Group_14__3 : ( '}' ) ;
    public final void rule__Project__Group_14__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1224:1: ( ( '}' ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1225:1: ( '}' )
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1225:1: ( '}' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1226:1: '}'
            {
             before(grammarAccess.getProjectAccess().getRightCurlyBracketKeyword_14_3()); 
            match(input,21,FOLLOW_21_in_rule__Project__Group_14__32427); 
             after(grammarAccess.getProjectAccess().getRightCurlyBracketKeyword_14_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Project__Group_14__3


    // $ANTLR start rule__GA__Group__0
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1247:1: rule__GA__Group__0 : ( 'groupId' ) rule__GA__Group__1 ;
    public final void rule__GA__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1251:1: ( ( 'groupId' ) rule__GA__Group__1 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1252:1: ( 'groupId' ) rule__GA__Group__1
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1252:1: ( 'groupId' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1253:1: 'groupId'
            {
             before(grammarAccess.getGAAccess().getGroupIdKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__GA__Group__02471); 
             after(grammarAccess.getGAAccess().getGroupIdKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__GA__Group__1_in_rule__GA__Group__02481);
            rule__GA__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__GA__Group__0


    // $ANTLR start rule__GA__Group__1
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1267:1: rule__GA__Group__1 : ( ':' ) rule__GA__Group__2 ;
    public final void rule__GA__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1271:1: ( ( ':' ) rule__GA__Group__2 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1272:1: ( ':' ) rule__GA__Group__2
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1272:1: ( ':' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1273:1: ':'
            {
             before(grammarAccess.getGAAccess().getColonKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__GA__Group__12510); 
             after(grammarAccess.getGAAccess().getColonKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__GA__Group__2_in_rule__GA__Group__12520);
            rule__GA__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__GA__Group__1


    // $ANTLR start rule__GA__Group__2
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1287:1: rule__GA__Group__2 : ( ( rule__GA__GroupIdAssignment_2 ) ) rule__GA__Group__3 ;
    public final void rule__GA__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1291:1: ( ( ( rule__GA__GroupIdAssignment_2 ) ) rule__GA__Group__3 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1292:1: ( ( rule__GA__GroupIdAssignment_2 ) ) rule__GA__Group__3
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1292:1: ( ( rule__GA__GroupIdAssignment_2 ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1293:1: ( rule__GA__GroupIdAssignment_2 )
            {
             before(grammarAccess.getGAAccess().getGroupIdAssignment_2()); 
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1294:1: ( rule__GA__GroupIdAssignment_2 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1294:2: rule__GA__GroupIdAssignment_2
            {
            pushFollow(FOLLOW_rule__GA__GroupIdAssignment_2_in_rule__GA__Group__22548);
            rule__GA__GroupIdAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getGAAccess().getGroupIdAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__GA__Group__3_in_rule__GA__Group__22557);
            rule__GA__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__GA__Group__2


    // $ANTLR start rule__GA__Group__3
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1305:1: rule__GA__Group__3 : ( ',' ) rule__GA__Group__4 ;
    public final void rule__GA__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1309:1: ( ( ',' ) rule__GA__Group__4 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1310:1: ( ',' ) rule__GA__Group__4
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1310:1: ( ',' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1311:1: ','
            {
             before(grammarAccess.getGAAccess().getCommaKeyword_3()); 
            match(input,26,FOLLOW_26_in_rule__GA__Group__32586); 
             after(grammarAccess.getGAAccess().getCommaKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__GA__Group__4_in_rule__GA__Group__32596);
            rule__GA__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__GA__Group__3


    // $ANTLR start rule__GA__Group__4
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1325:1: rule__GA__Group__4 : ( 'artifactId' ) rule__GA__Group__5 ;
    public final void rule__GA__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1329:1: ( ( 'artifactId' ) rule__GA__Group__5 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1330:1: ( 'artifactId' ) rule__GA__Group__5
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1330:1: ( 'artifactId' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1331:1: 'artifactId'
            {
             before(grammarAccess.getGAAccess().getArtifactIdKeyword_4()); 
            match(input,19,FOLLOW_19_in_rule__GA__Group__42625); 
             after(grammarAccess.getGAAccess().getArtifactIdKeyword_4()); 

            }

            pushFollow(FOLLOW_rule__GA__Group__5_in_rule__GA__Group__42635);
            rule__GA__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__GA__Group__4


    // $ANTLR start rule__GA__Group__5
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1345:1: rule__GA__Group__5 : ( ':' ) rule__GA__Group__6 ;
    public final void rule__GA__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1349:1: ( ( ':' ) rule__GA__Group__6 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1350:1: ( ':' ) rule__GA__Group__6
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1350:1: ( ':' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1351:1: ':'
            {
             before(grammarAccess.getGAAccess().getColonKeyword_5()); 
            match(input,18,FOLLOW_18_in_rule__GA__Group__52664); 
             after(grammarAccess.getGAAccess().getColonKeyword_5()); 

            }

            pushFollow(FOLLOW_rule__GA__Group__6_in_rule__GA__Group__52674);
            rule__GA__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__GA__Group__5


    // $ANTLR start rule__GA__Group__6
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1365:1: rule__GA__Group__6 : ( ( rule__GA__ArtifactIdAssignment_6 ) ) ;
    public final void rule__GA__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1369:1: ( ( ( rule__GA__ArtifactIdAssignment_6 ) ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1370:1: ( ( rule__GA__ArtifactIdAssignment_6 ) )
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1370:1: ( ( rule__GA__ArtifactIdAssignment_6 ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1371:1: ( rule__GA__ArtifactIdAssignment_6 )
            {
             before(grammarAccess.getGAAccess().getArtifactIdAssignment_6()); 
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1372:1: ( rule__GA__ArtifactIdAssignment_6 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1372:2: rule__GA__ArtifactIdAssignment_6
            {
            pushFollow(FOLLOW_rule__GA__ArtifactIdAssignment_6_in_rule__GA__Group__62702);
            rule__GA__ArtifactIdAssignment_6();
            _fsp--;


            }

             after(grammarAccess.getGAAccess().getArtifactIdAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__GA__Group__6


    // $ANTLR start rule__Dependency__Group__0
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1396:1: rule__Dependency__Group__0 : ( 'groupId' ) rule__Dependency__Group__1 ;
    public final void rule__Dependency__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1400:1: ( ( 'groupId' ) rule__Dependency__Group__1 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1401:1: ( 'groupId' ) rule__Dependency__Group__1
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1401:1: ( 'groupId' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1402:1: 'groupId'
            {
             before(grammarAccess.getDependencyAccess().getGroupIdKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Dependency__Group__02751); 
             after(grammarAccess.getDependencyAccess().getGroupIdKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Dependency__Group__1_in_rule__Dependency__Group__02761);
            rule__Dependency__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Dependency__Group__0


    // $ANTLR start rule__Dependency__Group__1
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1416:1: rule__Dependency__Group__1 : ( ':' ) rule__Dependency__Group__2 ;
    public final void rule__Dependency__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1420:1: ( ( ':' ) rule__Dependency__Group__2 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1421:1: ( ':' ) rule__Dependency__Group__2
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1421:1: ( ':' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1422:1: ':'
            {
             before(grammarAccess.getDependencyAccess().getColonKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__Dependency__Group__12790); 
             after(grammarAccess.getDependencyAccess().getColonKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__Dependency__Group__2_in_rule__Dependency__Group__12800);
            rule__Dependency__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Dependency__Group__1


    // $ANTLR start rule__Dependency__Group__2
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1436:1: rule__Dependency__Group__2 : ( ( rule__Dependency__GroupIdAssignment_2 ) ) rule__Dependency__Group__3 ;
    public final void rule__Dependency__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1440:1: ( ( ( rule__Dependency__GroupIdAssignment_2 ) ) rule__Dependency__Group__3 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1441:1: ( ( rule__Dependency__GroupIdAssignment_2 ) ) rule__Dependency__Group__3
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1441:1: ( ( rule__Dependency__GroupIdAssignment_2 ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1442:1: ( rule__Dependency__GroupIdAssignment_2 )
            {
             before(grammarAccess.getDependencyAccess().getGroupIdAssignment_2()); 
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1443:1: ( rule__Dependency__GroupIdAssignment_2 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1443:2: rule__Dependency__GroupIdAssignment_2
            {
            pushFollow(FOLLOW_rule__Dependency__GroupIdAssignment_2_in_rule__Dependency__Group__22828);
            rule__Dependency__GroupIdAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getDependencyAccess().getGroupIdAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__Dependency__Group__3_in_rule__Dependency__Group__22837);
            rule__Dependency__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Dependency__Group__2


    // $ANTLR start rule__Dependency__Group__3
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1454:1: rule__Dependency__Group__3 : ( ',' ) rule__Dependency__Group__4 ;
    public final void rule__Dependency__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1458:1: ( ( ',' ) rule__Dependency__Group__4 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1459:1: ( ',' ) rule__Dependency__Group__4
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1459:1: ( ',' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1460:1: ','
            {
             before(grammarAccess.getDependencyAccess().getCommaKeyword_3()); 
            match(input,26,FOLLOW_26_in_rule__Dependency__Group__32866); 
             after(grammarAccess.getDependencyAccess().getCommaKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__Dependency__Group__4_in_rule__Dependency__Group__32876);
            rule__Dependency__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Dependency__Group__3


    // $ANTLR start rule__Dependency__Group__4
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1474:1: rule__Dependency__Group__4 : ( 'artifactId' ) rule__Dependency__Group__5 ;
    public final void rule__Dependency__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1478:1: ( ( 'artifactId' ) rule__Dependency__Group__5 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1479:1: ( 'artifactId' ) rule__Dependency__Group__5
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1479:1: ( 'artifactId' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1480:1: 'artifactId'
            {
             before(grammarAccess.getDependencyAccess().getArtifactIdKeyword_4()); 
            match(input,19,FOLLOW_19_in_rule__Dependency__Group__42905); 
             after(grammarAccess.getDependencyAccess().getArtifactIdKeyword_4()); 

            }

            pushFollow(FOLLOW_rule__Dependency__Group__5_in_rule__Dependency__Group__42915);
            rule__Dependency__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Dependency__Group__4


    // $ANTLR start rule__Dependency__Group__5
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1494:1: rule__Dependency__Group__5 : ( ':' ) rule__Dependency__Group__6 ;
    public final void rule__Dependency__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1498:1: ( ( ':' ) rule__Dependency__Group__6 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1499:1: ( ':' ) rule__Dependency__Group__6
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1499:1: ( ':' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1500:1: ':'
            {
             before(grammarAccess.getDependencyAccess().getColonKeyword_5()); 
            match(input,18,FOLLOW_18_in_rule__Dependency__Group__52944); 
             after(grammarAccess.getDependencyAccess().getColonKeyword_5()); 

            }

            pushFollow(FOLLOW_rule__Dependency__Group__6_in_rule__Dependency__Group__52954);
            rule__Dependency__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Dependency__Group__5


    // $ANTLR start rule__Dependency__Group__6
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1514:1: rule__Dependency__Group__6 : ( ( rule__Dependency__ArtifactIdAssignment_6 ) ) rule__Dependency__Group__7 ;
    public final void rule__Dependency__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1518:1: ( ( ( rule__Dependency__ArtifactIdAssignment_6 ) ) rule__Dependency__Group__7 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1519:1: ( ( rule__Dependency__ArtifactIdAssignment_6 ) ) rule__Dependency__Group__7
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1519:1: ( ( rule__Dependency__ArtifactIdAssignment_6 ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1520:1: ( rule__Dependency__ArtifactIdAssignment_6 )
            {
             before(grammarAccess.getDependencyAccess().getArtifactIdAssignment_6()); 
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1521:1: ( rule__Dependency__ArtifactIdAssignment_6 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1521:2: rule__Dependency__ArtifactIdAssignment_6
            {
            pushFollow(FOLLOW_rule__Dependency__ArtifactIdAssignment_6_in_rule__Dependency__Group__62982);
            rule__Dependency__ArtifactIdAssignment_6();
            _fsp--;


            }

             after(grammarAccess.getDependencyAccess().getArtifactIdAssignment_6()); 

            }

            pushFollow(FOLLOW_rule__Dependency__Group__7_in_rule__Dependency__Group__62991);
            rule__Dependency__Group__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Dependency__Group__6


    // $ANTLR start rule__Dependency__Group__7
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1532:1: rule__Dependency__Group__7 : ( ',' ) rule__Dependency__Group__8 ;
    public final void rule__Dependency__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1536:1: ( ( ',' ) rule__Dependency__Group__8 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1537:1: ( ',' ) rule__Dependency__Group__8
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1537:1: ( ',' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1538:1: ','
            {
             before(grammarAccess.getDependencyAccess().getCommaKeyword_7()); 
            match(input,26,FOLLOW_26_in_rule__Dependency__Group__73020); 
             after(grammarAccess.getDependencyAccess().getCommaKeyword_7()); 

            }

            pushFollow(FOLLOW_rule__Dependency__Group__8_in_rule__Dependency__Group__73030);
            rule__Dependency__Group__8();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Dependency__Group__7


    // $ANTLR start rule__Dependency__Group__8
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1552:1: rule__Dependency__Group__8 : ( 'version' ) rule__Dependency__Group__9 ;
    public final void rule__Dependency__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1556:1: ( ( 'version' ) rule__Dependency__Group__9 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1557:1: ( 'version' ) rule__Dependency__Group__9
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1557:1: ( 'version' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1558:1: 'version'
            {
             before(grammarAccess.getDependencyAccess().getVersionKeyword_8()); 
            match(input,20,FOLLOW_20_in_rule__Dependency__Group__83059); 
             after(grammarAccess.getDependencyAccess().getVersionKeyword_8()); 

            }

            pushFollow(FOLLOW_rule__Dependency__Group__9_in_rule__Dependency__Group__83069);
            rule__Dependency__Group__9();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Dependency__Group__8


    // $ANTLR start rule__Dependency__Group__9
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1572:1: rule__Dependency__Group__9 : ( ':' ) rule__Dependency__Group__10 ;
    public final void rule__Dependency__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1576:1: ( ( ':' ) rule__Dependency__Group__10 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1577:1: ( ':' ) rule__Dependency__Group__10
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1577:1: ( ':' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1578:1: ':'
            {
             before(grammarAccess.getDependencyAccess().getColonKeyword_9()); 
            match(input,18,FOLLOW_18_in_rule__Dependency__Group__93098); 
             after(grammarAccess.getDependencyAccess().getColonKeyword_9()); 

            }

            pushFollow(FOLLOW_rule__Dependency__Group__10_in_rule__Dependency__Group__93108);
            rule__Dependency__Group__10();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Dependency__Group__9


    // $ANTLR start rule__Dependency__Group__10
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1592:1: rule__Dependency__Group__10 : ( ( rule__Dependency__VersionAssignment_10 ) ) rule__Dependency__Group__11 ;
    public final void rule__Dependency__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1596:1: ( ( ( rule__Dependency__VersionAssignment_10 ) ) rule__Dependency__Group__11 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1597:1: ( ( rule__Dependency__VersionAssignment_10 ) ) rule__Dependency__Group__11
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1597:1: ( ( rule__Dependency__VersionAssignment_10 ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1598:1: ( rule__Dependency__VersionAssignment_10 )
            {
             before(grammarAccess.getDependencyAccess().getVersionAssignment_10()); 
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1599:1: ( rule__Dependency__VersionAssignment_10 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1599:2: rule__Dependency__VersionAssignment_10
            {
            pushFollow(FOLLOW_rule__Dependency__VersionAssignment_10_in_rule__Dependency__Group__103136);
            rule__Dependency__VersionAssignment_10();
            _fsp--;


            }

             after(grammarAccess.getDependencyAccess().getVersionAssignment_10()); 

            }

            pushFollow(FOLLOW_rule__Dependency__Group__11_in_rule__Dependency__Group__103145);
            rule__Dependency__Group__11();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Dependency__Group__10


    // $ANTLR start rule__Dependency__Group__11
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1610:1: rule__Dependency__Group__11 : ( ( rule__Dependency__Alternatives_11 )? ) rule__Dependency__Group__12 ;
    public final void rule__Dependency__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1614:1: ( ( ( rule__Dependency__Alternatives_11 )? ) rule__Dependency__Group__12 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1615:1: ( ( rule__Dependency__Alternatives_11 )? ) rule__Dependency__Group__12
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1615:1: ( ( rule__Dependency__Alternatives_11 )? )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1616:1: ( rule__Dependency__Alternatives_11 )?
            {
             before(grammarAccess.getDependencyAccess().getAlternatives_11()); 
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1617:1: ( rule__Dependency__Alternatives_11 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==12) ) {
                    alt16=1;
                }
            }
            else if ( (LA16_0==11) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1617:2: rule__Dependency__Alternatives_11
                    {
                    pushFollow(FOLLOW_rule__Dependency__Alternatives_11_in_rule__Dependency__Group__113173);
                    rule__Dependency__Alternatives_11();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDependencyAccess().getAlternatives_11()); 

            }

            pushFollow(FOLLOW_rule__Dependency__Group__12_in_rule__Dependency__Group__113183);
            rule__Dependency__Group__12();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Dependency__Group__11


    // $ANTLR start rule__Dependency__Group__12
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1628:1: rule__Dependency__Group__12 : ( ( rule__Dependency__Group_12__0 )? ) rule__Dependency__Group__13 ;
    public final void rule__Dependency__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1632:1: ( ( ( rule__Dependency__Group_12__0 )? ) rule__Dependency__Group__13 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1633:1: ( ( rule__Dependency__Group_12__0 )? ) rule__Dependency__Group__13
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1633:1: ( ( rule__Dependency__Group_12__0 )? )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1634:1: ( rule__Dependency__Group_12__0 )?
            {
             before(grammarAccess.getDependencyAccess().getGroup_12()); 
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1635:1: ( rule__Dependency__Group_12__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==26) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==27) ) {
                    alt17=1;
                }
            }
            switch (alt17) {
                case 1 :
                    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1635:2: rule__Dependency__Group_12__0
                    {
                    pushFollow(FOLLOW_rule__Dependency__Group_12__0_in_rule__Dependency__Group__123211);
                    rule__Dependency__Group_12__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDependencyAccess().getGroup_12()); 

            }

            pushFollow(FOLLOW_rule__Dependency__Group__13_in_rule__Dependency__Group__123221);
            rule__Dependency__Group__13();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Dependency__Group__12


    // $ANTLR start rule__Dependency__Group__13
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1646:1: rule__Dependency__Group__13 : ( ( rule__Dependency__Group_13__0 )? ) rule__Dependency__Group__14 ;
    public final void rule__Dependency__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1650:1: ( ( ( rule__Dependency__Group_13__0 )? ) rule__Dependency__Group__14 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1651:1: ( ( rule__Dependency__Group_13__0 )? ) rule__Dependency__Group__14
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1651:1: ( ( rule__Dependency__Group_13__0 )? )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1652:1: ( rule__Dependency__Group_13__0 )?
            {
             before(grammarAccess.getDependencyAccess().getGroup_13()); 
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1653:1: ( rule__Dependency__Group_13__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==26) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==28) ) {
                    alt18=1;
                }
            }
            switch (alt18) {
                case 1 :
                    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1653:2: rule__Dependency__Group_13__0
                    {
                    pushFollow(FOLLOW_rule__Dependency__Group_13__0_in_rule__Dependency__Group__133249);
                    rule__Dependency__Group_13__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDependencyAccess().getGroup_13()); 

            }

            pushFollow(FOLLOW_rule__Dependency__Group__14_in_rule__Dependency__Group__133259);
            rule__Dependency__Group__14();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Dependency__Group__13


    // $ANTLR start rule__Dependency__Group__14
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1664:1: rule__Dependency__Group__14 : ( ( rule__Dependency__Group_14__0 )? ) rule__Dependency__Group__15 ;
    public final void rule__Dependency__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1668:1: ( ( ( rule__Dependency__Group_14__0 )? ) rule__Dependency__Group__15 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1669:1: ( ( rule__Dependency__Group_14__0 )? ) rule__Dependency__Group__15
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1669:1: ( ( rule__Dependency__Group_14__0 )? )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1670:1: ( rule__Dependency__Group_14__0 )?
            {
             before(grammarAccess.getDependencyAccess().getGroup_14()); 
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1671:1: ( rule__Dependency__Group_14__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==26) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==29) ) {
                    alt19=1;
                }
            }
            switch (alt19) {
                case 1 :
                    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1671:2: rule__Dependency__Group_14__0
                    {
                    pushFollow(FOLLOW_rule__Dependency__Group_14__0_in_rule__Dependency__Group__143287);
                    rule__Dependency__Group_14__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDependencyAccess().getGroup_14()); 

            }

            pushFollow(FOLLOW_rule__Dependency__Group__15_in_rule__Dependency__Group__143297);
            rule__Dependency__Group__15();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Dependency__Group__14


    // $ANTLR start rule__Dependency__Group__15
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1682:1: rule__Dependency__Group__15 : ( ( rule__Dependency__Group_15__0 )? ) ;
    public final void rule__Dependency__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1686:1: ( ( ( rule__Dependency__Group_15__0 )? ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1687:1: ( ( rule__Dependency__Group_15__0 )? )
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1687:1: ( ( rule__Dependency__Group_15__0 )? )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1688:1: ( rule__Dependency__Group_15__0 )?
            {
             before(grammarAccess.getDependencyAccess().getGroup_15()); 
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1689:1: ( rule__Dependency__Group_15__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==26) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1689:2: rule__Dependency__Group_15__0
                    {
                    pushFollow(FOLLOW_rule__Dependency__Group_15__0_in_rule__Dependency__Group__153325);
                    rule__Dependency__Group_15__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDependencyAccess().getGroup_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Dependency__Group__15


    // $ANTLR start rule__Dependency__Group_11_0__0
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1731:1: rule__Dependency__Group_11_0__0 : ( ',' ) rule__Dependency__Group_11_0__1 ;
    public final void rule__Dependency__Group_11_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1735:1: ( ( ',' ) rule__Dependency__Group_11_0__1 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1736:1: ( ',' ) rule__Dependency__Group_11_0__1
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1736:1: ( ',' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1737:1: ','
            {
             before(grammarAccess.getDependencyAccess().getCommaKeyword_11_0_0()); 
            match(input,26,FOLLOW_26_in_rule__Dependency__Group_11_0__03393); 
             after(grammarAccess.getDependencyAccess().getCommaKeyword_11_0_0()); 

            }

            pushFollow(FOLLOW_rule__Dependency__Group_11_0__1_in_rule__Dependency__Group_11_0__03403);
            rule__Dependency__Group_11_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Dependency__Group_11_0__0


    // $ANTLR start rule__Dependency__Group_11_0__1
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1751:1: rule__Dependency__Group_11_0__1 : ( 'path' ) ;
    public final void rule__Dependency__Group_11_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1755:1: ( ( 'path' ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1756:1: ( 'path' )
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1756:1: ( 'path' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1757:1: 'path'
            {
             before(grammarAccess.getDependencyAccess().getPathKeyword_11_0_1()); 
            match(input,12,FOLLOW_12_in_rule__Dependency__Group_11_0__13432); 
             after(grammarAccess.getDependencyAccess().getPathKeyword_11_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Dependency__Group_11_0__1


    // $ANTLR start rule__Dependency__Group_12__0
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1774:1: rule__Dependency__Group_12__0 : ( ',' ) rule__Dependency__Group_12__1 ;
    public final void rule__Dependency__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1778:1: ( ( ',' ) rule__Dependency__Group_12__1 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1779:1: ( ',' ) rule__Dependency__Group_12__1
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1779:1: ( ',' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1780:1: ','
            {
             before(grammarAccess.getDependencyAccess().getCommaKeyword_12_0()); 
            match(input,26,FOLLOW_26_in_rule__Dependency__Group_12__03472); 
             after(grammarAccess.getDependencyAccess().getCommaKeyword_12_0()); 

            }

            pushFollow(FOLLOW_rule__Dependency__Group_12__1_in_rule__Dependency__Group_12__03482);
            rule__Dependency__Group_12__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Dependency__Group_12__0


    // $ANTLR start rule__Dependency__Group_12__1
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1794:1: rule__Dependency__Group_12__1 : ( 'scope' ) ;
    public final void rule__Dependency__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1798:1: ( ( 'scope' ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1799:1: ( 'scope' )
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1799:1: ( 'scope' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1800:1: 'scope'
            {
             before(grammarAccess.getDependencyAccess().getScopeKeyword_12_1()); 
            match(input,27,FOLLOW_27_in_rule__Dependency__Group_12__13511); 
             after(grammarAccess.getDependencyAccess().getScopeKeyword_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Dependency__Group_12__1


    // $ANTLR start rule__Dependency__Group_13__0
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1817:1: rule__Dependency__Group_13__0 : ( ',' ) rule__Dependency__Group_13__1 ;
    public final void rule__Dependency__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1821:1: ( ( ',' ) rule__Dependency__Group_13__1 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1822:1: ( ',' ) rule__Dependency__Group_13__1
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1822:1: ( ',' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1823:1: ','
            {
             before(grammarAccess.getDependencyAccess().getCommaKeyword_13_0()); 
            match(input,26,FOLLOW_26_in_rule__Dependency__Group_13__03551); 
             after(grammarAccess.getDependencyAccess().getCommaKeyword_13_0()); 

            }

            pushFollow(FOLLOW_rule__Dependency__Group_13__1_in_rule__Dependency__Group_13__03561);
            rule__Dependency__Group_13__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Dependency__Group_13__0


    // $ANTLR start rule__Dependency__Group_13__1
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1837:1: rule__Dependency__Group_13__1 : ( 'classifier' ) ;
    public final void rule__Dependency__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1841:1: ( ( 'classifier' ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1842:1: ( 'classifier' )
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1842:1: ( 'classifier' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1843:1: 'classifier'
            {
             before(grammarAccess.getDependencyAccess().getClassifierKeyword_13_1()); 
            match(input,28,FOLLOW_28_in_rule__Dependency__Group_13__13590); 
             after(grammarAccess.getDependencyAccess().getClassifierKeyword_13_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Dependency__Group_13__1


    // $ANTLR start rule__Dependency__Group_14__0
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1860:1: rule__Dependency__Group_14__0 : ( ',' ) rule__Dependency__Group_14__1 ;
    public final void rule__Dependency__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1864:1: ( ( ',' ) rule__Dependency__Group_14__1 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1865:1: ( ',' ) rule__Dependency__Group_14__1
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1865:1: ( ',' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1866:1: ','
            {
             before(grammarAccess.getDependencyAccess().getCommaKeyword_14_0()); 
            match(input,26,FOLLOW_26_in_rule__Dependency__Group_14__03630); 
             after(grammarAccess.getDependencyAccess().getCommaKeyword_14_0()); 

            }

            pushFollow(FOLLOW_rule__Dependency__Group_14__1_in_rule__Dependency__Group_14__03640);
            rule__Dependency__Group_14__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Dependency__Group_14__0


    // $ANTLR start rule__Dependency__Group_14__1
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1880:1: rule__Dependency__Group_14__1 : ( 'type' ) ;
    public final void rule__Dependency__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1884:1: ( ( 'type' ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1885:1: ( 'type' )
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1885:1: ( 'type' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1886:1: 'type'
            {
             before(grammarAccess.getDependencyAccess().getTypeKeyword_14_1()); 
            match(input,29,FOLLOW_29_in_rule__Dependency__Group_14__13669); 
             after(grammarAccess.getDependencyAccess().getTypeKeyword_14_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Dependency__Group_14__1


    // $ANTLR start rule__Dependency__Group_15__0
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1903:1: rule__Dependency__Group_15__0 : ( ',' ) rule__Dependency__Group_15__1 ;
    public final void rule__Dependency__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1907:1: ( ( ',' ) rule__Dependency__Group_15__1 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1908:1: ( ',' ) rule__Dependency__Group_15__1
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1908:1: ( ',' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1909:1: ','
            {
             before(grammarAccess.getDependencyAccess().getCommaKeyword_15_0()); 
            match(input,26,FOLLOW_26_in_rule__Dependency__Group_15__03709); 
             after(grammarAccess.getDependencyAccess().getCommaKeyword_15_0()); 

            }

            pushFollow(FOLLOW_rule__Dependency__Group_15__1_in_rule__Dependency__Group_15__03719);
            rule__Dependency__Group_15__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Dependency__Group_15__0


    // $ANTLR start rule__Dependency__Group_15__1
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1923:1: rule__Dependency__Group_15__1 : ( 'exclusions' ) rule__Dependency__Group_15__2 ;
    public final void rule__Dependency__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1927:1: ( ( 'exclusions' ) rule__Dependency__Group_15__2 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1928:1: ( 'exclusions' ) rule__Dependency__Group_15__2
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1928:1: ( 'exclusions' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1929:1: 'exclusions'
            {
             before(grammarAccess.getDependencyAccess().getExclusionsKeyword_15_1()); 
            match(input,30,FOLLOW_30_in_rule__Dependency__Group_15__13748); 
             after(grammarAccess.getDependencyAccess().getExclusionsKeyword_15_1()); 

            }

            pushFollow(FOLLOW_rule__Dependency__Group_15__2_in_rule__Dependency__Group_15__13758);
            rule__Dependency__Group_15__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Dependency__Group_15__1


    // $ANTLR start rule__Dependency__Group_15__2
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1943:1: rule__Dependency__Group_15__2 : ( '{' ) rule__Dependency__Group_15__3 ;
    public final void rule__Dependency__Group_15__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1947:1: ( ( '{' ) rule__Dependency__Group_15__3 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1948:1: ( '{' ) rule__Dependency__Group_15__3
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1948:1: ( '{' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1949:1: '{'
            {
             before(grammarAccess.getDependencyAccess().getLeftCurlyBracketKeyword_15_2()); 
            match(input,16,FOLLOW_16_in_rule__Dependency__Group_15__23787); 
             after(grammarAccess.getDependencyAccess().getLeftCurlyBracketKeyword_15_2()); 

            }

            pushFollow(FOLLOW_rule__Dependency__Group_15__3_in_rule__Dependency__Group_15__23797);
            rule__Dependency__Group_15__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Dependency__Group_15__2


    // $ANTLR start rule__Dependency__Group_15__3
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1963:1: rule__Dependency__Group_15__3 : ( ( rule__Dependency__ExclusionsAssignment_15_3 )* ) rule__Dependency__Group_15__4 ;
    public final void rule__Dependency__Group_15__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1967:1: ( ( ( rule__Dependency__ExclusionsAssignment_15_3 )* ) rule__Dependency__Group_15__4 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1968:1: ( ( rule__Dependency__ExclusionsAssignment_15_3 )* ) rule__Dependency__Group_15__4
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1968:1: ( ( rule__Dependency__ExclusionsAssignment_15_3 )* )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1969:1: ( rule__Dependency__ExclusionsAssignment_15_3 )*
            {
             before(grammarAccess.getDependencyAccess().getExclusionsAssignment_15_3()); 
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1970:1: ( rule__Dependency__ExclusionsAssignment_15_3 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==17) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1970:2: rule__Dependency__ExclusionsAssignment_15_3
            	    {
            	    pushFollow(FOLLOW_rule__Dependency__ExclusionsAssignment_15_3_in_rule__Dependency__Group_15__33825);
            	    rule__Dependency__ExclusionsAssignment_15_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getDependencyAccess().getExclusionsAssignment_15_3()); 

            }

            pushFollow(FOLLOW_rule__Dependency__Group_15__4_in_rule__Dependency__Group_15__33835);
            rule__Dependency__Group_15__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Dependency__Group_15__3


    // $ANTLR start rule__Dependency__Group_15__4
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1981:1: rule__Dependency__Group_15__4 : ( '}' ) ;
    public final void rule__Dependency__Group_15__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1985:1: ( ( '}' ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1986:1: ( '}' )
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1986:1: ( '}' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:1987:1: '}'
            {
             before(grammarAccess.getDependencyAccess().getRightCurlyBracketKeyword_15_4()); 
            match(input,21,FOLLOW_21_in_rule__Dependency__Group_15__43864); 
             after(grammarAccess.getDependencyAccess().getRightCurlyBracketKeyword_15_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Dependency__Group_15__4


    // $ANTLR start rule__MappedDependency__Group__0
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2010:1: rule__MappedDependency__Group__0 : ( ( rule__MappedDependency__Alternatives_0 ) ) rule__MappedDependency__Group__1 ;
    public final void rule__MappedDependency__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2014:1: ( ( ( rule__MappedDependency__Alternatives_0 ) ) rule__MappedDependency__Group__1 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2015:1: ( ( rule__MappedDependency__Alternatives_0 ) ) rule__MappedDependency__Group__1
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2015:1: ( ( rule__MappedDependency__Alternatives_0 ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2016:1: ( rule__MappedDependency__Alternatives_0 )
            {
             before(grammarAccess.getMappedDependencyAccess().getAlternatives_0()); 
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2017:1: ( rule__MappedDependency__Alternatives_0 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2017:2: rule__MappedDependency__Alternatives_0
            {
            pushFollow(FOLLOW_rule__MappedDependency__Alternatives_0_in_rule__MappedDependency__Group__03909);
            rule__MappedDependency__Alternatives_0();
            _fsp--;


            }

             after(grammarAccess.getMappedDependencyAccess().getAlternatives_0()); 

            }

            pushFollow(FOLLOW_rule__MappedDependency__Group__1_in_rule__MappedDependency__Group__03918);
            rule__MappedDependency__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MappedDependency__Group__0


    // $ANTLR start rule__MappedDependency__Group__1
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2028:1: rule__MappedDependency__Group__1 : ( ':' ) rule__MappedDependency__Group__2 ;
    public final void rule__MappedDependency__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2032:1: ( ( ':' ) rule__MappedDependency__Group__2 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2033:1: ( ':' ) rule__MappedDependency__Group__2
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2033:1: ( ':' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2034:1: ':'
            {
             before(grammarAccess.getMappedDependencyAccess().getColonKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__MappedDependency__Group__13947); 
             after(grammarAccess.getMappedDependencyAccess().getColonKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__MappedDependency__Group__2_in_rule__MappedDependency__Group__13957);
            rule__MappedDependency__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MappedDependency__Group__1


    // $ANTLR start rule__MappedDependency__Group__2
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2048:1: rule__MappedDependency__Group__2 : ( RULE_STRING ) rule__MappedDependency__Group__3 ;
    public final void rule__MappedDependency__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2052:1: ( ( RULE_STRING ) rule__MappedDependency__Group__3 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2053:1: ( RULE_STRING ) rule__MappedDependency__Group__3
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2053:1: ( RULE_STRING )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2054:1: RULE_STRING
            {
             before(grammarAccess.getMappedDependencyAccess().getSTRINGTerminalRuleCall_2()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MappedDependency__Group__23985); 
             after(grammarAccess.getMappedDependencyAccess().getSTRINGTerminalRuleCall_2()); 

            }

            pushFollow(FOLLOW_rule__MappedDependency__Group__3_in_rule__MappedDependency__Group__23993);
            rule__MappedDependency__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MappedDependency__Group__2


    // $ANTLR start rule__MappedDependency__Group__3
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2066:1: rule__MappedDependency__Group__3 : ( ( rule__MappedDependency__Group_3__0 )? ) rule__MappedDependency__Group__4 ;
    public final void rule__MappedDependency__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2070:1: ( ( ( rule__MappedDependency__Group_3__0 )? ) rule__MappedDependency__Group__4 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2071:1: ( ( rule__MappedDependency__Group_3__0 )? ) rule__MappedDependency__Group__4
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2071:1: ( ( rule__MappedDependency__Group_3__0 )? )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2072:1: ( rule__MappedDependency__Group_3__0 )?
            {
             before(grammarAccess.getMappedDependencyAccess().getGroup_3()); 
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2073:1: ( rule__MappedDependency__Group_3__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==26) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==31) ) {
                    alt22=1;
                }
            }
            switch (alt22) {
                case 1 :
                    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2073:2: rule__MappedDependency__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__MappedDependency__Group_3__0_in_rule__MappedDependency__Group__34021);
                    rule__MappedDependency__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMappedDependencyAccess().getGroup_3()); 

            }

            pushFollow(FOLLOW_rule__MappedDependency__Group__4_in_rule__MappedDependency__Group__34031);
            rule__MappedDependency__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MappedDependency__Group__3


    // $ANTLR start rule__MappedDependency__Group__4
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2084:1: rule__MappedDependency__Group__4 : ( ( rule__MappedDependency__Group_4__0 )? ) rule__MappedDependency__Group__5 ;
    public final void rule__MappedDependency__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2088:1: ( ( ( rule__MappedDependency__Group_4__0 )? ) rule__MappedDependency__Group__5 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2089:1: ( ( rule__MappedDependency__Group_4__0 )? ) rule__MappedDependency__Group__5
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2089:1: ( ( rule__MappedDependency__Group_4__0 )? )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2090:1: ( rule__MappedDependency__Group_4__0 )?
            {
             before(grammarAccess.getMappedDependencyAccess().getGroup_4()); 
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2091:1: ( rule__MappedDependency__Group_4__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==26) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==17) ) {
                    alt23=1;
                }
            }
            switch (alt23) {
                case 1 :
                    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2091:2: rule__MappedDependency__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__MappedDependency__Group_4__0_in_rule__MappedDependency__Group__44059);
                    rule__MappedDependency__Group_4__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMappedDependencyAccess().getGroup_4()); 

            }

            pushFollow(FOLLOW_rule__MappedDependency__Group__5_in_rule__MappedDependency__Group__44069);
            rule__MappedDependency__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MappedDependency__Group__4


    // $ANTLR start rule__MappedDependency__Group__5
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2102:1: rule__MappedDependency__Group__5 : ( ( rule__MappedDependency__Group_5__0 )? ) rule__MappedDependency__Group__6 ;
    public final void rule__MappedDependency__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2106:1: ( ( ( rule__MappedDependency__Group_5__0 )? ) rule__MappedDependency__Group__6 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2107:1: ( ( rule__MappedDependency__Group_5__0 )? ) rule__MappedDependency__Group__6
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2107:1: ( ( rule__MappedDependency__Group_5__0 )? )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2108:1: ( rule__MappedDependency__Group_5__0 )?
            {
             before(grammarAccess.getMappedDependencyAccess().getGroup_5()); 
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2109:1: ( rule__MappedDependency__Group_5__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==26) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==19) ) {
                    alt24=1;
                }
            }
            switch (alt24) {
                case 1 :
                    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2109:2: rule__MappedDependency__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__MappedDependency__Group_5__0_in_rule__MappedDependency__Group__54097);
                    rule__MappedDependency__Group_5__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMappedDependencyAccess().getGroup_5()); 

            }

            pushFollow(FOLLOW_rule__MappedDependency__Group__6_in_rule__MappedDependency__Group__54107);
            rule__MappedDependency__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MappedDependency__Group__5


    // $ANTLR start rule__MappedDependency__Group__6
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2120:1: rule__MappedDependency__Group__6 : ( ( rule__MappedDependency__Group_6__0 )? ) ;
    public final void rule__MappedDependency__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2124:1: ( ( ( rule__MappedDependency__Group_6__0 )? ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2125:1: ( ( rule__MappedDependency__Group_6__0 )? )
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2125:1: ( ( rule__MappedDependency__Group_6__0 )? )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2126:1: ( rule__MappedDependency__Group_6__0 )?
            {
             before(grammarAccess.getMappedDependencyAccess().getGroup_6()); 
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2127:1: ( rule__MappedDependency__Group_6__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==26) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2127:2: rule__MappedDependency__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__MappedDependency__Group_6__0_in_rule__MappedDependency__Group__64135);
                    rule__MappedDependency__Group_6__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMappedDependencyAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MappedDependency__Group__6


    // $ANTLR start rule__MappedDependency__Group_3__0
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2151:1: rule__MappedDependency__Group_3__0 : ( ',' ) rule__MappedDependency__Group_3__1 ;
    public final void rule__MappedDependency__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2155:1: ( ( ',' ) rule__MappedDependency__Group_3__1 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2156:1: ( ',' ) rule__MappedDependency__Group_3__1
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2156:1: ( ',' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2157:1: ','
            {
             before(grammarAccess.getMappedDependencyAccess().getCommaKeyword_3_0()); 
            match(input,26,FOLLOW_26_in_rule__MappedDependency__Group_3__04185); 
             after(grammarAccess.getMappedDependencyAccess().getCommaKeyword_3_0()); 

            }

            pushFollow(FOLLOW_rule__MappedDependency__Group_3__1_in_rule__MappedDependency__Group_3__04195);
            rule__MappedDependency__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MappedDependency__Group_3__0


    // $ANTLR start rule__MappedDependency__Group_3__1
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2171:1: rule__MappedDependency__Group_3__1 : ( 'exclude' ) rule__MappedDependency__Group_3__2 ;
    public final void rule__MappedDependency__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2175:1: ( ( 'exclude' ) rule__MappedDependency__Group_3__2 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2176:1: ( 'exclude' ) rule__MappedDependency__Group_3__2
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2176:1: ( 'exclude' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2177:1: 'exclude'
            {
             before(grammarAccess.getMappedDependencyAccess().getExcludeKeyword_3_1()); 
            match(input,31,FOLLOW_31_in_rule__MappedDependency__Group_3__14224); 
             after(grammarAccess.getMappedDependencyAccess().getExcludeKeyword_3_1()); 

            }

            pushFollow(FOLLOW_rule__MappedDependency__Group_3__2_in_rule__MappedDependency__Group_3__14234);
            rule__MappedDependency__Group_3__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MappedDependency__Group_3__1


    // $ANTLR start rule__MappedDependency__Group_3__2
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2191:1: rule__MappedDependency__Group_3__2 : ( ':' ) rule__MappedDependency__Group_3__3 ;
    public final void rule__MappedDependency__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2195:1: ( ( ':' ) rule__MappedDependency__Group_3__3 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2196:1: ( ':' ) rule__MappedDependency__Group_3__3
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2196:1: ( ':' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2197:1: ':'
            {
             before(grammarAccess.getMappedDependencyAccess().getColonKeyword_3_2()); 
            match(input,18,FOLLOW_18_in_rule__MappedDependency__Group_3__24263); 
             after(grammarAccess.getMappedDependencyAccess().getColonKeyword_3_2()); 

            }

            pushFollow(FOLLOW_rule__MappedDependency__Group_3__3_in_rule__MappedDependency__Group_3__24273);
            rule__MappedDependency__Group_3__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MappedDependency__Group_3__2


    // $ANTLR start rule__MappedDependency__Group_3__3
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2211:1: rule__MappedDependency__Group_3__3 : ( RULE_STRING ) ;
    public final void rule__MappedDependency__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2215:1: ( ( RULE_STRING ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2216:1: ( RULE_STRING )
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2216:1: ( RULE_STRING )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2217:1: RULE_STRING
            {
             before(grammarAccess.getMappedDependencyAccess().getSTRINGTerminalRuleCall_3_3()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MappedDependency__Group_3__34301); 
             after(grammarAccess.getMappedDependencyAccess().getSTRINGTerminalRuleCall_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MappedDependency__Group_3__3


    // $ANTLR start rule__MappedDependency__Group_4__0
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2236:1: rule__MappedDependency__Group_4__0 : ( ',' ) rule__MappedDependency__Group_4__1 ;
    public final void rule__MappedDependency__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2240:1: ( ( ',' ) rule__MappedDependency__Group_4__1 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2241:1: ( ',' ) rule__MappedDependency__Group_4__1
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2241:1: ( ',' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2242:1: ','
            {
             before(grammarAccess.getMappedDependencyAccess().getCommaKeyword_4_0()); 
            match(input,26,FOLLOW_26_in_rule__MappedDependency__Group_4__04343); 
             after(grammarAccess.getMappedDependencyAccess().getCommaKeyword_4_0()); 

            }

            pushFollow(FOLLOW_rule__MappedDependency__Group_4__1_in_rule__MappedDependency__Group_4__04353);
            rule__MappedDependency__Group_4__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MappedDependency__Group_4__0


    // $ANTLR start rule__MappedDependency__Group_4__1
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2256:1: rule__MappedDependency__Group_4__1 : ( 'groupId' ) rule__MappedDependency__Group_4__2 ;
    public final void rule__MappedDependency__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2260:1: ( ( 'groupId' ) rule__MappedDependency__Group_4__2 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2261:1: ( 'groupId' ) rule__MappedDependency__Group_4__2
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2261:1: ( 'groupId' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2262:1: 'groupId'
            {
             before(grammarAccess.getMappedDependencyAccess().getGroupIdKeyword_4_1()); 
            match(input,17,FOLLOW_17_in_rule__MappedDependency__Group_4__14382); 
             after(grammarAccess.getMappedDependencyAccess().getGroupIdKeyword_4_1()); 

            }

            pushFollow(FOLLOW_rule__MappedDependency__Group_4__2_in_rule__MappedDependency__Group_4__14392);
            rule__MappedDependency__Group_4__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MappedDependency__Group_4__1


    // $ANTLR start rule__MappedDependency__Group_4__2
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2276:1: rule__MappedDependency__Group_4__2 : ( ':' ) rule__MappedDependency__Group_4__3 ;
    public final void rule__MappedDependency__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2280:1: ( ( ':' ) rule__MappedDependency__Group_4__3 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2281:1: ( ':' ) rule__MappedDependency__Group_4__3
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2281:1: ( ':' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2282:1: ':'
            {
             before(grammarAccess.getMappedDependencyAccess().getColonKeyword_4_2()); 
            match(input,18,FOLLOW_18_in_rule__MappedDependency__Group_4__24421); 
             after(grammarAccess.getMappedDependencyAccess().getColonKeyword_4_2()); 

            }

            pushFollow(FOLLOW_rule__MappedDependency__Group_4__3_in_rule__MappedDependency__Group_4__24431);
            rule__MappedDependency__Group_4__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MappedDependency__Group_4__2


    // $ANTLR start rule__MappedDependency__Group_4__3
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2296:1: rule__MappedDependency__Group_4__3 : ( ( rule__MappedDependency__GroupIdAssignment_4_3 ) ) ;
    public final void rule__MappedDependency__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2300:1: ( ( ( rule__MappedDependency__GroupIdAssignment_4_3 ) ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2301:1: ( ( rule__MappedDependency__GroupIdAssignment_4_3 ) )
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2301:1: ( ( rule__MappedDependency__GroupIdAssignment_4_3 ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2302:1: ( rule__MappedDependency__GroupIdAssignment_4_3 )
            {
             before(grammarAccess.getMappedDependencyAccess().getGroupIdAssignment_4_3()); 
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2303:1: ( rule__MappedDependency__GroupIdAssignment_4_3 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2303:2: rule__MappedDependency__GroupIdAssignment_4_3
            {
            pushFollow(FOLLOW_rule__MappedDependency__GroupIdAssignment_4_3_in_rule__MappedDependency__Group_4__34459);
            rule__MappedDependency__GroupIdAssignment_4_3();
            _fsp--;


            }

             after(grammarAccess.getMappedDependencyAccess().getGroupIdAssignment_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MappedDependency__Group_4__3


    // $ANTLR start rule__MappedDependency__Group_5__0
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2321:1: rule__MappedDependency__Group_5__0 : ( ',' ) rule__MappedDependency__Group_5__1 ;
    public final void rule__MappedDependency__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2325:1: ( ( ',' ) rule__MappedDependency__Group_5__1 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2326:1: ( ',' ) rule__MappedDependency__Group_5__1
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2326:1: ( ',' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2327:1: ','
            {
             before(grammarAccess.getMappedDependencyAccess().getCommaKeyword_5_0()); 
            match(input,26,FOLLOW_26_in_rule__MappedDependency__Group_5__04502); 
             after(grammarAccess.getMappedDependencyAccess().getCommaKeyword_5_0()); 

            }

            pushFollow(FOLLOW_rule__MappedDependency__Group_5__1_in_rule__MappedDependency__Group_5__04512);
            rule__MappedDependency__Group_5__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MappedDependency__Group_5__0


    // $ANTLR start rule__MappedDependency__Group_5__1
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2341:1: rule__MappedDependency__Group_5__1 : ( 'artifactId' ) rule__MappedDependency__Group_5__2 ;
    public final void rule__MappedDependency__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2345:1: ( ( 'artifactId' ) rule__MappedDependency__Group_5__2 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2346:1: ( 'artifactId' ) rule__MappedDependency__Group_5__2
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2346:1: ( 'artifactId' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2347:1: 'artifactId'
            {
             before(grammarAccess.getMappedDependencyAccess().getArtifactIdKeyword_5_1()); 
            match(input,19,FOLLOW_19_in_rule__MappedDependency__Group_5__14541); 
             after(grammarAccess.getMappedDependencyAccess().getArtifactIdKeyword_5_1()); 

            }

            pushFollow(FOLLOW_rule__MappedDependency__Group_5__2_in_rule__MappedDependency__Group_5__14551);
            rule__MappedDependency__Group_5__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MappedDependency__Group_5__1


    // $ANTLR start rule__MappedDependency__Group_5__2
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2361:1: rule__MappedDependency__Group_5__2 : ( ':' ) rule__MappedDependency__Group_5__3 ;
    public final void rule__MappedDependency__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2365:1: ( ( ':' ) rule__MappedDependency__Group_5__3 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2366:1: ( ':' ) rule__MappedDependency__Group_5__3
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2366:1: ( ':' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2367:1: ':'
            {
             before(grammarAccess.getMappedDependencyAccess().getColonKeyword_5_2()); 
            match(input,18,FOLLOW_18_in_rule__MappedDependency__Group_5__24580); 
             after(grammarAccess.getMappedDependencyAccess().getColonKeyword_5_2()); 

            }

            pushFollow(FOLLOW_rule__MappedDependency__Group_5__3_in_rule__MappedDependency__Group_5__24590);
            rule__MappedDependency__Group_5__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MappedDependency__Group_5__2


    // $ANTLR start rule__MappedDependency__Group_5__3
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2381:1: rule__MappedDependency__Group_5__3 : ( ( rule__MappedDependency__ArtifactIdAssignment_5_3 ) ) ;
    public final void rule__MappedDependency__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2385:1: ( ( ( rule__MappedDependency__ArtifactIdAssignment_5_3 ) ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2386:1: ( ( rule__MappedDependency__ArtifactIdAssignment_5_3 ) )
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2386:1: ( ( rule__MappedDependency__ArtifactIdAssignment_5_3 ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2387:1: ( rule__MappedDependency__ArtifactIdAssignment_5_3 )
            {
             before(grammarAccess.getMappedDependencyAccess().getArtifactIdAssignment_5_3()); 
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2388:1: ( rule__MappedDependency__ArtifactIdAssignment_5_3 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2388:2: rule__MappedDependency__ArtifactIdAssignment_5_3
            {
            pushFollow(FOLLOW_rule__MappedDependency__ArtifactIdAssignment_5_3_in_rule__MappedDependency__Group_5__34618);
            rule__MappedDependency__ArtifactIdAssignment_5_3();
            _fsp--;


            }

             after(grammarAccess.getMappedDependencyAccess().getArtifactIdAssignment_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MappedDependency__Group_5__3


    // $ANTLR start rule__MappedDependency__Group_6__0
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2406:1: rule__MappedDependency__Group_6__0 : ( ',' ) rule__MappedDependency__Group_6__1 ;
    public final void rule__MappedDependency__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2410:1: ( ( ',' ) rule__MappedDependency__Group_6__1 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2411:1: ( ',' ) rule__MappedDependency__Group_6__1
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2411:1: ( ',' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2412:1: ','
            {
             before(grammarAccess.getMappedDependencyAccess().getCommaKeyword_6_0()); 
            match(input,26,FOLLOW_26_in_rule__MappedDependency__Group_6__04661); 
             after(grammarAccess.getMappedDependencyAccess().getCommaKeyword_6_0()); 

            }

            pushFollow(FOLLOW_rule__MappedDependency__Group_6__1_in_rule__MappedDependency__Group_6__04671);
            rule__MappedDependency__Group_6__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MappedDependency__Group_6__0


    // $ANTLR start rule__MappedDependency__Group_6__1
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2426:1: rule__MappedDependency__Group_6__1 : ( 'version' ) rule__MappedDependency__Group_6__2 ;
    public final void rule__MappedDependency__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2430:1: ( ( 'version' ) rule__MappedDependency__Group_6__2 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2431:1: ( 'version' ) rule__MappedDependency__Group_6__2
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2431:1: ( 'version' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2432:1: 'version'
            {
             before(grammarAccess.getMappedDependencyAccess().getVersionKeyword_6_1()); 
            match(input,20,FOLLOW_20_in_rule__MappedDependency__Group_6__14700); 
             after(grammarAccess.getMappedDependencyAccess().getVersionKeyword_6_1()); 

            }

            pushFollow(FOLLOW_rule__MappedDependency__Group_6__2_in_rule__MappedDependency__Group_6__14710);
            rule__MappedDependency__Group_6__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MappedDependency__Group_6__1


    // $ANTLR start rule__MappedDependency__Group_6__2
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2446:1: rule__MappedDependency__Group_6__2 : ( ':' ) rule__MappedDependency__Group_6__3 ;
    public final void rule__MappedDependency__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2450:1: ( ( ':' ) rule__MappedDependency__Group_6__3 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2451:1: ( ':' ) rule__MappedDependency__Group_6__3
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2451:1: ( ':' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2452:1: ':'
            {
             before(grammarAccess.getMappedDependencyAccess().getColonKeyword_6_2()); 
            match(input,18,FOLLOW_18_in_rule__MappedDependency__Group_6__24739); 
             after(grammarAccess.getMappedDependencyAccess().getColonKeyword_6_2()); 

            }

            pushFollow(FOLLOW_rule__MappedDependency__Group_6__3_in_rule__MappedDependency__Group_6__24749);
            rule__MappedDependency__Group_6__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MappedDependency__Group_6__2


    // $ANTLR start rule__MappedDependency__Group_6__3
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2466:1: rule__MappedDependency__Group_6__3 : ( ( rule__MappedDependency__VersionAssignment_6_3 ) ) ;
    public final void rule__MappedDependency__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2470:1: ( ( ( rule__MappedDependency__VersionAssignment_6_3 ) ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2471:1: ( ( rule__MappedDependency__VersionAssignment_6_3 ) )
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2471:1: ( ( rule__MappedDependency__VersionAssignment_6_3 ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2472:1: ( rule__MappedDependency__VersionAssignment_6_3 )
            {
             before(grammarAccess.getMappedDependencyAccess().getVersionAssignment_6_3()); 
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2473:1: ( rule__MappedDependency__VersionAssignment_6_3 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2473:2: rule__MappedDependency__VersionAssignment_6_3
            {
            pushFollow(FOLLOW_rule__MappedDependency__VersionAssignment_6_3_in_rule__MappedDependency__Group_6__34777);
            rule__MappedDependency__VersionAssignment_6_3();
            _fsp--;


            }

             after(grammarAccess.getMappedDependencyAccess().getVersionAssignment_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MappedDependency__Group_6__3


    // $ANTLR start rule__Plugin__Group__0
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2491:1: rule__Plugin__Group__0 : ( 'groupId' ) rule__Plugin__Group__1 ;
    public final void rule__Plugin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2495:1: ( ( 'groupId' ) rule__Plugin__Group__1 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2496:1: ( 'groupId' ) rule__Plugin__Group__1
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2496:1: ( 'groupId' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2497:1: 'groupId'
            {
             before(grammarAccess.getPluginAccess().getGroupIdKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Plugin__Group__04820); 
             after(grammarAccess.getPluginAccess().getGroupIdKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Plugin__Group__1_in_rule__Plugin__Group__04830);
            rule__Plugin__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Plugin__Group__0


    // $ANTLR start rule__Plugin__Group__1
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2511:1: rule__Plugin__Group__1 : ( ':' ) rule__Plugin__Group__2 ;
    public final void rule__Plugin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2515:1: ( ( ':' ) rule__Plugin__Group__2 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2516:1: ( ':' ) rule__Plugin__Group__2
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2516:1: ( ':' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2517:1: ':'
            {
             before(grammarAccess.getPluginAccess().getColonKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__Plugin__Group__14859); 
             after(grammarAccess.getPluginAccess().getColonKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__Plugin__Group__2_in_rule__Plugin__Group__14869);
            rule__Plugin__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Plugin__Group__1


    // $ANTLR start rule__Plugin__Group__2
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2531:1: rule__Plugin__Group__2 : ( ( rule__Plugin__GroupIdAssignment_2 ) ) rule__Plugin__Group__3 ;
    public final void rule__Plugin__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2535:1: ( ( ( rule__Plugin__GroupIdAssignment_2 ) ) rule__Plugin__Group__3 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2536:1: ( ( rule__Plugin__GroupIdAssignment_2 ) ) rule__Plugin__Group__3
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2536:1: ( ( rule__Plugin__GroupIdAssignment_2 ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2537:1: ( rule__Plugin__GroupIdAssignment_2 )
            {
             before(grammarAccess.getPluginAccess().getGroupIdAssignment_2()); 
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2538:1: ( rule__Plugin__GroupIdAssignment_2 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2538:2: rule__Plugin__GroupIdAssignment_2
            {
            pushFollow(FOLLOW_rule__Plugin__GroupIdAssignment_2_in_rule__Plugin__Group__24897);
            rule__Plugin__GroupIdAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getPluginAccess().getGroupIdAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__Plugin__Group__3_in_rule__Plugin__Group__24906);
            rule__Plugin__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Plugin__Group__2


    // $ANTLR start rule__Plugin__Group__3
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2549:1: rule__Plugin__Group__3 : ( ',' ) rule__Plugin__Group__4 ;
    public final void rule__Plugin__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2553:1: ( ( ',' ) rule__Plugin__Group__4 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2554:1: ( ',' ) rule__Plugin__Group__4
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2554:1: ( ',' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2555:1: ','
            {
             before(grammarAccess.getPluginAccess().getCommaKeyword_3()); 
            match(input,26,FOLLOW_26_in_rule__Plugin__Group__34935); 
             after(grammarAccess.getPluginAccess().getCommaKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__Plugin__Group__4_in_rule__Plugin__Group__34945);
            rule__Plugin__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Plugin__Group__3


    // $ANTLR start rule__Plugin__Group__4
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2569:1: rule__Plugin__Group__4 : ( 'artifactId' ) rule__Plugin__Group__5 ;
    public final void rule__Plugin__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2573:1: ( ( 'artifactId' ) rule__Plugin__Group__5 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2574:1: ( 'artifactId' ) rule__Plugin__Group__5
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2574:1: ( 'artifactId' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2575:1: 'artifactId'
            {
             before(grammarAccess.getPluginAccess().getArtifactIdKeyword_4()); 
            match(input,19,FOLLOW_19_in_rule__Plugin__Group__44974); 
             after(grammarAccess.getPluginAccess().getArtifactIdKeyword_4()); 

            }

            pushFollow(FOLLOW_rule__Plugin__Group__5_in_rule__Plugin__Group__44984);
            rule__Plugin__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Plugin__Group__4


    // $ANTLR start rule__Plugin__Group__5
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2589:1: rule__Plugin__Group__5 : ( ':' ) rule__Plugin__Group__6 ;
    public final void rule__Plugin__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2593:1: ( ( ':' ) rule__Plugin__Group__6 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2594:1: ( ':' ) rule__Plugin__Group__6
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2594:1: ( ':' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2595:1: ':'
            {
             before(grammarAccess.getPluginAccess().getColonKeyword_5()); 
            match(input,18,FOLLOW_18_in_rule__Plugin__Group__55013); 
             after(grammarAccess.getPluginAccess().getColonKeyword_5()); 

            }

            pushFollow(FOLLOW_rule__Plugin__Group__6_in_rule__Plugin__Group__55023);
            rule__Plugin__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Plugin__Group__5


    // $ANTLR start rule__Plugin__Group__6
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2609:1: rule__Plugin__Group__6 : ( ( rule__Plugin__ArtifactIdAssignment_6 ) ) rule__Plugin__Group__7 ;
    public final void rule__Plugin__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2613:1: ( ( ( rule__Plugin__ArtifactIdAssignment_6 ) ) rule__Plugin__Group__7 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2614:1: ( ( rule__Plugin__ArtifactIdAssignment_6 ) ) rule__Plugin__Group__7
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2614:1: ( ( rule__Plugin__ArtifactIdAssignment_6 ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2615:1: ( rule__Plugin__ArtifactIdAssignment_6 )
            {
             before(grammarAccess.getPluginAccess().getArtifactIdAssignment_6()); 
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2616:1: ( rule__Plugin__ArtifactIdAssignment_6 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2616:2: rule__Plugin__ArtifactIdAssignment_6
            {
            pushFollow(FOLLOW_rule__Plugin__ArtifactIdAssignment_6_in_rule__Plugin__Group__65051);
            rule__Plugin__ArtifactIdAssignment_6();
            _fsp--;


            }

             after(grammarAccess.getPluginAccess().getArtifactIdAssignment_6()); 

            }

            pushFollow(FOLLOW_rule__Plugin__Group__7_in_rule__Plugin__Group__65060);
            rule__Plugin__Group__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Plugin__Group__6


    // $ANTLR start rule__Plugin__Group__7
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2627:1: rule__Plugin__Group__7 : ( ',' ) rule__Plugin__Group__8 ;
    public final void rule__Plugin__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2631:1: ( ( ',' ) rule__Plugin__Group__8 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2632:1: ( ',' ) rule__Plugin__Group__8
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2632:1: ( ',' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2633:1: ','
            {
             before(grammarAccess.getPluginAccess().getCommaKeyword_7()); 
            match(input,26,FOLLOW_26_in_rule__Plugin__Group__75089); 
             after(grammarAccess.getPluginAccess().getCommaKeyword_7()); 

            }

            pushFollow(FOLLOW_rule__Plugin__Group__8_in_rule__Plugin__Group__75099);
            rule__Plugin__Group__8();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Plugin__Group__7


    // $ANTLR start rule__Plugin__Group__8
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2647:1: rule__Plugin__Group__8 : ( 'version' ) rule__Plugin__Group__9 ;
    public final void rule__Plugin__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2651:1: ( ( 'version' ) rule__Plugin__Group__9 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2652:1: ( 'version' ) rule__Plugin__Group__9
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2652:1: ( 'version' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2653:1: 'version'
            {
             before(grammarAccess.getPluginAccess().getVersionKeyword_8()); 
            match(input,20,FOLLOW_20_in_rule__Plugin__Group__85128); 
             after(grammarAccess.getPluginAccess().getVersionKeyword_8()); 

            }

            pushFollow(FOLLOW_rule__Plugin__Group__9_in_rule__Plugin__Group__85138);
            rule__Plugin__Group__9();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Plugin__Group__8


    // $ANTLR start rule__Plugin__Group__9
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2667:1: rule__Plugin__Group__9 : ( ':' ) rule__Plugin__Group__10 ;
    public final void rule__Plugin__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2671:1: ( ( ':' ) rule__Plugin__Group__10 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2672:1: ( ':' ) rule__Plugin__Group__10
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2672:1: ( ':' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2673:1: ':'
            {
             before(grammarAccess.getPluginAccess().getColonKeyword_9()); 
            match(input,18,FOLLOW_18_in_rule__Plugin__Group__95167); 
             after(grammarAccess.getPluginAccess().getColonKeyword_9()); 

            }

            pushFollow(FOLLOW_rule__Plugin__Group__10_in_rule__Plugin__Group__95177);
            rule__Plugin__Group__10();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Plugin__Group__9


    // $ANTLR start rule__Plugin__Group__10
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2687:1: rule__Plugin__Group__10 : ( ( rule__Plugin__VersionAssignment_10 ) ) rule__Plugin__Group__11 ;
    public final void rule__Plugin__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2691:1: ( ( ( rule__Plugin__VersionAssignment_10 ) ) rule__Plugin__Group__11 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2692:1: ( ( rule__Plugin__VersionAssignment_10 ) ) rule__Plugin__Group__11
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2692:1: ( ( rule__Plugin__VersionAssignment_10 ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2693:1: ( rule__Plugin__VersionAssignment_10 )
            {
             before(grammarAccess.getPluginAccess().getVersionAssignment_10()); 
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2694:1: ( rule__Plugin__VersionAssignment_10 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2694:2: rule__Plugin__VersionAssignment_10
            {
            pushFollow(FOLLOW_rule__Plugin__VersionAssignment_10_in_rule__Plugin__Group__105205);
            rule__Plugin__VersionAssignment_10();
            _fsp--;


            }

             after(grammarAccess.getPluginAccess().getVersionAssignment_10()); 

            }

            pushFollow(FOLLOW_rule__Plugin__Group__11_in_rule__Plugin__Group__105214);
            rule__Plugin__Group__11();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Plugin__Group__10


    // $ANTLR start rule__Plugin__Group__11
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2705:1: rule__Plugin__Group__11 : ( ( rule__Plugin__Group_11__0 )? ) rule__Plugin__Group__12 ;
    public final void rule__Plugin__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2709:1: ( ( ( rule__Plugin__Group_11__0 )? ) rule__Plugin__Group__12 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2710:1: ( ( rule__Plugin__Group_11__0 )? ) rule__Plugin__Group__12
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2710:1: ( ( rule__Plugin__Group_11__0 )? )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2711:1: ( rule__Plugin__Group_11__0 )?
            {
             before(grammarAccess.getPluginAccess().getGroup_11()); 
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2712:1: ( rule__Plugin__Group_11__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==26) ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==32) ) {
                    alt26=1;
                }
            }
            switch (alt26) {
                case 1 :
                    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2712:2: rule__Plugin__Group_11__0
                    {
                    pushFollow(FOLLOW_rule__Plugin__Group_11__0_in_rule__Plugin__Group__115242);
                    rule__Plugin__Group_11__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPluginAccess().getGroup_11()); 

            }

            pushFollow(FOLLOW_rule__Plugin__Group__12_in_rule__Plugin__Group__115252);
            rule__Plugin__Group__12();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Plugin__Group__11


    // $ANTLR start rule__Plugin__Group__12
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2723:1: rule__Plugin__Group__12 : ( ( rule__Plugin__Group_12__0 )? ) rule__Plugin__Group__13 ;
    public final void rule__Plugin__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2727:1: ( ( ( rule__Plugin__Group_12__0 )? ) rule__Plugin__Group__13 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2728:1: ( ( rule__Plugin__Group_12__0 )? ) rule__Plugin__Group__13
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2728:1: ( ( rule__Plugin__Group_12__0 )? )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2729:1: ( rule__Plugin__Group_12__0 )?
            {
             before(grammarAccess.getPluginAccess().getGroup_12()); 
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2730:1: ( rule__Plugin__Group_12__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==26) ) {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==33) ) {
                    alt27=1;
                }
            }
            switch (alt27) {
                case 1 :
                    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2730:2: rule__Plugin__Group_12__0
                    {
                    pushFollow(FOLLOW_rule__Plugin__Group_12__0_in_rule__Plugin__Group__125280);
                    rule__Plugin__Group_12__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPluginAccess().getGroup_12()); 

            }

            pushFollow(FOLLOW_rule__Plugin__Group__13_in_rule__Plugin__Group__125290);
            rule__Plugin__Group__13();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Plugin__Group__12


    // $ANTLR start rule__Plugin__Group__13
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2741:1: rule__Plugin__Group__13 : ( ( rule__Plugin__Group_13__0 )? ) ;
    public final void rule__Plugin__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2745:1: ( ( ( rule__Plugin__Group_13__0 )? ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2746:1: ( ( rule__Plugin__Group_13__0 )? )
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2746:1: ( ( rule__Plugin__Group_13__0 )? )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2747:1: ( rule__Plugin__Group_13__0 )?
            {
             before(grammarAccess.getPluginAccess().getGroup_13()); 
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2748:1: ( rule__Plugin__Group_13__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==26) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2748:2: rule__Plugin__Group_13__0
                    {
                    pushFollow(FOLLOW_rule__Plugin__Group_13__0_in_rule__Plugin__Group__135318);
                    rule__Plugin__Group_13__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPluginAccess().getGroup_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Plugin__Group__13


    // $ANTLR start rule__Plugin__Group_11__0
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2786:1: rule__Plugin__Group_11__0 : ( ',' ) rule__Plugin__Group_11__1 ;
    public final void rule__Plugin__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2790:1: ( ( ',' ) rule__Plugin__Group_11__1 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2791:1: ( ',' ) rule__Plugin__Group_11__1
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2791:1: ( ',' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2792:1: ','
            {
             before(grammarAccess.getPluginAccess().getCommaKeyword_11_0()); 
            match(input,26,FOLLOW_26_in_rule__Plugin__Group_11__05382); 
             after(grammarAccess.getPluginAccess().getCommaKeyword_11_0()); 

            }

            pushFollow(FOLLOW_rule__Plugin__Group_11__1_in_rule__Plugin__Group_11__05392);
            rule__Plugin__Group_11__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Plugin__Group_11__0


    // $ANTLR start rule__Plugin__Group_11__1
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2806:1: rule__Plugin__Group_11__1 : ( 'phase' ) rule__Plugin__Group_11__2 ;
    public final void rule__Plugin__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2810:1: ( ( 'phase' ) rule__Plugin__Group_11__2 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2811:1: ( 'phase' ) rule__Plugin__Group_11__2
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2811:1: ( 'phase' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2812:1: 'phase'
            {
             before(grammarAccess.getPluginAccess().getPhaseKeyword_11_1()); 
            match(input,32,FOLLOW_32_in_rule__Plugin__Group_11__15421); 
             after(grammarAccess.getPluginAccess().getPhaseKeyword_11_1()); 

            }

            pushFollow(FOLLOW_rule__Plugin__Group_11__2_in_rule__Plugin__Group_11__15431);
            rule__Plugin__Group_11__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Plugin__Group_11__1


    // $ANTLR start rule__Plugin__Group_11__2
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2826:1: rule__Plugin__Group_11__2 : ( ':' ) rule__Plugin__Group_11__3 ;
    public final void rule__Plugin__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2830:1: ( ( ':' ) rule__Plugin__Group_11__3 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2831:1: ( ':' ) rule__Plugin__Group_11__3
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2831:1: ( ':' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2832:1: ':'
            {
             before(grammarAccess.getPluginAccess().getColonKeyword_11_2()); 
            match(input,18,FOLLOW_18_in_rule__Plugin__Group_11__25460); 
             after(grammarAccess.getPluginAccess().getColonKeyword_11_2()); 

            }

            pushFollow(FOLLOW_rule__Plugin__Group_11__3_in_rule__Plugin__Group_11__25470);
            rule__Plugin__Group_11__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Plugin__Group_11__2


    // $ANTLR start rule__Plugin__Group_11__3
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2846:1: rule__Plugin__Group_11__3 : ( RULE_ID ) ;
    public final void rule__Plugin__Group_11__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2850:1: ( ( RULE_ID ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2851:1: ( RULE_ID )
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2851:1: ( RULE_ID )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2852:1: RULE_ID
            {
             before(grammarAccess.getPluginAccess().getIDTerminalRuleCall_11_3()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Plugin__Group_11__35498); 
             after(grammarAccess.getPluginAccess().getIDTerminalRuleCall_11_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Plugin__Group_11__3


    // $ANTLR start rule__Plugin__Group_12__0
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2871:1: rule__Plugin__Group_12__0 : ( ',' ) rule__Plugin__Group_12__1 ;
    public final void rule__Plugin__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2875:1: ( ( ',' ) rule__Plugin__Group_12__1 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2876:1: ( ',' ) rule__Plugin__Group_12__1
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2876:1: ( ',' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2877:1: ','
            {
             before(grammarAccess.getPluginAccess().getCommaKeyword_12_0()); 
            match(input,26,FOLLOW_26_in_rule__Plugin__Group_12__05540); 
             after(grammarAccess.getPluginAccess().getCommaKeyword_12_0()); 

            }

            pushFollow(FOLLOW_rule__Plugin__Group_12__1_in_rule__Plugin__Group_12__05550);
            rule__Plugin__Group_12__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Plugin__Group_12__0


    // $ANTLR start rule__Plugin__Group_12__1
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2891:1: rule__Plugin__Group_12__1 : ( 'extensionId' ) rule__Plugin__Group_12__2 ;
    public final void rule__Plugin__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2895:1: ( ( 'extensionId' ) rule__Plugin__Group_12__2 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2896:1: ( 'extensionId' ) rule__Plugin__Group_12__2
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2896:1: ( 'extensionId' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2897:1: 'extensionId'
            {
             before(grammarAccess.getPluginAccess().getExtensionIdKeyword_12_1()); 
            match(input,33,FOLLOW_33_in_rule__Plugin__Group_12__15579); 
             after(grammarAccess.getPluginAccess().getExtensionIdKeyword_12_1()); 

            }

            pushFollow(FOLLOW_rule__Plugin__Group_12__2_in_rule__Plugin__Group_12__15589);
            rule__Plugin__Group_12__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Plugin__Group_12__1


    // $ANTLR start rule__Plugin__Group_12__2
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2911:1: rule__Plugin__Group_12__2 : ( ':' ) rule__Plugin__Group_12__3 ;
    public final void rule__Plugin__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2915:1: ( ( ':' ) rule__Plugin__Group_12__3 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2916:1: ( ':' ) rule__Plugin__Group_12__3
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2916:1: ( ':' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2917:1: ':'
            {
             before(grammarAccess.getPluginAccess().getColonKeyword_12_2()); 
            match(input,18,FOLLOW_18_in_rule__Plugin__Group_12__25618); 
             after(grammarAccess.getPluginAccess().getColonKeyword_12_2()); 

            }

            pushFollow(FOLLOW_rule__Plugin__Group_12__3_in_rule__Plugin__Group_12__25628);
            rule__Plugin__Group_12__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Plugin__Group_12__2


    // $ANTLR start rule__Plugin__Group_12__3
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2931:1: rule__Plugin__Group_12__3 : ( RULE_ID ) ;
    public final void rule__Plugin__Group_12__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2935:1: ( ( RULE_ID ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2936:1: ( RULE_ID )
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2936:1: ( RULE_ID )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2937:1: RULE_ID
            {
             before(grammarAccess.getPluginAccess().getIDTerminalRuleCall_12_3()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Plugin__Group_12__35656); 
             after(grammarAccess.getPluginAccess().getIDTerminalRuleCall_12_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Plugin__Group_12__3


    // $ANTLR start rule__Plugin__Group_13__0
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2956:1: rule__Plugin__Group_13__0 : ( ',' ) rule__Plugin__Group_13__1 ;
    public final void rule__Plugin__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2960:1: ( ( ',' ) rule__Plugin__Group_13__1 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2961:1: ( ',' ) rule__Plugin__Group_13__1
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2961:1: ( ',' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2962:1: ','
            {
             before(grammarAccess.getPluginAccess().getCommaKeyword_13_0()); 
            match(input,26,FOLLOW_26_in_rule__Plugin__Group_13__05698); 
             after(grammarAccess.getPluginAccess().getCommaKeyword_13_0()); 

            }

            pushFollow(FOLLOW_rule__Plugin__Group_13__1_in_rule__Plugin__Group_13__05708);
            rule__Plugin__Group_13__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Plugin__Group_13__0


    // $ANTLR start rule__Plugin__Group_13__1
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2976:1: rule__Plugin__Group_13__1 : ( 'execute' ) rule__Plugin__Group_13__2 ;
    public final void rule__Plugin__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2980:1: ( ( 'execute' ) rule__Plugin__Group_13__2 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2981:1: ( 'execute' ) rule__Plugin__Group_13__2
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2981:1: ( 'execute' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2982:1: 'execute'
            {
             before(grammarAccess.getPluginAccess().getExecuteKeyword_13_1()); 
            match(input,34,FOLLOW_34_in_rule__Plugin__Group_13__15737); 
             after(grammarAccess.getPluginAccess().getExecuteKeyword_13_1()); 

            }

            pushFollow(FOLLOW_rule__Plugin__Group_13__2_in_rule__Plugin__Group_13__15747);
            rule__Plugin__Group_13__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Plugin__Group_13__1


    // $ANTLR start rule__Plugin__Group_13__2
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:2996:1: rule__Plugin__Group_13__2 : ( '{' ) rule__Plugin__Group_13__3 ;
    public final void rule__Plugin__Group_13__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3000:1: ( ( '{' ) rule__Plugin__Group_13__3 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3001:1: ( '{' ) rule__Plugin__Group_13__3
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3001:1: ( '{' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3002:1: '{'
            {
             before(grammarAccess.getPluginAccess().getLeftCurlyBracketKeyword_13_2()); 
            match(input,16,FOLLOW_16_in_rule__Plugin__Group_13__25776); 
             after(grammarAccess.getPluginAccess().getLeftCurlyBracketKeyword_13_2()); 

            }

            pushFollow(FOLLOW_rule__Plugin__Group_13__3_in_rule__Plugin__Group_13__25786);
            rule__Plugin__Group_13__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Plugin__Group_13__2


    // $ANTLR start rule__Plugin__Group_13__3
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3016:1: rule__Plugin__Group_13__3 : ( ( RULE_STRING )* ) rule__Plugin__Group_13__4 ;
    public final void rule__Plugin__Group_13__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3020:1: ( ( ( RULE_STRING )* ) rule__Plugin__Group_13__4 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3021:1: ( ( RULE_STRING )* ) rule__Plugin__Group_13__4
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3021:1: ( ( RULE_STRING )* )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3022:1: ( RULE_STRING )*
            {
             before(grammarAccess.getPluginAccess().getSTRINGTerminalRuleCall_13_3()); 
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3023:1: ( RULE_STRING )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_STRING) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3023:3: RULE_STRING
            	    {
            	    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Plugin__Group_13__35815); 

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getPluginAccess().getSTRINGTerminalRuleCall_13_3()); 

            }

            pushFollow(FOLLOW_rule__Plugin__Group_13__4_in_rule__Plugin__Group_13__35825);
            rule__Plugin__Group_13__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Plugin__Group_13__3


    // $ANTLR start rule__Plugin__Group_13__4
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3034:1: rule__Plugin__Group_13__4 : ( '}' ) ;
    public final void rule__Plugin__Group_13__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3038:1: ( ( '}' ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3039:1: ( '}' )
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3039:1: ( '}' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3040:1: '}'
            {
             before(grammarAccess.getPluginAccess().getRightCurlyBracketKeyword_13_4()); 
            match(input,21,FOLLOW_21_in_rule__Plugin__Group_13__45854); 
             after(grammarAccess.getPluginAccess().getRightCurlyBracketKeyword_13_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Plugin__Group_13__4


    // $ANTLR start rule__Extension__Group__0
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3063:1: rule__Extension__Group__0 : ( 'groupId' ) rule__Extension__Group__1 ;
    public final void rule__Extension__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3067:1: ( ( 'groupId' ) rule__Extension__Group__1 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3068:1: ( 'groupId' ) rule__Extension__Group__1
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3068:1: ( 'groupId' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3069:1: 'groupId'
            {
             before(grammarAccess.getExtensionAccess().getGroupIdKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Extension__Group__05900); 
             after(grammarAccess.getExtensionAccess().getGroupIdKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Extension__Group__1_in_rule__Extension__Group__05910);
            rule__Extension__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Extension__Group__0


    // $ANTLR start rule__Extension__Group__1
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3083:1: rule__Extension__Group__1 : ( ':' ) rule__Extension__Group__2 ;
    public final void rule__Extension__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3087:1: ( ( ':' ) rule__Extension__Group__2 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3088:1: ( ':' ) rule__Extension__Group__2
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3088:1: ( ':' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3089:1: ':'
            {
             before(grammarAccess.getExtensionAccess().getColonKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__Extension__Group__15939); 
             after(grammarAccess.getExtensionAccess().getColonKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__Extension__Group__2_in_rule__Extension__Group__15949);
            rule__Extension__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Extension__Group__1


    // $ANTLR start rule__Extension__Group__2
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3103:1: rule__Extension__Group__2 : ( ( rule__Extension__GroupIdAssignment_2 ) ) rule__Extension__Group__3 ;
    public final void rule__Extension__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3107:1: ( ( ( rule__Extension__GroupIdAssignment_2 ) ) rule__Extension__Group__3 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3108:1: ( ( rule__Extension__GroupIdAssignment_2 ) ) rule__Extension__Group__3
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3108:1: ( ( rule__Extension__GroupIdAssignment_2 ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3109:1: ( rule__Extension__GroupIdAssignment_2 )
            {
             before(grammarAccess.getExtensionAccess().getGroupIdAssignment_2()); 
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3110:1: ( rule__Extension__GroupIdAssignment_2 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3110:2: rule__Extension__GroupIdAssignment_2
            {
            pushFollow(FOLLOW_rule__Extension__GroupIdAssignment_2_in_rule__Extension__Group__25977);
            rule__Extension__GroupIdAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getExtensionAccess().getGroupIdAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__Extension__Group__3_in_rule__Extension__Group__25986);
            rule__Extension__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Extension__Group__2


    // $ANTLR start rule__Extension__Group__3
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3121:1: rule__Extension__Group__3 : ( ',' ) rule__Extension__Group__4 ;
    public final void rule__Extension__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3125:1: ( ( ',' ) rule__Extension__Group__4 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3126:1: ( ',' ) rule__Extension__Group__4
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3126:1: ( ',' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3127:1: ','
            {
             before(grammarAccess.getExtensionAccess().getCommaKeyword_3()); 
            match(input,26,FOLLOW_26_in_rule__Extension__Group__36015); 
             after(grammarAccess.getExtensionAccess().getCommaKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__Extension__Group__4_in_rule__Extension__Group__36025);
            rule__Extension__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Extension__Group__3


    // $ANTLR start rule__Extension__Group__4
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3141:1: rule__Extension__Group__4 : ( 'artifactId' ) rule__Extension__Group__5 ;
    public final void rule__Extension__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3145:1: ( ( 'artifactId' ) rule__Extension__Group__5 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3146:1: ( 'artifactId' ) rule__Extension__Group__5
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3146:1: ( 'artifactId' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3147:1: 'artifactId'
            {
             before(grammarAccess.getExtensionAccess().getArtifactIdKeyword_4()); 
            match(input,19,FOLLOW_19_in_rule__Extension__Group__46054); 
             after(grammarAccess.getExtensionAccess().getArtifactIdKeyword_4()); 

            }

            pushFollow(FOLLOW_rule__Extension__Group__5_in_rule__Extension__Group__46064);
            rule__Extension__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Extension__Group__4


    // $ANTLR start rule__Extension__Group__5
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3161:1: rule__Extension__Group__5 : ( ':' ) rule__Extension__Group__6 ;
    public final void rule__Extension__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3165:1: ( ( ':' ) rule__Extension__Group__6 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3166:1: ( ':' ) rule__Extension__Group__6
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3166:1: ( ':' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3167:1: ':'
            {
             before(grammarAccess.getExtensionAccess().getColonKeyword_5()); 
            match(input,18,FOLLOW_18_in_rule__Extension__Group__56093); 
             after(grammarAccess.getExtensionAccess().getColonKeyword_5()); 

            }

            pushFollow(FOLLOW_rule__Extension__Group__6_in_rule__Extension__Group__56103);
            rule__Extension__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Extension__Group__5


    // $ANTLR start rule__Extension__Group__6
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3181:1: rule__Extension__Group__6 : ( ( rule__Extension__ArtifactIdAssignment_6 ) ) rule__Extension__Group__7 ;
    public final void rule__Extension__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3185:1: ( ( ( rule__Extension__ArtifactIdAssignment_6 ) ) rule__Extension__Group__7 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3186:1: ( ( rule__Extension__ArtifactIdAssignment_6 ) ) rule__Extension__Group__7
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3186:1: ( ( rule__Extension__ArtifactIdAssignment_6 ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3187:1: ( rule__Extension__ArtifactIdAssignment_6 )
            {
             before(grammarAccess.getExtensionAccess().getArtifactIdAssignment_6()); 
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3188:1: ( rule__Extension__ArtifactIdAssignment_6 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3188:2: rule__Extension__ArtifactIdAssignment_6
            {
            pushFollow(FOLLOW_rule__Extension__ArtifactIdAssignment_6_in_rule__Extension__Group__66131);
            rule__Extension__ArtifactIdAssignment_6();
            _fsp--;


            }

             after(grammarAccess.getExtensionAccess().getArtifactIdAssignment_6()); 

            }

            pushFollow(FOLLOW_rule__Extension__Group__7_in_rule__Extension__Group__66140);
            rule__Extension__Group__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Extension__Group__6


    // $ANTLR start rule__Extension__Group__7
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3199:1: rule__Extension__Group__7 : ( ',' ) rule__Extension__Group__8 ;
    public final void rule__Extension__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3203:1: ( ( ',' ) rule__Extension__Group__8 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3204:1: ( ',' ) rule__Extension__Group__8
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3204:1: ( ',' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3205:1: ','
            {
             before(grammarAccess.getExtensionAccess().getCommaKeyword_7()); 
            match(input,26,FOLLOW_26_in_rule__Extension__Group__76169); 
             after(grammarAccess.getExtensionAccess().getCommaKeyword_7()); 

            }

            pushFollow(FOLLOW_rule__Extension__Group__8_in_rule__Extension__Group__76179);
            rule__Extension__Group__8();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Extension__Group__7


    // $ANTLR start rule__Extension__Group__8
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3219:1: rule__Extension__Group__8 : ( 'version' ) rule__Extension__Group__9 ;
    public final void rule__Extension__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3223:1: ( ( 'version' ) rule__Extension__Group__9 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3224:1: ( 'version' ) rule__Extension__Group__9
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3224:1: ( 'version' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3225:1: 'version'
            {
             before(grammarAccess.getExtensionAccess().getVersionKeyword_8()); 
            match(input,20,FOLLOW_20_in_rule__Extension__Group__86208); 
             after(grammarAccess.getExtensionAccess().getVersionKeyword_8()); 

            }

            pushFollow(FOLLOW_rule__Extension__Group__9_in_rule__Extension__Group__86218);
            rule__Extension__Group__9();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Extension__Group__8


    // $ANTLR start rule__Extension__Group__9
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3239:1: rule__Extension__Group__9 : ( ':' ) rule__Extension__Group__10 ;
    public final void rule__Extension__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3243:1: ( ( ':' ) rule__Extension__Group__10 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3244:1: ( ':' ) rule__Extension__Group__10
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3244:1: ( ':' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3245:1: ':'
            {
             before(grammarAccess.getExtensionAccess().getColonKeyword_9()); 
            match(input,18,FOLLOW_18_in_rule__Extension__Group__96247); 
             after(grammarAccess.getExtensionAccess().getColonKeyword_9()); 

            }

            pushFollow(FOLLOW_rule__Extension__Group__10_in_rule__Extension__Group__96257);
            rule__Extension__Group__10();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Extension__Group__9


    // $ANTLR start rule__Extension__Group__10
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3259:1: rule__Extension__Group__10 : ( ( rule__Extension__VersionAssignment_10 ) ) rule__Extension__Group__11 ;
    public final void rule__Extension__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3263:1: ( ( ( rule__Extension__VersionAssignment_10 ) ) rule__Extension__Group__11 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3264:1: ( ( rule__Extension__VersionAssignment_10 ) ) rule__Extension__Group__11
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3264:1: ( ( rule__Extension__VersionAssignment_10 ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3265:1: ( rule__Extension__VersionAssignment_10 )
            {
             before(grammarAccess.getExtensionAccess().getVersionAssignment_10()); 
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3266:1: ( rule__Extension__VersionAssignment_10 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3266:2: rule__Extension__VersionAssignment_10
            {
            pushFollow(FOLLOW_rule__Extension__VersionAssignment_10_in_rule__Extension__Group__106285);
            rule__Extension__VersionAssignment_10();
            _fsp--;


            }

             after(grammarAccess.getExtensionAccess().getVersionAssignment_10()); 

            }

            pushFollow(FOLLOW_rule__Extension__Group__11_in_rule__Extension__Group__106294);
            rule__Extension__Group__11();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Extension__Group__10


    // $ANTLR start rule__Extension__Group__11
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3277:1: rule__Extension__Group__11 : ( ',' ) rule__Extension__Group__12 ;
    public final void rule__Extension__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3281:1: ( ( ',' ) rule__Extension__Group__12 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3282:1: ( ',' ) rule__Extension__Group__12
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3282:1: ( ',' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3283:1: ','
            {
             before(grammarAccess.getExtensionAccess().getCommaKeyword_11()); 
            match(input,26,FOLLOW_26_in_rule__Extension__Group__116323); 
             after(grammarAccess.getExtensionAccess().getCommaKeyword_11()); 

            }

            pushFollow(FOLLOW_rule__Extension__Group__12_in_rule__Extension__Group__116333);
            rule__Extension__Group__12();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Extension__Group__11


    // $ANTLR start rule__Extension__Group__12
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3297:1: rule__Extension__Group__12 : ( 'extensionId' ) rule__Extension__Group__13 ;
    public final void rule__Extension__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3301:1: ( ( 'extensionId' ) rule__Extension__Group__13 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3302:1: ( 'extensionId' ) rule__Extension__Group__13
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3302:1: ( 'extensionId' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3303:1: 'extensionId'
            {
             before(grammarAccess.getExtensionAccess().getExtensionIdKeyword_12()); 
            match(input,33,FOLLOW_33_in_rule__Extension__Group__126362); 
             after(grammarAccess.getExtensionAccess().getExtensionIdKeyword_12()); 

            }

            pushFollow(FOLLOW_rule__Extension__Group__13_in_rule__Extension__Group__126372);
            rule__Extension__Group__13();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Extension__Group__12


    // $ANTLR start rule__Extension__Group__13
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3317:1: rule__Extension__Group__13 : ( ':' ) rule__Extension__Group__14 ;
    public final void rule__Extension__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3321:1: ( ( ':' ) rule__Extension__Group__14 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3322:1: ( ':' ) rule__Extension__Group__14
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3322:1: ( ':' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3323:1: ':'
            {
             before(grammarAccess.getExtensionAccess().getColonKeyword_13()); 
            match(input,18,FOLLOW_18_in_rule__Extension__Group__136401); 
             after(grammarAccess.getExtensionAccess().getColonKeyword_13()); 

            }

            pushFollow(FOLLOW_rule__Extension__Group__14_in_rule__Extension__Group__136411);
            rule__Extension__Group__14();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Extension__Group__13


    // $ANTLR start rule__Extension__Group__14
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3337:1: rule__Extension__Group__14 : ( RULE_ID ) rule__Extension__Group__15 ;
    public final void rule__Extension__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3341:1: ( ( RULE_ID ) rule__Extension__Group__15 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3342:1: ( RULE_ID ) rule__Extension__Group__15
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3342:1: ( RULE_ID )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3343:1: RULE_ID
            {
             before(grammarAccess.getExtensionAccess().getIDTerminalRuleCall_14()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Extension__Group__146439); 
             after(grammarAccess.getExtensionAccess().getIDTerminalRuleCall_14()); 

            }

            pushFollow(FOLLOW_rule__Extension__Group__15_in_rule__Extension__Group__146447);
            rule__Extension__Group__15();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Extension__Group__14


    // $ANTLR start rule__Extension__Group__15
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3355:1: rule__Extension__Group__15 : ( ',' ) rule__Extension__Group__16 ;
    public final void rule__Extension__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3359:1: ( ( ',' ) rule__Extension__Group__16 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3360:1: ( ',' ) rule__Extension__Group__16
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3360:1: ( ',' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3361:1: ','
            {
             before(grammarAccess.getExtensionAccess().getCommaKeyword_15()); 
            match(input,26,FOLLOW_26_in_rule__Extension__Group__156476); 
             after(grammarAccess.getExtensionAccess().getCommaKeyword_15()); 

            }

            pushFollow(FOLLOW_rule__Extension__Group__16_in_rule__Extension__Group__156486);
            rule__Extension__Group__16();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Extension__Group__15


    // $ANTLR start rule__Extension__Group__16
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3375:1: rule__Extension__Group__16 : ( 'execute' ) rule__Extension__Group__17 ;
    public final void rule__Extension__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3379:1: ( ( 'execute' ) rule__Extension__Group__17 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3380:1: ( 'execute' ) rule__Extension__Group__17
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3380:1: ( 'execute' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3381:1: 'execute'
            {
             before(grammarAccess.getExtensionAccess().getExecuteKeyword_16()); 
            match(input,34,FOLLOW_34_in_rule__Extension__Group__166515); 
             after(grammarAccess.getExtensionAccess().getExecuteKeyword_16()); 

            }

            pushFollow(FOLLOW_rule__Extension__Group__17_in_rule__Extension__Group__166525);
            rule__Extension__Group__17();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Extension__Group__16


    // $ANTLR start rule__Extension__Group__17
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3395:1: rule__Extension__Group__17 : ( '{' ) rule__Extension__Group__18 ;
    public final void rule__Extension__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3399:1: ( ( '{' ) rule__Extension__Group__18 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3400:1: ( '{' ) rule__Extension__Group__18
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3400:1: ( '{' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3401:1: '{'
            {
             before(grammarAccess.getExtensionAccess().getLeftCurlyBracketKeyword_17()); 
            match(input,16,FOLLOW_16_in_rule__Extension__Group__176554); 
             after(grammarAccess.getExtensionAccess().getLeftCurlyBracketKeyword_17()); 

            }

            pushFollow(FOLLOW_rule__Extension__Group__18_in_rule__Extension__Group__176564);
            rule__Extension__Group__18();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Extension__Group__17


    // $ANTLR start rule__Extension__Group__18
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3415:1: rule__Extension__Group__18 : ( ( RULE_STRING )* ) rule__Extension__Group__19 ;
    public final void rule__Extension__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3419:1: ( ( ( RULE_STRING )* ) rule__Extension__Group__19 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3420:1: ( ( RULE_STRING )* ) rule__Extension__Group__19
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3420:1: ( ( RULE_STRING )* )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3421:1: ( RULE_STRING )*
            {
             before(grammarAccess.getExtensionAccess().getSTRINGTerminalRuleCall_18()); 
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3422:1: ( RULE_STRING )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_STRING) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3422:3: RULE_STRING
            	    {
            	    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Extension__Group__186593); 

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getExtensionAccess().getSTRINGTerminalRuleCall_18()); 

            }

            pushFollow(FOLLOW_rule__Extension__Group__19_in_rule__Extension__Group__186603);
            rule__Extension__Group__19();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Extension__Group__18


    // $ANTLR start rule__Extension__Group__19
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3433:1: rule__Extension__Group__19 : ( '}' ) ;
    public final void rule__Extension__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3437:1: ( ( '}' ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3438:1: ( '}' )
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3438:1: ( '}' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3439:1: '}'
            {
             before(grammarAccess.getExtensionAccess().getRightCurlyBracketKeyword_19()); 
            match(input,21,FOLLOW_21_in_rule__Extension__Group__196632); 
             after(grammarAccess.getExtensionAccess().getRightCurlyBracketKeyword_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Extension__Group__19


    // $ANTLR start rule__GroupId__Group__0
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3493:1: rule__GroupId__Group__0 : ( RULE_ID ) rule__GroupId__Group__1 ;
    public final void rule__GroupId__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3497:1: ( ( RULE_ID ) rule__GroupId__Group__1 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3498:1: ( RULE_ID ) rule__GroupId__Group__1
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3498:1: ( RULE_ID )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3499:1: RULE_ID
            {
             before(grammarAccess.getGroupIdAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GroupId__Group__06708); 
             after(grammarAccess.getGroupIdAccess().getIDTerminalRuleCall_0()); 

            }

            pushFollow(FOLLOW_rule__GroupId__Group__1_in_rule__GroupId__Group__06716);
            rule__GroupId__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__GroupId__Group__0


    // $ANTLR start rule__GroupId__Group__1
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3511:1: rule__GroupId__Group__1 : ( ( rule__GroupId__Alternatives_1 )? ) ;
    public final void rule__GroupId__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3515:1: ( ( ( rule__GroupId__Alternatives_1 )? ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3516:1: ( ( rule__GroupId__Alternatives_1 )? )
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3516:1: ( ( rule__GroupId__Alternatives_1 )? )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3517:1: ( rule__GroupId__Alternatives_1 )?
            {
             before(grammarAccess.getGroupIdAccess().getAlternatives_1()); 
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3518:1: ( rule__GroupId__Alternatives_1 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=13 && LA31_0<=14)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3518:2: rule__GroupId__Alternatives_1
                    {
                    pushFollow(FOLLOW_rule__GroupId__Alternatives_1_in_rule__GroupId__Group__16744);
                    rule__GroupId__Alternatives_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGroupIdAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__GroupId__Group__1


    // $ANTLR start rule__ArtifactId__Group__0
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3532:1: rule__ArtifactId__Group__0 : ( RULE_ID ) rule__ArtifactId__Group__1 ;
    public final void rule__ArtifactId__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3536:1: ( ( RULE_ID ) rule__ArtifactId__Group__1 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3537:1: ( RULE_ID ) rule__ArtifactId__Group__1
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3537:1: ( RULE_ID )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3538:1: RULE_ID
            {
             before(grammarAccess.getArtifactIdAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ArtifactId__Group__06783); 
             after(grammarAccess.getArtifactIdAccess().getIDTerminalRuleCall_0()); 

            }

            pushFollow(FOLLOW_rule__ArtifactId__Group__1_in_rule__ArtifactId__Group__06791);
            rule__ArtifactId__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ArtifactId__Group__0


    // $ANTLR start rule__ArtifactId__Group__1
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3550:1: rule__ArtifactId__Group__1 : ( ( rule__ArtifactId__Alternatives_1 )? ) ;
    public final void rule__ArtifactId__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3554:1: ( ( ( rule__ArtifactId__Alternatives_1 )? ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3555:1: ( ( rule__ArtifactId__Alternatives_1 )? )
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3555:1: ( ( rule__ArtifactId__Alternatives_1 )? )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3556:1: ( rule__ArtifactId__Alternatives_1 )?
            {
             before(grammarAccess.getArtifactIdAccess().getAlternatives_1()); 
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3557:1: ( rule__ArtifactId__Alternatives_1 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=13 && LA32_0<=14)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3557:2: rule__ArtifactId__Alternatives_1
                    {
                    pushFollow(FOLLOW_rule__ArtifactId__Alternatives_1_in_rule__ArtifactId__Group__16819);
                    rule__ArtifactId__Alternatives_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArtifactIdAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ArtifactId__Group__1


    // $ANTLR start rule__Version__Group__0
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3571:1: rule__Version__Group__0 : ( RULE_INT ) rule__Version__Group__1 ;
    public final void rule__Version__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3575:1: ( ( RULE_INT ) rule__Version__Group__1 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3576:1: ( RULE_INT ) rule__Version__Group__1
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3576:1: ( RULE_INT )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3577:1: RULE_INT
            {
             before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Version__Group__06858); 
             after(grammarAccess.getVersionAccess().getINTTerminalRuleCall_0()); 

            }

            pushFollow(FOLLOW_rule__Version__Group__1_in_rule__Version__Group__06866);
            rule__Version__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Version__Group__0


    // $ANTLR start rule__Version__Group__1
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3589:1: rule__Version__Group__1 : ( ( rule__Version__Group_1__0 )* ) ;
    public final void rule__Version__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3593:1: ( ( ( rule__Version__Group_1__0 )* ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3594:1: ( ( rule__Version__Group_1__0 )* )
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3594:1: ( ( rule__Version__Group_1__0 )* )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3595:1: ( rule__Version__Group_1__0 )*
            {
             before(grammarAccess.getVersionAccess().getGroup_1()); 
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3596:1: ( rule__Version__Group_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==13) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3596:2: rule__Version__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Version__Group_1__0_in_rule__Version__Group__16894);
            	    rule__Version__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getVersionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Version__Group__1


    // $ANTLR start rule__Version__Group_1__0
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3610:1: rule__Version__Group_1__0 : ( '.' ) rule__Version__Group_1__1 ;
    public final void rule__Version__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3614:1: ( ( '.' ) rule__Version__Group_1__1 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3615:1: ( '.' ) rule__Version__Group_1__1
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3615:1: ( '.' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3616:1: '.'
            {
             before(grammarAccess.getVersionAccess().getFullStopKeyword_1_0()); 
            match(input,13,FOLLOW_13_in_rule__Version__Group_1__06934); 
             after(grammarAccess.getVersionAccess().getFullStopKeyword_1_0()); 

            }

            pushFollow(FOLLOW_rule__Version__Group_1__1_in_rule__Version__Group_1__06944);
            rule__Version__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Version__Group_1__0


    // $ANTLR start rule__Version__Group_1__1
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3630:1: rule__Version__Group_1__1 : ( RULE_INT ) ;
    public final void rule__Version__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3634:1: ( ( RULE_INT ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3635:1: ( RULE_INT )
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3635:1: ( RULE_INT )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3636:1: RULE_INT
            {
             before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Version__Group_1__16972); 
             after(grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Version__Group_1__1


    // $ANTLR start rule__Import__Group__0
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3652:1: rule__Import__Group__0 : ( 'import' ) rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3656:1: ( ( 'import' ) rule__Import__Group__1 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3657:1: ( 'import' ) rule__Import__Group__1
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3657:1: ( 'import' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3658:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__Import__Group__07011); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__07021);
            rule__Import__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Import__Group__0


    // $ANTLR start rule__Import__Group__1
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3672:1: rule__Import__Group__1 : ( ( rule__Import__ImportURIAssignment_1 ) ) ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3676:1: ( ( ( rule__Import__ImportURIAssignment_1 ) ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3677:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3677:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3678:1: ( rule__Import__ImportURIAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportURIAssignment_1()); 
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3679:1: ( rule__Import__ImportURIAssignment_1 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3679:2: rule__Import__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportURIAssignment_1_in_rule__Import__Group__17049);
            rule__Import__ImportURIAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getImportAccess().getImportURIAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Import__Group__1


    // $ANTLR start rule__SimpleType__Group__0
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3693:1: rule__SimpleType__Group__0 : ( 'type' ) rule__SimpleType__Group__1 ;
    public final void rule__SimpleType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3697:1: ( ( 'type' ) rule__SimpleType__Group__1 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3698:1: ( 'type' ) rule__SimpleType__Group__1
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3698:1: ( 'type' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3699:1: 'type'
            {
             before(grammarAccess.getSimpleTypeAccess().getTypeKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__SimpleType__Group__07088); 
             after(grammarAccess.getSimpleTypeAccess().getTypeKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__SimpleType__Group__1_in_rule__SimpleType__Group__07098);
            rule__SimpleType__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SimpleType__Group__0


    // $ANTLR start rule__SimpleType__Group__1
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3713:1: rule__SimpleType__Group__1 : ( ( rule__SimpleType__NameAssignment_1 ) ) ;
    public final void rule__SimpleType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3717:1: ( ( ( rule__SimpleType__NameAssignment_1 ) ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3718:1: ( ( rule__SimpleType__NameAssignment_1 ) )
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3718:1: ( ( rule__SimpleType__NameAssignment_1 ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3719:1: ( rule__SimpleType__NameAssignment_1 )
            {
             before(grammarAccess.getSimpleTypeAccess().getNameAssignment_1()); 
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3720:1: ( rule__SimpleType__NameAssignment_1 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3720:2: rule__SimpleType__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SimpleType__NameAssignment_1_in_rule__SimpleType__Group__17126);
            rule__SimpleType__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getSimpleTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SimpleType__Group__1


    // $ANTLR start rule__Entity__Group__0
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3734:1: rule__Entity__Group__0 : ( 'entity' ) rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3738:1: ( ( 'entity' ) rule__Entity__Group__1 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3739:1: ( 'entity' ) rule__Entity__Group__1
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3739:1: ( 'entity' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3740:1: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,36,FOLLOW_36_in_rule__Entity__Group__07165); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__07175);
            rule__Entity__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__0


    // $ANTLR start rule__Entity__Group__1
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3754:1: rule__Entity__Group__1 : ( ( rule__Entity__NameAssignment_1 ) ) rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3758:1: ( ( ( rule__Entity__NameAssignment_1 ) ) rule__Entity__Group__2 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3759:1: ( ( rule__Entity__NameAssignment_1 ) ) rule__Entity__Group__2
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3759:1: ( ( rule__Entity__NameAssignment_1 ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3760:1: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3761:1: ( rule__Entity__NameAssignment_1 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3761:2: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__17203);
            rule__Entity__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__17212);
            rule__Entity__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__1


    // $ANTLR start rule__Entity__Group__2
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3772:1: rule__Entity__Group__2 : ( ( rule__Entity__Group_2__0 )? ) rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3776:1: ( ( ( rule__Entity__Group_2__0 )? ) rule__Entity__Group__3 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3777:1: ( ( rule__Entity__Group_2__0 )? ) rule__Entity__Group__3
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3777:1: ( ( rule__Entity__Group_2__0 )? )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3778:1: ( rule__Entity__Group_2__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_2()); 
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3779:1: ( rule__Entity__Group_2__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==37) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3779:2: rule__Entity__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Entity__Group_2__0_in_rule__Entity__Group__27240);
                    rule__Entity__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_2()); 

            }

            pushFollow(FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__27250);
            rule__Entity__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__2


    // $ANTLR start rule__Entity__Group__3
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3790:1: rule__Entity__Group__3 : ( '{' ) rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3794:1: ( ( '{' ) rule__Entity__Group__4 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3795:1: ( '{' ) rule__Entity__Group__4
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3795:1: ( '{' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3796:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,16,FOLLOW_16_in_rule__Entity__Group__37279); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__37289);
            rule__Entity__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__3


    // $ANTLR start rule__Entity__Group__4
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3810:1: rule__Entity__Group__4 : ( ( rule__Entity__PropertiesAssignment_4 )* ) rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3814:1: ( ( ( rule__Entity__PropertiesAssignment_4 )* ) rule__Entity__Group__5 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3815:1: ( ( rule__Entity__PropertiesAssignment_4 )* ) rule__Entity__Group__5
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3815:1: ( ( rule__Entity__PropertiesAssignment_4 )* )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3816:1: ( rule__Entity__PropertiesAssignment_4 )*
            {
             before(grammarAccess.getEntityAccess().getPropertiesAssignment_4()); 
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3817:1: ( rule__Entity__PropertiesAssignment_4 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==38) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3817:2: rule__Entity__PropertiesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Entity__PropertiesAssignment_4_in_rule__Entity__Group__47317);
            	    rule__Entity__PropertiesAssignment_4();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getPropertiesAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__47327);
            rule__Entity__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__4


    // $ANTLR start rule__Entity__Group__5
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3828:1: rule__Entity__Group__5 : ( '}' ) ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3832:1: ( ( '}' ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3833:1: ( '}' )
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3833:1: ( '}' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3834:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 
            match(input,21,FOLLOW_21_in_rule__Entity__Group__57356); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__5


    // $ANTLR start rule__Entity__Group_2__0
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3859:1: rule__Entity__Group_2__0 : ( 'extends' ) rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3863:1: ( ( 'extends' ) rule__Entity__Group_2__1 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3864:1: ( 'extends' ) rule__Entity__Group_2__1
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3864:1: ( 'extends' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3865:1: 'extends'
            {
             before(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 
            match(input,37,FOLLOW_37_in_rule__Entity__Group_2__07404); 
             after(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 

            }

            pushFollow(FOLLOW_rule__Entity__Group_2__1_in_rule__Entity__Group_2__07414);
            rule__Entity__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group_2__0


    // $ANTLR start rule__Entity__Group_2__1
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3879:1: rule__Entity__Group_2__1 : ( ( rule__Entity__ExtendsAssignment_2_1 ) ) ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3883:1: ( ( ( rule__Entity__ExtendsAssignment_2_1 ) ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3884:1: ( ( rule__Entity__ExtendsAssignment_2_1 ) )
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3884:1: ( ( rule__Entity__ExtendsAssignment_2_1 ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3885:1: ( rule__Entity__ExtendsAssignment_2_1 )
            {
             before(grammarAccess.getEntityAccess().getExtendsAssignment_2_1()); 
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3886:1: ( rule__Entity__ExtendsAssignment_2_1 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3886:2: rule__Entity__ExtendsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Entity__ExtendsAssignment_2_1_in_rule__Entity__Group_2__17442);
            rule__Entity__ExtendsAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getEntityAccess().getExtendsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group_2__1


    // $ANTLR start rule__Property__Group__0
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3900:1: rule__Property__Group__0 : ( 'property' ) rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3904:1: ( ( 'property' ) rule__Property__Group__1 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3905:1: ( 'property' ) rule__Property__Group__1
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3905:1: ( 'property' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3906:1: 'property'
            {
             before(grammarAccess.getPropertyAccess().getPropertyKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__Property__Group__07481); 
             after(grammarAccess.getPropertyAccess().getPropertyKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Property__Group__1_in_rule__Property__Group__07491);
            rule__Property__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__Group__0


    // $ANTLR start rule__Property__Group__1
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3920:1: rule__Property__Group__1 : ( ( rule__Property__NameAssignment_1 ) ) rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3924:1: ( ( ( rule__Property__NameAssignment_1 ) ) rule__Property__Group__2 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3925:1: ( ( rule__Property__NameAssignment_1 ) ) rule__Property__Group__2
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3925:1: ( ( rule__Property__NameAssignment_1 ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3926:1: ( rule__Property__NameAssignment_1 )
            {
             before(grammarAccess.getPropertyAccess().getNameAssignment_1()); 
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3927:1: ( rule__Property__NameAssignment_1 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3927:2: rule__Property__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Property__NameAssignment_1_in_rule__Property__Group__17519);
            rule__Property__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getPropertyAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Property__Group__2_in_rule__Property__Group__17528);
            rule__Property__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__Group__1


    // $ANTLR start rule__Property__Group__2
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3938:1: rule__Property__Group__2 : ( ':' ) rule__Property__Group__3 ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3942:1: ( ( ':' ) rule__Property__Group__3 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3943:1: ( ':' ) rule__Property__Group__3
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3943:1: ( ':' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3944:1: ':'
            {
             before(grammarAccess.getPropertyAccess().getColonKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__Property__Group__27557); 
             after(grammarAccess.getPropertyAccess().getColonKeyword_2()); 

            }

            pushFollow(FOLLOW_rule__Property__Group__3_in_rule__Property__Group__27567);
            rule__Property__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__Group__2


    // $ANTLR start rule__Property__Group__3
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3958:1: rule__Property__Group__3 : ( ( rule__Property__TypeAssignment_3 ) ) rule__Property__Group__4 ;
    public final void rule__Property__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3962:1: ( ( ( rule__Property__TypeAssignment_3 ) ) rule__Property__Group__4 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3963:1: ( ( rule__Property__TypeAssignment_3 ) ) rule__Property__Group__4
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3963:1: ( ( rule__Property__TypeAssignment_3 ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3964:1: ( rule__Property__TypeAssignment_3 )
            {
             before(grammarAccess.getPropertyAccess().getTypeAssignment_3()); 
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3965:1: ( rule__Property__TypeAssignment_3 )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3965:2: rule__Property__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Property__TypeAssignment_3_in_rule__Property__Group__37595);
            rule__Property__TypeAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getPropertyAccess().getTypeAssignment_3()); 

            }

            pushFollow(FOLLOW_rule__Property__Group__4_in_rule__Property__Group__37604);
            rule__Property__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__Group__3


    // $ANTLR start rule__Property__Group__4
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3976:1: rule__Property__Group__4 : ( ( rule__Property__ManyAssignment_4 )? ) ;
    public final void rule__Property__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3980:1: ( ( ( rule__Property__ManyAssignment_4 )? ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3981:1: ( ( rule__Property__ManyAssignment_4 )? )
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3981:1: ( ( rule__Property__ManyAssignment_4 )? )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3982:1: ( rule__Property__ManyAssignment_4 )?
            {
             before(grammarAccess.getPropertyAccess().getManyAssignment_4()); 
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3983:1: ( rule__Property__ManyAssignment_4 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==39) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:3983:2: rule__Property__ManyAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Property__ManyAssignment_4_in_rule__Property__Group__47632);
                    rule__Property__ManyAssignment_4();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyAccess().getManyAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__Group__4


    // $ANTLR start rule__Project__GroupIdAssignment_4
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4003:1: rule__Project__GroupIdAssignment_4 : ( ruleGroupId ) ;
    public final void rule__Project__GroupIdAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4007:1: ( ( ruleGroupId ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4008:1: ( ruleGroupId )
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4008:1: ( ruleGroupId )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4009:1: ruleGroupId
            {
             before(grammarAccess.getProjectAccess().getGroupIdGroupIdParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleGroupId_in_rule__Project__GroupIdAssignment_47677);
            ruleGroupId();
            _fsp--;

             after(grammarAccess.getProjectAccess().getGroupIdGroupIdParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Project__GroupIdAssignment_4


    // $ANTLR start rule__Project__ArtifactIdAssignment_7
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4018:1: rule__Project__ArtifactIdAssignment_7 : ( ruleArtifactId ) ;
    public final void rule__Project__ArtifactIdAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4022:1: ( ( ruleArtifactId ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4023:1: ( ruleArtifactId )
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4023:1: ( ruleArtifactId )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4024:1: ruleArtifactId
            {
             before(grammarAccess.getProjectAccess().getArtifactIdArtifactIdParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleArtifactId_in_rule__Project__ArtifactIdAssignment_77708);
            ruleArtifactId();
            _fsp--;

             after(grammarAccess.getProjectAccess().getArtifactIdArtifactIdParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Project__ArtifactIdAssignment_7


    // $ANTLR start rule__Project__VersionAssignment_10
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4033:1: rule__Project__VersionAssignment_10 : ( ruleVersion ) ;
    public final void rule__Project__VersionAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4037:1: ( ( ruleVersion ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4038:1: ( ruleVersion )
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4038:1: ( ruleVersion )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4039:1: ruleVersion
            {
             before(grammarAccess.getProjectAccess().getVersionVersionParserRuleCall_10_0()); 
            pushFollow(FOLLOW_ruleVersion_in_rule__Project__VersionAssignment_107739);
            ruleVersion();
            _fsp--;

             after(grammarAccess.getProjectAccess().getVersionVersionParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Project__VersionAssignment_10


    // $ANTLR start rule__Project__DependenciesAssignment_11_2
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4048:1: rule__Project__DependenciesAssignment_11_2 : ( ruleDependency ) ;
    public final void rule__Project__DependenciesAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4052:1: ( ( ruleDependency ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4053:1: ( ruleDependency )
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4053:1: ( ruleDependency )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4054:1: ruleDependency
            {
             before(grammarAccess.getProjectAccess().getDependenciesDependencyParserRuleCall_11_2_0()); 
            pushFollow(FOLLOW_ruleDependency_in_rule__Project__DependenciesAssignment_11_27770);
            ruleDependency();
            _fsp--;

             after(grammarAccess.getProjectAccess().getDependenciesDependencyParserRuleCall_11_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Project__DependenciesAssignment_11_2


    // $ANTLR start rule__Project__MappedDependenciesAssignment_12_2
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4063:1: rule__Project__MappedDependenciesAssignment_12_2 : ( ruleMappedDependency ) ;
    public final void rule__Project__MappedDependenciesAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4067:1: ( ( ruleMappedDependency ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4068:1: ( ruleMappedDependency )
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4068:1: ( ruleMappedDependency )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4069:1: ruleMappedDependency
            {
             before(grammarAccess.getProjectAccess().getMappedDependenciesMappedDependencyParserRuleCall_12_2_0()); 
            pushFollow(FOLLOW_ruleMappedDependency_in_rule__Project__MappedDependenciesAssignment_12_27801);
            ruleMappedDependency();
            _fsp--;

             after(grammarAccess.getProjectAccess().getMappedDependenciesMappedDependencyParserRuleCall_12_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Project__MappedDependenciesAssignment_12_2


    // $ANTLR start rule__Project__PluginsAssignment_13_2
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4078:1: rule__Project__PluginsAssignment_13_2 : ( rulePlugin ) ;
    public final void rule__Project__PluginsAssignment_13_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4082:1: ( ( rulePlugin ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4083:1: ( rulePlugin )
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4083:1: ( rulePlugin )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4084:1: rulePlugin
            {
             before(grammarAccess.getProjectAccess().getPluginsPluginParserRuleCall_13_2_0()); 
            pushFollow(FOLLOW_rulePlugin_in_rule__Project__PluginsAssignment_13_27832);
            rulePlugin();
            _fsp--;

             after(grammarAccess.getProjectAccess().getPluginsPluginParserRuleCall_13_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Project__PluginsAssignment_13_2


    // $ANTLR start rule__Project__ExtensionsAssignment_14_2
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4093:1: rule__Project__ExtensionsAssignment_14_2 : ( ruleExtension ) ;
    public final void rule__Project__ExtensionsAssignment_14_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4097:1: ( ( ruleExtension ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4098:1: ( ruleExtension )
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4098:1: ( ruleExtension )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4099:1: ruleExtension
            {
             before(grammarAccess.getProjectAccess().getExtensionsExtensionParserRuleCall_14_2_0()); 
            pushFollow(FOLLOW_ruleExtension_in_rule__Project__ExtensionsAssignment_14_27863);
            ruleExtension();
            _fsp--;

             after(grammarAccess.getProjectAccess().getExtensionsExtensionParserRuleCall_14_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Project__ExtensionsAssignment_14_2


    // $ANTLR start rule__GA__GroupIdAssignment_2
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4108:1: rule__GA__GroupIdAssignment_2 : ( ruleGroupId ) ;
    public final void rule__GA__GroupIdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4112:1: ( ( ruleGroupId ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4113:1: ( ruleGroupId )
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4113:1: ( ruleGroupId )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4114:1: ruleGroupId
            {
             before(grammarAccess.getGAAccess().getGroupIdGroupIdParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleGroupId_in_rule__GA__GroupIdAssignment_27894);
            ruleGroupId();
            _fsp--;

             after(grammarAccess.getGAAccess().getGroupIdGroupIdParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__GA__GroupIdAssignment_2


    // $ANTLR start rule__GA__ArtifactIdAssignment_6
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4123:1: rule__GA__ArtifactIdAssignment_6 : ( ruleArtifactId ) ;
    public final void rule__GA__ArtifactIdAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4127:1: ( ( ruleArtifactId ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4128:1: ( ruleArtifactId )
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4128:1: ( ruleArtifactId )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4129:1: ruleArtifactId
            {
             before(grammarAccess.getGAAccess().getArtifactIdArtifactIdParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleArtifactId_in_rule__GA__ArtifactIdAssignment_67925);
            ruleArtifactId();
            _fsp--;

             after(grammarAccess.getGAAccess().getArtifactIdArtifactIdParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__GA__ArtifactIdAssignment_6


    // $ANTLR start rule__Dependency__GroupIdAssignment_2
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4138:1: rule__Dependency__GroupIdAssignment_2 : ( ruleGroupId ) ;
    public final void rule__Dependency__GroupIdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4142:1: ( ( ruleGroupId ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4143:1: ( ruleGroupId )
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4143:1: ( ruleGroupId )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4144:1: ruleGroupId
            {
             before(grammarAccess.getDependencyAccess().getGroupIdGroupIdParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleGroupId_in_rule__Dependency__GroupIdAssignment_27956);
            ruleGroupId();
            _fsp--;

             after(grammarAccess.getDependencyAccess().getGroupIdGroupIdParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Dependency__GroupIdAssignment_2


    // $ANTLR start rule__Dependency__ArtifactIdAssignment_6
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4153:1: rule__Dependency__ArtifactIdAssignment_6 : ( ruleArtifactId ) ;
    public final void rule__Dependency__ArtifactIdAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4157:1: ( ( ruleArtifactId ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4158:1: ( ruleArtifactId )
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4158:1: ( ruleArtifactId )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4159:1: ruleArtifactId
            {
             before(grammarAccess.getDependencyAccess().getArtifactIdArtifactIdParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleArtifactId_in_rule__Dependency__ArtifactIdAssignment_67987);
            ruleArtifactId();
            _fsp--;

             after(grammarAccess.getDependencyAccess().getArtifactIdArtifactIdParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Dependency__ArtifactIdAssignment_6


    // $ANTLR start rule__Dependency__VersionAssignment_10
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4168:1: rule__Dependency__VersionAssignment_10 : ( ruleVersion ) ;
    public final void rule__Dependency__VersionAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4172:1: ( ( ruleVersion ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4173:1: ( ruleVersion )
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4173:1: ( ruleVersion )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4174:1: ruleVersion
            {
             before(grammarAccess.getDependencyAccess().getVersionVersionParserRuleCall_10_0()); 
            pushFollow(FOLLOW_ruleVersion_in_rule__Dependency__VersionAssignment_108018);
            ruleVersion();
            _fsp--;

             after(grammarAccess.getDependencyAccess().getVersionVersionParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Dependency__VersionAssignment_10


    // $ANTLR start rule__Dependency__ExclusionsAssignment_15_3
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4183:1: rule__Dependency__ExclusionsAssignment_15_3 : ( ruleGA ) ;
    public final void rule__Dependency__ExclusionsAssignment_15_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4187:1: ( ( ruleGA ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4188:1: ( ruleGA )
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4188:1: ( ruleGA )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4189:1: ruleGA
            {
             before(grammarAccess.getDependencyAccess().getExclusionsGAParserRuleCall_15_3_0()); 
            pushFollow(FOLLOW_ruleGA_in_rule__Dependency__ExclusionsAssignment_15_38049);
            ruleGA();
            _fsp--;

             after(grammarAccess.getDependencyAccess().getExclusionsGAParserRuleCall_15_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Dependency__ExclusionsAssignment_15_3


    // $ANTLR start rule__MappedDependency__GroupIdAssignment_4_3
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4198:1: rule__MappedDependency__GroupIdAssignment_4_3 : ( ruleGroupId ) ;
    public final void rule__MappedDependency__GroupIdAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4202:1: ( ( ruleGroupId ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4203:1: ( ruleGroupId )
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4203:1: ( ruleGroupId )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4204:1: ruleGroupId
            {
             before(grammarAccess.getMappedDependencyAccess().getGroupIdGroupIdParserRuleCall_4_3_0()); 
            pushFollow(FOLLOW_ruleGroupId_in_rule__MappedDependency__GroupIdAssignment_4_38080);
            ruleGroupId();
            _fsp--;

             after(grammarAccess.getMappedDependencyAccess().getGroupIdGroupIdParserRuleCall_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MappedDependency__GroupIdAssignment_4_3


    // $ANTLR start rule__MappedDependency__ArtifactIdAssignment_5_3
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4213:1: rule__MappedDependency__ArtifactIdAssignment_5_3 : ( ruleArtifactId ) ;
    public final void rule__MappedDependency__ArtifactIdAssignment_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4217:1: ( ( ruleArtifactId ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4218:1: ( ruleArtifactId )
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4218:1: ( ruleArtifactId )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4219:1: ruleArtifactId
            {
             before(grammarAccess.getMappedDependencyAccess().getArtifactIdArtifactIdParserRuleCall_5_3_0()); 
            pushFollow(FOLLOW_ruleArtifactId_in_rule__MappedDependency__ArtifactIdAssignment_5_38111);
            ruleArtifactId();
            _fsp--;

             after(grammarAccess.getMappedDependencyAccess().getArtifactIdArtifactIdParserRuleCall_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MappedDependency__ArtifactIdAssignment_5_3


    // $ANTLR start rule__MappedDependency__VersionAssignment_6_3
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4228:1: rule__MappedDependency__VersionAssignment_6_3 : ( ruleVersion ) ;
    public final void rule__MappedDependency__VersionAssignment_6_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4232:1: ( ( ruleVersion ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4233:1: ( ruleVersion )
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4233:1: ( ruleVersion )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4234:1: ruleVersion
            {
             before(grammarAccess.getMappedDependencyAccess().getVersionVersionParserRuleCall_6_3_0()); 
            pushFollow(FOLLOW_ruleVersion_in_rule__MappedDependency__VersionAssignment_6_38142);
            ruleVersion();
            _fsp--;

             after(grammarAccess.getMappedDependencyAccess().getVersionVersionParserRuleCall_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MappedDependency__VersionAssignment_6_3


    // $ANTLR start rule__Plugin__GroupIdAssignment_2
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4243:1: rule__Plugin__GroupIdAssignment_2 : ( ruleGroupId ) ;
    public final void rule__Plugin__GroupIdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4247:1: ( ( ruleGroupId ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4248:1: ( ruleGroupId )
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4248:1: ( ruleGroupId )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4249:1: ruleGroupId
            {
             before(grammarAccess.getPluginAccess().getGroupIdGroupIdParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleGroupId_in_rule__Plugin__GroupIdAssignment_28173);
            ruleGroupId();
            _fsp--;

             after(grammarAccess.getPluginAccess().getGroupIdGroupIdParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Plugin__GroupIdAssignment_2


    // $ANTLR start rule__Plugin__ArtifactIdAssignment_6
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4258:1: rule__Plugin__ArtifactIdAssignment_6 : ( ruleArtifactId ) ;
    public final void rule__Plugin__ArtifactIdAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4262:1: ( ( ruleArtifactId ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4263:1: ( ruleArtifactId )
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4263:1: ( ruleArtifactId )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4264:1: ruleArtifactId
            {
             before(grammarAccess.getPluginAccess().getArtifactIdArtifactIdParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleArtifactId_in_rule__Plugin__ArtifactIdAssignment_68204);
            ruleArtifactId();
            _fsp--;

             after(grammarAccess.getPluginAccess().getArtifactIdArtifactIdParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Plugin__ArtifactIdAssignment_6


    // $ANTLR start rule__Plugin__VersionAssignment_10
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4273:1: rule__Plugin__VersionAssignment_10 : ( ruleVersion ) ;
    public final void rule__Plugin__VersionAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4277:1: ( ( ruleVersion ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4278:1: ( ruleVersion )
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4278:1: ( ruleVersion )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4279:1: ruleVersion
            {
             before(grammarAccess.getPluginAccess().getVersionVersionParserRuleCall_10_0()); 
            pushFollow(FOLLOW_ruleVersion_in_rule__Plugin__VersionAssignment_108235);
            ruleVersion();
            _fsp--;

             after(grammarAccess.getPluginAccess().getVersionVersionParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Plugin__VersionAssignment_10


    // $ANTLR start rule__Extension__GroupIdAssignment_2
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4288:1: rule__Extension__GroupIdAssignment_2 : ( ruleGroupId ) ;
    public final void rule__Extension__GroupIdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4292:1: ( ( ruleGroupId ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4293:1: ( ruleGroupId )
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4293:1: ( ruleGroupId )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4294:1: ruleGroupId
            {
             before(grammarAccess.getExtensionAccess().getGroupIdGroupIdParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleGroupId_in_rule__Extension__GroupIdAssignment_28266);
            ruleGroupId();
            _fsp--;

             after(grammarAccess.getExtensionAccess().getGroupIdGroupIdParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Extension__GroupIdAssignment_2


    // $ANTLR start rule__Extension__ArtifactIdAssignment_6
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4303:1: rule__Extension__ArtifactIdAssignment_6 : ( ruleArtifactId ) ;
    public final void rule__Extension__ArtifactIdAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4307:1: ( ( ruleArtifactId ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4308:1: ( ruleArtifactId )
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4308:1: ( ruleArtifactId )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4309:1: ruleArtifactId
            {
             before(grammarAccess.getExtensionAccess().getArtifactIdArtifactIdParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleArtifactId_in_rule__Extension__ArtifactIdAssignment_68297);
            ruleArtifactId();
            _fsp--;

             after(grammarAccess.getExtensionAccess().getArtifactIdArtifactIdParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Extension__ArtifactIdAssignment_6


    // $ANTLR start rule__Extension__VersionAssignment_10
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4318:1: rule__Extension__VersionAssignment_10 : ( ruleVersion ) ;
    public final void rule__Extension__VersionAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4322:1: ( ( ruleVersion ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4323:1: ( ruleVersion )
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4323:1: ( ruleVersion )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4324:1: ruleVersion
            {
             before(grammarAccess.getExtensionAccess().getVersionVersionParserRuleCall_10_0()); 
            pushFollow(FOLLOW_ruleVersion_in_rule__Extension__VersionAssignment_108328);
            ruleVersion();
            _fsp--;

             after(grammarAccess.getExtensionAccess().getVersionVersionParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Extension__VersionAssignment_10


    // $ANTLR start rule__Import__ImportURIAssignment_1
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4335:1: rule__Import__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4339:1: ( ( RULE_STRING ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4340:1: ( RULE_STRING )
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4340:1: ( RULE_STRING )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4341:1: RULE_STRING
            {
             before(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Import__ImportURIAssignment_18361); 
             after(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Import__ImportURIAssignment_1


    // $ANTLR start rule__SimpleType__NameAssignment_1
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4350:1: rule__SimpleType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SimpleType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4354:1: ( ( RULE_ID ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4355:1: ( RULE_ID )
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4355:1: ( RULE_ID )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4356:1: RULE_ID
            {
             before(grammarAccess.getSimpleTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SimpleType__NameAssignment_18392); 
             after(grammarAccess.getSimpleTypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SimpleType__NameAssignment_1


    // $ANTLR start rule__Entity__NameAssignment_1
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4365:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4369:1: ( ( RULE_ID ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4370:1: ( RULE_ID )
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4370:1: ( RULE_ID )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4371:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_18423); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__NameAssignment_1


    // $ANTLR start rule__Entity__ExtendsAssignment_2_1
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4380:1: rule__Entity__ExtendsAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__ExtendsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4384:1: ( ( ( RULE_ID ) ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4385:1: ( ( RULE_ID ) )
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4385:1: ( ( RULE_ID ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4386:1: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getExtendsEntityCrossReference_2_1_0()); 
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4387:1: ( RULE_ID )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4388:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getExtendsEntityIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__ExtendsAssignment_2_18458); 
             after(grammarAccess.getEntityAccess().getExtendsEntityIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getEntityAccess().getExtendsEntityCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__ExtendsAssignment_2_1


    // $ANTLR start rule__Entity__PropertiesAssignment_4
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4399:1: rule__Entity__PropertiesAssignment_4 : ( ruleProperty ) ;
    public final void rule__Entity__PropertiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4403:1: ( ( ruleProperty ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4404:1: ( ruleProperty )
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4404:1: ( ruleProperty )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4405:1: ruleProperty
            {
             before(grammarAccess.getEntityAccess().getPropertiesPropertyParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleProperty_in_rule__Entity__PropertiesAssignment_48493);
            ruleProperty();
            _fsp--;

             after(grammarAccess.getEntityAccess().getPropertiesPropertyParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__PropertiesAssignment_4


    // $ANTLR start rule__Property__NameAssignment_1
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4414:1: rule__Property__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Property__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4418:1: ( ( RULE_ID ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4419:1: ( RULE_ID )
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4419:1: ( RULE_ID )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4420:1: RULE_ID
            {
             before(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Property__NameAssignment_18524); 
             after(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__NameAssignment_1


    // $ANTLR start rule__Property__TypeAssignment_3
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4429:1: rule__Property__TypeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Property__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4433:1: ( ( ( RULE_ID ) ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4434:1: ( ( RULE_ID ) )
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4434:1: ( ( RULE_ID ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4435:1: ( RULE_ID )
            {
             before(grammarAccess.getPropertyAccess().getTypeTypeCrossReference_3_0()); 
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4436:1: ( RULE_ID )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4437:1: RULE_ID
            {
             before(grammarAccess.getPropertyAccess().getTypeTypeIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Property__TypeAssignment_38559); 
             after(grammarAccess.getPropertyAccess().getTypeTypeIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getPropertyAccess().getTypeTypeCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__TypeAssignment_3


    // $ANTLR start rule__Property__ManyAssignment_4
    // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4448:1: rule__Property__ManyAssignment_4 : ( ( '[]' ) ) ;
    public final void rule__Property__ManyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4452:1: ( ( ( '[]' ) ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4453:1: ( ( '[]' ) )
            {
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4453:1: ( ( '[]' ) )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4454:1: ( '[]' )
            {
             before(grammarAccess.getPropertyAccess().getManyLeftSquareBracketRightSquareBracketKeyword_4_0()); 
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4455:1: ( '[]' )
            // ../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g:4456:1: '[]'
            {
             before(grammarAccess.getPropertyAccess().getManyLeftSquareBracketRightSquareBracketKeyword_4_0()); 
            match(input,39,FOLLOW_39_in_rule__Property__ManyAssignment_48599); 
             after(grammarAccess.getPropertyAccess().getManyLeftSquareBracketRightSquareBracketKeyword_4_0()); 

            }

             after(grammarAccess.getPropertyAccess().getManyLeftSquareBracketRightSquareBracketKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__ManyAssignment_4


 

    public static final BitSet FOLLOW_ruleProject_in_entryRuleProject60 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProject67 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group__0_in_ruleProject94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGA_in_entryRuleGA120 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGA127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GA__Group__0_in_ruleGA154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependency_in_entryRuleDependency180 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependency187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependency__Group__0_in_ruleDependency214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMappedDependency_in_entryRuleMappedDependency240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMappedDependency247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MappedDependency__Group__0_in_ruleMappedDependency274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlugin_in_entryRulePlugin300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlugin307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plugin__Group__0_in_rulePlugin334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtension_in_entryRuleExtension360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtension367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Extension__Group__0_in_ruleExtension394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupId_in_entryRuleGroupId422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroupId429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GroupId__Group__0_in_ruleGroupId456 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleArtifactId_in_entryRuleArtifactId483 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArtifactId490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArtifactId__Group__0_in_ruleArtifactId517 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleVersion_in_entryRuleVersion544 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVersion551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group__0_in_ruleVersion578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport606 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType666 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_entryRuleSimpleType726 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleType733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__Group__0_in_ruleSimpleType760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity786 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0_in_ruleEntity820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty846 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__0_in_ruleProperty880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependency__Group_11_0__0_in_rule__Dependency__Alternatives_11916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Dependency__Alternatives_11935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__MappedDependency__Alternatives_0970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__MappedDependency__Alternatives_0990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__GroupId__Alternatives_11027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__GroupId__Alternatives_11047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ArtifactId__Alternatives_11082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ArtifactId__Alternatives_11102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_rule__Type__Alternatives1136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Type__Alternatives1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Project__Group__01188 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Project__Group__1_in_rule__Project__Group__01198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Project__Group__11227 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Project__Group__2_in_rule__Project__Group__11237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Project__Group__21266 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Project__Group__3_in_rule__Project__Group__21276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Project__Group__31305 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_rule__Project__Group__4_in_rule__Project__Group__31315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__GroupIdAssignment_4_in_rule__Project__Group__41343 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Project__Group__5_in_rule__Project__Group__41352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Project__Group__51381 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Project__Group__6_in_rule__Project__Group__51391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Project__Group__61420 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_rule__Project__Group__7_in_rule__Project__Group__61430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__ArtifactIdAssignment_7_in_rule__Project__Group__71458 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Project__Group__8_in_rule__Project__Group__71467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Project__Group__81496 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Project__Group__9_in_rule__Project__Group__81506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Project__Group__91535 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Project__Group__10_in_rule__Project__Group__91545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__VersionAssignment_10_in_rule__Project__Group__101573 = new BitSet(new long[]{0x0000000003E00000L});
    public static final BitSet FOLLOW_rule__Project__Group__11_in_rule__Project__Group__101582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_11__0_in_rule__Project__Group__111610 = new BitSet(new long[]{0x0000000003A00000L});
    public static final BitSet FOLLOW_rule__Project__Group__12_in_rule__Project__Group__111620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_12__0_in_rule__Project__Group__121648 = new BitSet(new long[]{0x0000000003200000L});
    public static final BitSet FOLLOW_rule__Project__Group__13_in_rule__Project__Group__121658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_13__0_in_rule__Project__Group__131686 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_rule__Project__Group__14_in_rule__Project__Group__131696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_14__0_in_rule__Project__Group__141724 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Project__Group__15_in_rule__Project__Group__141734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Project__Group__151763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Project__Group_11__01831 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Project__Group_11__1_in_rule__Project__Group_11__01841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Project__Group_11__11870 = new BitSet(new long[]{0x0000000000220000L});
    public static final BitSet FOLLOW_rule__Project__Group_11__2_in_rule__Project__Group_11__11880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__DependenciesAssignment_11_2_in_rule__Project__Group_11__21908 = new BitSet(new long[]{0x0000000000220000L});
    public static final BitSet FOLLOW_rule__Project__Group_11__3_in_rule__Project__Group_11__21918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Project__Group_11__31947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Project__Group_12__01991 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Project__Group_12__1_in_rule__Project__Group_12__02001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Project__Group_12__12030 = new BitSet(new long[]{0x0000000000201800L});
    public static final BitSet FOLLOW_rule__Project__Group_12__2_in_rule__Project__Group_12__12040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__MappedDependenciesAssignment_12_2_in_rule__Project__Group_12__22068 = new BitSet(new long[]{0x0000000000201800L});
    public static final BitSet FOLLOW_rule__Project__Group_12__3_in_rule__Project__Group_12__22078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Project__Group_12__32107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Project__Group_13__02151 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Project__Group_13__1_in_rule__Project__Group_13__02161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Project__Group_13__12190 = new BitSet(new long[]{0x0000000000220000L});
    public static final BitSet FOLLOW_rule__Project__Group_13__2_in_rule__Project__Group_13__12200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__PluginsAssignment_13_2_in_rule__Project__Group_13__22228 = new BitSet(new long[]{0x0000000000220000L});
    public static final BitSet FOLLOW_rule__Project__Group_13__3_in_rule__Project__Group_13__22238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Project__Group_13__32267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Project__Group_14__02311 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Project__Group_14__1_in_rule__Project__Group_14__02321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Project__Group_14__12350 = new BitSet(new long[]{0x0000000000220000L});
    public static final BitSet FOLLOW_rule__Project__Group_14__2_in_rule__Project__Group_14__12360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__ExtensionsAssignment_14_2_in_rule__Project__Group_14__22388 = new BitSet(new long[]{0x0000000000220000L});
    public static final BitSet FOLLOW_rule__Project__Group_14__3_in_rule__Project__Group_14__22398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Project__Group_14__32427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__GA__Group__02471 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__GA__Group__1_in_rule__GA__Group__02481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__GA__Group__12510 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_rule__GA__Group__2_in_rule__GA__Group__12520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GA__GroupIdAssignment_2_in_rule__GA__Group__22548 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__GA__Group__3_in_rule__GA__Group__22557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__GA__Group__32586 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__GA__Group__4_in_rule__GA__Group__32596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__GA__Group__42625 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__GA__Group__5_in_rule__GA__Group__42635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__GA__Group__52664 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__GA__Group__6_in_rule__GA__Group__52674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GA__ArtifactIdAssignment_6_in_rule__GA__Group__62702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Dependency__Group__02751 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Dependency__Group__1_in_rule__Dependency__Group__02761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Dependency__Group__12790 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_rule__Dependency__Group__2_in_rule__Dependency__Group__12800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependency__GroupIdAssignment_2_in_rule__Dependency__Group__22828 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Dependency__Group__3_in_rule__Dependency__Group__22837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Dependency__Group__32866 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Dependency__Group__4_in_rule__Dependency__Group__32876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Dependency__Group__42905 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Dependency__Group__5_in_rule__Dependency__Group__42915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Dependency__Group__52944 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_rule__Dependency__Group__6_in_rule__Dependency__Group__52954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependency__ArtifactIdAssignment_6_in_rule__Dependency__Group__62982 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Dependency__Group__7_in_rule__Dependency__Group__62991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Dependency__Group__73020 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Dependency__Group__8_in_rule__Dependency__Group__73030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Dependency__Group__83059 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Dependency__Group__9_in_rule__Dependency__Group__83069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Dependency__Group__93098 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Dependency__Group__10_in_rule__Dependency__Group__93108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependency__VersionAssignment_10_in_rule__Dependency__Group__103136 = new BitSet(new long[]{0x0000000004000802L});
    public static final BitSet FOLLOW_rule__Dependency__Group__11_in_rule__Dependency__Group__103145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependency__Alternatives_11_in_rule__Dependency__Group__113173 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Dependency__Group__12_in_rule__Dependency__Group__113183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependency__Group_12__0_in_rule__Dependency__Group__123211 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Dependency__Group__13_in_rule__Dependency__Group__123221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependency__Group_13__0_in_rule__Dependency__Group__133249 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Dependency__Group__14_in_rule__Dependency__Group__133259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependency__Group_14__0_in_rule__Dependency__Group__143287 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Dependency__Group__15_in_rule__Dependency__Group__143297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependency__Group_15__0_in_rule__Dependency__Group__153325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Dependency__Group_11_0__03393 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Dependency__Group_11_0__1_in_rule__Dependency__Group_11_0__03403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Dependency__Group_11_0__13432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Dependency__Group_12__03472 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Dependency__Group_12__1_in_rule__Dependency__Group_12__03482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Dependency__Group_12__13511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Dependency__Group_13__03551 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Dependency__Group_13__1_in_rule__Dependency__Group_13__03561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Dependency__Group_13__13590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Dependency__Group_14__03630 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Dependency__Group_14__1_in_rule__Dependency__Group_14__03640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Dependency__Group_14__13669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Dependency__Group_15__03709 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Dependency__Group_15__1_in_rule__Dependency__Group_15__03719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Dependency__Group_15__13748 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Dependency__Group_15__2_in_rule__Dependency__Group_15__13758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Dependency__Group_15__23787 = new BitSet(new long[]{0x0000000000220000L});
    public static final BitSet FOLLOW_rule__Dependency__Group_15__3_in_rule__Dependency__Group_15__23797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependency__ExclusionsAssignment_15_3_in_rule__Dependency__Group_15__33825 = new BitSet(new long[]{0x0000000000220000L});
    public static final BitSet FOLLOW_rule__Dependency__Group_15__4_in_rule__Dependency__Group_15__33835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Dependency__Group_15__43864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MappedDependency__Alternatives_0_in_rule__MappedDependency__Group__03909 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__MappedDependency__Group__1_in_rule__MappedDependency__Group__03918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__MappedDependency__Group__13947 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MappedDependency__Group__2_in_rule__MappedDependency__Group__13957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MappedDependency__Group__23985 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__MappedDependency__Group__3_in_rule__MappedDependency__Group__23993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MappedDependency__Group_3__0_in_rule__MappedDependency__Group__34021 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__MappedDependency__Group__4_in_rule__MappedDependency__Group__34031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MappedDependency__Group_4__0_in_rule__MappedDependency__Group__44059 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__MappedDependency__Group__5_in_rule__MappedDependency__Group__44069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MappedDependency__Group_5__0_in_rule__MappedDependency__Group__54097 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__MappedDependency__Group__6_in_rule__MappedDependency__Group__54107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MappedDependency__Group_6__0_in_rule__MappedDependency__Group__64135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__MappedDependency__Group_3__04185 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__MappedDependency__Group_3__1_in_rule__MappedDependency__Group_3__04195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__MappedDependency__Group_3__14224 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__MappedDependency__Group_3__2_in_rule__MappedDependency__Group_3__14234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__MappedDependency__Group_3__24263 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MappedDependency__Group_3__3_in_rule__MappedDependency__Group_3__24273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MappedDependency__Group_3__34301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__MappedDependency__Group_4__04343 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__MappedDependency__Group_4__1_in_rule__MappedDependency__Group_4__04353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__MappedDependency__Group_4__14382 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__MappedDependency__Group_4__2_in_rule__MappedDependency__Group_4__14392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__MappedDependency__Group_4__24421 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__MappedDependency__Group_4__3_in_rule__MappedDependency__Group_4__24431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MappedDependency__GroupIdAssignment_4_3_in_rule__MappedDependency__Group_4__34459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__MappedDependency__Group_5__04502 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__MappedDependency__Group_5__1_in_rule__MappedDependency__Group_5__04512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__MappedDependency__Group_5__14541 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__MappedDependency__Group_5__2_in_rule__MappedDependency__Group_5__14551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__MappedDependency__Group_5__24580 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__MappedDependency__Group_5__3_in_rule__MappedDependency__Group_5__24590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MappedDependency__ArtifactIdAssignment_5_3_in_rule__MappedDependency__Group_5__34618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__MappedDependency__Group_6__04661 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__MappedDependency__Group_6__1_in_rule__MappedDependency__Group_6__04671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__MappedDependency__Group_6__14700 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__MappedDependency__Group_6__2_in_rule__MappedDependency__Group_6__14710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__MappedDependency__Group_6__24739 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__MappedDependency__Group_6__3_in_rule__MappedDependency__Group_6__24749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MappedDependency__VersionAssignment_6_3_in_rule__MappedDependency__Group_6__34777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Plugin__Group__04820 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Plugin__Group__1_in_rule__Plugin__Group__04830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Plugin__Group__14859 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_rule__Plugin__Group__2_in_rule__Plugin__Group__14869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plugin__GroupIdAssignment_2_in_rule__Plugin__Group__24897 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Plugin__Group__3_in_rule__Plugin__Group__24906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Plugin__Group__34935 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Plugin__Group__4_in_rule__Plugin__Group__34945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Plugin__Group__44974 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Plugin__Group__5_in_rule__Plugin__Group__44984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Plugin__Group__55013 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_rule__Plugin__Group__6_in_rule__Plugin__Group__55023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plugin__ArtifactIdAssignment_6_in_rule__Plugin__Group__65051 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Plugin__Group__7_in_rule__Plugin__Group__65060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Plugin__Group__75089 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Plugin__Group__8_in_rule__Plugin__Group__75099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Plugin__Group__85128 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Plugin__Group__9_in_rule__Plugin__Group__85138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Plugin__Group__95167 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Plugin__Group__10_in_rule__Plugin__Group__95177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plugin__VersionAssignment_10_in_rule__Plugin__Group__105205 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Plugin__Group__11_in_rule__Plugin__Group__105214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plugin__Group_11__0_in_rule__Plugin__Group__115242 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Plugin__Group__12_in_rule__Plugin__Group__115252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plugin__Group_12__0_in_rule__Plugin__Group__125280 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Plugin__Group__13_in_rule__Plugin__Group__125290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plugin__Group_13__0_in_rule__Plugin__Group__135318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Plugin__Group_11__05382 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Plugin__Group_11__1_in_rule__Plugin__Group_11__05392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Plugin__Group_11__15421 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Plugin__Group_11__2_in_rule__Plugin__Group_11__15431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Plugin__Group_11__25460 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Plugin__Group_11__3_in_rule__Plugin__Group_11__25470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Plugin__Group_11__35498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Plugin__Group_12__05540 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Plugin__Group_12__1_in_rule__Plugin__Group_12__05550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Plugin__Group_12__15579 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Plugin__Group_12__2_in_rule__Plugin__Group_12__15589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Plugin__Group_12__25618 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Plugin__Group_12__3_in_rule__Plugin__Group_12__25628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Plugin__Group_12__35656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Plugin__Group_13__05698 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Plugin__Group_13__1_in_rule__Plugin__Group_13__05708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Plugin__Group_13__15737 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Plugin__Group_13__2_in_rule__Plugin__Group_13__15747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Plugin__Group_13__25776 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_rule__Plugin__Group_13__3_in_rule__Plugin__Group_13__25786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Plugin__Group_13__35815 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_rule__Plugin__Group_13__4_in_rule__Plugin__Group_13__35825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Plugin__Group_13__45854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Extension__Group__05900 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Extension__Group__1_in_rule__Extension__Group__05910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Extension__Group__15939 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_rule__Extension__Group__2_in_rule__Extension__Group__15949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Extension__GroupIdAssignment_2_in_rule__Extension__Group__25977 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Extension__Group__3_in_rule__Extension__Group__25986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Extension__Group__36015 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Extension__Group__4_in_rule__Extension__Group__36025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Extension__Group__46054 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Extension__Group__5_in_rule__Extension__Group__46064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Extension__Group__56093 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_rule__Extension__Group__6_in_rule__Extension__Group__56103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Extension__ArtifactIdAssignment_6_in_rule__Extension__Group__66131 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Extension__Group__7_in_rule__Extension__Group__66140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Extension__Group__76169 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Extension__Group__8_in_rule__Extension__Group__76179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Extension__Group__86208 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Extension__Group__9_in_rule__Extension__Group__86218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Extension__Group__96247 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Extension__Group__10_in_rule__Extension__Group__96257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Extension__VersionAssignment_10_in_rule__Extension__Group__106285 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Extension__Group__11_in_rule__Extension__Group__106294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Extension__Group__116323 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Extension__Group__12_in_rule__Extension__Group__116333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Extension__Group__126362 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Extension__Group__13_in_rule__Extension__Group__126372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Extension__Group__136401 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Extension__Group__14_in_rule__Extension__Group__136411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Extension__Group__146439 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Extension__Group__15_in_rule__Extension__Group__146447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Extension__Group__156476 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Extension__Group__16_in_rule__Extension__Group__156486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Extension__Group__166515 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Extension__Group__17_in_rule__Extension__Group__166525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Extension__Group__176554 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_rule__Extension__Group__18_in_rule__Extension__Group__176564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Extension__Group__186593 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_rule__Extension__Group__19_in_rule__Extension__Group__186603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Extension__Group__196632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GroupId__Group__06708 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_rule__GroupId__Group__1_in_rule__GroupId__Group__06716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GroupId__Alternatives_1_in_rule__GroupId__Group__16744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ArtifactId__Group__06783 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_rule__ArtifactId__Group__1_in_rule__ArtifactId__Group__06791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArtifactId__Alternatives_1_in_rule__ArtifactId__Group__16819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Version__Group__06858 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__Version__Group__1_in_rule__Version__Group__06866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group_1__0_in_rule__Version__Group__16894 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_rule__Version__Group_1__06934 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Version__Group_1__1_in_rule__Version__Group_1__06944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Version__Group_1__16972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Import__Group__07011 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__07021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportURIAssignment_1_in_rule__Import__Group__17049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__SimpleType__Group__07088 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SimpleType__Group__1_in_rule__SimpleType__Group__07098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__NameAssignment_1_in_rule__SimpleType__Group__17126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Entity__Group__07165 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__07175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__17203 = new BitSet(new long[]{0x0000002000010000L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__17212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__0_in_rule__Entity__Group__27240 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__27250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Entity__Group__37279 = new BitSet(new long[]{0x0000004000200000L});
    public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__37289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__PropertiesAssignment_4_in_rule__Entity__Group__47317 = new BitSet(new long[]{0x0000004000200000L});
    public static final BitSet FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__47327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Entity__Group__57356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Entity__Group_2__07404 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__1_in_rule__Entity__Group_2__07414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__ExtendsAssignment_2_1_in_rule__Entity__Group_2__17442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Property__Group__07481 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Property__Group__1_in_rule__Property__Group__07491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__NameAssignment_1_in_rule__Property__Group__17519 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Property__Group__2_in_rule__Property__Group__17528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Property__Group__27557 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Property__Group__3_in_rule__Property__Group__27567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__TypeAssignment_3_in_rule__Property__Group__37595 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__4_in_rule__Property__Group__37604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__ManyAssignment_4_in_rule__Property__Group__47632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupId_in_rule__Project__GroupIdAssignment_47677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArtifactId_in_rule__Project__ArtifactIdAssignment_77708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersion_in_rule__Project__VersionAssignment_107739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependency_in_rule__Project__DependenciesAssignment_11_27770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMappedDependency_in_rule__Project__MappedDependenciesAssignment_12_27801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlugin_in_rule__Project__PluginsAssignment_13_27832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtension_in_rule__Project__ExtensionsAssignment_14_27863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupId_in_rule__GA__GroupIdAssignment_27894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArtifactId_in_rule__GA__ArtifactIdAssignment_67925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupId_in_rule__Dependency__GroupIdAssignment_27956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArtifactId_in_rule__Dependency__ArtifactIdAssignment_67987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersion_in_rule__Dependency__VersionAssignment_108018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGA_in_rule__Dependency__ExclusionsAssignment_15_38049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupId_in_rule__MappedDependency__GroupIdAssignment_4_38080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArtifactId_in_rule__MappedDependency__ArtifactIdAssignment_5_38111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersion_in_rule__MappedDependency__VersionAssignment_6_38142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupId_in_rule__Plugin__GroupIdAssignment_28173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArtifactId_in_rule__Plugin__ArtifactIdAssignment_68204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersion_in_rule__Plugin__VersionAssignment_108235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupId_in_rule__Extension__GroupIdAssignment_28266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArtifactId_in_rule__Extension__ArtifactIdAssignment_68297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersion_in_rule__Extension__VersionAssignment_108328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Import__ImportURIAssignment_18361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SimpleType__NameAssignment_18392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_18423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__ExtendsAssignment_2_18458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__Entity__PropertiesAssignment_48493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Property__NameAssignment_18524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Property__TypeAssignment_38559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Property__ManyAssignment_48599 = new BitSet(new long[]{0x0000000000000002L});

}