/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nodo_Listas;

import Ortogonal.Lista_Vertical;

/**
 *
 * @author jhonny
 */
public class Nodo_Cabecera {
    private int x;
    private Nodo_Cabecera sig, ant;
    private Lista_Vertical col;
    
    public Nodo_Cabecera(int x){
        this.x = x;
        sig = null;
        ant = null;
        col = new Lista_Vertical();
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the sig
     */
    public Nodo_Cabecera getSig() {
        return sig;
    }

    /**
     * @param sig the sig to set
     */
    public void setSig(Nodo_Cabecera sig) {
        this.sig = sig;
    }

    /**
     * @return the ant
     */
    public Nodo_Cabecera getAnt() {
        return ant;
    }

    /**
     * @param ant the ant to set
     */
    public void setAnt(Nodo_Cabecera ant) {
        this.ant = ant;
    }

    /**
     * @return the col
     */
    public Lista_Vertical getCol() {
        return col;
    }

    /**
     * @param col the col to set
     */
    public void setCol(Lista_Vertical col) {
        this.col = col;
    }
}
