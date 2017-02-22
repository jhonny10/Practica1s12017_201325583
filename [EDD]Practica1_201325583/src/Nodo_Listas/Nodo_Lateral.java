/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nodo_Listas;

import Ortogonal.Lista_Horizontal;

/**
 *
 * @author jhonny
 */
public class Nodo_Lateral {
    private int y;
    private Nodo_Lateral sig, ant;
    private Lista_Horizontal fila;
    
    public Nodo_Lateral(int y){
        this.y = y;
        sig = null;
        ant = null;
        fila = new Lista_Horizontal();
    }
        
    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the x to set
     */
    public void setX(int y) {
        this.y = y;
    }

    /**
     * @return the sig
     */
    public Nodo_Lateral getSig() {
        return sig;
    }

    /**
     * @param sig the sig to set
     */
    public void setSig(Nodo_Lateral sig) {
        this.sig = sig;
    }

    /**
     * @return the ant
     */
    public Nodo_Lateral getAnt() {
        return ant;
    }

    /**
     * @param ant the ant to set
     */
    public void setAnt(Nodo_Lateral ant) {
        this.ant = ant;
    }

    /**
     * @return the fila
     */
    public Lista_Horizontal getFila() {
        return fila;
    }

    /**
     * @param fila the fila to set
     */
    public void setFila(Lista_Horizontal fila) {
        this.fila = fila;
    }
}
