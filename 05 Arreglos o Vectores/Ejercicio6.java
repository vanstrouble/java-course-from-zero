import java.util.Scanner;

/* Ejercicio 6
    Leer los datos correspondiente a dos tablas de 12 elementos numérico y mezclarlos en una tercera de la 
    forma: 3 de la tabla A, 3 de la B, otros 3 de A, otros 3 de la B, etc.
*/

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int a[] = new int[12];
        int b[] = new int[12];
        int c[] = new int[24];

        // Llenado del arreeglo a y b
        System.out.println("Digite los números del arreglo A");
        for (int i = 0; i < a.length; i++) {
            System.out.print((i + 1) + ". Digite un número: ");
            a[i] = entry.nextInt();
        }
        System.out.println("\nIngrese los números del arreglo B");
        for (int i = 0; i < b.length; i++) {
            System.out.print((i + 1) + ". Digite un número: ");
            b[i] = entry.nextInt();
        }

        // Creamos auxiliares
        int switches = 0, j = 0, k = 0, cont = 0;

        // Ordenamos el arreglo c
        for (int i = 0; i < 24; i++) {
            if (switches == 0) {
                for (int l = 0; l < 3; l++) {
                    if (j < 12) {
                        c[cont] = a[j];
                        cont++;
                    }
                    j++;
                    if (l == 2) {
                        switches = 1;
                    }
                }
            } else {
                for (int l = 0; l < 3; l++) {
                    if (k < 12) {
                        c[cont] = b[k];
                        cont++;
                    }
                    k++;
                    if (l == 2) {
                        switches = 0;
                    }
                }
            }
        }
        // Mostrar el arreglo c
        System.out.println("\nEl arreglo resultante es:");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " - ");
        }
        entry.close();
    }
}