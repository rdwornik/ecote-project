// Generated from /home/robert/IdeaProjects/ecote-project/Java.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, ABSTRACT=2, ASSERT=3, BOOLEAN=4, BREAK=5, BYTE=6, CASE=7, CATCH=8, 
		CHAR=9, CLASS=10, CONST=11, CONTINUE=12, DEFAULT=13, DO=14, DOUBLE=15, 
		ELSE=16, ENUM=17, EXTENDS=18, FINAL=19, FINALLY=20, FLOAT=21, FOR=22, 
		IF=23, GOTO=24, IMPLEMENTS=25, IMPORT=26, INSTANCEOF=27, INT=28, INTERFACE=29, 
		LONG=30, NATIVE=31, NEW=32, PACKAGE=33, PRIVATE=34, PROTECTED=35, PUBLIC=36, 
		RETURN=37, SHORT=38, STATIC=39, STRICTFP=40, SUPER=41, SWITCH=42, SYNCHRONIZED=43, 
		THIS=44, THROW=45, THROWS=46, TRANSIENT=47, TRY=48, VOID=49, VOLATILE=50, 
		WHILE=51, IntegerLiteral=52, FloatingPointLiteral=53, BooleanLiteral=54, 
		CharacterLiteral=55, StringLiteral=56, NullLiteral=57, LPAREN=58, RPAREN=59, 
		LBRACE=60, RBRACE=61, LBRACK=62, RBRACK=63, SEMI=64, COMMA=65, DOT=66, 
		ASSIGN=67, GT=68, LT=69, BANG=70, TILDE=71, QUESTION=72, COLON=73, EQUAL=74, 
		LE=75, GE=76, NOTEQUAL=77, AND=78, OR=79, INC=80, DEC=81, ADD=82, SUB=83, 
		MUL=84, DIV=85, BITAND=86, BITOR=87, CARET=88, MOD=89, ADD_ASSIGN=90, 
		SUB_ASSIGN=91, MUL_ASSIGN=92, DIV_ASSIGN=93, AND_ASSIGN=94, OR_ASSIGN=95, 
		XOR_ASSIGN=96, MOD_ASSIGN=97, LSHIFT_ASSIGN=98, RSHIFT_ASSIGN=99, URSHIFT_ASSIGN=100, 
		Identifier=101, AT=102, ELLIPSIS=103, WS=104, COMMENT=105, LINE_COMMENT=106;
	public static final int
		RULE_compilationUnit = 0, RULE_packageDeclaration = 1, RULE_importDeclaration = 2, 
		RULE_typeDeclaration = 3, RULE_modifier = 4, RULE_classOrInterfaceModifier = 5, 
		RULE_variableModifier = 6, RULE_classDeclaration = 7, RULE_className = 8, 
		RULE_typeParameters = 9, RULE_typeParameter = 10, RULE_typeBound = 11, 
		RULE_enumDeclaration = 12, RULE_enumConstants = 13, RULE_enumConstant = 14, 
		RULE_enumBodyDeclarations = 15, RULE_interfaceDeclaration = 16, RULE_typeList = 17, 
		RULE_classBody = 18, RULE_interfaceBody = 19, RULE_classBodyDeclaration = 20, 
		RULE_memberDeclaration = 21, RULE_methodDeclaration = 22, RULE_genericMethodDeclaration = 23, 
		RULE_constructorDeclaration = 24, RULE_genericConstructorDeclaration = 25, 
		RULE_fieldDeclaration = 26, RULE_interfaceBodyDeclaration = 27, RULE_interfaceMemberDeclaration = 28, 
		RULE_constDeclaration = 29, RULE_constantDeclarator = 30, RULE_interfaceMethodDeclaration = 31, 
		RULE_genericInterfaceMethodDeclaration = 32, RULE_variableDeclarators = 33, 
		RULE_variableDeclarator = 34, RULE_variableDeclaratorId = 35, RULE_variableInitializer = 36, 
		RULE_arrayInitializer = 37, RULE_enumConstantName = 38, RULE_typeSpec = 39, 
		RULE_classOrInterfaceType = 40, RULE_primitiveType = 41, RULE_typeArguments = 42, 
		RULE_typeArgument = 43, RULE_qualifiedNameList = 44, RULE_formalParameters = 45, 
		RULE_formalParameterList = 46, RULE_formalParameter = 47, RULE_lastFormalParameter = 48, 
		RULE_methodBody = 49, RULE_constructorBody = 50, RULE_qualifiedName = 51, 
		RULE_literal = 52, RULE_annotation = 53, RULE_annotationName = 54, RULE_elementValuePairs = 55, 
		RULE_elementValuePair = 56, RULE_elementValue = 57, RULE_elementValueArrayInitializer = 58, 
		RULE_annotationTypeDeclaration = 59, RULE_annotationTypeBody = 60, RULE_annotationTypeElementDeclaration = 61, 
		RULE_annotationTypeElementRest = 62, RULE_annotationMethodOrConstantRest = 63, 
		RULE_annotationMethodRest = 64, RULE_annotationConstantRest = 65, RULE_defaultValue = 66, 
		RULE_block = 67, RULE_blockStatement = 68, RULE_localVariableDeclarationStatement = 69, 
		RULE_localVariableDeclaration = 70, RULE_statement = 71, RULE_catchClause = 72, 
		RULE_catchType = 73, RULE_finallyBlock = 74, RULE_resourceSpecification = 75, 
		RULE_resources = 76, RULE_resource = 77, RULE_switchBlockStatementGroup = 78, 
		RULE_switchLabel = 79, RULE_forControl = 80, RULE_forInit = 81, RULE_enhancedForControl = 82, 
		RULE_forUpdate = 83, RULE_parExpression = 84, RULE_expressionList = 85, 
		RULE_statementExpression = 86, RULE_constantExpression = 87, RULE_expression = 88, 
		RULE_lambdaExpression = 89, RULE_arrow = 90, RULE_lambdaParameters = 91, 
		RULE_lambdaBody = 92, RULE_parameters = 93, RULE_param = 94, RULE_primary = 95, 
		RULE_creator = 96, RULE_createdName = 97, RULE_innerCreator = 98, RULE_arrayCreatorRest = 99, 
		RULE_classCreatorRest = 100, RULE_explicitGenericInvocation = 101, RULE_nonWildcardTypeArguments = 102, 
		RULE_typeArgumentsOrDiamond = 103, RULE_nonWildcardTypeArgumentsOrDiamond = 104, 
		RULE_superSuffix = 105, RULE_explicitGenericInvocationSuffix = 106, RULE_arguments = 107;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "packageDeclaration", "importDeclaration", "typeDeclaration", 
			"modifier", "classOrInterfaceModifier", "variableModifier", "classDeclaration", 
			"className", "typeParameters", "typeParameter", "typeBound", "enumDeclaration", 
			"enumConstants", "enumConstant", "enumBodyDeclarations", "interfaceDeclaration", 
			"typeList", "classBody", "interfaceBody", "classBodyDeclaration", "memberDeclaration", 
			"methodDeclaration", "genericMethodDeclaration", "constructorDeclaration", 
			"genericConstructorDeclaration", "fieldDeclaration", "interfaceBodyDeclaration", 
			"interfaceMemberDeclaration", "constDeclaration", "constantDeclarator", 
			"interfaceMethodDeclaration", "genericInterfaceMethodDeclaration", "variableDeclarators", 
			"variableDeclarator", "variableDeclaratorId", "variableInitializer", 
			"arrayInitializer", "enumConstantName", "typeSpec", "classOrInterfaceType", 
			"primitiveType", "typeArguments", "typeArgument", "qualifiedNameList", 
			"formalParameters", "formalParameterList", "formalParameter", "lastFormalParameter", 
			"methodBody", "constructorBody", "qualifiedName", "literal", "annotation", 
			"annotationName", "elementValuePairs", "elementValuePair", "elementValue", 
			"elementValueArrayInitializer", "annotationTypeDeclaration", "annotationTypeBody", 
			"annotationTypeElementDeclaration", "annotationTypeElementRest", "annotationMethodOrConstantRest", 
			"annotationMethodRest", "annotationConstantRest", "defaultValue", "block", 
			"blockStatement", "localVariableDeclarationStatement", "localVariableDeclaration", 
			"statement", "catchClause", "catchType", "finallyBlock", "resourceSpecification", 
			"resources", "resource", "switchBlockStatementGroup", "switchLabel", 
			"forControl", "forInit", "enhancedForControl", "forUpdate", "parExpression", 
			"expressionList", "statementExpression", "constantExpression", "expression", 
			"lambdaExpression", "arrow", "lambdaParameters", "lambdaBody", "parameters", 
			"param", "primary", "creator", "createdName", "innerCreator", "arrayCreatorRest", 
			"classCreatorRest", "explicitGenericInvocation", "nonWildcardTypeArguments", 
			"typeArgumentsOrDiamond", "nonWildcardTypeArgumentsOrDiamond", "superSuffix", 
			"explicitGenericInvocationSuffix", "arguments"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'->'", "'abstract'", "'assert'", "'boolean'", "'break'", "'byte'", 
			"'case'", "'catch'", "'char'", "'class'", "'const'", "'continue'", "'default'", 
			"'do'", "'double'", "'else'", "'enum'", "'extends'", "'final'", "'finally'", 
			"'float'", "'for'", "'if'", "'goto'", "'implements'", "'import'", "'instanceof'", 
			"'int'", "'interface'", "'long'", "'native'", "'new'", "'package'", "'private'", 
			"'protected'", "'public'", "'return'", "'short'", "'static'", "'strictfp'", 
			"'super'", "'switch'", "'synchronized'", "'this'", "'throw'", "'throws'", 
			"'transient'", "'try'", "'void'", "'volatile'", "'while'", null, null, 
			null, null, null, "'null'", "'('", "')'", "'{'", "'}'", "'['", "']'", 
			"';'", "','", "'.'", "'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", 
			"'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", 
			"'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'+='", "'-='", "'*='", 
			"'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='", "'>>>='", null, 
			"'@'", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", 
			"CATCH", "CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", 
			"ELSE", "ENUM", "EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", 
			"GOTO", "IMPLEMENTS", "IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG", 
			"NATIVE", "NEW", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", 
			"SHORT", "STATIC", "STRICTFP", "SUPER", "SWITCH", "SYNCHRONIZED", "THIS", 
			"THROW", "THROWS", "TRANSIENT", "TRY", "VOID", "VOLATILE", "WHILE", "IntegerLiteral", 
			"FloatingPointLiteral", "BooleanLiteral", "CharacterLiteral", "StringLiteral", 
			"NullLiteral", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", 
			"SEMI", "COMMA", "DOT", "ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", 
			"COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", 
			"ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", "CARET", "MOD", "ADD_ASSIGN", 
			"SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", 
			"XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "URSHIFT_ASSIGN", 
			"Identifier", "AT", "ELLIPSIS", "WS", "COMMENT", "LINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Java.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(JavaParser.EOF, 0); }
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitCompilationUnit(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(216);
				packageDeclaration();
				}
				break;
			}
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(219);
				importDeclaration();
				}
				}
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CLASS) | (1L << ENUM) | (1L << FINAL) | (1L << INTERFACE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==SEMI || _la==AT) {
				{
				{
				setState(225);
				typeDeclaration();
				}
				}
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(231);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageDeclarationContext extends ParserRuleContext {
		public TerminalNode PACKAGE() { return getToken(JavaParser.PACKAGE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitPackageDeclaration(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(233);
				annotation();
				}
				}
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(239);
			match(PACKAGE);
			setState(240);
			qualifiedName();
			setState(241);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(JavaParser.IMPORT, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public TerminalNode STATIC() { return getToken(JavaParser.STATIC, 0); }
		public TerminalNode DOT() { return getToken(JavaParser.DOT, 0); }
		public TerminalNode MUL() { return getToken(JavaParser.MUL, 0); }
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitImportDeclaration(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(IMPORT);
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(244);
				match(STATIC);
				}
			}

			setState(247);
			qualifiedName();
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(248);
				match(DOT);
				setState(249);
				match(MUL);
				}
			}

			setState(252);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public List<ClassOrInterfaceModifierContext> classOrInterfaceModifier() {
			return getRuleContexts(ClassOrInterfaceModifierContext.class);
		}
		public ClassOrInterfaceModifierContext classOrInterfaceModifier(int i) {
			return getRuleContext(ClassOrInterfaceModifierContext.class,i);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTypeDeclaration(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typeDeclaration);
		int _la;
		try {
			int _alt;
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
					{
					{
					setState(254);
					classOrInterfaceModifier();
					}
					}
					setState(259);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(260);
				classDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
					{
					{
					setState(261);
					classOrInterfaceModifier();
					}
					}
					setState(266);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(267);
				enumDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
					{
					{
					setState(268);
					classOrInterfaceModifier();
					}
					}
					setState(273);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(274);
				interfaceDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(278);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(275);
						classOrInterfaceModifier();
						}
						} 
					}
					setState(280);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				setState(281);
				annotationTypeDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(282);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifierContext extends ParserRuleContext {
		public ClassOrInterfaceModifierContext classOrInterfaceModifier() {
			return getRuleContext(ClassOrInterfaceModifierContext.class,0);
		}
		public TerminalNode NATIVE() { return getToken(JavaParser.NATIVE, 0); }
		public TerminalNode SYNCHRONIZED() { return getToken(JavaParser.SYNCHRONIZED, 0); }
		public TerminalNode TRANSIENT() { return getToken(JavaParser.TRANSIENT, 0); }
		public TerminalNode VOLATILE() { return getToken(JavaParser.VOLATILE, 0); }
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitModifier(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_modifier);
		int _la;
		try {
			setState(287);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case FINAL:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				classOrInterfaceModifier();
				}
				break;
			case NATIVE:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOLATILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NATIVE) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(JavaParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(JavaParser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(JavaParser.PRIVATE, 0); }
		public TerminalNode STATIC() { return getToken(JavaParser.STATIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(JavaParser.ABSTRACT, 0); }
		public TerminalNode FINAL() { return getToken(JavaParser.FINAL, 0); }
		public TerminalNode STRICTFP() { return getToken(JavaParser.STRICTFP, 0); }
		public ClassOrInterfaceModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterClassOrInterfaceModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassOrInterfaceModifier(this);
		}
	}

	public final ClassOrInterfaceModifierContext classOrInterfaceModifier() throws RecognitionException {
		ClassOrInterfaceModifierContext _localctx = new ClassOrInterfaceModifierContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classOrInterfaceModifier);
		int _la;
		try {
			setState(291);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				annotation();
				}
				break;
			case ABSTRACT:
			case FINAL:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableModifierContext extends ParserRuleContext {
		public TerminalNode FINAL() { return getToken(JavaParser.FINAL, 0); }
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterVariableModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitVariableModifier(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variableModifier);
		try {
			setState(295);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FINAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				match(FINAL);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
				annotation();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(JavaParser.CLASS, 0); }
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(JavaParser.EXTENDS, 0); }
		public TypeSpecContext typeSpec() {
			return getRuleContext(TypeSpecContext.class,0);
		}
		public TerminalNode IMPLEMENTS() { return getToken(JavaParser.IMPLEMENTS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(CLASS);
			setState(298);
			className();
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(299);
				typeParameters();
				}
			}

			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(302);
				match(EXTENDS);
				setState(303);
				typeSpec();
				}
			}

			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(306);
				match(IMPLEMENTS);
				setState(307);
				typeList();
				}
			}

			setState(310);
			classBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassName(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_className);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParametersContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(JavaParser.LT, 0); }
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TerminalNode GT() { return getToken(JavaParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTypeParameters(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(LT);
			setState(315);
			typeParameter();
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(316);
				match(COMMA);
				setState(317);
				typeParameter();
				}
				}
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(323);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TerminalNode EXTENDS() { return getToken(JavaParser.EXTENDS, 0); }
		public TypeBoundContext typeBound() {
			return getRuleContext(TypeBoundContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTypeParameter(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(Identifier);
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(326);
				match(EXTENDS);
				setState(327);
				typeBound();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeBoundContext extends ParserRuleContext {
		public List<TypeSpecContext> typeSpec() {
			return getRuleContexts(TypeSpecContext.class);
		}
		public TypeSpecContext typeSpec(int i) {
			return getRuleContext(TypeSpecContext.class,i);
		}
		public List<TerminalNode> BITAND() { return getTokens(JavaParser.BITAND); }
		public TerminalNode BITAND(int i) {
			return getToken(JavaParser.BITAND, i);
		}
		public TypeBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTypeBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTypeBound(this);
		}
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_typeBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			typeSpec();
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITAND) {
				{
				{
				setState(331);
				match(BITAND);
				setState(332);
				typeSpec();
				}
				}
				setState(337);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumDeclarationContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(JavaParser.ENUM, 0); }
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public TerminalNode IMPLEMENTS() { return getToken(JavaParser.IMPLEMENTS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public EnumConstantsContext enumConstants() {
			return getRuleContext(EnumConstantsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(JavaParser.COMMA, 0); }
		public EnumBodyDeclarationsContext enumBodyDeclarations() {
			return getRuleContext(EnumBodyDeclarationsContext.class,0);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitEnumDeclaration(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(ENUM);
			setState(339);
			match(Identifier);
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(340);
				match(IMPLEMENTS);
				setState(341);
				typeList();
				}
			}

			setState(344);
			match(LBRACE);
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier || _la==AT) {
				{
				setState(345);
				enumConstants();
				}
			}

			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(348);
				match(COMMA);
				}
			}

			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(351);
				enumBodyDeclarations();
				}
			}

			setState(354);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantsContext extends ParserRuleContext {
		public List<EnumConstantContext> enumConstant() {
			return getRuleContexts(EnumConstantContext.class);
		}
		public EnumConstantContext enumConstant(int i) {
			return getRuleContext(EnumConstantContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public EnumConstantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstants; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterEnumConstants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitEnumConstants(this);
		}
	}

	public final EnumConstantsContext enumConstants() throws RecognitionException {
		EnumConstantsContext _localctx = new EnumConstantsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_enumConstants);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			enumConstant();
			setState(361);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(357);
					match(COMMA);
					setState(358);
					enumConstant();
					}
					} 
				}
				setState(363);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public EnumConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterEnumConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitEnumConstant(this);
		}
	}

	public final EnumConstantContext enumConstant() throws RecognitionException {
		EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_enumConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(364);
				annotation();
				}
				}
				setState(369);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(370);
			match(Identifier);
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(371);
				arguments();
				}
			}

			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(374);
				classBody();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumBodyDeclarationsContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public EnumBodyDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBodyDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterEnumBodyDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitEnumBodyDeclarations(this);
		}
	}

	public final EnumBodyDeclarationsContext enumBodyDeclarations() throws RecognitionException {
		EnumBodyDeclarationsContext _localctx = new EnumBodyDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_enumBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(SEMI);
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << LBRACE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (SEMI - 64)) | (1L << (LT - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				{
				setState(378);
				classBodyDeclaration();
				}
				}
				setState(383);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(JavaParser.INTERFACE, 0); }
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(JavaParser.EXTENDS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitInterfaceDeclaration(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(INTERFACE);
			setState(385);
			match(Identifier);
			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(386);
				typeParameters();
				}
			}

			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(389);
				match(EXTENDS);
				setState(390);
				typeList();
				}
			}

			setState(393);
			interfaceBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeListContext extends ParserRuleContext {
		public List<TypeSpecContext> typeSpec() {
			return getRuleContexts(TypeSpecContext.class);
		}
		public TypeSpecContext typeSpec(int i) {
			return getRuleContext(TypeSpecContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTypeList(this);
		}
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			typeSpec();
			setState(400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(396);
				match(COMMA);
				setState(397);
				typeSpec();
				}
				}
				setState(402);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassBody(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			match(LBRACE);
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << LBRACE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (SEMI - 64)) | (1L << (LT - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				{
				setState(404);
				classBodyDeclaration();
				}
				}
				setState(409);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(410);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public List<InterfaceBodyDeclarationContext> interfaceBodyDeclaration() {
			return getRuleContexts(InterfaceBodyDeclarationContext.class);
		}
		public InterfaceBodyDeclarationContext interfaceBodyDeclaration(int i) {
			return getRuleContext(InterfaceBodyDeclarationContext.class,i);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterInterfaceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitInterfaceBody(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			match(LBRACE);
			setState(416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (SEMI - 64)) | (1L << (LT - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				{
				setState(413);
				interfaceBodyDeclaration();
				}
				}
				setState(418);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(419);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(JavaParser.STATIC, 0); }
		public MemberDeclarationContext memberDeclaration() {
			return getRuleContext(MemberDeclarationContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassBodyDeclaration(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_classBodyDeclaration);
		int _la;
		try {
			int _alt;
			setState(433);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(421);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(422);
					match(STATIC);
					}
				}

				setState(425);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(429);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(426);
						modifier();
						}
						} 
					}
					setState(431);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				}
				setState(432);
				memberDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberDeclarationContext extends ParserRuleContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public GenericMethodDeclarationContext genericMethodDeclaration() {
			return getRuleContext(GenericMethodDeclarationContext.class,0);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public GenericConstructorDeclarationContext genericConstructorDeclaration() {
			return getRuleContext(GenericConstructorDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitMemberDeclaration(this);
		}
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_memberDeclaration);
		try {
			setState(444);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(435);
				methodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(436);
				genericMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(437);
				fieldDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(438);
				constructorDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(439);
				genericConstructorDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(440);
				interfaceDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(441);
				annotationTypeDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(442);
				classDeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(443);
				enumDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TypeSpecContext typeSpec() {
			return getRuleContext(TypeSpecContext.class,0);
		}
		public TerminalNode VOID() { return getToken(JavaParser.VOID, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(JavaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JavaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JavaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JavaParser.RBRACK, i);
		}
		public TerminalNode THROWS() { return getToken(JavaParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				{
				setState(446);
				typeSpec();
				}
				break;
			case VOID:
				{
				setState(447);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(450);
			match(Identifier);
			setState(451);
			formalParameters();
			setState(456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(452);
				match(LBRACK);
				setState(453);
				match(RBRACK);
				}
				}
				setState(458);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(459);
				match(THROWS);
				setState(460);
				qualifiedNameList();
				}
			}

			setState(465);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(463);
				methodBody();
				}
				break;
			case SEMI:
				{
				setState(464);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericMethodDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public GenericMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterGenericMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitGenericMethodDeclaration(this);
		}
	}

	public final GenericMethodDeclarationContext genericMethodDeclaration() throws RecognitionException {
		GenericMethodDeclarationContext _localctx = new GenericMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_genericMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			typeParameters();
			setState(468);
			methodDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public ConstructorBodyContext constructorBody() {
			return getRuleContext(ConstructorBodyContext.class,0);
		}
		public TerminalNode THROWS() { return getToken(JavaParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitConstructorDeclaration(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			match(Identifier);
			setState(471);
			formalParameters();
			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(472);
				match(THROWS);
				setState(473);
				qualifiedNameList();
				}
			}

			setState(476);
			constructorBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericConstructorDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public GenericConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericConstructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterGenericConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitGenericConstructorDeclaration(this);
		}
	}

	public final GenericConstructorDeclarationContext genericConstructorDeclaration() throws RecognitionException {
		GenericConstructorDeclarationContext _localctx = new GenericConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_genericConstructorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			typeParameters();
			setState(479);
			constructorDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclarationContext extends ParserRuleContext {
		public TypeSpecContext typeSpec() {
			return getRuleContext(TypeSpecContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitFieldDeclaration(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			typeSpec();
			setState(482);
			variableDeclarators();
			setState(483);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceBodyDeclarationContext extends ParserRuleContext {
		public InterfaceMemberDeclarationContext interfaceMemberDeclaration() {
			return getRuleContext(InterfaceMemberDeclarationContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public InterfaceBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterInterfaceBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitInterfaceBodyDeclaration(this);
		}
	}

	public final InterfaceBodyDeclarationContext interfaceBodyDeclaration() throws RecognitionException {
		InterfaceBodyDeclarationContext _localctx = new InterfaceBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_interfaceBodyDeclaration);
		try {
			int _alt;
			setState(493);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CLASS:
			case DOUBLE:
			case ENUM:
			case FINAL:
			case FLOAT:
			case INT:
			case INTERFACE:
			case LONG:
			case NATIVE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case SHORT:
			case STATIC:
			case STRICTFP:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOID:
			case VOLATILE:
			case LT:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(488);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(485);
						modifier();
						}
						} 
					}
					setState(490);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				}
				setState(491);
				interfaceMemberDeclaration();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(492);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMemberDeclarationContext extends ParserRuleContext {
		public ConstDeclarationContext constDeclaration() {
			return getRuleContext(ConstDeclarationContext.class,0);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public GenericInterfaceMethodDeclarationContext genericInterfaceMethodDeclaration() {
			return getRuleContext(GenericInterfaceMethodDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public InterfaceMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterInterfaceMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitInterfaceMemberDeclaration(this);
		}
	}

	public final InterfaceMemberDeclarationContext interfaceMemberDeclaration() throws RecognitionException {
		InterfaceMemberDeclarationContext _localctx = new InterfaceMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_interfaceMemberDeclaration);
		try {
			setState(502);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(495);
				constDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(496);
				interfaceMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(497);
				genericInterfaceMethodDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(498);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(499);
				annotationTypeDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(500);
				classDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(501);
				enumDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstDeclarationContext extends ParserRuleContext {
		public TypeSpecContext typeSpec() {
			return getRuleContext(TypeSpecContext.class,0);
		}
		public List<ConstantDeclaratorContext> constantDeclarator() {
			return getRuleContexts(ConstantDeclaratorContext.class);
		}
		public ConstantDeclaratorContext constantDeclarator(int i) {
			return getRuleContext(ConstantDeclaratorContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public ConstDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterConstDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitConstDeclaration(this);
		}
	}

	public final ConstDeclarationContext constDeclaration() throws RecognitionException {
		ConstDeclarationContext _localctx = new ConstDeclarationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_constDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			typeSpec();
			setState(505);
			constantDeclarator();
			setState(510);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(506);
				match(COMMA);
				setState(507);
				constantDeclarator();
				}
				}
				setState(512);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(513);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantDeclaratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TerminalNode ASSIGN() { return getToken(JavaParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(JavaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JavaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JavaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JavaParser.RBRACK, i);
		}
		public ConstantDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterConstantDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitConstantDeclarator(this);
		}
	}

	public final ConstantDeclaratorContext constantDeclarator() throws RecognitionException {
		ConstantDeclaratorContext _localctx = new ConstantDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_constantDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			match(Identifier);
			setState(520);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(516);
				match(LBRACK);
				setState(517);
				match(RBRACK);
				}
				}
				setState(522);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(523);
			match(ASSIGN);
			setState(524);
			variableInitializer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public TypeSpecContext typeSpec() {
			return getRuleContext(TypeSpecContext.class,0);
		}
		public TerminalNode VOID() { return getToken(JavaParser.VOID, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(JavaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JavaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JavaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JavaParser.RBRACK, i);
		}
		public TerminalNode THROWS() { return getToken(JavaParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public InterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitInterfaceMethodDeclaration(this);
		}
	}

	public final InterfaceMethodDeclarationContext interfaceMethodDeclaration() throws RecognitionException {
		InterfaceMethodDeclarationContext _localctx = new InterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_interfaceMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				{
				setState(526);
				typeSpec();
				}
				break;
			case VOID:
				{
				setState(527);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(530);
			match(Identifier);
			setState(531);
			formalParameters();
			setState(536);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(532);
				match(LBRACK);
				setState(533);
				match(RBRACK);
				}
				}
				setState(538);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(541);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(539);
				match(THROWS);
				setState(540);
				qualifiedNameList();
				}
			}

			setState(543);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericInterfaceMethodDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public GenericInterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericInterfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterGenericInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitGenericInterfaceMethodDeclaration(this);
		}
	}

	public final GenericInterfaceMethodDeclarationContext genericInterfaceMethodDeclaration() throws RecognitionException {
		GenericInterfaceMethodDeclarationContext _localctx = new GenericInterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_genericInterfaceMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			typeParameters();
			setState(546);
			interfaceMethodDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterVariableDeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitVariableDeclarators(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			variableDeclarator();
			setState(553);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(549);
				match(COMMA);
				setState(550);
				variableDeclarator();
				}
				}
				setState(555);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(JavaParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitVariableDeclarator(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
			variableDeclaratorId();
			setState(559);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(557);
				match(ASSIGN);
				setState(558);
				variableInitializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(JavaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JavaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JavaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JavaParser.RBRACK, i);
		}
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitVariableDeclaratorId(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			match(Identifier);
			setState(566);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(562);
				match(LBRACK);
				setState(563);
				match(RBRACK);
				}
				}
				setState(568);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitVariableInitializer(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_variableInitializer);
		try {
			setState(571);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(569);
				arrayInitializer();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(570);
				expression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitArrayInitializer(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			match(LBRACE);
			setState(585);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (LT - 69)) | (1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)))) != 0)) {
				{
				setState(574);
				variableInitializer();
				setState(579);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(575);
						match(COMMA);
						setState(576);
						variableInitializer();
						}
						} 
					}
					setState(581);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				}
				setState(583);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(582);
					match(COMMA);
					}
				}

				}
			}

			setState(587);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public EnumConstantNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterEnumConstantName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitEnumConstantName(this);
		}
	}

	public final EnumConstantNameContext enumConstantName() throws RecognitionException {
		EnumConstantNameContext _localctx = new EnumConstantNameContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_enumConstantName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeSpecContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(JavaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JavaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JavaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JavaParser.RBRACK, i);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TypeSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTypeSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTypeSpec(this);
		}
	}

	public final TypeSpecContext typeSpec() throws RecognitionException {
		TypeSpecContext _localctx = new TypeSpecContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_typeSpec);
		try {
			int _alt;
			setState(607);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(591);
				classOrInterfaceType();
				setState(596);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(592);
						match(LBRACK);
						setState(593);
						match(RBRACK);
						}
						} 
					}
					setState(598);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				}
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(599);
				primitiveType();
				setState(604);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(600);
						match(LBRACK);
						setState(601);
						match(RBRACK);
						}
						} 
					}
					setState(606);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(JavaParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JavaParser.Identifier, i);
		}
		public List<TypeArgumentsContext> typeArguments() {
			return getRuleContexts(TypeArgumentsContext.class);
		}
		public TypeArgumentsContext typeArguments(int i) {
			return getRuleContext(TypeArgumentsContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(JavaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JavaParser.DOT, i);
		}
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassOrInterfaceType(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_classOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			match(Identifier);
			setState(611);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(610);
				typeArguments();
				}
				break;
			}
			setState(620);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(613);
					match(DOT);
					setState(614);
					match(Identifier);
					setState(616);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
					case 1:
						{
						setState(615);
						typeArguments();
						}
						break;
					}
					}
					} 
				}
				setState(622);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(JavaParser.BOOLEAN, 0); }
		public TerminalNode CHAR() { return getToken(JavaParser.CHAR, 0); }
		public TerminalNode BYTE() { return getToken(JavaParser.BYTE, 0); }
		public TerminalNode SHORT() { return getToken(JavaParser.SHORT, 0); }
		public TerminalNode INT() { return getToken(JavaParser.INT, 0); }
		public TerminalNode LONG() { return getToken(JavaParser.LONG, 0); }
		public TerminalNode FLOAT() { return getToken(JavaParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(JavaParser.DOUBLE, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitPrimitiveType(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(JavaParser.LT, 0); }
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public TerminalNode GT() { return getToken(JavaParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTypeArguments(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
			match(LT);
			setState(626);
			typeArgument();
			setState(631);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(627);
				match(COMMA);
				setState(628);
				typeArgument();
				}
				}
				setState(633);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(634);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentContext extends ParserRuleContext {
		public TypeSpecContext typeSpec() {
			return getRuleContext(TypeSpecContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(JavaParser.QUESTION, 0); }
		public TerminalNode EXTENDS() { return getToken(JavaParser.EXTENDS, 0); }
		public TerminalNode SUPER() { return getToken(JavaParser.SUPER, 0); }
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTypeArgument(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_typeArgument);
		int _la;
		try {
			setState(642);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(636);
				typeSpec();
				}
				break;
			case QUESTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(637);
				match(QUESTION);
				setState(640);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDS || _la==SUPER) {
					{
					setState(638);
					_la = _input.LA(1);
					if ( !(_la==EXTENDS || _la==SUPER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(639);
					typeSpec();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameListContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public QualifiedNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterQualifiedNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitQualifiedNameList(this);
		}
	}

	public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
		QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
			qualifiedName();
			setState(649);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(645);
				match(COMMA);
				setState(646);
				qualifiedName();
				}
				}
				setState(651);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParametersContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitFormalParameters(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(652);
			match(LPAREN);
			setState(654);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==AT) {
				{
				setState(653);
				formalParameterList();
				}
			}

			setState(656);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterListContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public LastFormalParameterContext lastFormalParameter() {
			return getRuleContext(LastFormalParameterContext.class,0);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitFormalParameterList(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_formalParameterList);
		int _la;
		try {
			int _alt;
			setState(671);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(658);
				formalParameter();
				setState(663);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(659);
						match(COMMA);
						setState(660);
						formalParameter();
						}
						} 
					}
					setState(665);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				}
				setState(668);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(666);
					match(COMMA);
					setState(667);
					lastFormalParameter();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(670);
				lastFormalParameter();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterContext extends ParserRuleContext {
		public TypeSpecContext typeSpec() {
			return getRuleContext(TypeSpecContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitFormalParameter(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_formalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(676);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(673);
				variableModifier();
				}
				}
				setState(678);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(679);
			typeSpec();
			setState(680);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LastFormalParameterContext extends ParserRuleContext {
		public TypeSpecContext typeSpec() {
			return getRuleContext(TypeSpecContext.class,0);
		}
		public TerminalNode ELLIPSIS() { return getToken(JavaParser.ELLIPSIS, 0); }
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public LastFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterLastFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitLastFormalParameter(this);
		}
	}

	public final LastFormalParameterContext lastFormalParameter() throws RecognitionException {
		LastFormalParameterContext _localctx = new LastFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_lastFormalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(685);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(682);
				variableModifier();
				}
				}
				setState(687);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(688);
			typeSpec();
			setState(689);
			match(ELLIPSIS);
			setState(690);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitMethodBody(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_methodBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(692);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ConstructorBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterConstructorBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitConstructorBody(this);
		}
	}

	public final ConstructorBodyContext constructorBody() throws RecognitionException {
		ConstructorBodyContext _localctx = new ConstructorBodyContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_constructorBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(694);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(JavaParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JavaParser.Identifier, i);
		}
		public List<TerminalNode> DOT() { return getTokens(JavaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JavaParser.DOT, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitQualifiedName(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(696);
			match(Identifier);
			setState(701);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(697);
					match(DOT);
					setState(698);
					match(Identifier);
					}
					} 
				}
				setState(703);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(JavaParser.IntegerLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(JavaParser.FloatingPointLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(JavaParser.CharacterLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(JavaParser.StringLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(JavaParser.BooleanLiteral, 0); }
		public TerminalNode NullLiteral() { return getToken(JavaParser.NullLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(704);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(JavaParser.AT, 0); }
		public AnnotationNameContext annotationName() {
			return getRuleContext(AnnotationNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public ElementValuePairsContext elementValuePairs() {
			return getRuleContext(ElementValuePairsContext.class,0);
		}
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAnnotation(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
			match(AT);
			setState(707);
			annotationName();
			setState(714);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(708);
				match(LPAREN);
				setState(711);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
				case 1:
					{
					setState(709);
					elementValuePairs();
					}
					break;
				case 2:
					{
					setState(710);
					elementValue();
					}
					break;
				}
				setState(713);
				match(RPAREN);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public AnnotationNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAnnotationName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAnnotationName(this);
		}
	}

	public final AnnotationNameContext annotationName() throws RecognitionException {
		AnnotationNameContext _localctx = new AnnotationNameContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_annotationName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(716);
			qualifiedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairsContext extends ParserRuleContext {
		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
		}
		public ElementValuePairContext elementValuePair(int i) {
			return getRuleContext(ElementValuePairContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public ElementValuePairsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePairs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterElementValuePairs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitElementValuePairs(this);
		}
	}

	public final ElementValuePairsContext elementValuePairs() throws RecognitionException {
		ElementValuePairsContext _localctx = new ElementValuePairsContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_elementValuePairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(718);
			elementValuePair();
			setState(723);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(719);
				match(COMMA);
				setState(720);
				elementValuePair();
				}
				}
				setState(725);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TerminalNode ASSIGN() { return getToken(JavaParser.ASSIGN, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public ElementValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterElementValuePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitElementValuePair(this);
		}
	}

	public final ElementValuePairContext elementValuePair() throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(726);
			match(Identifier);
			setState(727);
			match(ASSIGN);
			setState(728);
			elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class,0);
		}
		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterElementValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitElementValue(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_elementValue);
		try {
			setState(733);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(730);
				expression(0);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(731);
				annotation();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(732);
				elementValueArrayInitializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueArrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterElementValueArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitElementValueArrayInitializer(this);
		}
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_elementValueArrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(735);
			match(LBRACE);
			setState(744);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (LT - 69)) | (1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(736);
				elementValue();
				setState(741);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(737);
						match(COMMA);
						setState(738);
						elementValue();
						}
						} 
					}
					setState(743);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
				}
				}
			}

			setState(747);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(746);
				match(COMMA);
				}
			}

			setState(749);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeDeclarationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(JavaParser.AT, 0); }
		public TerminalNode INTERFACE() { return getToken(JavaParser.INTERFACE, 0); }
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public AnnotationTypeBodyContext annotationTypeBody() {
			return getRuleContext(AnnotationTypeBodyContext.class,0);
		}
		public AnnotationTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAnnotationTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAnnotationTypeDeclaration(this);
		}
	}

	public final AnnotationTypeDeclarationContext annotationTypeDeclaration() throws RecognitionException {
		AnnotationTypeDeclarationContext _localctx = new AnnotationTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_annotationTypeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(751);
			match(AT);
			setState(752);
			match(INTERFACE);
			setState(753);
			match(Identifier);
			setState(754);
			annotationTypeBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public List<AnnotationTypeElementDeclarationContext> annotationTypeElementDeclaration() {
			return getRuleContexts(AnnotationTypeElementDeclarationContext.class);
		}
		public AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration(int i) {
			return getRuleContext(AnnotationTypeElementDeclarationContext.class,i);
		}
		public AnnotationTypeBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAnnotationTypeBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAnnotationTypeBody(this);
		}
	}

	public final AnnotationTypeBodyContext annotationTypeBody() throws RecognitionException {
		AnnotationTypeBodyContext _localctx = new AnnotationTypeBodyContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_annotationTypeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(756);
			match(LBRACE);
			setState(760);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (SEMI - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				{
				setState(757);
				annotationTypeElementDeclaration();
				}
				}
				setState(762);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(763);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeElementDeclarationContext extends ParserRuleContext {
		public AnnotationTypeElementRestContext annotationTypeElementRest() {
			return getRuleContext(AnnotationTypeElementRestContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public AnnotationTypeElementDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAnnotationTypeElementDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAnnotationTypeElementDeclaration(this);
		}
	}

	public final AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() throws RecognitionException {
		AnnotationTypeElementDeclarationContext _localctx = new AnnotationTypeElementDeclarationContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_annotationTypeElementDeclaration);
		try {
			int _alt;
			setState(773);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CLASS:
			case DOUBLE:
			case ENUM:
			case FINAL:
			case FLOAT:
			case INT:
			case INTERFACE:
			case LONG:
			case NATIVE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case SHORT:
			case STATIC:
			case STRICTFP:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOLATILE:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(768);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(765);
						modifier();
						}
						} 
					}
					setState(770);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
				}
				setState(771);
				annotationTypeElementRest();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(772);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeElementRestContext extends ParserRuleContext {
		public TypeSpecContext typeSpec() {
			return getRuleContext(TypeSpecContext.class,0);
		}
		public AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() {
			return getRuleContext(AnnotationMethodOrConstantRestContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public AnnotationTypeElementRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAnnotationTypeElementRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAnnotationTypeElementRest(this);
		}
	}

	public final AnnotationTypeElementRestContext annotationTypeElementRest() throws RecognitionException {
		AnnotationTypeElementRestContext _localctx = new AnnotationTypeElementRestContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_annotationTypeElementRest);
		try {
			setState(795);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(775);
				typeSpec();
				setState(776);
				annotationMethodOrConstantRest();
				setState(777);
				match(SEMI);
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 2);
				{
				setState(779);
				classDeclaration();
				setState(781);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
				case 1:
					{
					setState(780);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case INTERFACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(783);
				interfaceDeclaration();
				setState(785);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
				case 1:
					{
					setState(784);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case ENUM:
				enterOuterAlt(_localctx, 4);
				{
				setState(787);
				enumDeclaration();
				setState(789);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					{
					setState(788);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 5);
				{
				setState(791);
				annotationTypeDeclaration();
				setState(793);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
				case 1:
					{
					setState(792);
					match(SEMI);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationMethodOrConstantRestContext extends ParserRuleContext {
		public AnnotationMethodRestContext annotationMethodRest() {
			return getRuleContext(AnnotationMethodRestContext.class,0);
		}
		public AnnotationConstantRestContext annotationConstantRest() {
			return getRuleContext(AnnotationConstantRestContext.class,0);
		}
		public AnnotationMethodOrConstantRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethodOrConstantRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAnnotationMethodOrConstantRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAnnotationMethodOrConstantRest(this);
		}
	}

	public final AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() throws RecognitionException {
		AnnotationMethodOrConstantRestContext _localctx = new AnnotationMethodOrConstantRestContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_annotationMethodOrConstantRest);
		try {
			setState(799);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(797);
				annotationMethodRest();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(798);
				annotationConstantRest();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationMethodRestContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public AnnotationMethodRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethodRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAnnotationMethodRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAnnotationMethodRest(this);
		}
	}

	public final AnnotationMethodRestContext annotationMethodRest() throws RecognitionException {
		AnnotationMethodRestContext _localctx = new AnnotationMethodRestContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_annotationMethodRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(801);
			match(Identifier);
			setState(802);
			match(LPAREN);
			setState(803);
			match(RPAREN);
			setState(805);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(804);
				defaultValue();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationConstantRestContext extends ParserRuleContext {
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public AnnotationConstantRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationConstantRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAnnotationConstantRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAnnotationConstantRest(this);
		}
	}

	public final AnnotationConstantRestContext annotationConstantRest() throws RecognitionException {
		AnnotationConstantRestContext _localctx = new AnnotationConstantRestContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_annotationConstantRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(807);
			variableDeclarators();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultValueContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(JavaParser.DEFAULT, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitDefaultValue(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(809);
			match(DEFAULT);
			setState(810);
			elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(812);
			match(LBRACE);
			setState(816);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (SEMI - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				{
				setState(813);
				blockStatement();
				}
				}
				setState(818);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(819);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationStatementContext localVariableDeclarationStatement() {
			return getRuleContext(LocalVariableDeclarationStatementContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitBlockStatement(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_blockStatement);
		try {
			setState(824);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(821);
				localVariableDeclarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(822);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(823);
				typeDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public LocalVariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterLocalVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitLocalVariableDeclarationStatement(this);
		}
	}

	public final LocalVariableDeclarationStatementContext localVariableDeclarationStatement() throws RecognitionException {
		LocalVariableDeclarationStatementContext _localctx = new LocalVariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(826);
			localVariableDeclaration();
			setState(827);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public TypeSpecContext typeSpec() {
			return getRuleContext(TypeSpecContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitLocalVariableDeclaration(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_localVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(832);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(829);
				variableModifier();
				}
				}
				setState(834);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(835);
			typeSpec();
			setState(836);
			variableDeclarators();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode ASSERT() { return getToken(JavaParser.ASSERT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public TerminalNode COLON() { return getToken(JavaParser.COLON, 0); }
		public TerminalNode IF() { return getToken(JavaParser.IF, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(JavaParser.ELSE, 0); }
		public TerminalNode FOR() { return getToken(JavaParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public TerminalNode WHILE() { return getToken(JavaParser.WHILE, 0); }
		public TerminalNode DO() { return getToken(JavaParser.DO, 0); }
		public TerminalNode TRY() { return getToken(JavaParser.TRY, 0); }
		public FinallyBlockContext finallyBlock() {
			return getRuleContext(FinallyBlockContext.class,0);
		}
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public ResourceSpecificationContext resourceSpecification() {
			return getRuleContext(ResourceSpecificationContext.class,0);
		}
		public TerminalNode SWITCH() { return getToken(JavaParser.SWITCH, 0); }
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public TerminalNode SYNCHRONIZED() { return getToken(JavaParser.SYNCHRONIZED, 0); }
		public TerminalNode RETURN() { return getToken(JavaParser.RETURN, 0); }
		public TerminalNode THROW() { return getToken(JavaParser.THROW, 0); }
		public TerminalNode BREAK() { return getToken(JavaParser.BREAK, 0); }
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TerminalNode CONTINUE() { return getToken(JavaParser.CONTINUE, 0); }
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(942);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(838);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(839);
				match(ASSERT);
				setState(840);
				expression(0);
				setState(843);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(841);
					match(COLON);
					setState(842);
					expression(0);
					}
				}

				setState(845);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(847);
				match(IF);
				setState(848);
				parExpression();
				setState(849);
				statement();
				setState(852);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
				case 1:
					{
					setState(850);
					match(ELSE);
					setState(851);
					statement();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(854);
				match(FOR);
				setState(855);
				match(LPAREN);
				setState(856);
				forControl();
				setState(857);
				match(RPAREN);
				setState(858);
				statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(860);
				match(WHILE);
				setState(861);
				parExpression();
				setState(862);
				statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(864);
				match(DO);
				setState(865);
				statement();
				setState(866);
				match(WHILE);
				setState(867);
				parExpression();
				setState(868);
				match(SEMI);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(870);
				match(TRY);
				setState(871);
				block();
				setState(881);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CATCH:
					{
					setState(873); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(872);
						catchClause();
						}
						}
						setState(875); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==CATCH );
					setState(878);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==FINALLY) {
						{
						setState(877);
						finallyBlock();
						}
					}

					}
					break;
				case FINALLY:
					{
					setState(880);
					finallyBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(883);
				match(TRY);
				setState(884);
				resourceSpecification();
				setState(885);
				block();
				setState(889);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CATCH) {
					{
					{
					setState(886);
					catchClause();
					}
					}
					setState(891);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(893);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FINALLY) {
					{
					setState(892);
					finallyBlock();
					}
				}

				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(895);
				match(SWITCH);
				setState(896);
				parExpression();
				setState(897);
				match(LBRACE);
				setState(901);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(898);
						switchBlockStatementGroup();
						}
						} 
					}
					setState(903);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
				}
				setState(907);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE || _la==DEFAULT) {
					{
					{
					setState(904);
					switchLabel();
					}
					}
					setState(909);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(910);
				match(RBRACE);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(912);
				match(SYNCHRONIZED);
				setState(913);
				parExpression();
				setState(914);
				block();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(916);
				match(RETURN);
				setState(918);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (LT - 69)) | (1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)))) != 0)) {
					{
					setState(917);
					expression(0);
					}
				}

				setState(920);
				match(SEMI);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(921);
				match(THROW);
				setState(922);
				expression(0);
				setState(923);
				match(SEMI);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(925);
				match(BREAK);
				setState(927);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(926);
					match(Identifier);
					}
				}

				setState(929);
				match(SEMI);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(930);
				match(CONTINUE);
				setState(932);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(931);
					match(Identifier);
					}
				}

				setState(934);
				match(SEMI);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(935);
				match(SEMI);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(936);
				statementExpression();
				setState(937);
				match(SEMI);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(939);
				match(Identifier);
				setState(940);
				match(COLON);
				setState(941);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchClauseContext extends ParserRuleContext {
		public TerminalNode CATCH() { return getToken(JavaParser.CATCH, 0); }
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public CatchTypeContext catchType() {
			return getRuleContext(CatchTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitCatchClause(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_catchClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(944);
			match(CATCH);
			setState(945);
			match(LPAREN);
			setState(949);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(946);
				variableModifier();
				}
				}
				setState(951);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(952);
			catchType();
			setState(953);
			match(Identifier);
			setState(954);
			match(RPAREN);
			setState(955);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchTypeContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<TerminalNode> BITOR() { return getTokens(JavaParser.BITOR); }
		public TerminalNode BITOR(int i) {
			return getToken(JavaParser.BITOR, i);
		}
		public CatchTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterCatchType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitCatchType(this);
		}
	}

	public final CatchTypeContext catchType() throws RecognitionException {
		CatchTypeContext _localctx = new CatchTypeContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(957);
			qualifiedName();
			setState(962);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(958);
				match(BITOR);
				setState(959);
				qualifiedName();
				}
				}
				setState(964);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FinallyBlockContext extends ParserRuleContext {
		public TerminalNode FINALLY() { return getToken(JavaParser.FINALLY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterFinallyBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitFinallyBlock(this);
		}
	}

	public final FinallyBlockContext finallyBlock() throws RecognitionException {
		FinallyBlockContext _localctx = new FinallyBlockContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_finallyBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(965);
			match(FINALLY);
			setState(966);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceSpecificationContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public ResourcesContext resources() {
			return getRuleContext(ResourcesContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public ResourceSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterResourceSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitResourceSpecification(this);
		}
	}

	public final ResourceSpecificationContext resourceSpecification() throws RecognitionException {
		ResourceSpecificationContext _localctx = new ResourceSpecificationContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(968);
			match(LPAREN);
			setState(969);
			resources();
			setState(971);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(970);
				match(SEMI);
				}
			}

			setState(973);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourcesContext extends ParserRuleContext {
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(JavaParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(JavaParser.SEMI, i);
		}
		public ResourcesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resources; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterResources(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitResources(this);
		}
	}

	public final ResourcesContext resources() throws RecognitionException {
		ResourcesContext _localctx = new ResourcesContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_resources);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(975);
			resource();
			setState(980);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(976);
					match(SEMI);
					setState(977);
					resource();
					}
					} 
				}
				setState(982);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(JavaParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitResource(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_resource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(986);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(983);
				variableModifier();
				}
				}
				setState(988);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(989);
			classOrInterfaceType();
			setState(990);
			variableDeclaratorId();
			setState(991);
			match(ASSIGN);
			setState(992);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterSwitchBlockStatementGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitSwitchBlockStatementGroup(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_switchBlockStatementGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(995); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(994);
				switchLabel();
				}
				}
				setState(997); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==DEFAULT );
			setState(1000); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(999);
				blockStatement();
				}
				}
				setState(1002); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (SEMI - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchLabelContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(JavaParser.CASE, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(JavaParser.COLON, 0); }
		public EnumConstantNameContext enumConstantName() {
			return getRuleContext(EnumConstantNameContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(JavaParser.DEFAULT, 0); }
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterSwitchLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitSwitchLabel(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_switchLabel);
		try {
			setState(1014);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1004);
				match(CASE);
				setState(1005);
				constantExpression();
				setState(1006);
				match(COLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1008);
				match(CASE);
				setState(1009);
				enumConstantName();
				setState(1010);
				match(COLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1012);
				match(DEFAULT);
				setState(1013);
				match(COLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForControlContext extends ParserRuleContext {
		public EnhancedForControlContext enhancedForControl() {
			return getRuleContext(EnhancedForControlContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(JavaParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(JavaParser.SEMI, i);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitForControl(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_forControl);
		int _la;
		try {
			setState(1028);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1016);
				enhancedForControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1018);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (LT - 69)) | (1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(1017);
					forInit();
					}
				}

				setState(1020);
				match(SEMI);
				setState(1022);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (LT - 69)) | (1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)))) != 0)) {
					{
					setState(1021);
					expression(0);
					}
				}

				setState(1024);
				match(SEMI);
				setState(1026);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (LT - 69)) | (1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)))) != 0)) {
					{
					setState(1025);
					forUpdate();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInitContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitForInit(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_forInit);
		try {
			setState(1032);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1030);
				localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1031);
				expressionList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnhancedForControlContext extends ParserRuleContext {
		public TypeSpecContext typeSpec() {
			return getRuleContext(TypeSpecContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode COLON() { return getToken(JavaParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public EnhancedForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterEnhancedForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitEnhancedForControl(this);
		}
	}

	public final EnhancedForControlContext enhancedForControl() throws RecognitionException {
		EnhancedForControlContext _localctx = new EnhancedForControlContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_enhancedForControl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1037);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1034);
				variableModifier();
				}
				}
				setState(1039);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1040);
			typeSpec();
			setState(1041);
			variableDeclaratorId();
			setState(1042);
			match(COLON);
			setState(1043);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForUpdateContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterForUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitForUpdate(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1045);
			expressionList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitParExpression(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1047);
			match(LPAREN);
			setState(1048);
			expression(0);
			setState(1049);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitExpressionList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1051);
			expression(0);
			setState(1056);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1052);
				match(COMMA);
				setState(1053);
				expression(0);
				}
				}
				setState(1058);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterStatementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitStatementExpression(this);
		}
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_statementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1059);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitConstantExpression(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1061);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode NEW() { return getToken(JavaParser.NEW, 0); }
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public TypeSpecContext typeSpec() {
			return getRuleContext(TypeSpecContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ADD() { return getToken(JavaParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(JavaParser.SUB, 0); }
		public TerminalNode INC() { return getToken(JavaParser.INC, 0); }
		public TerminalNode DEC() { return getToken(JavaParser.DEC, 0); }
		public TerminalNode TILDE() { return getToken(JavaParser.TILDE, 0); }
		public TerminalNode BANG() { return getToken(JavaParser.BANG, 0); }
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public TerminalNode MUL() { return getToken(JavaParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(JavaParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(JavaParser.MOD, 0); }
		public List<TerminalNode> LT() { return getTokens(JavaParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(JavaParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(JavaParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(JavaParser.GT, i);
		}
		public TerminalNode LE() { return getToken(JavaParser.LE, 0); }
		public TerminalNode GE() { return getToken(JavaParser.GE, 0); }
		public TerminalNode EQUAL() { return getToken(JavaParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(JavaParser.NOTEQUAL, 0); }
		public TerminalNode BITAND() { return getToken(JavaParser.BITAND, 0); }
		public TerminalNode CARET() { return getToken(JavaParser.CARET, 0); }
		public TerminalNode BITOR() { return getToken(JavaParser.BITOR, 0); }
		public TerminalNode AND() { return getToken(JavaParser.AND, 0); }
		public TerminalNode OR() { return getToken(JavaParser.OR, 0); }
		public TerminalNode QUESTION() { return getToken(JavaParser.QUESTION, 0); }
		public TerminalNode COLON() { return getToken(JavaParser.COLON, 0); }
		public TerminalNode ASSIGN() { return getToken(JavaParser.ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(JavaParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(JavaParser.SUB_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(JavaParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(JavaParser.DIV_ASSIGN, 0); }
		public TerminalNode AND_ASSIGN() { return getToken(JavaParser.AND_ASSIGN, 0); }
		public TerminalNode OR_ASSIGN() { return getToken(JavaParser.OR_ASSIGN, 0); }
		public TerminalNode XOR_ASSIGN() { return getToken(JavaParser.XOR_ASSIGN, 0); }
		public TerminalNode RSHIFT_ASSIGN() { return getToken(JavaParser.RSHIFT_ASSIGN, 0); }
		public TerminalNode URSHIFT_ASSIGN() { return getToken(JavaParser.URSHIFT_ASSIGN, 0); }
		public TerminalNode LSHIFT_ASSIGN() { return getToken(JavaParser.LSHIFT_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(JavaParser.MOD_ASSIGN, 0); }
		public TerminalNode DOT() { return getToken(JavaParser.DOT, 0); }
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TerminalNode THIS() { return getToken(JavaParser.THIS, 0); }
		public InnerCreatorContext innerCreator() {
			return getRuleContext(InnerCreatorContext.class,0);
		}
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(JavaParser.SUPER, 0); }
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public ExplicitGenericInvocationContext explicitGenericInvocation() {
			return getRuleContext(ExplicitGenericInvocationContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(JavaParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(JavaParser.RBRACK, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode INSTANCEOF() { return getToken(JavaParser.INSTANCEOF, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 176;
		enterRecursionRule(_localctx, 176, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1077);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				{
				setState(1064);
				primary();
				}
				break;
			case 2:
				{
				setState(1065);
				match(NEW);
				setState(1066);
				creator();
				}
				break;
			case 3:
				{
				setState(1067);
				match(LPAREN);
				setState(1068);
				typeSpec();
				setState(1069);
				match(RPAREN);
				setState(1070);
				expression(18);
				}
				break;
			case 4:
				{
				setState(1072);
				_la = _input.LA(1);
				if ( !(((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (INC - 80)) | (1L << (DEC - 80)) | (1L << (ADD - 80)) | (1L << (SUB - 80)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1073);
				expression(16);
				}
				break;
			case 5:
				{
				setState(1074);
				_la = _input.LA(1);
				if ( !(_la==BANG || _la==TILDE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1075);
				expression(15);
				}
				break;
			case 6:
				{
				setState(1076);
				lambdaExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1164);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1162);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1079);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1080);
						_la = _input.LA(1);
						if ( !(((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (MUL - 84)) | (1L << (DIV - 84)) | (1L << (MOD - 84)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1081);
						expression(15);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1082);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1083);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1084);
						expression(14);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1085);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1093);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
						case 1:
							{
							setState(1086);
							match(LT);
							setState(1087);
							match(LT);
							}
							break;
						case 2:
							{
							setState(1088);
							match(GT);
							setState(1089);
							match(GT);
							setState(1090);
							match(GT);
							}
							break;
						case 3:
							{
							setState(1091);
							match(GT);
							setState(1092);
							match(GT);
							}
							break;
						}
						setState(1095);
						expression(13);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1096);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1097);
						_la = _input.LA(1);
						if ( !(((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (GT - 68)) | (1L << (LT - 68)) | (1L << (LE - 68)) | (1L << (GE - 68)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1098);
						expression(12);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1099);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1100);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1101);
						expression(10);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1102);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1103);
						match(BITAND);
						setState(1104);
						expression(9);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1105);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1106);
						match(CARET);
						setState(1107);
						expression(8);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1108);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1109);
						match(BITOR);
						setState(1110);
						expression(7);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1111);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1112);
						match(AND);
						setState(1113);
						expression(6);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1114);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1115);
						match(OR);
						setState(1116);
						expression(5);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1117);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1118);
						match(QUESTION);
						setState(1119);
						expression(0);
						setState(1120);
						match(COLON);
						setState(1121);
						expression(4);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1123);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1124);
						_la = _input.LA(1);
						if ( !(((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (ASSIGN - 67)) | (1L << (ADD_ASSIGN - 67)) | (1L << (SUB_ASSIGN - 67)) | (1L << (MUL_ASSIGN - 67)) | (1L << (DIV_ASSIGN - 67)) | (1L << (AND_ASSIGN - 67)) | (1L << (OR_ASSIGN - 67)) | (1L << (XOR_ASSIGN - 67)) | (1L << (MOD_ASSIGN - 67)) | (1L << (LSHIFT_ASSIGN - 67)) | (1L << (RSHIFT_ASSIGN - 67)) | (1L << (URSHIFT_ASSIGN - 67)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1125);
						expression(2);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1126);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(1127);
						match(DOT);
						setState(1128);
						match(Identifier);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1129);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(1130);
						match(DOT);
						setState(1131);
						match(THIS);
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1132);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(1133);
						match(DOT);
						setState(1134);
						match(NEW);
						setState(1136);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==LT) {
							{
							setState(1135);
							nonWildcardTypeArguments();
							}
						}

						setState(1138);
						innerCreator();
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1139);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(1140);
						match(DOT);
						setState(1141);
						match(SUPER);
						setState(1142);
						superSuffix();
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1143);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(1144);
						match(DOT);
						setState(1145);
						explicitGenericInvocation();
						}
						break;
					case 18:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1146);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(1147);
						match(LBRACK);
						setState(1148);
						expression(0);
						setState(1149);
						match(RBRACK);
						}
						break;
					case 19:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1151);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1152);
						match(LPAREN);
						setState(1154);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (LT - 69)) | (1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)))) != 0)) {
							{
							setState(1153);
							expressionList();
							}
						}

						setState(1156);
						match(RPAREN);
						}
						break;
					case 20:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1157);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1158);
						_la = _input.LA(1);
						if ( !(_la==INC || _la==DEC) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 21:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1159);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1160);
						match(INSTANCEOF);
						setState(1161);
						typeSpec();
						}
						break;
					}
					} 
				}
				setState(1166);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LambdaExpressionContext extends ParserRuleContext {
		public LambdaParametersContext lambdaParameters() {
			return getRuleContext(LambdaParametersContext.class,0);
		}
		public ArrowContext arrow() {
			return getRuleContext(ArrowContext.class,0);
		}
		public LambdaBodyContext lambdaBody() {
			return getRuleContext(LambdaBodyContext.class,0);
		}
		public LambdaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterLambdaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitLambdaExpression(this);
		}
	}

	public final LambdaExpressionContext lambdaExpression() throws RecognitionException {
		LambdaExpressionContext _localctx = new LambdaExpressionContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_lambdaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1167);
			lambdaParameters();
			setState(1168);
			arrow();
			setState(1169);
			lambdaBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrowContext extends ParserRuleContext {
		public ArrowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterArrow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitArrow(this);
		}
	}

	public final ArrowContext arrow() throws RecognitionException {
		ArrowContext _localctx = new ArrowContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_arrow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1171);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaParametersContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public LambdaParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterLambdaParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitLambdaParameters(this);
		}
	}

	public final LambdaParametersContext lambdaParameters() throws RecognitionException {
		LambdaParametersContext _localctx = new LambdaParametersContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_lambdaParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1173);
			match(LPAREN);
			setState(1175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA || _la==Identifier) {
				{
				setState(1174);
				parameters();
				}
			}

			setState(1177);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LambdaBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterLambdaBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitLambdaBody(this);
		}
	}

	public final LambdaBodyContext lambdaBody() throws RecognitionException {
		LambdaBodyContext _localctx = new LambdaBodyContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_lambdaBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1179);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametersContext extends ParserRuleContext {
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitParameters(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_parameters);
		try {
			setState(1185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1181);
				param();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1182);
				param();
				setState(1183);
				parameters();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TerminalNode COMMA() { return getToken(JavaParser.COMMA, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitParam(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_param);
		try {
			setState(1190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1187);
				match(Identifier);
				}
				break;
			case COMMA:
				enterOuterAlt(_localctx, 2);
				{
				setState(1188);
				match(COMMA);
				setState(1189);
				match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public TerminalNode THIS() { return getToken(JavaParser.THIS, 0); }
		public TerminalNode SUPER() { return getToken(JavaParser.SUPER, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TypeSpecContext typeSpec() {
			return getRuleContext(TypeSpecContext.class,0);
		}
		public TerminalNode DOT() { return getToken(JavaParser.DOT, 0); }
		public TerminalNode CLASS() { return getToken(JavaParser.CLASS, 0); }
		public TerminalNode VOID() { return getToken(JavaParser.VOID, 0); }
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
			return getRuleContext(ExplicitGenericInvocationSuffixContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_primary);
		try {
			setState(1213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1192);
				match(LPAREN);
				setState(1193);
				expression(0);
				setState(1194);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1196);
				match(THIS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1197);
				match(SUPER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1198);
				literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1199);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1200);
				typeSpec();
				setState(1201);
				match(DOT);
				setState(1202);
				match(CLASS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1204);
				match(VOID);
				setState(1205);
				match(DOT);
				setState(1206);
				match(CLASS);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1207);
				nonWildcardTypeArguments();
				setState(1211);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SUPER:
				case Identifier:
					{
					setState(1208);
					explicitGenericInvocationSuffix();
					}
					break;
				case THIS:
					{
					setState(1209);
					match(THIS);
					setState(1210);
					arguments();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreatorContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public CreatedNameContext createdName() {
			return getRuleContext(CreatedNameContext.class,0);
		}
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public ArrayCreatorRestContext arrayCreatorRest() {
			return getRuleContext(ArrayCreatorRestContext.class,0);
		}
		public CreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitCreator(this);
		}
	}

	public final CreatorContext creator() throws RecognitionException {
		CreatorContext _localctx = new CreatorContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_creator);
		try {
			setState(1224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1215);
				nonWildcardTypeArguments();
				setState(1216);
				createdName();
				setState(1217);
				classCreatorRest();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1219);
				createdName();
				setState(1222);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACK:
					{
					setState(1220);
					arrayCreatorRest();
					}
					break;
				case LPAREN:
					{
					setState(1221);
					classCreatorRest();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreatedNameContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(JavaParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JavaParser.Identifier, i);
		}
		public List<TypeArgumentsOrDiamondContext> typeArgumentsOrDiamond() {
			return getRuleContexts(TypeArgumentsOrDiamondContext.class);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond(int i) {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(JavaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JavaParser.DOT, i);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public CreatedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createdName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterCreatedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitCreatedName(this);
		}
	}

	public final CreatedNameContext createdName() throws RecognitionException {
		CreatedNameContext _localctx = new CreatedNameContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_createdName);
		int _la;
		try {
			setState(1241);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1226);
				match(Identifier);
				setState(1228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1227);
					typeArgumentsOrDiamond();
					}
				}

				setState(1237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(1230);
					match(DOT);
					setState(1231);
					match(Identifier);
					setState(1233);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(1232);
						typeArgumentsOrDiamond();
						}
					}

					}
					}
					setState(1239);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1240);
				primitiveType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InnerCreatorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() {
			return getRuleContext(NonWildcardTypeArgumentsOrDiamondContext.class,0);
		}
		public InnerCreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerCreator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterInnerCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitInnerCreator(this);
		}
	}

	public final InnerCreatorContext innerCreator() throws RecognitionException {
		InnerCreatorContext _localctx = new InnerCreatorContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_innerCreator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1243);
			match(Identifier);
			setState(1245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1244);
				nonWildcardTypeArgumentsOrDiamond();
				}
			}

			setState(1247);
			classCreatorRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayCreatorRestContext extends ParserRuleContext {
		public List<TerminalNode> LBRACK() { return getTokens(JavaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JavaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JavaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JavaParser.RBRACK, i);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterArrayCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitArrayCreatorRest(this);
		}
	}

	public final ArrayCreatorRestContext arrayCreatorRest() throws RecognitionException {
		ArrayCreatorRestContext _localctx = new ArrayCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_arrayCreatorRest);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1249);
			match(LBRACK);
			setState(1277);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RBRACK:
				{
				setState(1250);
				match(RBRACK);
				setState(1255);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1251);
					match(LBRACK);
					setState(1252);
					match(RBRACK);
					}
					}
					setState(1257);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1258);
				arrayInitializer();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
				{
				setState(1259);
				expression(0);
				setState(1260);
				match(RBRACK);
				setState(1267);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1261);
						match(LBRACK);
						setState(1262);
						expression(0);
						setState(1263);
						match(RBRACK);
						}
						} 
					}
					setState(1269);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
				}
				setState(1274);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1270);
						match(LBRACK);
						setState(1271);
						match(RBRACK);
						}
						} 
					}
					setState(1276);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassCreatorRestContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterClassCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassCreatorRest(this);
		}
	}

	public final ClassCreatorRestContext classCreatorRest() throws RecognitionException {
		ClassCreatorRestContext _localctx = new ClassCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_classCreatorRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1279);
			arguments();
			setState(1281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				{
				setState(1280);
				classBody();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitGenericInvocationContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
			return getRuleContext(ExplicitGenericInvocationSuffixContext.class,0);
		}
		public ExplicitGenericInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterExplicitGenericInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitExplicitGenericInvocation(this);
		}
	}

	public final ExplicitGenericInvocationContext explicitGenericInvocation() throws RecognitionException {
		ExplicitGenericInvocationContext _localctx = new ExplicitGenericInvocationContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_explicitGenericInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1283);
			nonWildcardTypeArguments();
			setState(1284);
			explicitGenericInvocationSuffix();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonWildcardTypeArgumentsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(JavaParser.LT, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TerminalNode GT() { return getToken(JavaParser.GT, 0); }
		public NonWildcardTypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterNonWildcardTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitNonWildcardTypeArguments(this);
		}
	}

	public final NonWildcardTypeArgumentsContext nonWildcardTypeArguments() throws RecognitionException {
		NonWildcardTypeArgumentsContext _localctx = new NonWildcardTypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_nonWildcardTypeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1286);
			match(LT);
			setState(1287);
			typeList();
			setState(1288);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(JavaParser.LT, 0); }
		public TerminalNode GT() { return getToken(JavaParser.GT, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTypeArgumentsOrDiamond(this);
		}
	}

	public final TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() throws RecognitionException {
		TypeArgumentsOrDiamondContext _localctx = new TypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_typeArgumentsOrDiamond);
		try {
			setState(1293);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1290);
				match(LT);
				setState(1291);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1292);
				typeArguments();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonWildcardTypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(JavaParser.LT, 0); }
		public TerminalNode GT() { return getToken(JavaParser.GT, 0); }
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public NonWildcardTypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterNonWildcardTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitNonWildcardTypeArgumentsOrDiamond(this);
		}
	}

	public final NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() throws RecognitionException {
		NonWildcardTypeArgumentsOrDiamondContext _localctx = new NonWildcardTypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_nonWildcardTypeArgumentsOrDiamond);
		try {
			setState(1298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1295);
				match(LT);
				setState(1296);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1297);
				nonWildcardTypeArguments();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperSuffixContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode DOT() { return getToken(JavaParser.DOT, 0); }
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public SuperSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterSuperSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitSuperSuffix(this);
		}
	}

	public final SuperSuffixContext superSuffix() throws RecognitionException {
		SuperSuffixContext _localctx = new SuperSuffixContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_superSuffix);
		try {
			setState(1306);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1300);
				arguments();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1301);
				match(DOT);
				setState(1302);
				match(Identifier);
				setState(1304);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
				case 1:
					{
					setState(1303);
					arguments();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitGenericInvocationSuffixContext extends ParserRuleContext {
		public TerminalNode SUPER() { return getToken(JavaParser.SUPER, 0); }
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocationSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterExplicitGenericInvocationSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitExplicitGenericInvocationSuffix(this);
		}
	}

	public final ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() throws RecognitionException {
		ExplicitGenericInvocationSuffixContext _localctx = new ExplicitGenericInvocationSuffixContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_explicitGenericInvocationSuffix);
		try {
			setState(1312);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1308);
				match(SUPER);
				setState(1309);
				superSuffix();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1310);
				match(Identifier);
				setState(1311);
				arguments();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1314);
			match(LPAREN);
			setState(1316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (LT - 69)) | (1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)))) != 0)) {
				{
				setState(1315);
				expressionList();
				}
			}

			setState(1318);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 88:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 14);
		case 1:
			return precpred(_ctx, 13);
		case 2:
			return precpred(_ctx, 12);
		case 3:
			return precpred(_ctx, 11);
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 8);
		case 6:
			return precpred(_ctx, 7);
		case 7:
			return precpred(_ctx, 6);
		case 8:
			return precpred(_ctx, 5);
		case 9:
			return precpred(_ctx, 4);
		case 10:
			return precpred(_ctx, 3);
		case 11:
			return precpred(_ctx, 2);
		case 12:
			return precpred(_ctx, 26);
		case 13:
			return precpred(_ctx, 25);
		case 14:
			return precpred(_ctx, 24);
		case 15:
			return precpred(_ctx, 23);
		case 16:
			return precpred(_ctx, 22);
		case 17:
			return precpred(_ctx, 21);
		case 18:
			return precpred(_ctx, 20);
		case 19:
			return precpred(_ctx, 17);
		case 20:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3l\u052b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\3\2\5\2\u00dc\n\2\3\2\7\2\u00df\n\2\f\2\16\2\u00e2\13\2"+
		"\3\2\7\2\u00e5\n\2\f\2\16\2\u00e8\13\2\3\2\3\2\3\3\7\3\u00ed\n\3\f\3\16"+
		"\3\u00f0\13\3\3\3\3\3\3\3\3\3\3\4\3\4\5\4\u00f8\n\4\3\4\3\4\3\4\5\4\u00fd"+
		"\n\4\3\4\3\4\3\5\7\5\u0102\n\5\f\5\16\5\u0105\13\5\3\5\3\5\7\5\u0109\n"+
		"\5\f\5\16\5\u010c\13\5\3\5\3\5\7\5\u0110\n\5\f\5\16\5\u0113\13\5\3\5\3"+
		"\5\7\5\u0117\n\5\f\5\16\5\u011a\13\5\3\5\3\5\5\5\u011e\n\5\3\6\3\6\5\6"+
		"\u0122\n\6\3\7\3\7\5\7\u0126\n\7\3\b\3\b\5\b\u012a\n\b\3\t\3\t\3\t\5\t"+
		"\u012f\n\t\3\t\3\t\5\t\u0133\n\t\3\t\3\t\5\t\u0137\n\t\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\7\13\u0141\n\13\f\13\16\13\u0144\13\13\3\13\3\13"+
		"\3\f\3\f\3\f\5\f\u014b\n\f\3\r\3\r\3\r\7\r\u0150\n\r\f\r\16\r\u0153\13"+
		"\r\3\16\3\16\3\16\3\16\5\16\u0159\n\16\3\16\3\16\5\16\u015d\n\16\3\16"+
		"\5\16\u0160\n\16\3\16\5\16\u0163\n\16\3\16\3\16\3\17\3\17\3\17\7\17\u016a"+
		"\n\17\f\17\16\17\u016d\13\17\3\20\7\20\u0170\n\20\f\20\16\20\u0173\13"+
		"\20\3\20\3\20\5\20\u0177\n\20\3\20\5\20\u017a\n\20\3\21\3\21\7\21\u017e"+
		"\n\21\f\21\16\21\u0181\13\21\3\22\3\22\3\22\5\22\u0186\n\22\3\22\3\22"+
		"\5\22\u018a\n\22\3\22\3\22\3\23\3\23\3\23\7\23\u0191\n\23\f\23\16\23\u0194"+
		"\13\23\3\24\3\24\7\24\u0198\n\24\f\24\16\24\u019b\13\24\3\24\3\24\3\25"+
		"\3\25\7\25\u01a1\n\25\f\25\16\25\u01a4\13\25\3\25\3\25\3\26\3\26\5\26"+
		"\u01aa\n\26\3\26\3\26\7\26\u01ae\n\26\f\26\16\26\u01b1\13\26\3\26\5\26"+
		"\u01b4\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u01bf\n"+
		"\27\3\30\3\30\5\30\u01c3\n\30\3\30\3\30\3\30\3\30\7\30\u01c9\n\30\f\30"+
		"\16\30\u01cc\13\30\3\30\3\30\5\30\u01d0\n\30\3\30\3\30\5\30\u01d4\n\30"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\5\32\u01dd\n\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\35\7\35\u01e9\n\35\f\35\16\35\u01ec\13\35"+
		"\3\35\3\35\5\35\u01f0\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u01f9"+
		"\n\36\3\37\3\37\3\37\3\37\7\37\u01ff\n\37\f\37\16\37\u0202\13\37\3\37"+
		"\3\37\3 \3 \3 \7 \u0209\n \f \16 \u020c\13 \3 \3 \3 \3!\3!\5!\u0213\n"+
		"!\3!\3!\3!\3!\7!\u0219\n!\f!\16!\u021c\13!\3!\3!\5!\u0220\n!\3!\3!\3\""+
		"\3\"\3\"\3#\3#\3#\7#\u022a\n#\f#\16#\u022d\13#\3$\3$\3$\5$\u0232\n$\3"+
		"%\3%\3%\7%\u0237\n%\f%\16%\u023a\13%\3&\3&\5&\u023e\n&\3\'\3\'\3\'\3\'"+
		"\7\'\u0244\n\'\f\'\16\'\u0247\13\'\3\'\5\'\u024a\n\'\5\'\u024c\n\'\3\'"+
		"\3\'\3(\3(\3)\3)\3)\7)\u0255\n)\f)\16)\u0258\13)\3)\3)\3)\7)\u025d\n)"+
		"\f)\16)\u0260\13)\5)\u0262\n)\3*\3*\5*\u0266\n*\3*\3*\3*\5*\u026b\n*\7"+
		"*\u026d\n*\f*\16*\u0270\13*\3+\3+\3,\3,\3,\3,\7,\u0278\n,\f,\16,\u027b"+
		"\13,\3,\3,\3-\3-\3-\3-\5-\u0283\n-\5-\u0285\n-\3.\3.\3.\7.\u028a\n.\f"+
		".\16.\u028d\13.\3/\3/\5/\u0291\n/\3/\3/\3\60\3\60\3\60\7\60\u0298\n\60"+
		"\f\60\16\60\u029b\13\60\3\60\3\60\5\60\u029f\n\60\3\60\5\60\u02a2\n\60"+
		"\3\61\7\61\u02a5\n\61\f\61\16\61\u02a8\13\61\3\61\3\61\3\61\3\62\7\62"+
		"\u02ae\n\62\f\62\16\62\u02b1\13\62\3\62\3\62\3\62\3\62\3\63\3\63\3\64"+
		"\3\64\3\65\3\65\3\65\7\65\u02be\n\65\f\65\16\65\u02c1\13\65\3\66\3\66"+
		"\3\67\3\67\3\67\3\67\3\67\5\67\u02ca\n\67\3\67\5\67\u02cd\n\67\38\38\3"+
		"9\39\39\79\u02d4\n9\f9\169\u02d7\139\3:\3:\3:\3:\3;\3;\3;\5;\u02e0\n;"+
		"\3<\3<\3<\3<\7<\u02e6\n<\f<\16<\u02e9\13<\5<\u02eb\n<\3<\5<\u02ee\n<\3"+
		"<\3<\3=\3=\3=\3=\3=\3>\3>\7>\u02f9\n>\f>\16>\u02fc\13>\3>\3>\3?\7?\u0301"+
		"\n?\f?\16?\u0304\13?\3?\3?\5?\u0308\n?\3@\3@\3@\3@\3@\3@\5@\u0310\n@\3"+
		"@\3@\5@\u0314\n@\3@\3@\5@\u0318\n@\3@\3@\5@\u031c\n@\5@\u031e\n@\3A\3"+
		"A\5A\u0322\nA\3B\3B\3B\3B\5B\u0328\nB\3C\3C\3D\3D\3D\3E\3E\7E\u0331\n"+
		"E\fE\16E\u0334\13E\3E\3E\3F\3F\3F\5F\u033b\nF\3G\3G\3G\3H\7H\u0341\nH"+
		"\fH\16H\u0344\13H\3H\3H\3H\3I\3I\3I\3I\3I\5I\u034e\nI\3I\3I\3I\3I\3I\3"+
		"I\3I\5I\u0357\nI\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3"+
		"I\3I\6I\u036c\nI\rI\16I\u036d\3I\5I\u0371\nI\3I\5I\u0374\nI\3I\3I\3I\3"+
		"I\7I\u037a\nI\fI\16I\u037d\13I\3I\5I\u0380\nI\3I\3I\3I\3I\7I\u0386\nI"+
		"\fI\16I\u0389\13I\3I\7I\u038c\nI\fI\16I\u038f\13I\3I\3I\3I\3I\3I\3I\3"+
		"I\3I\5I\u0399\nI\3I\3I\3I\3I\3I\3I\3I\5I\u03a2\nI\3I\3I\3I\5I\u03a7\n"+
		"I\3I\3I\3I\3I\3I\3I\3I\3I\5I\u03b1\nI\3J\3J\3J\7J\u03b6\nJ\fJ\16J\u03b9"+
		"\13J\3J\3J\3J\3J\3J\3K\3K\3K\7K\u03c3\nK\fK\16K\u03c6\13K\3L\3L\3L\3M"+
		"\3M\3M\5M\u03ce\nM\3M\3M\3N\3N\3N\7N\u03d5\nN\fN\16N\u03d8\13N\3O\7O\u03db"+
		"\nO\fO\16O\u03de\13O\3O\3O\3O\3O\3O\3P\6P\u03e6\nP\rP\16P\u03e7\3P\6P"+
		"\u03eb\nP\rP\16P\u03ec\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\5Q\u03f9\nQ\3R\3"+
		"R\5R\u03fd\nR\3R\3R\5R\u0401\nR\3R\3R\5R\u0405\nR\5R\u0407\nR\3S\3S\5"+
		"S\u040b\nS\3T\7T\u040e\nT\fT\16T\u0411\13T\3T\3T\3T\3T\3T\3U\3U\3V\3V"+
		"\3V\3V\3W\3W\3W\7W\u0421\nW\fW\16W\u0424\13W\3X\3X\3Y\3Y\3Z\3Z\3Z\3Z\3"+
		"Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\5Z\u0438\nZ\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3"+
		"Z\3Z\3Z\3Z\3Z\5Z\u0448\nZ\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3"+
		"Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3"+
		"Z\3Z\3Z\3Z\5Z\u0473\nZ\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3"+
		"Z\5Z\u0485\nZ\3Z\3Z\3Z\3Z\3Z\3Z\7Z\u048d\nZ\fZ\16Z\u0490\13Z\3[\3[\3["+
		"\3[\3\\\3\\\3]\3]\5]\u049a\n]\3]\3]\3^\3^\3_\3_\3_\3_\5_\u04a4\n_\3`\3"+
		"`\3`\5`\u04a9\n`\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3"+
		"a\3a\5a\u04be\na\5a\u04c0\na\3b\3b\3b\3b\3b\3b\3b\5b\u04c9\nb\5b\u04cb"+
		"\nb\3c\3c\5c\u04cf\nc\3c\3c\3c\5c\u04d4\nc\7c\u04d6\nc\fc\16c\u04d9\13"+
		"c\3c\5c\u04dc\nc\3d\3d\5d\u04e0\nd\3d\3d\3e\3e\3e\3e\7e\u04e8\ne\fe\16"+
		"e\u04eb\13e\3e\3e\3e\3e\3e\3e\3e\7e\u04f4\ne\fe\16e\u04f7\13e\3e\3e\7"+
		"e\u04fb\ne\fe\16e\u04fe\13e\5e\u0500\ne\3f\3f\5f\u0504\nf\3g\3g\3g\3h"+
		"\3h\3h\3h\3i\3i\3i\5i\u0510\ni\3j\3j\3j\5j\u0515\nj\3k\3k\3k\3k\5k\u051b"+
		"\nk\5k\u051d\nk\3l\3l\3l\3l\5l\u0523\nl\3m\3m\5m\u0527\nm\3m\3m\3m\2\3"+
		"\u00b2n\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:"+
		"<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2"+
		"\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba"+
		"\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2"+
		"\u00d4\u00d6\u00d8\2\17\6\2!!--\61\61\64\64\6\2\4\4\25\25$&)*\n\2\6\6"+
		"\b\b\13\13\21\21\27\27\36\36  ((\4\2\24\24++\3\2\66;\3\2RU\3\2HI\4\2V"+
		"W[[\3\2TU\4\2FGMN\4\2LLOO\4\2EE\\f\3\2RS\2\u059a\2\u00db\3\2\2\2\4\u00ee"+
		"\3\2\2\2\6\u00f5\3\2\2\2\b\u011d\3\2\2\2\n\u0121\3\2\2\2\f\u0125\3\2\2"+
		"\2\16\u0129\3\2\2\2\20\u012b\3\2\2\2\22\u013a\3\2\2\2\24\u013c\3\2\2\2"+
		"\26\u0147\3\2\2\2\30\u014c\3\2\2\2\32\u0154\3\2\2\2\34\u0166\3\2\2\2\36"+
		"\u0171\3\2\2\2 \u017b\3\2\2\2\"\u0182\3\2\2\2$\u018d\3\2\2\2&\u0195\3"+
		"\2\2\2(\u019e\3\2\2\2*\u01b3\3\2\2\2,\u01be\3\2\2\2.\u01c2\3\2\2\2\60"+
		"\u01d5\3\2\2\2\62\u01d8\3\2\2\2\64\u01e0\3\2\2\2\66\u01e3\3\2\2\28\u01ef"+
		"\3\2\2\2:\u01f8\3\2\2\2<\u01fa\3\2\2\2>\u0205\3\2\2\2@\u0212\3\2\2\2B"+
		"\u0223\3\2\2\2D\u0226\3\2\2\2F\u022e\3\2\2\2H\u0233\3\2\2\2J\u023d\3\2"+
		"\2\2L\u023f\3\2\2\2N\u024f\3\2\2\2P\u0261\3\2\2\2R\u0263\3\2\2\2T\u0271"+
		"\3\2\2\2V\u0273\3\2\2\2X\u0284\3\2\2\2Z\u0286\3\2\2\2\\\u028e\3\2\2\2"+
		"^\u02a1\3\2\2\2`\u02a6\3\2\2\2b\u02af\3\2\2\2d\u02b6\3\2\2\2f\u02b8\3"+
		"\2\2\2h\u02ba\3\2\2\2j\u02c2\3\2\2\2l\u02c4\3\2\2\2n\u02ce\3\2\2\2p\u02d0"+
		"\3\2\2\2r\u02d8\3\2\2\2t\u02df\3\2\2\2v\u02e1\3\2\2\2x\u02f1\3\2\2\2z"+
		"\u02f6\3\2\2\2|\u0307\3\2\2\2~\u031d\3\2\2\2\u0080\u0321\3\2\2\2\u0082"+
		"\u0323\3\2\2\2\u0084\u0329\3\2\2\2\u0086\u032b\3\2\2\2\u0088\u032e\3\2"+
		"\2\2\u008a\u033a\3\2\2\2\u008c\u033c\3\2\2\2\u008e\u0342\3\2\2\2\u0090"+
		"\u03b0\3\2\2\2\u0092\u03b2\3\2\2\2\u0094\u03bf\3\2\2\2\u0096\u03c7\3\2"+
		"\2\2\u0098\u03ca\3\2\2\2\u009a\u03d1\3\2\2\2\u009c\u03dc\3\2\2\2\u009e"+
		"\u03e5\3\2\2\2\u00a0\u03f8\3\2\2\2\u00a2\u0406\3\2\2\2\u00a4\u040a\3\2"+
		"\2\2\u00a6\u040f\3\2\2\2\u00a8\u0417\3\2\2\2\u00aa\u0419\3\2\2\2\u00ac"+
		"\u041d\3\2\2\2\u00ae\u0425\3\2\2\2\u00b0\u0427\3\2\2\2\u00b2\u0437\3\2"+
		"\2\2\u00b4\u0491\3\2\2\2\u00b6\u0495\3\2\2\2\u00b8\u0497\3\2\2\2\u00ba"+
		"\u049d\3\2\2\2\u00bc\u04a3\3\2\2\2\u00be\u04a8\3\2\2\2\u00c0\u04bf\3\2"+
		"\2\2\u00c2\u04ca\3\2\2\2\u00c4\u04db\3\2\2\2\u00c6\u04dd\3\2\2\2\u00c8"+
		"\u04e3\3\2\2\2\u00ca\u0501\3\2\2\2\u00cc\u0505\3\2\2\2\u00ce\u0508\3\2"+
		"\2\2\u00d0\u050f\3\2\2\2\u00d2\u0514\3\2\2\2\u00d4\u051c\3\2\2\2\u00d6"+
		"\u0522\3\2\2\2\u00d8\u0524\3\2\2\2\u00da\u00dc\5\4\3\2\u00db\u00da\3\2"+
		"\2\2\u00db\u00dc\3\2\2\2\u00dc\u00e0\3\2\2\2\u00dd\u00df\5\6\4\2\u00de"+
		"\u00dd\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2"+
		"\2\2\u00e1\u00e6\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e5\5\b\5\2\u00e4"+
		"\u00e3\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2"+
		"\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00ea\7\2\2\3\u00ea"+
		"\3\3\2\2\2\u00eb\u00ed\5l\67\2\u00ec\u00eb\3\2\2\2\u00ed\u00f0\3\2\2\2"+
		"\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00ee"+
		"\3\2\2\2\u00f1\u00f2\7#\2\2\u00f2\u00f3\5h\65\2\u00f3\u00f4\7B\2\2\u00f4"+
		"\5\3\2\2\2\u00f5\u00f7\7\34\2\2\u00f6\u00f8\7)\2\2\u00f7\u00f6\3\2\2\2"+
		"\u00f7\u00f8\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fc\5h\65\2\u00fa\u00fb"+
		"\7D\2\2\u00fb\u00fd\7V\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd"+
		"\u00fe\3\2\2\2\u00fe\u00ff\7B\2\2\u00ff\7\3\2\2\2\u0100\u0102\5\f\7\2"+
		"\u0101\u0100\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104"+
		"\3\2\2\2\u0104\u0106\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u011e\5\20\t\2"+
		"\u0107\u0109\5\f\7\2\u0108\u0107\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108"+
		"\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010d\3\2\2\2\u010c\u010a\3\2\2\2\u010d"+
		"\u011e\5\32\16\2\u010e\u0110\5\f\7\2\u010f\u010e\3\2\2\2\u0110\u0113\3"+
		"\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0114\3\2\2\2\u0113"+
		"\u0111\3\2\2\2\u0114\u011e\5\"\22\2\u0115\u0117\5\f\7\2\u0116\u0115\3"+
		"\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119"+
		"\u011b\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u011e\5x=\2\u011c\u011e\7B\2"+
		"\2\u011d\u0103\3\2\2\2\u011d\u010a\3\2\2\2\u011d\u0111\3\2\2\2\u011d\u0118"+
		"\3\2\2\2\u011d\u011c\3\2\2\2\u011e\t\3\2\2\2\u011f\u0122\5\f\7\2\u0120"+
		"\u0122\t\2\2\2\u0121\u011f\3\2\2\2\u0121\u0120\3\2\2\2\u0122\13\3\2\2"+
		"\2\u0123\u0126\5l\67\2\u0124\u0126\t\3\2\2\u0125\u0123\3\2\2\2\u0125\u0124"+
		"\3\2\2\2\u0126\r\3\2\2\2\u0127\u012a\7\25\2\2\u0128\u012a\5l\67\2\u0129"+
		"\u0127\3\2\2\2\u0129\u0128\3\2\2\2\u012a\17\3\2\2\2\u012b\u012c\7\f\2"+
		"\2\u012c\u012e\5\22\n\2\u012d\u012f\5\24\13\2\u012e\u012d\3\2\2\2\u012e"+
		"\u012f\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u0131\7\24\2\2\u0131\u0133\5"+
		"P)\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0136\3\2\2\2\u0134"+
		"\u0135\7\33\2\2\u0135\u0137\5$\23\2\u0136\u0134\3\2\2\2\u0136\u0137\3"+
		"\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139\5&\24\2\u0139\21\3\2\2\2\u013a"+
		"\u013b\7g\2\2\u013b\23\3\2\2\2\u013c\u013d\7G\2\2\u013d\u0142\5\26\f\2"+
		"\u013e\u013f\7C\2\2\u013f\u0141\5\26\f\2\u0140\u013e\3\2\2\2\u0141\u0144"+
		"\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0145\3\2\2\2\u0144"+
		"\u0142\3\2\2\2\u0145\u0146\7F\2\2\u0146\25\3\2\2\2\u0147\u014a\7g\2\2"+
		"\u0148\u0149\7\24\2\2\u0149\u014b\5\30\r\2\u014a\u0148\3\2\2\2\u014a\u014b"+
		"\3\2\2\2\u014b\27\3\2\2\2\u014c\u0151\5P)\2\u014d\u014e\7X\2\2\u014e\u0150"+
		"\5P)\2\u014f\u014d\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u014f\3\2\2\2\u0151"+
		"\u0152\3\2\2\2\u0152\31\3\2\2\2\u0153\u0151\3\2\2\2\u0154\u0155\7\23\2"+
		"\2\u0155\u0158\7g\2\2\u0156\u0157\7\33\2\2\u0157\u0159\5$\23\2\u0158\u0156"+
		"\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015c\7>\2\2\u015b"+
		"\u015d\5\34\17\2\u015c\u015b\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015f\3"+
		"\2\2\2\u015e\u0160\7C\2\2\u015f\u015e\3\2\2\2\u015f\u0160\3\2\2\2\u0160"+
		"\u0162\3\2\2\2\u0161\u0163\5 \21\2\u0162\u0161\3\2\2\2\u0162\u0163\3\2"+
		"\2\2\u0163\u0164\3\2\2\2\u0164\u0165\7?\2\2\u0165\33\3\2\2\2\u0166\u016b"+
		"\5\36\20\2\u0167\u0168\7C\2\2\u0168\u016a\5\36\20\2\u0169\u0167\3\2\2"+
		"\2\u016a\u016d\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\35"+
		"\3\2\2\2\u016d\u016b\3\2\2\2\u016e\u0170\5l\67\2\u016f\u016e\3\2\2\2\u0170"+
		"\u0173\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0174\3\2"+
		"\2\2\u0173\u0171\3\2\2\2\u0174\u0176\7g\2\2\u0175\u0177\5\u00d8m\2\u0176"+
		"\u0175\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0179\3\2\2\2\u0178\u017a\5&"+
		"\24\2\u0179\u0178\3\2\2\2\u0179\u017a\3\2\2\2\u017a\37\3\2\2\2\u017b\u017f"+
		"\7B\2\2\u017c\u017e\5*\26\2\u017d\u017c\3\2\2\2\u017e\u0181\3\2\2\2\u017f"+
		"\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180!\3\2\2\2\u0181\u017f\3\2\2\2"+
		"\u0182\u0183\7\37\2\2\u0183\u0185\7g\2\2\u0184\u0186\5\24\13\2\u0185\u0184"+
		"\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0189\3\2\2\2\u0187\u0188\7\24\2\2"+
		"\u0188\u018a\5$\23\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018b"+
		"\3\2\2\2\u018b\u018c\5(\25\2\u018c#\3\2\2\2\u018d\u0192\5P)\2\u018e\u018f"+
		"\7C\2\2\u018f\u0191\5P)\2\u0190\u018e\3\2\2\2\u0191\u0194\3\2\2\2\u0192"+
		"\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193%\3\2\2\2\u0194\u0192\3\2\2\2"+
		"\u0195\u0199\7>\2\2\u0196\u0198\5*\26\2\u0197\u0196\3\2\2\2\u0198\u019b"+
		"\3\2\2\2\u0199\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019c\3\2\2\2\u019b"+
		"\u0199\3\2\2\2\u019c\u019d\7?\2\2\u019d\'\3\2\2\2\u019e\u01a2\7>\2\2\u019f"+
		"\u01a1\58\35\2\u01a0\u019f\3\2\2\2\u01a1\u01a4\3\2\2\2\u01a2\u01a0\3\2"+
		"\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a5\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a5"+
		"\u01a6\7?\2\2\u01a6)\3\2\2\2\u01a7\u01b4\7B\2\2\u01a8\u01aa\7)\2\2\u01a9"+
		"\u01a8\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01b4\5\u0088"+
		"E\2\u01ac\u01ae\5\n\6\2\u01ad\u01ac\3\2\2\2\u01ae\u01b1\3\2\2\2\u01af"+
		"\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b2\3\2\2\2\u01b1\u01af\3\2"+
		"\2\2\u01b2\u01b4\5,\27\2\u01b3\u01a7\3\2\2\2\u01b3\u01a9\3\2\2\2\u01b3"+
		"\u01af\3\2\2\2\u01b4+\3\2\2\2\u01b5\u01bf\5.\30\2\u01b6\u01bf\5\60\31"+
		"\2\u01b7\u01bf\5\66\34\2\u01b8\u01bf\5\62\32\2\u01b9\u01bf\5\64\33\2\u01ba"+
		"\u01bf\5\"\22\2\u01bb\u01bf\5x=\2\u01bc\u01bf\5\20\t\2\u01bd\u01bf\5\32"+
		"\16\2\u01be\u01b5\3\2\2\2\u01be\u01b6\3\2\2\2\u01be\u01b7\3\2\2\2\u01be"+
		"\u01b8\3\2\2\2\u01be\u01b9\3\2\2\2\u01be\u01ba\3\2\2\2\u01be\u01bb\3\2"+
		"\2\2\u01be\u01bc\3\2\2\2\u01be\u01bd\3\2\2\2\u01bf-\3\2\2\2\u01c0\u01c3"+
		"\5P)\2\u01c1\u01c3\7\63\2\2\u01c2\u01c0\3\2\2\2\u01c2\u01c1\3\2\2\2\u01c3"+
		"\u01c4\3\2\2\2\u01c4\u01c5\7g\2\2\u01c5\u01ca\5\\/\2\u01c6\u01c7\7@\2"+
		"\2\u01c7\u01c9\7A\2\2\u01c8\u01c6\3\2\2\2\u01c9\u01cc\3\2\2\2\u01ca\u01c8"+
		"\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cf\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cd"+
		"\u01ce\7\60\2\2\u01ce\u01d0\5Z.\2\u01cf\u01cd\3\2\2\2\u01cf\u01d0\3\2"+
		"\2\2\u01d0\u01d3\3\2\2\2\u01d1\u01d4\5d\63\2\u01d2\u01d4\7B\2\2\u01d3"+
		"\u01d1\3\2\2\2\u01d3\u01d2\3\2\2\2\u01d4/\3\2\2\2\u01d5\u01d6\5\24\13"+
		"\2\u01d6\u01d7\5.\30\2\u01d7\61\3\2\2\2\u01d8\u01d9\7g\2\2\u01d9\u01dc"+
		"\5\\/\2\u01da\u01db\7\60\2\2\u01db\u01dd\5Z.\2\u01dc\u01da\3\2\2\2\u01dc"+
		"\u01dd\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01df\5f\64\2\u01df\63\3\2\2"+
		"\2\u01e0\u01e1\5\24\13\2\u01e1\u01e2\5\62\32\2\u01e2\65\3\2\2\2\u01e3"+
		"\u01e4\5P)\2\u01e4\u01e5\5D#\2\u01e5\u01e6\7B\2\2\u01e6\67\3\2\2\2\u01e7"+
		"\u01e9\5\n\6\2\u01e8\u01e7\3\2\2\2\u01e9\u01ec\3\2\2\2\u01ea\u01e8\3\2"+
		"\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ed\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ed"+
		"\u01f0\5:\36\2\u01ee\u01f0\7B\2\2\u01ef\u01ea\3\2\2\2\u01ef\u01ee\3\2"+
		"\2\2\u01f09\3\2\2\2\u01f1\u01f9\5<\37\2\u01f2\u01f9\5@!\2\u01f3\u01f9"+
		"\5B\"\2\u01f4\u01f9\5\"\22\2\u01f5\u01f9\5x=\2\u01f6\u01f9\5\20\t\2\u01f7"+
		"\u01f9\5\32\16\2\u01f8\u01f1\3\2\2\2\u01f8\u01f2\3\2\2\2\u01f8\u01f3\3"+
		"\2\2\2\u01f8\u01f4\3\2\2\2\u01f8\u01f5\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f8"+
		"\u01f7\3\2\2\2\u01f9;\3\2\2\2\u01fa\u01fb\5P)\2\u01fb\u0200\5> \2\u01fc"+
		"\u01fd\7C\2\2\u01fd\u01ff\5> \2\u01fe\u01fc\3\2\2\2\u01ff\u0202\3\2\2"+
		"\2\u0200\u01fe\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0203\3\2\2\2\u0202\u0200"+
		"\3\2\2\2\u0203\u0204\7B\2\2\u0204=\3\2\2\2\u0205\u020a\7g\2\2\u0206\u0207"+
		"\7@\2\2\u0207\u0209\7A\2\2\u0208\u0206\3\2\2\2\u0209\u020c\3\2\2\2\u020a"+
		"\u0208\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020d\3\2\2\2\u020c\u020a\3\2"+
		"\2\2\u020d\u020e\7E\2\2\u020e\u020f\5J&\2\u020f?\3\2\2\2\u0210\u0213\5"+
		"P)\2\u0211\u0213\7\63\2\2\u0212\u0210\3\2\2\2\u0212\u0211\3\2\2\2\u0213"+
		"\u0214\3\2\2\2\u0214\u0215\7g\2\2\u0215\u021a\5\\/\2\u0216\u0217\7@\2"+
		"\2\u0217\u0219\7A\2\2\u0218\u0216\3\2\2\2\u0219\u021c\3\2\2\2\u021a\u0218"+
		"\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u021f\3\2\2\2\u021c\u021a\3\2\2\2\u021d"+
		"\u021e\7\60\2\2\u021e\u0220\5Z.\2\u021f\u021d\3\2\2\2\u021f\u0220\3\2"+
		"\2\2\u0220\u0221\3\2\2\2\u0221\u0222\7B\2\2\u0222A\3\2\2\2\u0223\u0224"+
		"\5\24\13\2\u0224\u0225\5@!\2\u0225C\3\2\2\2\u0226\u022b\5F$\2\u0227\u0228"+
		"\7C\2\2\u0228\u022a\5F$\2\u0229\u0227\3\2\2\2\u022a\u022d\3\2\2\2\u022b"+
		"\u0229\3\2\2\2\u022b\u022c\3\2\2\2\u022cE\3\2\2\2\u022d\u022b\3\2\2\2"+
		"\u022e\u0231\5H%\2\u022f\u0230\7E\2\2\u0230\u0232\5J&\2\u0231\u022f\3"+
		"\2\2\2\u0231\u0232\3\2\2\2\u0232G\3\2\2\2\u0233\u0238\7g\2\2\u0234\u0235"+
		"\7@\2\2\u0235\u0237\7A\2\2\u0236\u0234\3\2\2\2\u0237\u023a\3\2\2\2\u0238"+
		"\u0236\3\2\2\2\u0238\u0239\3\2\2\2\u0239I\3\2\2\2\u023a\u0238\3\2\2\2"+
		"\u023b\u023e\5L\'\2\u023c\u023e\5\u00b2Z\2\u023d\u023b\3\2\2\2\u023d\u023c"+
		"\3\2\2\2\u023eK\3\2\2\2\u023f\u024b\7>\2\2\u0240\u0245\5J&\2\u0241\u0242"+
		"\7C\2\2\u0242\u0244\5J&\2\u0243\u0241\3\2\2\2\u0244\u0247\3\2\2\2\u0245"+
		"\u0243\3\2\2\2\u0245\u0246\3\2\2\2\u0246\u0249\3\2\2\2\u0247\u0245\3\2"+
		"\2\2\u0248\u024a\7C\2\2\u0249\u0248\3\2\2\2\u0249\u024a\3\2\2\2\u024a"+
		"\u024c\3\2\2\2\u024b\u0240\3\2\2\2\u024b\u024c\3\2\2\2\u024c\u024d\3\2"+
		"\2\2\u024d\u024e\7?\2\2\u024eM\3\2\2\2\u024f\u0250\7g\2\2\u0250O\3\2\2"+
		"\2\u0251\u0256\5R*\2\u0252\u0253\7@\2\2\u0253\u0255\7A\2\2\u0254\u0252"+
		"\3\2\2\2\u0255\u0258\3\2\2\2\u0256\u0254\3\2\2\2\u0256\u0257\3\2\2\2\u0257"+
		"\u0262\3\2\2\2\u0258\u0256\3\2\2\2\u0259\u025e\5T+\2\u025a\u025b\7@\2"+
		"\2\u025b\u025d\7A\2\2\u025c\u025a\3\2\2\2\u025d\u0260\3\2\2\2\u025e\u025c"+
		"\3\2\2\2\u025e\u025f\3\2\2\2\u025f\u0262\3\2\2\2\u0260\u025e\3\2\2\2\u0261"+
		"\u0251\3\2\2\2\u0261\u0259\3\2\2\2\u0262Q\3\2\2\2\u0263\u0265\7g\2\2\u0264"+
		"\u0266\5V,\2\u0265\u0264\3\2\2\2\u0265\u0266\3\2\2\2\u0266\u026e\3\2\2"+
		"\2\u0267\u0268\7D\2\2\u0268\u026a\7g\2\2\u0269\u026b\5V,\2\u026a\u0269"+
		"\3\2\2\2\u026a\u026b\3\2\2\2\u026b\u026d\3\2\2\2\u026c\u0267\3\2\2\2\u026d"+
		"\u0270\3\2\2\2\u026e\u026c\3\2\2\2\u026e\u026f\3\2\2\2\u026fS\3\2\2\2"+
		"\u0270\u026e\3\2\2\2\u0271\u0272\t\4\2\2\u0272U\3\2\2\2\u0273\u0274\7"+
		"G\2\2\u0274\u0279\5X-\2\u0275\u0276\7C\2\2\u0276\u0278\5X-\2\u0277\u0275"+
		"\3\2\2\2\u0278\u027b\3\2\2\2\u0279\u0277\3\2\2\2\u0279\u027a\3\2\2\2\u027a"+
		"\u027c\3\2\2\2\u027b\u0279\3\2\2\2\u027c\u027d\7F\2\2\u027dW\3\2\2\2\u027e"+
		"\u0285\5P)\2\u027f\u0282\7J\2\2\u0280\u0281\t\5\2\2\u0281\u0283\5P)\2"+
		"\u0282\u0280\3\2\2\2\u0282\u0283\3\2\2\2\u0283\u0285\3\2\2\2\u0284\u027e"+
		"\3\2\2\2\u0284\u027f\3\2\2\2\u0285Y\3\2\2\2\u0286\u028b\5h\65\2\u0287"+
		"\u0288\7C\2\2\u0288\u028a\5h\65\2\u0289\u0287\3\2\2\2\u028a\u028d\3\2"+
		"\2\2\u028b\u0289\3\2\2\2\u028b\u028c\3\2\2\2\u028c[\3\2\2\2\u028d\u028b"+
		"\3\2\2\2\u028e\u0290\7<\2\2\u028f\u0291\5^\60\2\u0290\u028f\3\2\2\2\u0290"+
		"\u0291\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u0293\7=\2\2\u0293]\3\2\2\2\u0294"+
		"\u0299\5`\61\2\u0295\u0296\7C\2\2\u0296\u0298\5`\61\2\u0297\u0295\3\2"+
		"\2\2\u0298\u029b\3\2\2\2\u0299\u0297\3\2\2\2\u0299\u029a\3\2\2\2\u029a"+
		"\u029e\3\2\2\2\u029b\u0299\3\2\2\2\u029c\u029d\7C\2\2\u029d\u029f\5b\62"+
		"\2\u029e\u029c\3\2\2\2\u029e\u029f\3\2\2\2\u029f\u02a2\3\2\2\2\u02a0\u02a2"+
		"\5b\62\2\u02a1\u0294\3\2\2\2\u02a1\u02a0\3\2\2\2\u02a2_\3\2\2\2\u02a3"+
		"\u02a5\5\16\b\2\u02a4\u02a3\3\2\2\2\u02a5\u02a8\3\2\2\2\u02a6\u02a4\3"+
		"\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02a9\3\2\2\2\u02a8\u02a6\3\2\2\2\u02a9"+
		"\u02aa\5P)\2\u02aa\u02ab\5H%\2\u02aba\3\2\2\2\u02ac\u02ae\5\16\b\2\u02ad"+
		"\u02ac\3\2\2\2\u02ae\u02b1\3\2\2\2\u02af\u02ad\3\2\2\2\u02af\u02b0\3\2"+
		"\2\2\u02b0\u02b2\3\2\2\2\u02b1\u02af\3\2\2\2\u02b2\u02b3\5P)\2\u02b3\u02b4"+
		"\7i\2\2\u02b4\u02b5\5H%\2\u02b5c\3\2\2\2\u02b6\u02b7\5\u0088E\2\u02b7"+
		"e\3\2\2\2\u02b8\u02b9\5\u0088E\2\u02b9g\3\2\2\2\u02ba\u02bf\7g\2\2\u02bb"+
		"\u02bc\7D\2\2\u02bc\u02be\7g\2\2\u02bd\u02bb\3\2\2\2\u02be\u02c1\3\2\2"+
		"\2\u02bf\u02bd\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0i\3\2\2\2\u02c1\u02bf"+
		"\3\2\2\2\u02c2\u02c3\t\6\2\2\u02c3k\3\2\2\2\u02c4\u02c5\7h\2\2\u02c5\u02cc"+
		"\5n8\2\u02c6\u02c9\7<\2\2\u02c7\u02ca\5p9\2\u02c8\u02ca\5t;\2\u02c9\u02c7"+
		"\3\2\2\2\u02c9\u02c8\3\2\2\2\u02c9\u02ca\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb"+
		"\u02cd\7=\2\2\u02cc\u02c6\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cdm\3\2\2\2\u02ce"+
		"\u02cf\5h\65\2\u02cfo\3\2\2\2\u02d0\u02d5\5r:\2\u02d1\u02d2\7C\2\2\u02d2"+
		"\u02d4\5r:\2\u02d3\u02d1\3\2\2\2\u02d4\u02d7\3\2\2\2\u02d5\u02d3\3\2\2"+
		"\2\u02d5\u02d6\3\2\2\2\u02d6q\3\2\2\2\u02d7\u02d5\3\2\2\2\u02d8\u02d9"+
		"\7g\2\2\u02d9\u02da\7E\2\2\u02da\u02db\5t;\2\u02dbs\3\2\2\2\u02dc\u02e0"+
		"\5\u00b2Z\2\u02dd\u02e0\5l\67\2\u02de\u02e0\5v<\2\u02df\u02dc\3\2\2\2"+
		"\u02df\u02dd\3\2\2\2\u02df\u02de\3\2\2\2\u02e0u\3\2\2\2\u02e1\u02ea\7"+
		">\2\2\u02e2\u02e7\5t;\2\u02e3\u02e4\7C\2\2\u02e4\u02e6\5t;\2\u02e5\u02e3"+
		"\3\2\2\2\u02e6\u02e9\3\2\2\2\u02e7\u02e5\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8"+
		"\u02eb\3\2\2\2\u02e9\u02e7\3\2\2\2\u02ea\u02e2\3\2\2\2\u02ea\u02eb\3\2"+
		"\2\2\u02eb\u02ed\3\2\2\2\u02ec\u02ee\7C\2\2\u02ed\u02ec\3\2\2\2\u02ed"+
		"\u02ee\3\2\2\2\u02ee\u02ef\3\2\2\2\u02ef\u02f0\7?\2\2\u02f0w\3\2\2\2\u02f1"+
		"\u02f2\7h\2\2\u02f2\u02f3\7\37\2\2\u02f3\u02f4\7g\2\2\u02f4\u02f5\5z>"+
		"\2\u02f5y\3\2\2\2\u02f6\u02fa\7>\2\2\u02f7\u02f9\5|?\2\u02f8\u02f7\3\2"+
		"\2\2\u02f9\u02fc\3\2\2\2\u02fa\u02f8\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fb"+
		"\u02fd\3\2\2\2\u02fc\u02fa\3\2\2\2\u02fd\u02fe\7?\2\2\u02fe{\3\2\2\2\u02ff"+
		"\u0301\5\n\6\2\u0300\u02ff\3\2\2\2\u0301\u0304\3\2\2\2\u0302\u0300\3\2"+
		"\2\2\u0302\u0303\3\2\2\2\u0303\u0305\3\2\2\2\u0304\u0302\3\2\2\2\u0305"+
		"\u0308\5~@\2\u0306\u0308\7B\2\2\u0307\u0302\3\2\2\2\u0307\u0306\3\2\2"+
		"\2\u0308}\3\2\2\2\u0309\u030a\5P)\2\u030a\u030b\5\u0080A\2\u030b\u030c"+
		"\7B\2\2\u030c\u031e\3\2\2\2\u030d\u030f\5\20\t\2\u030e\u0310\7B\2\2\u030f"+
		"\u030e\3\2\2\2\u030f\u0310\3\2\2\2\u0310\u031e\3\2\2\2\u0311\u0313\5\""+
		"\22\2\u0312\u0314\7B\2\2\u0313\u0312\3\2\2\2\u0313\u0314\3\2\2\2\u0314"+
		"\u031e\3\2\2\2\u0315\u0317\5\32\16\2\u0316\u0318\7B\2\2\u0317\u0316\3"+
		"\2\2\2\u0317\u0318\3\2\2\2\u0318\u031e\3\2\2\2\u0319\u031b\5x=\2\u031a"+
		"\u031c\7B\2\2\u031b\u031a\3\2\2\2\u031b\u031c\3\2\2\2\u031c\u031e\3\2"+
		"\2\2\u031d\u0309\3\2\2\2\u031d\u030d\3\2\2\2\u031d\u0311\3\2\2\2\u031d"+
		"\u0315\3\2\2\2\u031d\u0319\3\2\2\2\u031e\177\3\2\2\2\u031f\u0322\5\u0082"+
		"B\2\u0320\u0322\5\u0084C\2\u0321\u031f\3\2\2\2\u0321\u0320\3\2\2\2\u0322"+
		"\u0081\3\2\2\2\u0323\u0324\7g\2\2\u0324\u0325\7<\2\2\u0325\u0327\7=\2"+
		"\2\u0326\u0328\5\u0086D\2\u0327\u0326\3\2\2\2\u0327\u0328\3\2\2\2\u0328"+
		"\u0083\3\2\2\2\u0329\u032a\5D#\2\u032a\u0085\3\2\2\2\u032b\u032c\7\17"+
		"\2\2\u032c\u032d\5t;\2\u032d\u0087\3\2\2\2\u032e\u0332\7>\2\2\u032f\u0331"+
		"\5\u008aF\2\u0330\u032f\3\2\2\2\u0331\u0334\3\2\2\2\u0332\u0330\3\2\2"+
		"\2\u0332\u0333\3\2\2\2\u0333\u0335\3\2\2\2\u0334\u0332\3\2\2\2\u0335\u0336"+
		"\7?\2\2\u0336\u0089\3\2\2\2\u0337\u033b\5\u008cG\2\u0338\u033b\5\u0090"+
		"I\2\u0339\u033b\5\b\5\2\u033a\u0337\3\2\2\2\u033a\u0338\3\2\2\2\u033a"+
		"\u0339\3\2\2\2\u033b\u008b\3\2\2\2\u033c\u033d\5\u008eH\2\u033d\u033e"+
		"\7B\2\2\u033e\u008d\3\2\2\2\u033f\u0341\5\16\b\2\u0340\u033f\3\2\2\2\u0341"+
		"\u0344\3\2\2\2\u0342\u0340\3\2\2\2\u0342\u0343\3\2\2\2\u0343\u0345\3\2"+
		"\2\2\u0344\u0342\3\2\2\2\u0345\u0346\5P)\2\u0346\u0347\5D#\2\u0347\u008f"+
		"\3\2\2\2\u0348\u03b1\5\u0088E\2\u0349\u034a\7\5\2\2\u034a\u034d\5\u00b2"+
		"Z\2\u034b\u034c\7K\2\2\u034c\u034e\5\u00b2Z\2\u034d\u034b\3\2\2\2\u034d"+
		"\u034e\3\2\2\2\u034e\u034f\3\2\2\2\u034f\u0350\7B\2\2\u0350\u03b1\3\2"+
		"\2\2\u0351\u0352\7\31\2\2\u0352\u0353\5\u00aaV\2\u0353\u0356\5\u0090I"+
		"\2\u0354\u0355\7\22\2\2\u0355\u0357\5\u0090I\2\u0356\u0354\3\2\2\2\u0356"+
		"\u0357\3\2\2\2\u0357\u03b1\3\2\2\2\u0358\u0359\7\30\2\2\u0359\u035a\7"+
		"<\2\2\u035a\u035b\5\u00a2R\2\u035b\u035c\7=\2\2\u035c\u035d\5\u0090I\2"+
		"\u035d\u03b1\3\2\2\2\u035e\u035f\7\65\2\2\u035f\u0360\5\u00aaV\2\u0360"+
		"\u0361\5\u0090I\2\u0361\u03b1\3\2\2\2\u0362\u0363\7\20\2\2\u0363\u0364"+
		"\5\u0090I\2\u0364\u0365\7\65\2\2\u0365\u0366\5\u00aaV\2\u0366\u0367\7"+
		"B\2\2\u0367\u03b1\3\2\2\2\u0368\u0369\7\62\2\2\u0369\u0373\5\u0088E\2"+
		"\u036a\u036c\5\u0092J\2\u036b\u036a\3\2\2\2\u036c\u036d\3\2\2\2\u036d"+
		"\u036b\3\2\2\2\u036d\u036e\3\2\2\2\u036e\u0370\3\2\2\2\u036f\u0371\5\u0096"+
		"L\2\u0370\u036f\3\2\2\2\u0370\u0371\3\2\2\2\u0371\u0374\3\2\2\2\u0372"+
		"\u0374\5\u0096L\2\u0373\u036b\3\2\2\2\u0373\u0372\3\2\2\2\u0374\u03b1"+
		"\3\2\2\2\u0375\u0376\7\62\2\2\u0376\u0377\5\u0098M\2\u0377\u037b\5\u0088"+
		"E\2\u0378\u037a\5\u0092J\2\u0379\u0378\3\2\2\2\u037a\u037d\3\2\2\2\u037b"+
		"\u0379\3\2\2\2\u037b\u037c\3\2\2\2\u037c\u037f\3\2\2\2\u037d\u037b\3\2"+
		"\2\2\u037e\u0380\5\u0096L\2\u037f\u037e\3\2\2\2\u037f\u0380\3\2\2\2\u0380"+
		"\u03b1\3\2\2\2\u0381\u0382\7,\2\2\u0382\u0383\5\u00aaV\2\u0383\u0387\7"+
		">\2\2\u0384\u0386\5\u009eP\2\u0385\u0384\3\2\2\2\u0386\u0389\3\2\2\2\u0387"+
		"\u0385\3\2\2\2\u0387\u0388\3\2\2\2\u0388\u038d\3\2\2\2\u0389\u0387\3\2"+
		"\2\2\u038a\u038c\5\u00a0Q\2\u038b\u038a\3\2\2\2\u038c\u038f\3\2\2\2\u038d"+
		"\u038b\3\2\2\2\u038d\u038e\3\2\2\2\u038e\u0390\3\2\2\2\u038f\u038d\3\2"+
		"\2\2\u0390\u0391\7?\2\2\u0391\u03b1\3\2\2\2\u0392\u0393\7-\2\2\u0393\u0394"+
		"\5\u00aaV\2\u0394\u0395\5\u0088E\2\u0395\u03b1\3\2\2\2\u0396\u0398\7\'"+
		"\2\2\u0397\u0399\5\u00b2Z\2\u0398\u0397\3\2\2\2\u0398\u0399\3\2\2\2\u0399"+
		"\u039a\3\2\2\2\u039a\u03b1\7B\2\2\u039b\u039c\7/\2\2\u039c\u039d\5\u00b2"+
		"Z\2\u039d\u039e\7B\2\2\u039e\u03b1\3\2\2\2\u039f\u03a1\7\7\2\2\u03a0\u03a2"+
		"\7g\2\2\u03a1\u03a0\3\2\2\2\u03a1\u03a2\3\2\2\2\u03a2\u03a3\3\2\2\2\u03a3"+
		"\u03b1\7B\2\2\u03a4\u03a6\7\16\2\2\u03a5\u03a7\7g\2\2\u03a6\u03a5\3\2"+
		"\2\2\u03a6\u03a7\3\2\2\2\u03a7\u03a8\3\2\2\2\u03a8\u03b1\7B\2\2\u03a9"+
		"\u03b1\7B\2\2\u03aa\u03ab\5\u00aeX\2\u03ab\u03ac\7B\2\2\u03ac\u03b1\3"+
		"\2\2\2\u03ad\u03ae\7g\2\2\u03ae\u03af\7K\2\2\u03af\u03b1\5\u0090I\2\u03b0"+
		"\u0348\3\2\2\2\u03b0\u0349\3\2\2\2\u03b0\u0351\3\2\2\2\u03b0\u0358\3\2"+
		"\2\2\u03b0\u035e\3\2\2\2\u03b0\u0362\3\2\2\2\u03b0\u0368\3\2\2\2\u03b0"+
		"\u0375\3\2\2\2\u03b0\u0381\3\2\2\2\u03b0\u0392\3\2\2\2\u03b0\u0396\3\2"+
		"\2\2\u03b0\u039b\3\2\2\2\u03b0\u039f\3\2\2\2\u03b0\u03a4\3\2\2\2\u03b0"+
		"\u03a9\3\2\2\2\u03b0\u03aa\3\2\2\2\u03b0\u03ad\3\2\2\2\u03b1\u0091\3\2"+
		"\2\2\u03b2\u03b3\7\n\2\2\u03b3\u03b7\7<\2\2\u03b4\u03b6\5\16\b\2\u03b5"+
		"\u03b4\3\2\2\2\u03b6\u03b9\3\2\2\2\u03b7\u03b5\3\2\2\2\u03b7\u03b8\3\2"+
		"\2\2\u03b8\u03ba\3\2\2\2\u03b9\u03b7\3\2\2\2\u03ba\u03bb\5\u0094K\2\u03bb"+
		"\u03bc\7g\2\2\u03bc\u03bd\7=\2\2\u03bd\u03be\5\u0088E\2\u03be\u0093\3"+
		"\2\2\2\u03bf\u03c4\5h\65\2\u03c0\u03c1\7Y\2\2\u03c1\u03c3\5h\65\2\u03c2"+
		"\u03c0\3\2\2\2\u03c3\u03c6\3\2\2\2\u03c4\u03c2\3\2\2\2\u03c4\u03c5\3\2"+
		"\2\2\u03c5\u0095\3\2\2\2\u03c6\u03c4\3\2\2\2\u03c7\u03c8\7\26\2\2\u03c8"+
		"\u03c9\5\u0088E\2\u03c9\u0097\3\2\2\2\u03ca\u03cb\7<\2\2\u03cb\u03cd\5"+
		"\u009aN\2\u03cc\u03ce\7B\2\2\u03cd\u03cc\3\2\2\2\u03cd\u03ce\3\2\2\2\u03ce"+
		"\u03cf\3\2\2\2\u03cf\u03d0\7=\2\2\u03d0\u0099\3\2\2\2\u03d1\u03d6\5\u009c"+
		"O\2\u03d2\u03d3\7B\2\2\u03d3\u03d5\5\u009cO\2\u03d4\u03d2\3\2\2\2\u03d5"+
		"\u03d8\3\2\2\2\u03d6\u03d4\3\2\2\2\u03d6\u03d7\3\2\2\2\u03d7\u009b\3\2"+
		"\2\2\u03d8\u03d6\3\2\2\2\u03d9\u03db\5\16\b\2\u03da\u03d9\3\2\2\2\u03db"+
		"\u03de\3\2\2\2\u03dc\u03da\3\2\2\2\u03dc\u03dd\3\2\2\2\u03dd\u03df\3\2"+
		"\2\2\u03de\u03dc\3\2\2\2\u03df\u03e0\5R*\2\u03e0\u03e1\5H%\2\u03e1\u03e2"+
		"\7E\2\2\u03e2\u03e3\5\u00b2Z\2\u03e3\u009d\3\2\2\2\u03e4\u03e6\5\u00a0"+
		"Q\2\u03e5\u03e4\3\2\2\2\u03e6\u03e7\3\2\2\2\u03e7\u03e5\3\2\2\2\u03e7"+
		"\u03e8\3\2\2\2\u03e8\u03ea\3\2\2\2\u03e9\u03eb\5\u008aF\2\u03ea\u03e9"+
		"\3\2\2\2\u03eb\u03ec\3\2\2\2\u03ec\u03ea\3\2\2\2\u03ec\u03ed\3\2\2\2\u03ed"+
		"\u009f\3\2\2\2\u03ee\u03ef\7\t\2\2\u03ef\u03f0\5\u00b0Y\2\u03f0\u03f1"+
		"\7K\2\2\u03f1\u03f9\3\2\2\2\u03f2\u03f3\7\t\2\2\u03f3\u03f4\5N(\2\u03f4"+
		"\u03f5\7K\2\2\u03f5\u03f9\3\2\2\2\u03f6\u03f7\7\17\2\2\u03f7\u03f9\7K"+
		"\2\2\u03f8\u03ee\3\2\2\2\u03f8\u03f2\3\2\2\2\u03f8\u03f6\3\2\2\2\u03f9"+
		"\u00a1\3\2\2\2\u03fa\u0407\5\u00a6T\2\u03fb\u03fd\5\u00a4S\2\u03fc\u03fb"+
		"\3\2\2\2\u03fc\u03fd\3\2\2\2\u03fd\u03fe\3\2\2\2\u03fe\u0400\7B\2\2\u03ff"+
		"\u0401\5\u00b2Z\2\u0400\u03ff\3\2\2\2\u0400\u0401\3\2\2\2\u0401\u0402"+
		"\3\2\2\2\u0402\u0404\7B\2\2\u0403\u0405\5\u00a8U\2\u0404\u0403\3\2\2\2"+
		"\u0404\u0405\3\2\2\2\u0405\u0407\3\2\2\2\u0406\u03fa\3\2\2\2\u0406\u03fc"+
		"\3\2\2\2\u0407\u00a3\3\2\2\2\u0408\u040b\5\u008eH\2\u0409\u040b\5\u00ac"+
		"W\2\u040a\u0408\3\2\2\2\u040a\u0409\3\2\2\2\u040b\u00a5\3\2\2\2\u040c"+
		"\u040e\5\16\b\2\u040d\u040c\3\2\2\2\u040e\u0411\3\2\2\2\u040f\u040d\3"+
		"\2\2\2\u040f\u0410\3\2\2\2\u0410\u0412\3\2\2\2\u0411\u040f\3\2\2\2\u0412"+
		"\u0413\5P)\2\u0413\u0414\5H%\2\u0414\u0415\7K\2\2\u0415\u0416\5\u00b2"+
		"Z\2\u0416\u00a7\3\2\2\2\u0417\u0418\5\u00acW\2\u0418\u00a9\3\2\2\2\u0419"+
		"\u041a\7<\2\2\u041a\u041b\5\u00b2Z\2\u041b\u041c\7=\2\2\u041c\u00ab\3"+
		"\2\2\2\u041d\u0422\5\u00b2Z\2\u041e\u041f\7C\2\2\u041f\u0421\5\u00b2Z"+
		"\2\u0420\u041e\3\2\2\2\u0421\u0424\3\2\2\2\u0422\u0420\3\2\2\2\u0422\u0423"+
		"\3\2\2\2\u0423\u00ad\3\2\2\2\u0424\u0422\3\2\2\2\u0425\u0426\5\u00b2Z"+
		"\2\u0426\u00af\3\2\2\2\u0427\u0428\5\u00b2Z\2\u0428\u00b1\3\2\2\2\u0429"+
		"\u042a\bZ\1\2\u042a\u0438\5\u00c0a\2\u042b\u042c\7\"\2\2\u042c\u0438\5"+
		"\u00c2b\2\u042d\u042e\7<\2\2\u042e\u042f\5P)\2\u042f\u0430\7=\2\2\u0430"+
		"\u0431\5\u00b2Z\24\u0431\u0438\3\2\2\2\u0432\u0433\t\7\2\2\u0433\u0438"+
		"\5\u00b2Z\22\u0434\u0435\t\b\2\2\u0435\u0438\5\u00b2Z\21\u0436\u0438\5"+
		"\u00b4[\2\u0437\u0429\3\2\2\2\u0437\u042b\3\2\2\2\u0437\u042d\3\2\2\2"+
		"\u0437\u0432\3\2\2\2\u0437\u0434\3\2\2\2\u0437\u0436\3\2\2\2\u0438\u048e"+
		"\3\2\2\2\u0439\u043a\f\20\2\2\u043a\u043b\t\t\2\2\u043b\u048d\5\u00b2"+
		"Z\21\u043c\u043d\f\17\2\2\u043d\u043e\t\n\2\2\u043e\u048d\5\u00b2Z\20"+
		"\u043f\u0447\f\16\2\2\u0440\u0441\7G\2\2\u0441\u0448\7G\2\2\u0442\u0443"+
		"\7F\2\2\u0443\u0444\7F\2\2\u0444\u0448\7F\2\2\u0445\u0446\7F\2\2\u0446"+
		"\u0448\7F\2\2\u0447\u0440\3\2\2\2\u0447\u0442\3\2\2\2\u0447\u0445\3\2"+
		"\2\2\u0448\u0449\3\2\2\2\u0449\u048d\5\u00b2Z\17\u044a\u044b\f\r\2\2\u044b"+
		"\u044c\t\13\2\2\u044c\u048d\5\u00b2Z\16\u044d\u044e\f\13\2\2\u044e\u044f"+
		"\t\f\2\2\u044f\u048d\5\u00b2Z\f\u0450\u0451\f\n\2\2\u0451\u0452\7X\2\2"+
		"\u0452\u048d\5\u00b2Z\13\u0453\u0454\f\t\2\2\u0454\u0455\7Z\2\2\u0455"+
		"\u048d\5\u00b2Z\n\u0456\u0457\f\b\2\2\u0457\u0458\7Y\2\2\u0458\u048d\5"+
		"\u00b2Z\t\u0459\u045a\f\7\2\2\u045a\u045b\7P\2\2\u045b\u048d\5\u00b2Z"+
		"\b\u045c\u045d\f\6\2\2\u045d\u045e\7Q\2\2\u045e\u048d\5\u00b2Z\7\u045f"+
		"\u0460\f\5\2\2\u0460\u0461\7J\2\2\u0461\u0462\5\u00b2Z\2\u0462\u0463\7"+
		"K\2\2\u0463\u0464\5\u00b2Z\6\u0464\u048d\3\2\2\2\u0465\u0466\f\4\2\2\u0466"+
		"\u0467\t\r\2\2\u0467\u048d\5\u00b2Z\4\u0468\u0469\f\34\2\2\u0469\u046a"+
		"\7D\2\2\u046a\u048d\7g\2\2\u046b\u046c\f\33\2\2\u046c\u046d\7D\2\2\u046d"+
		"\u048d\7.\2\2\u046e\u046f\f\32\2\2\u046f\u0470\7D\2\2\u0470\u0472\7\""+
		"\2\2\u0471\u0473\5\u00ceh\2\u0472\u0471\3\2\2\2\u0472\u0473\3\2\2\2\u0473"+
		"\u0474\3\2\2\2\u0474\u048d\5\u00c6d\2\u0475\u0476\f\31\2\2\u0476\u0477"+
		"\7D\2\2\u0477\u0478\7+\2\2\u0478\u048d\5\u00d4k\2\u0479\u047a\f\30\2\2"+
		"\u047a\u047b\7D\2\2\u047b\u048d\5\u00ccg\2\u047c\u047d\f\27\2\2\u047d"+
		"\u047e\7@\2\2\u047e\u047f\5\u00b2Z\2\u047f\u0480\7A\2\2\u0480\u048d\3"+
		"\2\2\2\u0481\u0482\f\26\2\2\u0482\u0484\7<\2\2\u0483\u0485\5\u00acW\2"+
		"\u0484\u0483\3\2\2\2\u0484\u0485\3\2\2\2\u0485\u0486\3\2\2\2\u0486\u048d"+
		"\7=\2\2\u0487\u0488\f\23\2\2\u0488\u048d\t\16\2\2\u0489\u048a\f\f\2\2"+
		"\u048a\u048b\7\35\2\2\u048b\u048d\5P)\2\u048c\u0439\3\2\2\2\u048c\u043c"+
		"\3\2\2\2\u048c\u043f\3\2\2\2\u048c\u044a\3\2\2\2\u048c\u044d\3\2\2\2\u048c"+
		"\u0450\3\2\2\2\u048c\u0453\3\2\2\2\u048c\u0456\3\2\2\2\u048c\u0459\3\2"+
		"\2\2\u048c\u045c\3\2\2\2\u048c\u045f\3\2\2\2\u048c\u0465\3\2\2\2\u048c"+
		"\u0468\3\2\2\2\u048c\u046b\3\2\2\2\u048c\u046e\3\2\2\2\u048c\u0475\3\2"+
		"\2\2\u048c\u0479\3\2\2\2\u048c\u047c\3\2\2\2\u048c\u0481\3\2\2\2\u048c"+
		"\u0487\3\2\2\2\u048c\u0489\3\2\2\2\u048d\u0490\3\2\2\2\u048e\u048c\3\2"+
		"\2\2\u048e\u048f\3\2\2\2\u048f\u00b3\3\2\2\2\u0490\u048e\3\2\2\2\u0491"+
		"\u0492\5\u00b8]\2\u0492\u0493\5\u00b6\\\2\u0493\u0494\5\u00ba^\2\u0494"+
		"\u00b5\3\2\2\2\u0495\u0496\7\3\2\2\u0496\u00b7\3\2\2\2\u0497\u0499\7<"+
		"\2\2\u0498\u049a\5\u00bc_\2\u0499\u0498\3\2\2\2\u0499\u049a\3\2\2\2\u049a"+
		"\u049b\3\2\2\2\u049b\u049c\7=\2\2\u049c\u00b9\3\2\2\2\u049d\u049e\5\u0088"+
		"E\2\u049e\u00bb\3\2\2\2\u049f\u04a4\5\u00be`\2\u04a0\u04a1\5\u00be`\2"+
		"\u04a1\u04a2\5\u00bc_\2\u04a2\u04a4\3\2\2\2\u04a3\u049f\3\2\2\2\u04a3"+
		"\u04a0\3\2\2\2\u04a4\u00bd\3\2\2\2\u04a5\u04a9\7g\2\2\u04a6\u04a7\7C\2"+
		"\2\u04a7\u04a9\7g\2\2\u04a8\u04a5\3\2\2\2\u04a8\u04a6\3\2\2\2\u04a9\u00bf"+
		"\3\2\2\2\u04aa\u04ab\7<\2\2\u04ab\u04ac\5\u00b2Z\2\u04ac\u04ad\7=\2\2"+
		"\u04ad\u04c0\3\2\2\2\u04ae\u04c0\7.\2\2\u04af\u04c0\7+\2\2\u04b0\u04c0"+
		"\5j\66\2\u04b1\u04c0\7g\2\2\u04b2\u04b3\5P)\2\u04b3\u04b4\7D\2\2\u04b4"+
		"\u04b5\7\f\2\2\u04b5\u04c0\3\2\2\2\u04b6\u04b7\7\63\2\2\u04b7\u04b8\7"+
		"D\2\2\u04b8\u04c0\7\f\2\2\u04b9\u04bd\5\u00ceh\2\u04ba\u04be\5\u00d6l"+
		"\2\u04bb\u04bc\7.\2\2\u04bc\u04be\5\u00d8m\2\u04bd\u04ba\3\2\2\2\u04bd"+
		"\u04bb\3\2\2\2\u04be\u04c0\3\2\2\2\u04bf\u04aa\3\2\2\2\u04bf\u04ae\3\2"+
		"\2\2\u04bf\u04af\3\2\2\2\u04bf\u04b0\3\2\2\2\u04bf\u04b1\3\2\2\2\u04bf"+
		"\u04b2\3\2\2\2\u04bf\u04b6\3\2\2\2\u04bf\u04b9\3\2\2\2\u04c0\u00c1\3\2"+
		"\2\2\u04c1\u04c2\5\u00ceh\2\u04c2\u04c3\5\u00c4c\2\u04c3\u04c4\5\u00ca"+
		"f\2\u04c4\u04cb\3\2\2\2\u04c5\u04c8\5\u00c4c\2\u04c6\u04c9\5\u00c8e\2"+
		"\u04c7\u04c9\5\u00caf\2\u04c8\u04c6\3\2\2\2\u04c8\u04c7\3\2\2\2\u04c9"+
		"\u04cb\3\2\2\2\u04ca\u04c1\3\2\2\2\u04ca\u04c5\3\2\2\2\u04cb\u00c3\3\2"+
		"\2\2\u04cc\u04ce\7g\2\2\u04cd\u04cf\5\u00d0i\2\u04ce\u04cd\3\2\2\2\u04ce"+
		"\u04cf\3\2\2\2\u04cf\u04d7\3\2\2\2\u04d0\u04d1\7D\2\2\u04d1\u04d3\7g\2"+
		"\2\u04d2\u04d4\5\u00d0i\2\u04d3\u04d2\3\2\2\2\u04d3\u04d4\3\2\2\2\u04d4"+
		"\u04d6\3\2\2\2\u04d5\u04d0\3\2\2\2\u04d6\u04d9\3\2\2\2\u04d7\u04d5\3\2"+
		"\2\2\u04d7\u04d8\3\2\2\2\u04d8\u04dc\3\2\2\2\u04d9\u04d7\3\2\2\2\u04da"+
		"\u04dc\5T+\2\u04db\u04cc\3\2\2\2\u04db\u04da\3\2\2\2\u04dc\u00c5\3\2\2"+
		"\2\u04dd\u04df\7g\2\2\u04de\u04e0\5\u00d2j\2\u04df\u04de\3\2\2\2\u04df"+
		"\u04e0\3\2\2\2\u04e0\u04e1\3\2\2\2\u04e1\u04e2\5\u00caf\2\u04e2\u00c7"+
		"\3\2\2\2\u04e3\u04ff\7@\2\2\u04e4\u04e9\7A\2\2\u04e5\u04e6\7@\2\2\u04e6"+
		"\u04e8\7A\2\2\u04e7\u04e5\3\2\2\2\u04e8\u04eb\3\2\2\2\u04e9\u04e7\3\2"+
		"\2\2\u04e9\u04ea\3\2\2\2\u04ea\u04ec\3\2\2\2\u04eb\u04e9\3\2\2\2\u04ec"+
		"\u0500\5L\'\2\u04ed\u04ee\5\u00b2Z\2\u04ee\u04f5\7A\2\2\u04ef\u04f0\7"+
		"@\2\2\u04f0\u04f1\5\u00b2Z\2\u04f1\u04f2\7A\2\2\u04f2\u04f4\3\2\2\2\u04f3"+
		"\u04ef\3\2\2\2\u04f4\u04f7\3\2\2\2\u04f5\u04f3\3\2\2\2\u04f5\u04f6\3\2"+
		"\2\2\u04f6\u04fc\3\2\2\2\u04f7\u04f5\3\2\2\2\u04f8\u04f9\7@\2\2\u04f9"+
		"\u04fb\7A\2\2\u04fa\u04f8\3\2\2\2\u04fb\u04fe\3\2\2\2\u04fc\u04fa\3\2"+
		"\2\2\u04fc\u04fd\3\2\2\2\u04fd\u0500\3\2\2\2\u04fe\u04fc\3\2\2\2\u04ff"+
		"\u04e4\3\2\2\2\u04ff\u04ed\3\2\2\2\u0500\u00c9\3\2\2\2\u0501\u0503\5\u00d8"+
		"m\2\u0502\u0504\5&\24\2\u0503\u0502\3\2\2\2\u0503\u0504\3\2\2\2\u0504"+
		"\u00cb\3\2\2\2\u0505\u0506\5\u00ceh\2\u0506\u0507\5\u00d6l\2\u0507\u00cd"+
		"\3\2\2\2\u0508\u0509\7G\2\2\u0509\u050a\5$\23\2\u050a\u050b\7F\2\2\u050b"+
		"\u00cf\3\2\2\2\u050c\u050d\7G\2\2\u050d\u0510\7F\2\2\u050e\u0510\5V,\2"+
		"\u050f\u050c\3\2\2\2\u050f\u050e\3\2\2\2\u0510\u00d1\3\2\2\2\u0511\u0512"+
		"\7G\2\2\u0512\u0515\7F\2\2\u0513\u0515\5\u00ceh\2\u0514\u0511\3\2\2\2"+
		"\u0514\u0513\3\2\2\2\u0515\u00d3\3\2\2\2\u0516\u051d\5\u00d8m\2\u0517"+
		"\u0518\7D\2\2\u0518\u051a\7g\2\2\u0519\u051b\5\u00d8m\2\u051a\u0519\3"+
		"\2\2\2\u051a\u051b\3\2\2\2\u051b\u051d\3\2\2\2\u051c\u0516\3\2\2\2\u051c"+
		"\u0517\3\2\2\2\u051d\u00d5\3\2\2\2\u051e\u051f\7+\2\2\u051f\u0523\5\u00d4"+
		"k\2\u0520\u0521\7g\2\2\u0521\u0523\5\u00d8m\2\u0522\u051e\3\2\2\2\u0522"+
		"\u0520\3\2\2\2\u0523\u00d7\3\2\2\2\u0524\u0526\7<\2\2\u0525\u0527\5\u00ac"+
		"W\2\u0526\u0525\3\2\2\2\u0526\u0527\3\2\2\2\u0527\u0528\3\2\2\2\u0528"+
		"\u0529\7=\2\2\u0529\u00d9\3\2\2\2\u009a\u00db\u00e0\u00e6\u00ee\u00f7"+
		"\u00fc\u0103\u010a\u0111\u0118\u011d\u0121\u0125\u0129\u012e\u0132\u0136"+
		"\u0142\u014a\u0151\u0158\u015c\u015f\u0162\u016b\u0171\u0176\u0179\u017f"+
		"\u0185\u0189\u0192\u0199\u01a2\u01a9\u01af\u01b3\u01be\u01c2\u01ca\u01cf"+
		"\u01d3\u01dc\u01ea\u01ef\u01f8\u0200\u020a\u0212\u021a\u021f\u022b\u0231"+
		"\u0238\u023d\u0245\u0249\u024b\u0256\u025e\u0261\u0265\u026a\u026e\u0279"+
		"\u0282\u0284\u028b\u0290\u0299\u029e\u02a1\u02a6\u02af\u02bf\u02c9\u02cc"+
		"\u02d5\u02df\u02e7\u02ea\u02ed\u02fa\u0302\u0307\u030f\u0313\u0317\u031b"+
		"\u031d\u0321\u0327\u0332\u033a\u0342\u034d\u0356\u036d\u0370\u0373\u037b"+
		"\u037f\u0387\u038d\u0398\u03a1\u03a6\u03b0\u03b7\u03c4\u03cd\u03d6\u03dc"+
		"\u03e7\u03ec\u03f8\u03fc\u0400\u0404\u0406\u040a\u040f\u0422\u0437\u0447"+
		"\u0472\u0484\u048c\u048e\u0499\u04a3\u04a8\u04bd\u04bf\u04c8\u04ca\u04ce"+
		"\u04d3\u04d7\u04db\u04df\u04e9\u04f5\u04fc\u04ff\u0503\u050f\u0514\u051a"+
		"\u051c\u0522\u0526";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}