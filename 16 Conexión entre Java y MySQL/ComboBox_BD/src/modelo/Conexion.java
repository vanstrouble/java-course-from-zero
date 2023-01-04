/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
// import javax.swing.JOptionPane;

/**
 *
 * @author pedrovazquezg
 */
public class Conexion {

    public static final String URL = "jdbc:mysql://localhost:3306/hospital?autoReconnet=true&useSSL=false";
    public static final String usuario = "root";
    public static final String contrasena = "Frikis.Life09";

    public Connection getConnection() {
        Connection conexion = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = (Connection) DriverManager.getConnection(URL, usuario, contrasena);
            // JOptionPane.showMessageDialog(null, "Conexión éxitosa");
        } catch (Exception e) {
            System.err.println("Error. " + e);
        }
        return conexion;
    }
}
