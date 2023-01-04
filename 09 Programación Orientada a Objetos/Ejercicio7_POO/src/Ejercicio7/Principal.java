package Ejercicio7;

/*
    Ejercicio 7. Hacer un programa sencillo para realizar operaciones en un banco para lo cual tendremos 2 clases
    (Cliente y Cuenta). Considerar que un cliente se caracteriza por su nombre, apellido y DNI. El cliente puede
    consultar saldo, así como ingresar y retirar dinero de sus cuentas. Además cada cuenta se caracteriza por un
    número de cuenta y un saldo.
 */

import java.util.Scanner;

public class Principal {
    public static int buscarNumeroCuenta(Cuenta cuentas[], int n) {
        int i = 0, indice = 0;
        boolean encontrado = false;

        // Búsqueda Secuencial
        while ((i < cuentas.length) && (encontrado == false)) {
            if (cuentas[i].getNumeroCuenta() == n) {
                encontrado = true;
                indice = i;
            }
            i++;
        }

        if (encontrado == false) {
            indice = -1;
        }

        return indice;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre, apellidos, dni;
        int numeroCuenta, nCuentas, opcion, indiceCuenta;
        double saldo, cantidad;
        Cuenta cuentas[];
        Cliente cliente;

        System.out.println("\tBANCOPPEL\n");

        System.out.print("Digite el nombre del cliente: ");
        nombre = entrada.nextLine();
        System.out.print("Digite los apellidos del cliente: ");
        apellidos = entrada.nextLine();
        System.out.print("Digite el DNI del cliente: ");
        dni = entrada.nextLine();
        System.out.printf("Digite la cantidad de cuentas que tiene: ");
        nCuentas = entrada.nextInt();

        cuentas = new Cuenta[nCuentas];

        for (int i = 0; i < cuentas.length; i++) {
            System.out.println("\nDigite los datos de la cuenta " + (i + 1) + ": ");
            System.out.print("Digite el número de cuenta: ");
            numeroCuenta = entrada.nextInt();
            System.out.print("Digite el saldo de la cuenta: ");
            saldo = entrada.nextDouble();

            cuentas[i] = new Cuenta(numeroCuenta, saldo);
        }

        cliente = new Cliente(nombre, apellidos, dni, cuentas);

        System.out.println();

        do {
            System.out.println("\t----MENÚ----");
            System.out.println("1. Ingresar dinero en la cuenta");
            System.out.println("2. Retirar dinero de la cuenta");
            System.out.println("3. Consultar saldo de la cuenta");
            System.out.println("4. Salir");
            System.out.print("\tDigite la opción de menú: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("\nDigite el número de cuenta: ");
                    numeroCuenta = entrada.nextInt();
                    indiceCuenta = buscarNumeroCuenta(cuentas, numeroCuenta);

                    if (indiceCuenta == -1) {
                        System.out.println("\nEl número de cuenta ingresado no existe");
                    } else {
                        System.out.print("\nDigite la cantidad de dinero a ingresar: ");
                        cantidad = entrada.nextDouble();

                        cliente.ingresar_dinero(indiceCuenta, cantidad);
                        System.out.println("\nIngreso realizado correctamente");
                        System.out.println("Saldo disponible: " + cliente.consultar_saldo(indiceCuenta));
                    }
                    break;
                case 2:
                    System.out.print("\nDigite el número de cuenta: ");
                    numeroCuenta = entrada.nextInt();
                    indiceCuenta = buscarNumeroCuenta(cuentas, numeroCuenta);

                    if (indiceCuenta == -1) {
                        System.out.println("\nEl número de cuenta ingresado no existe");
                    } else {
                        System.out.print("\nDigite la cantidad de dinero a retirar: ");
                        cantidad = entrada.nextDouble();

                        if (cantidad > cliente.consultar_saldo(indiceCuenta)) {
                            System.out.println("\nSaldo insuficiente");
                        } else {
                            cliente.retirar_dinero(indiceCuenta, cantidad);
                            System.out.println("\nRetiro realizado correctamente");
                            System.out.println("Saldo disponible: " + cliente.consultar_saldo(indiceCuenta));
                        }
                    }
                    break;
                case 3:
                    System.out.print("\nDigite el número de cuenta: ");
                    numeroCuenta = entrada.nextInt();
                    indiceCuenta = buscarNumeroCuenta(cuentas, numeroCuenta);

                    if (indiceCuenta == -1) {
                        System.out.println("\nEl número de cuenta ingresado no existe");
                    } else {
                        System.out.println("Saldo disponible: " + cliente.consultar_saldo(indiceCuenta));
                    }
                    break;
                case 4:
                    System.out.println("\t\nGracias por visitarnos");
                    break;
                default:
                    System.out.println("ERROR. Digite una opción válida");
            }
            System.out.println("");
        } while (opcion != 4);
        entrada.close();
    }
}
