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
public class Nodo_Orto {
    private Object dato;
    private int x, y;
    private Nodo_Orto up, down, left, right;
    
    public Nodo_Orto(Object dato, int x, int y){
        up = null;
        down = null;
        left = null;
        right = null;
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
     * @return the up
     */
    public Nodo_Orto getUp() {
        return up;
    }

    /**
     * @param up the up to set
     */
    public void setUp(Nodo_Orto up) {
        this.up = up;
    }

    /**
     * @return the down
     */
    public Nodo_Orto getDown() {
        return down;
    }

    /**
     * @param down the down to set
     */
    public void setDown(Nodo_Orto down) {
        this.down = down;
    }

    /**
     * @return the left
     */
    public Nodo_Orto getLeft() {
        return left;
    }

    /**
     * @param left the left to set
     */
    public void setLeft(Nodo_Orto left) {
        this.left = left;
    }

    /**
     * @return the right
     */
    public Nodo_Orto getRight() {
        return right;
    }

    /**
     * @param right the right to set
     */
    public void setRight(Nodo_Orto right) {
        this.right = right;
    }
}
