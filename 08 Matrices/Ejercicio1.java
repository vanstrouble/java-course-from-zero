import java.util.Scanner;

import javax.swing.JOptionPane;

/* Ejercicio 1
    Crear y cargar una matriz de tamaño n x m y decir si es simétrica o no.
*/

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int matriz[][], filas, columnas;
        boolean simetrica = true;

        filas = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de filas: "));
        columnas = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de columnas: "));

        matriz = new int[filas][columnas];

        System.out.println("Digite una matriz");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = entry.nextInt();
            }
        }

        if (filas == columnas) { // Si el número de filas es igual al número de columnas
            int i = 0, j = 0;
            while (i < filas && simetrica == true) {
                while (j < i && simetrica == true) {
                    if (matriz[i][j] != matriz[j][i]) {
                        simetrica = false;
                    }
                    j++;
                }
                i++;
            }
            if (simetrica == true) {
                JOptionPane.showMessageDialog(null, "La matriz es simétrica");
            } else {
                JOptionPane.showMessageDialog(null, "La matriz no es simétrica");
            }
        } else {
            JOptionPane.showMessageDialog(null, "La matriz no es simétrica");
        }
        entry.close();
    }
}