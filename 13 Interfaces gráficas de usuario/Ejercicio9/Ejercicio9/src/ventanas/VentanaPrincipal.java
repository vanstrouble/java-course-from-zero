/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.awt.Desktop;
import java.awt.Toolkit;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author pedrovazquezg
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    private Boolean casilla[][] = new Boolean[3][3];
    private String turno = "usuario1";
    private Integer matriz[][] = new Integer[3][3];
    private String usuario1;
    private String usuario2;
    private Integer vecesGuser1 = 0, vecesGuser2 = 0, vecesEmpate = 0;
    
    public VentanaPrincipal(String usuario1, String usuario2) {
        this.usuario1 = usuario1;
        this.usuario2 = usuario2;
        
        initComponents();
        setSize(600, 600);
        setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/icono.png")));
        llenarCasillas();
        llenarMatriz();
    }

    private void llenarCasillas() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                casilla[i][j] = true;
            }
        }
    }
    
    private void llenarMatriz() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = 0;
            }
        }
    }
    
    private void dibujarX(JButton boton) {
        boton.setIcon(new ImageIcon(getClass().getResource("/imagenes/x.png")));
    }
    
    private void dibujarO(JButton boton) {
        boton.setIcon(new ImageIcon(getClass().getResource("/imagenes/o.png")));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        boton00 = new javax.swing.JButton();
        boton01 = new javax.swing.JButton();
        boton02 = new javax.swing.JButton();
        boton10 = new javax.swing.JButton();
        boton11 = new javax.swing.JButton();
        boton12 = new javax.swing.JButton();
        boton20 = new javax.swing.JButton();
        boton21 = new javax.swing.JButton();
        boton22 = new javax.swing.JButton();
        barraMenu = new javax.swing.JMenuBar();
        menuJuego = new javax.swing.JMenu();
        comenzarNuevo = new javax.swing.JMenuItem();
        mostrarResultados = new javax.swing.JMenuItem();
        separador = new javax.swing.JPopupMenu.Separator();
        salir = new javax.swing.JMenuItem();
        menuAyuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gati Aideé");

        panel.setLayout(new java.awt.GridLayout(3, 3));

        boton00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton00ActionPerformed(evt);
            }
        });
        panel.add(boton00);

        boton01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton01ActionPerformed(evt);
            }
        });
        panel.add(boton01);

        boton02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton02ActionPerformed(evt);
            }
        });
        panel.add(boton02);

        boton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton10ActionPerformed(evt);
            }
        });
        panel.add(boton10);

        boton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton11ActionPerformed(evt);
            }
        });
        panel.add(boton11);

        boton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton12ActionPerformed(evt);
            }
        });
        panel.add(boton12);

        boton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton20ActionPerformed(evt);
            }
        });
        panel.add(boton20);

        boton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton21ActionPerformed(evt);
            }
        });
        panel.add(boton21);

        boton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton22ActionPerformed(evt);
            }
        });
        panel.add(boton22);

        menuJuego.setText("Juego");
        menuJuego.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        comenzarNuevo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comenzarNuevo.setText("Comenzar de nuevo");
        comenzarNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comenzarNuevoActionPerformed(evt);
            }
        });
        menuJuego.add(comenzarNuevo);

        mostrarResultados.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mostrarResultados.setText("Mostrar tabla de resultados");
        mostrarResultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarResultadosActionPerformed(evt);
            }
        });
        menuJuego.add(mostrarResultados);
        menuJuego.add(separador);

        salir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        menuJuego.add(salir);

        barraMenu.add(menuJuego);

        menuAyuda.setText("Ayuda");
        menuAyuda.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        menuAyuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuAyudaMouseClicked(evt);
            }
        });
        barraMenu.add(menuAyuda);

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

    private void boton00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton00ActionPerformed
        if (casilla[0][0] == true) { // Verificando que aún se haya dado clic sobre el botón
            if (turno.equals("usuario1")) { // Verificando el turno
                dibujarX(boton00);
                matriz[0][0] = 1;
                turno = "usuario2";
            } else { // Turno del usuario2
                dibujarO(boton00);
                matriz[0][0] = 2;
                turno = "usuario1";
            }
            casilla[0][0] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_boton00ActionPerformed

    private void boton01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton01ActionPerformed
        if (casilla[0][1] == true) { // Verificando que aún se haya dado clic sobre el botón
            if (turno.equals("usuario1")) { // Verificando el turno
                dibujarX(boton01);
                matriz[0][1] = 1;
                turno = "usuario2";
            } else { // Turno del usuario2
                dibujarO(boton01);
                matriz[0][1] = 2;
                turno = "usuario1";
            }
            casilla[0][1] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_boton01ActionPerformed

    private void boton02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton02ActionPerformed
        if (casilla[0][2] == true) { // Verificando que aún se haya dado clic sobre el botón
            if (turno.equals("usuario1")) { // Verificando el turno
                dibujarX(boton02);
                matriz[0][2] = 1;
                turno = "usuario2";
            } else { // Turno del usuario2
                dibujarO(boton02);
                matriz[0][2] = 2;
                turno = "usuario1";
            }
            casilla[0][2] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_boton02ActionPerformed

    private void boton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton10ActionPerformed
        if (casilla[1][0] == true) { // Verificando que aún se haya dado clic sobre el botón
            if (turno.equals("usuario1")) { // Verificando el turno
                dibujarX(boton10);
                matriz[1][0] = 1;
                turno = "usuario2";
            } else { // Turno del usuario2
                dibujarO(boton10);
                matriz[1][0] = 2;
                turno = "usuario1";
            }
            casilla[1][0] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_boton10ActionPerformed

    private void boton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton11ActionPerformed
        if (casilla[1][1] == true) { // Verificando que aún se haya dado clic sobre el botón
            if (turno.equals("usuario1")) { // Verificando el turno
                dibujarX(boton11);
                matriz[1][1] = 1;
                turno = "usuario2";
            } else { // Turno del usuario2
                dibujarO(boton11);
                matriz[1][1] = 2;
                turno = "usuario1";
            }
            casilla[1][1] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_boton11ActionPerformed

    private void boton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton12ActionPerformed
        if (casilla[1][2] == true) { // Verificando que aún se haya dado clic sobre el botón
            if (turno.equals("usuario1")) { // Verificando el turno
                dibujarX(boton12);
                matriz[1][2] = 1;
                turno = "usuario2";
            } else { // Turno del usuario2
                dibujarO(boton12);
                matriz[1][2] = 2;
                turno = "usuario1";
            }
            casilla[1][2] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_boton12ActionPerformed

    private void boton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton20ActionPerformed
        if (casilla[2][0] == true) { // Verificando que aún se haya dado clic sobre el botón
            if (turno.equals("usuario1")) { // Verificando el turno
                dibujarX(boton20);
                matriz[2][0] = 1;
                turno = "usuario2";
            } else { // Turno del usuario2
                dibujarO(boton20);
                matriz[2][0] = 2;
                turno = "usuario1";
            }
            casilla[2][0] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_boton20ActionPerformed

    private void boton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton21ActionPerformed
        if (casilla[2][1] == true) { // Verificando que aún se haya dado clic sobre el botón
            if (turno.equals("usuario1")) { // Verificando el turno
                dibujarX(boton21);
                matriz[2][1] = 1;
                turno = "usuario2";
            } else { // Turno del usuario2
                dibujarO(boton21);
                matriz[2][1] = 2;
                turno = "usuario1";
            }
            casilla[2][1] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_boton21ActionPerformed

    private void boton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton22ActionPerformed
        if (casilla[2][2] == true) { // Verificando que aún se haya dado clic sobre el botón
            if (turno.equals("usuario1")) { // Verificando el turno
                dibujarX(boton22);
                matriz[2][2] = 1;
                turno = "usuario2";
            } else { // Turno del usuario2
                dibujarO(boton22);
                matriz[2][2] = 2;
                turno = "usuario1";
            }
            casilla[2][2] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_boton22ActionPerformed

    private void mostrarResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarResultadosActionPerformed
        VentanaResultados ventanaResultados = new VentanaResultados(this, true, usuario1, usuario2, vecesGuser1, vecesGuser2, vecesEmpate);
        ventanaResultados.setVisible(true);
    }//GEN-LAST:event_mostrarResultadosActionPerformed

    private void comenzarNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comenzarNuevoActionPerformed
        vecesGuser1 = 0; vecesGuser2 = 0; vecesEmpate = 0;
        reiniciarJuego();
    }//GEN-LAST:event_comenzarNuevoActionPerformed

    private void menuAyudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAyudaMouseClicked
        try {
            try {
                Desktop.getDesktop().browse(new URI("https://ocio.uncomo.com/articulo/como-jugar-al-tres-en-raya-2442.html"));
            } catch (IOException ex) {
                // Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (URISyntaxException ex) {
            //Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menuAyudaMouseClicked

    private void comprobarGanador() {
        boolean ganador1 = false, ganador2 = false;
        int casillasEmpate = 0;
        
        // Comprobamos si el ganador es el usuario 1
        ganador1 = comprobar(1);
        // Comprobamos si el ganador es el usuario 1
        ganador2 = comprobar(2);
        
        if (ganador1 == true) {
            vecesGuser1++;
            VentanaGanador ventanaG = new VentanaGanador(this, true, usuario1);
            ventanaG.setVisible(true);
            reiniciarJuego();
            
        } else if (ganador2 == true) {
            vecesGuser2++;
            VentanaGanador ventanaG = new VentanaGanador(this, true, usuario2);
            ventanaG.setVisible(true);
            reiniciarJuego();
        } else { // Tal vez el tablero esté lleno
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (matriz[i][j] != 0) { // Puede haber un número 1 o un número 2
                        casillasEmpate++;
                    }
                }
            }
            if (casillasEmpate == 9) {
                vecesEmpate++;
                VentanaEmpate ventanaE = new VentanaEmpate(this, true);
                ventanaE.setVisible(true);
                reiniciarJuego();
            } else {
                casillasEmpate = 0;
            }
        }
    }
    
    private boolean comprobar(Integer numero) {
        boolean ganador = false;
        
        if (matriz[0][0] == numero && matriz[0][1] == numero && matriz[0][2] == numero) {
            ganador = true;
        } else if (matriz[1][0] == numero && matriz[1][1] == numero && matriz[1][2] == numero) {
            ganador = true;
        } else if (matriz[2][0] == numero && matriz[2][1] == numero && matriz[2][2] == numero) {
            ganador = true;
        } else if (matriz[0][0] == numero && matriz[1][0] == numero && matriz[2][0] == numero) {
            ganador = true;
        } else if (matriz[0][1] == numero && matriz[1][1] == numero && matriz[2][1] == numero) {
            ganador = true;
        } else if (matriz[0][2] == numero && matriz[1][2] == numero && matriz[2][2] == numero) {
            ganador = true;
        } else if (matriz[0][0] == numero && matriz[1][1] == numero && matriz[2][2] == numero) {
            ganador = true;
        } else if (matriz[0][2] == numero && matriz[1][1] == numero && matriz[2][0] == numero) {
            ganador = true;
        }
        return ganador;
    }
    
    private void reiniciarJuego() {
        llenarCasillas();
        llenarMatriz();
        boton00.setIcon(null);
        boton01.setIcon(null);
        boton02.setIcon(null);
        boton10.setIcon(null);
        boton11.setIcon(null);
        boton12.setIcon(null);
        boton20.setIcon(null);
        boton21.setIcon(null);
        boton22.setIcon(null);
        
        quienJuegaPrimero(); // Preguntar por quién juega primero
    }
    
    public void quienJuegaPrimero() {
        VentanaTurno ventanaTurno = new VentanaTurno(this, true, usuario1, usuario2);
        ventanaTurno.setVisible(true);
        turno = ventanaTurno.getTurno();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal(null, null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JButton boton00;
    private javax.swing.JButton boton01;
    private javax.swing.JButton boton02;
    private javax.swing.JButton boton10;
    private javax.swing.JButton boton11;
    private javax.swing.JButton boton12;
    private javax.swing.JButton boton20;
    private javax.swing.JButton boton21;
    private javax.swing.JButton boton22;
    private javax.swing.JMenuItem comenzarNuevo;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenu menuJuego;
    private javax.swing.JMenuItem mostrarResultados;
    private javax.swing.JPanel panel;
    private javax.swing.JMenuItem salir;
    private javax.swing.JPopupMenu.Separator separador;
    // End of variables declaration//GEN-END:variables
}
