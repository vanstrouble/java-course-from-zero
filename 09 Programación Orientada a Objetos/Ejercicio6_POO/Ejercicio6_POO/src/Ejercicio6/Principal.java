package Ejercicio6;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a, b, c, d;
        /*
            numero1 = a + bi
            numero2 = c + di
        */
        NumeroComplejo numero1, numero2, suma, multi;
        int entero;
        byte opcion;

        do {
            System.out.println("\t--OPERACIONES CON NÚMEROS COMPLEJOS--\n");
            System.out.println("1. Sumar dos números complejos");
            System.out.println("2. Multiplicar dos números complejos");
            System.out.println("3. Comparar 2 números complejos (iguales o no)");
            System.out.println("4. Multiplicar un número complejo por un entero");
            System.out.println("5. Salir...");
            System.out.print("\nDigite la opción de menú: ");
            opcion = entrada.nextByte();

            switch (opcion) {
                case 1: System.out.println("\nDigite el primer número complejo");
                        System.out.print("Digite la parte real: ");
                        a = entrada.nextDouble();
                        System.out.print("Digite la parte imaginaria: ");
                        b = entrada.nextDouble();

                        System.out.println("\nDigite el segundo número complejo");
                        System.out.print("Digite la parte real: ");
                        c = entrada.nextDouble();
                        System.out.print("Digite la parte imaginaria: ");
                        d = entrada.nextDouble();

                        numero1 = new NumeroComplejo(a, b);
                        numero2 = new NumeroComplejo(c, d);

                        suma = numero1.calcularSuma(numero2);

                        System.out.println("\nLa suma es: " + suma.getA() + " + " + suma.getB() + "i");
                    break;
                case 2: System.out.println("\nDigite el primer número complejo");
                        System.out.print("Digite la parte real: ");
                        a = entrada.nextDouble();
                        System.out.print("Digite la parte imaginaria: ");
                        b = entrada.nextDouble();

                        System.out.println("\nDigite el segundo número complejo");
                        System.out.print("Digite la parte real: ");
                        c = entrada.nextDouble();
                        System.out.print("Digite la parte imaginaria: ");
                        d = entrada.nextDouble();

                        numero1 = new NumeroComplejo(a, b);
                        numero2 = new NumeroComplejo(c, d);

                        multi = numero1.calcularProducto(numero2);
                        System.out.println("\nLa multiplicación es: " + multi.getA() + " + " + multi.getB() + "i");
                    break;
                case 3: System.out.println("\nDigite el primer número complejo");
                        System.out.print("Digite la parte real: ");
                        a = entrada.nextDouble();
                        System.out.print("Digite la parte imaginaria: ");
                        b = entrada.nextDouble();

                        System.out.println("\nDigite el segundo número complejo");
                        System.out.print("Digite la parte real: ");
                        c = entrada.nextDouble();
                        System.out.print("Digite la parte imaginaria: ");
                        d = entrada.nextDouble();

                        numero1 = new NumeroComplejo(a, b);
                        numero2 = new NumeroComplejo(c, d);

                        if (numero1.comprobarIgualdad(numero2)) {
                            System.out.println("\nLos números complejos SON IGUALES");
                        } else {
                            System.out.println("\nLos números complejos NO SON IGUALES");
                        }
                    break;
                case 4: System.out.println("\nDigite el número complejo");
                        System.out.print("Digite la parte real: ");
                        a = entrada.nextDouble();
                        System.out.print("Digite la parte imaginaria: ");
                        b = entrada.nextDouble();
                        System.out.print("Ahora digite el número entero: ");
                        entero = entrada.nextInt();

                        numero1 = new NumeroComplejo(a, b);

                        multi = numero1.multiplicarPorEntero(entero);
                        System.out.println("\nLa multiplicación es: " + multi.getA() + " + " + multi.getB() + "i");
                    break;
                case 5: System.out.println("\n\n\tGracias por usar mi calculadora :')");
                default: System.out.println("\n\tDedicado a Aideé Berenice Correa Villegas");
                    break;
            }
            System.out.println();
        } while (opcion != 5);
        entrada.close();
    }
}
