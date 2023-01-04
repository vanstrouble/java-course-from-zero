import java.util.Scanner;

/* Ejercicio 2
    Crear y cargar dos matrices de tamaño 3x3, sumarlas y mostrar su suma.
*/

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        int matriz1[][] = new int[3][3];
        int matriz2[][] = new int[3][3];
        int suma[][] = new int [3][3];

        System.out.println("\tSUMA DE MATRICES 3x3");

        System.out.println("Rellene la primer matriz");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Matriz 1 [" + i + "][" + j + "]: ");
                matriz1[i][j] = entry.nextInt();
            }
        }
        System.out.println("\nRellene la segunda matriz");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Matriz 2 [" + i + "][" + j + "]: ");
                matriz2[i][j] = entry.nextInt();
            }
        }
        
        entry.close();

        // Suma de matrices
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                suma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        System.out.println("\nLa suma de las matrices es:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < suma.length; j++) {
                System.out.print(suma[i][j] + " ");
            }
            System.out.println();
        }
    }
}