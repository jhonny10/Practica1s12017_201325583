/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ortogonal;

import Nodo_Listas.Nodo_Lateral;

/**
 *
 * @author jhonny
 */
public class Lateral {
    private Nodo_Lateral first;
    Nodo_Lateral last;
    
    public Lateral(){
        first = null;
        last = null;
    }
    
    public void insert(Nodo_Lateral no){
        if(isEmpty()){
            setFirst(last = no);
        }else{
            if(no.getY() < getFirst().getY()){
                insertUp(no);
            }else{
                if(no.getY() > last.getY()){
                    insertDown(no);
                }else{
                    insertMedio(no);
                }
            }
        }
    }
    
    public void insertUp(Nodo_Lateral no){
        getFirst().setAnt(no);
        no.setSig(getFirst());
        setFirst(getFirst().getAnt());
    }
    
    public void insertDown(Nodo_Lateral no){
        last.setSig(no);
        no.setAnt(last);
        last = last.getSig();
    }
    
    public void insertMedio(Nodo_Lateral no){
        Nodo_Lateral temp;
        Nodo_Lateral aux;
        
        temp = getFirst();
        
        while(temp.getY() < no.getY()){
            temp = temp.getSig();
        }
        
        aux = temp.getAnt();
        aux.setSig(no);
        temp.setAnt(no);
        no.setSig(temp);
        no.setAnt(aux);
    }
    
    public void recorrer(){
        if(!isEmpty()){
            Nodo_Lateral temp = getFirst();
            
            while(temp != null){
                System.out.println("y ->" + temp.getY());
                temp = temp.getSig();
            }
        }
    }
    
    public boolean isEmpty(){
        if(getFirst() == null)
            return true;
        return false;
    }
    
    
    public boolean existe(int i){
         if(!isEmpty()){
             Nodo_Lateral temp = getFirst();
             
             while(temp != null){
                 
                 if(temp.getY() == i){
                     return true;
                 }
                 temp = temp.getSig();
             }
         }
         return false;
    }    
    
    public Nodo_Lateral search(int i){
        if(existe(i)){
            Nodo_Lateral temp = getFirst();
            
            while(temp.getY()!= i){
                
                temp = temp.getSig();
            }
            return temp;
        }
        return null;
    }

    /**
     * @return the first
     */
    public Nodo_Lateral getFirst() {
        return first;
    }

    /**
     * @param first the first to set
     */
    public void setFirst(Nodo_Lateral first) {
        this.first = first;
    }
    
    public Nodo_Lateral getLast(){
        return last;
    }
    
    public void setLast(Nodo_Lateral last){
        this.last = last;
    }
}
