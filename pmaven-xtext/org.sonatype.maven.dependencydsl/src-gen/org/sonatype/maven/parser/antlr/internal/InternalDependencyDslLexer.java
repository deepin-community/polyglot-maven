package org.sonatype.maven.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalDependencyDslLexer extends Lexer {
    public static final int RULE_ID=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int T29=29;
    public static final int T28=28;
    public static final int T27=27;
    public static final int T26=26;
    public static final int T25=25;
    public static final int Tokens=40;
    public static final int T24=24;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=8;
    public static final int T23=23;
    public static final int T22=22;
    public static final int T21=21;
    public static final int T20=20;
    public static final int RULE_ML_COMMENT=7;
    public static final int RULE_STRING=4;
    public static final int RULE_INT=6;
    public static final int T38=38;
    public static final int T11=11;
    public static final int T37=37;
    public static final int T12=12;
    public static final int T13=13;
    public static final int T39=39;
    public static final int T14=14;
    public static final int T34=34;
    public static final int RULE_WS=9;
    public static final int T15=15;
    public static final int T33=33;
    public static final int T16=16;
    public static final int T36=36;
    public static final int T17=17;
    public static final int T35=35;
    public static final int T18=18;
    public static final int T30=30;
    public static final int T19=19;
    public static final int T32=32;
    public static final int T31=31;
    public InternalDependencyDslLexer() {;} 
    public InternalDependencyDslLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g"; }

    // $ANTLR start T11
    public final void mT11() throws RecognitionException {
        try {
            int _type = T11;
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:10:5: ( 'project' )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:10:7: 'project'
            {
            match("project"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T11

    // $ANTLR start T12
    public final void mT12() throws RecognitionException {
        try {
            int _type = T12;
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:11:5: ( '{' )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:11:7: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T12

    // $ANTLR start T13
    public final void mT13() throws RecognitionException {
        try {
            int _type = T13;
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:12:5: ( 'groupId' )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:12:7: 'groupId'
            {
            match("groupId"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T13

    // $ANTLR start T14
    public final void mT14() throws RecognitionException {
        try {
            int _type = T14;
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:13:5: ( ':' )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:13:7: ':'
            {
            match(':'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T14

    // $ANTLR start T15
    public final void mT15() throws RecognitionException {
        try {
            int _type = T15;
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:14:5: ( 'artifactId' )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:14:7: 'artifactId'
            {
            match("artifactId"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T15

    // $ANTLR start T16
    public final void mT16() throws RecognitionException {
        try {
            int _type = T16;
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:15:5: ( 'version' )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:15:7: 'version'
            {
            match("version"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T16

    // $ANTLR start T17
    public final void mT17() throws RecognitionException {
        try {
            int _type = T17;
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:16:5: ( 'dependencies' )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:16:7: 'dependencies'
            {
            match("dependencies"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T17

    // $ANTLR start T18
    public final void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:17:5: ( '}' )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:17:7: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T18

    // $ANTLR start T19
    public final void mT19() throws RecognitionException {
        try {
            int _type = T19;
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:18:5: ( 'mappedDependencies' )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:18:7: 'mappedDependencies'
            {
            match("mappedDependencies"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T19

    // $ANTLR start T20
    public final void mT20() throws RecognitionException {
        try {
            int _type = T20;
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:19:5: ( 'plugins' )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:19:7: 'plugins'
            {
            match("plugins"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T20

    // $ANTLR start T21
    public final void mT21() throws RecognitionException {
        try {
            int _type = T21;
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:20:5: ( 'extensions' )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:20:7: 'extensions'
            {
            match("extensions"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T21

    // $ANTLR start T22
    public final void mT22() throws RecognitionException {
        try {
            int _type = T22;
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:21:5: ( ',' )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:21:7: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T22

    // $ANTLR start T23
    public final void mT23() throws RecognitionException {
        try {
            int _type = T23;
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:22:5: ( 'path' )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:22:7: 'path'
            {
            match("path"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T23

    // $ANTLR start T24
    public final void mT24() throws RecognitionException {
        try {
            int _type = T24;
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:23:5: ( 'url' )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:23:7: 'url'
            {
            match("url"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T24

    // $ANTLR start T25
    public final void mT25() throws RecognitionException {
        try {
            int _type = T25;
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:24:5: ( 'scope' )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:24:7: 'scope'
            {
            match("scope"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T25

    // $ANTLR start T26
    public final void mT26() throws RecognitionException {
        try {
            int _type = T26;
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:25:5: ( 'classifier' )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:25:7: 'classifier'
            {
            match("classifier"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T26

    // $ANTLR start T27
    public final void mT27() throws RecognitionException {
        try {
            int _type = T27;
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:26:5: ( 'type' )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:26:7: 'type'
            {
            match("type"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T27

    // $ANTLR start T28
    public final void mT28() throws RecognitionException {
        try {
            int _type = T28;
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:27:5: ( 'exclusions' )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:27:7: 'exclusions'
            {
            match("exclusions"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T28

    // $ANTLR start T29
    public final void mT29() throws RecognitionException {
        try {
            int _type = T29;
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:28:5: ( 'exclude' )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:28:7: 'exclude'
            {
            match("exclude"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T29

    // $ANTLR start T30
    public final void mT30() throws RecognitionException {
        try {
            int _type = T30;
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:29:5: ( 'phase' )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:29:7: 'phase'
            {
            match("phase"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T30

    // $ANTLR start T31
    public final void mT31() throws RecognitionException {
        try {
            int _type = T31;
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:30:5: ( 'extensionId' )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:30:7: 'extensionId'
            {
            match("extensionId"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T31

    // $ANTLR start T32
    public final void mT32() throws RecognitionException {
        try {
            int _type = T32;
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:31:5: ( 'execute' )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:31:7: 'execute'
            {
            match("execute"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T32

    // $ANTLR start T33
    public final void mT33() throws RecognitionException {
        try {
            int _type = T33;
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:32:5: ( '.' )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:32:7: '.'
            {
            match('.'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T33

    // $ANTLR start T34
    public final void mT34() throws RecognitionException {
        try {
            int _type = T34;
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:33:5: ( '-' )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:33:7: '-'
            {
            match('-'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T34

    // $ANTLR start T35
    public final void mT35() throws RecognitionException {
        try {
            int _type = T35;
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:34:5: ( 'import' )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:34:7: 'import'
            {
            match("import"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T35

    // $ANTLR start T36
    public final void mT36() throws RecognitionException {
        try {
            int _type = T36;
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:35:5: ( 'entity' )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:35:7: 'entity'
            {
            match("entity"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T36

    // $ANTLR start T37
    public final void mT37() throws RecognitionException {
        try {
            int _type = T37;
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:36:5: ( 'extends' )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:36:7: 'extends'
            {
            match("extends"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T37

    // $ANTLR start T38
    public final void mT38() throws RecognitionException {
        try {
            int _type = T38;
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:37:5: ( 'property' )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:37:7: 'property'
            {
            match("property"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T38

    // $ANTLR start T39
    public final void mT39() throws RecognitionException {
        try {
            int _type = T39;
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:38:5: ( '[]' )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:38:7: '[]'
            {
            match("[]"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T39

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1512:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1512:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1512:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1512:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1512:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ID

    // $ANTLR start RULE_INT
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1514:10: ( ( '0' .. '9' )+ )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1514:12: ( '0' .. '9' )+
            {
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1514:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1514:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INT

    // $ANTLR start RULE_STRING
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1516:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1516:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1516:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1516:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1516:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1516:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFE')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1516:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1516:62: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1516:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1516:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFE')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1516:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1516:129: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_STRING

    // $ANTLR start RULE_ML_COMMENT
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1518:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1518:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1518:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFE')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFE')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1518:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ML_COMMENT

    // $ANTLR start RULE_SL_COMMENT
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1520:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1520:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1520:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1520:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1520:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1520:41: ( '\\r' )? '\\n'
                    {
                    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1520:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1520:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SL_COMMENT

    // $ANTLR start RULE_WS
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1522:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1522:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1522:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_WS

    // $ANTLR start RULE_ANY_OTHER
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1524:16: ( . )
            // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1524:18: .
            {
            matchAny(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ANY_OTHER

    public void mTokens() throws RecognitionException {
        // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1:8: ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=36;
        int LA12_0 = input.LA(1);

        if ( (LA12_0=='p') ) {
            switch ( input.LA(2) ) {
            case 'r':
                {
                int LA12_28 = input.LA(3);

                if ( (LA12_28=='o') ) {
                    switch ( input.LA(4) ) {
                    case 'p':
                        {
                        int LA12_75 = input.LA(5);

                        if ( (LA12_75=='e') ) {
                            int LA12_94 = input.LA(6);

                            if ( (LA12_94=='r') ) {
                                int LA12_112 = input.LA(7);

                                if ( (LA12_112=='t') ) {
                                    int LA12_130 = input.LA(8);

                                    if ( (LA12_130=='y') ) {
                                        int LA12_146 = input.LA(9);

                                        if ( ((LA12_146>='0' && LA12_146<='9')||(LA12_146>='A' && LA12_146<='Z')||LA12_146=='_'||(LA12_146>='a' && LA12_146<='z')) ) {
                                            alt12=30;
                                        }
                                        else {
                                            alt12=28;}
                                    }
                                    else {
                                        alt12=30;}
                                }
                                else {
                                    alt12=30;}
                            }
                            else {
                                alt12=30;}
                        }
                        else {
                            alt12=30;}
                        }
                        break;
                    case 'j':
                        {
                        int LA12_76 = input.LA(5);

                        if ( (LA12_76=='e') ) {
                            int LA12_95 = input.LA(6);

                            if ( (LA12_95=='c') ) {
                                int LA12_113 = input.LA(7);

                                if ( (LA12_113=='t') ) {
                                    int LA12_131 = input.LA(8);

                                    if ( ((LA12_131>='0' && LA12_131<='9')||(LA12_131>='A' && LA12_131<='Z')||LA12_131=='_'||(LA12_131>='a' && LA12_131<='z')) ) {
                                        alt12=30;
                                    }
                                    else {
                                        alt12=1;}
                                }
                                else {
                                    alt12=30;}
                            }
                            else {
                                alt12=30;}
                        }
                        else {
                            alt12=30;}
                        }
                        break;
                    default:
                        alt12=30;}

                }
                else {
                    alt12=30;}
                }
                break;
            case 'a':
                {
                int LA12_29 = input.LA(3);

                if ( (LA12_29=='t') ) {
                    int LA12_58 = input.LA(4);

                    if ( (LA12_58=='h') ) {
                        int LA12_77 = input.LA(5);

                        if ( ((LA12_77>='0' && LA12_77<='9')||(LA12_77>='A' && LA12_77<='Z')||LA12_77=='_'||(LA12_77>='a' && LA12_77<='z')) ) {
                            alt12=30;
                        }
                        else {
                            alt12=13;}
                    }
                    else {
                        alt12=30;}
                }
                else {
                    alt12=30;}
                }
                break;
            case 'l':
                {
                int LA12_30 = input.LA(3);

                if ( (LA12_30=='u') ) {
                    int LA12_59 = input.LA(4);

                    if ( (LA12_59=='g') ) {
                        int LA12_78 = input.LA(5);

                        if ( (LA12_78=='i') ) {
                            int LA12_97 = input.LA(6);

                            if ( (LA12_97=='n') ) {
                                int LA12_114 = input.LA(7);

                                if ( (LA12_114=='s') ) {
                                    int LA12_132 = input.LA(8);

                                    if ( ((LA12_132>='0' && LA12_132<='9')||(LA12_132>='A' && LA12_132<='Z')||LA12_132=='_'||(LA12_132>='a' && LA12_132<='z')) ) {
                                        alt12=30;
                                    }
                                    else {
                                        alt12=10;}
                                }
                                else {
                                    alt12=30;}
                            }
                            else {
                                alt12=30;}
                        }
                        else {
                            alt12=30;}
                    }
                    else {
                        alt12=30;}
                }
                else {
                    alt12=30;}
                }
                break;
            case 'h':
                {
                int LA12_31 = input.LA(3);

                if ( (LA12_31=='a') ) {
                    int LA12_60 = input.LA(4);

                    if ( (LA12_60=='s') ) {
                        int LA12_79 = input.LA(5);

                        if ( (LA12_79=='e') ) {
                            int LA12_98 = input.LA(6);

                            if ( ((LA12_98>='0' && LA12_98<='9')||(LA12_98>='A' && LA12_98<='Z')||LA12_98=='_'||(LA12_98>='a' && LA12_98<='z')) ) {
                                alt12=30;
                            }
                            else {
                                alt12=20;}
                        }
                        else {
                            alt12=30;}
                    }
                    else {
                        alt12=30;}
                }
                else {
                    alt12=30;}
                }
                break;
            default:
                alt12=30;}

        }
        else if ( (LA12_0=='{') ) {
            alt12=2;
        }
        else if ( (LA12_0=='g') ) {
            int LA12_3 = input.LA(2);

            if ( (LA12_3=='r') ) {
                int LA12_34 = input.LA(3);

                if ( (LA12_34=='o') ) {
                    int LA12_61 = input.LA(4);

                    if ( (LA12_61=='u') ) {
                        int LA12_80 = input.LA(5);

                        if ( (LA12_80=='p') ) {
                            int LA12_99 = input.LA(6);

                            if ( (LA12_99=='I') ) {
                                int LA12_116 = input.LA(7);

                                if ( (LA12_116=='d') ) {
                                    int LA12_133 = input.LA(8);

                                    if ( ((LA12_133>='0' && LA12_133<='9')||(LA12_133>='A' && LA12_133<='Z')||LA12_133=='_'||(LA12_133>='a' && LA12_133<='z')) ) {
                                        alt12=30;
                                    }
                                    else {
                                        alt12=3;}
                                }
                                else {
                                    alt12=30;}
                            }
                            else {
                                alt12=30;}
                        }
                        else {
                            alt12=30;}
                    }
                    else {
                        alt12=30;}
                }
                else {
                    alt12=30;}
            }
            else {
                alt12=30;}
        }
        else if ( (LA12_0==':') ) {
            alt12=4;
        }
        else if ( (LA12_0=='a') ) {
            int LA12_5 = input.LA(2);

            if ( (LA12_5=='r') ) {
                int LA12_36 = input.LA(3);

                if ( (LA12_36=='t') ) {
                    int LA12_62 = input.LA(4);

                    if ( (LA12_62=='i') ) {
                        int LA12_81 = input.LA(5);

                        if ( (LA12_81=='f') ) {
                            int LA12_100 = input.LA(6);

                            if ( (LA12_100=='a') ) {
                                int LA12_117 = input.LA(7);

                                if ( (LA12_117=='c') ) {
                                    int LA12_134 = input.LA(8);

                                    if ( (LA12_134=='t') ) {
                                        int LA12_150 = input.LA(9);

                                        if ( (LA12_150=='I') ) {
                                            int LA12_161 = input.LA(10);

                                            if ( (LA12_161=='d') ) {
                                                int LA12_167 = input.LA(11);

                                                if ( ((LA12_167>='0' && LA12_167<='9')||(LA12_167>='A' && LA12_167<='Z')||LA12_167=='_'||(LA12_167>='a' && LA12_167<='z')) ) {
                                                    alt12=30;
                                                }
                                                else {
                                                    alt12=5;}
                                            }
                                            else {
                                                alt12=30;}
                                        }
                                        else {
                                            alt12=30;}
                                    }
                                    else {
                                        alt12=30;}
                                }
                                else {
                                    alt12=30;}
                            }
                            else {
                                alt12=30;}
                        }
                        else {
                            alt12=30;}
                    }
                    else {
                        alt12=30;}
                }
                else {
                    alt12=30;}
            }
            else {
                alt12=30;}
        }
        else if ( (LA12_0=='v') ) {
            int LA12_6 = input.LA(2);

            if ( (LA12_6=='e') ) {
                int LA12_37 = input.LA(3);

                if ( (LA12_37=='r') ) {
                    int LA12_63 = input.LA(4);

                    if ( (LA12_63=='s') ) {
                        int LA12_82 = input.LA(5);

                        if ( (LA12_82=='i') ) {
                            int LA12_101 = input.LA(6);

                            if ( (LA12_101=='o') ) {
                                int LA12_118 = input.LA(7);

                                if ( (LA12_118=='n') ) {
                                    int LA12_135 = input.LA(8);

                                    if ( ((LA12_135>='0' && LA12_135<='9')||(LA12_135>='A' && LA12_135<='Z')||LA12_135=='_'||(LA12_135>='a' && LA12_135<='z')) ) {
                                        alt12=30;
                                    }
                                    else {
                                        alt12=6;}
                                }
                                else {
                                    alt12=30;}
                            }
                            else {
                                alt12=30;}
                        }
                        else {
                            alt12=30;}
                    }
                    else {
                        alt12=30;}
                }
                else {
                    alt12=30;}
            }
            else {
                alt12=30;}
        }
        else if ( (LA12_0=='d') ) {
            int LA12_7 = input.LA(2);

            if ( (LA12_7=='e') ) {
                int LA12_38 = input.LA(3);

                if ( (LA12_38=='p') ) {
                    int LA12_64 = input.LA(4);

                    if ( (LA12_64=='e') ) {
                        int LA12_83 = input.LA(5);

                        if ( (LA12_83=='n') ) {
                            int LA12_102 = input.LA(6);

                            if ( (LA12_102=='d') ) {
                                int LA12_119 = input.LA(7);

                                if ( (LA12_119=='e') ) {
                                    int LA12_136 = input.LA(8);

                                    if ( (LA12_136=='n') ) {
                                        int LA12_152 = input.LA(9);

                                        if ( (LA12_152=='c') ) {
                                            int LA12_162 = input.LA(10);

                                            if ( (LA12_162=='i') ) {
                                                int LA12_168 = input.LA(11);

                                                if ( (LA12_168=='e') ) {
                                                    int LA12_175 = input.LA(12);

                                                    if ( (LA12_175=='s') ) {
                                                        int LA12_181 = input.LA(13);

                                                        if ( ((LA12_181>='0' && LA12_181<='9')||(LA12_181>='A' && LA12_181<='Z')||LA12_181=='_'||(LA12_181>='a' && LA12_181<='z')) ) {
                                                            alt12=30;
                                                        }
                                                        else {
                                                            alt12=7;}
                                                    }
                                                    else {
                                                        alt12=30;}
                                                }
                                                else {
                                                    alt12=30;}
                                            }
                                            else {
                                                alt12=30;}
                                        }
                                        else {
                                            alt12=30;}
                                    }
                                    else {
                                        alt12=30;}
                                }
                                else {
                                    alt12=30;}
                            }
                            else {
                                alt12=30;}
                        }
                        else {
                            alt12=30;}
                    }
                    else {
                        alt12=30;}
                }
                else {
                    alt12=30;}
            }
            else {
                alt12=30;}
        }
        else if ( (LA12_0=='}') ) {
            alt12=8;
        }
        else if ( (LA12_0=='m') ) {
            int LA12_9 = input.LA(2);

            if ( (LA12_9=='a') ) {
                int LA12_40 = input.LA(3);

                if ( (LA12_40=='p') ) {
                    int LA12_65 = input.LA(4);

                    if ( (LA12_65=='p') ) {
                        int LA12_84 = input.LA(5);

                        if ( (LA12_84=='e') ) {
                            int LA12_103 = input.LA(6);

                            if ( (LA12_103=='d') ) {
                                int LA12_120 = input.LA(7);

                                if ( (LA12_120=='D') ) {
                                    int LA12_137 = input.LA(8);

                                    if ( (LA12_137=='e') ) {
                                        int LA12_153 = input.LA(9);

                                        if ( (LA12_153=='p') ) {
                                            int LA12_163 = input.LA(10);

                                            if ( (LA12_163=='e') ) {
                                                int LA12_169 = input.LA(11);

                                                if ( (LA12_169=='n') ) {
                                                    int LA12_176 = input.LA(12);

                                                    if ( (LA12_176=='d') ) {
                                                        int LA12_182 = input.LA(13);

                                                        if ( (LA12_182=='e') ) {
                                                            int LA12_185 = input.LA(14);

                                                            if ( (LA12_185=='n') ) {
                                                                int LA12_186 = input.LA(15);

                                                                if ( (LA12_186=='c') ) {
                                                                    int LA12_187 = input.LA(16);

                                                                    if ( (LA12_187=='i') ) {
                                                                        int LA12_188 = input.LA(17);

                                                                        if ( (LA12_188=='e') ) {
                                                                            int LA12_189 = input.LA(18);

                                                                            if ( (LA12_189=='s') ) {
                                                                                int LA12_190 = input.LA(19);

                                                                                if ( ((LA12_190>='0' && LA12_190<='9')||(LA12_190>='A' && LA12_190<='Z')||LA12_190=='_'||(LA12_190>='a' && LA12_190<='z')) ) {
                                                                                    alt12=30;
                                                                                }
                                                                                else {
                                                                                    alt12=9;}
                                                                            }
                                                                            else {
                                                                                alt12=30;}
                                                                        }
                                                                        else {
                                                                            alt12=30;}
                                                                    }
                                                                    else {
                                                                        alt12=30;}
                                                                }
                                                                else {
                                                                    alt12=30;}
                                                            }
                                                            else {
                                                                alt12=30;}
                                                        }
                                                        else {
                                                            alt12=30;}
                                                    }
                                                    else {
                                                        alt12=30;}
                                                }
                                                else {
                                                    alt12=30;}
                                            }
                                            else {
                                                alt12=30;}
                                        }
                                        else {
                                            alt12=30;}
                                    }
                                    else {
                                        alt12=30;}
                                }
                                else {
                                    alt12=30;}
                            }
                            else {
                                alt12=30;}
                        }
                        else {
                            alt12=30;}
                    }
                    else {
                        alt12=30;}
                }
                else {
                    alt12=30;}
            }
            else {
                alt12=30;}
        }
        else if ( (LA12_0=='e') ) {
            switch ( input.LA(2) ) {
            case 'x':
                {
                switch ( input.LA(3) ) {
                case 't':
                    {
                    int LA12_66 = input.LA(4);

                    if ( (LA12_66=='e') ) {
                        int LA12_85 = input.LA(5);

                        if ( (LA12_85=='n') ) {
                            switch ( input.LA(6) ) {
                            case 's':
                                {
                                int LA12_121 = input.LA(7);

                                if ( (LA12_121=='i') ) {
                                    int LA12_138 = input.LA(8);

                                    if ( (LA12_138=='o') ) {
                                        int LA12_154 = input.LA(9);

                                        if ( (LA12_154=='n') ) {
                                            switch ( input.LA(10) ) {
                                            case 's':
                                                {
                                                int LA12_170 = input.LA(11);

                                                if ( ((LA12_170>='0' && LA12_170<='9')||(LA12_170>='A' && LA12_170<='Z')||LA12_170=='_'||(LA12_170>='a' && LA12_170<='z')) ) {
                                                    alt12=30;
                                                }
                                                else {
                                                    alt12=11;}
                                                }
                                                break;
                                            case 'I':
                                                {
                                                int LA12_171 = input.LA(11);

                                                if ( (LA12_171=='d') ) {
                                                    int LA12_178 = input.LA(12);

                                                    if ( ((LA12_178>='0' && LA12_178<='9')||(LA12_178>='A' && LA12_178<='Z')||LA12_178=='_'||(LA12_178>='a' && LA12_178<='z')) ) {
                                                        alt12=30;
                                                    }
                                                    else {
                                                        alt12=21;}
                                                }
                                                else {
                                                    alt12=30;}
                                                }
                                                break;
                                            default:
                                                alt12=30;}

                                        }
                                        else {
                                            alt12=30;}
                                    }
                                    else {
                                        alt12=30;}
                                }
                                else {
                                    alt12=30;}
                                }
                                break;
                            case 'd':
                                {
                                int LA12_122 = input.LA(7);

                                if ( (LA12_122=='s') ) {
                                    int LA12_139 = input.LA(8);

                                    if ( ((LA12_139>='0' && LA12_139<='9')||(LA12_139>='A' && LA12_139<='Z')||LA12_139=='_'||(LA12_139>='a' && LA12_139<='z')) ) {
                                        alt12=30;
                                    }
                                    else {
                                        alt12=27;}
                                }
                                else {
                                    alt12=30;}
                                }
                                break;
                            default:
                                alt12=30;}

                        }
                        else {
                            alt12=30;}
                    }
                    else {
                        alt12=30;}
                    }
                    break;
                case 'c':
                    {
                    int LA12_67 = input.LA(4);

                    if ( (LA12_67=='l') ) {
                        int LA12_86 = input.LA(5);

                        if ( (LA12_86=='u') ) {
                            switch ( input.LA(6) ) {
                            case 's':
                                {
                                int LA12_123 = input.LA(7);

                                if ( (LA12_123=='i') ) {
                                    int LA12_140 = input.LA(8);

                                    if ( (LA12_140=='o') ) {
                                        int LA12_156 = input.LA(9);

                                        if ( (LA12_156=='n') ) {
                                            int LA12_165 = input.LA(10);

                                            if ( (LA12_165=='s') ) {
                                                int LA12_172 = input.LA(11);

                                                if ( ((LA12_172>='0' && LA12_172<='9')||(LA12_172>='A' && LA12_172<='Z')||LA12_172=='_'||(LA12_172>='a' && LA12_172<='z')) ) {
                                                    alt12=30;
                                                }
                                                else {
                                                    alt12=18;}
                                            }
                                            else {
                                                alt12=30;}
                                        }
                                        else {
                                            alt12=30;}
                                    }
                                    else {
                                        alt12=30;}
                                }
                                else {
                                    alt12=30;}
                                }
                                break;
                            case 'd':
                                {
                                int LA12_124 = input.LA(7);

                                if ( (LA12_124=='e') ) {
                                    int LA12_141 = input.LA(8);

                                    if ( ((LA12_141>='0' && LA12_141<='9')||(LA12_141>='A' && LA12_141<='Z')||LA12_141=='_'||(LA12_141>='a' && LA12_141<='z')) ) {
                                        alt12=30;
                                    }
                                    else {
                                        alt12=19;}
                                }
                                else {
                                    alt12=30;}
                                }
                                break;
                            default:
                                alt12=30;}

                        }
                        else {
                            alt12=30;}
                    }
                    else {
                        alt12=30;}
                    }
                    break;
                case 'e':
                    {
                    int LA12_68 = input.LA(4);

                    if ( (LA12_68=='c') ) {
                        int LA12_87 = input.LA(5);

                        if ( (LA12_87=='u') ) {
                            int LA12_106 = input.LA(6);

                            if ( (LA12_106=='t') ) {
                                int LA12_125 = input.LA(7);

                                if ( (LA12_125=='e') ) {
                                    int LA12_142 = input.LA(8);

                                    if ( ((LA12_142>='0' && LA12_142<='9')||(LA12_142>='A' && LA12_142<='Z')||LA12_142=='_'||(LA12_142>='a' && LA12_142<='z')) ) {
                                        alt12=30;
                                    }
                                    else {
                                        alt12=22;}
                                }
                                else {
                                    alt12=30;}
                            }
                            else {
                                alt12=30;}
                        }
                        else {
                            alt12=30;}
                    }
                    else {
                        alt12=30;}
                    }
                    break;
                default:
                    alt12=30;}

                }
                break;
            case 'n':
                {
                int LA12_42 = input.LA(3);

                if ( (LA12_42=='t') ) {
                    int LA12_69 = input.LA(4);

                    if ( (LA12_69=='i') ) {
                        int LA12_88 = input.LA(5);

                        if ( (LA12_88=='t') ) {
                            int LA12_107 = input.LA(6);

                            if ( (LA12_107=='y') ) {
                                int LA12_126 = input.LA(7);

                                if ( ((LA12_126>='0' && LA12_126<='9')||(LA12_126>='A' && LA12_126<='Z')||LA12_126=='_'||(LA12_126>='a' && LA12_126<='z')) ) {
                                    alt12=30;
                                }
                                else {
                                    alt12=26;}
                            }
                            else {
                                alt12=30;}
                        }
                        else {
                            alt12=30;}
                    }
                    else {
                        alt12=30;}
                }
                else {
                    alt12=30;}
                }
                break;
            default:
                alt12=30;}

        }
        else if ( (LA12_0==',') ) {
            alt12=12;
        }
        else if ( (LA12_0=='u') ) {
            int LA12_12 = input.LA(2);

            if ( (LA12_12=='r') ) {
                int LA12_44 = input.LA(3);

                if ( (LA12_44=='l') ) {
                    int LA12_70 = input.LA(4);

                    if ( ((LA12_70>='0' && LA12_70<='9')||(LA12_70>='A' && LA12_70<='Z')||LA12_70=='_'||(LA12_70>='a' && LA12_70<='z')) ) {
                        alt12=30;
                    }
                    else {
                        alt12=14;}
                }
                else {
                    alt12=30;}
            }
            else {
                alt12=30;}
        }
        else if ( (LA12_0=='s') ) {
            int LA12_13 = input.LA(2);

            if ( (LA12_13=='c') ) {
                int LA12_45 = input.LA(3);

                if ( (LA12_45=='o') ) {
                    int LA12_71 = input.LA(4);

                    if ( (LA12_71=='p') ) {
                        int LA12_90 = input.LA(5);

                        if ( (LA12_90=='e') ) {
                            int LA12_108 = input.LA(6);

                            if ( ((LA12_108>='0' && LA12_108<='9')||(LA12_108>='A' && LA12_108<='Z')||LA12_108=='_'||(LA12_108>='a' && LA12_108<='z')) ) {
                                alt12=30;
                            }
                            else {
                                alt12=15;}
                        }
                        else {
                            alt12=30;}
                    }
                    else {
                        alt12=30;}
                }
                else {
                    alt12=30;}
            }
            else {
                alt12=30;}
        }
        else if ( (LA12_0=='c') ) {
            int LA12_14 = input.LA(2);

            if ( (LA12_14=='l') ) {
                int LA12_46 = input.LA(3);

                if ( (LA12_46=='a') ) {
                    int LA12_72 = input.LA(4);

                    if ( (LA12_72=='s') ) {
                        int LA12_91 = input.LA(5);

                        if ( (LA12_91=='s') ) {
                            int LA12_109 = input.LA(6);

                            if ( (LA12_109=='i') ) {
                                int LA12_128 = input.LA(7);

                                if ( (LA12_128=='f') ) {
                                    int LA12_144 = input.LA(8);

                                    if ( (LA12_144=='i') ) {
                                        int LA12_159 = input.LA(9);

                                        if ( (LA12_159=='e') ) {
                                            int LA12_166 = input.LA(10);

                                            if ( (LA12_166=='r') ) {
                                                int LA12_173 = input.LA(11);

                                                if ( ((LA12_173>='0' && LA12_173<='9')||(LA12_173>='A' && LA12_173<='Z')||LA12_173=='_'||(LA12_173>='a' && LA12_173<='z')) ) {
                                                    alt12=30;
                                                }
                                                else {
                                                    alt12=16;}
                                            }
                                            else {
                                                alt12=30;}
                                        }
                                        else {
                                            alt12=30;}
                                    }
                                    else {
                                        alt12=30;}
                                }
                                else {
                                    alt12=30;}
                            }
                            else {
                                alt12=30;}
                        }
                        else {
                            alt12=30;}
                    }
                    else {
                        alt12=30;}
                }
                else {
                    alt12=30;}
            }
            else {
                alt12=30;}
        }
        else if ( (LA12_0=='t') ) {
            int LA12_15 = input.LA(2);

            if ( (LA12_15=='y') ) {
                int LA12_47 = input.LA(3);

                if ( (LA12_47=='p') ) {
                    int LA12_73 = input.LA(4);

                    if ( (LA12_73=='e') ) {
                        int LA12_92 = input.LA(5);

                        if ( ((LA12_92>='0' && LA12_92<='9')||(LA12_92>='A' && LA12_92<='Z')||LA12_92=='_'||(LA12_92>='a' && LA12_92<='z')) ) {
                            alt12=30;
                        }
                        else {
                            alt12=17;}
                    }
                    else {
                        alt12=30;}
                }
                else {
                    alt12=30;}
            }
            else {
                alt12=30;}
        }
        else if ( (LA12_0=='.') ) {
            alt12=23;
        }
        else if ( (LA12_0=='-') ) {
            alt12=24;
        }
        else if ( (LA12_0=='i') ) {
            int LA12_18 = input.LA(2);

            if ( (LA12_18=='m') ) {
                int LA12_50 = input.LA(3);

                if ( (LA12_50=='p') ) {
                    int LA12_74 = input.LA(4);

                    if ( (LA12_74=='o') ) {
                        int LA12_93 = input.LA(5);

                        if ( (LA12_93=='r') ) {
                            int LA12_111 = input.LA(6);

                            if ( (LA12_111=='t') ) {
                                int LA12_129 = input.LA(7);

                                if ( ((LA12_129>='0' && LA12_129<='9')||(LA12_129>='A' && LA12_129<='Z')||LA12_129=='_'||(LA12_129>='a' && LA12_129<='z')) ) {
                                    alt12=30;
                                }
                                else {
                                    alt12=25;}
                            }
                            else {
                                alt12=30;}
                        }
                        else {
                            alt12=30;}
                    }
                    else {
                        alt12=30;}
                }
                else {
                    alt12=30;}
            }
            else {
                alt12=30;}
        }
        else if ( (LA12_0=='[') ) {
            int LA12_19 = input.LA(2);

            if ( (LA12_19==']') ) {
                alt12=29;
            }
            else {
                alt12=36;}
        }
        else if ( (LA12_0=='^') ) {
            int LA12_20 = input.LA(2);

            if ( ((LA12_20>='A' && LA12_20<='Z')||LA12_20=='_'||(LA12_20>='a' && LA12_20<='z')) ) {
                alt12=30;
            }
            else {
                alt12=36;}
        }
        else if ( ((LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='b'||LA12_0=='f'||LA12_0=='h'||(LA12_0>='j' && LA12_0<='l')||(LA12_0>='n' && LA12_0<='o')||(LA12_0>='q' && LA12_0<='r')||(LA12_0>='w' && LA12_0<='z')) ) {
            alt12=30;
        }
        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {
            alt12=31;
        }
        else if ( (LA12_0=='\"') ) {
            int LA12_23 = input.LA(2);

            if ( ((LA12_23>='\u0000' && LA12_23<='\uFFFE')) ) {
                alt12=32;
            }
            else {
                alt12=36;}
        }
        else if ( (LA12_0=='\'') ) {
            int LA12_24 = input.LA(2);

            if ( ((LA12_24>='\u0000' && LA12_24<='\uFFFE')) ) {
                alt12=32;
            }
            else {
                alt12=36;}
        }
        else if ( (LA12_0=='/') ) {
            switch ( input.LA(2) ) {
            case '*':
                {
                alt12=33;
                }
                break;
            case '/':
                {
                alt12=34;
                }
                break;
            default:
                alt12=36;}

        }
        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
            alt12=35;
        }
        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='+')||(LA12_0>=';' && LA12_0<='@')||(LA12_0>='\\' && LA12_0<=']')||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFE')) ) {
            alt12=36;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 12, 0, input);

            throw nvae;
        }
        switch (alt12) {
            case 1 :
                // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1:10: T11
                {
                mT11(); 

                }
                break;
            case 2 :
                // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1:14: T12
                {
                mT12(); 

                }
                break;
            case 3 :
                // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1:18: T13
                {
                mT13(); 

                }
                break;
            case 4 :
                // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1:22: T14
                {
                mT14(); 

                }
                break;
            case 5 :
                // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1:26: T15
                {
                mT15(); 

                }
                break;
            case 6 :
                // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1:30: T16
                {
                mT16(); 

                }
                break;
            case 7 :
                // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1:34: T17
                {
                mT17(); 

                }
                break;
            case 8 :
                // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1:38: T18
                {
                mT18(); 

                }
                break;
            case 9 :
                // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1:42: T19
                {
                mT19(); 

                }
                break;
            case 10 :
                // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1:46: T20
                {
                mT20(); 

                }
                break;
            case 11 :
                // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1:50: T21
                {
                mT21(); 

                }
                break;
            case 12 :
                // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1:54: T22
                {
                mT22(); 

                }
                break;
            case 13 :
                // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1:58: T23
                {
                mT23(); 

                }
                break;
            case 14 :
                // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1:62: T24
                {
                mT24(); 

                }
                break;
            case 15 :
                // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1:66: T25
                {
                mT25(); 

                }
                break;
            case 16 :
                // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1:70: T26
                {
                mT26(); 

                }
                break;
            case 17 :
                // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1:74: T27
                {
                mT27(); 

                }
                break;
            case 18 :
                // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1:78: T28
                {
                mT28(); 

                }
                break;
            case 19 :
                // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1:82: T29
                {
                mT29(); 

                }
                break;
            case 20 :
                // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1:86: T30
                {
                mT30(); 

                }
                break;
            case 21 :
                // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1:90: T31
                {
                mT31(); 

                }
                break;
            case 22 :
                // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1:94: T32
                {
                mT32(); 

                }
                break;
            case 23 :
                // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1:98: T33
                {
                mT33(); 

                }
                break;
            case 24 :
                // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1:102: T34
                {
                mT34(); 

                }
                break;
            case 25 :
                // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1:106: T35
                {
                mT35(); 

                }
                break;
            case 26 :
                // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1:110: T36
                {
                mT36(); 

                }
                break;
            case 27 :
                // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1:114: T37
                {
                mT37(); 

                }
                break;
            case 28 :
                // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1:118: T38
                {
                mT38(); 

                }
                break;
            case 29 :
                // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1:122: T39
                {
                mT39(); 

                }
                break;
            case 30 :
                // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1:126: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 31 :
                // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1:134: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 32 :
                // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1:143: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 33 :
                // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1:155: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 34 :
                // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1:171: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 35 :
                // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1:187: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 36 :
                // ../org.sonatype.maven.dependencydsl/src-gen/org/sonatype/maven/parser/antlr/internal/InternalDependencyDsl.g:1:195: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}