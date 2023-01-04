import java.util.Scanner;

/* Ejercicio 9
    Crear un programa que lea por teclado una tabla de 10 números enteros y la desplace una posición 
    hacía abajo: el primero pasa a ser el segundo, el segundo pasa a ser el tercero y así sucesivamente. 
    El último pasa a ser el primero.
*/

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int arreglo[] = new int[10];
        int ultimo;

        System.out.println("\tLlenado del arreglo");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(i + ". Digite un número: ");
            arreglo[i] = entry.nextInt();
        }
        entry.close();

        ultimo = arreglo[9]; // Guardamos el último elemento

        for (int i = 8; i >= 0; i--) {
            arreglo[i + 1] = arreglo[i];
        }
        arreglo[0] = ultimo; // Ponemos el último elemento como primero

        System.out.println("\nEL nuevo arreglo es: ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(i + ". Número: " + arreglo[i]);
        }
    }
}