import java.util.Scanner;

/* Ejercicio 8. Construir un programa que calcule y muestre por pantalla las raíces de 
la ecuación de segundo grado de coeficientes reales. 

ax^2 + bx + c = 0

*/

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        double a, b, c, x1, x2;

        System.out.println("\tCALCULADORA ECUACIONES DE 2DO GRADO\n");

        System.out.print("Digite el valor (a): ");
        a = entry.nextDouble();
        System.out.print("Digite el valor (b): ");
        b = entry.nextDouble();
        System.out.print("Digite el valor (c): ");
        c = entry.nextDouble();

        x1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
        x2 = (- b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);

        System.out.println("\nLa raíz 1 es: " + x1);
        System.out.println("La raíz 2 es: " + x2);

        entry.close();
    }
}