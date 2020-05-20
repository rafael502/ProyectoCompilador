/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ANALIZADORES;

/**
 *
 * @author Rafael
 */
public class Errores {

    String lexema,TipoError,Descripcion;
    int linea, columna;

    public Errores(String TipoError,String lexema, int linea, int columna,String Descripcion) {
        this.TipoError=TipoError;
        this.lexema = lexema;
        this.linea = linea;
        this.columna = columna;
        this.Descripcion=Descripcion;
    }

    public Errores() {
    }

    public String getLexema() {
        return lexema;
    }

    public void setLexema(String lexema) {
        this.lexema = lexema;
    }

    public String getTipoError() {
        return TipoError;
    }

    public void setTipoError(String TipoError) {
        this.TipoError = TipoError;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getLinea() {
        return linea;
    }

    public void setLinea(int linea) {
        this.linea = linea;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    @Override
    public String toString() {
        return "Errores{" + "lexema=" + lexema + ", TipoError=" + TipoError + ", Descripcion=" + Descripcion + ", linea=" + linea + ", columna=" + columna + '}';
    }

}
