import java.util.Scanner;

/* Ejercicio 1
    El cuadrado de un número hasta que se introduzca un negativo.
*/

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        int numeroUsuario, cuadrado;

        System.out.print("Digite un número: ");
        numeroUsuario = entry.nextInt();
        
        while (numeroUsuario >= 0) {
            cuadrado = (int)Math.pow(numeroUsuario, 2);
            System.out.println("El cuadrado de " + numeroUsuario + " es " + cuadrado + "\n\n");
            System.out.print("Digite un número: ");
            numeroUsuario = entry.nextInt();
        }
        entry.close();
    }
}