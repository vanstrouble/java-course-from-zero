import javax.swing.JOptionPane;

/* Ejercicio 2
    Leer un número e indicar si es positivo o negativo. 
    El proceso se repetirá hasta que se introduzca un 0.
*/

public class Ejercicio2 {
    public static void main(String[] args) {
        int numeroUsuario;

        numeroUsuario = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));

        while (numeroUsuario != 0) {
            if (numeroUsuario > 0) {
                JOptionPane.showMessageDialog(null, "El número es positivo");
            } else {
                JOptionPane.showMessageDialog(null, "El número es negativo");
            }
            numeroUsuario = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        }
    }
}