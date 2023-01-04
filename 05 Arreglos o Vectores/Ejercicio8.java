import java.util.Scanner;

/* Ejercicio 8
    Diseñar una aplicación que declare una tabla de 10 elementos enteros. 
    Leer mediante el teclado 8 números. Después de debe pedir un número y una posición, 
    insertarlo en la posición indicada, desplazando los que estén detrás.
*/

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int arreglo[] = new int[10];
        int numero, posicion;

        System.out.println("\tLlenado del arreglo");
        for (int i = 0; i < 8; i++) {
            System.out.print((i) + ". Digite un número: ");
            arreglo[i] = entry.nextInt();
        }

        System.out.print("\nDigite un número: ");
        numero = entry.nextInt();
        System.out.print("Digite una posición: ");
        posicion = entry.nextInt();

        entry.close();

        // Correr una posición los elementos detrás de la posición que el usuario quiere
        for (int i = 7; i >= posicion; i--) {    // 1 - 2 - 3 - numero - 4 - 5 - 6
            arreglo[i + 1] = arreglo[i];
        }

        arreglo[posicion] = numero; // Insertamos el número en la posición requerida

        System.out.println("\nEl núevo arreglo es: ");
        for (int i = 0; i < 9; i++) {
            System.out.println("Posición " + i + ": " + arreglo[i]);
        }
    }
}