import java.util.Scanner;

import javax.swing.JOptionPane;

// Llenar arreglo

public class LlenarArreglo {
    public static void main(String[] args) {
        int nElementos;

        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos del arreglo: "));
        Scanner entry = new Scanner(System.in);

        char[] letras = new char[nElementos];

        System.out.println("Digite los elementos del arreglo: ");
        for (int i = 0; i < nElementos; i++) {
            System.out.print((i + 1) + ". Digite un caracter: ");
            letras[i] = entry.next().charAt(0);
        }
        System.out.println("\nLos caracteres del arreglo son: ");
        for (int i = 0; i < nElementos; i++) {
            System.out.print(letras[i] + " ");
        }
        System.out.println("\n");
        entry.close();
    }
}