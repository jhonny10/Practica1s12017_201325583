/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import Listas.Lista_Circular;
import Listas.Cola;
import Listas.Lista_Simple;
import Reporte.Reporte;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author jhonny
 */
public class Juego extends javax.swing.JFrame {

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
        initComponents();
        inicio();
    }
    
    public void inicio(){
        fichas = new Cola();
        ficha_aleatorio = new Cola();
        isJuegoActive = true;
        rep = new Reporte();
        rep_jugador = new Reporte();
        rep_fichas = new Reporte();
    }
    
    public void colocarAreaReportes(){
        panel_dic = new JPanel();
        JLabel et = new JLabel();
        et.setSize(panel_dic.getHeight(), panel_dic.getWidth());
        et.setBounds(0, 0, panel_dic.getHeight(), panel_dic.getWidth());
        panel_dic.add(et);
        panel_dic.setName("Lista Diccionario");
        this.areaReportes.add(panel_dic);
        
        panel_fichas_activas = new JPanel();
        JLabel et2 = new JLabel();
        et2.setSize(panel_fichas_activas.getHeight(), panel_fichas_activas.getWidth());
        et2.setBounds(0, 0, panel_fichas_activas.getHeight(), panel_fichas_activas.getWidth());
        panel_fichas_activas.add(et2);
        panel_fichas_activas.setName("Lista de las fichas activas");
        this.areaReportes.add(panel_fichas_activas);
        
        matriz_rep = new JPanel();
        JLabel et3 = new JLabel();
        et3.setSize(matriz_rep.getHeight(), matriz_rep.getWidth());
        et3.setBounds(0, 0, matriz_rep.getHeight(), matriz_rep.getWidth());
        matriz_rep.add(et3);
        matriz_rep.setName("Matriz Tablero");
        this.areaReportes.add(matriz_rep);
        
        panel_fichas = new JPanel();
        JLabel et4 = new JLabel();
        et4.setSize(panel_fichas.getHeight(), panel_fichas.getWidth());
        et4.setBounds(0, 0, panel_fichas.getHeight(), panel_fichas.getWidth());
        panel_fichas.add(et4);
        panel_fichas.setName("Cola de Fichas");
        this.areaReportes.add(panel_fichas);
        
        panel_jugadores = new JPanel();
        JLabel et5 = new JLabel();
        et5.setSize(panel_jugadores.getHeight(), panel_jugadores.getWidth());
        et5.setBounds(0, 0, panel_jugadores.getHeight(), panel_jugadores.getWidth());
        panel_jugadores.add(et5);
        panel_jugadores.setName("Lista Jugadores");
        this.areaReportes.add(panel_jugadores);
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
    
    public void hiloDiccionario(){
        Thread hilo = new Thread(new Runnable() {

            @Override
            public void run() {
                while(isJuegoActive){
                    try {
                        actualizarDiccionario();
                        actualizarJugador();
                        Thread.sleep(2000);
                    } catch (InterruptedException ex) {
                        
                    }
                }
            }
        });
        hilo.start();
    }
    
    public void hiloJugador(){
        Thread hilo = new Thread(new Runnable() {

            @Override
            public void run() {
                while(isJuegoActive){
                    try {
                        actualizarJugador();
                        actualizarFichas();
                        Thread.sleep(2000);
                    } catch (InterruptedException ex) {
                        
                    }
                }
            }
        });
        hilo.start();
    }

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
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
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
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        areaReportes.addTab("Lista Diccionario", jPanel3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        areaReportes.addTab("Lista Fichas Activas", jPanel4);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        areaReportes.addTab("Matriz Tablero", jPanel5);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        areaReportes.addTab("Cola de Fichas", jPanel6);

        jPanel7.setPreferredSize(new java.awt.Dimension(265, 500));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        areaReportes.addTab("Lista Jugadores", jPanel7);

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
                        .addComponent(areaReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(cambio, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(lblarea)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(areaReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
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
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        rep.eliminar_image_txt(pathTxt, pathImg);
        rep_jugador.eliminar_image_txt(pathTxtJ, pathImgJ);
        rep_fichas.eliminar_image_txt(pathTxtF, pathImgF);
        pathTxt = ""; pathTxtJ="";
        pathImg = ""; pathImgJ = "";
        pathTxtF=""; pathImgF = "";
        this.isJuegoActive = false;
    }//GEN-LAST:event_formWindowClosed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        // TODO add your handling code here:
        //agregar palabra al diccionario
        if(!txtpalabra.getText().equals("")){
            dic.add(txtpalabra.getText());
            JOptionPane.showMessageDialog(null, "Palabra: " + txtpalabra.getText() + "\n Agregado", "Informacion" ,JOptionPane.INFORMATION_MESSAGE);
            txtpalabra.setText("");
            
            //actualizarDiccionario();
        }
    }//GEN-LAST:event_agregarActionPerformed

    public void actualizarDiccionario(){
        rep.actualizar_Diccionario(dic);
        pathTxt = rep.generarTxt("txtDiccionario");
        pathImg = rep.generarImagen(pathTxt, "imgDic");
                        //colocar imagen paneldic
        JPanel jp = (JPanel)areaReportes.getComponent(0);
        JLabel jl = (JLabel)jp.getComponent(0);
        int width_d = jl.getWidth();
        int heigth_d = jl.getHeight();
        try{
            jl.setIcon(new ImageIcon(rep.icono(pathImg, width_d, heigth_d)));
        }catch(Exception ex){
            System.out.println(ex.getMessage());        
        }
        rep.reiniciarNodo();
        //eliminar archivo e imagen
        //rep.eliminar_image_txt(pathTxt, pathImagen);
    }
    
    public void actualizarJugador(){
        rep_jugador.actualizar_Jugador(jugador);
        pathTxtJ = rep_jugador.generarTxt("txtJugador");
        pathImgJ = rep_jugador.generarImagen(pathTxtJ, "imgJug");
                        //colocar imagen paneldic
        int i = areaReportes.indexOfTab("Lista Jugadores");
        JPanel jp = (JPanel)areaReportes.getComponentAt(i);
        //JPanel jp = (JPanel)areaReportes.getComponent(5);
        JLabel jl = (JLabel)jp.getComponent(0);
        int width_d = jl.getWidth();
        int heigth_d = jl.getHeight();
        try{
            jl.setIcon(new ImageIcon(rep_jugador.icono(pathImgJ, width_d, heigth_d)));
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        rep_jugador.reiniciarNodo();
    }
    
    public void actualizarFichas(){
        rep_fichas.actualizar_Fichas(ficha_aleatorio);
        pathTxtF = rep_fichas.generarTxt("txtColaFichas");
        pathImgF = rep_fichas.generarImagen(pathTxtF, "imgCF");
                        //colocar imagen paneldic
        int i = areaReportes.indexOfTab("Cola de Fichas");
        JPanel jp = (JPanel)areaReportes.getComponentAt(i);
        //JPanel jp = (JPanel)areaReportes.getComponent(5);
        JLabel jl = (JLabel)jp.getComponent(0);
        int width_d = jl.getWidth();
        int heigth_d = jl.getHeight();
        try{
            jl.setIcon(new ImageIcon(rep_fichas.icono(pathImgF, width_d, heigth_d)));
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        rep_fichas.reiniciarNodo();
        rep_fichas.setAux_diferencia(0);
    }
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
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
    private Principal p;
    private String pathTxt;//diccionario
    private String pathImg;//diccionario
    
    private String pathTxtJ;
    private String pathImgJ;
    
    private String pathTxtF;
    private String pathImgF;
    
    private Lista_Circular jugador;
    private Lista_Simple dic;    
    private Cola fichas;
    private Cola ficha_aleatorio;
    
    private String[] listado = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "L", "M", "N", "Ñ", "O", "P", "Q", "R", "S", "T", "U", "V", "X", "Y", "Z"};
    private int[] punteo = {1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 1, 3, 1, 8, 1, 3, 5, 1, 1, 1, 1, 4, 8, 4, 10};
    
    private Reporte rep;//reporte diccionario
    private Reporte rep_jugador;
    private Reporte rep_fichas;
    private boolean isJuegoActive;
    
    private JPanel panel_dic;
    private JPanel panel_fichas_activas;
    private JPanel matriz_rep;
    private JPanel panel_fichas;
    private JPanel panel_jugadores;
    
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

    /**
     * @param dic the dic to set
     */
    public void setDic(Lista_Simple dic) {
        this.dic = dic;
    }

    /**
     * @return the rep
     */
    public Reporte getRep() {
        return rep;
    }

    /**
     * @param rep the rep to set
     */
    public void setRep(Reporte rep) {
        this.rep = rep;
    }

    /**
     * @return the isJuegoActive
     */
    public boolean isIsJuegoActive() {
        return isJuegoActive;
    }

    /**
     * @param isJuegoActive the isJuegoActive to set
     */
    public void setIsJuegoActive(boolean isJuegoActive) {
        this.isJuegoActive = isJuegoActive;
    }
}
