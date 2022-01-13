// Generated from cal.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class calParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Var=1, Const=2, Return=3, Integer=4, Boolean=5, Void=6, Main=7, If=8, 
		Else=9, True=10, False=11, While=12, Skip=13, SemiColon=14, Colon=15, 
		Comma=16, Lbrace=17, Rbrace=18, Lsb=19, RSb=20, Lb=21, Rb=22, MINUS=23, 
		PLUS=24, ASSIGNMENT=25, NEGATION=26, OR=27, AND=28, EQUAL=29, NOTEQUAL=30, 
		Less_Than=31, Less_ThanE=32, Greater=33, GreaterE=34, ID=35, NUMBER=36, 
		BOOLEAN=37, Multi_Comment=38, Single_Comment=39, WhiteSpace=40;
	public static final int
		RULE_prog = 0, RULE_decl_list = 1, RULE_decl = 2, RULE_var_decl = 3, RULE_const_decl = 4, 
		RULE_function_list = 5, RULE_function = 6, RULE_type = 7, RULE_param_list = 8, 
		RULE_nemp_parameter_list = 9, RULE_main = 10, RULE_statement_block = 11, 
		RULE_statement = 12, RULE_expression = 13, RULE_binary_arith_op = 14, 
		RULE_comp_op = 15, RULE_frgmnt = 16, RULE_condition = 17, RULE_arg_list = 18, 
		RULE_nemp_arg_list = 19, RULE_empty_statement = 20, RULE_empty_arg_list = 21;
	public static final String[] ruleNames = {
		"prog", "decl_list", "decl", "var_decl", "const_decl", "function_list", 
		"function", "type", "param_list", "nemp_parameter_list", "main", "statement_block", 
		"statement", "expression", "binary_arith_op", "comp_op", "frgmnt", "condition", 
		"arg_list", "nemp_arg_list", "empty_statement", "empty_arg_list"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "';'", "':'", "','", "'{'", "'}'", "'['", "']'", "'('", "')'", 
		"'-'", "'+'", "'='", "'~'", "'||'", "'&&'", "'=='", "'!='", "'<'", "'<='", 
		"'>'", "'>='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Var", "Const", "Return", "Integer", "Boolean", "Void", "Main", 
		"If", "Else", "True", "False", "While", "Skip", "SemiColon", "Colon", 
		"Comma", "Lbrace", "Rbrace", "Lsb", "RSb", "Lb", "Rb", "MINUS", "PLUS", 
		"ASSIGNMENT", "NEGATION", "OR", "AND", "EQUAL", "NOTEQUAL", "Less_Than", 
		"Less_ThanE", "Greater", "GreaterE", "ID", "NUMBER", "BOOLEAN", "Multi_Comment", 
		"Single_Comment", "WhiteSpace"
	};
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
	public String getGrammarFileName() { return "cal.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public calParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public Decl_listContext decl_list() {
			return getRuleContext(Decl_listContext.class,0);
		}
		public Function_listContext function_list() {
			return getRuleContext(Function_listContext.class,0);
		}
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calVisitor ) return ((calVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			decl_list();
			setState(45);
			function_list();
			setState(46);
			main();
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

	public static class Decl_listContext extends ParserRuleContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(calParser.SemiColon, 0); }
		public Decl_listContext decl_list() {
			return getRuleContext(Decl_listContext.class,0);
		}
		public Decl_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterDecl_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitDecl_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calVisitor ) return ((calVisitor<? extends T>)visitor).visitDecl_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decl_listContext decl_list() throws RecognitionException {
		Decl_listContext _localctx = new Decl_listContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decl_list);
		try {
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Var:
			case Const:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				decl();
				setState(49);
				match(SemiColon);
				setState(50);
				decl_list();
				}
				break;
			case Return:
			case Integer:
			case Boolean:
			case Void:
			case Main:
			case If:
			case While:
			case Skip:
			case Lbrace:
			case Rbrace:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class DeclContext extends ParserRuleContext {
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public Const_declContext const_decl() {
			return getRuleContext(Const_declContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calVisitor ) return ((calVisitor<? extends T>)visitor).visitDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl);
		try {
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Var:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				var_decl();
				}
				break;
			case Const:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				const_decl();
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

	public static class Var_declContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(calParser.Var, 0); }
		public TerminalNode ID() { return getToken(calParser.ID, 0); }
		public TerminalNode Colon() { return getToken(calParser.Colon, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitVar_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calVisitor ) return ((calVisitor<? extends T>)visitor).visitVar_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(Var);
			setState(60);
			match(ID);
			setState(61);
			match(Colon);
			setState(62);
			type();
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

	public static class Const_declContext extends ParserRuleContext {
		public TerminalNode Const() { return getToken(calParser.Const, 0); }
		public TerminalNode ID() { return getToken(calParser.ID, 0); }
		public TerminalNode Colon() { return getToken(calParser.Colon, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(calParser.ASSIGNMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Const_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterConst_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitConst_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calVisitor ) return ((calVisitor<? extends T>)visitor).visitConst_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Const_declContext const_decl() throws RecognitionException {
		Const_declContext _localctx = new Const_declContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_const_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(Const);
			setState(65);
			match(ID);
			setState(66);
			match(Colon);
			setState(67);
			type();
			setState(68);
			match(ASSIGNMENT);
			setState(69);
			expression();
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

	public static class Function_listContext extends ParserRuleContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public Function_listContext function_list() {
			return getRuleContext(Function_listContext.class,0);
		}
		public Function_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterFunction_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitFunction_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calVisitor ) return ((calVisitor<? extends T>)visitor).visitFunction_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_listContext function_list() throws RecognitionException {
		Function_listContext _localctx = new Function_listContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_function_list);
		try {
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Integer:
			case Boolean:
			case Void:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				function();
				setState(72);
				function_list();
				}
				break;
			case Main:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class FunctionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(calParser.ID, 0); }
		public List<TerminalNode> Lb() { return getTokens(calParser.Lb); }
		public TerminalNode Lb(int i) {
			return getToken(calParser.Lb, i);
		}
		public Param_listContext param_list() {
			return getRuleContext(Param_listContext.class,0);
		}
		public List<TerminalNode> Rb() { return getTokens(calParser.Rb); }
		public TerminalNode Rb(int i) {
			return getToken(calParser.Rb, i);
		}
		public TerminalNode Lbrace() { return getToken(calParser.Lbrace, 0); }
		public Decl_listContext decl_list() {
			return getRuleContext(Decl_listContext.class,0);
		}
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public TerminalNode Return() { return getToken(calParser.Return, 0); }
		public TerminalNode SemiColon() { return getToken(calParser.SemiColon, 0); }
		public TerminalNode Rbrace() { return getToken(calParser.Rbrace, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calVisitor ) return ((calVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			type();
			setState(78);
			match(ID);
			setState(79);
			match(Lb);
			setState(80);
			param_list();
			setState(81);
			match(Rb);
			setState(82);
			match(Lbrace);
			setState(83);
			decl_list();
			setState(84);
			statement_block();
			setState(85);
			match(Return);
			setState(86);
			match(Lb);
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case True:
			case False:
			case Lb:
			case MINUS:
			case ID:
			case NUMBER:
				{
				setState(87);
				expression();
				}
				break;
			case Rb:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(91);
			match(Rb);
			setState(92);
			match(SemiColon);
			setState(93);
			match(Rbrace);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode Integer() { return getToken(calParser.Integer, 0); }
		public TerminalNode Boolean() { return getToken(calParser.Boolean, 0); }
		public TerminalNode Void() { return getToken(calParser.Void, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calVisitor ) return ((calVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Integer) | (1L << Boolean) | (1L << Void))) != 0)) ) {
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

	public static class Param_listContext extends ParserRuleContext {
		public Nemp_parameter_listContext nemp_parameter_list() {
			return getRuleContext(Nemp_parameter_listContext.class,0);
		}
		public Param_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterParam_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitParam_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calVisitor ) return ((calVisitor<? extends T>)visitor).visitParam_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_listContext param_list() throws RecognitionException {
		Param_listContext _localctx = new Param_listContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_param_list);
		try {
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				nemp_parameter_list();
				}
				break;
			case Rb:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Nemp_parameter_listContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(calParser.ID, 0); }
		public TerminalNode Colon() { return getToken(calParser.Colon, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Comma() { return getToken(calParser.Comma, 0); }
		public Nemp_parameter_listContext nemp_parameter_list() {
			return getRuleContext(Nemp_parameter_listContext.class,0);
		}
		public Nemp_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nemp_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterNemp_parameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitNemp_parameter_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calVisitor ) return ((calVisitor<? extends T>)visitor).visitNemp_parameter_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nemp_parameter_listContext nemp_parameter_list() throws RecognitionException {
		Nemp_parameter_listContext _localctx = new Nemp_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_nemp_parameter_list);
		try {
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				match(ID);
				setState(102);
				match(Colon);
				setState(103);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				match(ID);
				setState(105);
				match(Colon);
				setState(106);
				type();
				setState(107);
				match(Comma);
				setState(108);
				nemp_parameter_list();
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

	public static class MainContext extends ParserRuleContext {
		public TerminalNode Main() { return getToken(calParser.Main, 0); }
		public TerminalNode Lbrace() { return getToken(calParser.Lbrace, 0); }
		public Decl_listContext decl_list() {
			return getRuleContext(Decl_listContext.class,0);
		}
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public TerminalNode Rbrace() { return getToken(calParser.Rbrace, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calVisitor ) return ((calVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(Main);
			setState(113);
			match(Lbrace);
			setState(114);
			decl_list();
			setState(115);
			statement_block();
			setState(116);
			match(Rbrace);
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

	public static class Statement_blockContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public Empty_statementContext empty_statement() {
			return getRuleContext(Empty_statementContext.class,0);
		}
		public Statement_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterStatement_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitStatement_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calVisitor ) return ((calVisitor<? extends T>)visitor).visitStatement_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_blockContext statement_block() throws RecognitionException {
		Statement_blockContext _localctx = new Statement_blockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statement_block);
		try {
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case If:
			case While:
			case Skip:
			case Lbrace:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				statement();
				setState(119);
				statement_block();
				}
				break;
			case Return:
			case Rbrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				empty_statement();
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

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(calParser.ID, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(calParser.ASSIGNMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(calParser.SemiColon, 0); }
		public Arg_listContext arg_list() {
			return getRuleContext(Arg_listContext.class,0);
		}
		public List<TerminalNode> Lbrace() { return getTokens(calParser.Lbrace); }
		public TerminalNode Lbrace(int i) {
			return getToken(calParser.Lbrace, i);
		}
		public List<Statement_blockContext> statement_block() {
			return getRuleContexts(Statement_blockContext.class);
		}
		public Statement_blockContext statement_block(int i) {
			return getRuleContext(Statement_blockContext.class,i);
		}
		public List<TerminalNode> Rbrace() { return getTokens(calParser.Rbrace); }
		public TerminalNode Rbrace(int i) {
			return getToken(calParser.Rbrace, i);
		}
		public TerminalNode If() { return getToken(calParser.If, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode Else() { return getToken(calParser.Else, 0); }
		public TerminalNode While() { return getToken(calParser.While, 0); }
		public TerminalNode Skip() { return getToken(calParser.Skip, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calVisitor ) return ((calVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_statement);
		try {
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(ID);
				setState(125);
				match(ASSIGNMENT);
				setState(126);
				expression();
				setState(127);
				match(SemiColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				match(ID);
				{
				setState(130);
				arg_list();
				}
				setState(131);
				match(SemiColon);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(133);
				match(Lbrace);
				setState(134);
				statement_block();
				setState(135);
				match(Rbrace);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(137);
				match(If);
				setState(138);
				condition(0);
				setState(139);
				match(Lbrace);
				setState(140);
				statement_block();
				setState(141);
				match(Rbrace);
				setState(142);
				match(Else);
				setState(143);
				match(Lbrace);
				setState(144);
				statement_block();
				setState(145);
				match(Rbrace);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(147);
				match(While);
				setState(148);
				condition(0);
				setState(149);
				match(Lbrace);
				setState(150);
				statement_block();
				setState(151);
				match(Rbrace);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(153);
				match(Skip);
				setState(154);
				match(SemiColon);
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<FrgmntContext> frgmnt() {
			return getRuleContexts(FrgmntContext.class);
		}
		public FrgmntContext frgmnt(int i) {
			return getRuleContext(FrgmntContext.class,i);
		}
		public Binary_arith_opContext binary_arith_op() {
			return getRuleContext(Binary_arith_opContext.class,0);
		}
		public TerminalNode Lb() { return getToken(calParser.Lb, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Rb() { return getToken(calParser.Rb, 0); }
		public TerminalNode ID() { return getToken(calParser.ID, 0); }
		public Arg_listContext arg_list() {
			return getRuleContext(Arg_listContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calVisitor ) return ((calVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expression);
		try {
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				frgmnt(0);
				setState(158);
				binary_arith_op();
				setState(159);
				frgmnt(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				match(Lb);
				setState(162);
				expression();
				setState(163);
				match(Rb);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(165);
				match(ID);
				setState(166);
				match(Lb);
				setState(167);
				arg_list();
				setState(168);
				match(Rb);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(170);
				frgmnt(0);
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

	public static class Binary_arith_opContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(calParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(calParser.MINUS, 0); }
		public Binary_arith_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_arith_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterBinary_arith_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitBinary_arith_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calVisitor ) return ((calVisitor<? extends T>)visitor).visitBinary_arith_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binary_arith_opContext binary_arith_op() throws RecognitionException {
		Binary_arith_opContext _localctx = new Binary_arith_opContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_binary_arith_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_la = _input.LA(1);
			if ( !(_la==MINUS || _la==PLUS) ) {
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

	public static class Comp_opContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(calParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(calParser.NOTEQUAL, 0); }
		public TerminalNode Less_Than() { return getToken(calParser.Less_Than, 0); }
		public TerminalNode Less_ThanE() { return getToken(calParser.Less_ThanE, 0); }
		public TerminalNode Greater() { return getToken(calParser.Greater, 0); }
		public TerminalNode GreaterE() { return getToken(calParser.GreaterE, 0); }
		public Comp_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterComp_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitComp_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calVisitor ) return ((calVisitor<? extends T>)visitor).visitComp_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comp_opContext comp_op() throws RecognitionException {
		Comp_opContext _localctx = new Comp_opContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_comp_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NOTEQUAL) | (1L << Less_Than) | (1L << Less_ThanE) | (1L << Greater) | (1L << GreaterE))) != 0)) ) {
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

	public static class FrgmntContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(calParser.ID, 0); }
		public TerminalNode MINUS() { return getToken(calParser.MINUS, 0); }
		public TerminalNode NUMBER() { return getToken(calParser.NUMBER, 0); }
		public TerminalNode True() { return getToken(calParser.True, 0); }
		public TerminalNode False() { return getToken(calParser.False, 0); }
		public TerminalNode Lb() { return getToken(calParser.Lb, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Rb() { return getToken(calParser.Rb, 0); }
		public Arg_listContext arg_list() {
			return getRuleContext(Arg_listContext.class,0);
		}
		public List<FrgmntContext> frgmnt() {
			return getRuleContexts(FrgmntContext.class);
		}
		public FrgmntContext frgmnt(int i) {
			return getRuleContext(FrgmntContext.class,i);
		}
		public Binary_arith_opContext binary_arith_op() {
			return getRuleContext(Binary_arith_opContext.class,0);
		}
		public FrgmntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frgmnt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterFrgmnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitFrgmnt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calVisitor ) return ((calVisitor<? extends T>)visitor).visitFrgmnt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FrgmntContext frgmnt() throws RecognitionException {
		return frgmnt(0);
	}

	private FrgmntContext frgmnt(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FrgmntContext _localctx = new FrgmntContext(_ctx, _parentState);
		FrgmntContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_frgmnt, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(178);
				match(ID);
				}
				break;
			case 2:
				{
				setState(179);
				match(MINUS);
				setState(180);
				match(ID);
				}
				break;
			case 3:
				{
				setState(181);
				match(NUMBER);
				}
				break;
			case 4:
				{
				setState(182);
				match(True);
				}
				break;
			case 5:
				{
				setState(183);
				match(False);
				}
				break;
			case 6:
				{
				setState(184);
				match(Lb);
				setState(185);
				expression();
				setState(186);
				match(Rb);
				}
				break;
			case 7:
				{
				setState(188);
				match(ID);
				setState(189);
				match(Lb);
				setState(190);
				arg_list();
				setState(191);
				match(Rb);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(201);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FrgmntContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_frgmnt);
					setState(195);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(196);
					binary_arith_op();
					setState(197);
					frgmnt(4);
					}
					} 
				}
				setState(203);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode NEGATION() { return getToken(calParser.NEGATION, 0); }
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode Lb() { return getToken(calParser.Lb, 0); }
		public TerminalNode Rb() { return getToken(calParser.Rb, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Comp_opContext comp_op() {
			return getRuleContext(Comp_opContext.class,0);
		}
		public TerminalNode OR() { return getToken(calParser.OR, 0); }
		public TerminalNode AND() { return getToken(calParser.AND, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calVisitor ) return ((calVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		return condition(0);
	}

	private ConditionContext condition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionContext _localctx = new ConditionContext(_ctx, _parentState);
		ConditionContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_condition, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(205);
				match(NEGATION);
				setState(206);
				condition(4);
				}
				break;
			case 2:
				{
				setState(207);
				match(Lb);
				setState(208);
				condition(0);
				setState(209);
				match(Rb);
				}
				break;
			case 3:
				{
				setState(211);
				expression();
				setState(212);
				comp_op();
				setState(213);
				expression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(222);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_condition);
					setState(217);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(218);
					_la = _input.LA(1);
					if ( !(_la==OR || _la==AND) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(219);
					condition(2);
					}
					} 
				}
				setState(224);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class Arg_listContext extends ParserRuleContext {
		public Nemp_arg_listContext nemp_arg_list() {
			return getRuleContext(Nemp_arg_listContext.class,0);
		}
		public Empty_arg_listContext empty_arg_list() {
			return getRuleContext(Empty_arg_listContext.class,0);
		}
		public Arg_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterArg_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitArg_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calVisitor ) return ((calVisitor<? extends T>)visitor).visitArg_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arg_listContext arg_list() throws RecognitionException {
		Arg_listContext _localctx = new Arg_listContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_arg_list);
		try {
			setState(227);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				nemp_arg_list();
				}
				break;
			case SemiColon:
			case Rb:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				empty_arg_list();
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

	public static class Nemp_arg_listContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(calParser.ID, 0); }
		public TerminalNode Comma() { return getToken(calParser.Comma, 0); }
		public Nemp_arg_listContext nemp_arg_list() {
			return getRuleContext(Nemp_arg_listContext.class,0);
		}
		public Nemp_arg_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nemp_arg_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterNemp_arg_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitNemp_arg_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calVisitor ) return ((calVisitor<? extends T>)visitor).visitNemp_arg_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nemp_arg_listContext nemp_arg_list() throws RecognitionException {
		Nemp_arg_listContext _localctx = new Nemp_arg_listContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_nemp_arg_list);
		try {
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				match(ID);
				setState(231);
				match(Comma);
				setState(232);
				nemp_arg_list();
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

	public static class Empty_statementContext extends ParserRuleContext {
		public Empty_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_empty_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterEmpty_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitEmpty_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calVisitor ) return ((calVisitor<? extends T>)visitor).visitEmpty_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Empty_statementContext empty_statement() throws RecognitionException {
		Empty_statementContext _localctx = new Empty_statementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_empty_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class Empty_arg_listContext extends ParserRuleContext {
		public Empty_arg_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_empty_arg_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterEmpty_arg_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitEmpty_arg_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calVisitor ) return ((calVisitor<? extends T>)visitor).visitEmpty_arg_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Empty_arg_listContext empty_arg_list() throws RecognitionException {
		Empty_arg_listContext _localctx = new Empty_arg_listContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_empty_arg_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
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
		case 16:
			return frgmnt_sempred((FrgmntContext)_localctx, predIndex);
		case 17:
			return condition_sempred((ConditionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean frgmnt_sempred(FrgmntContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u00f2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\5\38\n\3\3\4\3\4\5\4<\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7N\n\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\5\b\\\n\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\5\n"+
		"f\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13q\n\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\5\r}\n\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u009e\n\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\u00ae\n\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00c4\n\22\3\22\3\22"+
		"\3\22\3\22\7\22\u00ca\n\22\f\22\16\22\u00cd\13\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00da\n\23\3\23\3\23\3\23\7\23"+
		"\u00df\n\23\f\23\16\23\u00e2\13\23\3\24\3\24\5\24\u00e6\n\24\3\25\3\25"+
		"\3\25\3\25\5\25\u00ec\n\25\3\26\3\26\3\27\3\27\3\27\2\4\"$\30\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\6\3\2\6\b\3\2\31\32\3\2\37$"+
		"\3\2\35\36\2\u00f6\2.\3\2\2\2\4\67\3\2\2\2\6;\3\2\2\2\b=\3\2\2\2\nB\3"+
		"\2\2\2\fM\3\2\2\2\16O\3\2\2\2\20a\3\2\2\2\22e\3\2\2\2\24p\3\2\2\2\26r"+
		"\3\2\2\2\30|\3\2\2\2\32\u009d\3\2\2\2\34\u00ad\3\2\2\2\36\u00af\3\2\2"+
		"\2 \u00b1\3\2\2\2\"\u00c3\3\2\2\2$\u00d9\3\2\2\2&\u00e5\3\2\2\2(\u00eb"+
		"\3\2\2\2*\u00ed\3\2\2\2,\u00ef\3\2\2\2./\5\4\3\2/\60\5\f\7\2\60\61\5\26"+
		"\f\2\61\3\3\2\2\2\62\63\5\6\4\2\63\64\7\20\2\2\64\65\5\4\3\2\658\3\2\2"+
		"\2\668\3\2\2\2\67\62\3\2\2\2\67\66\3\2\2\28\5\3\2\2\29<\5\b\5\2:<\5\n"+
		"\6\2;9\3\2\2\2;:\3\2\2\2<\7\3\2\2\2=>\7\3\2\2>?\7%\2\2?@\7\21\2\2@A\5"+
		"\20\t\2A\t\3\2\2\2BC\7\4\2\2CD\7%\2\2DE\7\21\2\2EF\5\20\t\2FG\7\33\2\2"+
		"GH\5\34\17\2H\13\3\2\2\2IJ\5\16\b\2JK\5\f\7\2KN\3\2\2\2LN\3\2\2\2MI\3"+
		"\2\2\2ML\3\2\2\2N\r\3\2\2\2OP\5\20\t\2PQ\7%\2\2QR\7\27\2\2RS\5\22\n\2"+
		"ST\7\30\2\2TU\7\23\2\2UV\5\4\3\2VW\5\30\r\2WX\7\5\2\2X[\7\27\2\2Y\\\5"+
		"\34\17\2Z\\\3\2\2\2[Y\3\2\2\2[Z\3\2\2\2\\]\3\2\2\2]^\7\30\2\2^_\7\20\2"+
		"\2_`\7\24\2\2`\17\3\2\2\2ab\t\2\2\2b\21\3\2\2\2cf\5\24\13\2df\3\2\2\2"+
		"ec\3\2\2\2ed\3\2\2\2f\23\3\2\2\2gh\7%\2\2hi\7\21\2\2iq\5\20\t\2jk\7%\2"+
		"\2kl\7\21\2\2lm\5\20\t\2mn\7\22\2\2no\5\24\13\2oq\3\2\2\2pg\3\2\2\2pj"+
		"\3\2\2\2q\25\3\2\2\2rs\7\t\2\2st\7\23\2\2tu\5\4\3\2uv\5\30\r\2vw\7\24"+
		"\2\2w\27\3\2\2\2xy\5\32\16\2yz\5\30\r\2z}\3\2\2\2{}\5*\26\2|x\3\2\2\2"+
		"|{\3\2\2\2}\31\3\2\2\2~\177\7%\2\2\177\u0080\7\33\2\2\u0080\u0081\5\34"+
		"\17\2\u0081\u0082\7\20\2\2\u0082\u009e\3\2\2\2\u0083\u0084\7%\2\2\u0084"+
		"\u0085\5&\24\2\u0085\u0086\7\20\2\2\u0086\u009e\3\2\2\2\u0087\u0088\7"+
		"\23\2\2\u0088\u0089\5\30\r\2\u0089\u008a\7\24\2\2\u008a\u009e\3\2\2\2"+
		"\u008b\u008c\7\n\2\2\u008c\u008d\5$\23\2\u008d\u008e\7\23\2\2\u008e\u008f"+
		"\5\30\r\2\u008f\u0090\7\24\2\2\u0090\u0091\7\13\2\2\u0091\u0092\7\23\2"+
		"\2\u0092\u0093\5\30\r\2\u0093\u0094\7\24\2\2\u0094\u009e\3\2\2\2\u0095"+
		"\u0096\7\16\2\2\u0096\u0097\5$\23\2\u0097\u0098\7\23\2\2\u0098\u0099\5"+
		"\30\r\2\u0099\u009a\7\24\2\2\u009a\u009e\3\2\2\2\u009b\u009c\7\17\2\2"+
		"\u009c\u009e\7\20\2\2\u009d~\3\2\2\2\u009d\u0083\3\2\2\2\u009d\u0087\3"+
		"\2\2\2\u009d\u008b\3\2\2\2\u009d\u0095\3\2\2\2\u009d\u009b\3\2\2\2\u009e"+
		"\33\3\2\2\2\u009f\u00a0\5\"\22\2\u00a0\u00a1\5\36\20\2\u00a1\u00a2\5\""+
		"\22\2\u00a2\u00ae\3\2\2\2\u00a3\u00a4\7\27\2\2\u00a4\u00a5\5\34\17\2\u00a5"+
		"\u00a6\7\30\2\2\u00a6\u00ae\3\2\2\2\u00a7\u00a8\7%\2\2\u00a8\u00a9\7\27"+
		"\2\2\u00a9\u00aa\5&\24\2\u00aa\u00ab\7\30\2\2\u00ab\u00ae\3\2\2\2\u00ac"+
		"\u00ae\5\"\22\2\u00ad\u009f\3\2\2\2\u00ad\u00a3\3\2\2\2\u00ad\u00a7\3"+
		"\2\2\2\u00ad\u00ac\3\2\2\2\u00ae\35\3\2\2\2\u00af\u00b0\t\3\2\2\u00b0"+
		"\37\3\2\2\2\u00b1\u00b2\t\4\2\2\u00b2!\3\2\2\2\u00b3\u00b4\b\22\1\2\u00b4"+
		"\u00c4\7%\2\2\u00b5\u00b6\7\31\2\2\u00b6\u00c4\7%\2\2\u00b7\u00c4\7&\2"+
		"\2\u00b8\u00c4\7\f\2\2\u00b9\u00c4\7\r\2\2\u00ba\u00bb\7\27\2\2\u00bb"+
		"\u00bc\5\34\17\2\u00bc\u00bd\7\30\2\2\u00bd\u00c4\3\2\2\2\u00be\u00bf"+
		"\7%\2\2\u00bf\u00c0\7\27\2\2\u00c0\u00c1\5&\24\2\u00c1\u00c2\7\30\2\2"+
		"\u00c2\u00c4\3\2\2\2\u00c3\u00b3\3\2\2\2\u00c3\u00b5\3\2\2\2\u00c3\u00b7"+
		"\3\2\2\2\u00c3\u00b8\3\2\2\2\u00c3\u00b9\3\2\2\2\u00c3\u00ba\3\2\2\2\u00c3"+
		"\u00be\3\2\2\2\u00c4\u00cb\3\2\2\2\u00c5\u00c6\f\5\2\2\u00c6\u00c7\5\36"+
		"\20\2\u00c7\u00c8\5\"\22\6\u00c8\u00ca\3\2\2\2\u00c9\u00c5\3\2\2\2\u00ca"+
		"\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc#\3\2\2\2"+
		"\u00cd\u00cb\3\2\2\2\u00ce\u00cf\b\23\1\2\u00cf\u00d0\7\34\2\2\u00d0\u00da"+
		"\5$\23\6\u00d1\u00d2\7\27\2\2\u00d2\u00d3\5$\23\2\u00d3\u00d4\7\30\2\2"+
		"\u00d4\u00da\3\2\2\2\u00d5\u00d6\5\34\17\2\u00d6\u00d7\5 \21\2\u00d7\u00d8"+
		"\5\34\17\2\u00d8\u00da\3\2\2\2\u00d9\u00ce\3\2\2\2\u00d9\u00d1\3\2\2\2"+
		"\u00d9\u00d5\3\2\2\2\u00da\u00e0\3\2\2\2\u00db\u00dc\f\3\2\2\u00dc\u00dd"+
		"\t\5\2\2\u00dd\u00df\5$\23\4\u00de\u00db\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0"+
		"\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1%\3\2\2\2\u00e2\u00e0\3\2\2\2"+
		"\u00e3\u00e6\5(\25\2\u00e4\u00e6\5,\27\2\u00e5\u00e3\3\2\2\2\u00e5\u00e4"+
		"\3\2\2\2\u00e6\'\3\2\2\2\u00e7\u00ec\7%\2\2\u00e8\u00e9\7%\2\2\u00e9\u00ea"+
		"\7\22\2\2\u00ea\u00ec\5(\25\2\u00eb\u00e7\3\2\2\2\u00eb\u00e8\3\2\2\2"+
		"\u00ec)\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee+\3\2\2\2\u00ef\u00f0\3\2\2\2"+
		"\u00f0-\3\2\2\2\21\67;M[ep|\u009d\u00ad\u00c3\u00cb\u00d9\u00e0\u00e5"+
		"\u00eb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}