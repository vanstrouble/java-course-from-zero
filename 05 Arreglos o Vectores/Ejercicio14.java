import java.util.Scanner;

/* Ejercicio 14
    Leer dos series de 10 enteros que están ordenados crecientemente. 
    Copiar (fusionar) las dos tablas en una tercera, de forma que sigan ordenados.
*/

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        int a[] = new int[10];
        int b[] = new int[10];
        int c[] = new int[20];
        boolean creciente = true;

        System.out.println("\tDigite el primer arreglo...");
        do {
            for (int i = 0; i < 10; i++) {
                System.out.print((i +1) + ". Digite un número: ");
                a[i] = entry.nextInt();
            }
            for (int i = 0; i < 9; i++) {
                if (a[i] < a[i + 1]) {
                    creciente = true;
                } else if (a[i] > a[i + 1]) {
                    creciente = false;
                    break;
                }
            }
            if (creciente == false) {
                System.out.println("\nEl arreglo está desordenado. Vuelva a digitar");
            }
        } while (creciente == false);

        System.out.println("\tDigite el segundo arreglo...");
        do {
            for (int i = 0; i < 10; i++) {
                System.out.print((i +1) + ". Digite un número: ");
                b[i] = entry.nextInt();
            }
            for (int i = 0; i < 9; i++) {
                if (b[i] < b[i + 1]) {
                    creciente = true;
                } else if (a[i] > a[i + 1]) {
                    creciente = false;
                    break;
                }
            }
            if (creciente == false) {
                System.out.println("\nEl arreglo está desordenado. Vuelva a digitar");
            }
        } while (creciente == false);

        entry.close();

        int i = 0; // Iterador i para el arreglo a 
        int j = 0; // Iterador j para el arreglo b
        int k = 0; // Iterador k para el arreglo c

        while (i < 10 && j < 10) {
            if (a[i] < b[j]) { // Si el elemento de a es mejor de b
                c[k] = a[i]; // Copiamos el elemento de a
                i++; // Avanzamos una posición en a 
            } else {
                c[k] = b [j]; // Copiamos el elemento de b
                j++; // Avanzamos una posición más en b
            }
            k++; // Avanzamos una posición en c
        }

        // Cuando salimos del while  es porque un arreglo (a o b), se ha copiado completamente
        if (i == 10) { // Significa que ya copiamos todo el arreglo a, falta b
            c[k] = b[j]; // Copiamos el elemento b en c
            j++; // Avanzamos en posición b
            k++; // Avanzamos en posición en c
            
        } else { // Significa que ya copiamos todo el arreglo b, falta el a
            while (i < 10) {
                c[k] = a[i];
                i++;
                k++;
            }
        }

        System.out.println("\nEl arreglo C completo es...");
        for (k = 0; k < 20; k++) {
            System.out.print(c[k] + " - ");
        }
        System.out.println();
    }
}