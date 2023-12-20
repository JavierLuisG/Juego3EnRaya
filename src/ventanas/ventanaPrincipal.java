/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class ventanaPrincipal extends javax.swing.JFrame {
    
    // matriz para que al darse nuevamente click no se realice accion
    private boolean casilla[][] = new boolean[3][3];
    private String turno = "usuario1";
    private int matriz[][] = new int[3][3];

    public ventanaPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        setSize(600, 600);
        llenarCasillas();
        llenarMatriz();
    }
        // metodo para inicializar las casillas     
    private void llenarCasillas(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                casilla[i][j] = true;                
            }
        }
    }
    private void llenarMatriz(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = 0;
            }
        }
    }
    // Metodo para dibujar la X cuando se teclee la posicion
    private void dibujarX(JButton boton){
        boton.setIcon(new ImageIcon(getClass().getResource("/img/X.png")));
    }
    // Metodo para dibujar la O cuando se teclee la posicion
    private void dibujarO(JButton boton){
        boton.setIcon(new ImageIcon(getClass().getResource("/img/O.png")));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        botonArribaIzq = new javax.swing.JButton();
        botonArriba = new javax.swing.JButton();
        botonArribaDerecha = new javax.swing.JButton();
        botonIzq = new javax.swing.JButton();
        botonCentro = new javax.swing.JButton();
        botonDerecha = new javax.swing.JButton();
        botonAbajoIzq = new javax.swing.JButton();
        botonAbajo = new javax.swing.JButton();
        botonAbajoDerecha = new javax.swing.JButton();
        barraMenu = new javax.swing.JMenuBar();
        menuJuego = new javax.swing.JMenu();
        comenzarDeNuevo = new javax.swing.JMenuItem();
        mostrarResultados = new javax.swing.JMenuItem();
        separador = new javax.swing.JPopupMenu.Separator();
        salir = new javax.swing.JMenuItem();
        munuAyuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));

        panel.setBackground(new java.awt.Color(102, 102, 102));
        panel.setLayout(new java.awt.GridLayout(3, 3));

        botonArribaIzq.setBackground(new java.awt.Color(102, 102, 102));
        botonArribaIzq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonArribaIzqActionPerformed(evt);
            }
        });
        panel.add(botonArribaIzq);

        botonArriba.setBackground(new java.awt.Color(102, 102, 102));
        botonArriba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonArribaActionPerformed(evt);
            }
        });
        panel.add(botonArriba);

        botonArribaDerecha.setBackground(new java.awt.Color(102, 102, 102));
        botonArribaDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonArribaDerechaActionPerformed(evt);
            }
        });
        panel.add(botonArribaDerecha);

        botonIzq.setBackground(new java.awt.Color(102, 102, 102));
        botonIzq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIzqActionPerformed(evt);
            }
        });
        panel.add(botonIzq);

        botonCentro.setBackground(new java.awt.Color(102, 102, 102));
        botonCentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCentroActionPerformed(evt);
            }
        });
        panel.add(botonCentro);

        botonDerecha.setBackground(new java.awt.Color(102, 102, 102));
        botonDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDerechaActionPerformed(evt);
            }
        });
        panel.add(botonDerecha);

        botonAbajoIzq.setBackground(new java.awt.Color(102, 102, 102));
        botonAbajoIzq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAbajoIzqActionPerformed(evt);
            }
        });
        panel.add(botonAbajoIzq);

        botonAbajo.setBackground(new java.awt.Color(102, 102, 102));
        botonAbajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAbajoActionPerformed(evt);
            }
        });
        panel.add(botonAbajo);

        botonAbajoDerecha.setBackground(new java.awt.Color(102, 102, 102));
        botonAbajoDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAbajoDerechaActionPerformed(evt);
            }
        });
        panel.add(botonAbajoDerecha);

        barraMenu.setBackground(new java.awt.Color(235, 235, 235));

        menuJuego.setText("Juego");
        menuJuego.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        comenzarDeNuevo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comenzarDeNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/restart.png"))); // NOI18N
        comenzarDeNuevo.setText("Comenzar de nuevo");
        menuJuego.add(comenzarDeNuevo);

        mostrarResultados.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mostrarResultados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/table.png"))); // NOI18N
        mostrarResultados.setText("Mostrar tabla de resultados");
        menuJuego.add(mostrarResultados);
        menuJuego.add(separador);

        salir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit.png"))); // NOI18N
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        menuJuego.add(salir);

        barraMenu.add(menuJuego);

        munuAyuda.setText("Ayuda");
        munuAyuda.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        barraMenu.add(munuAyuda);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);       
    }//GEN-LAST:event_salirActionPerformed

    private void botonArribaIzqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonArribaIzqActionPerformed
        // se verifica que aun no se ha dado click sobre el boton
        if (casilla[0][0] == true) {
            // se verifica el turno
            if (turno.equals("usuario1")) {
                dibujarX(botonArribaIzq);
                matriz[0][0] = 1;
                turno = "usuario2";
            } else {
                dibujarO(botonArribaIzq);
                matriz[0][0] = 2;
                turno = "usuario1";
            }
            // cambia el valor de la casilla para que no cambie de valor
            casilla[0][0] = false;            
            comprobarGanador();
        }
    }//GEN-LAST:event_botonArribaIzqActionPerformed

    private void botonArribaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonArribaActionPerformed
        // se verifica que aun no se ha dado click sobre el boton
        if (casilla[0][1] == true) {
            // se verifica el turno
            if (turno.equals("usuario1")) {
                dibujarX(botonArriba);
                matriz[0][1] = 1;
                turno = "usuario2";
            } else {
                dibujarO(botonArriba);
                matriz[0][1] = 2;
                turno = "usuario1";
            }
            // cambia el valor de la casilla para que no cambie de valor
            casilla[0][1] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_botonArribaActionPerformed

    private void botonArribaDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonArribaDerechaActionPerformed
        // se verifica que aun no se ha dado click sobre el boton
        if (casilla[0][2] == true) {
            // se verifica el turno
            if (turno.equals("usuario1")) {
                dibujarX(botonArribaDerecha);
                matriz[0][2] = 1;
                turno = "usuario2";
            } else {
                dibujarO(botonArribaDerecha);
                matriz[0][2] = 2;
                turno = "usuario1";
            }
            // cambia el valor de la casilla para que no cambie de valor
            casilla[0][2] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_botonArribaDerechaActionPerformed

    private void botonIzqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIzqActionPerformed
        // se verifica que aun no se ha dado click sobre el boton
        if (casilla[1][0] == true) {
            // se verifica el turno
            if (turno.equals("usuario1")) {
                dibujarX(botonIzq);
                matriz[1][0] = 1;
                turno = "usuario2";
            } else {
                dibujarO(botonIzq);
                matriz[1][0] = 2;
                turno = "usuario1";
            }
            // cambia el valor de la casilla para que no cambie de valor
            casilla[1][0] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_botonIzqActionPerformed

    private void botonCentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCentroActionPerformed
        // se verifica que aun no se ha dado click sobre el boton
        if (casilla[1][1] == true) {
            // se verifica el turno
            if (turno.equals("usuario1")) {
                dibujarX(botonCentro);
                matriz[1][1] = 1;
                turno = "usuario2";
            } else {
                dibujarO(botonCentro);
                matriz[1][1] = 2;
                turno = "usuario1";
            }
            // cambia el valor de la casilla para que no cambie de valor
            casilla[1][1] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_botonCentroActionPerformed

    private void botonDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDerechaActionPerformed
        // se verifica que aun no se ha dado click sobre el boton
        if (casilla[1][2] == true) {
            // se verifica el turno
            if (turno.equals("usuario1")) {
                dibujarX(botonDerecha);
                matriz[1][2] = 1;
                turno = "usuario2";
            } else {
                dibujarO(botonDerecha);
                matriz[1][2] = 2;
                turno = "usuario1";
            }
            // cambia el valor de la casilla para que no cambie de valor
            casilla[1][2] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_botonDerechaActionPerformed

    private void botonAbajoIzqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAbajoIzqActionPerformed
        // se verifica que aun no se ha dado click sobre el boton
        if (casilla[2][0] == true) {
            // se verifica el turno
            if (turno.equals("usuario1")) {
                dibujarX(botonAbajoIzq);
                matriz[2][0] = 1;
                turno = "usuario2";
            } else {
                dibujarO(botonAbajoIzq);
                matriz[2][0] = 2;
                turno = "usuario1";
            }
            // cambia el valor de la casilla para que no cambie de valor
            casilla[2][0] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_botonAbajoIzqActionPerformed

    private void botonAbajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAbajoActionPerformed
        // se verifica que aun no se ha dado click sobre el boton
        if (casilla[2][1] == true) {
            // se verifica el turno
            if (turno.equals("usuario1")) {
                dibujarX(botonAbajo);
                matriz[2][1] = 1;
                turno = "usuario2";
            } else {
                dibujarO(botonAbajo);
                matriz[2][1] = 2;
                turno = "usuario1";
            }
            // cambia el valor de la casilla para que no cambie de valor
            casilla[2][1] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_botonAbajoActionPerformed

    private void botonAbajoDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAbajoDerechaActionPerformed
        // se verifica que aun no se ha dado click sobre el boton
        if (casilla[2][2] == true) {
            // se verifica el turno
            if (turno.equals("usuario1")) {
                dibujarX(botonAbajoDerecha);
                matriz[2][2] = 1;
                turno = "usuario2";
            } else {
                dibujarO(botonAbajoDerecha);
                matriz[2][2] = 2;
                turno = "usuario1";
            }
            // cambia el valor de la casilla para que no cambie de valor
            casilla[2][2] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_botonAbajoDerechaActionPerformed
    
    // metodo sobre matriz[][] para comprobar quien gana
    private void comprobarGanador(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");                
            }
            System.out.println("");            
        }
        System.out.println("");
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JButton botonAbajo;
    private javax.swing.JButton botonAbajoDerecha;
    private javax.swing.JButton botonAbajoIzq;
    private javax.swing.JButton botonArriba;
    private javax.swing.JButton botonArribaDerecha;
    private javax.swing.JButton botonArribaIzq;
    private javax.swing.JButton botonCentro;
    private javax.swing.JButton botonDerecha;
    private javax.swing.JButton botonIzq;
    private javax.swing.JMenuItem comenzarDeNuevo;
    private javax.swing.JMenu menuJuego;
    private javax.swing.JMenuItem mostrarResultados;
    private javax.swing.JMenu munuAyuda;
    private javax.swing.JPanel panel;
    private javax.swing.JMenuItem salir;
    private javax.swing.JPopupMenu.Separator separador;
    // End of variables declaration//GEN-END:variables
}
