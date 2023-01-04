package programa;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import modelo.Conexion;

/**
 *
 * @author pedrovazquezg
 */
public class Ventana extends javax.swing.JFrame {

    public Ventana() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelImagen = new javax.swing.JPanel();
        botonCargar = new javax.swing.JButton();
        botonMostrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout panelImagenLayout = new javax.swing.GroupLayout(panelImagen);
        panelImagen.setLayout(panelImagenLayout);
        panelImagenLayout.setHorizontalGroup(
            panelImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );
        panelImagenLayout.setVerticalGroup(
            panelImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 404, Short.MAX_VALUE)
        );

        botonCargar.setText("Cargar Imagen");
        botonCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarActionPerformed(evt);
            }
        });

        botonMostrar.setText("Mostrar Imágenes");
        botonMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonCargar)
                        .addGap(39, 39, 39)
                        .addComponent(botonMostrar)))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(panelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCargar)
                    .addComponent(botonMostrar))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarActionPerformed
        JFileChooser escoger = new JFileChooser();
        escoger.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES); // Establecemos el modelos para escoger una imagen
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Imágenes", "jpg", "png");
        escoger.setFileFilter(filtro);

        int seleccion = escoger.showOpenDialog(this); // Darnos cuenta cuál fue la opción escogida

        PreparedStatement ps = null;
        Conexion con = new Conexion();

        if (seleccion == JFileChooser.APPROVE_OPTION) { // Si el usuario escogió "Aceptar"
            File archivo = escoger.getSelectedFile(); // Obtenemos el archivo seleccionado
            // String ruta = archivo.getAbsolutePath(); // Obtenemos ruta absoluta del archivo

            try {
                FileInputStream archivoEntrada = new FileInputStream(archivo);
                Connection conexion = con.getConnection();

                ps = conexion.prepareStatement("insert into imagen (img) values (?)");
                ps.setBinaryStream(1, archivoEntrada, (int) archivo.length());
                ps.executeUpdate();

                JOptionPane.showMessageDialog(null, "Imagen guardada correctamente");
            } catch (Exception e) {
                System.err.println("Error. " + e);
            }
        }
    }//GEN-LAST:event_botonCargarActionPerformed

    private void botonMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMostrarActionPerformed
        int idImagen = Integer.parseInt(JOptionPane.showInputDialog("Digite el ID de la imagen a mostrar"));

        PreparedStatement ps = null;
        ResultSet rs = null;
        Conexion con = new Conexion();

        try {
            Connection conexion = con.getConnection();
            ps = conexion.prepareStatement("select img from imagen where idImagen = ?");
            ps.setInt(1, idImagen);
            rs = ps.executeQuery();

            BufferedImage buffimg = null;

            while (rs.next()) {
                InputStream img = rs.getBinaryStream(1);
                buffimg = ImageIO.read(img);

                int ancho = panelImagen.getWidth();
                int alto = panelImagen.getHeight();

                Imagen imagen = new Imagen(ancho, alto, buffimg);
                panelImagen.add(imagen);
                panelImagen.repaint();
            }
            rs.close();
        } catch (Exception e) {
            System.err.println("Error. " + e);
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
    private javax.swing.JButton botonCargar;
    private javax.swing.JButton botonMostrar;
    private javax.swing.JPanel panelImagen;
    // End of variables declaration//GEN-END:variables
}
