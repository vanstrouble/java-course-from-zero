package archivoDeTexto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * archivoDeTexto
 */
public class archivoDeTexto {
    File archivo;

    private void crearArchivo() {
        archivo = new File("prueba.txt");

        try {
            if (archivo.createNewFile()) { // Verifica si se ha creado el archivo
                System.out.println("El archivo se ha creado correctamente");
            }
        } catch (IOException e) {
            System.err.println("No se pudo crear el archivo");
        }
    }

    private void crearDirectorio() {
        archivo = new File("carpetaPrueba");

        if (archivo.mkdir()) { // Verificar si el directorio de ha creado
            System.out.println("Se ha creado el directorio correctamente");
        } else {
            System.err.println("Error. No se ha podido crear la carpeta");
        }
    }

    private void escribirTexto() {
        try {
            FileWriter escribir = new FileWriter(archivo);
            escribir.write("Te amo Aideé");
            escribir.write("\r\nTe exytraño muchísimo y espero que puedas ver mis programas");
            escribir.close();
        } catch (IOException e) {
            System.err.println("No se pudo escribir sobre el archivo");

        }
    }

    private void añadirTexto() {
        try {
            FileWriter escribir = new FileWriter(archivo, true);
            escribir.write("\r\nEres la mejor");
            escribir.write("\r\nTe amo chiquibaby");
            escribir.close();
        } catch (IOException e) {
            System.err.println("No se pudo escribir sobre el archivo");

        }
    }

    private void leerTexto() {
        String cadena;
        try {
            FileReader lector = new FileReader(archivo);
            BufferedReader lectura = new BufferedReader(lector);
            cadena = lectura.readLine();
            while (cadena != null) {
                System.out.println(cadena);
                cadena = lectura.readLine();
            }
            lectura.close();
        } catch (FileNotFoundException e) {
            System.err.println("Error, " + e);
        } catch (IOException e) {
            System.err.println("Error, " + e);
        }
        
    }

    public static void main(String[] args) {
        archivoDeTexto archivos = new archivoDeTexto();

        archivos.crearArchivo();
        archivos.leerTexto();
        // archivos.escribirTexto();
        // archivos.añadirTexto();
        // archivos.crearDirectorio();
    }
}