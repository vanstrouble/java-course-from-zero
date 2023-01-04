package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import javax.swing.JOptionPane;
import modelo.ConsultasPersona;
import modelo.Persona;
import vista.VistaPersona;

/**
 *
 * @author pedrovazquezg
 */
public class ControladorPersona implements ActionListener {
    private VistaPersona vista;
    private Persona persona;
    private ConsultasPersona modelo;

    public ControladorPersona(VistaPersona vista, Persona persona, ConsultasPersona modelo) {
        this.vista = vista;
        this.persona = persona;
        this.modelo = modelo;
        vista.botonInsertar.addActionListener(this);
        vista.botonLimpiar.addActionListener(this);
        vista.botonBuscar.addActionListener(this);
        vista.botonModificar.addActionListener(this);
        vista.botonEliminar.addActionListener(this);
    }
    
    public void iniciar() {
        vista.setTitle("CRUD MVC Escuela");
        vista.setLocationRelativeTo(null);
        vista.boxID.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.botonInsertar) {
            persona.setClave(vista.boxClave.getText());
            persona.setNombre(vista.boxNombre.getText());
            persona.setDomicilio(vista.boxDomicilio.getText());
            persona.setCelular(vista.boxCelular.getText());
            persona.setCorreo_electronico(vista.boxCorreo.getText());
            persona.setFecha_nacimiento(Date.valueOf(vista.boxFechaNacimiento.getText()));
            persona.setGenero(vista.comboGenero.getSelectedItem().toString());
            
            if (modelo.insertar(persona)) {
                JOptionPane.showMessageDialog(null, "Registro insertado correctamente");
                cleanerBox();
            } else {
                JOptionPane.showMessageDialog(null, "Error al insertar registro");
                cleanerBox();
            }
        }
        if (e.getSource() == vista.botonLimpiar) {
            cleanerBox();
        }
        if (e.getSource() == vista.botonBuscar) {
            persona.setClave(vista.boxBuscar.getText());
            
            if (modelo.buscar(persona)) {
                vista.boxID.setText(String.valueOf(persona.getIdPersona()));
                vista.boxClave.setText(persona.getClave());
                vista.boxNombre.setText(persona.getNombre());
                vista.boxDomicilio.setText(persona.getDomicilio());
                vista.boxCelular.setText(persona.getCelular());
                vista.boxCorreo.setText(persona.getCorreo_electronico());
                vista.boxFechaNacimiento.setText(String.valueOf(persona.getFecha_nacimiento()));
                vista.comboGenero.setSelectedItem(persona.getGenero());
            } else {
                JOptionPane.showMessageDialog(null, "No existe una persona con esa clave");
                cleanerBox();
            }
        }
        if (e.getSource() == vista.botonModificar) {
            persona.setIdPersona(Integer.parseInt(vista.boxID.getText()));
            persona.setClave(vista.boxClave.getText());
            persona.setNombre(vista.boxNombre.getText());
            persona.setDomicilio(vista.boxDomicilio.getText());
            persona.setCelular(vista.boxCelular.getText());
            persona.setCorreo_electronico(vista.boxCorreo.getText());
            persona.setFecha_nacimiento(Date.valueOf(vista.boxFechaNacimiento.getText()));
            persona.setGenero(vista.comboGenero.getSelectedItem().toString());
            
            if (modelo.modificar(persona)) {
                JOptionPane.showMessageDialog(null, "Registro modificado correctamente");
                cleanerBox();
            } else {
                JOptionPane.showMessageDialog(null, "Error al modificar el registro");
                cleanerBox();
            }
            
        }
        if (e.getSource() == vista.botonEliminar) {
            persona.setIdPersona(Integer.parseInt(vista.boxID.getText()));
            
            if (modelo.eliminar(persona)) {
                JOptionPane.showMessageDialog(null, "Registro eliminado correctamente");
                cleanerBox();
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo eliminar el registro");
                cleanerBox();
            }
        }
    }
    
    public void cleanerBox() {
        vista.boxID.setText(null);
        vista.boxBuscar.setText(null);
        vista.boxClave.setText(null);
        vista.boxNombre.setText(null);
        vista.boxDomicilio.setText(null);
        vista.boxCelular.setText(null);
        vista.boxCorreo.setText(null);
        vista.boxFechaNacimiento.setText(null);
        vista.comboGenero.setSelectedIndex(0);
    }
}
