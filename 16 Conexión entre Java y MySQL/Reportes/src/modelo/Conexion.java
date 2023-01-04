
package modelo;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {
    public static final String URL = "jdbc:mysql://localhost:3306/datosPaises?autoReconnet=true&useSSL=false";
    public static final String usuario = "root";
    public static final String contraseña = "1234";
    
    public Connection getConnection(){
        Connection conexion=null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conexion = (Connection) DriverManager.getConnection(URL,usuario,contraseña);
            
        }catch(Exception ex){
            System.err.println("Error, "+ex);
        }
        
        return conexion;
    }
    
}
