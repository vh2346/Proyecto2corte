

package Analizador;
import static Analizador.Tokens.*;


class Lexico {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\5\2\0\1\3\22\0\1\3\1\47\1\6\1\10"+
    "\1\0\1\50\1\45\1\7\1\37\1\51\1\50\1\43\1\55\1\44"+
    "\1\54\1\4\12\2\1\57\1\56\1\41\1\42\1\40\2\0\32\1"+
    "\4\0\1\1\1\0\1\30\1\26\1\13\1\16\1\17\1\20\1\24"+
    "\1\27\1\11\1\1\1\33\1\14\1\34\1\12\1\25\1\36\1\1"+
    "\1\23\1\21\1\22\1\15\1\1\1\32\1\35\1\31\1\1\1\52"+
    "\1\46\1\53\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\1\1\5\1\6"+
    "\1\7\1\10\17\2\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\3\17\1\1\1\20\1\21\1\22\1\23\1\24"+
    "\1\25\1\26\1\4\1\27\1\2\1\30\7\2\1\31"+
    "\24\2\1\0\1\32\1\33\1\34\1\35\1\17\1\2"+
    "\1\36\16\2\1\37\20\2\1\0\1\2\1\0\3\2"+
    "\1\40\1\41\1\42\5\2\1\43\1\44\7\2\1\45"+
    "\3\2\1\46\1\2\1\47\1\50\1\2\1\51\1\2"+
    "\1\3\1\2\1\52\1\53\1\2\1\0\1\54\5\2"+
    "\1\55\3\2\1\56\4\2\1\57\1\60\3\2\1\61"+
    "\1\2\1\62\1\2\1\63\1\64\1\65\1\66\1\67"+
    "\1\70\1\2\1\71\2\2\1\72\2\2\1\73\1\74"+
    "\1\2\1\75\1\76\1\77\1\100";

  private static int [] zzUnpackAction() {
    int [] result = new int[197];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\60\0\140\0\220\0\300\0\360\0\60\0\60"+
    "\0\60\0\60\0\u0120\0\u0150\0\u0180\0\u01b0\0\u01e0\0\u0210"+
    "\0\u0240\0\u0270\0\u02a0\0\u02d0\0\u0300\0\u0330\0\u0360\0\u0390"+
    "\0\u03c0\0\u03f0\0\u0420\0\u0450\0\u0480\0\u04b0\0\u04e0\0\u0510"+
    "\0\u0540\0\u0480\0\u0570\0\60\0\60\0\60\0\60\0\60"+
    "\0\60\0\60\0\u05a0\0\60\0\u05d0\0\140\0\u0600\0\u0630"+
    "\0\u0660\0\u0690\0\u06c0\0\u06f0\0\u0720\0\u0750\0\u0780\0\u07b0"+
    "\0\u07e0\0\u0810\0\u0840\0\u0870\0\u08a0\0\u08d0\0\u0900\0\u0930"+
    "\0\u0960\0\u0990\0\u09c0\0\u09f0\0\u0a20\0\u0a50\0\u0a80\0\u0ab0"+
    "\0\u0ae0\0\u0b10\0\u0b40\0\60\0\60\0\60\0\60\0\60"+
    "\0\u0b70\0\140\0\u0ba0\0\u0bd0\0\u0c00\0\u0c30\0\u0c60\0\u0c90"+
    "\0\u0cc0\0\u0cf0\0\u0d20\0\u0d50\0\u0d80\0\u0db0\0\u0de0\0\u0e10"+
    "\0\140\0\u0e40\0\u0e70\0\u0ea0\0\u0ed0\0\u0f00\0\u0f30\0\u0f60"+
    "\0\u0f90\0\u0fc0\0\u0ff0\0\u1020\0\u1050\0\u1080\0\u10b0\0\u10e0"+
    "\0\u1110\0\u1140\0\u1170\0\u11a0\0\u11d0\0\u1200\0\u1230\0\140"+
    "\0\140\0\140\0\u1260\0\u1290\0\u12c0\0\u12f0\0\u1320\0\140"+
    "\0\140\0\u1350\0\u1380\0\u13b0\0\u13e0\0\u1410\0\u1440\0\u1470"+
    "\0\140\0\u14a0\0\u14d0\0\u1500\0\140\0\u1530\0\140\0\140"+
    "\0\u1560\0\140\0\u1590\0\60\0\u15c0\0\60\0\140\0\u15f0"+
    "\0\u1620\0\140\0\u1650\0\u1680\0\u16b0\0\u16e0\0\u1710\0\140"+
    "\0\u1740\0\u1770\0\u17a0\0\140\0\u17d0\0\u1800\0\u1830\0\u1860"+
    "\0\140\0\140\0\u1890\0\u18c0\0\u18f0\0\60\0\u1920\0\140"+
    "\0\u1950\0\140\0\140\0\60\0\140\0\140\0\140\0\u1980"+
    "\0\140\0\u19b0\0\u19e0\0\140\0\u1a10\0\u1a40\0\140\0\140"+
    "\0\u1a70\0\60\0\140\0\140\0\140";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[197];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\3\1\14\1\15\1\16\1\17\1\20"+
    "\1\21\1\22\1\23\1\24\1\25\1\3\1\26\3\3"+
    "\1\27\1\3\1\30\1\3\1\31\1\32\1\33\1\34"+
    "\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44"+
    "\1\45\1\46\1\47\1\50\1\51\1\52\61\0\2\3"+
    "\6\0\26\3\23\0\1\4\60\0\1\5\60\0\1\53"+
    "\35\0\1\54\16\0\2\3\6\0\1\3\1\55\5\3"+
    "\1\56\16\3\22\0\2\3\6\0\1\57\13\3\1\60"+
    "\1\3\1\61\1\62\6\3\22\0\2\3\6\0\14\3"+
    "\1\63\11\3\22\0\2\3\6\0\1\3\1\64\24\3"+
    "\22\0\2\3\6\0\6\3\1\65\5\3\1\66\11\3"+
    "\22\0\2\3\6\0\1\3\1\67\1\3\1\70\20\3"+
    "\1\71\1\3\22\0\2\3\6\0\3\3\1\72\10\3"+
    "\1\73\2\3\1\74\6\3\22\0\2\3\6\0\2\3"+
    "\1\75\6\3\1\76\4\3\1\77\2\3\1\100\4\3"+
    "\22\0\2\3\6\0\12\3\1\101\5\3\1\102\5\3"+
    "\22\0\2\3\6\0\6\3\1\103\17\3\22\0\2\3"+
    "\6\0\14\3\1\104\11\3\22\0\2\3\6\0\12\3"+
    "\1\105\1\3\1\106\3\3\1\107\5\3\22\0\2\3"+
    "\6\0\16\3\1\110\7\3\22\0\2\3\6\0\17\3"+
    "\1\111\6\3\22\0\2\3\6\0\12\3\1\112\13\3"+
    "\65\0\1\113\53\0\1\114\1\0\1\115\56\0\1\116"+
    "\1\115\57\0\1\115\57\0\1\54\1\117\56\0\1\54"+
    "\1\0\1\117\60\0\1\120\60\0\1\120\53\0\1\54"+
    "\15\0\5\53\1\0\52\53\1\0\2\3\6\0\2\3"+
    "\1\121\6\3\1\122\14\3\22\0\2\3\6\0\1\3"+
    "\1\123\24\3\22\0\2\3\6\0\1\3\1\124\2\3"+
    "\1\125\21\3\22\0\2\3\6\0\17\3\1\126\6\3"+
    "\22\0\2\3\6\0\10\3\1\127\15\3\22\0\2\3"+
    "\6\0\1\3\1\130\24\3\22\0\2\3\6\0\1\131"+
    "\7\3\1\132\15\3\22\0\2\3\6\0\7\3\1\133"+
    "\16\3\22\0\2\3\6\0\4\3\1\134\21\3\22\0"+
    "\2\3\6\0\4\3\1\135\21\3\22\0\2\3\6\0"+
    "\10\3\1\136\15\3\22\0\2\3\6\0\11\3\1\137"+
    "\14\3\22\0\2\3\6\0\14\3\1\140\11\3\22\0"+
    "\2\3\6\0\12\3\1\141\13\3\22\0\2\3\6\0"+
    "\3\3\1\142\22\3\22\0\2\3\6\0\17\3\1\143"+
    "\6\3\22\0\2\3\6\0\12\3\1\144\13\3\22\0"+
    "\2\3\6\0\14\3\1\145\11\3\22\0\2\3\6\0"+
    "\1\146\25\3\22\0\2\3\6\0\4\3\1\147\21\3"+
    "\22\0\2\3\6\0\25\3\1\150\22\0\2\3\6\0"+
    "\11\3\1\151\1\3\1\152\12\3\22\0\2\3\6\0"+
    "\11\3\1\153\14\3\22\0\2\3\6\0\6\3\1\154"+
    "\17\3\22\0\2\3\6\0\14\3\1\155\11\3\22\0"+
    "\2\3\6\0\11\3\1\156\14\3\22\0\2\3\6\0"+
    "\1\157\25\3\22\0\2\3\6\0\1\160\25\3\22\0"+
    "\2\3\6\0\1\161\25\3\23\0\1\162\56\0\2\3"+
    "\6\0\3\3\1\163\22\3\22\0\2\3\6\0\26\3"+
    "\1\0\1\164\20\0\2\3\6\0\10\3\1\165\1\166"+
    "\14\3\22\0\2\3\6\0\11\3\1\167\14\3\22\0"+
    "\2\3\6\0\12\3\1\170\13\3\22\0\2\3\6\0"+
    "\6\3\1\171\17\3\22\0\2\3\6\0\13\3\1\172"+
    "\12\3\22\0\2\3\6\0\14\3\1\173\11\3\22\0"+
    "\2\3\6\0\1\174\25\3\22\0\2\3\6\0\1\175"+
    "\16\3\1\176\6\3\22\0\2\3\6\0\15\3\1\177"+
    "\10\3\22\0\2\3\6\0\23\3\1\200\2\3\22\0"+
    "\2\3\6\0\6\3\1\201\17\3\22\0\2\3\6\0"+
    "\6\3\1\202\17\3\22\0\2\3\6\0\17\3\1\203"+
    "\6\3\22\0\2\3\6\0\10\3\1\147\15\3\22\0"+
    "\2\3\6\0\1\3\1\204\24\3\22\0\2\3\6\0"+
    "\1\205\3\3\1\206\21\3\22\0\2\3\6\0\12\3"+
    "\1\207\13\3\22\0\2\3\6\0\11\3\1\210\14\3"+
    "\22\0\2\3\6\0\6\3\1\211\17\3\22\0\2\3"+
    "\6\0\6\3\1\212\17\3\22\0\2\3\6\0\4\3"+
    "\1\213\21\3\22\0\2\3\6\0\1\214\25\3\22\0"+
    "\2\3\6\0\14\3\1\215\11\3\22\0\2\3\6\0"+
    "\17\3\1\216\6\3\22\0\2\3\6\0\3\3\1\217"+
    "\22\3\22\0\2\3\6\0\6\3\1\220\17\3\22\0"+
    "\2\3\6\0\3\3\1\221\22\3\22\0\2\3\6\0"+
    "\1\3\1\222\24\3\22\0\2\3\6\0\1\3\1\223"+
    "\24\3\23\0\1\162\46\0\1\224\7\0\2\3\6\0"+
    "\4\3\1\225\21\3\61\0\1\226\20\0\2\3\6\0"+
    "\11\3\1\227\14\3\22\0\2\3\6\0\1\230\25\3"+
    "\22\0\2\3\6\0\26\3\2\0\1\231\17\0\2\3"+
    "\6\0\1\3\1\232\24\3\22\0\2\3\6\0\13\3"+
    "\1\233\12\3\22\0\2\3\6\0\1\3\1\234\24\3"+
    "\22\0\2\3\6\0\4\3\1\235\21\3\22\0\2\3"+
    "\6\0\3\3\1\236\22\3\22\0\2\3\6\0\12\3"+
    "\1\237\13\3\22\0\2\3\6\0\11\3\1\240\14\3"+
    "\22\0\2\3\6\0\7\3\1\241\16\3\22\0\2\3"+
    "\6\0\1\3\1\242\24\3\22\0\2\3\6\0\2\3"+
    "\1\243\23\3\22\0\2\3\6\0\11\3\1\244\14\3"+
    "\22\0\2\3\6\0\2\3\1\245\23\3\22\0\2\3"+
    "\6\0\5\3\1\246\20\3\22\0\2\3\6\0\12\3"+
    "\1\247\13\3\22\0\2\3\6\0\10\3\1\250\15\3"+
    "\22\0\2\3\6\0\22\3\1\251\3\3\22\0\2\3"+
    "\6\0\6\3\1\252\17\3\22\0\2\3\6\0\11\3"+
    "\1\253\14\3\22\0\2\3\6\0\5\3\1\254\20\3"+
    "\22\0\2\3\6\0\1\3\1\255\24\3\62\0\1\256"+
    "\17\0\2\3\6\0\1\3\1\257\24\3\22\0\2\3"+
    "\6\0\6\3\1\260\17\3\22\0\2\3\6\0\3\3"+
    "\1\261\22\3\22\0\2\3\6\0\6\3\1\262\17\3"+
    "\22\0\2\3\6\0\1\3\1\263\24\3\22\0\2\3"+
    "\6\0\26\3\1\264\21\0\2\3\6\0\13\3\1\265"+
    "\12\3\22\0\2\3\6\0\11\3\1\266\14\3\22\0"+
    "\2\3\6\0\16\3\1\267\7\3\22\0\2\3\6\0"+
    "\6\3\1\270\17\3\22\0\2\3\6\0\1\3\1\271"+
    "\24\3\22\0\2\3\6\0\11\3\1\272\14\3\22\0"+
    "\2\3\6\0\7\3\1\273\16\3\22\0\2\3\6\0"+
    "\6\3\1\274\17\3\22\0\2\3\6\0\4\3\1\275"+
    "\21\3\22\0\2\3\6\0\6\3\1\276\17\3\22\0"+
    "\2\3\6\0\11\3\1\277\14\3\22\0\2\3\6\0"+
    "\7\3\1\300\16\3\22\0\2\3\6\0\6\3\1\301"+
    "\17\3\22\0\2\3\6\0\26\3\1\302\21\0\2\3"+
    "\6\0\6\3\1\303\17\3\22\0\2\3\6\0\5\3"+
    "\1\304\20\3\22\0\2\3\6\0\12\3\1\305\13\3"+
    "\21\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[6816];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\4\1\4\11\31\1\7\11\1\1\1\11"+
    "\36\1\1\0\5\11\41\1\1\0\1\1\1\0\37\1"+
    "\1\11\1\1\1\11\2\1\1\0\24\1\1\11\5\1"+
    "\1\11\15\1\1\11\3\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[197];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    public String lexemas;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexico(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Lexico(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 126) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Tokens yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 20: 
          { lexemas=yytext(); return Coma;
          }
        case 65: break;
        case 18: 
          { lexemas=yytext(); return Llave_c;
          }
        case 66: break;
        case 44: 
          { lexemas=yytext(); return Union;
          }
        case 67: break;
        case 31: 
          { lexemas=yytext(); return For;
          }
        case 68: break;
        case 6: 
          { lexemas=yytext(); return Comillas;
          }
        case 69: break;
        case 47: 
          { lexemas=yytext(); return Break;
          }
        case 70: break;
        case 43: 
          { lexemas=yytext(); return Const;
          }
        case 71: break;
        case 40: 
          { lexemas=yytext(); return T_dato;
          }
        case 72: break;
        case 13: 
          { lexemas=yytext(); return Suma;
          }
        case 73: break;
        case 11: 
          { lexemas=yytext(); return Menor;
          }
        case 74: break;
        case 25: 
          { lexemas=yytext(); return Do;
          }
        case 75: break;
        case 56: 
          { lexemas=yytext(); return Switch;
          }
        case 76: break;
        case 5: 
          { return Linea;
          }
        case 77: break;
        case 35: 
          { lexemas=yytext(); return Enum;
          }
        case 78: break;
        case 59: 
          { lexemas=yytext(); return Default;
          }
        case 79: break;
        case 8: 
          { lexemas=yytext(); return Numeral;
          }
        case 80: break;
        case 36: 
          { lexemas=yytext(); return Else;
          }
        case 81: break;
        case 38: 
          { lexemas=yytext(); return GoTo;
          }
        case 82: break;
        case 63: 
          { lexemas=yytext(); return Unsigned;
          }
        case 83: break;
        case 21: 
          { lexemas=yytext(); return P_Coma;
          }
        case 84: break;
        case 51: 
          { lexemas=yytext(); return Double;
          }
        case 85: break;
        case 33: 
          { lexemas=yytext(); return Case;
          }
        case 86: break;
        case 9: 
          { lexemas=yytext(); return Parent_a;
          }
        case 87: break;
        case 53: 
          { lexemas=yytext(); return Scanf;
          }
        case 88: break;
        case 39: 
          { lexemas=yytext(); return Bool;
          }
        case 89: break;
        case 34: 
          { lexemas=yytext(); return Long;
          }
        case 90: break;
        case 22: 
          { lexemas=yytext(); return Dos_puntos;
          }
        case 91: break;
        case 24: 
          { lexemas=yytext(); return If;
          }
        case 92: break;
        case 28: 
          { lexemas = yytext(); return Op_cout;
          }
        case 93: break;
        case 57: 
          { lexemas=yytext(); return Return;
          }
        case 94: break;
        case 15: 
          { lexemas=yytext(); return Op_logico;
          }
        case 95: break;
        case 26: 
          { lexemas = yytext(); return Op_cin;
          }
        case 96: break;
        case 62: 
          { lexemas=yytext(); return Continue;
          }
        case 97: break;
        case 7: 
          { lexemas=yytext(); return Comilla_simple;
          }
        case 98: break;
        case 16: 
          { lexemas=yytext(); return Parent_c;
          }
        case 99: break;
        case 55: 
          { lexemas=yytext(); return Struct;
          }
        case 100: break;
        case 17: 
          { lexemas=yytext(); return Llave_a;
          }
        case 101: break;
        case 2: 
          { lexemas=yytext(); return Identificador;
          }
        case 102: break;
        case 27: 
          { lexemas = yytext(); return Op_relacional;
          }
        case 103: break;
        case 19: 
          { lexemas=yytext(); return Punto;
          }
        case 104: break;
        case 23: 
          { lexemas = yytext(); return Op_atribucion;
          }
        case 105: break;
        case 14: 
          { lexemas=yytext(); return Resta;
          }
        case 106: break;
        case 10: 
          { lexemas=yytext(); return Mayor;
          }
        case 107: break;
        case 30: 
          { lexemas=yytext(); return Int;
          }
        case 108: break;
        case 29: 
          { lexemas = yytext(); return Op_incremento;
          }
        case 109: break;
        case 41: 
          { lexemas=yytext(); return Main;
          }
        case 110: break;
        case 52: 
          { lexemas=yytext(); return Extern;
          }
        case 111: break;
        case 46: 
          { lexemas=yytext(); return Short;
          }
        case 112: break;
        case 42: 
          { lexemas=yytext(); return Cin;
          }
        case 113: break;
        case 61: 
          { lexemas=yytext(); return Printf;
          }
        case 114: break;
        case 1: 
          { return ERROR;
          }
        case 115: break;
        case 3: 
          { lexemas=yytext(); return Numero;
          }
        case 116: break;
        case 50: 
          { lexemas=yytext(); return Define;
          }
        case 117: break;
        case 64: 
          { lexemas=yytext(); return Register;
          }
        case 118: break;
        case 49: 
          { lexemas=yytext(); return Cout;
          }
        case 119: break;
        case 4: 
          { /*Ignore*/
          }
        case 120: break;
        case 58: 
          { lexemas=yytext(); return Include;
          }
        case 121: break;
        case 12: 
          { lexemas=yytext(); return Igual;
          }
        case 122: break;
        case 45: 
          { lexemas=yytext(); return Float;
          }
        case 123: break;
        case 60: 
          { lexemas=yytext(); return Typedef;
          }
        case 124: break;
        case 54: 
          { lexemas=yytext(); return Cadena;
          }
        case 125: break;
        case 48: 
          { lexemas=yytext(); return While;
          }
        case 126: break;
        case 37: 
          { lexemas=yytext(); return Op_booleano;
          }
        case 127: break;
        case 32: 
          { lexemas=yytext(); return Char;
          }
        case 128: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
