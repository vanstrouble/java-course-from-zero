import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * archivosBinarios
 */
public class archivosBinarios {

    private void escribirBinario() {
        try {
            FileOutputStream archivo = new FileOutputStream("personas.bin");
            ObjectOutputStream escritura = new ObjectOutputStream(archivo);
            
            // Escribimos objetos sobre el archivo binario
            persona persona1 = new persona("Aideé", 23);
            persona persona2 = new persona("Berenice", 22);
            persona persona3 = new persona("Pedro", 21);
            persona persona4 = new persona("Antonio", 20);

            escritura.writeObject(persona1);
            escritura.writeObject(persona2);
            escritura.writeObject(persona3);
            escritura.writeObject(persona4);

            escritura.close(); // Cerramos el archivo binario
        } catch (FileNotFoundException e) {
            System.err.println("Error. " + e);
        } catch (IOException e) {
            System.err.println("Error. " + e);
        }
    }

    private void leerBinario() {
        persona objetoPersona;

        try {
            FileInputStream archivo = new FileInputStream("personas.bin");
            ObjectInputStream lectura = new ObjectInputStream(archivo);

            while (true) { // Recorremos el archivo binario
                objetoPersona = (persona)lectura.readObject();
                objetoPersona.mostrarDatos();
            }
        } catch (EOFException e) {
            return; // Finalizó de leer todo el archivo binario
        } catch (FileNotFoundException e) {
            System.err.println("Error. " + e);
        } catch (IOException e) {
            System.err.println("Error. " + e);
        } catch (ClassNotFoundException e) {
            System.err.println("Error. " + e);
        }
        
    }

    private void añadirBinario() {
        try {
            FileOutputStream archivo = new FileOutputStream("personas.bin", true);
            añadirContenido escritura = new añadirContenido(archivo);
            
            // Escribimos objetos sobre el archivo binario
            persona persona1 = new persona("Francisca", 50);
            persona persona2 = new persona("José", 50);
            persona persona3 = new persona("Carmen", 50);
            persona persona4 = new persona("Poli", 55);

            escritura.writeObject(persona1);
            escritura.writeObject(persona2);
            escritura.writeObject(persona3);
            escritura.writeObject(persona4);

            escritura.close(); // Cerramos el archivo binario
        } catch (FileNotFoundException e) {
            System.err.println("Error. " + e);
        } catch (IOException e) {
            System.err.println("Error. " + e);
        }
    }

    public static void main(String[] args) {
        archivosBinarios archivos = new archivosBinarios();

        // archivos.escribirBinario();
        archivos.añadirBinario();
        archivos.leerBinario();
    }
}