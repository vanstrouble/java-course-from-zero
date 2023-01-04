import javax.swing.JOptionPane;

/* Ejercicio 8
    Pedir un número N, y mostrar todos los números del 1 al N.
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));

        if (numero > 1) {
            for (int i = numero; i >= 1; i--) {
                JOptionPane.showMessageDialog(null, i);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Digite un número mayor a 1");
        }
    }
}