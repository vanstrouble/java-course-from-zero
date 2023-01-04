import java.util.Scanner;

/* Ejercicio 10
    Crear un programa que lea por teclado una tabla de 10 números enteros y desplace N posiciones 
    en el arreglo (N es digitado por el usuario).
*/

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        
        int arreglo[] = new int[10];
        int posiciones, ultimo;

        System.out.println("\tIngrese los valores del arreglo");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(i + ". Digite un número: ");
            arreglo[i] = entry.nextInt();
        }

        System.out.print("\nDigite las posiciones a desplazar: ");
        posiciones = entry.nextInt();

        entry.close();

        for (int vuelta = 1; vuelta <= posiciones; vuelta++) {
            ultimo = arreglo[9];    // Guardamos el último elemento del arreglo
            for (int i = 8; i >= 0; i--) {  // Desplazando una posición en el arreglo
                arreglo[i + 1] = arreglo[i];
            }
            arreglo[0] = ultimo;    // Ponemos el último elemento como primero
        }

        System.out.println("\nEl arreglo resultante es...");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(i + ". Elemento: " + arreglo[i]);
        }
    }
}