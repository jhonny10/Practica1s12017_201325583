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
public class Lista_Vertical {
    Nodo_Ortogonal first;
    Nodo_Ortogonal last;
    
    public Lista_Vertical(){
        first = null;
        last = null;
    }
    
    public void insert(Nodo_Ortogonal no){
        if(isEmpty()){
            first = last = no;
        }else{
            if(no.getY() < first.getY()){
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
    
    public void insertUp(Nodo_Ortogonal no){
        first.setArriba(no);
        no.setAbajo(first);
        first = first.getArriba();
    }
    
    public void insertDown(Nodo_Ortogonal no){
        last.setAbajo(no);
        no.setArriba(last);
        last = last.getAbajo();
    }
    
    public void insertMedio(Nodo_Ortogonal no){
        Nodo_Ortogonal temp;
        Nodo_Ortogonal aux;
        
        temp = first;
        
        while(temp.getY() < no.getY()){
            temp = temp.getAbajo();
        }
        
        aux = temp.getArriba();
        aux.setAbajo(no);
        temp.setArriba(no);
        no.setAbajo(temp);
        no.setArriba(aux);
    }
    
    public void recorrer(){
        if(!isEmpty()){
            Nodo_Ortogonal temp = first;
            
            while(temp != null){
                System.out.println("y ->" + temp.getY());
                temp = temp.getAbajo();
            }
        }
    }
    
    public boolean isEmpty(){
        if(first == null)
            return true;
        return false;
    }
    
//    public static void main(String[] args) {
//        Lista_Vertical lv = new Lista_Vertical();
//        
//        lv.insert(new Nodo_Ortogonal("dato 0,0", 0, 0));
//        lv.insert(new Nodo_Ortogonal("dato 0,0", 0, 3));
//        lv.insert(new Nodo_Ortogonal("dato 0,0", 0, 1));
//        lv.insert(new Nodo_Ortogonal("dato 0,0", 0, 5));
//        lv.insert(new Nodo_Ortogonal("dato 0,0", 0, 2));
//        
//        lv.recorrer();
//        
//        Lista_Horizontal ld = new Lista_Horizontal();
//        
//        ld.insert(new Nodo_Ortogonal("dato 0,0", 0, 0));
//        ld.insert(new Nodo_Ortogonal("dato 0,0", 3, 0));
//        ld.insert(new Nodo_Ortogonal("dato 0,0", 1, 0));
//        ld.insert(new Nodo_Ortogonal("dato 0,0", 5, 0));
//        ld.insert(new Nodo_Ortogonal("dato 0,0", 2, 0));
//        
//        ld.recorrer();
//    }
}
