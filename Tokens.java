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
public class Tokens {
    String token, lexema;

    public Tokens(String token, String lexema) {
        this.token = token;
        this.lexema = lexema;
    }

    public Tokens() {
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getLexema() {
        return lexema;
    }

    public void setLexema(String lexema) {
        this.lexema = lexema;
    }

    @Override
    public String toString() {
        return "Tokens{" + "token=" + token + ", lexema=" + lexema + '}';
    }
    
    
  
}
