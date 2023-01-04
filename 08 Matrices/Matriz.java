import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * Matriz
 */
public class Matriz {

    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        // int matriz[][] = {{1,2,3}, {4,5,6}, {7,8,9}};

        // for (int i = 0; i < 3; i++) {   // Número de filas
        //     for (int j = 0; j < 3; j++) {   // Número de columnas
        //         System.out.print(matriz[i][j]);
        //     }
        //     System.out.println();
        // }

        int matriz[][], filas, columnas;

        filas = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de filas: "));
        columnas = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de columnas: "));

        matriz = new int[filas][columnas];

        System.out.println("\nIngrese la matriz");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = entry.nextInt();
            }
        }

        System.out.println("\nLa matriz es: ");
        for (int i = 0; i < filas; i++) {   // Número de filas
            for (int j = 0; j < columnas; j++) {   // Número de columnas
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
        entry.close();
    }
}