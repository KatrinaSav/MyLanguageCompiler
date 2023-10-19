package pack;// Generated from java-escape by ANTLR 4.11.1

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class grammaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AND=1, OR=2, NOT=3, EQ=4, COMPARE=5, EQGR=6, EQLT=7, INCR=8, DECR=9, COMMA=10, 
		SEMI=11, DOT=12, LPAREN=13, RPAREN=14, LCURLY=15, RCURLY=16, LANGLE=17, 
		RANGLE=18, QUOTES=19, DOC=20, ND=21, TXT=22, STRING=23, PLUS=24, MINUS=25, 
		MULT=26, DEVISION=27, LSQUARE=28, RSQUARE=29, COLON=30, NUMBER=31, DOCUMENT=32, 
		NODE=33, ATTR=34, TEXT=35, BOOL=36, YES=37, NO=38, IF=39, FOR=40, THEN=41, 
		ELSE=42, START=43, VALUE=44, NAME=45, INTEXT=46, SETROOT=47, GETROOT=48, 
		RETURN=49, WHILE=50, UNTIL=51, EDIT=52, FIND=53, END=54, DO=55, CHILDREN=56, 
		ATTRS=57, READ=58, WRITE=59, ID=60, INT=61, TAB=62, N=63, WSS=64, WS=65;
	public static final int
		RULE_program = 0, RULE_stat = 1, RULE_math = 2, RULE_expr = 3, RULE_const = 4, 
		RULE_func = 5, RULE_return = 6, RULE_call = 7, RULE_cast = 8, RULE_infunc = 9, 
		RULE_funcname = 10, RULE_par = 11, RULE_comand = 12, RULE_if = 13, RULE_else = 14, 
		RULE_part = 15, RULE_for = 16, RULE_binary = 17, RULE_in = 18, RULE_out = 19, 
		RULE_boolexpr = 20, RULE_while = 21, RULE_until = 22, RULE_type = 23, 
		RULE_chindex = 24, RULE_atindex = 25, RULE_assign = 26, RULE_action = 27, 
		RULE_form = 28, RULE_allindex = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stat", "math", "expr", "const", "func", "return", "call", 
			"cast", "infunc", "funcname", "par", "comand", "if", "else", "part", 
			"for", "binary", "in", "out", "boolexpr", "while", "until", "type", "chindex", 
			"atindex", "assign", "action", "form", "allindex"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'and'", "'or'", "'!='", "'='", "'=='", "'>='", "'<='", "'>>'", 
			"'<<'", "','", "';'", "'.'", "'('", "')'", "'{'", "'}'", "'<'", "'>'", 
			"'\"'", "'doc'", "'nd'", "'txt'", null, "'+'", "'-'", "'*'", "'/'", "'['", 
			"']'", "':'", "'number'", "'document'", "'node'", "'attribute'", "'text'", 
			"'bool'", "'yes'", "'net'", "'if'", "'for'", "'then'", "'else'", "'Start'", 
			"'value'", "'name'", "'in_text'", "'set_root'", "'get_root'", "'return'", 
			"'while'", "'until'", "'edit'", "'find'", "'end'", "'do'", "'children'", 
			"'attributes'", "'read'", "'write'", null, null, null, null, "'\\r'", 
			"' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AND", "OR", "NOT", "EQ", "COMPARE", "EQGR", "EQLT", "INCR", "DECR", 
			"COMMA", "SEMI", "DOT", "LPAREN", "RPAREN", "LCURLY", "RCURLY", "LANGLE", 
			"RANGLE", "QUOTES", "DOC", "ND", "TXT", "STRING", "PLUS", "MINUS", "MULT", 
			"DEVISION", "LSQUARE", "RSQUARE", "COLON", "NUMBER", "DOCUMENT", "NODE", 
			"ATTR", "TEXT", "BOOL", "YES", "NO", "IF", "FOR", "THEN", "ELSE", "START", 
			"VALUE", "NAME", "INTEXT", "SETROOT", "GETROOT", "RETURN", "WHILE", "UNTIL", 
			"EDIT", "FIND", "END", "DO", "CHILDREN", "ATTRS", "READ", "WRITE", "ID", 
			"INT", "TAB", "N", "WSS", "WS"
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public grammaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode START() { return getToken(grammaParser.START, 0); }
		public TerminalNode COLON() { return getToken(grammaParser.COLON, 0); }
		public List<TerminalNode> N() { return getTokens(grammaParser.N); }
		public TerminalNode N(int i) {
			return getToken(grammaParser.N, i);
		}
		public TerminalNode EOF() { return getToken(grammaParser.EOF, 0); }
		public List<FuncContext> func() {
			return getRuleContexts(FuncContext.class);
		}
		public FuncContext func(int i) {
			return getRuleContext(FuncContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(grammaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(grammaParser.ID, i);
		}
		public List<TerminalNode> EQ() { return getTokens(grammaParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(grammaParser.EQ, i);
		}
		public List<ConstContext> const_() {
			return getRuleContexts(ConstContext.class);
		}
		public ConstContext const_(int i) {
			return getRuleContext(ConstContext.class,i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammaListener ) ((grammaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammaListener ) ((grammaListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammaVisitor ) return ((grammaVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 135291469824L) != 0) {
				{
				{
				setState(60);
				func();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(66);
				match(ID);
				setState(67);
				match(EQ);
				setState(68);
				const_();
				setState(69);
				match(N);
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76);
			match(START);
			setState(77);
			match(COLON);
			setState(78);
			match(N);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAB) {
				{
				{
				setState(79);
				stat();
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatContext extends ParserRuleContext {
		public TerminalNode N() { return getToken(grammaParser.N, 0); }
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public List<TerminalNode> TAB() { return getTokens(grammaParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(grammaParser.TAB, i);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammaListener ) ((grammaListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammaListener ) ((grammaListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammaVisitor ) return ((grammaVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(87);
				match(TAB);
				}
				}
				setState(90); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TAB );
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(92);
				assign();
				}
				break;
			case 2:
				{
				setState(93);
				action();
				}
				break;
			}
			setState(96);
			match(N);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MathContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(grammaParser.ID, 0); }
		public TerminalNode INCR() { return getToken(grammaParser.INCR, 0); }
		public TerminalNode DECR() { return getToken(grammaParser.DECR, 0); }
		public MathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammaListener ) ((grammaListener)listener).enterMath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammaListener ) ((grammaListener)listener).exitMath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammaVisitor ) {
				try {
					return ((grammaVisitor<? extends T>)visitor).visitMath(this);
				} catch (Exception e) {
					throw new RuntimeException(e.getMessage());
				}
			}
			else return visitor.visitChildren(this);
		}
	}

	public final MathContext math() throws RecognitionException {
		MathContext _localctx = new MathContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_math);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(ID);
			setState(99);
			_la = _input.LA(1);
			if ( !(_la==INCR || _la==DECR) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public FormContext form() {
			return getRuleContext(FormContext.class,0);
		}
		public ParContext par() {
			return getRuleContext(ParContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BinaryContext binary() {
			return getRuleContext(BinaryContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammaListener ) ((grammaListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammaListener ) ((grammaListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammaVisitor ) {
				try {
					return ((grammaVisitor<? extends T>)visitor).visitExpr(this);
				} catch (Exception e) {
					throw new RuntimeException(e.getMessage());
				}
			}
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCURLY:
			case LANGLE:
			case DOC:
			case ND:
			case TXT:
			case STRING:
			case LSQUARE:
			case YES:
			case NO:
			case ID:
			case INT:
				{
				setState(102);
				form();
				}
				break;
			case LPAREN:
				{
				setState(103);
				par();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(112);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(106);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(107);
					binary();
					setState(108);
					expr(4);
					}
					} 
				}
				setState(114);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstContext extends ParserRuleContext {
		public Token d;
		public Token n;
		public Token a;
		public Token s;
		public Token i;
		public TerminalNode RCURLY() { return getToken(grammaParser.RCURLY, 0); }
		public TerminalNode LCURLY() { return getToken(grammaParser.LCURLY, 0); }
		public List<TerminalNode> STRING() { return getTokens(grammaParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(grammaParser.STRING, i);
		}
		public List<TerminalNode> ID() { return getTokens(grammaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(grammaParser.ID, i);
		}
		public TerminalNode COLON() { return getToken(grammaParser.COLON, 0); }
		public TerminalNode RSQUARE() { return getToken(grammaParser.RSQUARE, 0); }
		public TerminalNode LSQUARE() { return getToken(grammaParser.LSQUARE, 0); }
		public TerminalNode RANGLE() { return getToken(grammaParser.RANGLE, 0); }
		public TerminalNode LANGLE() { return getToken(grammaParser.LANGLE, 0); }
		public TerminalNode INT() { return getToken(grammaParser.INT, 0); }
		public TerminalNode YES() { return getToken(grammaParser.YES, 0); }
		public TerminalNode NO() { return getToken(grammaParser.NO, 0); }
		public ConstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammaListener ) ((grammaListener)listener).enterConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammaListener ) ((grammaListener)listener).exitConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammaVisitor ) {
				try {
					return ((grammaVisitor<? extends T>)visitor).visitConst(this);
				} catch (Exception e) {
					throw new RuntimeException(e.getMessage());
				}
			}
			else return visitor.visitChildren(this);
		}
	}

	public final ConstContext const_() throws RecognitionException {
		ConstContext _localctx = new ConstContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_const);
		int _la;
		try {
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCURLY:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				((ConstContext)_localctx).d = match(LCURLY);
				setState(116);
				_la = _input.LA(1);
				if ( !(_la==STRING || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(117);
				match(RCURLY);
				}
				break;
			case LSQUARE:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				((ConstContext)_localctx).n = match(LSQUARE);
				setState(119);
				_la = _input.LA(1);
				if ( !(_la==STRING || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(120);
				match(COLON);
				setState(121);
				_la = _input.LA(1);
				if ( !(_la==STRING || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(122);
				match(RSQUARE);
				}
				break;
			case LANGLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(123);
				((ConstContext)_localctx).a = match(LANGLE);
				setState(124);
				_la = _input.LA(1);
				if ( !(_la==STRING || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(125);
				match(COLON);
				setState(126);
				_la = _input.LA(1);
				if ( !(_la==STRING || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(127);
				match(RANGLE);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(128);
				((ConstContext)_localctx).s = match(STRING);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 5);
				{
				setState(129);
				((ConstContext)_localctx).i = match(INT);
				}
				break;
			case YES:
				enterOuterAlt(_localctx, 6);
				{
				setState(130);
				match(YES);
				}
				break;
			case NO:
				enterOuterAlt(_localctx, 7);
				{
				setState(131);
				match(NO);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(grammaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(grammaParser.ID, i);
		}
		public TerminalNode LPAREN() { return getToken(grammaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(grammaParser.RPAREN, 0); }
		public TerminalNode N() { return getToken(grammaParser.N, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(grammaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(grammaParser.COMMA, i);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammaListener ) ((grammaListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammaListener ) ((grammaListener)listener).exitFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammaVisitor ) {
				try {
					return ((grammaVisitor<? extends T>)visitor).visitFunc(this);
				} catch (Exception e) {
					throw new RuntimeException(e.getMessage());
				}
			}
			else return visitor.visitChildren(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			type();
			setState(135);
			match(ID);
			setState(136);
			match(LPAREN);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 135291469824L) != 0) {
				{
				setState(137);
				type();
				setState(138);
				match(ID);
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(139);
					match(COMMA);
					setState(140);
					type();
					setState(141);
					match(ID);
					}
					}
					setState(147);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(150);
			match(RPAREN);
			setState(151);
			match(N);
			setState(153); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(152);
				stat();
				}
				}
				setState(155); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TAB );
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(grammaParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammaListener ) ((grammaListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammaListener ) ((grammaListener)listener).exitReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammaVisitor ) {
				try {
					return ((grammaVisitor<? extends T>)visitor).visitReturn(this);
				} catch (Exception e) {
					throw new RuntimeException(e.getMessage());
				}
			}
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnContext return_() throws RecognitionException {
		ReturnContext _localctx = new ReturnContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(RETURN);
			setState(158);
			expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(grammaParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(grammaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(grammaParser.RPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(grammaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(grammaParser.COMMA, i);
		}
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammaListener ) ((grammaListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammaListener ) ((grammaListener)listener).exitCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammaVisitor ) {
				try {
					return ((grammaVisitor<? extends T>)visitor).visitCall(this);
				} catch (Exception e) {
					throw new RuntimeException(e.getMessage());
				}
			}
			else return visitor.visitChildren(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(ID);
			setState(161);
			match(LPAREN);
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 3458764926421737472L) != 0) {
				{
				setState(162);
				expr(0);
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(163);
					match(COMMA);
					setState(164);
					expr(0);
					}
					}
					setState(169);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(172);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CastContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(grammaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(grammaParser.RPAREN, 0); }
		public TerminalNode ND() { return getToken(grammaParser.ND, 0); }
		public TerminalNode DOC() { return getToken(grammaParser.DOC, 0); }
		public TerminalNode TXT() { return getToken(grammaParser.TXT, 0); }
		public TerminalNode ID() { return getToken(grammaParser.ID, 0); }
		public ConstContext const_() {
			return getRuleContext(ConstContext.class,0);
		}
		public CastContext cast() {
			return getRuleContext(CastContext.class,0);
		}
		public CastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cast; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammaListener ) ((grammaListener)listener).enterCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammaListener ) ((grammaListener)listener).exitCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammaVisitor ) {
				try {
					return ((grammaVisitor<? extends T>)visitor).visitCast(this);
				} catch (Exception e) {
					throw new RuntimeException(e.getMessage());
				}
			}
			else return visitor.visitChildren(this);
		}
	}

	public final CastContext cast() throws RecognitionException {
		CastContext _localctx = new CastContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cast);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 7340032L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(175);
			match(LPAREN);
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(176);
				match(ID);
				}
				break;
			case LCURLY:
			case LANGLE:
			case STRING:
			case LSQUARE:
			case YES:
			case NO:
			case INT:
				{
				setState(177);
				const_();
				}
				break;
			case DOC:
			case ND:
			case TXT:
				{
				setState(178);
				cast();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(181);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InfuncContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(grammaParser.DOT, 0); }
		public FuncnameContext funcname() {
			return getRuleContext(FuncnameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(grammaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(grammaParser.RPAREN, 0); }
		public List<FormContext> form() {
			return getRuleContexts(FormContext.class);
		}
		public FormContext form(int i) {
			return getRuleContext(FormContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(grammaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(grammaParser.COMMA, i);
		}
		public InfuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammaListener ) ((grammaListener)listener).enterInfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammaListener ) ((grammaListener)listener).exitInfunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammaVisitor ) return ((grammaVisitor<? extends T>)visitor).visitInfunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InfuncContext infunc() throws RecognitionException {
		InfuncContext _localctx = new InfuncContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_infunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(DOT);
			setState(184);
			funcname();
			setState(185);
			match(LPAREN);
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 3458764926421729280L) != 0) {
				{
				setState(186);
				form();
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(187);
					match(COMMA);
					setState(188);
					form();
					}
					}
					setState(193);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(196);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncnameContext extends ParserRuleContext {
		public TerminalNode SETROOT() { return getToken(grammaParser.SETROOT, 0); }
		public TerminalNode GETROOT() { return getToken(grammaParser.GETROOT, 0); }
		public TerminalNode EDIT() { return getToken(grammaParser.EDIT, 0); }
		public TerminalNode FIND() { return getToken(grammaParser.FIND, 0); }
		public FuncnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammaListener ) ((grammaListener)listener).enterFuncname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammaListener ) ((grammaListener)listener).exitFuncname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammaVisitor ) return ((grammaVisitor<? extends T>)visitor).visitFuncname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncnameContext funcname() throws RecognitionException {
		FuncnameContext _localctx = new FuncnameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_funcname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 13933011347177472L) != 0) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(grammaParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(grammaParser.RPAREN, 0); }
		public ParContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_par; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammaListener ) ((grammaListener)listener).enterPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammaListener ) ((grammaListener)listener).exitPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammaVisitor ) return ((grammaVisitor<? extends T>)visitor).visitPar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParContext par() throws RecognitionException {
		ParContext _localctx = new ParContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_par);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(LPAREN);
			setState(201);
			expr(0);
			setState(202);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComandContext extends ParserRuleContext {
		public Token namecom;
		public TerminalNode DOT() { return getToken(grammaParser.DOT, 0); }
		public TerminalNode VALUE() { return getToken(grammaParser.VALUE, 0); }
		public TerminalNode INTEXT() { return getToken(grammaParser.INTEXT, 0); }
		public TerminalNode CHILDREN() { return getToken(grammaParser.CHILDREN, 0); }
		public TerminalNode ATTRS() { return getToken(grammaParser.ATTRS, 0); }
		public TerminalNode NAME() { return getToken(grammaParser.NAME, 0); }
		public ComandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammaListener ) ((grammaListener)listener).enterComand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammaListener ) ((grammaListener)listener).exitComand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammaVisitor ) return ((grammaVisitor<? extends T>)visitor).visitComand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandContext comand() throws RecognitionException {
		ComandContext _localctx = new ComandContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_comand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(DOT);
			setState(205);
			((ComandContext)_localctx).namecom = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 216295927416094720L) != 0) ) {
				((ComandContext)_localctx).namecom = (Token)_errHandler.recoverInline(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(grammaParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(grammaParser.LPAREN, 0); }
		public BoolexprContext boolexpr() {
			return getRuleContext(BoolexprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(grammaParser.RPAREN, 0); }
		public TerminalNode THEN() { return getToken(grammaParser.THEN, 0); }
		public TerminalNode N() { return getToken(grammaParser.N, 0); }
		public TerminalNode TAB() { return getToken(grammaParser.TAB, 0); }
		public TerminalNode END() { return getToken(grammaParser.END, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ElseContext else_() {
			return getRuleContext(ElseContext.class,0);
		}
		public IfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammaListener ) ((grammaListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammaListener ) ((grammaListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammaVisitor ) {
				try {
					return ((grammaVisitor<? extends T>)visitor).visitIf(this);
				} catch (Exception e) {
					throw new RuntimeException(e.getMessage());
				}
			}
			else return visitor.visitChildren(this);
		}
	}

	public final IfContext if_() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_if);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(IF);
			setState(208);
			match(LPAREN);
			setState(209);
			boolexpr(0);
			setState(210);
			match(RPAREN);
			setState(211);
			match(THEN);
			setState(212);
			match(N);
			setState(214); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(213);
					stat();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(216); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(218);
			match(TAB);
			setState(219);
			match(END);
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(220);
				else_();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElseContext extends ParserRuleContext {
		public List<TerminalNode> N() { return getTokens(grammaParser.N); }
		public TerminalNode N(int i) {
			return getToken(grammaParser.N, i);
		}
		public List<TerminalNode> TAB() { return getTokens(grammaParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(grammaParser.TAB, i);
		}
		public TerminalNode ELSE() { return getToken(grammaParser.ELSE, 0); }
		public TerminalNode END() { return getToken(grammaParser.END, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammaListener ) ((grammaListener)listener).enterElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammaListener ) ((grammaListener)listener).exitElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammaVisitor ) return ((grammaVisitor<? extends T>)visitor).visitElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseContext else_() throws RecognitionException {
		ElseContext _localctx = new ElseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_else);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(N);
			setState(224);
			match(TAB);
			setState(225);
			match(ELSE);
			setState(226);
			match(N);
			setState(228); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(227);
					stat();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(230); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(232);
			match(TAB);
			setState(233);
			match(END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PartContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(grammaParser.ID, 0); }
		public TerminalNode EQ() { return getToken(grammaParser.EQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MathContext math() {
			return getRuleContext(MathContext.class,0);
		}
		public PartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammaListener ) ((grammaListener)listener).enterPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammaListener ) ((grammaListener)listener).exitPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammaVisitor ) {
				try {
					return ((grammaVisitor<? extends T>)visitor).visitPart(this);
				} catch (Exception e) {
					throw new RuntimeException(e.getMessage());
				}
			}
			else return visitor.visitChildren(this);
		}
	}

	public final PartContext part() throws RecognitionException {
		PartContext _localctx = new PartContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_part);
		try {
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				match(ID);
				setState(236);
				match(EQ);
				setState(237);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				math();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(grammaParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(grammaParser.LPAREN, 0); }
		public List<PartContext> part() {
			return getRuleContexts(PartContext.class);
		}
		public PartContext part(int i) {
			return getRuleContext(PartContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(grammaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(grammaParser.COMMA, i);
		}
		public BoolexprContext boolexpr() {
			return getRuleContext(BoolexprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(grammaParser.RPAREN, 0); }
		public TerminalNode N() { return getToken(grammaParser.N, 0); }
		public TerminalNode TAB() { return getToken(grammaParser.TAB, 0); }
		public TerminalNode END() { return getToken(grammaParser.END, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammaListener ) ((grammaListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammaListener ) ((grammaListener)listener).exitFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammaVisitor ) {
				try {
					return ((grammaVisitor<? extends T>)visitor).visitFor(this);
				} catch (Exception e) {
					throw new RuntimeException(e.getMessage());
				}
			}
			else return visitor.visitChildren(this);
		}
	}

	public final ForContext for_() throws RecognitionException {
		ForContext _localctx = new ForContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_for);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(FOR);
			setState(242);
			match(LPAREN);
			setState(243);
			part();
			setState(244);
			match(COMMA);
			setState(245);
			boolexpr(0);
			setState(246);
			match(COMMA);
			setState(247);
			part();
			setState(248);
			match(RPAREN);
			setState(249);
			match(N);
			setState(251); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(250);
					stat();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(253); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(255);
			match(TAB);
			setState(256);
			match(END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BinaryContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(grammaParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(grammaParser.MINUS, 0); }
		public BinaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammaListener ) ((grammaListener)listener).enterBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammaListener ) ((grammaListener)listener).exitBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammaVisitor ) return ((grammaVisitor<? extends T>)visitor).visitBinary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryContext binary() throws RecognitionException {
		BinaryContext _localctx = new BinaryContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_binary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class InContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode DOT() { return getToken(grammaParser.DOT, 0); }
		public TerminalNode READ() { return getToken(grammaParser.READ, 0); }
		public TerminalNode LPAREN() { return getToken(grammaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(grammaParser.RPAREN, 0); }
		public FormContext form() {
			return getRuleContext(FormContext.class,0);
		}
		public InContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammaListener ) ((grammaListener)listener).enterIn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammaListener ) ((grammaListener)listener).exitIn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammaVisitor ) {
				try {
					return ((grammaVisitor<? extends T>)visitor).visitIn(this);
				} catch (Exception e) {
					throw new RuntimeException(e.getMessage());
				}
			}
			else return visitor.visitChildren(this);
		}
	}

	public final InContext in() throws RecognitionException {
		InContext _localctx = new InContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_in);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			type();
			setState(261);
			match(DOT);
			setState(262);
			match(READ);
			setState(263);
			match(LPAREN);
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 3458764926421729280L) != 0) {
				{
				setState(264);
				form();
				}
			}

			setState(267);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OutContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(grammaParser.DOT, 0); }
		public TerminalNode WRITE() { return getToken(grammaParser.WRITE, 0); }
		public TerminalNode LPAREN() { return getToken(grammaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(grammaParser.RPAREN, 0); }
		public TerminalNode ID() { return getToken(grammaParser.ID, 0); }
		public List<FormContext> form() {
			return getRuleContexts(FormContext.class);
		}
		public FormContext form(int i) {
			return getRuleContext(FormContext.class,i);
		}
		public OutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_out; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammaListener ) ((grammaListener)listener).enterOut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammaListener ) ((grammaListener)listener).exitOut(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammaVisitor ) {
				try {
					return ((grammaVisitor<? extends T>)visitor).visitOut(this);
				} catch (Exception e) {
					throw new RuntimeException(e.getMessage());
				}
			}
			else return visitor.visitChildren(this);
		}
	}

	public final OutContext out() throws RecognitionException {
		OutContext _localctx = new OutContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_out);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(269);
				match(ID);
				}
				break;
			case 2:
				{
				setState(270);
				form();
				}
				break;
			}
			setState(273);
			match(DOT);
			setState(274);
			match(WRITE);
			setState(275);
			match(LPAREN);
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 3458764926421729280L) != 0) {
				{
				setState(276);
				form();
				}
			}

			setState(279);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BoolexprContext extends ParserRuleContext {
		public Token logop;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COMPARE() { return getToken(grammaParser.COMPARE, 0); }
		public TerminalNode NOT() { return getToken(grammaParser.NOT, 0); }
		public TerminalNode LANGLE() { return getToken(grammaParser.LANGLE, 0); }
		public TerminalNode RANGLE() { return getToken(grammaParser.RANGLE, 0); }
		public TerminalNode EQGR() { return getToken(grammaParser.EQGR, 0); }
		public TerminalNode EQLT() { return getToken(grammaParser.EQLT, 0); }
		public List<BoolexprContext> boolexpr() {
			return getRuleContexts(BoolexprContext.class);
		}
		public BoolexprContext boolexpr(int i) {
			return getRuleContext(BoolexprContext.class,i);
		}
		public TerminalNode AND() { return getToken(grammaParser.AND, 0); }
		public TerminalNode OR() { return getToken(grammaParser.OR, 0); }
		public BoolexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammaListener ) ((grammaListener)listener).enterBoolexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammaListener ) ((grammaListener)listener).exitBoolexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammaVisitor ) {
				try {
					return ((grammaVisitor<? extends T>)visitor).visitBoolexpr(this);
				} catch (Exception e) {
					throw new RuntimeException(e.getMessage());
				}
			}
			else return visitor.visitChildren(this);
		}
	}

	public final BoolexprContext boolexpr() throws RecognitionException {
		return boolexpr(0);
	}

	private BoolexprContext boolexpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BoolexprContext _localctx = new BoolexprContext(_ctx, _parentState);
		BoolexprContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_boolexpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(282);
			expr(0);
			setState(283);
			((BoolexprContext)_localctx).logop = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 393448L) != 0) ) {
				((BoolexprContext)_localctx).logop = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(284);
			expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(291);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BoolexprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_boolexpr);
					setState(286);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(287);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==OR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(288);
					boolexpr(3);
					}
					} 
				}
				setState(293);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(grammaParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(grammaParser.LPAREN, 0); }
		public BoolexprContext boolexpr() {
			return getRuleContext(BoolexprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(grammaParser.RPAREN, 0); }
		public TerminalNode DO() { return getToken(grammaParser.DO, 0); }
		public TerminalNode N() { return getToken(grammaParser.N, 0); }
		public TerminalNode TAB() { return getToken(grammaParser.TAB, 0); }
		public TerminalNode END() { return getToken(grammaParser.END, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public WhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammaListener ) ((grammaListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammaListener ) ((grammaListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammaVisitor ) {
				try {
					return ((grammaVisitor<? extends T>)visitor).visitWhile(this);
				} catch (Exception e) {
					throw new RuntimeException(e.getMessage());
				}
			}
			else return visitor.visitChildren(this);
		}
	}

	public final WhileContext while_() throws RecognitionException {
		WhileContext _localctx = new WhileContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_while);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(WHILE);
			setState(295);
			match(LPAREN);
			setState(296);
			boolexpr(0);
			setState(297);
			match(RPAREN);
			setState(298);
			match(DO);
			setState(299);
			match(N);
			setState(303);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(300);
					stat();
					}
					} 
				}
				setState(305);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			setState(306);
			match(TAB);
			setState(307);
			match(END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class UntilContext extends ParserRuleContext {
		public TerminalNode UNTIL() { return getToken(grammaParser.UNTIL, 0); }
		public TerminalNode LPAREN() { return getToken(grammaParser.LPAREN, 0); }
		public BoolexprContext boolexpr() {
			return getRuleContext(BoolexprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(grammaParser.RPAREN, 0); }
		public TerminalNode DO() { return getToken(grammaParser.DO, 0); }
		public TerminalNode N() { return getToken(grammaParser.N, 0); }
		public TerminalNode TAB() { return getToken(grammaParser.TAB, 0); }
		public TerminalNode END() { return getToken(grammaParser.END, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public UntilContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_until; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammaListener ) ((grammaListener)listener).enterUntil(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammaListener ) ((grammaListener)listener).exitUntil(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammaVisitor ) {
				try {
					return ((grammaVisitor<? extends T>)visitor).visitUntil(this);
				} catch (Exception e) {
					throw new RuntimeException(e.getMessage());
				}
			}
			else return visitor.visitChildren(this);
		}
	}

	public final UntilContext until() throws RecognitionException {
		UntilContext _localctx = new UntilContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_until);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(UNTIL);
			setState(310);
			match(LPAREN);
			setState(311);
			boolexpr(0);
			setState(312);
			match(RPAREN);
			setState(313);
			match(DO);
			setState(314);
			match(N);
			setState(318);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(315);
					stat();
					}
					} 
				}
				setState(320);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			setState(321);
			match(TAB);
			setState(322);
			match(END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(grammaParser.NUMBER, 0); }
		public TerminalNode DOCUMENT() { return getToken(grammaParser.DOCUMENT, 0); }
		public TerminalNode TEXT() { return getToken(grammaParser.TEXT, 0); }
		public TerminalNode NODE() { return getToken(grammaParser.NODE, 0); }
		public TerminalNode ATTR() { return getToken(grammaParser.ATTR, 0); }
		public TerminalNode BOOL() { return getToken(grammaParser.BOOL, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammaListener ) ((grammaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammaListener ) ((grammaListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammaVisitor ) return ((grammaVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 135291469824L) != 0) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ChindexContext extends ParserRuleContext {
		public TerminalNode LSQUARE() { return getToken(grammaParser.LSQUARE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RSQUARE() { return getToken(grammaParser.RSQUARE, 0); }
		public ChindexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chindex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammaListener ) ((grammaListener)listener).enterChindex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammaListener ) ((grammaListener)listener).exitChindex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammaVisitor ) return ((grammaVisitor<? extends T>)visitor).visitChindex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChindexContext chindex() throws RecognitionException {
		ChindexContext _localctx = new ChindexContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_chindex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(LSQUARE);
			setState(327);
			expr(0);
			setState(328);
			match(RSQUARE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AtindexContext extends ParserRuleContext {
		public TerminalNode LANGLE() { return getToken(grammaParser.LANGLE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RANGLE() { return getToken(grammaParser.RANGLE, 0); }
		public AtindexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atindex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammaListener ) ((grammaListener)listener).enterAtindex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammaListener ) ((grammaListener)listener).exitAtindex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammaVisitor ) return ((grammaVisitor<? extends T>)visitor).visitAtindex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtindexContext atindex() throws RecognitionException {
		AtindexContext _localctx = new AtindexContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_atindex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(LANGLE);
			setState(331);
			expr(0);
			setState(332);
			match(RANGLE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(grammaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(grammaParser.ID, i);
		}
		public TerminalNode EQ() { return getToken(grammaParser.EQ, 0); }
		public List<InContext> in() {
			return getRuleContexts(InContext.class);
		}
		public InContext in(int i) {
			return getRuleContext(InContext.class,i);
		}
		public List<MathContext> math() {
			return getRuleContexts(MathContext.class);
		}
		public MathContext math(int i) {
			return getRuleContext(MathContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<CallContext> call() {
			return getRuleContexts(CallContext.class);
		}
		public CallContext call(int i) {
			return getRuleContext(CallContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(grammaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(grammaParser.COMMA, i);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammaListener ) ((grammaListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammaListener ) ((grammaListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammaVisitor ) {
				try {
					return ((grammaVisitor<? extends T>)visitor).visitAssign(this);
				} catch (Exception e) {
					throw new RuntimeException(e.getMessage());
				}
			}
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(ID);
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(335);
				match(COMMA);
				setState(336);
				match(ID);
				}
				}
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(342);
			match(EQ);
			setState(347);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(343);
				in();
				}
				break;
			case 2:
				{
				setState(344);
				math();
				}
				break;
			case 3:
				{
				setState(345);
				expr(0);
				}
				break;
			case 4:
				{
				setState(346);
				call();
				}
				break;
			}
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(349);
				match(COMMA);
				setState(354);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(350);
					in();
					}
					break;
				case 2:
					{
					setState(351);
					math();
					}
					break;
				case 3:
					{
					setState(352);
					expr(0);
					}
					break;
				case 4:
					{
					setState(353);
					call();
					}
					break;
				}
				}
				}
				setState(360);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ActionContext extends ParserRuleContext {
		public ReturnContext return_() {
			return getRuleContext(ReturnContext.class,0);
		}
		public MathContext math() {
			return getRuleContext(MathContext.class,0);
		}
		public IfContext if_() {
			return getRuleContext(IfContext.class,0);
		}
		public ForContext for_() {
			return getRuleContext(ForContext.class,0);
		}
		public WhileContext while_() {
			return getRuleContext(WhileContext.class,0);
		}
		public UntilContext until() {
			return getRuleContext(UntilContext.class,0);
		}
		public OutContext out() {
			return getRuleContext(OutContext.class,0);
		}
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammaListener ) ((grammaListener)listener).enterAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammaListener ) ((grammaListener)listener).exitAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammaVisitor ) return ((grammaVisitor<? extends T>)visitor).visitAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_action);
		try {
			setState(368);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(361);
				return_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(362);
				math();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(363);
				if_();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(364);
				for_();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(365);
				while_();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(366);
				until();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(367);
				out();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FormContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(grammaParser.ID, 0); }
		public CastContext cast() {
			return getRuleContext(CastContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public ConstContext const_() {
			return getRuleContext(ConstContext.class,0);
		}
		public AllindexContext allindex() {
			return getRuleContext(AllindexContext.class,0);
		}
		public ComandContext comand() {
			return getRuleContext(ComandContext.class,0);
		}
		public InfuncContext infunc() {
			return getRuleContext(InfuncContext.class,0);
		}
		public FormContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_form; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammaListener ) ((grammaListener)listener).enterForm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammaListener ) ((grammaListener)listener).exitForm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammaVisitor ) {
				try {
					return ((grammaVisitor<? extends T>)visitor).visitForm(this);
				} catch (Exception e) {
					throw new RuntimeException(e.getMessage());
				}
			}
			else return visitor.visitChildren(this);
		}
	}

	public final FormContext form() throws RecognitionException {
		FormContext _localctx = new FormContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_form);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(370);
				match(ID);
				}
				break;
			case 2:
				{
				setState(371);
				cast();
				}
				break;
			case 3:
				{
				setState(372);
				call();
				}
				break;
			case 4:
				{
				setState(373);
				const_();
				}
				break;
			case 5:
				{
				setState(374);
				allindex();
				}
				break;
			}
			setState(379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(377);
				comand();
				}
				break;
			case 2:
				{
				setState(378);
				infunc();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AllindexContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(grammaParser.ID, 0); }
		public ChindexContext chindex() {
			return getRuleContext(ChindexContext.class,0);
		}
		public AtindexContext atindex() {
			return getRuleContext(AtindexContext.class,0);
		}
		public AllindexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allindex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammaListener ) ((grammaListener)listener).enterAllindex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammaListener ) ((grammaListener)listener).exitAllindex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammaVisitor ) {
				try {
					return ((grammaVisitor<? extends T>)visitor).visitAllindex(this);
				} catch (Exception e) {
					throw new RuntimeException(e.getMessage());
				}
			}
			else return visitor.visitChildren(this);
		}
	}

	public final AllindexContext allindex() throws RecognitionException {
		AllindexContext _localctx = new AllindexContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_allindex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(ID);
			setState(387);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(382);
				chindex();
				}
				break;
			case 2:
				{
				setState(383);
				atindex();
				}
				break;
			case 3:
				{
				setState(384);
				chindex();
				setState(385);
				atindex();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 20:
			return boolexpr_sempred((BoolexprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean boolexpr_sempred(BoolexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001A\u0186\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0001\u0000\u0005\u0000"+
		">\b\u0000\n\u0000\f\u0000A\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0005\u0000H\b\u0000\n\u0000\f\u0000K\t\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000Q\b\u0000"+
		"\n\u0000\f\u0000T\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0004\u0001"+
		"Y\b\u0001\u000b\u0001\f\u0001Z\u0001\u0001\u0001\u0001\u0003\u0001_\b"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003i\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0005\u0003o\b\u0003\n\u0003\f\u0003r\t"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004\u0085\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u0090"+
		"\b\u0005\n\u0005\f\u0005\u0093\t\u0005\u0003\u0005\u0095\b\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0004\u0005\u009a\b\u0005\u000b\u0005\f"+
		"\u0005\u009b\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00a6\b\u0007\n\u0007"+
		"\f\u0007\u00a9\t\u0007\u0003\u0007\u00ab\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00b4\b\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00be\b\t\n"+
		"\t\f\t\u00c1\t\t\u0003\t\u00c3\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0004\r\u00d7\b\r\u000b"+
		"\r\f\r\u00d8\u0001\r\u0001\r\u0001\r\u0003\r\u00de\b\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0004\u000e\u00e5\b\u000e\u000b"+
		"\u000e\f\u000e\u00e6\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00f0\b\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0004\u0010\u00fc\b\u0010\u000b\u0010\f"+
		"\u0010\u00fd\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u010a\b\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u0110\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u0116\b\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014"+
		"\u0122\b\u0014\n\u0014\f\u0014\u0125\t\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u012e"+
		"\b\u0015\n\u0015\f\u0015\u0131\t\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0005\u0016\u013d\b\u0016\n\u0016\f\u0016\u0140\t\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u0152\b\u001a\n"+
		"\u001a\f\u001a\u0155\t\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0003\u001a\u015c\b\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0163\b\u001a\u0005\u001a\u0165"+
		"\b\u001a\n\u001a\f\u001a\u0168\t\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0171\b\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c"+
		"\u0178\b\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u017c\b\u001c\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003"+
		"\u001d\u0184\b\u001d\u0001\u001d\u0000\u0002\u0006(\u001e\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:\u0000\t\u0001\u0000\b\t\u0002\u0000\u0017\u0017<<\u0001"+
		"\u0000\u0014\u0016\u0002\u0000/045\u0002\u0000,.89\u0001\u0000\u0018\u0019"+
		"\u0003\u0000\u0003\u0003\u0005\u0007\u0011\u0012\u0001\u0000\u0001\u0002"+
		"\u0001\u0000\u001f$\u019e\u0000?\u0001\u0000\u0000\u0000\u0002X\u0001"+
		"\u0000\u0000\u0000\u0004b\u0001\u0000\u0000\u0000\u0006h\u0001\u0000\u0000"+
		"\u0000\b\u0084\u0001\u0000\u0000\u0000\n\u0086\u0001\u0000\u0000\u0000"+
		"\f\u009d\u0001\u0000\u0000\u0000\u000e\u00a0\u0001\u0000\u0000\u0000\u0010"+
		"\u00ae\u0001\u0000\u0000\u0000\u0012\u00b7\u0001\u0000\u0000\u0000\u0014"+
		"\u00c6\u0001\u0000\u0000\u0000\u0016\u00c8\u0001\u0000\u0000\u0000\u0018"+
		"\u00cc\u0001\u0000\u0000\u0000\u001a\u00cf\u0001\u0000\u0000\u0000\u001c"+
		"\u00df\u0001\u0000\u0000\u0000\u001e\u00ef\u0001\u0000\u0000\u0000 \u00f1"+
		"\u0001\u0000\u0000\u0000\"\u0102\u0001\u0000\u0000\u0000$\u0104\u0001"+
		"\u0000\u0000\u0000&\u010f\u0001\u0000\u0000\u0000(\u0119\u0001\u0000\u0000"+
		"\u0000*\u0126\u0001\u0000\u0000\u0000,\u0135\u0001\u0000\u0000\u0000."+
		"\u0144\u0001\u0000\u0000\u00000\u0146\u0001\u0000\u0000\u00002\u014a\u0001"+
		"\u0000\u0000\u00004\u014e\u0001\u0000\u0000\u00006\u0170\u0001\u0000\u0000"+
		"\u00008\u0177\u0001\u0000\u0000\u0000:\u017d\u0001\u0000\u0000\u0000<"+
		">\u0003\n\u0005\u0000=<\u0001\u0000\u0000\u0000>A\u0001\u0000\u0000\u0000"+
		"?=\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@I\u0001\u0000\u0000"+
		"\u0000A?\u0001\u0000\u0000\u0000BC\u0005<\u0000\u0000CD\u0005\u0004\u0000"+
		"\u0000DE\u0003\b\u0004\u0000EF\u0005?\u0000\u0000FH\u0001\u0000\u0000"+
		"\u0000GB\u0001\u0000\u0000\u0000HK\u0001\u0000\u0000\u0000IG\u0001\u0000"+
		"\u0000\u0000IJ\u0001\u0000\u0000\u0000JL\u0001\u0000\u0000\u0000KI\u0001"+
		"\u0000\u0000\u0000LM\u0005+\u0000\u0000MN\u0005\u001e\u0000\u0000NR\u0005"+
		"?\u0000\u0000OQ\u0003\u0002\u0001\u0000PO\u0001\u0000\u0000\u0000QT\u0001"+
		"\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000"+
		"SU\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000UV\u0005\u0000\u0000"+
		"\u0001V\u0001\u0001\u0000\u0000\u0000WY\u0005>\u0000\u0000XW\u0001\u0000"+
		"\u0000\u0000YZ\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001"+
		"\u0000\u0000\u0000[^\u0001\u0000\u0000\u0000\\_\u00034\u001a\u0000]_\u0003"+
		"6\u001b\u0000^\\\u0001\u0000\u0000\u0000^]\u0001\u0000\u0000\u0000_`\u0001"+
		"\u0000\u0000\u0000`a\u0005?\u0000\u0000a\u0003\u0001\u0000\u0000\u0000"+
		"bc\u0005<\u0000\u0000cd\u0007\u0000\u0000\u0000d\u0005\u0001\u0000\u0000"+
		"\u0000ef\u0006\u0003\uffff\uffff\u0000fi\u00038\u001c\u0000gi\u0003\u0016"+
		"\u000b\u0000he\u0001\u0000\u0000\u0000hg\u0001\u0000\u0000\u0000ip\u0001"+
		"\u0000\u0000\u0000jk\n\u0003\u0000\u0000kl\u0003\"\u0011\u0000lm\u0003"+
		"\u0006\u0003\u0004mo\u0001\u0000\u0000\u0000nj\u0001\u0000\u0000\u0000"+
		"or\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000"+
		"\u0000q\u0007\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000st\u0005"+
		"\u000f\u0000\u0000tu\u0007\u0001\u0000\u0000u\u0085\u0005\u0010\u0000"+
		"\u0000vw\u0005\u001c\u0000\u0000wx\u0007\u0001\u0000\u0000xy\u0005\u001e"+
		"\u0000\u0000yz\u0007\u0001\u0000\u0000z\u0085\u0005\u001d\u0000\u0000"+
		"{|\u0005\u0011\u0000\u0000|}\u0007\u0001\u0000\u0000}~\u0005\u001e\u0000"+
		"\u0000~\u007f\u0007\u0001\u0000\u0000\u007f\u0085\u0005\u0012\u0000\u0000"+
		"\u0080\u0085\u0005\u0017\u0000\u0000\u0081\u0085\u0005=\u0000\u0000\u0082"+
		"\u0085\u0005%\u0000\u0000\u0083\u0085\u0005&\u0000\u0000\u0084s\u0001"+
		"\u0000\u0000\u0000\u0084v\u0001\u0000\u0000\u0000\u0084{\u0001\u0000\u0000"+
		"\u0000\u0084\u0080\u0001\u0000\u0000\u0000\u0084\u0081\u0001\u0000\u0000"+
		"\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0083\u0001\u0000\u0000"+
		"\u0000\u0085\t\u0001\u0000\u0000\u0000\u0086\u0087\u0003.\u0017\u0000"+
		"\u0087\u0088\u0005<\u0000\u0000\u0088\u0094\u0005\r\u0000\u0000\u0089"+
		"\u008a\u0003.\u0017\u0000\u008a\u0091\u0005<\u0000\u0000\u008b\u008c\u0005"+
		"\n\u0000\u0000\u008c\u008d\u0003.\u0017\u0000\u008d\u008e\u0005<\u0000"+
		"\u0000\u008e\u0090\u0001\u0000\u0000\u0000\u008f\u008b\u0001\u0000\u0000"+
		"\u0000\u0090\u0093\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000"+
		"\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0095\u0001\u0000\u0000"+
		"\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0094\u0089\u0001\u0000\u0000"+
		"\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000"+
		"\u0000\u0096\u0097\u0005\u000e\u0000\u0000\u0097\u0099\u0005?\u0000\u0000"+
		"\u0098\u009a\u0003\u0002\u0001\u0000\u0099\u0098\u0001\u0000\u0000\u0000"+
		"\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000"+
		"\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u000b\u0001\u0000\u0000\u0000"+
		"\u009d\u009e\u00051\u0000\u0000\u009e\u009f\u0003\u0006\u0003\u0000\u009f"+
		"\r\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005<\u0000\u0000\u00a1\u00aa"+
		"\u0005\r\u0000\u0000\u00a2\u00a7\u0003\u0006\u0003\u0000\u00a3\u00a4\u0005"+
		"\n\u0000\u0000\u00a4\u00a6\u0003\u0006\u0003\u0000\u00a5\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a9\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u00ab\u0001\u0000"+
		"\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00aa\u00a2\u0001\u0000"+
		"\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000"+
		"\u0000\u0000\u00ac\u00ad\u0005\u000e\u0000\u0000\u00ad\u000f\u0001\u0000"+
		"\u0000\u0000\u00ae\u00af\u0007\u0002\u0000\u0000\u00af\u00b3\u0005\r\u0000"+
		"\u0000\u00b0\u00b4\u0005<\u0000\u0000\u00b1\u00b4\u0003\b\u0004\u0000"+
		"\u00b2\u00b4\u0003\u0010\b\u0000\u00b3\u00b0\u0001\u0000\u0000\u0000\u00b3"+
		"\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b2\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005\u000e\u0000\u0000\u00b6"+
		"\u0011\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005\f\u0000\u0000\u00b8\u00b9"+
		"\u0003\u0014\n\u0000\u00b9\u00c2\u0005\r\u0000\u0000\u00ba\u00bf\u0003"+
		"8\u001c\u0000\u00bb\u00bc\u0005\n\u0000\u0000\u00bc\u00be\u00038\u001c"+
		"\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00be\u00c1\u0001\u0000\u0000"+
		"\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000"+
		"\u0000\u00c0\u00c3\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000"+
		"\u0000\u00c2\u00ba\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005\u000e\u0000"+
		"\u0000\u00c5\u0013\u0001\u0000\u0000\u0000\u00c6\u00c7\u0007\u0003\u0000"+
		"\u0000\u00c7\u0015\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005\r\u0000\u0000"+
		"\u00c9\u00ca\u0003\u0006\u0003\u0000\u00ca\u00cb\u0005\u000e\u0000\u0000"+
		"\u00cb\u0017\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005\f\u0000\u0000\u00cd"+
		"\u00ce\u0007\u0004\u0000\u0000\u00ce\u0019\u0001\u0000\u0000\u0000\u00cf"+
		"\u00d0\u0005\'\u0000\u0000\u00d0\u00d1\u0005\r\u0000\u0000\u00d1\u00d2"+
		"\u0003(\u0014\u0000\u00d2\u00d3\u0005\u000e\u0000\u0000\u00d3\u00d4\u0005"+
		")\u0000\u0000\u00d4\u00d6\u0005?\u0000\u0000\u00d5\u00d7\u0003\u0002\u0001"+
		"\u0000\u00d6\u00d5\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000"+
		"\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000"+
		"\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da\u00db\u0005>\u0000\u0000"+
		"\u00db\u00dd\u00056\u0000\u0000\u00dc\u00de\u0003\u001c\u000e\u0000\u00dd"+
		"\u00dc\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de"+
		"\u001b\u0001\u0000\u0000\u0000\u00df\u00e0\u0005?\u0000\u0000\u00e0\u00e1"+
		"\u0005>\u0000\u0000\u00e1\u00e2\u0005*\u0000\u0000\u00e2\u00e4\u0005?"+
		"\u0000\u0000\u00e3\u00e5\u0003\u0002\u0001\u0000\u00e4\u00e3\u0001\u0000"+
		"\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6\u00e4\u0001\u0000"+
		"\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000"+
		"\u0000\u0000\u00e8\u00e9\u0005>\u0000\u0000\u00e9\u00ea\u00056\u0000\u0000"+
		"\u00ea\u001d\u0001\u0000\u0000\u0000\u00eb\u00ec\u0005<\u0000\u0000\u00ec"+
		"\u00ed\u0005\u0004\u0000\u0000\u00ed\u00f0\u0003\u0006\u0003\u0000\u00ee"+
		"\u00f0\u0003\u0004\u0002\u0000\u00ef\u00eb\u0001\u0000\u0000\u0000\u00ef"+
		"\u00ee\u0001\u0000\u0000\u0000\u00f0\u001f\u0001\u0000\u0000\u0000\u00f1"+
		"\u00f2\u0005(\u0000\u0000\u00f2\u00f3\u0005\r\u0000\u0000\u00f3\u00f4"+
		"\u0003\u001e\u000f\u0000\u00f4\u00f5\u0005\n\u0000\u0000\u00f5\u00f6\u0003"+
		"(\u0014\u0000\u00f6\u00f7\u0005\n\u0000\u0000\u00f7\u00f8\u0003\u001e"+
		"\u000f\u0000\u00f8\u00f9\u0005\u000e\u0000\u0000\u00f9\u00fb\u0005?\u0000"+
		"\u0000\u00fa\u00fc\u0003\u0002\u0001\u0000\u00fb\u00fa\u0001\u0000\u0000"+
		"\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fd\u00fb\u0001\u0000\u0000"+
		"\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000"+
		"\u0000\u00ff\u0100\u0005>\u0000\u0000\u0100\u0101\u00056\u0000\u0000\u0101"+
		"!\u0001\u0000\u0000\u0000\u0102\u0103\u0007\u0005\u0000\u0000\u0103#\u0001"+
		"\u0000\u0000\u0000\u0104\u0105\u0003.\u0017\u0000\u0105\u0106\u0005\f"+
		"\u0000\u0000\u0106\u0107\u0005:\u0000\u0000\u0107\u0109\u0005\r\u0000"+
		"\u0000\u0108\u010a\u00038\u001c\u0000\u0109\u0108\u0001\u0000\u0000\u0000"+
		"\u0109\u010a\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000\u0000\u0000"+
		"\u010b\u010c\u0005\u000e\u0000\u0000\u010c%\u0001\u0000\u0000\u0000\u010d"+
		"\u0110\u0005<\u0000\u0000\u010e\u0110\u00038\u001c\u0000\u010f\u010d\u0001"+
		"\u0000\u0000\u0000\u010f\u010e\u0001\u0000\u0000\u0000\u0110\u0111\u0001"+
		"\u0000\u0000\u0000\u0111\u0112\u0005\f\u0000\u0000\u0112\u0113\u0005;"+
		"\u0000\u0000\u0113\u0115\u0005\r\u0000\u0000\u0114\u0116\u00038\u001c"+
		"\u0000\u0115\u0114\u0001\u0000\u0000\u0000\u0115\u0116\u0001\u0000\u0000"+
		"\u0000\u0116\u0117\u0001\u0000\u0000\u0000\u0117\u0118\u0005\u000e\u0000"+
		"\u0000\u0118\'\u0001\u0000\u0000\u0000\u0119\u011a\u0006\u0014\uffff\uffff"+
		"\u0000\u011a\u011b\u0003\u0006\u0003\u0000\u011b\u011c\u0007\u0006\u0000"+
		"\u0000\u011c\u011d\u0003\u0006\u0003\u0000\u011d\u0123\u0001\u0000\u0000"+
		"\u0000\u011e\u011f\n\u0002\u0000\u0000\u011f\u0120\u0007\u0007\u0000\u0000"+
		"\u0120\u0122\u0003(\u0014\u0003\u0121\u011e\u0001\u0000\u0000\u0000\u0122"+
		"\u0125\u0001\u0000\u0000\u0000\u0123\u0121\u0001\u0000\u0000\u0000\u0123"+
		"\u0124\u0001\u0000\u0000\u0000\u0124)\u0001\u0000\u0000\u0000\u0125\u0123"+
		"\u0001\u0000\u0000\u0000\u0126\u0127\u00052\u0000\u0000\u0127\u0128\u0005"+
		"\r\u0000\u0000\u0128\u0129\u0003(\u0014\u0000\u0129\u012a\u0005\u000e"+
		"\u0000\u0000\u012a\u012b\u00057\u0000\u0000\u012b\u012f\u0005?\u0000\u0000"+
		"\u012c\u012e\u0003\u0002\u0001\u0000\u012d\u012c\u0001\u0000\u0000\u0000"+
		"\u012e\u0131\u0001\u0000\u0000\u0000\u012f\u012d\u0001\u0000\u0000\u0000"+
		"\u012f\u0130\u0001\u0000\u0000\u0000\u0130\u0132\u0001\u0000\u0000\u0000"+
		"\u0131\u012f\u0001\u0000\u0000\u0000\u0132\u0133\u0005>\u0000\u0000\u0133"+
		"\u0134\u00056\u0000\u0000\u0134+\u0001\u0000\u0000\u0000\u0135\u0136\u0005"+
		"3\u0000\u0000\u0136\u0137\u0005\r\u0000\u0000\u0137\u0138\u0003(\u0014"+
		"\u0000\u0138\u0139\u0005\u000e\u0000\u0000\u0139\u013a\u00057\u0000\u0000"+
		"\u013a\u013e\u0005?\u0000\u0000\u013b\u013d\u0003\u0002\u0001\u0000\u013c"+
		"\u013b\u0001\u0000\u0000\u0000\u013d\u0140\u0001\u0000\u0000\u0000\u013e"+
		"\u013c\u0001\u0000\u0000\u0000\u013e\u013f\u0001\u0000\u0000\u0000\u013f"+
		"\u0141\u0001\u0000\u0000\u0000\u0140\u013e\u0001\u0000\u0000\u0000\u0141"+
		"\u0142\u0005>\u0000\u0000\u0142\u0143\u00056\u0000\u0000\u0143-\u0001"+
		"\u0000\u0000\u0000\u0144\u0145\u0007\b\u0000\u0000\u0145/\u0001\u0000"+
		"\u0000\u0000\u0146\u0147\u0005\u001c\u0000\u0000\u0147\u0148\u0003\u0006"+
		"\u0003\u0000\u0148\u0149\u0005\u001d\u0000\u0000\u01491\u0001\u0000\u0000"+
		"\u0000\u014a\u014b\u0005\u0011\u0000\u0000\u014b\u014c\u0003\u0006\u0003"+
		"\u0000\u014c\u014d\u0005\u0012\u0000\u0000\u014d3\u0001\u0000\u0000\u0000"+
		"\u014e\u0153\u0005<\u0000\u0000\u014f\u0150\u0005\n\u0000\u0000\u0150"+
		"\u0152\u0005<\u0000\u0000\u0151\u014f\u0001\u0000\u0000\u0000\u0152\u0155"+
		"\u0001\u0000\u0000\u0000\u0153\u0151\u0001\u0000\u0000\u0000\u0153\u0154"+
		"\u0001\u0000\u0000\u0000\u0154\u0156\u0001\u0000\u0000\u0000\u0155\u0153"+
		"\u0001\u0000\u0000\u0000\u0156\u015b\u0005\u0004\u0000\u0000\u0157\u015c"+
		"\u0003$\u0012\u0000\u0158\u015c\u0003\u0004\u0002\u0000\u0159\u015c\u0003"+
		"\u0006\u0003\u0000\u015a\u015c\u0003\u000e\u0007\u0000\u015b\u0157\u0001"+
		"\u0000\u0000\u0000\u015b\u0158\u0001\u0000\u0000\u0000\u015b\u0159\u0001"+
		"\u0000\u0000\u0000\u015b\u015a\u0001\u0000\u0000\u0000\u015c\u0166\u0001"+
		"\u0000\u0000\u0000\u015d\u0162\u0005\n\u0000\u0000\u015e\u0163\u0003$"+
		"\u0012\u0000\u015f\u0163\u0003\u0004\u0002\u0000\u0160\u0163\u0003\u0006"+
		"\u0003\u0000\u0161\u0163\u0003\u000e\u0007\u0000\u0162\u015e\u0001\u0000"+
		"\u0000\u0000\u0162\u015f\u0001\u0000\u0000\u0000\u0162\u0160\u0001\u0000"+
		"\u0000\u0000\u0162\u0161\u0001\u0000\u0000\u0000\u0163\u0165\u0001\u0000"+
		"\u0000\u0000\u0164\u015d\u0001\u0000\u0000\u0000\u0165\u0168\u0001\u0000"+
		"\u0000\u0000\u0166\u0164\u0001\u0000\u0000\u0000\u0166\u0167\u0001\u0000"+
		"\u0000\u0000\u01675\u0001\u0000\u0000\u0000\u0168\u0166\u0001\u0000\u0000"+
		"\u0000\u0169\u0171\u0003\f\u0006\u0000\u016a\u0171\u0003\u0004\u0002\u0000"+
		"\u016b\u0171\u0003\u001a\r\u0000\u016c\u0171\u0003 \u0010\u0000\u016d"+
		"\u0171\u0003*\u0015\u0000\u016e\u0171\u0003,\u0016\u0000\u016f\u0171\u0003"+
		"&\u0013\u0000\u0170\u0169\u0001\u0000\u0000\u0000\u0170\u016a\u0001\u0000"+
		"\u0000\u0000\u0170\u016b\u0001\u0000\u0000\u0000\u0170\u016c\u0001\u0000"+
		"\u0000\u0000\u0170\u016d\u0001\u0000\u0000\u0000\u0170\u016e\u0001\u0000"+
		"\u0000\u0000\u0170\u016f\u0001\u0000\u0000\u0000\u01717\u0001\u0000\u0000"+
		"\u0000\u0172\u0178\u0005<\u0000\u0000\u0173\u0178\u0003\u0010\b\u0000"+
		"\u0174\u0178\u0003\u000e\u0007\u0000\u0175\u0178\u0003\b\u0004\u0000\u0176"+
		"\u0178\u0003:\u001d\u0000\u0177\u0172\u0001\u0000\u0000\u0000\u0177\u0173"+
		"\u0001\u0000\u0000\u0000\u0177\u0174\u0001\u0000\u0000\u0000\u0177\u0175"+
		"\u0001\u0000\u0000\u0000\u0177\u0176\u0001\u0000\u0000\u0000\u0178\u017b"+
		"\u0001\u0000\u0000\u0000\u0179\u017c\u0003\u0018\f\u0000\u017a\u017c\u0003"+
		"\u0012\t\u0000\u017b\u0179\u0001\u0000\u0000\u0000\u017b\u017a\u0001\u0000"+
		"\u0000\u0000\u017b\u017c\u0001\u0000\u0000\u0000\u017c9\u0001\u0000\u0000"+
		"\u0000\u017d\u0183\u0005<\u0000\u0000\u017e\u0184\u00030\u0018\u0000\u017f"+
		"\u0184\u00032\u0019\u0000\u0180\u0181\u00030\u0018\u0000\u0181\u0182\u0003"+
		"2\u0019\u0000\u0182\u0184\u0001\u0000\u0000\u0000\u0183\u017e\u0001\u0000"+
		"\u0000\u0000\u0183\u017f\u0001\u0000\u0000\u0000\u0183\u0180\u0001\u0000"+
		"\u0000\u0000\u0184;\u0001\u0000\u0000\u0000#?IRZ^hp\u0084\u0091\u0094"+
		"\u009b\u00a7\u00aa\u00b3\u00bf\u00c2\u00d8\u00dd\u00e6\u00ef\u00fd\u0109"+
		"\u010f\u0115\u0123\u012f\u013e\u0153\u015b\u0162\u0166\u0170\u0177\u017b"+
		"\u0183";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}