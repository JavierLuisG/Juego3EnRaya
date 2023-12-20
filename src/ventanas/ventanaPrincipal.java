/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class ventanaPrincipal extends javax.swing.JFrame {

    public ventanaPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        setSize(600, 600);
        
        dibujarX(botonCentro);
        dibujarO(botonArribaDerecha);
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
        panel.add(botonArribaIzq);

        botonArriba.setBackground(new java.awt.Color(102, 102, 102));
        panel.add(botonArriba);

        botonArribaDerecha.setBackground(new java.awt.Color(102, 102, 102));
        panel.add(botonArribaDerecha);

        botonIzq.setBackground(new java.awt.Color(102, 102, 102));
        panel.add(botonIzq);

        botonCentro.setBackground(new java.awt.Color(102, 102, 102));
        panel.add(botonCentro);

        botonDerecha.setBackground(new java.awt.Color(102, 102, 102));
        panel.add(botonDerecha);

        botonAbajoIzq.setBackground(new java.awt.Color(102, 102, 102));
        panel.add(botonAbajoIzq);

        botonAbajo.setBackground(new java.awt.Color(102, 102, 102));
        panel.add(botonAbajo);

        botonAbajoDerecha.setBackground(new java.awt.Color(102, 102, 102));
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
