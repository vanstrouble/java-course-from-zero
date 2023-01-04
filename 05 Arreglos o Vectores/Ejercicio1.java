import java.util.Scanner;

/* Ejercicio 1
    Leer 5 números, guardarlos en un arreglo y mostarlos en el mismo orden introducido.
*/

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float numeros[] = new float[5];

        System.out.println("Guardando los datos del arreglo...");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print((i + 1) + ". Digite un número: ");
            numeros[i] = entrada.nextFloat();
        }
        
        System.out.println("\nImprimiendo los elementos del arreglo...");
        for (float f : numeros) {
            System.out.println(f);    
        }
        entrada.close();
    }
}