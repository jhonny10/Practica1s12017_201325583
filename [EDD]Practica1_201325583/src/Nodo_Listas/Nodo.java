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
public class Nodo {
    private Nodo siguiente;
    private Nodo anterior;
    private Object dato;
    
    public Nodo(Nodo siguiente){
        this.siguiente = siguiente;
    }
    
    public Nodo(Nodo siguiente, Object dato){
        this.siguiente = siguiente;
        this.dato = dato;
    }
    
    public Nodo(Nodo anterior, Nodo siguiente, Object dato){
        this.anterior = anterior;
        this.siguiente = siguiente;
        this.dato = dato;
    }

    /**
     * @return the siguiente
     */
    public Nodo getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the anterior
     */
    public Nodo getAnterior() {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
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
}
