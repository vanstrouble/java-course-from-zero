import java.util.Scanner;

/* Ejercicio 2
    Leer 5 números, guardarlos en un arreglo y mostarlos en el orden inverso.
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        float numeros[] = new float[5];

        System.out.println("\tDigite 5 números");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite el número: [" + (i + 1) + "]: ");
            numeros[i] = entry.nextFloat(); 
        }
        
        System.out.println("\tLos elementos de forma inversa son");
        for (int i = 4; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
        entry.close();
    }
}