/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reporte;

import Juego.Ficha;
import Listas.Cola;
import Listas.Lista_Circular;
import Listas.Lista_Simple;
import Nodo_Listas.Nodo;
import java.awt.Image;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import javax.swing.ImageIcon;

/**
 *
 * @author jhonny
 */
public class Reporte {
    private String nodos = "digraph ejemplo{";
    private Nodo raiz_aux;
    private int aux_diferencia;
    
    public void actualizar_Jugador(Lista_Circular jugador){
        //como es circular
        if(jugador.getRaiz() != null){
            raiz_aux = jugador.getRaiz();
            recorre_Jugador(jugador.getRaiz());
        }
    }
    
    public void actualizar_Fichas_activas(Lista_Simple ls){
        recorre_A(ls.getRaiz());
    }
    
    public void actualizar_Fichas(Cola fichas){
        recorre_Fichas(fichas.getFirst());
    }
        
    public void actualizar_Diccionario(Lista_Simple dic){
        recorre_Dic(dic.getRaiz());
    }
    
    public void recorre_Jugador(Nodo raiz){
        Nodo temp = raiz;
        if(temp != null){
            if(temp.getSiguiente() != null){
                if(!temp.getSiguiente().equals(raiz_aux)){
                    nodos = nodos + raiz.getDato().toString() + "->" + raiz.getSiguiente().getDato().toString() + ";\n";
                    recorre_Jugador(raiz.getSiguiente());
                }else{
                    String dato = temp.getDato().toString();
                    nodos = nodos + dato + "->" + raiz_aux.getDato().toString() + ";\n";
                }
            }else{
                if(!temp.equals(raiz_aux)){
                    nodos = nodos + raiz.getDato().toString() + "->" + raiz.getSiguiente().getDato().toString() + ";\n";
                    recorre_Jugador(raiz.getSiguiente());
                }else{
                    String dato = raiz.getDato().toString();
                    nodos = nodos + dato + "->" + dato + ";\n";
                }
            }
            
        }
    }
    
    public void recorre_Fichas(Nodo raiz){
        if(raiz != null){
            if(raiz.getSiguiente() != null){
                Ficha rz = (Ficha) raiz.getDato();
                Ficha rzsig = (Ficha) raiz.getSiguiente().getDato();
                nodos = nodos + rz.getFicha() +  "->";
                //aux_diferencia ++;
                nodos = nodos + rzsig.getFicha() + ";\n";
            }
            recorre_Fichas(raiz.getSiguiente());
        }
    }
    
    public void recorre_Dic(Nodo raiz){
        if(raiz != null){
            if(raiz.getSiguiente() != null){
                nodos = nodos + raiz.getDato().toString() + "->" + raiz.getSiguiente().getDato().toString() + ";\n";
            }
            recorre_Dic(raiz.getSiguiente());
        }
    }
    
    public void recorre_A(Nodo raiz){
        if(raiz != null){
            if(raiz.getSiguiente() != null){
                Ficha f1 = (Ficha) raiz.getDato();
                Ficha f2 = (Ficha) raiz.getSiguiente().getDato();
                
                nodos = nodos + f1.getFicha() + "->" + f2.getFicha() + ";\n";
            }
            recorre_A(raiz.getSiguiente());
        }
    }
    
    public  void reiniciarNodo(){
        nodos = "digraph ejemplo{";
    }
    
    public Image icono(String url, int width, int heigth){
        ImageIcon ico = new ImageIcon(url);
        Image img = ico.getImage();
        Image imagen = img.getScaledInstance(width, heigth, Image.SCALE_SMOOTH);
        return imagen;
    }
    
    public String generarTxt(String path){
            File f = new File("C:\\txtDot\\" + path + ".txt");//"C:\\Users\\usuario\\Desktop\\ejemplo.txt");//, nodos + "}");
            try{
                    FileWriter fw = new FileWriter(f, false);
                    BufferedWriter br = new BufferedWriter(fw);
                    br.write(getNodos() + "}");
                    br.close();
                    fw.close();
            }catch(Exception e){
                
            }
            return f.getPath();
        }
    
    public String generarImagen(String path, String nombre){
        String pathImagen = "";
        try{
            String dopath = "C:\\release\\bin\\dot.exe";
            String architxt = path; //"C:\\txtDot\\" + path + ".txt";//path;//"C:\\Users\\usuario\\Desktop\\ejemplo.txt";
            pathImagen = "C:\\imgDot\\" + nombre + ".png";
            String parpng = "-Tpng";
            String paro = "-o";
               
            String cmd[] = new String[5];
            cmd[0] = dopath;
            cmd[1] = parpng;
            cmd[2] = architxt;
            cmd[3] = paro;
            cmd[4] = pathImagen;
              
            Runtime rt = Runtime.getRuntime();
            rt.exec(cmd);
        }catch(Exception e){
            System.out.println(e.toString());
        }
        return pathImagen;
    }
    
    public void eliminar_image_txt(String pathtxt, String pathImg){
        File f = new File(pathtxt);
        f.delete();
        File fimg = new File(pathImg);
        fimg.delete();
    }
    /**
     * @return the nodos
     */
    public String getNodos() {
        return nodos;
    }

    /**
     * @param nodos the nodos to set
     */
    public void setNodos(String nodos) {
        this.nodos = nodos;
    }

    /**
     * @param aux_diferencia the aux_diferencia to set
     */
    public void setAux_diferencia(int aux_diferencia) {
        this.aux_diferencia = aux_diferencia;
    }
}
