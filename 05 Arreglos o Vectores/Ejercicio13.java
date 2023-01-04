import java.util.Scanner;

/* Ejercicio 13
    Leer 10 números enteros en una tabla. Guardar en otra tabla los elementos 
    pares de  la primera y a continuación los elementos impares.
*/

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        int numeros[] = new int[10];
        byte pares = 0, impares = 0;

        System.out.println("\tLlenado del arreglo...");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print((i +1) + ". Digite un número: ");
            numeros[i] = entry.nextInt();

            if (numeros[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        entry.close();

        int nPar[] = new int[pares];
        int nImpar[] = new int[impares];

        pares = 0;
        impares = 0;

        // Almacenamos los números pares en su arreglo y los impares también
        for (int i = 0; i < 10; i++) {
            if (numeros[i] % 2 == 0) {
                nPar[pares] = numeros[i];
                pares++;
            } else {
                nImpar[impares] = numeros[i];
                impares++;
            }
        }

        System.out.println("\nEl arreglo de los pares es...");
        for (int i = 0; i < nPar.length; i++) {
            System.out.print(nPar[i] + " - ");
        }

        System.out.println("\nEl arreglo de los impares es...");
        for (int i = 0; i < nImpar.length; i++) {
            System.out.print(nImpar[i] + " - ");
        }
        System.out.println();
    }
}