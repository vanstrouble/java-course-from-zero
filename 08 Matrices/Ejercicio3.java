import java.util.Scanner;

/* Ejercicio 3
    Crear y caragar una matriz de tamaño 3x3, transponerla y mostrarla.
*/

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        float matriz[][];
        byte filas, columnas;

        System.out.println("\tTRANSPONER UNA MATRIZ");
        System.out.println("NOTA: las filas y columnas deben ser iguales");
        System.out.print("\nDigite el número de filas: ");
        filas = entry.nextByte();
        System.out.print("Digite el número de columnas: ");
        columnas = entry.nextByte();

        matriz = new float[filas][columnas];

        System.out.println("\nRellene la matriz");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = entry.nextFloat();
            }
        }

        // Mostramos la matriz original
        System.out.println("\nMatriz original");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Generamos matriz transpuesta
        float aux;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < i; j++) {
                aux = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = aux;
            }
        }

        // Mostrar la matriz transpuesta
        System.out.println("\nMatriz transpuesta");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        entry.close();
    }
}