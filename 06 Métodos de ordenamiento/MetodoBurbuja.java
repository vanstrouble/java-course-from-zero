import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * Método Burbuja
 * Es un sencillo algoritmo de ordenamiento. Funciona revisando cada elemento de la lista que va a ser ordenada 
 * con el siguiente, intercambiandolos de posición si están en el orden equivocado. Es necesario revisar varias 
 * veces toda la lista hasta que no se necesiten más intercambios, lo que significa que la lista está ordenada.
 */
public class MetodoBurbuja {

    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int arreglo[], nElementos, aux;
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos del arreglo: "));

        arreglo = new int[nElementos];  // Asignamos el número de elementos al arreglo

        for (int i = 0; i < arreglo.length; i++) {
            System.out.print((i + 1) + ". Digite un número: ");
            arreglo[i] = entry.nextInt();
        }

        // Método Burbuja
        for (int i = 0; i < (arreglo.length - 1); i++) {
            for (int j = 0; j < (arreglo.length - 1); j++) {
                if (arreglo[j] > arreglo[j + 1]) {  // Si numeroActual > numeroSiguiente
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }
        }

        // Mostrar el arreglo ordenado en forma creciente
        System.out.println("\nArreglo ordenado de forma creciente");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " - ");
        }

        // Mostrar el arreglo ordenado de forma decreciente
        System.out.println("\nArreglo ordenado de forma decreciente");
        for (int i = (nElementos - 1); i >= 0; i--) {
            System.out.print(arreglo[i] + " - ");
        }

        System.out.println();
        entry.close();
    }
}