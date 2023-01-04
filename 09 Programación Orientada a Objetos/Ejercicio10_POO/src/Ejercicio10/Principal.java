package Ejercicio10;

/*
    Ejercicio 10. crear un programa para simular un equipo de futbol (futbolista, entrenador y doctor),
    para lo cual tendremos lo siguiente:

    - Una superclase Persona que tendrá los siguientes datos: nombre, apellido, edad.
    - La subclase Futbolista que tendrá los siguientes datos: dorsal y posición.
    - La subclase Entrenador que tendrá de dato la estrategía que utiliza.
    - La subclase Doctor, la titulación y los años de experiencia.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    static ArrayList<Persona> persona = new ArrayList<Persona>();
    static Scanner entrada = new Scanner(System.in);

    static Persona futbolista1 = new Futbolista("Higuain", "Gonzalo", 29, 9, "Delantero");
    static Persona futbolista2 = new Futbolista("Paulo", "Dybala", 23, 21, "Delantero");
    static Persona entrenador = new Entrenador("Massimiliano", "Allegri", 49, "Defensiva");
    static Persona medico = new Medico("Alex", "Marroni", 50, "Lic. Fisoterapia", 20);

    public static void main(String[] args) {
        persona.add(futbolista1);
        persona.add(futbolista2);
        persona.add(entrenador);
        persona.add(medico);

        menu();
    }

    public static void menu() {
        byte opcion;

        do {
            System.out.println("\t.:MENU:.");
            System.out.println("1. Viaje de equipo");
            System.out.println("2. Entrenamiento");
            System.out.println("3. Partido de futbol");
            System.out.println("4. Planificar entrenamiento");
            System.out.println("5. Entrevista");
            System.out.println("6. Curar lesión");
            System.out.println("7. Salir");
            System.out.print("Opción: ");
            opcion = entrada.nextByte();

            switch (opcion) {
                case 1: // Viaje de equipo
                    System.out.println();
                    viajarEquipo();
                    break;
                case 2: // Entrenamiento
                    System.out.println();
                    entrenarEquipo();
                    break;
                case 3: // Partido de futbol
                    System.out.println();
                    partidoFutbol();
                    break;
                case 4: // Planificar entrenamiento
                    System.out.println();
                    planificarEntrenamiento();
                    break;
                case 5: // Entrevista
                    System.out.println();
                    darEntrevista();
                    break;
                case 6: // Curar lesión
                    System.out.println();
                    curarLesion();
                    break;
                case 7: // Salir
                    break;
                default:
                    System.out.println("Error. Digite una opción válida del menú");
                    break;
            }
            System.out.println();
        } while (opcion != 7);
    }

    public static void viajarEquipo() {
        for (Persona equipo : persona) {
            System.out.print(equipo.getNombre() + " " + equipo.getApellidos() + " -> ");
            equipo.viajar();
        }
    }

    public static void entrenarEquipo() {
        for (Persona equipo : persona) {
            System.out.print(equipo.getNombre() + " " + equipo.getApellidos() + " -> ");
            equipo.entrenamiento();
        }
    }

    public static void partidoFutbol() {
        for (Persona equipo : persona) {
            System.out.print(equipo.getNombre() + " " + equipo.getApellidos() + " -> ");
            equipo.partidoFutbol();
        }
    }

    public static void planificarEntrenamiento() {
        System.out.print(entrenador.getNombre() + " " + entrenador.getApellidos() + " -> ");
        ((Entrenador)entrenador).planificarEntrenamiento();
    }

    public static void darEntrevista() {
        System.out.print(futbolista1.getNombre() + " " + futbolista1.getApellidos() + " -> ");
        ((Futbolista)futbolista1).entrevista();
        System.out.print(futbolista2.getNombre() + " " + futbolista2.getApellidos() + " -> ");
        ((Futbolista)futbolista2).entrevista();
    }

    public static void curarLesion() {
        System.out.print(medico.getNombre() + " " + medico.getApellidos() + " -> ");
        ((Medico)medico).curarLesion();
    }
}
