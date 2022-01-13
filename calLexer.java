// Generated from cal.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class calLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"Var", "Const", "Return", "Integer", "Boolean", "Void", "Main", "If", 
		"Else", "True", "False", "While", "Skip", "SemiColon", "Colon", "Comma", 
		"Lbrace", "Rbrace", "Lsb", "RSb", "Lb", "Rb", "MINUS", "PLUS", "ASSIGNMENT", 
		"NEGATION", "OR", "AND", "EQUAL", "NOTEQUAL", "Less_Than", "Less_ThanE", 
		"Greater", "GreaterE", "ID", "NUMBER", "BOOLEAN", "Multi_Comment", "Single_Comment", 
		"WhiteSpace", "A", "B", "C", "D", "E", "F", "G", "H", "I", "K", "L", "M", 
		"N", "O", "P", "R", "S", "T", "U", "V", "W", "Letter", "Digit", "NonZero", 
		"UnderScore", "Dot"
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


	public calLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "cal.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2*\u0177\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26"+
		"\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3#\3#"+
		"\3#\3$\3$\3$\3$\7$\u0105\n$\f$\16$\u0108\13$\3%\5%\u010b\n%\3%\3%\3%\6"+
		"%\u0110\n%\r%\16%\u0111\5%\u0114\n%\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u011f"+
		"\n&\3\'\3\'\3\'\3\'\3\'\7\'\u0126\n\'\f\'\16\'\u0129\13\'\3\'\3\'\3\'"+
		"\3\'\3\'\3(\3(\3(\3(\7(\u0134\n(\f(\16(\u0137\13(\3(\3(\3(\3(\3)\6)\u013e"+
		"\n)\r)\16)\u013f\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3"+
		"\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\3"+
		"8\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3"+
		"C\4\u0127\u0135\2D\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S\2U\2W\2Y\2[\2]\2_\2a\2c"+
		"\2e\2g\2i\2k\2m\2o\2q\2s\2u\2w\2y\2{\2}\2\177\2\u0081\2\u0083\2\u0085"+
		"\2\3\2\33\5\2\13\f\17\17\"\"\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4"+
		"\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQq"+
		"q\4\2RRrr\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2C\\c|\3\2"+
		"\62;\3\2\63;\2\u0167\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2"+
		"\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q"+
		"\3\2\2\2\3\u0087\3\2\2\2\5\u008b\3\2\2\2\7\u0091\3\2\2\2\t\u0098\3\2\2"+
		"\2\13\u00a0\3\2\2\2\r\u00a8\3\2\2\2\17\u00ad\3\2\2\2\21\u00b2\3\2\2\2"+
		"\23\u00b5\3\2\2\2\25\u00ba\3\2\2\2\27\u00bf\3\2\2\2\31\u00c5\3\2\2\2\33"+
		"\u00cb\3\2\2\2\35\u00d0\3\2\2\2\37\u00d2\3\2\2\2!\u00d4\3\2\2\2#\u00d6"+
		"\3\2\2\2%\u00d8\3\2\2\2\'\u00da\3\2\2\2)\u00dc\3\2\2\2+\u00de\3\2\2\2"+
		"-\u00e0\3\2\2\2/\u00e2\3\2\2\2\61\u00e4\3\2\2\2\63\u00e6\3\2\2\2\65\u00e8"+
		"\3\2\2\2\67\u00ea\3\2\2\29\u00ed\3\2\2\2;\u00f0\3\2\2\2=\u00f3\3\2\2\2"+
		"?\u00f6\3\2\2\2A\u00f8\3\2\2\2C\u00fb\3\2\2\2E\u00fd\3\2\2\2G\u0100\3"+
		"\2\2\2I\u010a\3\2\2\2K\u011e\3\2\2\2M\u0120\3\2\2\2O\u012f\3\2\2\2Q\u013d"+
		"\3\2\2\2S\u0143\3\2\2\2U\u0145\3\2\2\2W\u0147\3\2\2\2Y\u0149\3\2\2\2["+
		"\u014b\3\2\2\2]\u014d\3\2\2\2_\u014f\3\2\2\2a\u0151\3\2\2\2c\u0153\3\2"+
		"\2\2e\u0155\3\2\2\2g\u0157\3\2\2\2i\u0159\3\2\2\2k\u015b\3\2\2\2m\u015d"+
		"\3\2\2\2o\u015f\3\2\2\2q\u0161\3\2\2\2s\u0163\3\2\2\2u\u0165\3\2\2\2w"+
		"\u0167\3\2\2\2y\u0169\3\2\2\2{\u016b\3\2\2\2}\u016d\3\2\2\2\177\u016f"+
		"\3\2\2\2\u0081\u0171\3\2\2\2\u0083\u0173\3\2\2\2\u0085\u0175\3\2\2\2\u0087"+
		"\u0088\5y=\2\u0088\u0089\5S*\2\u0089\u008a\5q9\2\u008a\4\3\2\2\2\u008b"+
		"\u008c\5W,\2\u008c\u008d\5m\67\2\u008d\u008e\5k\66\2\u008e\u008f\5s:\2"+
		"\u008f\u0090\5u;\2\u0090\6\3\2\2\2\u0091\u0092\5q9\2\u0092\u0093\5[.\2"+
		"\u0093\u0094\5u;\2\u0094\u0095\5w<\2\u0095\u0096\5q9\2\u0096\u0097\5k"+
		"\66\2\u0097\b\3\2\2\2\u0098\u0099\5c\62\2\u0099\u009a\5k\66\2\u009a\u009b"+
		"\5u;\2\u009b\u009c\5[.\2\u009c\u009d\5_\60\2\u009d\u009e\5[.\2\u009e\u009f"+
		"\5q9\2\u009f\n\3\2\2\2\u00a0\u00a1\5U+\2\u00a1\u00a2\5m\67\2\u00a2\u00a3"+
		"\5m\67\2\u00a3\u00a4\5g\64\2\u00a4\u00a5\5[.\2\u00a5\u00a6\5S*\2\u00a6"+
		"\u00a7\5k\66\2\u00a7\f\3\2\2\2\u00a8\u00a9\5y=\2\u00a9\u00aa\5m\67\2\u00aa"+
		"\u00ab\5c\62\2\u00ab\u00ac\5Y-\2\u00ac\16\3\2\2\2\u00ad\u00ae\5i\65\2"+
		"\u00ae\u00af\5S*\2\u00af\u00b0\5c\62\2\u00b0\u00b1\5k\66\2\u00b1\20\3"+
		"\2\2\2\u00b2\u00b3\5c\62\2\u00b3\u00b4\5]/\2\u00b4\22\3\2\2\2\u00b5\u00b6"+
		"\5[.\2\u00b6\u00b7\5g\64\2\u00b7\u00b8\5s:\2\u00b8\u00b9\5[.\2\u00b9\24"+
		"\3\2\2\2\u00ba\u00bb\5u;\2\u00bb\u00bc\5q9\2\u00bc\u00bd\5w<\2\u00bd\u00be"+
		"\5[.\2\u00be\26\3\2\2\2\u00bf\u00c0\5]/\2\u00c0\u00c1\5S*\2\u00c1\u00c2"+
		"\5g\64\2\u00c2\u00c3\5s:\2\u00c3\u00c4\5[.\2\u00c4\30\3\2\2\2\u00c5\u00c6"+
		"\5{>\2\u00c6\u00c7\5a\61\2\u00c7\u00c8\5c\62\2\u00c8\u00c9\5g\64\2\u00c9"+
		"\u00ca\5[.\2\u00ca\32\3\2\2\2\u00cb\u00cc\5s:\2\u00cc\u00cd\5e\63\2\u00cd"+
		"\u00ce\5c\62\2\u00ce\u00cf\5o8\2\u00cf\34\3\2\2\2\u00d0\u00d1\7=\2\2\u00d1"+
		"\36\3\2\2\2\u00d2\u00d3\7<\2\2\u00d3 \3\2\2\2\u00d4\u00d5\7.\2\2\u00d5"+
		"\"\3\2\2\2\u00d6\u00d7\7}\2\2\u00d7$\3\2\2\2\u00d8\u00d9\7\177\2\2\u00d9"+
		"&\3\2\2\2\u00da\u00db\7]\2\2\u00db(\3\2\2\2\u00dc\u00dd\7_\2\2\u00dd*"+
		"\3\2\2\2\u00de\u00df\7*\2\2\u00df,\3\2\2\2\u00e0\u00e1\7+\2\2\u00e1.\3"+
		"\2\2\2\u00e2\u00e3\7/\2\2\u00e3\60\3\2\2\2\u00e4\u00e5\7-\2\2\u00e5\62"+
		"\3\2\2\2\u00e6\u00e7\7?\2\2\u00e7\64\3\2\2\2\u00e8\u00e9\7\u0080\2\2\u00e9"+
		"\66\3\2\2\2\u00ea\u00eb\7~\2\2\u00eb\u00ec\7~\2\2\u00ec8\3\2\2\2\u00ed"+
		"\u00ee\7(\2\2\u00ee\u00ef\7(\2\2\u00ef:\3\2\2\2\u00f0\u00f1\7?\2\2\u00f1"+
		"\u00f2\7?\2\2\u00f2<\3\2\2\2\u00f3\u00f4\7#\2\2\u00f4\u00f5\7?\2\2\u00f5"+
		">\3\2\2\2\u00f6\u00f7\7>\2\2\u00f7@\3\2\2\2\u00f8\u00f9\7>\2\2\u00f9\u00fa"+
		"\7?\2\2\u00faB\3\2\2\2\u00fb\u00fc\7@\2\2\u00fcD\3\2\2\2\u00fd\u00fe\7"+
		"@\2\2\u00fe\u00ff\7?\2\2\u00ffF\3\2\2\2\u0100\u0106\5}?\2\u0101\u0105"+
		"\5}?\2\u0102\u0105\5\177@\2\u0103\u0105\5\u0083B\2\u0104\u0101\3\2\2\2"+
		"\u0104\u0102\3\2\2\2\u0104\u0103\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104"+
		"\3\2\2\2\u0106\u0107\3\2\2\2\u0107H\3\2\2\2\u0108\u0106\3\2\2\2\u0109"+
		"\u010b\5/\30\2\u010a\u0109\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u0113\3\2"+
		"\2\2\u010c\u0114\5\177@\2\u010d\u010f\5\u0081A\2\u010e\u0110\5\177@\2"+
		"\u010f\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112"+
		"\3\2\2\2\u0112\u0114\3\2\2\2\u0113\u010c\3\2\2\2\u0113\u010d\3\2\2\2\u0114"+
		"J\3\2\2\2\u0115\u0116\7v\2\2\u0116\u0117\7t\2\2\u0117\u0118\7w\2\2\u0118"+
		"\u011f\7g\2\2\u0119\u011a\7h\2\2\u011a\u011b\7c\2\2\u011b\u011c\7n\2\2"+
		"\u011c\u011d\7u\2\2\u011d\u011f\7g\2\2\u011e\u0115\3\2\2\2\u011e\u0119"+
		"\3\2\2\2\u011fL\3\2\2\2\u0120\u0121\7\61\2\2\u0121\u0122\7,\2\2\u0122"+
		"\u0127\3\2\2\2\u0123\u0126\5M\'\2\u0124\u0126\13\2\2\2\u0125\u0123\3\2"+
		"\2\2\u0125\u0124\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0128\3\2\2\2\u0127"+
		"\u0125\3\2\2\2\u0128\u012a\3\2\2\2\u0129\u0127\3\2\2\2\u012a\u012b\7,"+
		"\2\2\u012b\u012c\7\61\2\2\u012c\u012d\3\2\2\2\u012d\u012e\b\'\2\2\u012e"+
		"N\3\2\2\2\u012f\u0130\7\61\2\2\u0130\u0131\7\61\2\2\u0131\u0135\3\2\2"+
		"\2\u0132\u0134\13\2\2\2\u0133\u0132\3\2\2\2\u0134\u0137\3\2\2\2\u0135"+
		"\u0136\3\2\2\2\u0135\u0133\3\2\2\2\u0136\u0138\3\2\2\2\u0137\u0135\3\2"+
		"\2\2\u0138\u0139\7\f\2\2\u0139\u013a\3\2\2\2\u013a\u013b\b(\2\2\u013b"+
		"P\3\2\2\2\u013c\u013e\t\2\2\2\u013d\u013c\3\2\2\2\u013e\u013f\3\2\2\2"+
		"\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0142"+
		"\b)\2\2\u0142R\3\2\2\2\u0143\u0144\t\3\2\2\u0144T\3\2\2\2\u0145\u0146"+
		"\t\4\2\2\u0146V\3\2\2\2\u0147\u0148\t\5\2\2\u0148X\3\2\2\2\u0149\u014a"+
		"\t\6\2\2\u014aZ\3\2\2\2\u014b\u014c\t\7\2\2\u014c\\\3\2\2\2\u014d\u014e"+
		"\t\b\2\2\u014e^\3\2\2\2\u014f\u0150\t\t\2\2\u0150`\3\2\2\2\u0151\u0152"+
		"\t\n\2\2\u0152b\3\2\2\2\u0153\u0154\t\13\2\2\u0154d\3\2\2\2\u0155\u0156"+
		"\t\f\2\2\u0156f\3\2\2\2\u0157\u0158\t\r\2\2\u0158h\3\2\2\2\u0159\u015a"+
		"\t\16\2\2\u015aj\3\2\2\2\u015b\u015c\t\17\2\2\u015cl\3\2\2\2\u015d\u015e"+
		"\t\20\2\2\u015en\3\2\2\2\u015f\u0160\t\21\2\2\u0160p\3\2\2\2\u0161\u0162"+
		"\t\22\2\2\u0162r\3\2\2\2\u0163\u0164\t\23\2\2\u0164t\3\2\2\2\u0165\u0166"+
		"\t\24\2\2\u0166v\3\2\2\2\u0167\u0168\t\25\2\2\u0168x\3\2\2\2\u0169\u016a"+
		"\t\26\2\2\u016az\3\2\2\2\u016b\u016c\t\27\2\2\u016c|\3\2\2\2\u016d\u016e"+
		"\t\30\2\2\u016e~\3\2\2\2\u016f\u0170\t\31\2\2\u0170\u0080\3\2\2\2\u0171"+
		"\u0172\t\32\2\2\u0172\u0082\3\2\2\2\u0173\u0174\7a\2\2\u0174\u0084\3\2"+
		"\2\2\u0175\u0176\7\60\2\2\u0176\u0086\3\2\2\2\r\2\u0104\u0106\u010a\u0111"+
		"\u0113\u011e\u0125\u0127\u0135\u013f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}