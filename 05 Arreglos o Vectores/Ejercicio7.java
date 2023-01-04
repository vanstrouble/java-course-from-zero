import java.util.Scanner;

/* Ejercicio 7
    Leer por teclado una serie de 10 números enteros. La aplicación debe indicarnos si los números están ordenados 
    de forma creciente, decreciente o si están desordenados.
 */

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int numeros[] = new int[10];
        boolean creciente = false, decreciente = false;

        System.out.println("Digite 10 números del arreglo: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print((i + 1) + ". Digite un número: ");
            numeros[i] = entry.nextInt();
        }
        entry.close();

        for (int i = 0; i < 9; i++) {
            if (numeros[i] < numeros[i + 1]) {
                creciente = true;
            } else if (numeros[i] > numeros[i + 1]) {
                decreciente = true;
            } 
        }

        if (creciente == true && decreciente == false) {
            System.out.println("\nEl arreglo está odenado de forma creciente");
        } else if (decreciente == true && creciente == false) {
            System.out.println("\nEl arreglo está ordenado de forma decreciente");
        } else if (creciente == true && decreciente == true) {
            System.out.println("\nEl arreglo está desordenado");
        } else if (creciente == false && decreciente == false) {
            System.out.println("\nTodos los números son iguales");
        }
    }
}