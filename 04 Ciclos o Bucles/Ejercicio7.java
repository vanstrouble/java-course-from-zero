import javax.swing.JOptionPane;

/* Ejercicio 7
    Pedir números hasta que se introduzca uno negativo 
    y calcular la media.
*/

public class Ejercicio7 {
    public static void main(String[] args) {
        float numero = 0, media = 0;
        int elementos = 0;

        // En este caso, el 0 afecta a la operación.
        do {
            numero = Float.parseFloat(JOptionPane.showInputDialog("Digite un número: "));
            if (numero >= 0) {
                media += numero;
                elementos++;
            }
        } while (numero >= 0);

        media /= elementos;

        JOptionPane.showMessageDialog(null, "La media es: " + media);
        
    }
}