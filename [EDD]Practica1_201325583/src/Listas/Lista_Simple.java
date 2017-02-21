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
public class Lista_Simple {
    private Nodo raiz;
    private Nodo actual;
    private int size;
    public static final int SIZE_MAX = 7;
    
//    public static void main(String[] args) {
//        Lista_Simple ld = new Lista_Simple();
//        ld.add("hola");
//        ld.add("mundo");
//        ld.add("como");
//        ld.add("esta");
//        ld.add("usted");
//        ld.add("?");
//        
//        ld.printList();
//    }
    
    public Lista_Simple(){
        raiz = null;
        actual = null;
        size = 0;
    }
    
    public void add(Object dato){
        Nodo temp = new Nodo(null, dato);
        if(getActual() == null){
            raiz = actual = temp;
            setSize(getSize() + 1);
        }else{
            if(getActual().getSiguiente() == null){
                getActual().setSiguiente(temp);
                actual = getActual().getSiguiente();
                setSize(getSize() + 1);
            }
        }
        //this.printList();
    }
    
    public void add(Nodo dato){
        Nodo temp = dato;
        if(getActual() == null){
            raiz = actual = temp;
            setSize(getSize() + 1);
        }else{
            if(getActual().getSiguiente() == null){
                getActual().setSiguiente(temp);
                actual = getActual().getSiguiente();
                setSize(getSize() + 1);
            }
        }
        //this.printList();
    }
    
    public void addBaraja(Object dato){
        Nodo temp = new Nodo(null, dato);
        if(getActual() == null){
            raiz = actual = temp;
            setSize(getSize() + 1);
        }else{
            if(size <= SIZE_MAX){
                if(getActual().getSiguiente() == null){
                    getActual().setSiguiente(temp);
                    actual = getActual().getSiguiente();
                    setSize(getSize() + 1);
                }
            }
        }
    }
    
    public boolean removeBaraja(Object obj){
        Nodo temp = raiz; //nodo a eliminar
        while(temp != null){
            if(temp.equals(obj)){
                break;
            }
            temp = temp.getSiguiente();
        }
        
        Nodo aux = raiz;
        if(temp != null){
            while(aux.getSiguiente() != null){
                if(aux.getSiguiente().equals(temp)){
                    break;
                }
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(temp);
            return true;
        }
        return false;
    }
    
    public boolean removeBaraja(int index){
        int cont = 0;
        Nodo temp = raiz;
        while(cont < index && temp != null){
            temp = temp.getSiguiente();
            cont++;
        }
        Nodo aux = raiz;
        if(temp != null){
            while(aux.getSiguiente() != null){
                if(aux.getSiguiente().equals(temp)){
                    break;
                }
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(temp);
            return true;
        }
        return false;
    }
    
    public Object get(int index){
        int cont = 0;
        Nodo temp = getRaiz();
        
        while(cont < index){
            if(temp == null){
                return null;
            }
            temp = temp.getSiguiente();
            cont ++;
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
        while(temp != null){
            System.out.print(temp.getDato().toString() + "--->");
            temp = temp.getSiguiente();
        }
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
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
}
