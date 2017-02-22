/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ortogonal;

import Nodo_Listas.Nodo_Cabecera;

/**
 *
 * @author jhonny
 */
public class Cabecera {
    Nodo_Cabecera first, last;
    
    public Cabecera(){
        first = null;
        last = null;
    }
    
    public void insert(Nodo_Cabecera no){
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
    
    public void insertUp(Nodo_Cabecera no){
        first.setAnt(no);
        no.setSig(first);
        first = first.getAnt();
    }
    
    public void insertDown(Nodo_Cabecera no){
        last.setSig(no);
        no.setAnt(last);
        last = last.getSig();
    }
    
    public void insertMedio(Nodo_Cabecera no){
        Nodo_Cabecera temp;
        Nodo_Cabecera aux;
        
        temp = first;
        
        while(temp.getX() < no.getX()){
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
            Nodo_Cabecera temp = first;
            
            while(temp != null){
                System.out.println("x ->" + temp.getX());
                temp = temp.getSig();
            }
        }
    }
    
    public boolean existe(int i){
         if(!isEmpty()){
             Nodo_Cabecera temp = first;
             
             while(temp != null){
                 
                 if(temp.getX() == i){
                     return true;
                 }
                 temp = temp.getSig();
             }
         }
         return false;
    }
    
    public boolean isEmpty(){
        if(first == null)
            return true;
        return false;
    }
    
    public Nodo_Cabecera search(int i){
        if(existe(i)){
            Nodo_Cabecera temp = first;
            
            while(temp.getX() != i){
                
                temp = temp.getSig();
            }
            return temp;
        }
        return null;
    }
    
//    public static void main(String[] args) {
//        Cabecera cabe = new Cabecera();
//        cabe.insert(new Nodo_Cabecera(3));
//        cabe.insert(new Nodo_Cabecera(0));
//        cabe.insert(new Nodo_Cabecera(1));
//        cabe.insert(new Nodo_Cabecera(5));
//        cabe.insert(new Nodo_Cabecera(4));
//        cabe.recorrer();
//        System.out.println(cabe.existe(50));
//        Nodo_Cabecera t = cabe.search(50);
//        System.out.println(t);
//        
//        Lateral l = new Lateral();
//        l.insert(new Nodo_Lateral(6));
//        l.insert(new Nodo_Lateral(7));
//        l.insert(new Nodo_Lateral(4));
//        l.insert(new Nodo_Lateral(0));
//        l.insert(new Nodo_Lateral(1));
//        l.recorrer();
//        
//        System.out.println(l.existe(6));
//        System.out.println(l.existe(9));
//        Nodo_Lateral g = l.search(4);
//        System.out.println(g);
//    }
}
