package Ejercicio8;

/*
    Ejercicio 8. Una empresa de envío de paquetes tiene varias sucursales en todo el país. Cada sucursal está definida
    por su número de sucursal, dirección, y ciudad. Para calcular el precio que cuesta enviar cada paquete, las
    sucursales tienen en cuenta el precio del paquete y la prioridad, sabiendo que se cobra un dólar por kilo, 10
    dólares más si la prioridad es alta y 20 si es express. Cada paquete enviado tendrá un número de referencia y el
    DNI de la persona que lo envía.
 */

import java.util.Scanner;

public class Principal {

    public static int buscarSucursal(Sucursal t[], int numeroSucursal, int contadorSucursal) {
        int indice = 0;
        boolean encontrado = false;

        for (int i = 0; i < contadorSucursal; i++) {
            if (t[i].getNumeroSucursal() == numeroSucursal) {
                encontrado = true;
                indice = i;
            }
        }
        if (encontrado == false) {
            indice = -1;
        }
        return indice;
    }

    public static int buscarPaquete(Paquete t[], int numeroPaquete, int contadorPaquete) {
        int indice = 0;
        boolean encontrado = false;

        for (int i = 0; i < contadorPaquete; i++) {
            if (t[i].getNumeroPaquete() == numeroPaquete) {
                encontrado = true;
                indice = i;
            }
        }
        if (encontrado == false) {
            indice = -1;
        }
        return indice;
    }

    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        // Variables y paquetes necesarias
        int numeroSucursal, numeroPaquete, prioridad, opcion, contadorSucursal = 0, contadorPaquete = 0, indiceSucursal, indicePaquete;
        String direccion, ciudad, dni;
        double peso, precioPaquete;
        Sucursal sucursal[] = new Sucursal[50];
        Paquete paquete[] = new Paquete[100];

        System.out.println("\tGESTIÓN DE SUCURSALES Y ENVÍO DE PAQUETES\n");

        do {
            System.out.println("\t----MENÚ----");
            System.out.println("1. Crear una nueva sucursal");
            System.out.println("2. Enviar paquete");
            System.out.println("3. Consultar sucursal");
            System.out.println("4. Consultar paquete");
            System.out.println("5. Mostrar todas las sucursales");
            System.out.println("6. Mostrar todos los paquetes");
            System.out.println("7. Salir");
            System.out.print("\tDigite la opción: ");
            opcion = entry.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("\nDigite el número de sucursal: ");
                    numeroSucursal = entry.nextInt();

                    indiceSucursal = buscarSucursal(sucursal, numeroSucursal, contadorSucursal);
                    if (indiceSucursal >= 0) {
                        System.out.println("La sucursal ya existe");
                    } else {
                        entry.nextLine();   // Limpiar buffer
                        System.out.print("Digite la dirección de la sucursal: ");
                        direccion = entry.nextLine();
                        System.out.print("Digite la ciudad de la sucursal: ");
                        ciudad = entry.nextLine();

                        sucursal[contadorSucursal] = new Sucursal(numeroSucursal, direccion, ciudad);
                        contadorSucursal++;
                    }
                    break;
                case 2:
                    System.out.print("\nDigite el número de sucursal: ");
                    numeroSucursal = entry.nextInt();

                    indiceSucursal = buscarSucursal(sucursal, numeroSucursal, contadorSucursal);

                    entry.nextLine();   // Limpiar buffer

                    if (indiceSucursal == -1) {
                        System.out.println("La sucursal no existe");
                    } else {
                        System.out.print("\nDigite el número del paquete: ");
                        numeroPaquete = entry.nextInt();
                        System.out.print("Digite el DNI de la persona que envía: ");
                        dni = entry.nextLine();

                        entry.nextLine();   // Limpiar buffer

                        System.out.print("Digite el peso del paquete: ");
                        peso = entry.nextDouble();
                        System.out.print("Digite la prioridad (0 = normal, 1 = alta, 2 = express): ");
                        prioridad = entry.nextInt();

                        paquete[contadorPaquete] = new Paquete(numeroPaquete, dni, peso, prioridad);

                        precioPaquete = sucursal[indiceSucursal].calcularPrecio(paquete[contadorPaquete]);

                        System.out.println("\nEl precio del paquete es: " + precioPaquete);

                        contadorPaquete++;
                    }
                    break;
                case 3:
                    System.out.print("\nDigite el número de sucursal: ");
                    numeroSucursal = entry.nextInt();

                    indiceSucursal = buscarSucursal(sucursal, numeroSucursal, contadorSucursal);

                    if (indiceSucursal == -1) {
                        System.out.println("La sucursal no existe");
                    } else {
                        System.out.println("\nLos datos de la sucursal son…");
                        System.out.println(sucursal[indiceSucursal].mostrarDatosSucursal());
                    }
                    break;
                case 4:
                    System.out.print("\nDigite el número del paquete: ");
                    numeroPaquete = entry.nextInt();

                    indicePaquete = buscarPaquete(paquete, numeroPaquete, contadorPaquete);
                    if (indicePaquete == -1) {
                        System.out.println("El paquete no existe");
                    } else {
                        System.out.println("\nLos datos del paquete son…");
                        System.out.println(paquete[indicePaquete].mostrarDatosPaquete());
                    }
                    break;
                case 5:
                    for (int i = 0; i < contadorSucursal; i++) {
                        System.out.println("\nLos datos de la sucursal Nª" + (i + 1) + ": ");
                        System.out.println(sucursal[i].mostrarDatosSucursal());
                    }
                    break;
                case 6:
                    for (int i = 0; i < contadorPaquete; i++) {
                        System.out.println("\nLos datos del paquete Nª" + (i + 1) + ": ");
                        System.out.println(paquete[i].mostrarDatosPaquete());
                    }
                    break;
                case 7:
                    System.out.println("\n\tGRACIAS POR USAR MI PROGRAMA :')");
                    break;
                default:
                    System.out.println("Error. Digite una opción válida");
            }
            System.out.println();
        } while (opcion != 7);
        entry.close();
    }
}
