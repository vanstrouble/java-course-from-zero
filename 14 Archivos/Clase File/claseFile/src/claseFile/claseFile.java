import java.io.File;

/**
 * claseFile
 */
public class claseFile {

    public static void main(String[] args) {
        File directorio = new File("carpetaPrueba"); // Ruta relativa

        if (directorio.exists()) { // Si el archivo existe
            System.out.println("El directorio SI existe");
            System.out.println("Ruta absoluta de mi directorio: "  + directorio.getAbsolutePath()); // Devuelve la ruta absoluta del archivo
            System.out.println("¿Es un directorio? " + directorio.isDirectory()); // Devuelve si o no si es un archivo
            System.out.println("¿Se puede leer? " + directorio.canRead()); // Devuelve true or false si el archivo puede ser leído
        } else {
            System.out.println("El archivo NO existe");
        }
    }


}