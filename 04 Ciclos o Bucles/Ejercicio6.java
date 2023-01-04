import javax.swing.JOptionPane;

/* Ejercicio 6
    Pedir números hasta que se teclee un 0, 
    mostrar la suma de todos los números introducidos.
*/

public class Ejercicio6 {
    public static void main(String[] args) {
        float suma = 0, numero = 0;

        do {
            numero = Float.parseFloat(JOptionPane.showInputDialog("Digite un número: "));
            suma += numero;
        } while (numero != 0);

        JOptionPane.showMessageDialog(null, "La suma de los números introducidos es: " + suma);
    }
}