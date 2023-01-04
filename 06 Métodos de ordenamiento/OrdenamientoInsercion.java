import java.util.Scanner;

import javax.swing.JOptionPane;

/* Ordenamieento por inserción 
 * Es una manera muy natural de ordenar para un ser humano, y se puede usar facilmente para ordenar un mazo 
 * de cartas numeradas en forma arbitraria. Requiere O(n^2) operaciones para ordenar una lista de n elementos.
*/

public class OrdenamientoInsercion {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        int arreglo[], nElementos, pos, aux;

        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de elementos del arreglo: "));

        arreglo = new int[nElementos];

        System.out.println("Llene el arreglo");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print((i + 1) + ". Digite un número: ");
            arreglo[i] = entry.nextInt();
        }

        // Ordenamiento por Inserción
        for (int i = 0; i < arreglo.length; i++) {
            pos = i;
            aux = arreglo[i];

            while ((pos > 0) && (arreglo[pos - 1] > aux)) {
                arreglo[pos] = arreglo[pos - 1];
                pos--;
            }
            arreglo[pos] = aux;
        }

        // Mostrar los elementos del arreglo
        System.out.println("\nOrden ascendente");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " - ");
        }

        System.out.println("\nOrden descendente");
        for (int i = (nElementos - 1); i >= 0; i--) {
            System.out.print(arreglo[i] + " - ");
        }

        System.out.println();
        entry.close();
    }
}