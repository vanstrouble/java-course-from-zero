import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.Buffer;

public class JerarquiaExcepciones {
    public static void main(String[] args) {
        // Excepción Verificada (IOException)
            // Lectura de un archivo de texto 
            BufferedReader bf = new BufferedReader(new FileReader(\\Users\\pedrovazquez\\Desktop\\Archivo.txt));
            String linea;
            while ((linea = bf.readLine()) != null) {
                System.out.println(linea);
            }
    }
    
}