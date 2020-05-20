/*------------  1ra Area: Codigo de Usuario ---------*/
//------> Paquetes,importaciones
package ANALIZADORES;
import java_cup.runtime.*;
import java.util.LinkedList;
import java.util.ArrayList;

/*------------  2da Area: Opciones y Declaraciones ---------*/
%%
%{
    //----> Codigo de usuario en sintaxis java
    public ArrayList<Tokens> arrayTokens = new ArrayList<Tokens>();
    public String lexeme;
    public ArrayList<Errores> arrayErrores = new ArrayList<Errores>();
%}

//-------> Directivas
%public 
%class Analizador_Lexico
%type Tokens
%line
%column


//------> Expresiones Regulares

Letras= [a-zA-Z]*                                                             //LETRAS
Numeros = [0-9]*                                                                //NUMERO
Correo = [_a-zA-Z0-9-]+(.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(.[a-zA-Z-]+)*(.[a-zA-Z]{2,4})    //CORREO
Url = (:([A-Za-z]+):)?(\/{0,3})([.\/:a-z]+)(::(\d+))?(:\/([^?#]*))?(:\?([^#]*))?(:#(.*))?

//------> Estados
%%
<YYINITIAL> "INI_HTML"   {Tokens token = new Tokens("Inicio",yytext());
          arrayTokens.add(token);
            return token;}
<YYINITIAL> "FIN_HTML"   {Tokens token = new Tokens("Fin",yytext());
          arrayTokens.add(token);
            return token;}
<YYINITIAL> "ENCABEZADO_INI"   {Tokens token = new Tokens("I_Cabecera",yytext());
          arrayTokens.add(token);
            return token;}
<YYINITIAL> "ENCABEZADO_FIN"   {Tokens token = new Tokens("F_Cabecera",yytext());
          arrayTokens.add(token);
            return token;}
<YYINITIAL> "CUERPO_INI"   {Tokens token = new Tokens("I_Cuerpo",yytext());
          arrayTokens.add(token);
            return token;}
<YYINITIAL> "CUERPO_FIN"   {Tokens token = new Tokens("F_Cuerpo",yytext());
          arrayTokens.add(token);
            return token;}
<YYINITIAL> "TIT"   {Tokens token = new Tokens("Titulo",yytext());
          arrayTokens.add(token);
            return token;}
<YYINITIAL> "TABLA_IN "   {Tokens token = new Tokens("I_Tabla",yytext());
          arrayTokens.add(token);
            return token;}
<YYINITIAL> "TABLA_FIN"   {Tokens token = new Tokens("F_Tabla",yytext());
          arrayTokens.add(token);
            return token;}
<YYINITIAL> "BORDE"   {Tokens token = new Tokens("Borde",yytext());
          arrayTokens.add(token);
            return token;}
<YYINITIAL> "FILA"         { Tokens token = new Tokens("I_Fila",yytext());
            arrayTokens.add(token);
            return token; }
<YYINITIAL> "FILA_FIN"         { Tokens token = new Tokens("F_Fila",yytext());
            arrayTokens.add(token);
            return token; }
<YYINITIAL> "COLUMNA"         { Tokens token = new Tokens("Columna",yytext());
            arrayTokens.add(token);
            return token; }
<YYINITIAL> "IMAGEN_IN"         { Tokens token = new Tokens("I_Imgen",yytext());
            arrayTokens.add(token);
            return token; }
<YYINITIAL> "IMAGEN_FIN"         { Tokens token = new Tokens("F_Imagen",yytext());
            arrayTokens.add(token);
            return token; }
<YYINITIAL> "LISTA_IN"         { Tokens token = new Tokens("I_Lista",yytext());
            arrayTokens.add(token);
            return token; }
<YYINITIAL> "LISTA_FIN"         { Tokens token = new Tokens("F_Lista",yytext());
            arrayTokens.add(token);
            return token; }
<YYINITIAL> "ENLACE"         { Tokens token = new Tokens("Enlace",yytext());
            arrayTokens.add(token);
            return token; }
<YYINITIAL> "ANCHO"         { Tokens token = new Tokens("Ancho",yytext());
            arrayTokens.add(token);
            return token; }
<YYINITIAL> "ALTURA"         { Tokens token = new Tokens("Alto",yytext());
            arrayTokens.add(token);
            return token; }
/*------------  3raa Area: Reglas Lexicas ---------*/
//-----> Simbolos(CARACTERES)


<YYINITIAL> "="         { Tokens token = new Tokens("Igual",yytext());
            arrayTokens.add(token);
            return token;}
<YYINITIAL> ","         { Tokens token = new Tokens("Coma",yytext());
            arrayTokens.add(token);
            return token; }
<YYINITIAL> ":"         { Tokens token = new Tokens("DosPuntos",yytext());
            arrayTokens.add(token);
            return token; }
<YYINITIAL> "\""         { Tokens token = new Tokens("Comilla",yytext());
            arrayTokens.add(token);
            return token; }
<YYINITIAL> "."         { Tokens token = new Tokens("Punto",yytext());
            arrayTokens.add(token);
            return token; }
<YYINITIAL> "("         { Tokens token = new Tokens("Parentesis_A",yytext());
            arrayTokens.add(token);
            return token; }
<YYINITIAL> ")"         { Tokens token = new Tokens("Parentesis_C",yytext());
            arrayTokens.add(token);
            return token; }
<YYINITIAL> ";"         { Tokens token = new Tokens("PuntoComa",yytext());
            arrayTokens.add(token);
            return token; }

//-------------OPERADORES ARITMETICOS
<YYINITIAL> "+"         { Tokens token = new Tokens("Mas",yytext());
            arrayTokens.add(token);
            return token; }
<YYINITIAL> "-"         { Tokens token = new Tokens("Menos",yytext());
            arrayTokens.add(token);
            return token; }

<YYINITIAL> "*"         { Tokens token = new Tokens("Multiplicacion",yytext());
            arrayTokens.add(token);
            return token; }
<YYINITIAL> "/"         { Tokens token = new Tokens("Divicion",yytext());
            arrayTokens.add(token);
            return token; }



//-------> Simbolos ER
<YYINITIAL> {Letras}    {Tokens token = new Tokens("Letras",yytext());
            arrayTokens.add(token);
            return token; }
<YYINITIAL> {Numeros}    { Tokens token = new Tokens("Numero",yytext());
            arrayTokens.add(token);
            return token; }
<YYINITIAL> {Correo}    { Tokens token = new Tokens("Correo",yytext());
            arrayTokens.add(token);
            return token; }

<YYINITIAL> {Url}    { Tokens token = new Tokens("Url",yytext());
            arrayTokens.add(token);
            return token; }
//------> Espacios
[ \t\r\n\f]             {/* Espacios en blanco, se ignoran */}

//------> Errores Lexicos
.                        {Errores error = new Errores("LEXICO",yytext(),yyline,yycolumn,"Simbolo no Reconocido");
                        arrayErrores.add(error);

                      }                      


//.                       { System.out.println("Error Lexico"+yytext()+" Linea "+yyline+" Columna "+yycolumn);
//                         TError datos = new TError(yytext(),yyline,yycolumn,"Error Lexico","Simbolo no existe en el lenguaje");
//                        TablaEL.add(datos);}