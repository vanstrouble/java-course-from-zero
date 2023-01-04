import java.util.Scanner;

/*  Ejercicio 6
    Leer los datos correspondiente a dos tablas de 12 elementos numérico y mezclarlos en una tercera de la 
    forma: 3 de la tabla A, 3 de la B, otros 3 de A, otros 3 de la B, etc.
 */
public class Ejercicio6Alternativo {

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

        entry.close();

        /* 
            Mezclamos los arreglos de la forma en la que se pide. 
            El iterador i va a ser para a[] y b[]
            y el iterador j va a ser utilizado para c[]
        */ 

        int i = 0, j = 0;

        while (i < 12) {
            // Copiar los 3 elementos de a[]
            for (int k = 0; k < 3; k++) {
                c[j] = a[i + k];
                j++;
            }
            // Ahora copiamos 3 elementos de b[]
            for (int k = 0; k < 3; k++) {
                c[j] = b[i + k];
                j++;
            }
            i += 3;
        }

        // Mostramos el arreglo c[]
        System.out.println("\nEl arreglo resultante es:");
        for (i = 0; i < c.length; i++) {
            System.out.print(c[i] + " - ");
        }
        System.out.println();
    }
}