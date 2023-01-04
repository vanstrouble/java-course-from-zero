import javax.swing.JOptionPane;

/* Ejercicio 21
    Pedir 10 números, y mostrar al final si se ha introducido algún negativo.
*/

public class Ejercicio21 {
    public static void main(String[] args) {
        int numero, negativo = 0;
        
        for (int i = 1; i <= 10; i++) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese 10 números\n\n" + "Digite el número (" + i + "): "));
            if (numero < 0) {
                negativo++;
            }
        }
        JOptionPane.showMessageDialog(null, "Se han introducido " + negativo + " números negativos");
    }
}