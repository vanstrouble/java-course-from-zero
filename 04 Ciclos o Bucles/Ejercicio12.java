import javax.swing.JOptionPane;

/* Ejercicio 12
    Pedir un número y calcular su factorial.
*/

public class Ejercicio12 {
    public static void main(String[] args) {
        int numero;
        long factorial = 1;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));

        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        JOptionPane.showMessageDialog(null, "El factorial de " + numero + " es " + factorial);
    }
}