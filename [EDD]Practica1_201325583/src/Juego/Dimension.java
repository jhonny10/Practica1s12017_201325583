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
public class Dimension {
    private Object x;
    private Object y;
    
    public Dimension(Object x, Object y){
        this.x = x;
        this.y = y;
    }

    /**
     * @return the x
     */
    public Object getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(Object x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public Object getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(Object y) {
        this.y = y;
    }
}
