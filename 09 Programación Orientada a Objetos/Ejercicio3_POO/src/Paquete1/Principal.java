package Paquete1;

import java.util.Scanner;

public class Principal {
    public static int indiceCocheBarato(Vehiculo coches[]) {
        double precio;
        int indice = 0;

        precio = coches[0].getPrecio();
        for (int i = 1; i < coches.length; i++) {
            if (coches[i].getPrecio() < precio) {
                precio = coches[i].getPrecio();
                indice = i;
            }
        }
        return indice;
    }
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        String marca, modelo;
        double precio;
        int numeroVehiculos, indiceBarato;

        System.out.println("\tVEHÍCULOS BARATOS DOÑA BERE\n");
        System.out.print("Digite la cantidad de vehículos: ");
        numeroVehiculos = entry.nextInt();

        // Creamos los objetos para los coches
        Vehiculo coches[] = new Vehiculo[numeroVehiculos];

        for (int i = 0; i < coches.length; i++) {
            entry.nextLine(); // Liberar el buffer
            System.out.println("\nDigite las caracteristicas del coche " + (i + 1) + ": ");
            System.out.print("Introduzca Marca: ");
            marca = entry.nextLine();
            System.out.print("Introduzca Modelo: ");
            modelo = entry.nextLine();
            System.out.print("Introduzca Precio: ");
            precio = entry.nextDouble();

            coches[i] = new Vehiculo(marca, modelo, precio);
        }

        indiceBarato = indiceCocheBarato(coches);

        System.out.println("\nEl coche más barato es: ");
        System.out.println(coches[indiceBarato].mostrarDatos());
        entry.close();
    }
}
