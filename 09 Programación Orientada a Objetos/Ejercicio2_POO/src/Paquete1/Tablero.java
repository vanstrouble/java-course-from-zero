/* Ejercicio 2
    Construir un programa que permita dirigir el movimiento de un objeto dentro de un tablero y actualice su posición
    dentro del mismo. Los movimientos posibles son arriba, abajo, izquierda y derecha. Tras cada movimiento el programa
    mostrará la nueva dirección elegida y las coordenadas de situación del objeto dentro del tablero.
 */

package Paquete1;

public class Tablero {
    private int x;
    private int y;

    // Constructor
    public Tablero(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Métodos

    // Método Mover Arriba
    public void moverArriba(int incremento) {
        y += incremento;
    }
    // Método Mover Abajo
    public void moverAbajo(int incremento) {
        y -= incremento;
    }

    // Método Mover Derecha
    public void moverDerecha(int incremento) {
        x += incremento;
    }
    // Método Mover Izquierda
    public void moverIzquierda(int incremento) {
        x -= incremento;
    }

    // Obtener los valores actuales
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
