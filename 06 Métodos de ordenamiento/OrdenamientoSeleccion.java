import java.util.Scanner;

import javax.swing.JOptionPane;

/* Ordenamiento por Selección
 * Es un algoritmo de ordenamiento que requiere O(n^2) operaciones para ordenar una lista de n números. 
 * Su funcionamiento es el siguiente: 
 * 
 * 1. Buscar el mínimo elemento de la lista.
 * 2. Intercambiar con el primer elemento.
 * 3. Buscar el mínimo del resto de la lista.
 * 4. Intercambiar con el segundo.
 * 5. Y así sucesivamente.
*/

public class OrdenamientoSeleccion {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        int arreglo[], nElementos, min, aux;

        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de elementos del arreglo: "));

        arreglo = new int[nElementos];

        System.out.println("Llenado del arreglo");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print((i + 1) + ". Digite un número: ");
            arreglo[i] = entry.nextInt();
        }

        // Ordenamiento por Selección
        for (int i = 0; i < arreglo.length; i++) {
            min = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[min]) {
                    min = j;
                }
            }
            aux = arreglo[i];
            arreglo[i] = arreglo[min];
            arreglo[min] = aux;
        }
        
        // Mostrar el arreglo ordenado
        System.out.print("\nOrden Creciente: ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " - ");
        }

        System.out.print("\nOrden Descendente: ");
        for (int i = (nElementos - 1); i >= 0; i--) {
            System.out.print(arreglo[i] + " - ");
        }

        System.out.println();
        entry.close();
    }
}