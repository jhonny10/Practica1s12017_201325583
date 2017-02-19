/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lectura;

import Juego.Dimension;
import java.io.File;
import java.util.List;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;
import Listas.Lista_Simple;

/**
 *
 * @author jhonny
 */
public class Archivo {
    //lectura de xml
    private String dimension;
    private Lista_Simple listaCasillaDobles;
    private Lista_Simple listaCasillasTriples;
    private Lista_Simple diccionario;
    
//    public static void main(String[] args) {
//        Archivo a = new Archivo();
//        a.leerXML("C:\\Users\\jhonny\\Desktop\\entradaEDD.xml");
//    }
    
    public Archivo(){
        listaCasillaDobles = new Lista_Simple();
        listaCasillasTriples = new Lista_Simple();
        diccionario = new Lista_Simple();
    }
    
    public void leerXML(String path){
        SAXBuilder builder = new SAXBuilder();
        File xml = new File(path);
                
        try{
            Document doc = (Document) builder.build(xml);
            
            Element nodoRaiz = doc.getRootElement();
            List dimensions = nodoRaiz.getChildren("dimension");
            
            Element elemento = (Element) dimensions.get(0);
            dimension = elemento.getValue();
            
            List dobles = nodoRaiz.getChildren("dobles");
            Element doble = (Element) dobles.get(0);
            
            List casillas = doble.getChildren("casilla");
            
            for(int i = 0; i < casillas.size(); i++){
                Dimension dim;
                int x;
                int y;
                
                Element casilla = (Element) casillas.get(i);
                
                List posx = casilla.getChildren("x");
                Element xx = (Element) posx.get(0);
                x = Integer.parseInt(xx.getValue());
                
                List posy = casilla.getChildren("y");
                Element yy = (Element) posy.get(0);
                y = Integer.parseInt(yy.getValue());
                
                dim = new Dimension(x, y);
                
                listaCasillaDobles.add(dim);
            }
            
            List triples = nodoRaiz.getChildren("triples");
            Element triple = (Element) triples.get(0);
            
            List casillas_t = triple.getChildren("casilla");
            
            for(int i = 0; i < casillas_t.size(); i++){
                Dimension dim;
                int x;
                int y;
                
                Element casilla_t = (Element) casillas_t.get(i);
                
                List posx = casilla_t.getChildren("x");
                Element xx = (Element) posx.get(0);
                x = Integer.parseInt(xx.getValue());
                
                List posy = casilla_t.getChildren("y");
                Element yy = (Element) posy.get(0);
                y = Integer.parseInt(yy.getValue());
                
                dim = new Dimension(x, y);
                
                listaCasillasTriples.add(dim);
            }
            
            List dic = nodoRaiz.getChildren("diccionario");
            Element word = (Element) dic.get(0);
            
            List palabras = word.getChildren("palabra");
            
            for(int i = 0; i < palabras.size(); i++){
                Element palabra = (Element) palabras.get(i);
                getDiccionario().add(palabra.getValue());
            }
            //
        }catch(Exception e){
            
        }
    }

    /**
     * @return the dimension
     */
    public String getDimension() {
        return dimension;
    }

    /**
     * @return the listaCasillaDobles
     */
    public Lista_Simple getListaCasillaDobles() {
        return listaCasillaDobles;
    }

    /**
     * @return the listaCasillasTriples
     */
    public Lista_Simple getListaCasillasTriples() {
        return listaCasillasTriples;
    }

    /**
     * @return the diccionario
     */
    public Lista_Simple getDiccionario() {
        return diccionario;
    }
}
