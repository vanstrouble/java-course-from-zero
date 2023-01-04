import java.util.Scanner;

/* Ejercicio 6
    Utilizando dos matrices de tamaño 5x9 y 9x5, cargar la primera y transponerla en la segunda.
*/

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int matriz1[][] = new int[5][9];
        int matriz2[][] = new int[9][5];

        System.out.println("Digite la matriz");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print("Matriz[" + i + "][" + j + "]: ");
                matriz1[i][j] = entry.nextInt();
            }
        }

        entry.close();

        // Mostramos la matriz original
        System.out.println("\nMatriz original");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println();
        }

        // Transponer la matriz1 a la matriz2
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                matriz2[j][i] = matriz1[i][j];
            }
        }

        // Imprimir la matriz2
        System.out.println("\nMatriz transpuesta");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println();
        }
    }
}