import javax.swing.JOptionPane;

/* Ejercicio 4
    Pedir números hasta que se teclee uno negativo y mostrar cuántos números se han introducido.
 */

public class Ejercicio4 {

    public static void main(String[] args) {
        int i = 1, numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número positivo: "));

        while (numero >= 0) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
            i++;
        }

        JOptionPane.showMessageDialog(null, "Se han introducido " + (i - 1) + " números hasta que ocurrió la catástrofe");
    }
}