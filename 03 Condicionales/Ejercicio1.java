import javax.swing.JOptionPane;

/* Ejercicio 1. Hacer u programa que lea un úmero etero y muestre si el número es múltiplo de 10. */

public class Ejercicio1 {
    public static void main(String[] args) {
        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));

        if (numero % 10 == 0) {
            JOptionPane.showMessageDialog(null, "El numero " + numero + " es múltiplo de 10");
        } else {
            JOptionPane.showMessageDialog(null, "El número " + numero + " no es multiplo de 10");
        }
    }
}