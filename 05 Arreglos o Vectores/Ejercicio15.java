import java.util.Scanner;

/* Ejercicio 15
    Leer 10 números enteros ordenados crecientemente. Leer n y buscarlo en la tabla. 
    Se debe mostrar la posición en que se encuentra. Si no está, indicarlo con un mensaje.
 */

public class Ejercicio15 {

    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        int arreglo[] = new int[10], numero;
        boolean creciente = true;

        do {
            // Pedimos el arreglo
            System.out.println("\tIngrese el arreglo...");
            for (int i = 0; i < 10; i++) {
                System.out.print(i + ". Digite un número: ");
                arreglo[i] = entry.nextInt();
            }
            // Comprobar que el arreglo esté ordenado
            for (int i = 0; i < 9; i++) {
                if (arreglo[i] < arreglo[i + 1]) {
                    creciente = true;
                } else if (arreglo[i] > arreglo[i + 1]) {
                    creciente = false;
                    break;
                }
            }
            // Advertencia de error
            if (creciente == false) {
                System.out.println("\nEl arreglo está desordenado. Vuelva a intentarlo\n");
            }
        } while (creciente == false);

        // Pedimos el número a encontrar
        System.out.print("\nDigite el número a localizar: ");
        numero = entry.nextInt();

        // Buscamos el número en el arreglo
        int i = 0;
        while (i < 10 && arreglo[i] < numero) {
            i++;
        }
        if (i == 10) {  // Hemos recorrido todo el arreglo y no encontramos nada
            System.out.println("\nNúmero no encontrado");
        } else {
            if (arreglo[i] == numero) {
                System.out.println("\nNúmero encontrado en la posición: " + i);
            } else {
                System.out.println("\nNúmero no encontrado");
            }
        }
        entry.close();
    }
}