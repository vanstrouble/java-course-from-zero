package tabla;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author pedrovazquezg
 */
public class Tabla extends javax.swing.JFrame {

    /**
     * Creates new form Tabla
     */
    public Tabla() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProducto = new javax.swing.JTable();
        botonCargar = new javax.swing.JButton();
        boxBuscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        boxCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        boxNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        boxPrecio = new javax.swing.JTextField();
        boxCantidad = new javax.swing.JTextField();
        botonInsertar = new javax.swing.JButton();
        botonModificar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        tablaProducto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tablaProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Nombre", "Precio", "Cantidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProductoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaProducto);

        botonCargar.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        botonCargar.setText("Cargar tabla");
        botonCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel1.setText("Código:");

        boxCodigo.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel2.setText("Código:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel3.setText("Nombre:");

        boxNombre.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel4.setText("Precio:");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel5.setText("Cantidad:");

        boxPrecio.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N

        boxCantidad.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N

        botonInsertar.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        botonInsertar.setText("Insertar");
        botonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInsertarActionPerformed(evt);
            }
        });

        botonModificar.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        botonModificar.setText("Modificar");
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });

        botonEliminar.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        botonEliminar.setText("Eliminar");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(boxBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonCargar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(boxPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boxNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boxCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(boxCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(60, 60, 60))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botonInsertar)
                        .addGap(18, 18, 18)
                        .addComponent(botonModificar)
                        .addGap(18, 18, 18)
                        .addComponent(botonEliminar)
                        .addGap(26, 26, 26))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonCargar)
                            .addComponent(boxBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boxCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(boxNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(boxPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(boxCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonInsertar)
                            .addComponent(botonModificar)
                            .addComponent(botonEliminar))))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarActionPerformed
        DefaultTableModel modeloTabla = new DefaultTableModel();
        tablaProducto.setModel(modeloTabla);

        String campo = boxBuscar.getText();
        String where = "";

        if (!"".equals(campo)) {
            where = "where codigo = '" + campo + "'";
        }

        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            Conexion con = new Conexion();
            Connection conexion = con.getConnection();

            ps = conexion.prepareStatement("select codigo, nombre, precio, cantidad from producto " + where);
            rs = ps.executeQuery();

            modeloTabla.addColumn("Código");
            modeloTabla.addColumn("Nombre");
            modeloTabla.addColumn("Precio");
            modeloTabla.addColumn("Cantidad");

            ResultSetMetaData rsMD = rs.getMetaData();
            int cantidadColumnas = rsMD.getColumnCount();

            // Establecer ancho de las columnas de la tabla
            int anchos[] = {50, 150, 50, 70};
            for (int i = 0; i < cantidadColumnas; i++) {
                tablaProducto.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }

            while (rs.next()) {
                Object fila[] = new Object[cantidadColumnas];

                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                modeloTabla.addRow(fila);
            }
        } catch (Exception e) {
            System.err.println("Error. " + e);
        }
    }//GEN-LAST:event_botonCargarActionPerformed

    private void tablaProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProductoMouseClicked
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            Conexion con = new Conexion();
            Connection conexion = con.getConnection();
            
            int fila = tablaProducto.getSelectedRow(); // Vemos qué renglón seleccionamos
            String codigo = tablaProducto.getValueAt(fila, 0).toString(); // Obtenemos el código del producto
            
            ps = conexion.prepareStatement("select codigo, nombre, precio, cantidad from producto where codigo = ?");
            ps.setString(1, codigo);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                boxCodigo.setText(rs.getString("codigo"));
                boxNombre.setText(rs.getString("nombre"));
                boxPrecio.setText(String.valueOf(rs.getDouble("precio")));
                boxCantidad.setText(String.valueOf(rs.getInt("cantidad")));
            }
        } catch (Exception e) {
            System.err.println("Error. " + e);
        }
    }//GEN-LAST:event_tablaProductoMouseClicked

    private void botonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInsertarActionPerformed
        PreparedStatement ps = null;
        
        try {
            Conexion con = new Conexion();
            Connection conexion = con.getConnection();
            
            ps = conexion.prepareStatement("insert into producto (codigo, nombre, precio, cantidad) values (?,?,?,?)");
            ps.setString(1, boxCodigo.getText());
            ps.setString(2, boxNombre.getText());
            ps.setDouble(3, Double.parseDouble(boxPrecio.getText()));
            ps.setInt(4, Integer.parseInt(boxCantidad.getText()));
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro insertado correctamente");
        } catch (Exception e) {
            System.err.println("Error. " + e);
        }
    }//GEN-LAST:event_botonInsertarActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        PreparedStatement ps = null;
        
        try {
            Conexion con = new Conexion();
            Connection conexion = con.getConnection();
            
            ps = conexion.prepareStatement("update producto set codigo = ?, nombre = ?, precio = ?, cantidad = ? where codigo = ?");
            ps.setString(1, boxCodigo.getText());
            ps.setString(2, boxNombre.getText());
            ps.setDouble(3, Double.parseDouble(boxPrecio.getText()));
            ps.setInt(4, Integer.parseInt(boxCantidad.getText()));
            ps.setString(5, boxCodigo.getText());
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro modificado correctamente");
        } catch (Exception e) {
            System.err.println("Error. " + e);
        }
    }//GEN-LAST:event_botonModificarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        PreparedStatement ps = null;
        
        try {
            Conexion con = new Conexion();
            Connection conexion = con.getConnection();
            
            ps = conexion.prepareStatement("delete from producto where codigo = ?");
            ps.setString(1, boxCodigo.getText());
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro eliminado correctamente");
        } catch (Exception e) {
            System.err.println("Error. " + e);
        }
    }//GEN-LAST:event_botonEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tabla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCargar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonInsertar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JTextField boxBuscar;
    private javax.swing.JTextField boxCantidad;
    private javax.swing.JTextField boxCodigo;
    private javax.swing.JTextField boxNombre;
    private javax.swing.JTextField boxPrecio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaProducto;
    // End of variables declaration//GEN-END:variables
}
