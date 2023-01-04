import javax.swing.JOptionPane;

/* Ejercicio 3
    Leer números hasta que se introduzca un 0.
    Para cada uno de llos indicar si es par o impar.
*/

public class Ejercicio3 {
    public static void main(String[] args) {
        int numeroUsuario;

        numeroUsuario = Integer.parseInt(JOptionPane.showInputDialog("\tPAR O IMPAR\n\n" + "Digite un número: "));

        while (numeroUsuario != 0) {
            if (numeroUsuario % 2 == 0) {
                JOptionPane.showMessageDialog(null, "El número " + numeroUsuario + " es par");
            } else {
                JOptionPane.showMessageDialog(null, "El número " + numeroUsuario + " es impar");
            }
            numeroUsuario = Integer.parseInt(JOptionPane.showInputDialog("\tPAR O IMPAR\n\n" + "Digite un número: "));
        }
    }
}