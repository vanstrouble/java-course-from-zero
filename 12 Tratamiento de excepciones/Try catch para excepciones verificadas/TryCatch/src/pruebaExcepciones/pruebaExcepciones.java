import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

/*
 * Try catch para excepciones verificadas
 */

public class pruebaExcepciones {

    public void leerArchivo() throws FileNotFoundException, IOException {
        File archivo = new File("/Users/pedrovazquez/OneDrive - Universidad de Guanajuato/Universidad/UG/04 Cursos/Udemy/Java/12 Tratamiento de excepciones/Try catch para excepciones verificadas/TryCatch/texto.txt");
        FileReader fr = new FileReader(archivo);
        BufferedReader bf = new BufferedReader(fr);
        String linea;

        while ((linea = bf.readLine()) != null) {
            System.out.println(linea);
        }
    }

    public void leerArchivo2() {
        try {
            leerArchivo();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "No se ha encontrado el archivo.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido una excepción verificada");
        } finally {
            System.out.println("Yo me ejecuto siempre");
        }

        // El programa continua
        System.out.println("Programa termiando");
    }
    
    public static void main(String[] args) {
        pruebaExcepciones prueba = new pruebaExcepciones();

        prueba.leerArchivo2();
    }
}