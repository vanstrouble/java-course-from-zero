/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;

import javax.swing.ImageIcon;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author pedrovazquezg
 */
public class Ventana extends javax.swing.JFrame {
    DefaultMutableTreeNode raiz = new DefaultMutableTreeNode("Raíz");
    DefaultTreeModel modeloTree = new DefaultTreeModel(raiz);
    /**
     * Creates new form Ventana
     */
    public Ventana() {
        cargarDatosModeloJTree();
        initComponents();
    }

    private void cargarDatosModeloJTree() {
        DefaultMutableTreeNode colores = new DefaultMutableTreeNode("Colores");
        DefaultMutableTreeNode colorRojo = new DefaultMutableTreeNode("Rojo");
        DefaultMutableTreeNode colorAzul = new DefaultMutableTreeNode("Azul");
        colores.add(colorRojo);
        colores.add(colorAzul);
        
        DefaultMutableTreeNode deportes = new DefaultMutableTreeNode("Deportes");
        DefaultMutableTreeNode futbol = new DefaultMutableTreeNode("Fútbol");
        DefaultMutableTreeNode futSala = new DefaultMutableTreeNode("Fútbol Sala");
        DefaultMutableTreeNode futCompleto = new DefaultMutableTreeNode("Fútbol Completo");
        futbol.add(futSala);
        futbol.add(futCompleto);
        
        DefaultMutableTreeNode baloncesto = new DefaultMutableTreeNode("Baloncesto");
        deportes.add(futbol);
        deportes.add(baloncesto);
        
        raiz.add(colores);
        raiz.add(deportes);
    }
    
    private void eventosNodoSeleccionado(DefaultMutableTreeNode nodoSeleccionado) {
        switch (nodoSeleccionado.toString()) {
            case "Rojo":
                etiquetaImagen.setIcon(new ImageIcon(getClass().getResource("/imagenes/rojo.jpg")));
                break;
            case "Azul":
                etiquetaImagen.setIcon(new ImageIcon(getClass().getResource("/imagenes/azul.jpg")));
                break;
            case "Fútbol Sala":
                etiquetaImagen.setIcon(new ImageIcon(getClass().getResource("/imagenes/futSala.jpg")));
                break;
            case "Fútbol Completo":
                etiquetaImagen.setIcon(new ImageIcon(getClass().getResource("/imagenes/futCompleto.jpg")));
                break;
            case "Baloncesto":
                etiquetaImagen.setIcon(new ImageIcon(getClass().getResource("/imagenes/baloncesto.jpg")));
                break;
            default:
                break;
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        arbol = new javax.swing.JTree();
        etiquetaImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        arbol.setModel(modeloTree);
        TreeSelectionListener oyenteTree = new TreeSelectionListener() {
            @Override
            public void valueChanged(TreeSelectionEvent e) {
                DefaultMutableTreeNode nodoSeleccionado = (DefaultMutableTreeNode) arbol.getLastSelectedPathComponent();
                eventosNodoSeleccionado(nodoSeleccionado);
            }
        };

        arbol.getSelectionModel().addTreeSelectionListener(oyenteTree);
        jScrollPane1.setViewportView(arbol);

        etiquetaImagen.setSize(new java.awt.Dimension(250, 250));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(etiquetaImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(etiquetaImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JTree arbol;
    private javax.swing.JLabel etiquetaImagen;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
