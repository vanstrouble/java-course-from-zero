import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/* Excepciones en un método */

public class DeclaracionExcepciones {

    public void leerArchivo() throws FileNotFoundException {
        File archivo = new File("desktop\\texto.txt");
        FileReader fr = new FileReader(archivo);
    }

    public void leerArchivo2 throws IOException {
        leerArchivo();
    }

    public static void main(String[] args) {
        
    }
}