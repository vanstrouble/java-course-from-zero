import java.util.Scanner;

/* Ejercicio 16
    Pide un número (que debe estar entre 0 y 10) y mostrar la tabla de producto de dicho número.
*/

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        byte numero, producto = 0;

        System.out.print("Digite un numero entre 0-10: ");
        numero = entry.nextByte();

        if (numero >= 0 && numero <=10) {
            for (int i = 1; i <= 10; i++) {
                producto += (byte)(numero * 1);
                System.out.println(numero + " x " + i + " = " + producto);   
            } 
        } else {
            System.out.println("Digite un número dentro del rango (0-10)");
        }
        entry.close();
    }
}