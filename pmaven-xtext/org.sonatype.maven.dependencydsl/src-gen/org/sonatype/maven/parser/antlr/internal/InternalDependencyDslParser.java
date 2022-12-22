package org.sonatype.maven.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.sonatype.maven.services.DependencyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalDependencyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'project'", "'{'", "'groupId'", "':'", "'artifactId'", "'version'", "'dependencies'", "'}'", "'mappedDependencies'", "'plugins'", "'extensions'", "','", "'path'", "'url'", "'scope'", "'classifier'", "'type'", "'exclusions'", "'exclude'", "'phase'", "'extensionId'", "'execute'", "'.'", "'-'", "'import'", "'entity'", "'extends'", "'property'", "'[]'"
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
    public String getGrammarFileName() { return "../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g"; }


     
     	private DependencyDslGrammarAccess grammarAccess;
     	
        public InternalDependencyDslParser(TokenStream input, IAstFactory factory, DependencyDslGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Project";	
       	} 



    // $ANTLR start entryRuleProject
    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:72:1: entryRuleProject returns [EObject current=null] : iv_ruleProject= ruleProject EOF ;
    public final EObject entryRuleProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProject = null;


        try {
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:72:49: (iv_ruleProject= ruleProject EOF )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:73:2: iv_ruleProject= ruleProject EOF
            {
             currentNode = createCompositeNode(grammarAccess.getProjectRule(), currentNode); 
            pushFollow(FOLLOW_ruleProject_in_entryRuleProject73);
            iv_ruleProject=ruleProject();
            _fsp--;

             current =iv_ruleProject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProject83); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleProject


    // $ANTLR start ruleProject
    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:80:1: ruleProject returns [EObject current=null] : ( 'project' '{' 'groupId' ':' (lv_groupId_4= ruleGroupId ) 'artifactId' ':' (lv_artifactId_7= ruleArtifactId ) 'version' ':' (lv_version_10= ruleVersion ) ( 'dependencies' '{' (lv_dependencies_13= ruleDependency )* '}' )? ( 'mappedDependencies' '{' (lv_mappedDependencies_17= ruleMappedDependency )* '}' )? ( 'plugins' '{' (lv_plugins_21= rulePlugin )* '}' )? ( 'extensions' '{' (lv_extensions_25= ruleExtension )* '}' )? '}' ) ;
    public final EObject ruleProject() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_groupId_4 = null;

        AntlrDatatypeRuleToken lv_artifactId_7 = null;

        AntlrDatatypeRuleToken lv_version_10 = null;

        EObject lv_dependencies_13 = null;

        EObject lv_mappedDependencies_17 = null;

        EObject lv_plugins_21 = null;

        EObject lv_extensions_25 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:85:6: ( ( 'project' '{' 'groupId' ':' (lv_groupId_4= ruleGroupId ) 'artifactId' ':' (lv_artifactId_7= ruleArtifactId ) 'version' ':' (lv_version_10= ruleVersion ) ( 'dependencies' '{' (lv_dependencies_13= ruleDependency )* '}' )? ( 'mappedDependencies' '{' (lv_mappedDependencies_17= ruleMappedDependency )* '}' )? ( 'plugins' '{' (lv_plugins_21= rulePlugin )* '}' )? ( 'extensions' '{' (lv_extensions_25= ruleExtension )* '}' )? '}' ) )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:86:1: ( 'project' '{' 'groupId' ':' (lv_groupId_4= ruleGroupId ) 'artifactId' ':' (lv_artifactId_7= ruleArtifactId ) 'version' ':' (lv_version_10= ruleVersion ) ( 'dependencies' '{' (lv_dependencies_13= ruleDependency )* '}' )? ( 'mappedDependencies' '{' (lv_mappedDependencies_17= ruleMappedDependency )* '}' )? ( 'plugins' '{' (lv_plugins_21= rulePlugin )* '}' )? ( 'extensions' '{' (lv_extensions_25= ruleExtension )* '}' )? '}' )
            {
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:86:1: ( 'project' '{' 'groupId' ':' (lv_groupId_4= ruleGroupId ) 'artifactId' ':' (lv_artifactId_7= ruleArtifactId ) 'version' ':' (lv_version_10= ruleVersion ) ( 'dependencies' '{' (lv_dependencies_13= ruleDependency )* '}' )? ( 'mappedDependencies' '{' (lv_mappedDependencies_17= ruleMappedDependency )* '}' )? ( 'plugins' '{' (lv_plugins_21= rulePlugin )* '}' )? ( 'extensions' '{' (lv_extensions_25= ruleExtension )* '}' )? '}' )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:86:2: 'project' '{' 'groupId' ':' (lv_groupId_4= ruleGroupId ) 'artifactId' ':' (lv_artifactId_7= ruleArtifactId ) 'version' ':' (lv_version_10= ruleVersion ) ( 'dependencies' '{' (lv_dependencies_13= ruleDependency )* '}' )? ( 'mappedDependencies' '{' (lv_mappedDependencies_17= ruleMappedDependency )* '}' )? ( 'plugins' '{' (lv_plugins_21= rulePlugin )* '}' )? ( 'extensions' '{' (lv_extensions_25= ruleExtension )* '}' )? '}'
            {
            match(input,11,FOLLOW_11_in_ruleProject117); 

                    createLeafNode(grammarAccess.getProjectAccess().getProjectKeyword_0(), null); 
                
            match(input,12,FOLLOW_12_in_ruleProject126); 

                    createLeafNode(grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_1(), null); 
                
            match(input,13,FOLLOW_13_in_ruleProject135); 

                    createLeafNode(grammarAccess.getProjectAccess().getGroupIdKeyword_2(), null); 
                
            match(input,14,FOLLOW_14_in_ruleProject144); 

                    createLeafNode(grammarAccess.getProjectAccess().getColonKeyword_3(), null); 
                
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:102:1: (lv_groupId_4= ruleGroupId )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:105:6: lv_groupId_4= ruleGroupId
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getProjectAccess().getGroupIdGroupIdParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleGroupId_in_ruleProject178);
            lv_groupId_4=ruleGroupId();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getProjectRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "groupId", lv_groupId_4, "GroupId", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,15,FOLLOW_15_in_ruleProject191); 

                    createLeafNode(grammarAccess.getProjectAccess().getArtifactIdKeyword_5(), null); 
                
            match(input,14,FOLLOW_14_in_ruleProject200); 

                    createLeafNode(grammarAccess.getProjectAccess().getColonKeyword_6(), null); 
                
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:131:1: (lv_artifactId_7= ruleArtifactId )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:134:6: lv_artifactId_7= ruleArtifactId
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getProjectAccess().getArtifactIdArtifactIdParserRuleCall_7_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleArtifactId_in_ruleProject234);
            lv_artifactId_7=ruleArtifactId();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getProjectRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "artifactId", lv_artifactId_7, "ArtifactId", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,16,FOLLOW_16_in_ruleProject247); 

                    createLeafNode(grammarAccess.getProjectAccess().getVersionKeyword_8(), null); 
                
            match(input,14,FOLLOW_14_in_ruleProject256); 

                    createLeafNode(grammarAccess.getProjectAccess().getColonKeyword_9(), null); 
                
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:160:1: (lv_version_10= ruleVersion )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:163:6: lv_version_10= ruleVersion
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getProjectAccess().getVersionVersionParserRuleCall_10_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleVersion_in_ruleProject290);
            lv_version_10=ruleVersion();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getProjectRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "version", lv_version_10, "Version", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:181:2: ( 'dependencies' '{' (lv_dependencies_13= ruleDependency )* '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==17) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:181:3: 'dependencies' '{' (lv_dependencies_13= ruleDependency )* '}'
                    {
                    match(input,17,FOLLOW_17_in_ruleProject304); 

                            createLeafNode(grammarAccess.getProjectAccess().getDependenciesKeyword_11_0(), null); 
                        
                    match(input,12,FOLLOW_12_in_ruleProject313); 

                            createLeafNode(grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_11_1(), null); 
                        
                    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:189:1: (lv_dependencies_13= ruleDependency )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==13) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:192:6: lv_dependencies_13= ruleDependency
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getProjectAccess().getDependenciesDependencyParserRuleCall_11_2_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleDependency_in_ruleProject347);
                    	    lv_dependencies_13=ruleDependency();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getProjectRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "dependencies", lv_dependencies_13, "Dependency", currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    match(input,18,FOLLOW_18_in_ruleProject361); 

                            createLeafNode(grammarAccess.getProjectAccess().getRightCurlyBracketKeyword_11_3(), null); 
                        

                    }
                    break;

            }

            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:214:3: ( 'mappedDependencies' '{' (lv_mappedDependencies_17= ruleMappedDependency )* '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:214:4: 'mappedDependencies' '{' (lv_mappedDependencies_17= ruleMappedDependency )* '}'
                    {
                    match(input,19,FOLLOW_19_in_ruleProject373); 

                            createLeafNode(grammarAccess.getProjectAccess().getMappedDependenciesKeyword_12_0(), null); 
                        
                    match(input,12,FOLLOW_12_in_ruleProject382); 

                            createLeafNode(grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_12_1(), null); 
                        
                    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:222:1: (lv_mappedDependencies_17= ruleMappedDependency )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>=23 && LA3_0<=24)) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:225:6: lv_mappedDependencies_17= ruleMappedDependency
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getProjectAccess().getMappedDependenciesMappedDependencyParserRuleCall_12_2_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMappedDependency_in_ruleProject416);
                    	    lv_mappedDependencies_17=ruleMappedDependency();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getProjectRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "mappedDependencies", lv_mappedDependencies_17, "MappedDependency", currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    match(input,18,FOLLOW_18_in_ruleProject430); 

                            createLeafNode(grammarAccess.getProjectAccess().getRightCurlyBracketKeyword_12_3(), null); 
                        

                    }
                    break;

            }

            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:247:3: ( 'plugins' '{' (lv_plugins_21= rulePlugin )* '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:247:4: 'plugins' '{' (lv_plugins_21= rulePlugin )* '}'
                    {
                    match(input,20,FOLLOW_20_in_ruleProject442); 

                            createLeafNode(grammarAccess.getProjectAccess().getPluginsKeyword_13_0(), null); 
                        
                    match(input,12,FOLLOW_12_in_ruleProject451); 

                            createLeafNode(grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_13_1(), null); 
                        
                    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:255:1: (lv_plugins_21= rulePlugin )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==13) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:258:6: lv_plugins_21= rulePlugin
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getProjectAccess().getPluginsPluginParserRuleCall_13_2_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePlugin_in_ruleProject485);
                    	    lv_plugins_21=rulePlugin();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getProjectRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "plugins", lv_plugins_21, "Plugin", currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match(input,18,FOLLOW_18_in_ruleProject499); 

                            createLeafNode(grammarAccess.getProjectAccess().getRightCurlyBracketKeyword_13_3(), null); 
                        

                    }
                    break;

            }

            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:280:3: ( 'extensions' '{' (lv_extensions_25= ruleExtension )* '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:280:4: 'extensions' '{' (lv_extensions_25= ruleExtension )* '}'
                    {
                    match(input,21,FOLLOW_21_in_ruleProject511); 

                            createLeafNode(grammarAccess.getProjectAccess().getExtensionsKeyword_14_0(), null); 
                        
                    match(input,12,FOLLOW_12_in_ruleProject520); 

                            createLeafNode(grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_14_1(), null); 
                        
                    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:288:1: (lv_extensions_25= ruleExtension )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==13) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:291:6: lv_extensions_25= ruleExtension
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getProjectAccess().getExtensionsExtensionParserRuleCall_14_2_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleExtension_in_ruleProject554);
                    	    lv_extensions_25=ruleExtension();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getProjectRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "extensions", lv_extensions_25, "Extension", currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match(input,18,FOLLOW_18_in_ruleProject568); 

                            createLeafNode(grammarAccess.getProjectAccess().getRightCurlyBracketKeyword_14_3(), null); 
                        

                    }
                    break;

            }

            match(input,18,FOLLOW_18_in_ruleProject579); 

                    createLeafNode(grammarAccess.getProjectAccess().getRightCurlyBracketKeyword_15(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleProject


    // $ANTLR start entryRuleGA
    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:324:1: entryRuleGA returns [EObject current=null] : iv_ruleGA= ruleGA EOF ;
    public final EObject entryRuleGA() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGA = null;


        try {
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:324:44: (iv_ruleGA= ruleGA EOF )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:325:2: iv_ruleGA= ruleGA EOF
            {
             currentNode = createCompositeNode(grammarAccess.getGARule(), currentNode); 
            pushFollow(FOLLOW_ruleGA_in_entryRuleGA612);
            iv_ruleGA=ruleGA();
            _fsp--;

             current =iv_ruleGA; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGA622); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleGA


    // $ANTLR start ruleGA
    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:332:1: ruleGA returns [EObject current=null] : ( 'groupId' ':' (lv_groupId_2= ruleGroupId ) ',' 'artifactId' ':' (lv_artifactId_6= ruleArtifactId ) ) ;
    public final EObject ruleGA() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_groupId_2 = null;

        AntlrDatatypeRuleToken lv_artifactId_6 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:337:6: ( ( 'groupId' ':' (lv_groupId_2= ruleGroupId ) ',' 'artifactId' ':' (lv_artifactId_6= ruleArtifactId ) ) )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:338:1: ( 'groupId' ':' (lv_groupId_2= ruleGroupId ) ',' 'artifactId' ':' (lv_artifactId_6= ruleArtifactId ) )
            {
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:338:1: ( 'groupId' ':' (lv_groupId_2= ruleGroupId ) ',' 'artifactId' ':' (lv_artifactId_6= ruleArtifactId ) )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:338:2: 'groupId' ':' (lv_groupId_2= ruleGroupId ) ',' 'artifactId' ':' (lv_artifactId_6= ruleArtifactId )
            {
            match(input,13,FOLLOW_13_in_ruleGA656); 

                    createLeafNode(grammarAccess.getGAAccess().getGroupIdKeyword_0(), null); 
                
            match(input,14,FOLLOW_14_in_ruleGA665); 

                    createLeafNode(grammarAccess.getGAAccess().getColonKeyword_1(), null); 
                
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:346:1: (lv_groupId_2= ruleGroupId )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:349:6: lv_groupId_2= ruleGroupId
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getGAAccess().getGroupIdGroupIdParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleGroupId_in_ruleGA699);
            lv_groupId_2=ruleGroupId();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getGARule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "groupId", lv_groupId_2, "GroupId", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,22,FOLLOW_22_in_ruleGA712); 

                    createLeafNode(grammarAccess.getGAAccess().getCommaKeyword_3(), null); 
                
            match(input,15,FOLLOW_15_in_ruleGA721); 

                    createLeafNode(grammarAccess.getGAAccess().getArtifactIdKeyword_4(), null); 
                
            match(input,14,FOLLOW_14_in_ruleGA730); 

                    createLeafNode(grammarAccess.getGAAccess().getColonKeyword_5(), null); 
                
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:379:1: (lv_artifactId_6= ruleArtifactId )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:382:6: lv_artifactId_6= ruleArtifactId
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getGAAccess().getArtifactIdArtifactIdParserRuleCall_6_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleArtifactId_in_ruleGA764);
            lv_artifactId_6=ruleArtifactId();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getGARule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "artifactId", lv_artifactId_6, "ArtifactId", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleGA


    // $ANTLR start entryRuleDependency
    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:407:1: entryRuleDependency returns [EObject current=null] : iv_ruleDependency= ruleDependency EOF ;
    public final EObject entryRuleDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependency = null;


        try {
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:407:52: (iv_ruleDependency= ruleDependency EOF )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:408:2: iv_ruleDependency= ruleDependency EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDependencyRule(), currentNode); 
            pushFollow(FOLLOW_ruleDependency_in_entryRuleDependency801);
            iv_ruleDependency=ruleDependency();
            _fsp--;

             current =iv_ruleDependency; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependency811); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDependency


    // $ANTLR start ruleDependency
    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:415:1: ruleDependency returns [EObject current=null] : ( 'groupId' ':' (lv_groupId_2= ruleGroupId ) ',' 'artifactId' ':' (lv_artifactId_6= ruleArtifactId ) ',' 'version' ':' (lv_version_10= ruleVersion ) ( ( ',' 'path' ) | 'url' )? ( ',' 'scope' )? ( ',' 'classifier' )? ( ',' 'type' )? ( ',' 'exclusions' '{' (lv_exclusions_23= ruleGA )* '}' )? ) ;
    public final EObject ruleDependency() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_groupId_2 = null;

        AntlrDatatypeRuleToken lv_artifactId_6 = null;

        AntlrDatatypeRuleToken lv_version_10 = null;

        EObject lv_exclusions_23 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:420:6: ( ( 'groupId' ':' (lv_groupId_2= ruleGroupId ) ',' 'artifactId' ':' (lv_artifactId_6= ruleArtifactId ) ',' 'version' ':' (lv_version_10= ruleVersion ) ( ( ',' 'path' ) | 'url' )? ( ',' 'scope' )? ( ',' 'classifier' )? ( ',' 'type' )? ( ',' 'exclusions' '{' (lv_exclusions_23= ruleGA )* '}' )? ) )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:421:1: ( 'groupId' ':' (lv_groupId_2= ruleGroupId ) ',' 'artifactId' ':' (lv_artifactId_6= ruleArtifactId ) ',' 'version' ':' (lv_version_10= ruleVersion ) ( ( ',' 'path' ) | 'url' )? ( ',' 'scope' )? ( ',' 'classifier' )? ( ',' 'type' )? ( ',' 'exclusions' '{' (lv_exclusions_23= ruleGA )* '}' )? )
            {
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:421:1: ( 'groupId' ':' (lv_groupId_2= ruleGroupId ) ',' 'artifactId' ':' (lv_artifactId_6= ruleArtifactId ) ',' 'version' ':' (lv_version_10= ruleVersion ) ( ( ',' 'path' ) | 'url' )? ( ',' 'scope' )? ( ',' 'classifier' )? ( ',' 'type' )? ( ',' 'exclusions' '{' (lv_exclusions_23= ruleGA )* '}' )? )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:421:2: 'groupId' ':' (lv_groupId_2= ruleGroupId ) ',' 'artifactId' ':' (lv_artifactId_6= ruleArtifactId ) ',' 'version' ':' (lv_version_10= ruleVersion ) ( ( ',' 'path' ) | 'url' )? ( ',' 'scope' )? ( ',' 'classifier' )? ( ',' 'type' )? ( ',' 'exclusions' '{' (lv_exclusions_23= ruleGA )* '}' )?
            {
            match(input,13,FOLLOW_13_in_ruleDependency845); 

                    createLeafNode(grammarAccess.getDependencyAccess().getGroupIdKeyword_0(), null); 
                
            match(input,14,FOLLOW_14_in_ruleDependency854); 

                    createLeafNode(grammarAccess.getDependencyAccess().getColonKeyword_1(), null); 
                
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:429:1: (lv_groupId_2= ruleGroupId )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:432:6: lv_groupId_2= ruleGroupId
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDependencyAccess().getGroupIdGroupIdParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleGroupId_in_ruleDependency888);
            lv_groupId_2=ruleGroupId();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDependencyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "groupId", lv_groupId_2, "GroupId", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,22,FOLLOW_22_in_ruleDependency901); 

                    createLeafNode(grammarAccess.getDependencyAccess().getCommaKeyword_3(), null); 
                
            match(input,15,FOLLOW_15_in_ruleDependency910); 

                    createLeafNode(grammarAccess.getDependencyAccess().getArtifactIdKeyword_4(), null); 
                
            match(input,14,FOLLOW_14_in_ruleDependency919); 

                    createLeafNode(grammarAccess.getDependencyAccess().getColonKeyword_5(), null); 
                
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:462:1: (lv_artifactId_6= ruleArtifactId )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:465:6: lv_artifactId_6= ruleArtifactId
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDependencyAccess().getArtifactIdArtifactIdParserRuleCall_6_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleArtifactId_in_ruleDependency953);
            lv_artifactId_6=ruleArtifactId();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDependencyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "artifactId", lv_artifactId_6, "ArtifactId", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,22,FOLLOW_22_in_ruleDependency966); 

                    createLeafNode(grammarAccess.getDependencyAccess().getCommaKeyword_7(), null); 
                
            match(input,16,FOLLOW_16_in_ruleDependency975); 

                    createLeafNode(grammarAccess.getDependencyAccess().getVersionKeyword_8(), null); 
                
            match(input,14,FOLLOW_14_in_ruleDependency984); 

                    createLeafNode(grammarAccess.getDependencyAccess().getColonKeyword_9(), null); 
                
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:495:1: (lv_version_10= ruleVersion )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:498:6: lv_version_10= ruleVersion
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDependencyAccess().getVersionVersionParserRuleCall_10_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleVersion_in_ruleDependency1018);
            lv_version_10=ruleVersion();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDependencyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "version", lv_version_10, "Version", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:516:2: ( ( ',' 'path' ) | 'url' )?
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==23) ) {
                    alt9=1;
                }
            }
            else if ( (LA9_0==24) ) {
                alt9=2;
            }
            switch (alt9) {
                case 1 :
                    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:516:3: ( ',' 'path' )
                    {
                    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:516:3: ( ',' 'path' )
                    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:516:4: ',' 'path'
                    {
                    match(input,22,FOLLOW_22_in_ruleDependency1033); 

                            createLeafNode(grammarAccess.getDependencyAccess().getCommaKeyword_11_0_0(), null); 
                        
                    match(input,23,FOLLOW_23_in_ruleDependency1042); 

                            createLeafNode(grammarAccess.getDependencyAccess().getPathKeyword_11_0_1(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:525:6: 'url'
                    {
                    match(input,24,FOLLOW_24_in_ruleDependency1058); 

                            createLeafNode(grammarAccess.getDependencyAccess().getUrlKeyword_11_1(), null); 
                        

                    }
                    break;

            }

            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:529:3: ( ',' 'scope' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==25) ) {
                    alt10=1;
                }
            }
            switch (alt10) {
                case 1 :
                    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:529:4: ',' 'scope'
                    {
                    match(input,22,FOLLOW_22_in_ruleDependency1070); 

                            createLeafNode(grammarAccess.getDependencyAccess().getCommaKeyword_12_0(), null); 
                        
                    match(input,25,FOLLOW_25_in_ruleDependency1079); 

                            createLeafNode(grammarAccess.getDependencyAccess().getScopeKeyword_12_1(), null); 
                        

                    }
                    break;

            }

            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:537:3: ( ',' 'classifier' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==26) ) {
                    alt11=1;
                }
            }
            switch (alt11) {
                case 1 :
                    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:537:4: ',' 'classifier'
                    {
                    match(input,22,FOLLOW_22_in_ruleDependency1091); 

                            createLeafNode(grammarAccess.getDependencyAccess().getCommaKeyword_13_0(), null); 
                        
                    match(input,26,FOLLOW_26_in_ruleDependency1100); 

                            createLeafNode(grammarAccess.getDependencyAccess().getClassifierKeyword_13_1(), null); 
                        

                    }
                    break;

            }

            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:545:3: ( ',' 'type' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==27) ) {
                    alt12=1;
                }
            }
            switch (alt12) {
                case 1 :
                    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:545:4: ',' 'type'
                    {
                    match(input,22,FOLLOW_22_in_ruleDependency1112); 

                            createLeafNode(grammarAccess.getDependencyAccess().getCommaKeyword_14_0(), null); 
                        
                    match(input,27,FOLLOW_27_in_ruleDependency1121); 

                            createLeafNode(grammarAccess.getDependencyAccess().getTypeKeyword_14_1(), null); 
                        

                    }
                    break;

            }

            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:553:3: ( ',' 'exclusions' '{' (lv_exclusions_23= ruleGA )* '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:553:4: ',' 'exclusions' '{' (lv_exclusions_23= ruleGA )* '}'
                    {
                    match(input,22,FOLLOW_22_in_ruleDependency1133); 

                            createLeafNode(grammarAccess.getDependencyAccess().getCommaKeyword_15_0(), null); 
                        
                    match(input,28,FOLLOW_28_in_ruleDependency1142); 

                            createLeafNode(grammarAccess.getDependencyAccess().getExclusionsKeyword_15_1(), null); 
                        
                    match(input,12,FOLLOW_12_in_ruleDependency1151); 

                            createLeafNode(grammarAccess.getDependencyAccess().getLeftCurlyBracketKeyword_15_2(), null); 
                        
                    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:565:1: (lv_exclusions_23= ruleGA )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==13) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:568:6: lv_exclusions_23= ruleGA
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getDependencyAccess().getExclusionsGAParserRuleCall_15_3_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleGA_in_ruleDependency1185);
                    	    lv_exclusions_23=ruleGA();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getDependencyRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "exclusions", lv_exclusions_23, "GA", currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    match(input,18,FOLLOW_18_in_ruleDependency1199); 

                            createLeafNode(grammarAccess.getDependencyAccess().getRightCurlyBracketKeyword_15_4(), null); 
                        

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDependency


    // $ANTLR start entryRuleMappedDependency
    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:597:1: entryRuleMappedDependency returns [EObject current=null] : iv_ruleMappedDependency= ruleMappedDependency EOF ;
    public final EObject entryRuleMappedDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappedDependency = null;


        try {
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:597:58: (iv_ruleMappedDependency= ruleMappedDependency EOF )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:598:2: iv_ruleMappedDependency= ruleMappedDependency EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMappedDependencyRule(), currentNode); 
            pushFollow(FOLLOW_ruleMappedDependency_in_entryRuleMappedDependency1234);
            iv_ruleMappedDependency=ruleMappedDependency();
            _fsp--;

             current =iv_ruleMappedDependency; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMappedDependency1244); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleMappedDependency


    // $ANTLR start ruleMappedDependency
    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:605:1: ruleMappedDependency returns [EObject current=null] : ( ( 'path' | 'url' ) ':' RULE_STRING ( ',' 'exclude' ':' RULE_STRING )? ( ',' 'groupId' ':' (lv_groupId_11= ruleGroupId ) )? ( ',' 'artifactId' ':' (lv_artifactId_15= ruleArtifactId ) )? ( ',' 'version' ':' (lv_version_19= ruleVersion ) )? ) ;
    public final EObject ruleMappedDependency() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_groupId_11 = null;

        AntlrDatatypeRuleToken lv_artifactId_15 = null;

        AntlrDatatypeRuleToken lv_version_19 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:610:6: ( ( ( 'path' | 'url' ) ':' RULE_STRING ( ',' 'exclude' ':' RULE_STRING )? ( ',' 'groupId' ':' (lv_groupId_11= ruleGroupId ) )? ( ',' 'artifactId' ':' (lv_artifactId_15= ruleArtifactId ) )? ( ',' 'version' ':' (lv_version_19= ruleVersion ) )? ) )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:611:1: ( ( 'path' | 'url' ) ':' RULE_STRING ( ',' 'exclude' ':' RULE_STRING )? ( ',' 'groupId' ':' (lv_groupId_11= ruleGroupId ) )? ( ',' 'artifactId' ':' (lv_artifactId_15= ruleArtifactId ) )? ( ',' 'version' ':' (lv_version_19= ruleVersion ) )? )
            {
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:611:1: ( ( 'path' | 'url' ) ':' RULE_STRING ( ',' 'exclude' ':' RULE_STRING )? ( ',' 'groupId' ':' (lv_groupId_11= ruleGroupId ) )? ( ',' 'artifactId' ':' (lv_artifactId_15= ruleArtifactId ) )? ( ',' 'version' ':' (lv_version_19= ruleVersion ) )? )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:611:2: ( 'path' | 'url' ) ':' RULE_STRING ( ',' 'exclude' ':' RULE_STRING )? ( ',' 'groupId' ':' (lv_groupId_11= ruleGroupId ) )? ( ',' 'artifactId' ':' (lv_artifactId_15= ruleArtifactId ) )? ( ',' 'version' ':' (lv_version_19= ruleVersion ) )?
            {
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:611:2: ( 'path' | 'url' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==23) ) {
                alt15=1;
            }
            else if ( (LA15_0==24) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("611:2: ( 'path' | 'url' )", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:611:3: 'path'
                    {
                    match(input,23,FOLLOW_23_in_ruleMappedDependency1279); 

                            createLeafNode(grammarAccess.getMappedDependencyAccess().getPathKeyword_0_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:616:6: 'url'
                    {
                    match(input,24,FOLLOW_24_in_ruleMappedDependency1294); 

                            createLeafNode(grammarAccess.getMappedDependencyAccess().getUrlKeyword_0_1(), null); 
                        

                    }
                    break;

            }

            match(input,14,FOLLOW_14_in_ruleMappedDependency1304); 

                    createLeafNode(grammarAccess.getMappedDependencyAccess().getColonKeyword_1(), null); 
                
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMappedDependency1313); 
             
                createLeafNode(grammarAccess.getMappedDependencyAccess().getSTRINGTerminalRuleCall_2(), null); 
                
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:628:1: ( ',' 'exclude' ':' RULE_STRING )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==22) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==29) ) {
                    alt16=1;
                }
            }
            switch (alt16) {
                case 1 :
                    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:628:2: ',' 'exclude' ':' RULE_STRING
                    {
                    match(input,22,FOLLOW_22_in_ruleMappedDependency1322); 

                            createLeafNode(grammarAccess.getMappedDependencyAccess().getCommaKeyword_3_0(), null); 
                        
                    match(input,29,FOLLOW_29_in_ruleMappedDependency1331); 

                            createLeafNode(grammarAccess.getMappedDependencyAccess().getExcludeKeyword_3_1(), null); 
                        
                    match(input,14,FOLLOW_14_in_ruleMappedDependency1340); 

                            createLeafNode(grammarAccess.getMappedDependencyAccess().getColonKeyword_3_2(), null); 
                        
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMappedDependency1349); 
                     
                        createLeafNode(grammarAccess.getMappedDependencyAccess().getSTRINGTerminalRuleCall_3_3(), null); 
                        

                    }
                    break;

            }

            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:644:3: ( ',' 'groupId' ':' (lv_groupId_11= ruleGroupId ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==22) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==13) ) {
                    alt17=1;
                }
            }
            switch (alt17) {
                case 1 :
                    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:644:4: ',' 'groupId' ':' (lv_groupId_11= ruleGroupId )
                    {
                    match(input,22,FOLLOW_22_in_ruleMappedDependency1360); 

                            createLeafNode(grammarAccess.getMappedDependencyAccess().getCommaKeyword_4_0(), null); 
                        
                    match(input,13,FOLLOW_13_in_ruleMappedDependency1369); 

                            createLeafNode(grammarAccess.getMappedDependencyAccess().getGroupIdKeyword_4_1(), null); 
                        
                    match(input,14,FOLLOW_14_in_ruleMappedDependency1378); 

                            createLeafNode(grammarAccess.getMappedDependencyAccess().getColonKeyword_4_2(), null); 
                        
                    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:656:1: (lv_groupId_11= ruleGroupId )
                    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:659:6: lv_groupId_11= ruleGroupId
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getMappedDependencyAccess().getGroupIdGroupIdParserRuleCall_4_3_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleGroupId_in_ruleMappedDependency1412);
                    lv_groupId_11=ruleGroupId();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getMappedDependencyRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "groupId", lv_groupId_11, "GroupId", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:677:4: ( ',' 'artifactId' ':' (lv_artifactId_15= ruleArtifactId ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==22) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==15) ) {
                    alt18=1;
                }
            }
            switch (alt18) {
                case 1 :
                    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:677:5: ',' 'artifactId' ':' (lv_artifactId_15= ruleArtifactId )
                    {
                    match(input,22,FOLLOW_22_in_ruleMappedDependency1428); 

                            createLeafNode(grammarAccess.getMappedDependencyAccess().getCommaKeyword_5_0(), null); 
                        
                    match(input,15,FOLLOW_15_in_ruleMappedDependency1437); 

                            createLeafNode(grammarAccess.getMappedDependencyAccess().getArtifactIdKeyword_5_1(), null); 
                        
                    match(input,14,FOLLOW_14_in_ruleMappedDependency1446); 

                            createLeafNode(grammarAccess.getMappedDependencyAccess().getColonKeyword_5_2(), null); 
                        
                    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:689:1: (lv_artifactId_15= ruleArtifactId )
                    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:692:6: lv_artifactId_15= ruleArtifactId
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getMappedDependencyAccess().getArtifactIdArtifactIdParserRuleCall_5_3_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleArtifactId_in_ruleMappedDependency1480);
                    lv_artifactId_15=ruleArtifactId();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getMappedDependencyRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "artifactId", lv_artifactId_15, "ArtifactId", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:710:4: ( ',' 'version' ':' (lv_version_19= ruleVersion ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==22) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:710:5: ',' 'version' ':' (lv_version_19= ruleVersion )
                    {
                    match(input,22,FOLLOW_22_in_ruleMappedDependency1496); 

                            createLeafNode(grammarAccess.getMappedDependencyAccess().getCommaKeyword_6_0(), null); 
                        
                    match(input,16,FOLLOW_16_in_ruleMappedDependency1505); 

                            createLeafNode(grammarAccess.getMappedDependencyAccess().getVersionKeyword_6_1(), null); 
                        
                    match(input,14,FOLLOW_14_in_ruleMappedDependency1514); 

                            createLeafNode(grammarAccess.getMappedDependencyAccess().getColonKeyword_6_2(), null); 
                        
                    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:722:1: (lv_version_19= ruleVersion )
                    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:725:6: lv_version_19= ruleVersion
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getMappedDependencyAccess().getVersionVersionParserRuleCall_6_3_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleVersion_in_ruleMappedDependency1548);
                    lv_version_19=ruleVersion();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getMappedDependencyRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "version", lv_version_19, "Version", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleMappedDependency


    // $ANTLR start entryRulePlugin
    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:750:1: entryRulePlugin returns [EObject current=null] : iv_rulePlugin= rulePlugin EOF ;
    public final EObject entryRulePlugin() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlugin = null;


        try {
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:750:48: (iv_rulePlugin= rulePlugin EOF )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:751:2: iv_rulePlugin= rulePlugin EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPluginRule(), currentNode); 
            pushFollow(FOLLOW_rulePlugin_in_entryRulePlugin1587);
            iv_rulePlugin=rulePlugin();
            _fsp--;

             current =iv_rulePlugin; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlugin1597); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePlugin


    // $ANTLR start rulePlugin
    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:758:1: rulePlugin returns [EObject current=null] : ( 'groupId' ':' (lv_groupId_2= ruleGroupId ) ',' 'artifactId' ':' (lv_artifactId_6= ruleArtifactId ) ',' 'version' ':' (lv_version_10= ruleVersion ) ( ',' 'phase' ':' RULE_ID )? ( ',' 'extensionId' ':' RULE_ID )? ( ',' 'execute' '{' ( RULE_STRING )* '}' )? ) ;
    public final EObject rulePlugin() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_groupId_2 = null;

        AntlrDatatypeRuleToken lv_artifactId_6 = null;

        AntlrDatatypeRuleToken lv_version_10 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:763:6: ( ( 'groupId' ':' (lv_groupId_2= ruleGroupId ) ',' 'artifactId' ':' (lv_artifactId_6= ruleArtifactId ) ',' 'version' ':' (lv_version_10= ruleVersion ) ( ',' 'phase' ':' RULE_ID )? ( ',' 'extensionId' ':' RULE_ID )? ( ',' 'execute' '{' ( RULE_STRING )* '}' )? ) )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:764:1: ( 'groupId' ':' (lv_groupId_2= ruleGroupId ) ',' 'artifactId' ':' (lv_artifactId_6= ruleArtifactId ) ',' 'version' ':' (lv_version_10= ruleVersion ) ( ',' 'phase' ':' RULE_ID )? ( ',' 'extensionId' ':' RULE_ID )? ( ',' 'execute' '{' ( RULE_STRING )* '}' )? )
            {
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:764:1: ( 'groupId' ':' (lv_groupId_2= ruleGroupId ) ',' 'artifactId' ':' (lv_artifactId_6= ruleArtifactId ) ',' 'version' ':' (lv_version_10= ruleVersion ) ( ',' 'phase' ':' RULE_ID )? ( ',' 'extensionId' ':' RULE_ID )? ( ',' 'execute' '{' ( RULE_STRING )* '}' )? )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:764:2: 'groupId' ':' (lv_groupId_2= ruleGroupId ) ',' 'artifactId' ':' (lv_artifactId_6= ruleArtifactId ) ',' 'version' ':' (lv_version_10= ruleVersion ) ( ',' 'phase' ':' RULE_ID )? ( ',' 'extensionId' ':' RULE_ID )? ( ',' 'execute' '{' ( RULE_STRING )* '}' )?
            {
            match(input,13,FOLLOW_13_in_rulePlugin1631); 

                    createLeafNode(grammarAccess.getPluginAccess().getGroupIdKeyword_0(), null); 
                
            match(input,14,FOLLOW_14_in_rulePlugin1640); 

                    createLeafNode(grammarAccess.getPluginAccess().getColonKeyword_1(), null); 
                
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:772:1: (lv_groupId_2= ruleGroupId )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:775:6: lv_groupId_2= ruleGroupId
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPluginAccess().getGroupIdGroupIdParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleGroupId_in_rulePlugin1674);
            lv_groupId_2=ruleGroupId();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPluginRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "groupId", lv_groupId_2, "GroupId", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,22,FOLLOW_22_in_rulePlugin1687); 

                    createLeafNode(grammarAccess.getPluginAccess().getCommaKeyword_3(), null); 
                
            match(input,15,FOLLOW_15_in_rulePlugin1696); 

                    createLeafNode(grammarAccess.getPluginAccess().getArtifactIdKeyword_4(), null); 
                
            match(input,14,FOLLOW_14_in_rulePlugin1705); 

                    createLeafNode(grammarAccess.getPluginAccess().getColonKeyword_5(), null); 
                
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:805:1: (lv_artifactId_6= ruleArtifactId )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:808:6: lv_artifactId_6= ruleArtifactId
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPluginAccess().getArtifactIdArtifactIdParserRuleCall_6_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleArtifactId_in_rulePlugin1739);
            lv_artifactId_6=ruleArtifactId();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPluginRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "artifactId", lv_artifactId_6, "ArtifactId", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,22,FOLLOW_22_in_rulePlugin1752); 

                    createLeafNode(grammarAccess.getPluginAccess().getCommaKeyword_7(), null); 
                
            match(input,16,FOLLOW_16_in_rulePlugin1761); 

                    createLeafNode(grammarAccess.getPluginAccess().getVersionKeyword_8(), null); 
                
            match(input,14,FOLLOW_14_in_rulePlugin1770); 

                    createLeafNode(grammarAccess.getPluginAccess().getColonKeyword_9(), null); 
                
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:838:1: (lv_version_10= ruleVersion )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:841:6: lv_version_10= ruleVersion
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPluginAccess().getVersionVersionParserRuleCall_10_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleVersion_in_rulePlugin1804);
            lv_version_10=ruleVersion();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPluginRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "version", lv_version_10, "Version", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:859:2: ( ',' 'phase' ':' RULE_ID )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==22) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==30) ) {
                    alt20=1;
                }
            }
            switch (alt20) {
                case 1 :
                    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:859:3: ',' 'phase' ':' RULE_ID
                    {
                    match(input,22,FOLLOW_22_in_rulePlugin1818); 

                            createLeafNode(grammarAccess.getPluginAccess().getCommaKeyword_11_0(), null); 
                        
                    match(input,30,FOLLOW_30_in_rulePlugin1827); 

                            createLeafNode(grammarAccess.getPluginAccess().getPhaseKeyword_11_1(), null); 
                        
                    match(input,14,FOLLOW_14_in_rulePlugin1836); 

                            createLeafNode(grammarAccess.getPluginAccess().getColonKeyword_11_2(), null); 
                        
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePlugin1845); 
                     
                        createLeafNode(grammarAccess.getPluginAccess().getIDTerminalRuleCall_11_3(), null); 
                        

                    }
                    break;

            }

            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:875:3: ( ',' 'extensionId' ':' RULE_ID )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==22) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==31) ) {
                    alt21=1;
                }
            }
            switch (alt21) {
                case 1 :
                    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:875:4: ',' 'extensionId' ':' RULE_ID
                    {
                    match(input,22,FOLLOW_22_in_rulePlugin1856); 

                            createLeafNode(grammarAccess.getPluginAccess().getCommaKeyword_12_0(), null); 
                        
                    match(input,31,FOLLOW_31_in_rulePlugin1865); 

                            createLeafNode(grammarAccess.getPluginAccess().getExtensionIdKeyword_12_1(), null); 
                        
                    match(input,14,FOLLOW_14_in_rulePlugin1874); 

                            createLeafNode(grammarAccess.getPluginAccess().getColonKeyword_12_2(), null); 
                        
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePlugin1883); 
                     
                        createLeafNode(grammarAccess.getPluginAccess().getIDTerminalRuleCall_12_3(), null); 
                        

                    }
                    break;

            }

            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:891:3: ( ',' 'execute' '{' ( RULE_STRING )* '}' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==22) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:891:4: ',' 'execute' '{' ( RULE_STRING )* '}'
                    {
                    match(input,22,FOLLOW_22_in_rulePlugin1894); 

                            createLeafNode(grammarAccess.getPluginAccess().getCommaKeyword_13_0(), null); 
                        
                    match(input,32,FOLLOW_32_in_rulePlugin1903); 

                            createLeafNode(grammarAccess.getPluginAccess().getExecuteKeyword_13_1(), null); 
                        
                    match(input,12,FOLLOW_12_in_rulePlugin1912); 

                            createLeafNode(grammarAccess.getPluginAccess().getLeftCurlyBracketKeyword_13_2(), null); 
                        
                    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:903:1: ( RULE_STRING )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==RULE_STRING) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:903:2: RULE_STRING
                    	    {
                    	    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePlugin1922); 
                    	     
                    	        createLeafNode(grammarAccess.getPluginAccess().getSTRINGTerminalRuleCall_13_3(), null); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    match(input,18,FOLLOW_18_in_rulePlugin1932); 

                            createLeafNode(grammarAccess.getPluginAccess().getRightCurlyBracketKeyword_13_4(), null); 
                        

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePlugin


    // $ANTLR start entryRuleExtension
    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:918:1: entryRuleExtension returns [EObject current=null] : iv_ruleExtension= ruleExtension EOF ;
    public final EObject entryRuleExtension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtension = null;


        try {
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:918:51: (iv_ruleExtension= ruleExtension EOF )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:919:2: iv_ruleExtension= ruleExtension EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExtensionRule(), currentNode); 
            pushFollow(FOLLOW_ruleExtension_in_entryRuleExtension1967);
            iv_ruleExtension=ruleExtension();
            _fsp--;

             current =iv_ruleExtension; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtension1977); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleExtension


    // $ANTLR start ruleExtension
    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:926:1: ruleExtension returns [EObject current=null] : ( 'groupId' ':' (lv_groupId_2= ruleGroupId ) ',' 'artifactId' ':' (lv_artifactId_6= ruleArtifactId ) ',' 'version' ':' (lv_version_10= ruleVersion ) ',' 'extensionId' ':' RULE_ID ',' 'execute' '{' ( RULE_STRING )* '}' ) ;
    public final EObject ruleExtension() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_groupId_2 = null;

        AntlrDatatypeRuleToken lv_artifactId_6 = null;

        AntlrDatatypeRuleToken lv_version_10 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:931:6: ( ( 'groupId' ':' (lv_groupId_2= ruleGroupId ) ',' 'artifactId' ':' (lv_artifactId_6= ruleArtifactId ) ',' 'version' ':' (lv_version_10= ruleVersion ) ',' 'extensionId' ':' RULE_ID ',' 'execute' '{' ( RULE_STRING )* '}' ) )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:932:1: ( 'groupId' ':' (lv_groupId_2= ruleGroupId ) ',' 'artifactId' ':' (lv_artifactId_6= ruleArtifactId ) ',' 'version' ':' (lv_version_10= ruleVersion ) ',' 'extensionId' ':' RULE_ID ',' 'execute' '{' ( RULE_STRING )* '}' )
            {
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:932:1: ( 'groupId' ':' (lv_groupId_2= ruleGroupId ) ',' 'artifactId' ':' (lv_artifactId_6= ruleArtifactId ) ',' 'version' ':' (lv_version_10= ruleVersion ) ',' 'extensionId' ':' RULE_ID ',' 'execute' '{' ( RULE_STRING )* '}' )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:932:2: 'groupId' ':' (lv_groupId_2= ruleGroupId ) ',' 'artifactId' ':' (lv_artifactId_6= ruleArtifactId ) ',' 'version' ':' (lv_version_10= ruleVersion ) ',' 'extensionId' ':' RULE_ID ',' 'execute' '{' ( RULE_STRING )* '}'
            {
            match(input,13,FOLLOW_13_in_ruleExtension2011); 

                    createLeafNode(grammarAccess.getExtensionAccess().getGroupIdKeyword_0(), null); 
                
            match(input,14,FOLLOW_14_in_ruleExtension2020); 

                    createLeafNode(grammarAccess.getExtensionAccess().getColonKeyword_1(), null); 
                
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:940:1: (lv_groupId_2= ruleGroupId )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:943:6: lv_groupId_2= ruleGroupId
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getExtensionAccess().getGroupIdGroupIdParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleGroupId_in_ruleExtension2054);
            lv_groupId_2=ruleGroupId();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getExtensionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "groupId", lv_groupId_2, "GroupId", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,22,FOLLOW_22_in_ruleExtension2067); 

                    createLeafNode(grammarAccess.getExtensionAccess().getCommaKeyword_3(), null); 
                
            match(input,15,FOLLOW_15_in_ruleExtension2076); 

                    createLeafNode(grammarAccess.getExtensionAccess().getArtifactIdKeyword_4(), null); 
                
            match(input,14,FOLLOW_14_in_ruleExtension2085); 

                    createLeafNode(grammarAccess.getExtensionAccess().getColonKeyword_5(), null); 
                
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:973:1: (lv_artifactId_6= ruleArtifactId )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:976:6: lv_artifactId_6= ruleArtifactId
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getExtensionAccess().getArtifactIdArtifactIdParserRuleCall_6_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleArtifactId_in_ruleExtension2119);
            lv_artifactId_6=ruleArtifactId();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getExtensionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "artifactId", lv_artifactId_6, "ArtifactId", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,22,FOLLOW_22_in_ruleExtension2132); 

                    createLeafNode(grammarAccess.getExtensionAccess().getCommaKeyword_7(), null); 
                
            match(input,16,FOLLOW_16_in_ruleExtension2141); 

                    createLeafNode(grammarAccess.getExtensionAccess().getVersionKeyword_8(), null); 
                
            match(input,14,FOLLOW_14_in_ruleExtension2150); 

                    createLeafNode(grammarAccess.getExtensionAccess().getColonKeyword_9(), null); 
                
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1006:1: (lv_version_10= ruleVersion )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1009:6: lv_version_10= ruleVersion
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getExtensionAccess().getVersionVersionParserRuleCall_10_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleVersion_in_ruleExtension2184);
            lv_version_10=ruleVersion();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getExtensionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "version", lv_version_10, "Version", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,22,FOLLOW_22_in_ruleExtension2197); 

                    createLeafNode(grammarAccess.getExtensionAccess().getCommaKeyword_11(), null); 
                
            match(input,31,FOLLOW_31_in_ruleExtension2206); 

                    createLeafNode(grammarAccess.getExtensionAccess().getExtensionIdKeyword_12(), null); 
                
            match(input,14,FOLLOW_14_in_ruleExtension2215); 

                    createLeafNode(grammarAccess.getExtensionAccess().getColonKeyword_13(), null); 
                
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExtension2224); 
             
                createLeafNode(grammarAccess.getExtensionAccess().getIDTerminalRuleCall_14(), null); 
                
            match(input,22,FOLLOW_22_in_ruleExtension2232); 

                    createLeafNode(grammarAccess.getExtensionAccess().getCommaKeyword_15(), null); 
                
            match(input,32,FOLLOW_32_in_ruleExtension2241); 

                    createLeafNode(grammarAccess.getExtensionAccess().getExecuteKeyword_16(), null); 
                
            match(input,12,FOLLOW_12_in_ruleExtension2250); 

                    createLeafNode(grammarAccess.getExtensionAccess().getLeftCurlyBracketKeyword_17(), null); 
                
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1055:1: ( RULE_STRING )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_STRING) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1055:2: RULE_STRING
            	    {
            	    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleExtension2260); 
            	     
            	        createLeafNode(grammarAccess.getExtensionAccess().getSTRINGTerminalRuleCall_18(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            match(input,18,FOLLOW_18_in_ruleExtension2270); 

                    createLeafNode(grammarAccess.getExtensionAccess().getRightCurlyBracketKeyword_19(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleExtension


    // $ANTLR start entryRuleGroupId
    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1072:1: entryRuleGroupId returns [String current=null] : iv_ruleGroupId= ruleGroupId EOF ;
    public final String entryRuleGroupId() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGroupId = null;


        try {
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1072:48: (iv_ruleGroupId= ruleGroupId EOF )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1073:2: iv_ruleGroupId= ruleGroupId EOF
            {
             currentNode = createCompositeNode(grammarAccess.getGroupIdRule(), currentNode); 
            pushFollow(FOLLOW_ruleGroupId_in_entryRuleGroupId2306);
            iv_ruleGroupId=ruleGroupId();
            _fsp--;

             current =iv_ruleGroupId.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroupId2317); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleGroupId


    // $ANTLR start ruleGroupId
    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1080:1: ruleGroupId returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' | kw= '-' )? )* ;
    public final AntlrDatatypeRuleToken ruleGroupId() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1086:6: ( (this_ID_0= RULE_ID (kw= '.' | kw= '-' )? )* )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1087:1: (this_ID_0= RULE_ID (kw= '.' | kw= '-' )? )*
            {
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1087:1: (this_ID_0= RULE_ID (kw= '.' | kw= '-' )? )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1087:6: this_ID_0= RULE_ID (kw= '.' | kw= '-' )?
            	    {
            	    this_ID_0=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGroupId2357); 

            	    		current.merge(this_ID_0);
            	        
            	     
            	        createLeafNode(grammarAccess.getGroupIdAccess().getIDTerminalRuleCall_0(), null); 
            	        
            	    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1094:1: (kw= '.' | kw= '-' )?
            	    int alt25=3;
            	    int LA25_0 = input.LA(1);

            	    if ( (LA25_0==33) ) {
            	        alt25=1;
            	    }
            	    else if ( (LA25_0==34) ) {
            	        alt25=2;
            	    }
            	    switch (alt25) {
            	        case 1 :
            	            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1095:2: kw= '.'
            	            {
            	            kw=(Token)input.LT(1);
            	            match(input,33,FOLLOW_33_in_ruleGroupId2376); 

            	                    current.merge(kw);
            	                    createLeafNode(grammarAccess.getGroupIdAccess().getFullStopKeyword_1_0(), null); 
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1102:2: kw= '-'
            	            {
            	            kw=(Token)input.LT(1);
            	            match(input,34,FOLLOW_34_in_ruleGroupId2395); 

            	                    current.merge(kw);
            	                    createLeafNode(grammarAccess.getGroupIdAccess().getHyphenMinusKeyword_1_1(), null); 
            	                

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
            	    lastConsumedDatatypeToken = current;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleGroupId


    // $ANTLR start entryRuleArtifactId
    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1115:1: entryRuleArtifactId returns [String current=null] : iv_ruleArtifactId= ruleArtifactId EOF ;
    public final String entryRuleArtifactId() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArtifactId = null;


        try {
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1115:51: (iv_ruleArtifactId= ruleArtifactId EOF )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1116:2: iv_ruleArtifactId= ruleArtifactId EOF
            {
             currentNode = createCompositeNode(grammarAccess.getArtifactIdRule(), currentNode); 
            pushFollow(FOLLOW_ruleArtifactId_in_entryRuleArtifactId2437);
            iv_ruleArtifactId=ruleArtifactId();
            _fsp--;

             current =iv_ruleArtifactId.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArtifactId2448); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleArtifactId


    // $ANTLR start ruleArtifactId
    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1123:1: ruleArtifactId returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' | kw= '-' )? )* ;
    public final AntlrDatatypeRuleToken ruleArtifactId() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1129:6: ( (this_ID_0= RULE_ID (kw= '.' | kw= '-' )? )* )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1130:1: (this_ID_0= RULE_ID (kw= '.' | kw= '-' )? )*
            {
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1130:1: (this_ID_0= RULE_ID (kw= '.' | kw= '-' )? )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_ID) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1130:6: this_ID_0= RULE_ID (kw= '.' | kw= '-' )?
            	    {
            	    this_ID_0=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArtifactId2488); 

            	    		current.merge(this_ID_0);
            	        
            	     
            	        createLeafNode(grammarAccess.getArtifactIdAccess().getIDTerminalRuleCall_0(), null); 
            	        
            	    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1137:1: (kw= '.' | kw= '-' )?
            	    int alt27=3;
            	    int LA27_0 = input.LA(1);

            	    if ( (LA27_0==33) ) {
            	        alt27=1;
            	    }
            	    else if ( (LA27_0==34) ) {
            	        alt27=2;
            	    }
            	    switch (alt27) {
            	        case 1 :
            	            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1138:2: kw= '.'
            	            {
            	            kw=(Token)input.LT(1);
            	            match(input,33,FOLLOW_33_in_ruleArtifactId2507); 

            	                    current.merge(kw);
            	                    createLeafNode(grammarAccess.getArtifactIdAccess().getFullStopKeyword_1_0(), null); 
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1145:2: kw= '-'
            	            {
            	            kw=(Token)input.LT(1);
            	            match(input,34,FOLLOW_34_in_ruleArtifactId2526); 

            	                    current.merge(kw);
            	                    createLeafNode(grammarAccess.getArtifactIdAccess().getHyphenMinusKeyword_1_1(), null); 
            	                

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
            	    lastConsumedDatatypeToken = current;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleArtifactId


    // $ANTLR start entryRuleVersion
    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1158:1: entryRuleVersion returns [String current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final String entryRuleVersion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersion = null;


        try {
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1158:48: (iv_ruleVersion= ruleVersion EOF )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1159:2: iv_ruleVersion= ruleVersion EOF
            {
             currentNode = createCompositeNode(grammarAccess.getVersionRule(), currentNode); 
            pushFollow(FOLLOW_ruleVersion_in_entryRuleVersion2568);
            iv_ruleVersion=ruleVersion();
            _fsp--;

             current =iv_ruleVersion.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVersion2579); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleVersion


    // $ANTLR start ruleVersion
    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1166:1: ruleVersion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )* ) ;
    public final AntlrDatatypeRuleToken ruleVersion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1172:6: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )* ) )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1173:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )* )
            {
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1173:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )* )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1173:6: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )*
            {
            this_INT_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleVersion2619); 

            		current.merge(this_INT_0);
                
             
                createLeafNode(grammarAccess.getVersionAccess().getINTTerminalRuleCall_0(), null); 
                
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1180:1: (kw= '.' this_INT_2= RULE_INT )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==33) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1181:2: kw= '.' this_INT_2= RULE_INT
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,33,FOLLOW_33_in_ruleVersion2638); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getVersionAccess().getFullStopKeyword_1_0(), null); 
            	        
            	    this_INT_2=(Token)input.LT(1);
            	    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleVersion2653); 

            	    		current.merge(this_INT_2);
            	        
            	     
            	        createLeafNode(grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
            	    lastConsumedDatatypeToken = current;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleVersion


    // $ANTLR start entryRuleImport
    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1203:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1203:48: (iv_ruleImport= ruleImport EOF )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1204:2: iv_ruleImport= ruleImport EOF
            {
             currentNode = createCompositeNode(grammarAccess.getImportRule(), currentNode); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport2700);
            iv_ruleImport=ruleImport();
            _fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport2710); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleImport


    // $ANTLR start ruleImport
    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1211:1: ruleImport returns [EObject current=null] : ( 'import' (lv_importURI_1= RULE_STRING ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token lv_importURI_1=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1216:6: ( ( 'import' (lv_importURI_1= RULE_STRING ) ) )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1217:1: ( 'import' (lv_importURI_1= RULE_STRING ) )
            {
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1217:1: ( 'import' (lv_importURI_1= RULE_STRING ) )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1217:2: 'import' (lv_importURI_1= RULE_STRING )
            {
            match(input,35,FOLLOW_35_in_ruleImport2744); 

                    createLeafNode(grammarAccess.getImportAccess().getImportKeyword_0(), null); 
                
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1221:1: (lv_importURI_1= RULE_STRING )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1223:6: lv_importURI_1= RULE_STRING
            {
            lv_importURI_1=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImport2766); 

            		createLeafNode(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0(), "importURI"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getImportRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "importURI", lv_importURI_1, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleImport


    // $ANTLR start entryRuleType
    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1248:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1248:46: (iv_ruleType= ruleType EOF )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1249:2: iv_ruleType= ruleType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType2807);
            iv_ruleType=ruleType();
            _fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType2817); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleType


    // $ANTLR start ruleType
    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1256:1: ruleType returns [EObject current=null] : (this_SimpleType_0= ruleSimpleType | this_Entity_1= ruleEntity ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleType_0 = null;

        EObject this_Entity_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1261:6: ( (this_SimpleType_0= ruleSimpleType | this_Entity_1= ruleEntity ) )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1262:1: (this_SimpleType_0= ruleSimpleType | this_Entity_1= ruleEntity )
            {
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1262:1: (this_SimpleType_0= ruleSimpleType | this_Entity_1= ruleEntity )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==27) ) {
                alt30=1;
            }
            else if ( (LA30_0==36) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1262:1: (this_SimpleType_0= ruleSimpleType | this_Entity_1= ruleEntity )", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1263:5: this_SimpleType_0= ruleSimpleType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getSimpleTypeParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSimpleType_in_ruleType2864);
                    this_SimpleType_0=ruleSimpleType();
                    _fsp--;

                     
                            current = this_SimpleType_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1273:5: this_Entity_1= ruleEntity
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getEntityParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEntity_in_ruleType2891);
                    this_Entity_1=ruleEntity();
                    _fsp--;

                     
                            current = this_Entity_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleType


    // $ANTLR start entryRuleSimpleType
    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1288:1: entryRuleSimpleType returns [EObject current=null] : iv_ruleSimpleType= ruleSimpleType EOF ;
    public final EObject entryRuleSimpleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleType = null;


        try {
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1288:52: (iv_ruleSimpleType= ruleSimpleType EOF )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1289:2: iv_ruleSimpleType= ruleSimpleType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSimpleTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleSimpleType_in_entryRuleSimpleType2923);
            iv_ruleSimpleType=ruleSimpleType();
            _fsp--;

             current =iv_ruleSimpleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleType2933); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSimpleType


    // $ANTLR start ruleSimpleType
    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1296:1: ruleSimpleType returns [EObject current=null] : ( 'type' (lv_name_1= RULE_ID ) ) ;
    public final EObject ruleSimpleType() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1301:6: ( ( 'type' (lv_name_1= RULE_ID ) ) )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1302:1: ( 'type' (lv_name_1= RULE_ID ) )
            {
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1302:1: ( 'type' (lv_name_1= RULE_ID ) )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1302:2: 'type' (lv_name_1= RULE_ID )
            {
            match(input,27,FOLLOW_27_in_ruleSimpleType2967); 

                    createLeafNode(grammarAccess.getSimpleTypeAccess().getTypeKeyword_0(), null); 
                
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1306:1: (lv_name_1= RULE_ID )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1308:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSimpleType2989); 

            		createLeafNode(grammarAccess.getSimpleTypeAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSimpleTypeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_1, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSimpleType


    // $ANTLR start entryRuleEntity
    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1333:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1333:48: (iv_ruleEntity= ruleEntity EOF )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1334:2: iv_ruleEntity= ruleEntity EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEntityRule(), currentNode); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity3030);
            iv_ruleEntity=ruleEntity();
            _fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity3040); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEntity


    // $ANTLR start ruleEntity
    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1341:1: ruleEntity returns [EObject current=null] : ( 'entity' (lv_name_1= RULE_ID ) ( 'extends' ( RULE_ID ) )? '{' (lv_properties_5= ruleProperty )* '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;
        EObject lv_properties_5 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1346:6: ( ( 'entity' (lv_name_1= RULE_ID ) ( 'extends' ( RULE_ID ) )? '{' (lv_properties_5= ruleProperty )* '}' ) )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1347:1: ( 'entity' (lv_name_1= RULE_ID ) ( 'extends' ( RULE_ID ) )? '{' (lv_properties_5= ruleProperty )* '}' )
            {
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1347:1: ( 'entity' (lv_name_1= RULE_ID ) ( 'extends' ( RULE_ID ) )? '{' (lv_properties_5= ruleProperty )* '}' )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1347:2: 'entity' (lv_name_1= RULE_ID ) ( 'extends' ( RULE_ID ) )? '{' (lv_properties_5= ruleProperty )* '}'
            {
            match(input,36,FOLLOW_36_in_ruleEntity3074); 

                    createLeafNode(grammarAccess.getEntityAccess().getEntityKeyword_0(), null); 
                
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1351:1: (lv_name_1= RULE_ID )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1353:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity3096); 

            		createLeafNode(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEntityRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_1, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1371:2: ( 'extends' ( RULE_ID ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==37) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1371:3: 'extends' ( RULE_ID )
                    {
                    match(input,37,FOLLOW_37_in_ruleEntity3114); 

                            createLeafNode(grammarAccess.getEntityAccess().getExtendsKeyword_2_0(), null); 
                        
                    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1375:1: ( RULE_ID )
                    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1378:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getEntityRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity3136); 

                    		createLeafNode(grammarAccess.getEntityAccess().getExtendsEntityCrossReference_2_1_0(), "extends"); 
                    	

                    }


                    }
                    break;

            }

            match(input,12,FOLLOW_12_in_ruleEntity3150); 

                    createLeafNode(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3(), null); 
                
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1395:1: (lv_properties_5= ruleProperty )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==38) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1398:6: lv_properties_5= ruleProperty
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getEntityAccess().getPropertiesPropertyParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleProperty_in_ruleEntity3184);
            	    lv_properties_5=ruleProperty();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getEntityRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "properties", lv_properties_5, "Property", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            match(input,18,FOLLOW_18_in_ruleEntity3198); 

                    createLeafNode(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEntity


    // $ANTLR start entryRuleProperty
    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1427:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1427:50: (iv_ruleProperty= ruleProperty EOF )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1428:2: iv_ruleProperty= ruleProperty EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPropertyRule(), currentNode); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty3231);
            iv_ruleProperty=ruleProperty();
            _fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty3241); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleProperty


    // $ANTLR start ruleProperty
    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1435:1: ruleProperty returns [EObject current=null] : ( 'property' (lv_name_1= RULE_ID ) ':' ( RULE_ID ) (lv_many_4= '[]' )? ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;
        Token lv_many_4=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1440:6: ( ( 'property' (lv_name_1= RULE_ID ) ':' ( RULE_ID ) (lv_many_4= '[]' )? ) )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1441:1: ( 'property' (lv_name_1= RULE_ID ) ':' ( RULE_ID ) (lv_many_4= '[]' )? )
            {
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1441:1: ( 'property' (lv_name_1= RULE_ID ) ':' ( RULE_ID ) (lv_many_4= '[]' )? )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1441:2: 'property' (lv_name_1= RULE_ID ) ':' ( RULE_ID ) (lv_many_4= '[]' )?
            {
            match(input,38,FOLLOW_38_in_ruleProperty3275); 

                    createLeafNode(grammarAccess.getPropertyAccess().getPropertyKeyword_0(), null); 
                
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1445:1: (lv_name_1= RULE_ID )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1447:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProperty3297); 

            		createLeafNode(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPropertyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_1, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,14,FOLLOW_14_in_ruleProperty3314); 

                    createLeafNode(grammarAccess.getPropertyAccess().getColonKeyword_2(), null); 
                
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1469:1: ( RULE_ID )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1472:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getPropertyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProperty3336); 

            		createLeafNode(grammarAccess.getPropertyAccess().getTypeTypeCrossReference_3_0(), "type"); 
            	

            }

            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1485:2: (lv_many_4= '[]' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==39) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1487:6: lv_many_4= '[]'
                    {
                    lv_many_4=(Token)input.LT(1);
                    match(input,39,FOLLOW_39_in_ruleProperty3360); 

                            createLeafNode(grammarAccess.getPropertyAccess().getManyLeftSquareBracketRightSquareBracketKeyword_4_0(), "many"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPropertyRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "many", true, "[]", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleProperty


 

    public static final BitSet FOLLOW_ruleProject_in_entryRuleProject73 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProject83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleProject117 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleProject126 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleProject135 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleProject144 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_ruleGroupId_in_ruleProject178 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleProject191 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleProject200 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_ruleArtifactId_in_ruleProject234 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleProject247 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleProject256 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleVersion_in_ruleProject290 = new BitSet(new long[]{0x00000000003E0000L});
    public static final BitSet FOLLOW_17_in_ruleProject304 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleProject313 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_ruleDependency_in_ruleProject347 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_18_in_ruleProject361 = new BitSet(new long[]{0x00000000003C0000L});
    public static final BitSet FOLLOW_19_in_ruleProject373 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleProject382 = new BitSet(new long[]{0x0000000001840000L});
    public static final BitSet FOLLOW_ruleMappedDependency_in_ruleProject416 = new BitSet(new long[]{0x0000000001840000L});
    public static final BitSet FOLLOW_18_in_ruleProject430 = new BitSet(new long[]{0x0000000000340000L});
    public static final BitSet FOLLOW_20_in_ruleProject442 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleProject451 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_rulePlugin_in_ruleProject485 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_18_in_ruleProject499 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_21_in_ruleProject511 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleProject520 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_ruleExtension_in_ruleProject554 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_18_in_ruleProject568 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleProject579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGA_in_entryRuleGA612 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGA622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleGA656 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleGA665 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_ruleGroupId_in_ruleGA699 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleGA712 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleGA721 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleGA730 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleArtifactId_in_ruleGA764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependency_in_entryRuleDependency801 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependency811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleDependency845 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDependency854 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_ruleGroupId_in_ruleDependency888 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleDependency901 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleDependency910 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDependency919 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_ruleArtifactId_in_ruleDependency953 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleDependency966 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleDependency975 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDependency984 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleVersion_in_ruleDependency1018 = new BitSet(new long[]{0x0000000001400002L});
    public static final BitSet FOLLOW_22_in_ruleDependency1033 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleDependency1042 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_24_in_ruleDependency1058 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleDependency1070 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleDependency1079 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleDependency1091 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleDependency1100 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleDependency1112 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleDependency1121 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleDependency1133 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleDependency1142 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDependency1151 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_ruleGA_in_ruleDependency1185 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_18_in_ruleDependency1199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMappedDependency_in_entryRuleMappedDependency1234 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMappedDependency1244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleMappedDependency1279 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_24_in_ruleMappedDependency1294 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleMappedDependency1304 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMappedDependency1313 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleMappedDependency1322 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleMappedDependency1331 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleMappedDependency1340 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMappedDependency1349 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleMappedDependency1360 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleMappedDependency1369 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleMappedDependency1378 = new BitSet(new long[]{0x0000000000400022L});
    public static final BitSet FOLLOW_ruleGroupId_in_ruleMappedDependency1412 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleMappedDependency1428 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleMappedDependency1437 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleMappedDependency1446 = new BitSet(new long[]{0x0000000000400022L});
    public static final BitSet FOLLOW_ruleArtifactId_in_ruleMappedDependency1480 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleMappedDependency1496 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleMappedDependency1505 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleMappedDependency1514 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleVersion_in_ruleMappedDependency1548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlugin_in_entryRulePlugin1587 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlugin1597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rulePlugin1631 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePlugin1640 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_ruleGroupId_in_rulePlugin1674 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_rulePlugin1687 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePlugin1696 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePlugin1705 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_ruleArtifactId_in_rulePlugin1739 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_rulePlugin1752 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_rulePlugin1761 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePlugin1770 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleVersion_in_rulePlugin1804 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_rulePlugin1818 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_rulePlugin1827 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePlugin1836 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePlugin1845 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_rulePlugin1856 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_rulePlugin1865 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePlugin1874 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePlugin1883 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_rulePlugin1894 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_rulePlugin1903 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulePlugin1912 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePlugin1922 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_18_in_rulePlugin1932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtension_in_entryRuleExtension1967 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtension1977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleExtension2011 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleExtension2020 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_ruleGroupId_in_ruleExtension2054 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleExtension2067 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleExtension2076 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleExtension2085 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_ruleArtifactId_in_ruleExtension2119 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleExtension2132 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleExtension2141 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleExtension2150 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleVersion_in_ruleExtension2184 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleExtension2197 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleExtension2206 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleExtension2215 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExtension2224 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleExtension2232 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleExtension2241 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleExtension2250 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleExtension2260 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_18_in_ruleExtension2270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupId_in_entryRuleGroupId2306 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroupId2317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGroupId2357 = new BitSet(new long[]{0x0000000600000022L});
    public static final BitSet FOLLOW_33_in_ruleGroupId2376 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_34_in_ruleGroupId2395 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleArtifactId_in_entryRuleArtifactId2437 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArtifactId2448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArtifactId2488 = new BitSet(new long[]{0x0000000600000022L});
    public static final BitSet FOLLOW_33_in_ruleArtifactId2507 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_34_in_ruleArtifactId2526 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleVersion_in_entryRuleVersion2568 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVersion2579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleVersion2619 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleVersion2638 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleVersion2653 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport2700 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport2710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleImport2744 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImport2766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType2807 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType2817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_ruleType2864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleType2891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_entryRuleSimpleType2923 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleType2933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleSimpleType2967 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSimpleType2989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity3030 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity3040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleEntity3074 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity3096 = new BitSet(new long[]{0x0000002000001000L});
    public static final BitSet FOLLOW_37_in_ruleEntity3114 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity3136 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEntity3150 = new BitSet(new long[]{0x0000004000040000L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleEntity3184 = new BitSet(new long[]{0x0000004000040000L});
    public static final BitSet FOLLOW_18_in_ruleEntity3198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty3231 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty3241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleProperty3275 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProperty3297 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleProperty3314 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProperty3336 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_ruleProperty3360 = new BitSet(new long[]{0x0000000000000002L});

}