import java.util.Scanner;

/* Ejercicio 12
    Leer por teclado una tabla de 10 elementos numéricos enteros y una posición (entre 0 y 9). 
    Eliminar el elemento situado en la posición dada sin dejar huecos. 
*/

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        int arreglo[] = new int[10];
        int posicion;

        System.out.println("\tLlenado de arreglo");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(i + ". Digite un número: ");
            arreglo[i] = entry.nextInt();
        }

        // Pedimos la posición en el rango de 0 - 9
        do {
            System.out.print("\nDigite una posición del arreglo (0-9): ");
            posicion = entry.nextInt();
        } while (posicion < 0 || posicion > 9);

        entry.close();

        // Eliminando el elemento de la posición indicada
        for (int i = posicion; i < 9; i++) {
            arreglo[i] = arreglo[i + 1];
        }

        System.out.println("\nEl arreglo queda...");
        for (int i = 0; i < 9; i++) {
            System.out.println(i + ". Elemento: " + arreglo[i]);
        }
    }
}