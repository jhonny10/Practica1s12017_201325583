/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ortogonal;

import Nodo_Listas.Nodo_Cabecera;
import Nodo_Listas.Nodo_Lateral;
import Nodo_Listas.Nodo_Ortogonal;

/**
 *
 * @author jhonny
 */
public class MatrizOrtogonal {
    private Cabecera cab;
    private Lateral lat;
    
    public MatrizOrtogonal(){
        cab = new Cabecera();
        lat = new Lateral();
        
    }
    
    public void insertar(int x, int y, Object insertar){
        Nodo_Ortogonal in = new Nodo_Ortogonal(insertar, x, y);
        
        if(!cab.existe(x)){
            cab.insert(new Nodo_Cabecera(x));
        }
        if(!lat.existe(y)){
            lat.insert(new Nodo_Lateral(y));
        }
        Nodo_Cabecera ctemp;
        Nodo_Lateral ltemp;
        
        ctemp = cab.search(x);
        ltemp = lat.search(y);
        
        ctemp.getCol().insert(in);
        ltemp.getFila().insert(in);
        
        System.out.println("Se inserto en " + x + ", " + y);
    }
    
    public void llenar(int x, int y){
        int o = 0;
        for(int i = 0; i < x; i++){
                for(int j = 0; j < y; j++){
                    insertar(i, j, o);
                    o++;
                }
        }
    }
    
    public static void main(String[] args) {
        MatrizOrtogonal mo = new MatrizOrtogonal();
        mo.llenar(3, 3);
        
    }
}
