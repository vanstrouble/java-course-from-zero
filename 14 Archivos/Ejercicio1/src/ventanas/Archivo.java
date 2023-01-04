/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author pedrovazquezg
 */
public class Archivo {
    private File archivo;
    
    public void crearArchivo() {
        archivo = new File("agendaContactos.txt");
        try {
            if (archivo.createNewFile()) {
                // El archivo es creado
            }
        } catch (IOException ex) {
            System.err.println("Error. " + ex);
        }
    }
    
    public void escribirTexto(Persona persona) {
        try {
            FileWriter escribir = new FileWriter(archivo, true);
            escribir.write(persona.getNombre() + "%" + persona.getCorreo() + "%" + persona.getCelular() + "\r\n");
            escribir.close();
        } catch (IOException ex) {
            System.err.println("Error. " + ex);
        }
    }
}
