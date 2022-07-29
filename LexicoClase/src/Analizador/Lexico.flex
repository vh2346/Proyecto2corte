package Analizador;
import static Analizador.Tokens.*;
%%
%class Lexico
%type Tokens
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ \t \r]+
%{
    public String lexemas;
%}
%%

/* Espacios en blanco */
{espacio} {/*Ignore*/}

/* Comentarios */
( "//"(.)* ) {/*Ignore*/}

/* Salto de linea */
( "\n" ) {return Linea;}

/* Comillas */
( "\"" ) {lexemas=yytext(); return Comillas;}

/* Comilla_simple */
( "\'" ) {lexemas=yytext(); return Comilla_simple;}

/* Palabra reservada # */
( # ) {lexemas=yytext(); return Numeral;}

/* Palabra reservada Include */
( include ) {lexemas=yytext(); return Include;}

/* Palabra reservada Define */
( define ) {lexemas=yytext(); return Define;}

/* Tipo de dato String */
( string ) {lexemas=yytext(); return Cadena;}

/* Integer */
(int) {lexemas=yytext(); return Int;}

/* Double */
(double) {lexemas=yytext(); return Double;}

/*Char*/
(char) {lexemas=yytext(); return Char;}

/*Float*/
(float) {lexemas=yytext(); return Float;}

/*Long*/
(long) {lexemas=yytext(); return Long;}

/*Palabra reservada Short*/
(short) {lexemas=yytext(); return Short;}

/*Palabra reservada Unsigned*/
(unsigned) {lexemas=yytext(); return Unsigned;}

/*Palabra reservada Bool*/
(bool) {lexemas=yytext(); return Bool;}

/* Tipos de datos */
( byte | int | char | long | float | double | short | unsigned | string | bool ) {lexemas=yytext(); return T_dato;}

/* Marcas printf */
( %d | %i | %f | %s | %c ) {lexemas=yytext(); return Marca_printf;}

/* Palabra reservada If */
( if ) {lexemas=yytext(); return If;}

/* Palabra reservada Else */
( else ) {lexemas=yytext(); return Else;}

/* Palabra reservada While */
( while ) {lexemas=yytext(); return While;}

/*Palabra reservada Break*/
(break) {lexemas=yytext(); return Break;}

/*Palabra reservada Case*/
(case) {lexemas=yytext(); return Case;}

/*Palabra reservada Const*/
(const) {lexemas=yytext(); return Const;}

/*Palabra reservada Continue*/
(continue) {lexemas=yytext(); return Continue;}

/*Palabra reservada Default*/
(default) {lexemas=yytext(); return Default;}

/*Palabra reservada Do*/
(do) {lexemas=yytext(); return Do;}

/*Palabra reservada Enum*/
(enum) {lexemas=yytext(); return Enum;}

/*Palabra reservada Extern*/
(extern) {lexemas=yytext(); return Extern;}

/*Palabra reservada For*/
(for) {lexemas=yytext(); return For;}

/*Palabra reservada GoTo*/
(goto) {lexemas=yytext(); return GoTo;}

/*Palabra reservada Register*/
(register) {lexemas=yytext(); return Register;}

/*Palabra reservada Return*/
(return) {lexemas=yytext(); return Return;}

/*Palabra reservada Union*/
(union) {lexemas=yytext(); return Union;}

/*Palabra reservada Struct*/
(struct) {lexemas=yytext(); return Struct;}

/*Palabra reservada Switch*/
(switch) {lexemas=yytext(); return Switch;}

/*Palabra reservada Typedef*/
(typedef) {lexemas=yytext(); return Typedef;}

/*Palabra reservada Using*/
(using) {lexemas=yytext(); return Using;}

/*Palabra reservada Namespace*/
(namespace) {lexemas=yytext(); return Namespace;}

/*Palabra reservada Namespace*/
(namespace) {lexemas=yytext(); return Namespace;}

/*Palabra reservada System*/
(system) {lexemas=yytext(); return System_r;}

/*Funcion printf*/
("printf(") {lexemas=yytext(); return Printf;}

/*Funcion scanf*/
("scanf(") {lexemas=yytext(); return Scanf;}

/*Funcion cin*/
("cin>>") {lexemas=yytext(); return Cin;}

/*Funcion cout*/
("cout<<") {lexemas=yytext(); return Cout;}

/* Operador Igual */
( "=" ) {lexemas=yytext(); return Igual;}

/* Operador Suma */
( "+" ) {lexemas=yytext(); return Suma;}

/* Operador Resta */
( "-" ) {lexemas=yytext(); return Resta;}

/* Operador cout */
( "<<" ) {lexemas = yytext(); return Op_cout;}

/* Operador cin */
( ">>" ) {lexemas = yytext(); return Op_cin;}

/* Operador Menor */
( "<" ) {lexemas=yytext(); return Menor;}

/* Operador Mayor */
( ">" ) {lexemas=yytext(); return Mayor;}

/* Operadores logicos */
( "&&" | "||" | "!" | "&" | "|" ) {lexemas=yytext(); return Op_logico;}

/* Operadores booleano */
( true | false ) {lexemas=yytext(); return Op_booleano;}

/*Operadores Relacionales */
( ">" | "<" | "==" | "!=" | ">=" | "<=" | ">>" | "<<" ) {lexemas = yytext(); return Op_relacional;}

/* Operadores Atribucion */
( "+=" | "-="  | "*=" | "/=" | "%=" ) {lexemas = yytext(); return Op_atribucion;}

/* Operadores Incremento */
( "++" | "--" ) {lexemas = yytext(); return Op_incremento;}

/* Parentesis de apertura */
( "(" ) {lexemas=yytext(); return Parent_a;}

/* Parentesis de cierre */
( ")" ) {lexemas=yytext(); return Parent_c;}

/* Llave de apertura */
( "{" ) {lexemas=yytext(); return Llave_a;}

/* Llave de cierre */
( "}" ) {lexemas=yytext(); return Llave_c;}

/* Marcador de inicio de algoritmo */
( "main" ) {lexemas=yytext(); return Main;}

/* Punto */
( "." ) {lexemas=yytext(); return Punto;}

/* Coma */
( "," ) {lexemas=yytext(); return Coma;}

/* P_Coma */
( ";" ) {lexemas=yytext(); return P_Coma;}

/* Dos_puntos */
( ":" ) {lexemas=yytext(); return Dos_puntos;}

/* Identificador */
{L}({L}|{D})* {lexemas=yytext(); return Identificador;}

/* Apuntador */
("&")({L}|{D})* {lexemas=yytext(); return Apuntador;}

/* Numero */
("(-"{D}+")")|{D}+ {lexemas=yytext(); return Numero;}

/* Error de analisis */
 . {return ERROR;}

