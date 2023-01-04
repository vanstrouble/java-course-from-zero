import javax.swing.JOptionPane;

/* Ejercicio 10
    Pedir 10 números y escribir la suma total.
*/

public class Ejercicio10 {
    public static void main(String[] args) {
        float numero, suma = 0;

        for (int i = 1; i <= 10; i++) {
            numero = Float.parseFloat(JOptionPane.showInputDialog("Digite 10 números\n\n" + "Ingrese el número (" + i + "): "));
            suma += numero;
        }
        JOptionPane.showMessageDialog(null, "La suma total es de: " + suma);
    }
}