/*
 */
package vista;

import modelo.Usuario;

/**
 *
 * @author pedrovazquezg
 */
public class Programa extends javax.swing.JFrame {
    Usuario usuario;
    /**
     * Creates new form Programa
     */
    public Programa() {
        initComponents();
    }

    public Programa(Usuario usuario) {
        initComponents();
        setLocationRelativeTo(null);
        this.usuario = usuario;
        
        etiquetaNombre.setText(usuario.getNombre());
        etiquetaRol.setText(usuario.getNombreRol());
        
        if (usuario.getIdTipo_usuario() == 1) {
            
        } else if (usuario.getIdTipo_usuario() == 2) {
            menuProveedores.setVisible(false);
            subAddProducto.setVisible(false);
            etiquetaAidee.setVisible(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiquetaBienvenida = new javax.swing.JLabel();
        etiquetaAidee = new javax.swing.JLabel();
        etiquetaNombre = new javax.swing.JLabel();
        etiquetaRol = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuProducto = new javax.swing.JMenu();
        subAddProducto = new javax.swing.JMenuItem();
        subModProducto = new javax.swing.JMenuItem();
        subCatalogo = new javax.swing.JMenuItem();
        menuProveedores = new javax.swing.JMenu();
        subAddProveedores = new javax.swing.JMenuItem();
        subCatProveedores = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        etiquetaBienvenida.setFont(new java.awt.Font(".AppleSystemUIFontMonospaced", 0, 24)); // NOI18N
        etiquetaBienvenida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaBienvenida.setText("Programa en construcción…");

        etiquetaAidee.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        etiquetaAidee.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaAidee.setText("Sólo quiero decir mientras tanto, que Aideé es la niña más hermosa del mundo. Bye.");

        etiquetaNombre.setBackground(new java.awt.Color(0, 0, 0));
        etiquetaNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        etiquetaRol.setBackground(new java.awt.Color(0, 0, 0));
        etiquetaRol.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        menuProducto.setText("Producto");
        menuProducto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        subAddProducto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        subAddProducto.setText("Agregar Producto");
        menuProducto.add(subAddProducto);

        subModProducto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        subModProducto.setText("Modificar Producto");
        menuProducto.add(subModProducto);

        subCatalogo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        subCatalogo.setText("Catálogo de Productos");
        menuProducto.add(subCatalogo);

        jMenuBar1.add(menuProducto);

        menuProveedores.setText("Proveedores");
        menuProveedores.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        subAddProveedores.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        subAddProveedores.setText("Agregar Proveedor");
        subAddProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subAddProveedoresActionPerformed(evt);
            }
        });
        menuProveedores.add(subAddProveedores);

        subCatProveedores.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        subCatProveedores.setText("Catálogo de Proveedores");
        menuProveedores.add(subCatProveedores);

        jMenuBar1.add(menuProveedores);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etiquetaBienvenida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(etiquetaAidee, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(etiquetaNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
                    .addComponent(etiquetaRol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(etiquetaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(etiquetaRol, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(etiquetaBienvenida)
                .addGap(45, 45, 45)
                .addComponent(etiquetaAidee)
                .addContainerGap(143, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void subAddProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subAddProveedoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subAddProveedoresActionPerformed

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
            java.util.logging.Logger.getLogger(Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Programa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etiquetaAidee;
    private javax.swing.JLabel etiquetaBienvenida;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JLabel etiquetaRol;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuProducto;
    private javax.swing.JMenu menuProveedores;
    private javax.swing.JMenuItem subAddProducto;
    private javax.swing.JMenuItem subAddProveedores;
    private javax.swing.JMenuItem subCatProveedores;
    private javax.swing.JMenuItem subCatalogo;
    private javax.swing.JMenuItem subModProducto;
    // End of variables declaration//GEN-END:variables
}
