

package Analizador;

import java_cup.runtime.Symbol;


public class Sintax extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public Sintax() {super();}

  /** Constructor which sets the default scanner. */
  public Sintax(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Sintax(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\047\000\002\002\004\000\002\002\011\000\002\002" +
    "\010\000\002\003\004\000\002\003\003\000\002\003\004" +
    "\000\002\003\003\000\002\003\004\000\002\003\003\000" +
    "\002\003\004\000\002\003\003\000\002\003\005\000\002" +
    "\003\004\000\002\003\003\000\002\004\005\000\002\004" +
    "\007\000\002\004\007\000\002\004\006\000\002\004\006" +
    "\000\002\004\010\000\002\004\010\000\002\004\011\000" +
    "\002\004\011\000\002\006\011\000\002\014\003\000\002" +
    "\014\005\000\002\014\005\000\002\014\005\000\002\014" +
    "\006\000\002\014\007\000\002\007\015\000\002\011\011" +
    "\000\002\012\013\000\002\013\011\000\002\015\012\000" +
    "\002\015\011\000\002\005\005\000\002\005\004\000\002" +
    "\005\004" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\173\000\006\015\006\036\004\001\002\000\004\030" +
    "\171\001\002\000\004\002\170\001\002\000\004\036\007" +
    "\001\002\000\004\030\010\001\002\000\004\031\011\001" +
    "\002\000\004\032\012\001\002\000\014\006\021\007\020" +
    "\010\015\013\014\014\025\001\002\000\020\006\ufff7\007" +
    "\ufff7\010\ufff7\012\ufff7\013\ufff7\014\ufff7\033\ufff7\001\002" +
    "\000\004\030\162\001\002\000\004\030\150\001\002\000" +
    "\020\006\ufff4\007\ufff4\010\ufff4\012\ufff4\013\ufff4\014\ufff4" +
    "\033\ufff4\001\002\000\020\006\ufffd\007\ufffd\010\ufffd\012" +
    "\ufffd\013\ufffd\014\ufffd\033\ufffd\001\002\000\004\040\131" +
    "\001\002\000\006\026\114\040\115\001\002\000\020\006" +
    "\ufff9\007\ufff9\010\ufff9\012\ufff9\013\ufff9\014\ufff9\033\ufff9" +
    "\001\002\000\020\006\ufffb\007\ufffb\010\ufffb\012\ufffb\013" +
    "\ufffb\014\ufffb\033\ufffb\001\002\000\020\006\021\007\020" +
    "\010\015\012\075\013\014\014\025\033\113\001\002\000" +
    "\004\030\026\001\002\000\006\006\030\040\031\001\002" +
    "\000\004\031\067\001\002\000\004\040\060\001\002\000" +
    "\004\016\032\001\002\000\004\041\033\001\002\000\004" +
    "\037\034\001\002\000\006\027\036\040\037\001\002\000" +
    "\004\037\050\001\002\000\006\031\uffe9\037\uffe9\001\002" +
    "\000\004\024\040\001\002\000\012\005\042\027\043\040" +
    "\044\041\041\001\002\000\006\031\uffe7\037\uffe7\001\002" +
    "\000\006\005\045\040\046\001\002\000\006\031\uffe8\037" +
    "\uffe8\001\002\000\006\031\uffe6\037\uffe6\001\002\000\006" +
    "\031\uffe5\037\uffe5\001\002\000\004\005\047\001\002\000" +
    "\006\031\uffe4\037\uffe4\001\002\000\006\026\053\040\052" +
    "\001\002\000\004\031\uffde\001\002\000\006\025\055\026" +
    "\056\001\002\000\004\040\054\001\002\000\004\031\uffdb" +
    "\001\002\000\004\041\057\001\002\000\004\031\uffdc\001" +
    "\002\000\004\031\uffdd\001\002\000\004\016\061\001\002" +
    "\000\004\041\062\001\002\000\004\037\063\001\002\000" +
    "\006\027\036\040\037\001\002\000\004\037\065\001\002" +
    "\000\006\026\053\040\052\001\002\000\004\031\uffdf\001" +
    "\002\000\004\032\070\001\002\000\014\006\021\007\020" +
    "\010\015\013\014\014\025\001\002\000\020\006\021\007" +
    "\020\010\015\012\075\013\014\014\025\033\100\001\002" +
    "\000\020\006\ufff8\007\ufff8\010\ufff8\012\ufff8\013\ufff8\014" +
    "\ufff8\033\ufff8\001\002\000\020\006\ufff5\007\ufff5\010\ufff5" +
    "\012\ufff5\013\ufff5\014\ufff5\033\ufff5\001\002\000\020\006" +
    "\ufffe\007\ufffe\010\ufffe\012\ufffe\013\ufffe\014\ufffe\033\ufffe" +
    "\001\002\000\004\032\103\001\002\000\020\006\ufffa\007" +
    "\ufffa\010\ufffa\012\ufffa\013\ufffa\014\ufffa\033\ufffa\001\002" +
    "\000\020\006\ufffc\007\ufffc\010\ufffc\012\ufffc\013\ufffc\014" +
    "\ufffc\033\ufffc\001\002\000\020\006\uffe0\007\uffe0\010\uffe0" +
    "\012\uffe0\013\uffe0\014\uffe0\033\uffe0\001\002\000\004\012" +
    "\075\001\002\000\020\006\ufff6\007\ufff6\010\ufff6\012\ufff6" +
    "\013\ufff6\014\ufff6\033\ufff6\001\002\000\014\006\021\007" +
    "\020\010\015\013\014\014\025\001\002\000\020\006\021" +
    "\007\020\010\015\012\075\013\014\014\025\033\105\001" +
    "\002\000\004\013\106\001\002\000\004\030\107\001\002" +
    "\000\006\027\036\040\037\001\002\000\004\031\111\001" +
    "\002\000\004\037\112\001\002\000\020\006\uffe1\007\uffe1" +
    "\010\uffe1\012\uffe1\013\uffe1\014\uffe1\033\uffe1\001\002\000" +
    "\004\002\000\001\002\000\004\040\127\001\002\000\012" +
    "\016\121\025\116\026\120\037\117\001\002\000\004\041" +
    "\125\001\002\000\020\006\ufff3\007\ufff3\010\ufff3\012\ufff3" +
    "\013\ufff3\014\ufff3\033\ufff3\001\002\000\004\037\124\001" +
    "\002\000\004\041\122\001\002\000\004\037\123\001\002" +
    "\000\020\006\ufff1\007\ufff1\010\ufff1\012\ufff1\013\ufff1\014" +
    "\ufff1\033\ufff1\001\002\000\020\006\ufff0\007\ufff0\010\ufff0" +
    "\012\ufff0\013\ufff0\014\ufff0\033\ufff0\001\002\000\004\037" +
    "\126\001\002\000\020\006\ufff2\007\ufff2\010\ufff2\012\ufff2" +
    "\013\ufff2\014\ufff2\033\ufff2\001\002\000\004\037\130\001" +
    "\002\000\020\006\uffef\007\uffef\010\uffef\012\uffef\013\uffef" +
    "\014\uffef\033\uffef\001\002\000\006\016\133\025\132\001" +
    "\002\000\004\005\142\001\002\000\004\005\134\001\002" +
    "\000\006\005\135\040\136\001\002\000\004\037\141\001" +
    "\002\000\004\005\137\001\002\000\004\037\140\001\002" +
    "\000\020\006\uffeb\007\uffeb\010\uffeb\012\uffeb\013\uffeb\014" +
    "\uffeb\033\uffeb\001\002\000\020\006\uffed\007\uffed\010\uffed" +
    "\012\uffed\013\uffed\014\uffed\033\uffed\001\002\000\006\005" +
    "\143\040\144\001\002\000\004\037\147\001\002\000\004" +
    "\005\145\001\002\000\004\037\146\001\002\000\020\006" +
    "\uffec\007\uffec\010\uffec\012\uffec\013\uffec\014\uffec\033\uffec" +
    "\001\002\000\020\006\uffee\007\uffee\010\uffee\012\uffee\013" +
    "\uffee\014\uffee\033\uffee\001\002\000\006\027\036\040\037" +
    "\001\002\000\004\031\152\001\002\000\004\032\153\001" +
    "\002\000\014\006\021\007\020\010\015\013\014\014\025" +
    "\001\002\000\020\006\021\007\020\010\015\012\075\013" +
    "\014\014\025\033\155\001\002\000\022\006\uffea\007\uffea" +
    "\010\uffea\011\156\012\uffea\013\uffea\014\uffea\033\uffea\001" +
    "\002\000\004\032\157\001\002\000\014\006\021\007\020" +
    "\010\015\013\014\014\025\001\002\000\020\006\021\007" +
    "\020\010\015\012\075\013\014\014\025\033\161\001\002" +
    "\000\020\006\uffe3\007\uffe3\010\uffe3\012\uffe3\013\uffe3\014" +
    "\uffe3\033\uffe3\001\002\000\006\027\036\040\037\001\002" +
    "\000\004\031\164\001\002\000\004\032\165\001\002\000" +
    "\014\006\021\007\020\010\015\013\014\014\025\001\002" +
    "\000\020\006\021\007\020\010\015\012\075\013\014\014" +
    "\025\033\167\001\002\000\020\006\uffe2\007\uffe2\010\uffe2" +
    "\012\uffe2\013\uffe2\014\uffe2\033\uffe2\001\002\000\004\002" +
    "\001\001\002\000\004\031\172\001\002\000\004\032\173" +
    "\001\002\000\014\006\021\007\020\010\015\013\014\014" +
    "\025\001\002\000\020\006\021\007\020\010\015\012\075" +
    "\013\014\014\025\033\175\001\002\000\004\002\uffff\001" +
    "\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\173\000\004\002\004\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\016\003\023\004\016\006" +
    "\022\007\021\011\012\013\015\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\016\004\073\006\076\007" +
    "\075\011\071\012\100\013\072\001\001\000\002\001\001" +
    "\000\004\015\026\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\014\034\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\005\050\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\014\063\001\001\000\002" +
    "\001\001\000\004\005\065\001\001\000\002\001\001\000" +
    "\002\001\001\000\016\003\070\004\016\006\022\007\021" +
    "\011\012\013\015\001\001\000\016\004\073\006\076\007" +
    "\075\011\071\012\100\013\072\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\012\101\001\001\000\002\001\001\000\016\003\103\004" +
    "\016\006\022\007\021\011\012\013\015\001\001\000\016" +
    "\004\073\006\076\007\075\011\071\012\100\013\072\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\014\107" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\014\150\001\001\000\002\001\001\000\002\001" +
    "\001\000\016\003\153\004\016\006\022\007\021\011\012" +
    "\013\015\001\001\000\016\004\073\006\076\007\075\011" +
    "\071\012\100\013\072\001\001\000\002\001\001\000\002" +
    "\001\001\000\016\003\157\004\016\006\022\007\021\011" +
    "\012\013\015\001\001\000\016\004\073\006\076\007\075" +
    "\011\071\012\100\013\072\001\001\000\002\001\001\000" +
    "\004\014\162\001\001\000\002\001\001\000\002\001\001" +
    "\000\016\003\165\004\016\006\022\007\021\011\012\013" +
    "\015\001\001\000\016\004\073\006\076\007\075\011\071" +
    "\012\100\013\072\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\016\003\173" +
    "\004\016\006\022\007\021\011\012\013\015\001\001\000" +
    "\016\004\073\006\076\007\075\011\071\012\100\013\072" +
    "\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Sintax$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Sintax$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Sintax$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    private Symbol s;
    
    public void syntax_error(Symbol s){
        this.s = s;
    }

    public Symbol getS(){
        return this.s;
}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$Sintax$actions {
  private final Sintax parser;

  /** Constructor */
  CUP$Sintax$actions(Sintax parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$Sintax$do_action(
    int                        CUP$Sintax$act_num,
    java_cup.runtime.lr_parser CUP$Sintax$parser,
    java.util.Stack            CUP$Sintax$stack,
    int                        CUP$Sintax$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Sintax$result;

      /* select the action based on the action number */
      switch (CUP$Sintax$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // DECLARACION_FOR ::= Op_incremento Identificador 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION_FOR",3, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // DECLARACION_FOR ::= Identificador Op_incremento 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION_FOR",3, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // DECLARACION_FOR ::= Identificador Op_atribucion Numero 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION_FOR",3, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // SENTENCIA_FOR ::= Identificador Igual Numero P_coma SENTENCIA_BOOLEANA P_coma DECLARACION_FOR 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_FOR",11, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // SENTENCIA_FOR ::= T_dato Identificador Igual Numero P_coma SENTENCIA_BOOLEANA P_coma DECLARACION_FOR 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_FOR",11, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-7)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // FOR ::= For Parentesis_a SENTENCIA_FOR Parentesis_c Llave_a SENTENCIA Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("FOR",9, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // DO_WHILE ::= Do Llave_a SENTENCIA Llave_c While Parentesis_a SENTENCIA_BOOLEANA Parentesis_c P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DO_WHILE",8, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-8)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // WHILE ::= While Parentesis_a SENTENCIA_BOOLEANA Parentesis_c Llave_a SENTENCIA Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("WHILE",7, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // IF_ELSE ::= If Parentesis_a SENTENCIA_BOOLEANA Parentesis_c Llave_a SENTENCIA Llave_c Else Llave_a SENTENCIA Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("IF_ELSE",5, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-10)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // SENTENCIA_BOOLEANA ::= Identificador Op_relacional Comillas Identificador Comillas 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",10, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // SENTENCIA_BOOLEANA ::= Identificador Op_relacional Comillas Comillas 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",10, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // SENTENCIA_BOOLEANA ::= Identificador Op_relacional Identificador 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",10, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // SENTENCIA_BOOLEANA ::= Identificador Op_relacional Numero 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",10, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // SENTENCIA_BOOLEANA ::= Identificador Op_relacional Op_booleano 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",10, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // SENTENCIA_BOOLEANA ::= Op_booleano 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",10, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // IF ::= If Parentesis_a SENTENCIA_BOOLEANA Parentesis_c Llave_a SENTENCIA Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("IF",4, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // DECLARACION ::= Cadena Identificador Igual Comillas Identificador Comillas P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // DECLARACION ::= Cadena Identificador Op_atribucion Comillas Identificador Comillas P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // DECLARACION ::= Cadena Identificador Igual Comillas Comillas P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-5)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // DECLARACION ::= Cadena Identificador Op_atribucion Comillas Comillas P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-5)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // DECLARACION ::= T_dato Op_incremento Identificador P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // DECLARACION ::= T_dato Identificador Op_incremento P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // DECLARACION ::= T_dato Identificador Igual Numero P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // DECLARACION ::= T_dato Identificador Op_atribucion Numero P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // DECLARACION ::= T_dato Identificador P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // SENTENCIA ::= FOR 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // SENTENCIA ::= SENTENCIA FOR 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // SENTENCIA ::= SENTENCIA DO_WHILE DO_WHILE 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // SENTENCIA ::= WHILE 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // SENTENCIA ::= SENTENCIA WHILE 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // SENTENCIA ::= IF_ELSE 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // SENTENCIA ::= SENTENCIA IF_ELSE 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // SENTENCIA ::= IF 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // SENTENCIA ::= SENTENCIA IF 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // SENTENCIA ::= DECLARACION 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // SENTENCIA ::= SENTENCIA DECLARACION 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // INICIO ::= Main Parentesis_a Parentesis_c Llave_a SENTENCIA Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-5)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // INICIO ::= Int Main Parentesis_a Parentesis_c Llave_a SENTENCIA Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= INICIO EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).value;
		RESULT = start_val;
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Sintax$parser.done_parsing();
          return CUP$Sintax$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

