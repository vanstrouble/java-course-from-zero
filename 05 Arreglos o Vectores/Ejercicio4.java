import java.util.Scanner;

/* Ejercicio 4
    Leer 10 números enteros, guardarlos en un arreglo. Debemos mostrarlos en el siguiente orden: 
    el primero, el segundo, el penúltimo, el tercero, etc.
*/

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        float numeros[] = new float[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite un número [" + (i + 1) + "]: ");
            numeros[i] = entry.nextFloat();
        }

        System.out.println();

        System.out.println("El resultado es...");
        for (int i = 0; i < 5; i++) {
            System.out.print(numeros[i] + " "); // Imprime el primero
            System.out.print(numeros[9 - i] + " "); // Imprime el último 
        }
        System.out.println();
        entry.close();
    }
}