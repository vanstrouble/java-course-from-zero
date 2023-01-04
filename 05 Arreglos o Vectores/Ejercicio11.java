import java.util.Scanner;

/* Ejercicio 11
    Leer 5 elementos numéricos que se introducirán ordenados de forma creciente. Éstos 
    los guardaremos en una tabla de tamaño 10. Leer un número N e insertarlo en el lugar 
    adecuado para que la tabla continúe ordenada.
*/

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        int arreglo[] = new int[10];
        int numero, sitioNum = 0, j = 0;
        boolean creciente = true;

        System.out.println("\tDigite 5 números ordenados de forma creciente");
        do {
            // Llenado del arreglo
            for (int i = 0; i < 5; i++) {
                System.out.print((i + 1) + ". Digite un número: ");
                arreglo[i] = entry.nextInt();
            }
            // Comprobando que el arreglo está ordenado de forma creciente
            for (int i = 0; i < 4; i++) {
                if (arreglo[i] < arreglo[i +1]) {
                    creciente = true;
                } else if (arreglo[i] > arreglo[i + 1]) {
                    creciente = false;
                    break;
                }
            }
            // Advertencia de error
            if (creciente == false) {
                System.out.println("\nEl arreglo no está ordenado de forma creciente. Vuelva a digitarlo.\n");
            }
        } while (creciente == false);

        System.out.print("\nIngrese el número a ordenar: ");
        numero = entry.nextInt();

        entry.close();

        // Esto es para darnos cuenta en qué posición va el número
        while (arreglo[j] < numero && j < 5) {
            sitioNum++;
            j++;
        }
        
        // Trasladamos una posición en el arreglo a los elementos que van detrás del número
        for (int i = 4; i >= sitioNum; i--) {
            arreglo[i + 1] = arreglo[i];
        }
        arreglo[sitioNum] = numero; // Insertamos el número que el usuario digitó

        // Imprimir el arreglo resultante
        System.out.println("\nEl arreglo resultante es...");
        for (int i = 0; i < 6; i++) {
            System.out.println((i + 1) + ". Elemento: " + arreglo[i]);
        }
    }
}