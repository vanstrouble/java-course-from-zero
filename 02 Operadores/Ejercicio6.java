import java.util.Scanner;

/* Ejercicio 6. Hacer un programa que calcule el cuadrado de una suma.
    
(a+b)^2 = a^2 + b^2 + 2ab

*/

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        double a, b, resultado;

        System.out.println("\tCUADRADO DE UNA SUMA\n");

        System.out.print("Digite el valor (a): ");
        a = entry.nextDouble();
        System.out.print("Digite el valor (b): ");
        b = entry.nextDouble();

        System.out.println("\nAplicando formula: (a+b)^2 = a^2 + b^2 + 2ab");

        resultado = Math.pow(a, 2) + Math.pow(b, 2) + (2 * a * b);

        System.out.println("\nEl resultado es: " + resultado);
        
        entry.close();
    }
}