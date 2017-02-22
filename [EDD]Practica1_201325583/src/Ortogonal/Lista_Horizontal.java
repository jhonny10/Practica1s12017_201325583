/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ortogonal;

import Nodo_Listas.Nodo_Ortogonal;

/**
 *
 * @author jhonny
 */
public class Lista_Horizontal {
    Nodo_Ortogonal first;
    Nodo_Ortogonal last;
    
    public Lista_Horizontal(){
        first = null;
        last = null;
    }
    
    public void insert(Nodo_Ortogonal no){
        if(isEmpty()){
            first = last = no;
        }else{
            if(no.getX() < first.getX()){
                insertUp(no);
            }else{
                if(no.getX() > last.getX()){
                    insertDown(no);
                }else{
                    insertMedio(no);
                }
            }
        }
    }
    
    public void insertUp(Nodo_Ortogonal no){
        first.setIzq(no);
        no.setDer(first);
        first = first.getIzq();
    }
    
    public void insertDown(Nodo_Ortogonal no){
        last.setDer(no);
        no.setIzq(last);
        last = last.getDer();
    }
    
    public void insertMedio(Nodo_Ortogonal no){
        Nodo_Ortogonal temp;
        Nodo_Ortogonal aux;
        
        temp = first;
        
        while(temp.getX() < no.getX()){
            temp = temp.getDer();
        }
        
        aux = temp.getIzq();
        aux.setDer(no);
        temp.setIzq(no);
        no.setDer(temp);
        no.setIzq(aux);
    }
    
    public void recorrer(){
        if(!isEmpty()){
            Nodo_Ortogonal temp = first;
            
            while(temp != null){
                System.out.println("x ->" + temp.getX());
                temp = temp.getDer();
            }
        }
    }
    
    public boolean isEmpty(){
        if(first == null)
            return true;
        return false;
    }
}
