import java.util.Scanner;

/* Ejercicio 7
    Crear una matriz "marco" de tamaño 5x5: todos sus elementos deben ser 0 
    salvo los de los bordes que deben ser 1. Mostrarla.
*/

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int matriz[][], filas, columnas;

        System.out.println("\tMATRIZ MARCO");

        System.out.print("Digite el número de filas: ");
        filas = entry.nextInt();
        System.out.print("Digite el número de columnas: ");
        columnas = entry.nextInt();

        matriz = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (i == 0 || i == (filas - 1)) {
                    matriz[i][j] = 1;
                } else if (j == 0 || j == (columnas - 1)) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;   // Cuando creamos una matriz en Java, todos los elementos valen cero.
                }
            }
        }

        System.out.println("\nMatriz marco");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        entry.close();
    }
}