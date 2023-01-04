package pruebaExcepciones;

import java.util.Scanner;

public class PruebaExcepciones {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Digite un número: ");
        int numero = leer.nextInt();

        leer.close();

        System.out.println("El numero es: " + numero);
    }
}