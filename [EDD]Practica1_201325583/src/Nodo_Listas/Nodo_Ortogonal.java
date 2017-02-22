/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nodo_Listas;

/**
 *
 * @author jhonny
 */
public class Nodo_Ortogonal {
    private Object dato;
    private Nodo_Ortogonal arriba, abajo, izq, der;
    private int x, y;
    
    public Nodo_Ortogonal(Object dato, int x, int y){
        this.dato = dato;
        this.x = x;
        this.y = y;
        arriba = null;
        abajo = null;
        izq = null;
        der = null;
    }

    /**
     * @return the dato
     */
    public Object getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(Object dato) {
        this.dato = dato;
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
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * @return the arriba
     */
    public Nodo_Ortogonal getArriba() {
        return arriba;
    }

    /**
     * @param arriba the arriba to set
     */
    public void setArriba(Nodo_Ortogonal arriba) {
        this.arriba = arriba;
    }

    /**
     * @return the abajo
     */
    public Nodo_Ortogonal getAbajo() {
        return abajo;
    }

    /**
     * @param abajo the abajo to set
     */
    public void setAbajo(Nodo_Ortogonal abajo) {
        this.abajo = abajo;
    }

    /**
     * @return the izq
     */
    public Nodo_Ortogonal getIzq() {
        return izq;
    }

    /**
     * @param izq the izq to set
     */
    public void setIzq(Nodo_Ortogonal izq) {
        this.izq = izq;
    }

    /**
     * @return the der
     */
    public Nodo_Ortogonal getDer() {
        return der;
    }

    /**
     * @param der the der to set
     */
    public void setDer(Nodo_Ortogonal der) {
        this.der = der;
    }
}
