/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import Nodo_Listas.Nodo;

/**
 *
 * @author jhonny
 */
public class Lista_Circular {
    private Nodo raiz;
    private Nodo actual;
    private int size;
    private Lista_Simple baraja;
    
    public  Lista_Circular(){
        baraja = new Lista_Simple();
        raiz = null;
        actual = null;
        size = 0;
    }    
    
    //        raiz--> nuevo --> otro --> raiz
    public void add(Object dato){
        if(actual == null){
            raiz = actual = new Nodo(null, dato);
            size ++;
        }else{
            actual.setSiguiente(new Nodo(raiz, dato));
            actual = actual.getSiguiente();
            size ++;
        }
    }
    
    public Object get(int index){
        int cont = 0;
        Nodo temp = getRaiz();
        
        while(cont < index && index <= size){
            temp = temp.getSiguiente();
            cont ++;
        }
        
        if(index > size){
            return null;
        }
        
        return temp.getDato();
    }
    
    public void clear(){
        raiz = null;
        actual = null;
        size = 0;
    }
    
    public boolean isEmpty(){
        if(getRaiz() == null)
            return true;
        return false;
    }
    
    public void printList(){
        Nodo temp = getRaiz();
        if(temp != null){
            System.out.println(temp.getDato().toString());
            temp = temp.getSiguiente();
            
            while(!temp.equals(raiz)){
                System.out.print(temp.getDato().toString() + "--->");
                System.out.println("sig: " + temp.getSiguiente().toString());
                temp = temp.getSiguiente();
            }
        }
    }

    /**
     * @return the raiz
     */
    public Nodo getRaiz() {
        return raiz;
    }

    /**
     * @return the actual
     */
    public Nodo getActual() {
        return actual;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @return the baraja
     */
    public Lista_Simple getBaraja() {
        return baraja;
    }

    /**
     * @param baraja the baraja to set
     */
    public void setBaraja(Lista_Simple baraja) {
        this.baraja = baraja;
    }
}
