/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import Listas.Lista_Circular;
import Listas.Cola;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author jhonny
 */
public class Juego extends javax.swing.JFrame {

    private Principal p;
    private Lista_Circular jugador;
    private Cola fichas;
    private Cola ficha_aleatorio;
    private String[] listado = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "L", "M", "N", "Ñ", "O", "P", "Q", "R", "S", "T", "U", "V", "X", "Y", "Z"};
    private int[] punteo = {1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 1, 3, 1, 8, 1, 3, 5, 1, 1, 1, 1, 4, 8, 4, 10};
    /**
     * Creates new form Juego
     */
    public Juego() {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        fichas = new Cola();
        ficha_aleatorio = new Cola();
        initComponents();
        colocarAreaReportes();
    }
    
    public void colocarAreaReportes(){
        JPanel jp = new JPanel();
        jp.setName("Lista Diccionario");
        this.areaReportes.add(jp);
        
        JPanel jp2 = new JPanel();
        jp2.setName("Lista de las fichas activas");
        this.areaReportes.add(jp2);
        
        JPanel jp3 = new JPanel();
        jp3.setName("Matriz Tablero");
        this.areaReportes.add(jp3);
        
        JPanel jp4 = new JPanel();
        jp4.setName("Cola de Fichas");
        this.areaReportes.add(jp4);
        
        JPanel jp5 = new JPanel();
        jp5.setName("Lista Jugadores");
        this.areaReportes.add(jp5);
    }
    
    public void inicializarFichas(){ //pendiente
        
        for(int i = 0; i < listado.length; i++){
            fichas.encolar(new Ficha(listado[i], punteo[i]));
        }
        
        int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, g = 0, h = 0, i = 0, j = 0, l = 0, m = 0, n = 0, ñ = 0, o = 0, pe = 0, q = 0, r = 0, s = 0, t = 0, u = 0,v = 0,x = 0, y = 0, z = 0;
        Random aleatorio = new Random();
        boolean ingresado = false;
        
        while(!ingresado && fichas.getSize() > 0){
            int num = 0 ;//aleatorio.nextInt(fichas.getSize());
            try{
                num = aleatorio.nextInt(fichas.getSize());
            }catch(Exception ex){
                //JOptionPane.showMessageDialog(null, "Error num: " + fichas.getSize());
            }
            Ficha comparacion = (Ficha) fichas.get(num);
            
            if(comparacion == null){
                break;
            }
            
            String letra = comparacion.getFicha();
            int punteletra = comparacion.getPunteo();
            
            if(a >= 12 && e >= 12 && o >= 9 && i >= 6 && s >= 6 && n >= 5 && l >= 4 && r >= 5 && u >= 5
                    && t >= 4 && d >= 5 && g >= 2 && c >= 4 && b >= 2 && m >= 2 && pe >= 2 && h >= 2 && f >= 1
                    && v >= 1 && y >= 1 && q >= 1 && j >= 1 && ñ >= 1 && x >= 1 && z >= 1){
                ingresado = true;
            }
            
            switch(letra){
                case "A":
                    if(a < 12){
                        ficha_aleatorio.encolar(new Ficha(letra, punteletra));
                        a++;
                    }else{
                        Object obj = fichas.get(letra, punteletra);
                        boolean fa = fichas.remover(obj);
                    }
                    break;
                case "B":
                    if(b < 2){
                        ficha_aleatorio.encolar(new Ficha(letra, punteletra));
                        b++;
                    }else{
                        Object obj = fichas.get(letra, punteletra);
                        boolean fa = fichas.remover(obj);
                    }
                    break;
                case "C":
                    if(c < 4){
                        ficha_aleatorio.encolar(new Ficha(letra, punteletra));
                        c++;
                    }else{
                        Object obj = fichas.get(letra, punteletra);
                        boolean fa = fichas.remover(obj);
                    }
                    break;
                case "D":
                    if(d < 5){
                        ficha_aleatorio.encolar(new Ficha(letra, punteletra));
                        d++;
                    }else{
                        Object obj = fichas.get(letra, punteletra);
                        boolean fa = fichas.remover(obj);
                    }
                    break;
                case "E":
                    if(e < 12){
                        ficha_aleatorio.encolar(new Ficha(letra, punteletra));
                        e++;
                    }else{
                       Object obj = fichas.get(letra, punteletra);
                        boolean fa = fichas.remover(obj);
                    }
                    break;
                case "F":
                    if(f < 1){
                        ficha_aleatorio.encolar(new Ficha(letra, punteletra));
                        f++;
                    }else{
                        Object obj = fichas.get(letra, punteletra);
                        boolean fa = fichas.remover(obj);
                    }
                    break;
                case "G":
                    if(g < 2){
                        ficha_aleatorio.encolar(new Ficha(letra, punteletra));
                        g++;
                    }else{
                        Object obj = fichas.get(letra, punteletra);
                        boolean fa = fichas.remover(obj);
                    }
                    break;
                case "H":
                    if(h < 2){
                        ficha_aleatorio.encolar(new Ficha(letra, punteletra));
                        h++;
                    }else{
                        Object obj = fichas.get(letra, punteletra);
                        boolean fa = fichas.remover(obj);
                    }
                    break;
                case "I":
                    if(i < 6){
                        ficha_aleatorio.encolar(new Ficha(letra, punteletra));
                        i++;
                    }else{
                        Object obj = fichas.get(letra, punteletra);
                        boolean fa = fichas.remover(obj);
                    }
                    break;
                case "J":
                    if(j < 1){
                        ficha_aleatorio.encolar(new Ficha(letra, punteletra));
                        j++;
                    }else{
                        Object obj = fichas.get(letra, punteletra);
                        boolean fa = fichas.remover(obj);
                    }
                    break;
                case "L":
                    if(l < 4){
                        ficha_aleatorio.encolar(new Ficha(letra, punteletra));
                        l++;
                    }else{
                        Object obj = fichas.get(letra, punteletra);
                        boolean fa = fichas.remover(obj);
                    }
                    break;
                case "M":
                    if(m < 2){
                        ficha_aleatorio.encolar(new Ficha(letra, punteletra));
                        m++;
                    }else{
                        Object obj = fichas.get(letra, punteletra);
                        boolean fa = fichas.remover(obj);
                    }
                    break;
                case "N":
                    if(n < 5){
                        ficha_aleatorio.encolar(new Ficha(letra, punteletra));
                        n++;
                    }else{
                        Object obj = fichas.get(letra, punteletra);
                        boolean fa = fichas.remover(obj);
                    }
                    break;
                case "Ñ":
                    if(ñ < 1){
                        ficha_aleatorio.encolar(new Ficha(letra, punteletra));
                        ñ++;
                    }else{
                        Object obj = fichas.get(letra, punteletra);
                        boolean fa = fichas.remover(obj);
                    }
                    break;
                case "O":
                    if(o < 9){
                        ficha_aleatorio.encolar(new Ficha(letra, punteletra));
                        o++;
                    }else{
                        Object obj = fichas.get(letra, punteletra);
                        boolean fa = fichas.remover(obj);
                    }
                    break;
                case "P":
                    if(pe < 2){
                        ficha_aleatorio.encolar(new Ficha(letra, punteletra));
                        pe++;
                    }else{
                        Object obj = fichas.get(letra, punteletra);
                        boolean fa = fichas.remover(obj);
                    }
                    break;
                case "Q":
                    if(q < 1){
                        ficha_aleatorio.encolar(new Ficha(letra, punteletra));
                        q++;
                    }else{
                        Object obj = fichas.get(letra, punteletra);
                        boolean fa = fichas.remover(obj);
                    }
                    break;
                case "R":
                    if(r < 5){
                        ficha_aleatorio.encolar(new Ficha(letra, punteletra));
                        r++;
                    }else{
                        Object obj = fichas.get(letra, punteletra);
                        boolean fa = fichas.remover(obj);
                    }
                    break;    
                case "S":
                    if(s < 6){
                        ficha_aleatorio.encolar(new Ficha(letra, punteletra));
                        s++;
                    }else{
                        Object obj = fichas.get(letra, punteletra);
                        boolean fa = fichas.remover(obj);
                    }
                    break;
                case "T":
                    if(t < 4){
                        ficha_aleatorio.encolar(new Ficha(letra, punteletra));
                        t++;
                    }else{
                        Object obj = fichas.get(letra, punteletra);
                        boolean fa = fichas.remover(obj);
                    }
                    break;
                case "U":
                    if(u < 5){
                        ficha_aleatorio.encolar(new Ficha(letra, punteletra));
                        u++;
                    }else{
                        Object obj = fichas.get(letra, punteletra);
                        boolean fa = fichas.remover(obj);
                    }
                    break;
                case "V":
                    if(v < 1){
                        ficha_aleatorio.encolar(new Ficha(letra, punteletra));
                        v++;
                    }else{
                        Object obj = fichas.get(letra, punteletra);
                        boolean fa = fichas.remover(obj);
                    }
                    break;
                case "X":
                    if(x < 1){
                        ficha_aleatorio.encolar(new Ficha(letra, punteletra));
                        x++;
                    }else{
                        Object obj = fichas.get(letra, punteletra);
                        boolean fa = fichas.remover(obj);
                    }
                    break;
                case "Y":
                    if(y < 1){
                        ficha_aleatorio.encolar(new Ficha(letra, punteletra));
                        y++;
                    }else{
                        Object obj = fichas.get(letra, punteletra);
                        boolean fa = fichas.remover(obj);
                    }
                    break;
                case "Z":
                    if(z < 1){
                        ficha_aleatorio.encolar(new Ficha(letra, punteletra));
                        z++;
                    }else{
                        Object obj = fichas.get(letra, punteletra);
                        boolean fa = fichas.remover(obj);
                    }
                    break;
            }
        }
        JOptionPane.showMessageDialog(null, "Hecho");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTurno = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblPuntuacion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaPuntuacion = new javax.swing.JList();
        txtpalabra = new javax.swing.JTextField();
        lblnuevapalabra = new javax.swing.JLabel();
        agregar = new javax.swing.JButton();
        ch2 = new javax.swing.JCheckBox();
        ch6 = new javax.swing.JCheckBox();
        ch3 = new javax.swing.JCheckBox();
        ch7 = new javax.swing.JCheckBox();
        ch4 = new javax.swing.JCheckBox();
        lblcambiar = new javax.swing.JLabel();
        cb1 = new javax.swing.JCheckBox();
        ch5 = new javax.swing.JCheckBox();
        cambio = new javax.swing.JButton();
        lblarea = new javax.swing.JLabel();
        areaReportes = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setFont(new java.awt.Font("Comic Sans MS", 0, 10)); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        lblTurno.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblTurno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTurno.setText("Turno de:");

        lblUsuario.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuario.setText("Usuario 1");

        lblPuntuacion.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        lblPuntuacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPuntuacion.setText("Puntuacion:");

        listaPuntuacion.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        listaPuntuacion.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listaPuntuacion);

        txtpalabra.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtpalabra.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblnuevapalabra.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblnuevapalabra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblnuevapalabra.setText("Nueva Palabra:");

        agregar.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        agregar.setText("Agregar");

        ch2.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N

        ch6.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N

        ch3.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N

        ch7.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N

        ch4.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N

        lblcambiar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblcambiar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcambiar.setText("Cambiar Letras:");

        cb1.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N

        ch5.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N

        cambio.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        cambio.setText("Agregar");

        lblarea.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        lblarea.setText("AREA DE REPORTES");

        areaReportes.setFont(new java.awt.Font("Comic Sans MS", 0, 9)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblcambiar, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                                .addComponent(txtpalabra)
                                .addComponent(lblnuevapalabra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1)
                                .addComponent(lblPuntuacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblTurno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(22, 22, 22)
                                    .addComponent(agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cambio, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(ch2))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ch3, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(ch4, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addGap(53, 53, 53)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ch7)
                                    .addComponent(ch6)
                                    .addComponent(ch5)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(cb1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(areaReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblarea)
                        .addGap(26, 26, 26))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTurno)
                        .addGap(18, 18, 18)
                        .addComponent(lblUsuario)
                        .addGap(23, 23, 23)
                        .addComponent(lblPuntuacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(lblnuevapalabra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtpalabra, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblcambiar)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cb1)
                            .addComponent(ch5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ch2)
                            .addComponent(ch6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ch3)
                            .addComponent(ch7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ch4)
                        .addGap(18, 18, 18)
                        .addComponent(cambio, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(lblarea)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(areaReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jButton1.setPreferredSize(new java.awt.Dimension(40, 40));

        jButton2.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jButton2.setPreferredSize(new java.awt.Dimension(40, 40));

        jButton3.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jButton3.setPreferredSize(new java.awt.Dimension(40, 40));

        jButton4.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jButton4.setPreferredSize(new java.awt.Dimension(40, 40));

        jButton5.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jButton5.setPreferredSize(new java.awt.Dimension(40, 40));

        jButton6.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jButton6.setPreferredSize(new java.awt.Dimension(40, 40));

        jButton7.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jButton7.setPreferredSize(new java.awt.Dimension(40, 40));

        jButton8.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jButton8.setText("Cancelar Tiro");

        jButton9.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jButton9.setText("Validar Tiro");

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel1.setText("Letras Activas");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        this.setVisible(false);
        if(p != null){
            p.setVisible(true);
        }
    }//GEN-LAST:event_formWindowClosed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JTabbedPane areaReportes;
    private javax.swing.JButton cambio;
    private javax.swing.JCheckBox cb1;
    private javax.swing.JCheckBox ch2;
    private javax.swing.JCheckBox ch3;
    private javax.swing.JCheckBox ch4;
    private javax.swing.JCheckBox ch5;
    private javax.swing.JCheckBox ch6;
    private javax.swing.JCheckBox ch7;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPuntuacion;
    private javax.swing.JLabel lblTurno;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblarea;
    private javax.swing.JLabel lblcambiar;
    private javax.swing.JLabel lblnuevapalabra;
    private javax.swing.JList listaPuntuacion;
    private javax.swing.JTextField txtpalabra;
    // End of variables declaration//GEN-END:variables

    /**
     * @param p the p to set
     */
    public void setP(Principal p) {
        this.p = p;
    }

    /**
     * @param jugador the jugador to set
     */
    public void setJugador(Lista_Circular jugador) {
        this.jugador = jugador;
    }
}
