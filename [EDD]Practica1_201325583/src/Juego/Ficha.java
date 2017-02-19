/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

/**
 *
 * @author jhonny
 */
public class Ficha {
    private String ficha;
    private int punteo;
    
    public Ficha(String ficha, int punteo){
        this.ficha  = ficha;
        this.punteo = punteo;
    }

    /**
     * @return the ficha
     */
    public String getFicha() {
        return ficha;
    }

    /**
     * @param ficha the ficha to set
     */
    public void setFicha(String ficha) {
        this.ficha = ficha;
    }

    /**
     * @return the punteo
     */
    public int getPunteo() {
        return punteo;
    }

    /**
     * @param punteo the punteo to set
     */
    public void setPunteo(int punteo) {
        this.punteo = punteo;
    }
}
