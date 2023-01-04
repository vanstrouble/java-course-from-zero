package Ejercicio5;

import java.util.Scanner;

public class Principal {
    public static double mayorArea(Triangulo_Isosceles triangulos[]) {
        double area;
        area = triangulos[0].obtenerArea();
        for (int i = 1; i < triangulos.length; i++) {
            if (triangulos[i].obtenerArea() > area) {
                area = triangulos[i].obtenerArea();
            }
        }
        return area;
    }
    public static void main(String[] args) throws Exception {
        Scanner entry = new Scanner(System.in);
        double base, lado;
        int nTriangulos;

        System.out.println("\tÁREA Y PERÍMETRO DE TRIANGULOS ISÓSCELES\n");

        System.out.print("Digite la cantidad de triángulos a ingresar: ");
        nTriangulos = entry.nextInt();

        Triangulo_Isosceles triangulos[] = new Triangulo_Isosceles[nTriangulos];

        for (int i = 0; i < triangulos.length; i++) {
            System.out.println("\nDigite los valores para el triángulo " + (i + 1) + ": ");
            System.out.print("Introduzca la base: ");
            base = entry.nextDouble();
            System.out.print("Introduzca el lado del triándulo: ");
            lado = entry.nextDouble();

            triangulos[i] = new Triangulo_Isosceles(base, lado);

            System.out.println("\n\tEl perímetro del triángulo es: " + triangulos[i].obtenerPerimetro());
            System.out.println("\tEl área del triangulo es: " + triangulos[i].obtenerArea());
        }
        System.out.println("\nEl área del triángulo de mayor superficie es: " + mayorArea(triangulos));
        entry.close();
    }
}
