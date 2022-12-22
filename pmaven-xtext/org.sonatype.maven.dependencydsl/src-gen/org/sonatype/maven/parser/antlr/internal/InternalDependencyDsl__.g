lexer grammar InternalDependencyDsl;
@header {
package org.sonatype.maven.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'project' ;
T12 : '{' ;
T13 : 'groupId' ;
T14 : ':' ;
T15 : 'artifactId' ;
T16 : 'version' ;
T17 : 'dependencies' ;
T18 : '}' ;
T19 : 'mappedDependencies' ;
T20 : 'plugins' ;
T21 : 'extensions' ;
T22 : ',' ;
T23 : 'path' ;
T24 : 'url' ;
T25 : 'scope' ;
T26 : 'classifier' ;
T27 : 'type' ;
T28 : 'exclusions' ;
T29 : 'exclude' ;
T30 : 'phase' ;
T31 : 'extensionId' ;
T32 : 'execute' ;
T33 : '.' ;
T34 : '-' ;
T35 : 'import' ;
T36 : 'entity' ;
T37 : 'extends' ;
T38 : 'property' ;
T39 : '[]' ;

// $ANTLR src "../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g" 1512
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g" 1514
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g" 1516
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g" 1518
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g" 1520
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g" 1522
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g" 1524
RULE_ANY_OTHER : .;


