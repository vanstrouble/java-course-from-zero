package Ejercicio1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        Cuadrilatero c1;
        float lado1, lado2;

        System.out.println("\tÁREA Y PERÍMETRO DE UN CUADRILÁTERO\n");

        System.out.print("Digite el lado 1: ");
        lado1 = entry.nextFloat();
        System.out.print("Digite el lado 2: ");
        lado2 = entry.nextFloat();

        entry.close();

        if (lado1 == lado2) { // En caso de que sea un cuadrado
            c1 = new Cuadrilatero(lado1);
        } else {    // En caso de que no lo sea
            c1 = new Cuadrilatero(lado1, lado2);
        }

        // Mostrar los resultados
        System.out.println("\nEl perímetro es: " + c1.getPerimetro());
        System.out.println("El área es: " + c1.getArea());
    }
}
