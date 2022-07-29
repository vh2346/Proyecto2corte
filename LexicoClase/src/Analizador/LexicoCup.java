

package Analizador;
import java_cup.runtime.Symbol;


class LexicoCup implements java_cup.runtime.Scanner {

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
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  0,  3,  5,  0,  0,  3,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     3, 40,  6, 26,  0, 25, 38,  7, 41, 42, 35, 33, 48, 34, 47,  4, 
     2,  2,  2,  2,  2,  2,  2,  2,  2,  2, 50, 49, 36, 32, 37,  0, 
     0,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1, 
     1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1, 45,  0, 46,  0,  1, 
     0, 22, 14, 20, 11, 16, 23, 19, 21,  8,  1, 28, 15, 29,  9, 12, 
    31,  1, 18, 17, 10, 13,  1, 27, 30, 24,  1, 43, 39, 44,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\15\2\1\1\1\10\3\2\1\11\1\12\1\13\1\14"+
    "\1\15\1\16\3\17\1\20\1\21\1\22\1\23\1\24"+
    "\1\25\1\26\1\27\1\30\1\31\1\4\1\32\1\2"+
    "\1\33\3\2\1\34\30\2\1\35\3\2\1\36\1\37"+
    "\1\40\1\41\1\42\1\17\1\0\1\43\35\2\1\44"+
    "\5\2\1\0\2\2\1\45\7\2\1\46\1\2\1\47"+
    "\1\50\1\51\1\52\11\2\1\53\1\0\3\2\1\54"+
    "\1\55\2\2\1\56\1\2\1\3\6\2\1\57\1\2"+
    "\1\60\1\61\4\2\1\62\4\2\1\63\1\2\1\64"+
    "\1\0\1\65\1\66\4\2\1\67\1\70\2\2\1\71"+
    "\1\72\1\73\1\74\1\75\1\76\1\77\2\2\1\100"+
    "\1\2\1\101\1\2\1\102\1\103\3\2\1\104\1\2"+
    "\1\105\1\106\1\107\1\110";

  private static int [] zzUnpackAction() {
    int [] result = new int[219];
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
    "\0\0\0\63\0\146\0\231\0\314\0\377\0\63\0\63"+
    "\0\u0132\0\u0165\0\u0198\0\u01cb\0\u01fe\0\u0231\0\u0264\0\u0297"+
    "\0\u02ca\0\u02fd\0\u0330\0\u0363\0\u0396\0\u03c9\0\63\0\u03fc"+
    "\0\u042f\0\u0462\0\u0495\0\u04c8\0\u04fb\0\u052e\0\u0561\0\u0594"+
    "\0\u05c7\0\u05fa\0\u0495\0\u062d\0\63\0\63\0\63\0\63"+
    "\0\63\0\63\0\63\0\63\0\63\0\u0660\0\63\0\u0693"+
    "\0\146\0\u06c6\0\u06f9\0\u072c\0\u075f\0\u0792\0\u07c5\0\u07f8"+
    "\0\u082b\0\u085e\0\u0891\0\u08c4\0\u08f7\0\u092a\0\u095d\0\u0990"+
    "\0\u09c3\0\u09f6\0\u0a29\0\u0a5c\0\u0a8f\0\u0ac2\0\u0af5\0\u0b28"+
    "\0\u0b5b\0\u0b8e\0\u0bc1\0\u0bf4\0\u0c27\0\63\0\u0c5a\0\u0c8d"+
    "\0\u0cc0\0\63\0\63\0\63\0\63\0\u0cf3\0\63\0\u0d26"+
    "\0\146\0\u0d59\0\u0d8c\0\u0dbf\0\u0df2\0\u0e25\0\u0e58\0\u0e8b"+
    "\0\u0ebe\0\u0ef1\0\u0f24\0\u0f57\0\u0f8a\0\u0fbd\0\u0ff0\0\u1023"+
    "\0\u1056\0\u1089\0\u10bc\0\u10ef\0\u1122\0\u1155\0\u1188\0\u11bb"+
    "\0\u11ee\0\u1221\0\u1254\0\u1287\0\u12ba\0\u12ed\0\146\0\u1320"+
    "\0\u1353\0\u1386\0\u13b9\0\u13ec\0\u141f\0\u1452\0\u1485\0\146"+
    "\0\u14b8\0\u14eb\0\u151e\0\u1551\0\u1584\0\u15b7\0\u15ea\0\146"+
    "\0\u161d\0\146\0\146\0\146\0\146\0\u1650\0\u1683\0\u16b6"+
    "\0\u16e9\0\u171c\0\u174f\0\u1782\0\u17b5\0\u17e8\0\146\0\u181b"+
    "\0\u184e\0\u1881\0\u18b4\0\146\0\146\0\u18e7\0\u191a\0\146"+
    "\0\u194d\0\63\0\u1980\0\u19b3\0\u19e6\0\u1a19\0\u1a4c\0\u1a7f"+
    "\0\146\0\u1ab2\0\146\0\146\0\u1ae5\0\u1b18\0\u1b4b\0\u1b7e"+
    "\0\146\0\u1bb1\0\u1be4\0\u1c17\0\u1c4a\0\63\0\u1c7d\0\146"+
    "\0\u1cb0\0\146\0\146\0\u1ce3\0\u1d16\0\u1d49\0\u1d7c\0\146"+
    "\0\146\0\u1daf\0\u1de2\0\146\0\146\0\146\0\63\0\146"+
    "\0\146\0\146\0\u1e15\0\u1e48\0\63\0\u1e7b\0\146\0\u1eae"+
    "\0\146\0\146\0\u1ee1\0\u1f14\0\u1f47\0\63\0\u1f7a\0\146"+
    "\0\146\0\146\0\146";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[219];
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
    "\1\2\1\3\1\4\1\5\1\6\1\5\1\7\1\10"+
    "\1\11\1\12\1\13\1\14\1\3\1\15\1\16\1\17"+
    "\1\20\1\21\1\22\1\23\1\24\2\3\1\25\1\3"+
    "\1\26\1\27\1\30\1\3\1\31\1\3\1\32\1\33"+
    "\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43"+
    "\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53"+
    "\1\54\1\55\64\0\2\3\5\0\21\3\2\0\5\3"+
    "\25\0\1\4\63\0\1\5\1\0\1\5\61\0\1\56"+
    "\33\0\1\57\23\0\2\3\5\0\1\3\1\60\15\3"+
    "\1\61\1\3\2\0\5\3\24\0\2\3\5\0\16\3"+
    "\1\62\2\3\2\0\5\3\24\0\2\3\5\0\12\3"+
    "\1\63\5\3\1\64\2\0\5\3\24\0\2\3\5\0"+
    "\4\3\1\65\3\3\1\66\10\3\2\0\5\3\24\0"+
    "\2\3\5\0\1\3\1\67\7\3\1\70\7\3\2\0"+
    "\5\3\24\0\2\3\5\0\4\3\1\71\5\3\1\72"+
    "\5\3\1\73\2\0\5\3\24\0\2\3\5\0\4\3"+
    "\1\74\14\3\2\0\5\3\24\0\2\3\5\0\1\3"+
    "\1\75\5\3\1\76\11\3\2\0\3\3\1\77\1\3"+
    "\24\0\2\3\5\0\2\3\1\100\11\3\1\101\1\102"+
    "\2\3\1\103\2\0\1\104\4\3\24\0\2\3\5\0"+
    "\10\3\1\105\10\3\2\0\5\3\24\0\2\3\5\0"+
    "\4\3\1\106\14\3\2\0\5\3\24\0\2\3\5\0"+
    "\1\107\3\3\1\110\10\3\1\111\1\112\2\3\2\0"+
    "\5\3\24\0\2\3\5\0\4\3\1\113\2\3\1\114"+
    "\6\3\1\115\2\3\2\0\5\3\33\0\1\116\2\0"+
    "\1\116\5\0\1\116\2\0\1\116\2\0\1\116\10\0"+
    "\1\57\23\0\2\3\5\0\15\3\1\117\3\3\2\0"+
    "\5\3\24\0\2\3\5\0\16\3\1\120\2\3\2\0"+
    "\5\3\24\0\2\3\5\0\12\3\1\121\6\3\2\0"+
    "\5\3\63\0\1\122\62\0\1\57\1\123\61\0\1\57"+
    "\1\0\1\123\60\0\1\57\62\0\1\122\3\0\1\124"+
    "\56\0\1\122\4\0\1\125\16\0\2\126\5\0\21\126"+
    "\2\0\5\126\6\0\1\127\63\0\1\127\55\0\1\130"+
    "\20\0\5\56\1\0\55\56\1\0\2\3\5\0\2\3"+
    "\1\131\11\3\1\132\4\3\2\0\5\3\24\0\2\3"+
    "\5\0\21\3\2\0\2\3\1\133\2\3\24\0\2\3"+
    "\5\0\5\3\1\134\13\3\2\0\5\3\24\0\2\3"+
    "\5\0\21\3\2\0\4\3\1\135\24\0\2\3\5\0"+
    "\5\3\1\136\13\3\2\0\5\3\24\0\2\3\5\0"+
    "\17\3\1\137\1\3\2\0\5\3\24\0\2\3\5\0"+
    "\1\140\10\3\1\141\7\3\2\0\5\3\24\0\2\3"+
    "\5\0\1\142\20\3\2\0\5\3\24\0\2\3\5\0"+
    "\4\3\1\143\14\3\2\0\5\3\24\0\2\3\5\0"+
    "\10\3\1\144\10\3\2\0\5\3\24\0\2\3\5\0"+
    "\2\3\1\145\16\3\2\0\5\3\24\0\2\3\5\0"+
    "\1\3\1\146\17\3\2\0\5\3\24\0\2\3\5\0"+
    "\5\3\1\147\13\3\2\0\5\3\24\0\2\3\5\0"+
    "\11\3\1\150\7\3\2\0\5\3\24\0\2\3\5\0"+
    "\2\3\1\151\16\3\2\0\5\3\24\0\2\3\5\0"+
    "\12\3\1\152\6\3\2\0\5\3\24\0\2\3\5\0"+
    "\16\3\1\153\2\3\2\0\5\3\24\0\2\3\5\0"+
    "\4\3\1\154\14\3\2\0\5\3\24\0\2\3\5\0"+
    "\11\3\1\155\7\3\2\0\5\3\24\0\2\3\5\0"+
    "\1\156\20\3\2\0\5\3\24\0\2\3\5\0\2\3"+
    "\1\157\10\3\1\160\5\3\2\0\5\3\24\0\2\3"+
    "\5\0\2\3\1\161\16\3\2\0\5\3\24\0\2\3"+
    "\5\0\1\3\1\162\17\3\2\0\5\3\24\0\2\3"+
    "\5\0\1\3\1\163\3\3\1\164\13\3\2\0\5\3"+
    "\24\0\2\3\5\0\16\3\1\165\2\3\2\0\5\3"+
    "\24\0\2\3\5\0\11\3\1\166\7\3\2\0\5\3"+
    "\24\0\2\3\5\0\12\3\1\167\6\3\2\0\5\3"+
    "\24\0\2\3\5\0\4\3\1\170\14\3\2\0\5\3"+
    "\24\0\2\3\5\0\7\3\1\171\11\3\2\0\5\3"+
    "\24\0\2\3\5\0\1\172\20\3\2\0\5\3\24\0"+
    "\2\3\5\0\1\173\20\3\2\0\5\3\24\0\2\3"+
    "\5\0\1\174\20\3\2\0\5\3\24\0\2\126\5\0"+
    "\21\126\2\0\5\126\25\0\1\175\61\0\2\3\5\0"+
    "\7\3\1\176\11\3\2\0\5\3\24\0\2\3\5\0"+
    "\10\3\1\177\10\3\2\0\5\3\24\0\2\3\5\0"+
    "\10\3\1\200\10\3\2\0\5\3\24\0\2\3\5\0"+
    "\10\3\1\201\10\3\2\0\5\3\24\0\2\3\5\0"+
    "\6\3\1\202\12\3\2\0\5\3\24\0\2\3\5\0"+
    "\1\203\15\3\1\204\2\3\2\0\5\3\24\0\2\3"+
    "\5\0\4\3\1\205\14\3\2\0\5\3\24\0\2\3"+
    "\5\0\1\206\20\3\2\0\5\3\24\0\2\3\5\0"+
    "\1\3\1\207\17\3\2\0\5\3\24\0\2\3\5\0"+
    "\7\3\1\210\11\3\2\0\5\3\24\0\2\3\5\0"+
    "\16\3\1\211\2\3\2\0\5\3\24\0\2\3\5\0"+
    "\10\3\1\212\10\3\2\0\5\3\24\0\2\3\5\0"+
    "\13\3\1\213\5\3\2\0\5\3\24\0\2\3\5\0"+
    "\21\3\2\0\2\3\1\214\2\3\24\0\2\3\5\0"+
    "\10\3\1\215\10\3\2\0\5\3\24\0\2\3\5\0"+
    "\10\3\1\216\10\3\2\0\5\3\24\0\2\3\5\0"+
    "\1\217\4\3\1\220\13\3\2\0\5\3\24\0\2\3"+
    "\5\0\1\3\1\221\17\3\2\0\5\3\24\0\2\3"+
    "\5\0\12\3\1\222\6\3\2\0\5\3\24\0\2\3"+
    "\5\0\2\3\1\223\16\3\2\0\5\3\24\0\2\3"+
    "\5\0\2\3\1\224\16\3\2\0\5\3\24\0\2\3"+
    "\5\0\5\3\1\225\13\3\2\0\5\3\24\0\2\3"+
    "\5\0\1\226\20\3\2\0\5\3\24\0\2\3\5\0"+
    "\4\3\1\227\14\3\2\0\5\3\24\0\2\3\5\0"+
    "\21\3\2\0\5\3\5\0\1\230\16\0\2\3\5\0"+
    "\2\3\1\231\6\3\1\232\7\3\2\0\5\3\24\0"+
    "\2\3\5\0\2\3\1\233\16\3\2\0\5\3\24\0"+
    "\2\3\5\0\12\3\1\234\6\3\2\0\5\3\24\0"+
    "\2\3\5\0\10\3\1\235\10\3\2\0\5\3\24\0"+
    "\2\3\5\0\16\3\1\236\2\3\2\0\5\3\24\0"+
    "\2\3\5\0\11\3\1\134\7\3\2\0\5\3\24\0"+
    "\2\3\5\0\7\3\1\237\11\3\2\0\5\3\24\0"+
    "\2\3\5\0\1\3\1\240\17\3\2\0\5\3\24\0"+
    "\2\3\5\0\1\3\1\241\17\3\2\0\5\3\25\0"+
    "\1\175\47\0\1\242\11\0\2\3\5\0\5\3\1\243"+
    "\13\3\2\0\5\3\24\0\2\3\5\0\11\3\1\244"+
    "\7\3\2\0\5\3\24\0\2\3\5\0\3\3\1\245"+
    "\15\3\2\0\5\3\24\0\2\3\5\0\7\3\1\246"+
    "\11\3\2\0\5\3\24\0\2\3\5\0\1\3\1\247"+
    "\17\3\2\0\5\3\24\0\2\3\5\0\5\3\1\250"+
    "\13\3\2\0\5\3\24\0\2\3\5\0\1\3\1\251"+
    "\17\3\2\0\5\3\24\0\2\3\5\0\13\3\1\252"+
    "\5\3\2\0\5\3\24\0\2\3\5\0\13\3\1\253"+
    "\5\3\2\0\5\3\24\0\2\3\5\0\21\3\2\0"+
    "\1\3\1\254\3\3\24\0\2\3\5\0\12\3\1\255"+
    "\6\3\2\0\5\3\24\0\2\3\5\0\1\3\1\256"+
    "\17\3\2\0\5\3\24\0\2\3\5\0\14\3\1\257"+
    "\4\3\2\0\5\3\24\0\2\3\5\0\17\3\1\260"+
    "\1\3\2\0\5\3\24\0\2\3\5\0\2\3\1\261"+
    "\16\3\2\0\5\3\24\0\2\3\5\0\10\3\1\262"+
    "\10\3\2\0\5\3\24\0\2\3\5\0\14\3\1\263"+
    "\4\3\2\0\5\3\24\0\2\3\5\0\12\3\1\264"+
    "\6\3\2\0\5\3\24\0\2\3\5\0\11\3\1\265"+
    "\7\3\2\0\5\3\70\0\1\266\16\0\2\3\5\0"+
    "\1\267\20\3\2\0\5\3\24\0\2\3\5\0\2\3"+
    "\1\270\16\3\2\0\5\3\24\0\2\3\5\0\21\3"+
    "\2\0\5\3\4\0\1\271\17\0\2\3\5\0\2\3"+
    "\1\272\16\3\2\0\5\3\24\0\2\3\5\0\10\3"+
    "\1\273\10\3\2\0\5\3\24\0\2\3\5\0\2\3"+
    "\1\274\16\3\2\0\5\3\24\0\2\3\5\0\3\3"+
    "\1\275\15\3\2\0\5\3\24\0\2\3\5\0\21\3"+
    "\2\0\4\3\1\276\24\0\2\3\5\0\10\3\1\277"+
    "\10\3\2\0\5\3\24\0\2\3\5\0\10\3\1\300"+
    "\10\3\2\0\5\3\24\0\2\3\5\0\10\3\1\301"+
    "\10\3\2\0\5\3\24\0\2\3\5\0\7\3\1\302"+
    "\11\3\2\0\5\3\24\0\2\3\5\0\1\3\1\303"+
    "\17\3\2\0\5\3\24\0\2\3\5\0\1\3\1\304"+
    "\17\3\2\0\5\3\24\0\2\3\5\0\13\3\1\305"+
    "\5\3\2\0\5\3\24\0\2\3\5\0\2\3\1\306"+
    "\16\3\2\0\5\3\24\0\2\3\5\0\21\3\2\0"+
    "\5\3\11\0\1\307\12\0\2\3\5\0\21\3\2\0"+
    "\2\3\1\310\2\3\24\0\2\3\5\0\15\3\1\311"+
    "\3\3\2\0\5\3\24\0\2\3\5\0\1\3\1\312"+
    "\17\3\2\0\5\3\24\0\2\3\5\0\2\3\1\313"+
    "\16\3\2\0\5\3\24\0\2\3\5\0\1\3\1\314"+
    "\17\3\2\0\5\3\67\0\1\315\17\0\2\3\5\0"+
    "\17\3\1\316\1\3\2\0\5\3\24\0\2\3\5\0"+
    "\10\3\1\317\10\3\2\0\5\3\24\0\2\3\5\0"+
    "\16\3\1\320\2\3\2\0\5\3\24\0\2\3\5\0"+
    "\17\3\1\321\1\3\2\0\5\3\24\0\2\3\5\0"+
    "\2\3\1\322\16\3\2\0\5\3\24\0\2\3\5\0"+
    "\10\3\1\323\10\3\2\0\5\3\24\0\2\3\5\0"+
    "\10\3\1\324\10\3\2\0\5\3\24\0\2\3\5\0"+
    "\5\3\1\325\13\3\2\0\5\3\24\0\2\3\5\0"+
    "\21\3\2\0\5\3\11\0\1\326\12\0\2\3\5\0"+
    "\14\3\1\327\4\3\2\0\5\3\24\0\2\3\5\0"+
    "\3\3\1\330\15\3\2\0\5\3\24\0\2\3\5\0"+
    "\12\3\1\331\6\3\2\0\5\3\24\0\2\3\5\0"+
    "\10\3\1\332\10\3\2\0\5\3\24\0\2\3\5\0"+
    "\10\3\1\333\10\3\2\0\5\3\23\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[8109];
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
    "\1\0\1\11\4\1\2\11\16\1\1\11\15\1\11\11"+
    "\1\1\1\11\36\1\1\11\3\1\4\11\1\1\1\11"+
    "\1\0\44\1\1\0\32\1\1\0\11\1\1\11\23\1"+
    "\1\11\2\1\1\0\15\1\1\11\5\1\1\11\10\1"+
    "\1\11\5\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[219];
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
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  LexicoCup(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  LexicoCup(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
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
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
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

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
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
        case 70: 
          { return new Symbol(sym.Register, yychar, yyline, yytext());
          }
        case 73: break;
        case 6: 
          { return new Symbol(sym.Comillas, yychar, yyline, yytext());
          }
        case 74: break;
        case 51: 
          { return new Symbol(sym.Cin, yychar, yyline, yytext());
          }
        case 75: break;
        case 36: 
          { return new Symbol(sym.For, yychar, yyline, yytext());
          }
        case 76: break;
        case 32: 
          { return new Symbol(sym.Op_cout, yychar, yyline, yytext());
          }
        case 77: break;
        case 30: 
          { return new Symbol(sym.Op_relacional, yychar, yyline, yytext());
          }
        case 78: break;
        case 39: 
          { return new Symbol(sym.T_dato, yychar, yyline, yytext());
          }
        case 79: break;
        case 56: 
          { return new Symbol(sym.Define, yychar, yyline, yytext());
          }
        case 80: break;
        case 37: 
          { return new Symbol(sym.Op_booleano, yychar, yyline, yytext());
          }
        case 81: break;
        case 53: 
          { return new Symbol(sym.Float, yychar, yyline, yytext());
          }
        case 82: break;
        case 33: 
          { return new Symbol(sym.Op_cin, yychar, yyline, yytext());
          }
        case 83: break;
        case 15: 
          { return new Symbol(sym.Op_logico, yychar, yyline, yytext());
          }
        case 84: break;
        case 23: 
          { return new Symbol(sym.Coma, yychar, yyline, yytext());
          }
        case 85: break;
        case 67: 
          { return new Symbol(sym.Default, yychar, yyline, yytext());
          }
        case 86: break;
        case 46: 
          { return new Symbol(sym.Main, yychar, yyline, yytext());
          }
        case 87: break;
        case 18: 
          { return new Symbol(sym.Llave_a, yychar, yyline, yytext());
          }
        case 88: break;
        case 17: 
          { return new Symbol(sym.Parent_c, yychar, yyline, yytext());
          }
        case 89: break;
        case 49: 
          { return new Symbol(sym.Break, yychar, yyline, yytext());
          }
        case 90: break;
        case 4: 
          { /*Ignore*/
          }
        case 91: break;
        case 58: 
          { return new Symbol(sym.Cadena, yychar, yyline, yytext());
          }
        case 92: break;
        case 62: 
          { return new Symbol(sym.Switch, yychar, yyline, yytext());
          }
        case 93: break;
        case 34: 
          { return new Symbol(sym.Apuntador, yychar, yyline, yytext());
          }
        case 94: break;
        case 24: 
          { return new Symbol(sym.P_coma, yychar, yyline, yytext());
          }
        case 95: break;
        case 12: 
          { return new Symbol(sym.Multiplicacion, yychar, yyline, yytext());
          }
        case 96: break;
        case 71: 
          { return new Symbol(sym.Continue, yychar, yyline, yytext());
          }
        case 97: break;
        case 29: 
          { return new Symbol(sym.Marca_printf, yychar, yyline, yytext());
          }
        case 98: break;
        case 61: 
          { return new Symbol(sym.System_r, yychar, yyline, yytext());
          }
        case 99: break;
        case 1: 
          { return new Symbol(sym.ERROR, yychar, yyline, yytext());
          }
        case 100: break;
        case 64: 
          { return new Symbol(sym.Cout, yychar, yyline, yytext());
          }
        case 101: break;
        case 72: 
          { return new Symbol(sym.Namespace, yychar, yyline, yytext());
          }
        case 102: break;
        case 57: 
          { return new Symbol(sym.Extern, yychar, yyline, yytext());
          }
        case 103: break;
        case 7: 
          { return new Symbol(sym.Comilla_simple, yychar, yyline, yytext());
          }
        case 104: break;
        case 26: 
          { return new Symbol(sym.Op_atribucion, yychar, yyline, yytext());
          }
        case 105: break;
        case 43: 
          { return new Symbol(sym.GoTo, yychar, yyline, yytext());
          }
        case 106: break;
        case 41: 
          { return new Symbol(sym.Enum, yychar, yyline, yytext());
          }
        case 107: break;
        case 9: 
          { return new Symbol(sym.Igual, yychar, yyline, yytext());
          }
        case 108: break;
        case 45: 
          { return new Symbol(sym.Case, yychar, yyline, yytext());
          }
        case 109: break;
        case 8: 
          { return new Symbol(sym.Numeral, yychar, yyline, yytext());
          }
        case 110: break;
        case 2: 
          { return new Symbol(sym.Identificador, yychar, yyline, yytext());
          }
        case 111: break;
        case 21: 
          { return new Symbol(sym.Corchete_c, yychar, yyline, yytext());
          }
        case 112: break;
        case 42: 
          { return new Symbol(sym.Else, yychar, yyline, yytext());
          }
        case 113: break;
        case 35: 
          { return new Symbol(sym.Int, yychar, yyline, yytext());
          }
        case 114: break;
        case 60: 
          { return new Symbol(sym.Scanf, yychar, yyline, yytext());
          }
        case 115: break;
        case 69: 
          { return new Symbol(sym.Unsigned, yychar, yyline, yytext());
          }
        case 116: break;
        case 48: 
          { return new Symbol(sym.Using, yychar, yyline, yytext());
          }
        case 117: break;
        case 10: 
          { return new Symbol(sym.Suma, yychar, yyline, yytext());
          }
        case 118: break;
        case 13: 
          { return new Symbol(sym.Menor, yychar, yyline, yytext());
          }
        case 119: break;
        case 50: 
          { return new Symbol(sym.Short, yychar, yyline, yytext());
          }
        case 120: break;
        case 59: 
          { return new Symbol(sym.Struct, yychar, yyline, yytext());
          }
        case 121: break;
        case 14: 
          { return new Symbol(sym.Mayor, yychar, yyline, yytext());
          }
        case 122: break;
        case 65: 
          { return new Symbol(sym.Include, yychar, yyline, yytext());
          }
        case 123: break;
        case 27: 
          { return new Symbol(sym.If, yychar, yyline, yytext());
          }
        case 124: break;
        case 19: 
          { return new Symbol(sym.Llave_c, yychar, yyline, yytext());
          }
        case 125: break;
        case 38: 
          { return new Symbol(sym.Bool, yychar, yyline, yytext());
          }
        case 126: break;
        case 22: 
          { return new Symbol(sym.Punto, yychar, yyline, yytext());
          }
        case 127: break;
        case 47: 
          { return new Symbol(sym.Union, yychar, yyline, yytext());
          }
        case 128: break;
        case 16: 
          { return new Symbol(sym.Parent_a, yychar, yyline, yytext());
          }
        case 129: break;
        case 55: 
          { return new Symbol(sym.Double, yychar, yyline, yytext());
          }
        case 130: break;
        case 28: 
          { return new Symbol(sym.Do, yychar, yyline, yytext());
          }
        case 131: break;
        case 5: 
          { return new Symbol(sym.Division, yychar, yyline, yytext());
          }
        case 132: break;
        case 31: 
          { return new Symbol(sym.Op_incremento, yychar, yyline, yytext());
          }
        case 133: break;
        case 11: 
          { return new Symbol(sym.Resta, yychar, yyline, yytext());
          }
        case 134: break;
        case 52: 
          { return new Symbol(sym.Const, yychar, yyline, yytext());
          }
        case 135: break;
        case 63: 
          { return new Symbol(sym.Return, yychar, yyline, yytext());
          }
        case 136: break;
        case 54: 
          { return new Symbol(sym.While, yychar, yyline, yytext());
          }
        case 137: break;
        case 3: 
          { return new Symbol(sym.Numero, yychar, yyline, yytext());
          }
        case 138: break;
        case 68: 
          { return new Symbol(sym.Printf, yychar, yyline, yytext());
          }
        case 139: break;
        case 44: 
          { return new Symbol(sym.Char, yychar, yyline, yytext());
          }
        case 140: break;
        case 66: 
          { return new Symbol(sym.Typedef, yychar, yyline, yytext());
          }
        case 141: break;
        case 25: 
          { return new Symbol(sym.Dos_puntos, yychar, yyline, yytext());
          }
        case 142: break;
        case 40: 
          { return new Symbol(sym.Long, yychar, yyline, yytext());
          }
        case 143: break;
        case 20: 
          { return new Symbol(sym.Corchete_a, yychar, yyline, yytext());
          }
        case 144: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
