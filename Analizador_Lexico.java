/* The following code was generated by JFlex 1.4.3 on 19/05/20 09:26 PM */

/*------------  1ra Area: Codigo de Usuario ---------*/
//------> Paquetes,importaciones
package ANALIZADORES;
import java_cup.runtime.*;
import java.util.LinkedList;
import java.util.ArrayList;

/*------------  2da Area: Opciones y Declaraciones ---------*/

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 19/05/20 09:26 PM from the specification file
 * <tt>A_Lexico.jflex</tt>
 */
public class Analizador_Lexico {

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
    "\11\0\1\51\1\4\1\0\2\51\22\0\1\36\1\0\1\43\1\13"+
    "\4\0\1\44\1\45\1\50\1\47\1\42\1\6\1\11\1\10\12\2"+
    "\1\7\1\46\1\0\1\41\1\0\1\14\1\5\1\26\1\27\1\25"+
    "\1\31\1\24\1\23\1\37\1\17\1\15\2\1\1\22\1\21\1\16"+
    "\1\32\1\35\1\1\1\34\1\40\1\20\1\33\4\1\1\30\4\0"+
    "\1\3\1\0\3\12\1\12\26\12\uff85\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\1\1\2\1\1\1\3\1\2\1\4\1\5\1\6"+
    "\1\7\1\10\11\1\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\4\0\5\21\14\1\2\0\4\21"+
    "\2\1\1\22\13\1\4\0\2\21\1\0\3\1\1\0"+
    "\1\23\7\1\4\0\3\1\2\0\4\1\1\24\1\1"+
    "\1\25\1\26\1\0\1\26\1\0\1\1\4\0\1\27"+
    "\3\1\1\30\10\0\1\1\1\31\1\0\1\32\4\0"+
    "\1\33\1\0\1\34\1\35\1\1\2\0\1\36\1\0"+
    "\1\37\1\40\1\41\1\1\2\0\1\42\1\1\1\43"+
    "\1\44\5\0\1\45\1\46";

  private static int [] zzUnpackAction() {
    int [] result = new int[159];
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
    "\0\0\0\52\0\124\0\176\0\250\0\52\0\250\0\322"+
    "\0\374\0\374\0\u0126\0\u0150\0\u017a\0\u01a4\0\u01ce\0\u01f8"+
    "\0\u0222\0\u024c\0\u0276\0\52\0\52\0\52\0\52\0\52"+
    "\0\52\0\52\0\52\0\u02a0\0\250\0\u02ca\0\u02f4\0\u031e"+
    "\0\374\0\322\0\u0348\0\u0372\0\u039c\0\u03c6\0\u03f0\0\u041a"+
    "\0\u0444\0\u046e\0\u0498\0\u04c2\0\u04ec\0\u0516\0\u0540\0\u056a"+
    "\0\u0594\0\u05be\0\u05e8\0\u0612\0\u063c\0\u0666\0\u0690\0\u06ba"+
    "\0\124\0\u06e4\0\u070e\0\u0738\0\u0762\0\u078c\0\u07b6\0\u07e0"+
    "\0\u080a\0\u0834\0\u085e\0\u0888\0\u08b2\0\u08dc\0\u0906\0\u0930"+
    "\0\u095a\0\u0984\0\u09ae\0\u09d8\0\u0a02\0\u0a2c\0\u0a56\0\u0a80"+
    "\0\u0aaa\0\u0ad4\0\u0afe\0\u0b28\0\u0b52\0\u0b7c\0\u0ba6\0\u0bd0"+
    "\0\u0bfa\0\u0c24\0\u0c4e\0\u0c78\0\u0ca2\0\u0ccc\0\u0cf6\0\u0d20"+
    "\0\u0d4a\0\u0d74\0\u0d9e\0\u0dc8\0\124\0\u0df2\0\124\0\u0bd0"+
    "\0\u0e1c\0\u0c24\0\u0e46\0\u0e70\0\u0e9a\0\u0ec4\0\u0eee\0\u0f18"+
    "\0\124\0\u0f42\0\u0f6c\0\u0f96\0\124\0\u0fc0\0\u0fea\0\u1014"+
    "\0\u103e\0\u1068\0\u1092\0\u10bc\0\u10e6\0\u1110\0\124\0\u113a"+
    "\0\250\0\u1164\0\u118e\0\u11b8\0\u11e2\0\250\0\u120c\0\250"+
    "\0\250\0\u1236\0\u1260\0\u128a\0\250\0\u12b4\0\u02a0\0\250"+
    "\0\250\0\u12de\0\u1308\0\u1332\0\250\0\u135c\0\250\0\250"+
    "\0\u1386\0\u13b0\0\u13da\0\u1404\0\u142e\0\250\0\250";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[159];
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
    "\1\2\1\3\1\4\1\5\1\6\1\2\1\7\1\10"+
    "\1\11\1\12\1\13\2\2\1\14\2\3\1\15\1\3"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\6\3\1\6"+
    "\2\3\1\24\1\25\1\26\1\27\1\30\1\31\1\32"+
    "\1\33\1\6\52\0\1\34\1\3\2\35\1\0\1\36"+
    "\1\35\3\34\1\3\2\34\21\3\1\34\2\3\12\34"+
    "\1\35\1\4\1\35\1\0\1\36\1\35\3\34\1\35"+
    "\2\34\21\35\1\34\2\35\12\34\3\35\1\0\1\36"+
    "\1\35\3\34\1\35\2\34\21\35\1\34\2\35\11\34"+
    "\1\0\1\37\5\0\1\40\2\41\1\42\2\0\21\37"+
    "\1\0\2\37\20\0\1\40\3\41\37\0\1\34\1\3"+
    "\2\35\1\0\1\36\1\35\1\43\2\44\1\13\2\34"+
    "\21\3\1\34\2\3\12\34\1\3\2\35\1\0\1\36"+
    "\1\35\3\34\1\3\2\34\1\3\1\45\2\3\1\46"+
    "\14\3\1\34\2\3\12\34\1\3\2\35\1\0\1\36"+
    "\1\35\3\34\1\3\2\34\1\47\10\3\1\50\7\3"+
    "\1\34\2\3\12\34\1\3\2\35\1\0\1\36\1\35"+
    "\3\34\1\3\2\34\1\51\20\3\1\34\2\3\12\34"+
    "\1\3\2\35\1\0\1\36\1\35\3\34\1\3\2\34"+
    "\1\52\20\3\1\34\2\3\12\34\1\3\2\35\1\0"+
    "\1\36\1\35\3\34\1\3\2\34\1\3\1\53\17\3"+
    "\1\34\2\3\12\34\1\3\2\35\1\0\1\36\1\35"+
    "\3\34\1\3\2\34\15\3\1\54\1\55\2\3\1\34"+
    "\2\3\12\34\1\3\2\35\1\0\1\36\1\35\3\34"+
    "\1\3\2\34\1\3\1\56\3\3\1\57\13\3\1\34"+
    "\2\3\12\34\1\3\2\35\1\0\1\36\1\35\3\34"+
    "\1\3\2\34\15\3\1\60\3\3\1\34\2\3\11\34"+
    "\1\0\3\35\2\0\1\35\3\0\1\35\2\0\21\35"+
    "\1\0\2\35\12\0\2\61\1\35\2\0\1\61\3\0"+
    "\1\61\2\0\21\61\1\0\2\61\12\0\1\37\5\0"+
    "\1\62\2\0\1\37\2\0\21\37\1\0\2\37\20\0"+
    "\1\40\1\63\2\41\1\64\1\65\36\0\3\35\2\0"+
    "\1\35\1\40\1\63\1\41\1\66\1\64\1\65\21\35"+
    "\1\0\2\35\12\0\3\35\2\0\1\35\1\40\2\41"+
    "\1\66\2\0\21\35\1\0\2\35\11\0\1\34\1\3"+
    "\2\35\1\0\1\36\1\35\3\34\1\3\2\34\1\67"+
    "\20\3\1\34\2\3\12\34\1\3\2\35\1\0\1\36"+
    "\1\35\3\34\1\3\2\34\11\3\1\70\7\3\1\34"+
    "\2\3\12\34\1\3\2\35\1\0\1\36\1\35\3\34"+
    "\1\3\2\34\3\3\1\71\15\3\1\34\2\3\12\34"+
    "\1\3\2\35\1\0\1\36\1\35\3\34\1\3\2\34"+
    "\12\3\1\72\6\3\1\34\2\3\12\34\1\3\2\35"+
    "\1\0\1\36\1\35\3\34\1\3\2\34\21\3\1\34"+
    "\1\3\1\73\12\34\1\3\2\35\1\0\1\36\1\35"+
    "\3\34\1\3\2\34\1\3\1\74\3\3\1\75\13\3"+
    "\1\34\2\3\12\34\1\3\2\35\1\0\1\36\1\35"+
    "\3\34\1\3\2\34\5\3\1\76\2\3\1\77\10\3"+
    "\1\34\2\3\12\34\1\3\2\35\1\0\1\36\1\35"+
    "\3\34\1\3\2\34\5\3\1\100\13\3\1\34\2\3"+
    "\12\34\1\3\2\35\1\0\1\36\1\35\3\34\1\3"+
    "\2\34\7\3\1\101\11\3\1\34\2\3\12\34\1\3"+
    "\2\35\1\0\1\36\1\35\3\34\1\3\2\34\10\3"+
    "\1\102\10\3\1\34\2\3\12\34\1\3\2\35\1\0"+
    "\1\36\1\35\3\34\1\3\2\34\3\3\1\103\15\3"+
    "\1\34\2\3\12\34\1\3\2\35\1\0\1\36\1\35"+
    "\3\34\1\3\2\34\17\3\1\104\1\3\1\34\2\3"+
    "\11\34\1\105\2\106\1\107\1\0\1\110\1\106\3\105"+
    "\1\106\2\105\21\106\1\105\2\106\11\105\7\0\4\41"+
    "\37\0\7\63\1\111\3\63\2\0\35\63\4\64\1\0"+
    "\45\64\7\65\1\112\3\65\1\0\36\65\1\34\3\35"+
    "\1\0\1\36\1\35\1\43\2\44\1\66\2\34\21\35"+
    "\1\34\2\35\12\34\1\3\1\35\1\113\1\0\1\36"+
    "\1\35\3\34\1\3\2\34\21\3\1\34\2\3\12\34"+
    "\1\3\2\35\1\0\1\36\1\35\3\34\1\3\2\34"+
    "\21\3\1\34\1\114\1\3\12\34\1\3\2\35\1\0"+
    "\1\36\1\35\3\34\1\3\2\34\5\3\1\115\13\3"+
    "\1\34\2\3\12\34\1\3\2\35\1\0\1\36\1\35"+
    "\3\34\1\3\2\34\3\3\1\116\15\3\1\34\2\3"+
    "\12\34\1\3\1\35\1\117\1\0\1\36\1\35\3\34"+
    "\1\3\2\34\21\3\1\34\2\3\12\34\1\3\2\35"+
    "\1\0\1\36\1\35\3\34\1\3\2\34\11\3\1\120"+
    "\7\3\1\34\2\3\12\34\1\3\2\35\1\0\1\36"+
    "\1\35\3\34\1\3\2\34\11\3\1\121\7\3\1\34"+
    "\2\3\12\34\1\3\2\35\1\0\1\36\1\35\3\34"+
    "\1\3\2\34\11\3\1\122\7\3\1\34\2\3\12\34"+
    "\1\3\2\35\1\0\1\36\1\35\3\34\1\3\2\34"+
    "\16\3\1\123\2\3\1\34\2\3\12\34\1\3\2\35"+
    "\1\0\1\36\1\35\3\34\1\3\2\34\17\3\1\124"+
    "\1\3\1\34\2\3\12\34\1\3\2\35\1\0\1\36"+
    "\1\35\3\34\1\3\2\34\2\3\1\125\16\3\1\34"+
    "\2\3\12\34\1\3\2\35\1\0\1\36\1\35\3\34"+
    "\1\3\2\34\16\3\1\126\2\3\1\34\2\3\12\34"+
    "\1\3\2\35\1\0\1\36\1\35\3\34\1\3\2\34"+
    "\14\3\1\127\4\3\1\34\2\3\11\34\1\0\1\130"+
    "\2\35\2\0\1\131\3\0\1\130\2\0\21\130\1\0"+
    "\2\130\11\0\1\105\1\132\1\106\1\107\1\0\1\110"+
    "\1\106\3\105\1\132\2\105\21\132\1\105\2\132\11\105"+
    "\1\34\1\130\2\35\1\0\1\36\1\131\3\34\1\130"+
    "\2\34\21\130\1\34\2\130\11\34\1\0\1\132\1\61"+
    "\1\35\2\0\1\61\3\0\1\132\2\0\21\132\1\0"+
    "\2\132\11\0\7\63\1\111\3\63\1\64\1\65\35\63"+
    "\7\65\1\112\3\65\1\64\36\65\1\34\3\35\1\0"+
    "\1\36\1\35\3\34\1\35\2\34\2\35\1\133\16\35"+
    "\1\34\2\35\12\34\1\3\2\35\1\0\1\36\1\35"+
    "\3\34\1\3\2\34\7\3\1\134\11\3\1\34\2\3"+
    "\12\34\1\3\2\35\1\0\1\36\1\35\3\34\1\3"+
    "\2\34\11\3\1\135\7\3\1\34\2\3\12\34\1\3"+
    "\2\35\1\0\1\36\1\35\3\34\1\3\2\34\11\3"+
    "\1\136\7\3\1\34\2\3\12\34\3\35\1\0\1\36"+
    "\1\35\3\34\1\35\2\34\2\35\1\137\16\35\1\34"+
    "\2\35\12\34\1\3\1\35\1\140\1\0\1\36\1\35"+
    "\3\34\1\3\2\34\21\3\1\34\2\3\12\34\1\3"+
    "\2\35\1\0\1\36\1\35\3\34\1\3\2\34\10\3"+
    "\1\141\10\3\1\34\2\3\12\34\1\3\2\35\1\0"+
    "\1\36\1\35\3\34\1\3\2\34\12\3\1\142\6\3"+
    "\1\34\2\3\12\34\1\3\2\35\1\0\1\36\1\35"+
    "\3\34\1\3\2\34\4\3\1\143\14\3\1\34\2\3"+
    "\12\34\1\3\2\35\1\0\1\36\1\35\3\34\1\3"+
    "\2\34\20\3\1\144\1\34\2\3\12\34\1\3\2\35"+
    "\1\0\1\36\1\35\3\34\1\3\2\34\15\3\1\145"+
    "\3\3\1\34\2\3\12\34\1\3\2\35\1\0\1\36"+
    "\1\35\3\34\1\3\2\34\17\3\1\146\1\3\1\34"+
    "\2\3\12\34\1\3\2\35\1\0\1\36\1\35\3\34"+
    "\1\3\2\34\7\3\1\147\11\3\1\34\2\3\11\34"+
    "\1\105\1\150\2\107\1\0\1\110\1\151\3\105\1\150"+
    "\2\105\21\150\1\105\2\150\12\105\1\151\2\107\1\0"+
    "\1\110\1\151\3\105\1\151\2\105\21\151\1\105\2\151"+
    "\12\105\1\152\1\106\1\107\1\0\1\110\1\106\3\105"+
    "\1\152\2\105\21\152\1\105\2\152\11\105\1\34\3\35"+
    "\1\0\1\36\1\35\3\34\1\35\2\34\3\35\1\153"+
    "\15\35\1\34\2\35\12\34\1\3\2\35\1\0\1\36"+
    "\1\35\3\34\1\3\2\34\1\3\1\154\17\3\1\34"+
    "\2\3\12\34\1\3\1\35\1\155\1\0\1\36\1\35"+
    "\3\34\1\3\2\34\21\3\1\34\2\3\12\34\1\3"+
    "\1\35\1\156\1\0\1\36\1\35\3\34\1\3\2\34"+
    "\21\3\1\34\2\3\12\34\3\35\1\0\1\36\1\35"+
    "\3\34\1\35\2\34\3\35\1\157\15\35\1\34\2\35"+
    "\12\34\3\35\1\0\1\36\1\35\3\34\1\35\2\34"+
    "\6\35\1\160\12\35\1\34\2\35\12\34\1\3\2\35"+
    "\1\0\1\36\1\35\3\34\1\3\2\34\7\3\1\161"+
    "\11\3\1\34\2\3\12\34\1\3\2\35\1\0\1\36"+
    "\1\35\3\34\1\3\2\34\7\3\1\162\11\3\1\34"+
    "\2\3\12\34\1\3\2\35\1\0\1\36\1\35\3\34"+
    "\1\3\2\34\1\3\1\163\17\3\1\34\2\3\12\34"+
    "\1\3\2\35\1\0\1\36\1\35\3\34\1\3\2\34"+
    "\15\3\1\164\3\3\1\34\2\3\12\34\1\3\2\35"+
    "\1\0\1\36\1\35\3\34\1\3\2\34\11\3\1\165"+
    "\7\3\1\34\2\3\11\34\1\105\1\130\2\107\1\0"+
    "\1\110\1\151\3\105\1\130\2\105\21\130\1\105\2\130"+
    "\11\105\1\34\3\35\1\0\1\36\1\35\3\34\1\35"+
    "\2\34\4\35\1\166\14\35\1\34\2\35\12\34\1\3"+
    "\1\35\1\167\1\0\1\36\1\35\3\34\1\3\2\34"+
    "\21\3\1\34\2\3\12\34\3\35\1\0\1\36\1\35"+
    "\3\34\1\35\2\34\1\170\5\35\1\171\12\35\1\34"+
    "\2\35\12\34\3\35\1\0\1\36\1\35\3\34\1\35"+
    "\2\34\1\172\5\35\1\173\12\35\1\34\2\35\12\34"+
    "\3\35\1\0\1\36\1\35\3\34\1\35\2\34\4\35"+
    "\1\174\14\35\1\34\2\35\12\34\3\35\1\0\1\36"+
    "\1\35\3\34\1\35\2\34\1\175\20\35\1\34\2\35"+
    "\12\34\1\3\2\35\1\0\1\36\1\35\3\34\1\3"+
    "\2\34\13\3\1\176\5\3\1\34\2\3\12\34\1\3"+
    "\2\35\1\0\1\36\1\35\3\34\1\3\2\34\11\3"+
    "\1\177\7\3\1\34\2\3\12\34\1\3\1\35\1\200"+
    "\1\0\1\36\1\35\3\34\1\3\2\34\21\3\1\34"+
    "\2\3\12\34\3\35\1\0\1\36\1\35\3\34\1\35"+
    "\2\34\5\35\1\201\13\35\1\34\2\35\12\34\3\35"+
    "\1\0\1\36\1\35\3\34\1\35\2\34\1\202\5\35"+
    "\1\203\12\35\1\34\2\35\12\34\3\35\1\0\1\36"+
    "\1\35\3\34\1\35\2\34\1\35\1\204\17\35\1\34"+
    "\2\35\12\34\3\35\1\0\1\36\1\35\3\34\1\35"+
    "\2\34\1\205\20\35\1\34\2\35\12\34\3\35\1\0"+
    "\1\36\1\35\3\34\1\35\2\34\1\35\1\206\17\35"+
    "\1\34\2\35\12\34\3\35\1\0\1\36\1\35\3\34"+
    "\1\35\2\34\1\207\20\35\1\34\2\35\12\34\3\35"+
    "\1\0\1\36\1\35\3\34\1\35\2\34\5\35\1\210"+
    "\13\35\1\34\2\35\12\34\3\35\1\0\1\36\1\35"+
    "\3\34\1\35\2\34\1\35\1\211\17\35\1\34\2\35"+
    "\12\34\1\3\2\35\1\0\1\36\1\35\3\34\1\3"+
    "\2\34\11\3\1\212\7\3\1\34\2\3\12\34\3\35"+
    "\1\0\1\36\1\35\3\34\1\35\2\34\1\213\5\35"+
    "\1\214\12\35\1\34\2\35\12\34\3\35\1\0\1\36"+
    "\1\35\3\34\1\35\2\34\1\35\1\215\17\35\1\34"+
    "\2\35\12\34\3\35\1\0\1\36\1\35\3\34\1\35"+
    "\2\34\1\216\20\35\1\34\2\35\12\34\3\35\1\0"+
    "\1\36\1\35\3\34\1\35\2\34\21\35\1\217\2\35"+
    "\12\34\3\35\1\0\1\36\1\35\3\34\1\35\2\34"+
    "\1\35\1\220\17\35\1\34\2\35\12\34\3\35\1\0"+
    "\1\36\1\35\3\34\1\35\2\34\1\35\1\221\17\35"+
    "\1\34\2\35\12\34\1\3\2\35\1\0\1\36\1\35"+
    "\3\34\1\3\2\34\14\3\1\222\4\3\1\34\2\3"+
    "\12\34\3\35\1\0\1\36\1\35\3\34\1\35\2\34"+
    "\1\35\1\223\17\35\1\34\2\35\12\34\3\35\1\0"+
    "\1\36\1\35\3\34\1\35\2\34\1\224\20\35\1\34"+
    "\2\35\12\34\3\35\1\0\1\36\1\35\3\34\1\35"+
    "\2\34\1\35\1\225\17\35\1\34\2\35\12\34\1\3"+
    "\2\35\1\0\1\36\1\35\3\34\1\3\2\34\15\3"+
    "\1\226\3\3\1\34\2\3\12\34\3\35\1\0\1\36"+
    "\1\35\3\34\1\35\2\34\1\227\20\35\1\34\2\35"+
    "\12\34\3\35\1\0\1\36\1\35\3\34\1\35\2\34"+
    "\1\35\1\230\17\35\1\34\2\35\12\34\1\3\1\35"+
    "\1\231\1\0\1\36\1\35\3\34\1\3\2\34\21\3"+
    "\1\34\2\3\12\34\3\35\1\0\1\36\1\35\3\34"+
    "\1\35\2\34\1\232\5\35\1\233\12\35\1\34\2\35"+
    "\12\34\3\35\1\0\1\36\1\35\3\34\1\35\2\34"+
    "\1\35\1\234\17\35\1\34\2\35\12\34\3\35\1\0"+
    "\1\36\1\35\3\34\1\35\2\34\1\235\20\35\1\34"+
    "\2\35\12\34\3\35\1\0\1\36\1\35\3\34\1\35"+
    "\2\34\1\236\20\35\1\34\2\35\12\34\3\35\1\0"+
    "\1\36\1\35\3\34\1\35\2\34\1\35\1\237\17\35"+
    "\1\34\2\35\11\34";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5208];
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
    "\1\1\1\11\3\1\1\11\15\1\10\11\4\0\21\1"+
    "\2\0\22\1\4\0\2\1\1\0\3\1\1\0\10\1"+
    "\4\0\3\1\2\0\10\1\1\0\1\1\1\0\1\1"+
    "\4\0\5\1\10\0\2\1\1\0\1\1\4\0\1\1"+
    "\1\0\3\1\2\0\1\1\1\0\4\1\2\0\4\1"+
    "\5\0\2\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[159];
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
    //----> Codigo de usuario en sintaxis java
    public ArrayList<Tokens> arrayTokens = new ArrayList<Tokens>();
    public String lexeme;
    public ArrayList<Errores> arrayErrores = new ArrayList<Errores>();


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Analizador_Lexico(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public Analizador_Lexico(java.io.InputStream in) {
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
    while (i < 112) {
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
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
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
        case 4: 
          { /* Espacios en blanco, se ignoran */
          }
        case 39: break;
        case 17: 
          { Tokens token = new Tokens("Url",yytext());
            arrayTokens.add(token);
            return token;
          }
        case 40: break;
        case 34: 
          { Tokens token = new Tokens("F_Imagen",yytext());
            arrayTokens.add(token);
            return token;
          }
        case 41: break;
        case 21: 
          { Tokens token = new Tokens("Borde",yytext());
          arrayTokens.add(token);
            return token;
          }
        case 42: break;
        case 14: 
          { Tokens token = new Tokens("PuntoComa",yytext());
            arrayTokens.add(token);
            return token;
          }
        case 43: break;
        case 5: 
          { Tokens token = new Tokens("Menos",yytext());
            arrayTokens.add(token);
            return token;
          }
        case 44: break;
        case 36: 
          { Tokens token = new Tokens("F_Cuerpo",yytext());
          arrayTokens.add(token);
            return token;
          }
        case 45: break;
        case 13: 
          { Tokens token = new Tokens("Parentesis_C",yytext());
            arrayTokens.add(token);
            return token;
          }
        case 46: break;
        case 12: 
          { Tokens token = new Tokens("Parentesis_A",yytext());
            arrayTokens.add(token);
            return token;
          }
        case 47: break;
        case 11: 
          { Tokens token = new Tokens("Comilla",yytext());
            arrayTokens.add(token);
            return token;
          }
        case 48: break;
        case 22: 
          { Tokens token = new Tokens("Correo",yytext());
            arrayTokens.add(token);
            return token;
          }
        case 49: break;
        case 33: 
          { Tokens token = new Tokens("F_Lista",yytext());
            arrayTokens.add(token);
            return token;
          }
        case 50: break;
        case 8: 
          { Tokens token = new Tokens("Punto",yytext());
            arrayTokens.add(token);
            return token;
          }
        case 51: break;
        case 37: 
          { Tokens token = new Tokens("I_Cabecera",yytext());
          arrayTokens.add(token);
            return token;
          }
        case 52: break;
        case 2: 
          { Errores error = new Errores("LEXICO",yytext(),yyline,yycolumn,"Simbolo no Reconocido");
                        arrayErrores.add(error);
          }
        case 53: break;
        case 31: 
          { Tokens token = new Tokens("I_Tabla",yytext());
          arrayTokens.add(token);
            return token;
          }
        case 54: break;
        case 6: 
          { Tokens token = new Tokens("DosPuntos",yytext());
            arrayTokens.add(token);
            return token;
          }
        case 55: break;
        case 10: 
          { Tokens token = new Tokens("Coma",yytext());
            arrayTokens.add(token);
            return token;
          }
        case 56: break;
        case 19: 
          { Tokens token = new Tokens("I_Fila",yytext());
            arrayTokens.add(token);
            return token;
          }
        case 57: break;
        case 26: 
          { Tokens token = new Tokens("Inicio",yytext());
          arrayTokens.add(token);
            return token;
          }
        case 58: break;
        case 20: 
          { Tokens token = new Tokens("Ancho",yytext());
            arrayTokens.add(token);
            return token;
          }
        case 59: break;
        case 15: 
          { Tokens token = new Tokens("Mas",yytext());
            arrayTokens.add(token);
            return token;
          }
        case 60: break;
        case 7: 
          { Tokens token = new Tokens("Divicion",yytext());
            arrayTokens.add(token);
            return token;
          }
        case 61: break;
        case 16: 
          { Tokens token = new Tokens("Multiplicacion",yytext());
            arrayTokens.add(token);
            return token;
          }
        case 62: break;
        case 9: 
          { Tokens token = new Tokens("Igual",yytext());
            arrayTokens.add(token);
            return token;
          }
        case 63: break;
        case 32: 
          { Tokens token = new Tokens("F_Tabla",yytext());
          arrayTokens.add(token);
            return token;
          }
        case 64: break;
        case 1: 
          { Tokens token = new Tokens("Letras",yytext());
            arrayTokens.add(token);
            return token;
          }
        case 65: break;
        case 23: 
          { Tokens token = new Tokens("Enlace",yytext());
            arrayTokens.add(token);
            return token;
          }
        case 66: break;
        case 24: 
          { Tokens token = new Tokens("Alto",yytext());
            arrayTokens.add(token);
            return token;
          }
        case 67: break;
        case 3: 
          { Tokens token = new Tokens("Numero",yytext());
            arrayTokens.add(token);
            return token;
          }
        case 68: break;
        case 38: 
          { Tokens token = new Tokens("F_Cabecera",yytext());
          arrayTokens.add(token);
            return token;
          }
        case 69: break;
        case 27: 
          { Tokens token = new Tokens("I_Lista",yytext());
            arrayTokens.add(token);
            return token;
          }
        case 70: break;
        case 35: 
          { Tokens token = new Tokens("I_Cuerpo",yytext());
          arrayTokens.add(token);
            return token;
          }
        case 71: break;
        case 29: 
          { Tokens token = new Tokens("F_Fila",yytext());
            arrayTokens.add(token);
            return token;
          }
        case 72: break;
        case 30: 
          { Tokens token = new Tokens("I_Imgen",yytext());
            arrayTokens.add(token);
            return token;
          }
        case 73: break;
        case 25: 
          { Tokens token = new Tokens("Columna",yytext());
            arrayTokens.add(token);
            return token;
          }
        case 74: break;
        case 18: 
          { Tokens token = new Tokens("Titulo",yytext());
          arrayTokens.add(token);
            return token;
          }
        case 75: break;
        case 28: 
          { Tokens token = new Tokens("Fin",yytext());
          arrayTokens.add(token);
            return token;
          }
        case 76: break;
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