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
public class Cola {
    private Nodo first;//primero
    private Nodo last;//ultimo
    private int size;
   //push despues del 4          cola 1, 2, 3, 4 
    //pop el 1 extraccion
    public Cola(){
        first = last = null;
        size = 0;
    }
    // null <-- raiz --> nodo5 --> null         cont 0...index =1
    
    public boolean remover(Object ob){
        Nodo temp = first;  //el que en verdad se elimina
                
        while(temp != null){
            
            if(temp.getDato().equals(ob)){
                Nodo sig = temp.getSiguiente();
                Nodo ant = temp.getAnterior();
                
                if(sig != null){
                    sig.setAnterior(ant);
                }
                if(ant != null){
                    ant.setSiguiente(sig);
                }
                if(sig == null && ant == null){
                    first = last = null;
                }
                size--;
                return true;
            }
            temp = temp.getSiguiente();
        }
        return false;
    }
    public Object remover(int index){
        int cont = 0;
        Nodo temp = first;
        Nodo aux = null;
        while(cont < index && temp != null){
            aux = temp;
            temp = temp.getSiguiente();
            cont ++;
        }
        if(aux != null){
            Nodo sig = aux.getSiguiente();
            Nodo anterior = aux.getAnterior();
            if(sig != null){
                sig.setAnterior(anterior);
            }
            if(anterior != null){
                anterior.setSiguiente(sig);
            }
            if(anterior == null && sig == null){
                first = last = null;
            }
            size--;
            return aux;
        }
        
        return null;
    }
    
    public void encolar(Object dato){
        if(first == null){
            first = last = new Nodo(null, null, dato);
            size ++;
        }else{
            last.setSiguiente(new Nodo(last, null, dato));
            last = last.getSiguiente();
            size ++;
        }
    }
    
    public Nodo desencolar(){
        Nodo temp = first;
        if(first != null){
            first = first.getSiguiente();
            first.setAnterior(null);
            size --;
        }
        return temp;
    }
    
    public Object get(int index){
        int cont = 0;
        Nodo temp = first;
        
        while(cont < index){
            if(temp == null){
                return null;
            }
            temp = temp.getSiguiente();
            cont ++;
        }
        
        return temp.getDato();
    }
    
    public Object get(String letra, int punteo){
        Nodo temp = first;
        
        while(temp != null){
            Ficha f = (Ficha) temp.getDato();
            
            if(f.getFicha().equals(letra) && f.getPunteo() == punteo){
                return temp.getDato();
            }
            
            temp = temp.getSiguiente();
        }
        
        return null;
    }
    
    public int index(String letra, int punteo){
        Nodo temp = first;
        int cont = -1;
        
        while(temp != null){
            Ficha f = (Ficha) temp.getDato();
            
            if(f.getFicha().equals(letra) && f.getPunteo() == punteo){
                break;
            }
            temp = temp.getSiguiente();
            cont++;
        }
        
        return cont;
    }
    
    public void clear(){
        first = null;
        last = null;
        size = 0;
    }
    
    public boolean isEmpty(){
        if(first == null)
            return true;
        return false;
    }
    
    public void printList(){
        Nodo temp = first;
        while(temp != null){
            System.out.print(temp.getDato().toString() + "--->");
            temp = temp.getSiguiente();
        }
    }
    
    public Object getFront(){
        return first;        
    }
    
    public Object getBack(){
        return last;
    }

    /**
     * @return the first
     */
    public Nodo getFirst() {
        return first;
    }

    /**
     * @return the last
     */
    public Nodo getLast() {
        return last;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }
}
