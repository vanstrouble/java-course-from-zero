/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud_mvc_escuela;

import controlador.ControladorPersona;
import modelo.ConsultasPersona;
import modelo.Persona;
import vista.VistaPersona;

/**
 *
 * @author pedrovazquezg
 */
public class CRUD_MVC_Escuela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VistaPersona vista = new VistaPersona();
        Persona persona = new Persona();
        ConsultasPersona modelo = new ConsultasPersona();
        ControladorPersona controlador = new ControladorPersona(vista, persona, modelo);
        
        controlador.iniciar();
        vista.setVisible(true);
    }
    
}
