lexer grammar InternalDependencyDsl;
@header {
package org.sonatype.maven.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;
}

T11 : 'url' ;
T12 : 'path' ;
T13 : '.' ;
T14 : '-' ;
T15 : 'project' ;
T16 : '{' ;
T17 : 'groupId' ;
T18 : ':' ;
T19 : 'artifactId' ;
T20 : 'version' ;
T21 : '}' ;
T22 : 'dependencies' ;
T23 : 'mappedDependencies' ;
T24 : 'plugins' ;
T25 : 'extensions' ;
T26 : ',' ;
T27 : 'scope' ;
T28 : 'classifier' ;
T29 : 'type' ;
T30 : 'exclusions' ;
T31 : 'exclude' ;
T32 : 'phase' ;
T33 : 'extensionId' ;
T34 : 'execute' ;
T35 : 'import' ;
T36 : 'entity' ;
T37 : 'extends' ;
T38 : 'property' ;
T39 : '[]' ;

// $ANTLR src "../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g" 4472
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g" 4474
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g" 4476
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g" 4478
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g" 4480
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g" 4482
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.sonatype.maven.dependencydsl.ui/src-gen/org/sonatype/maven/contentassist/antlr/internal/InternalDependencyDsl.g" 4484
RULE_ANY_OTHER : .;


