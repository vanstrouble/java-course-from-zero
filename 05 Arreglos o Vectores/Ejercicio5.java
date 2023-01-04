import java.util.Scanner;

/* Ejercicio 5
    Leer por teclado dos tablas de 10 números enteros y mezclarlas en una tercera de la forma: 
    el 1ro de A, el 1ro de B, el 2do de A, el 2do de B, etc.
*/

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        float numA[] = new float[10], numB[] = new float[10], numC[] = new float[20];

        System.out.println("Digite los numeros del arreglo A");
        for (int i = 0; i < numA.length; i++) {
            System.out.print((i +1) + ". Digite un número: ");
            numA[i] = entry.nextFloat();
        }
        System.out.println("\nDigite lo números de arreglo B");
        for (int i = 0; i < numB.length; i++) {
            System.out.print((i + 1) + ". Digite un número: ");
            numB[i] = entry.nextFloat();
        }

        int j = 0; // Utilizo un auxiliar para avanzar
        for (int i = 0; i < 10; i++) {
            numC[j] = numA[i];
            j++;
            numC[j] = numB[i];
            j++;
        }
        System.out.print("\nEl tercer arreglo es: ");
        for (int i = 0; i < numC.length; i++) {
            System.out.print(numC[i] + " ");
        }
        System.out.println();
        entry.close();
    }
}