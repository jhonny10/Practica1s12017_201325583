/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import Juego.Ficha;
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
        buscarActual();
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
    
    public void buscarActual(){
        Nodo temp = raiz;
        if(temp == null){
            actual = null;
        }else{
            while(temp.getSiguiente() != null){
                temp = temp.getSiguiente();
            }
            actual = temp;
        }
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
    
    public Object removeBaraja(Object obj){
        Nodo temp = raiz; //nodo a eliminar
        while(temp != null){
            if(temp.getDato().equals(obj)){
                break;
            }
            temp = temp.getSiguiente();
        }
        
        Nodo aux = raiz;
        if(temp != null){
            if(temp.getDato().equals(raiz.getDato())){
                Nodo aux2 = raiz;
                raiz = null;
                raiz = aux2.getSiguiente();
                size --;
                return temp.getDato();
            }else{
                while(aux.getSiguiente() != null){
                    if(aux.getSiguiente().equals(temp)){
                        break;
                    }
                    aux = aux.getSiguiente();
                }
                aux.setSiguiente(temp.getSiguiente());
                size --;
                return temp.getDato();
            }
        }
        return null;
    }
    
    public Object removeBaraja(int index){
        int cont = 0;
        Nodo temp = raiz;
        while(cont < index && temp != null){
            temp = temp.getSiguiente();
            cont++;
        }
        if(cont == 0){
            temp = raiz;
            raiz = raiz.getSiguiente();
            size --;
            return temp; 
        }else{
            Nodo aux = raiz;
            if(temp != null){
                while(aux.getSiguiente() != null){
                    if(aux.getSiguiente().equals(temp)){
                        break;
                    }
                    aux = aux.getSiguiente();
                }
                aux.setSiguiente(temp.getSiguiente());
                size --;
                return temp.getDato();
            }
        }
        return null;
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
    
    public Object get(String letra){
        Nodo temp = getRaiz();
        
        while(temp != null){
            
            Ficha f = (Ficha) temp.getDato();
            
            if(f.getFicha().equals(letra)){
                return temp.getDato();
            }
            temp = temp.getSiguiente();
        }
        
        return null;
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
