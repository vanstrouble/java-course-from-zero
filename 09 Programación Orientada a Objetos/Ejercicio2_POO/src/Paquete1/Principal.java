package Paquete1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        Tablero t1;
        int x, y, opcion, incremento = 0;

        System.out.println("\tMOVER UN OBJETO EN UN TABLERO\n");

        System.out.print("Digite la coordenada inicial de X: ");
        x = entry.nextInt();
        System.out.print("Digite la coordenada inicial de y: ");
        y = entry.nextInt();

        // Posición inicial del objeto
        t1 = new Tablero(x, y);

        do {
            System.out.println("\n\t.:MENÚ:.");
            System.out.println("1. Mover hacia ARRIBA");
            System.out.println("2. Mover hacia ABAJO");
            System.out.println("3. Mover hacia DERECHA");
            System.out.println("4. Mover hacia IZQUIERA");
            System.out.println("5. Salir");
            System.out.print("Digite la opción: ");
            opcion = entry.nextInt();

            if (opcion != 5) {
                System.out.print("\nDigite la cantidad de espacios a moverse: ");
                incremento = entry.nextInt();
            }

            switch (opcion) {
                case 1: t1.moverArriba(incremento); break;
                case 2: t1.moverAbajo(incremento); break;
                case 3: t1.moverDerecha(incremento); break;
                case 4: t1.moverIzquierda(incremento); break;
                case 5: break;
                default: System.out.println("Error. Se equivocó de opción de menú");
            }

            System.out.println("\nPosición actual (X/Y): (" + t1.getX() + ", " + t1.getY() + ")");
        } while (opcion != 5);
        entry.close();
    }
}
