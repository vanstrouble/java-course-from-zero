import java.util.Scanner;

/* Ejercicio 5
    Crear y cargar una matriz de tamaño n x m, mostrar la suma de cada fila y de cala columna.
*/
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int matriz[][], filas, columnas, sumaFilas, sumaColumnas;

        System.out.println("\tSUMA DE FILAS Y COLUMNAS DE UNA MATRIZ");

        System.out.print("Digite el número de filas: ");
        filas = entry.nextInt();
        System.out.print("Digite el número de columnas: ");
        columnas = entry.nextInt();

        matriz = new int[filas][columnas];

        System.out.println("\nRellene la matriz");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = entry.nextInt();
            }
        }

        entry.close();

        // Mostramos la matriz original
        System.out.println("\nMatriz original");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Suma de filas y columnas
        for (int i = 0; i < filas; i++) {
            sumaFilas = 0;
            for (int j = 0; j < columnas; j++) {
                sumaFilas += matriz[i][j];
            }
            System.out.print("\nLa suma de la fila [" + i + "] es: " + sumaFilas);
        }
        System.out.println(" ");

        for (int j = 0; j < columnas; j++) {
            sumaColumnas = 0;
            for (int i = 0; i < filas; i++) {
                sumaColumnas += matriz[i][j];
            }
            System.out.print("\nLa suma de la columana [" + j + "] es: " + sumaColumnas);
        }
        System.out.println(" ");
    }
}