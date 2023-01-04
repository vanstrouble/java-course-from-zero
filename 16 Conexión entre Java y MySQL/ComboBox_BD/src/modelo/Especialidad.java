package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

/**
 *
 * @author pedrovazquezg
 */
public class Especialidad {

    private Integer idEspecialidad;
    private String nombreEspecialidad;

    public Integer getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(Integer idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }

    public String getNombreEspecialidad() {
        return nombreEspecialidad;
    }

    public void setNombreEspecialidad(String nombreEspecialidad) {
        this.nombreEspecialidad = nombreEspecialidad;
    }

    @Override
    public String toString() {
        return this.nombreEspecialidad;
    }

    public Vector<Especialidad> mostrarEspecialidades() {
        PreparedStatement ps = null;
        ResultSet rs = null;

        Vector<Especialidad> vectorEspecialidades = new Vector<Especialidad>();
        Especialidad especialidad = null;

        try {
            Conexion con = new Conexion();
            Connection conexion = con.getConnection();

            ps = conexion.prepareStatement("select * from especialidades");
            rs = ps.executeQuery();

            especialidad = new Especialidad();
            especialidad.setIdEspecialidad(0);
            especialidad.setNombreEspecialidad("Seleccione especialidad");
            vectorEspecialidades.add(especialidad);

            while (rs.next()) {
                especialidad = new Especialidad();
                especialidad.setIdEspecialidad(rs.getInt("idEspecialidad"));
                especialidad.setNombreEspecialidad(rs.getString("nombreEspecialidad"));
                vectorEspecialidades.add(especialidad);
            }

            rs.close();
        } catch (Exception e) {
            System.err.println("Error. " + e);
        }
        return vectorEspecialidades;
    }
}
