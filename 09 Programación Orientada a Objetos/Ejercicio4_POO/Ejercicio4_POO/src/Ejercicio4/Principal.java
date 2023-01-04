package Ejercicio4;

import java.util.Scanner;

public class Principal {
    public static int indiceGanador(Atleta atletas[]) {
        float tiempoCarrera;
        int indice = 0;
        tiempoCarrera = atletas[indice].getTiempoCarrera();
        for (int i = 1; i < atletas.length; i++) {
            if (atletas[i].getTiempoCarrera() < tiempoCarrera) {
                tiempoCarrera = atletas[i].getTiempoCarrera();
                indice = i;
            }
        }
        return indice;
    }
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        String nombre;
        int numeroAtleta, nAtletas, indiceAtletaGanador;
        float tiempoCarrera;

        System.out.print("Digite el número de atletas a participar: ");
        nAtletas = entry.nextInt();

        // Creamos los objetos para cada atleta
        Atleta atletas[] = new Atleta[nAtletas];

        for (int i = 0; i < atletas.length; i++) {
            System.out.println("\nDigite los datos del atleta " + (i + 1));
            System.out.print("Introduzca el Número de atleta: ");
            numeroAtleta = entry.nextInt();
            entry.nextLine();   // Liberar el buffer
            System.out.print("Introduzca el Nombre del atleta: ");
            nombre = entry.nextLine();
            System.out.print("Introduzca el Tiempo de carrera: ");
            tiempoCarrera = entry.nextFloat();

            atletas[i] = new Atleta(numeroAtleta, nombre, tiempoCarrera);
        }
        entry.close();

        // Mostramos el atleta ganador
        indiceAtletaGanador = indiceGanador(atletas);
        System.out.println("\n\tEl atleta ganador es: ");
        System.out.println(atletas[indiceAtletaGanador].mostrarDatosGanador());
    }
}