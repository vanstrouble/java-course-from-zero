/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import modelo.Conexion;

/**
 *
 * @author pedrovazquezg
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
        grupoBotones.add(radioHombre);
        grupoBotones.add(radioMujer);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBotones = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        spinnerEdad = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        checkFut = new javax.swing.JCheckBox();
        checkBasq = new javax.swing.JCheckBox();
        checkTen = new javax.swing.JCheckBox();
        checkNat = new javax.swing.JCheckBox();
        checkVol = new javax.swing.JCheckBox();
        radioHombre = new javax.swing.JRadioButton();
        radioMujer = new javax.swing.JRadioButton();
        botonRegistrar = new javax.swing.JButton();
        botonMostrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fromulario");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Formulario");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel2.setText("Seleccione Género:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel3.setText("¿Cuál es su edad?");

        spinnerEdad.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel4.setText("Seleccione sus deportes favoritos: ");

        checkFut.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        checkFut.setText("Fútbol");

        checkBasq.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        checkBasq.setText("Basquet");

        checkTen.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        checkTen.setText("Tennis");

        checkNat.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        checkNat.setText("Natación");

        checkVol.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        checkVol.setText("Voleibol");

        radioHombre.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        radioHombre.setText("Hombre");

        radioMujer.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        radioMujer.setText("Mujer");

        botonRegistrar.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        botonRegistrar.setText("Registrar");
        botonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarActionPerformed(evt);
            }
        });

        botonMostrar.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        botonMostrar.setText("Mostrar Registros");
        botonMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioMujer)
                            .addComponent(radioHombre)
                            .addComponent(checkNat)
                            .addComponent(checkTen)
                            .addComponent(checkFut)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(checkBasq)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(spinnerEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(checkVol))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonRegistrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(botonMostrar)
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(63, 63, 63)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioHombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioMujer)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(spinnerEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkFut)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkBasq)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkTen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkNat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkVol)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonRegistrar)
                    .addComponent(botonMostrar))
                .addGap(26, 26, 26))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarActionPerformed
        Conexion con = new Conexion();
        PreparedStatement ps = null;
        String genero = "";
        int edad;
        boolean futbol = false, basquet = false, tennis = false, natacion = false, voleibol = false;
        
        // Radio botones - JRadioButton
        if (radioHombre.isSelected() == true) {
            genero = "Hombre";
        } else if (radioMujer.isSelected() == true) {
            genero = "Mujer";
        }
        
        // Número de edad - Spinner
        edad = (int) spinnerEdad.getValue();
        
        // Casillas de verificación - JCheckBox
        if (checkFut.isSelected() == true) {
            futbol = true;
        }
        if (checkBasq.isSelected() == true) {
            basquet = true;
        }
        if (checkTen.isSelected() == true) {
            tennis = true;
        }
        if (checkNat.isSelected() == true) {
            natacion = true;
        }
        if (checkVol.isSelected() == true) {
            voleibol = true;
        }
        
        try {
            Connection conexion = con.getConnection();
            
            ps = conexion.prepareStatement("insert into gustospersona (genero, edad, futbol, basquet, tennis, natacion, voleibol) values (?,?,?,?,?,?,?)");
            ps.setString(1, genero);
            ps.setInt(2, edad);
            ps.setBoolean(3, futbol);
            ps.setBoolean(4, basquet);
            ps.setBoolean(5, tennis);
            ps.setBoolean(6, natacion);
            ps.setBoolean(7, voleibol);
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Registro insertado correctamente");
            conexion.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_botonRegistrarActionPerformed

    private void botonMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMostrarActionPerformed
        Conexion con = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        int idPersona = Integer.parseInt(JOptionPane.showInputDialog("Digite el ID de la persona: "));
        
        try {
            Connection conexion = con.getConnection();
            
            ps= conexion.prepareStatement("select genero, edad, futbol, basquet, tennis, natacion, voleibol from gustospersona where id = ?");
            ps.setInt(1, idPersona);
            rs = ps.executeQuery();
            
            while (rs.next()) {                
                // Radiobotones
                if (rs.getString("genero").equals("Hombre")) {
                    radioHombre.setSelected(true);
                } else if (rs.getString("genero").equals("Mujer")) {
                    radioMujer.setSelected(true);
                }
                
                // Número de edad
                spinnerEdad.setValue(rs.getInt("edad"));
                
                // Casillas de verificación
                if (rs.getBoolean("futbol") == true) {
                    checkFut.setSelected(true);
                }
                if (rs.getBoolean("basquet") == true) {
                    checkBasq.setSelected(true);
                }
                if (rs.getBoolean("tennis") == true) {
                    checkTen.setSelected(true);
                }
                if (rs.getBoolean("natacion") == true) {
                    checkNat.setSelected(true);
                }
                if (rs.getBoolean("voleibol") == true) {
                    checkVol.setSelected(true);
                }
            }
            
            conexion.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_botonMostrarActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonMostrar;
    private javax.swing.JButton botonRegistrar;
    private javax.swing.JCheckBox checkBasq;
    private javax.swing.JCheckBox checkFut;
    private javax.swing.JCheckBox checkNat;
    private javax.swing.JCheckBox checkTen;
    private javax.swing.JCheckBox checkVol;
    private javax.swing.ButtonGroup grupoBotones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton radioHombre;
    private javax.swing.JRadioButton radioMujer;
    private javax.swing.JSpinner spinnerEdad;
    // End of variables declaration//GEN-END:variables
}
