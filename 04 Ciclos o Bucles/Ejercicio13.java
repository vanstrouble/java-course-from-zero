import javax.swing.JOptionPane;

/* Ejercicio 13
    Pedir 10 números. Mostrar la media de los números positivos, la madia de los números 
    negativos y la cantidad de ceros.
*/

public class Ejercicio13 {
    public static void main(String[] args) {
        float numero, sumaPositivos = 0, contPositivos = 0, sumaNegativos = 0, contNegativos = 0, contCeros = 0, mediaPositivos, mediaNegativos;


        for (int i = 1; i <= 10; i++) {
            numero = Float.parseFloat(JOptionPane.showInputDialog("Digite un número: "));

            if (numero == 0) {
                contCeros++;
            } else if (numero > 0) {
                sumaPositivos += numero;
                contPositivos++;
            } else {
                sumaNegativos += numero;
                contNegativos++;
            }
        }

        if (contPositivos == 0) {
            JOptionPane.showMessageDialog(null, "No se puede sacar la media de los positivos");
        } else {
            mediaPositivos = sumaPositivos / contPositivos;
            JOptionPane.showMessageDialog(null, "La media de los números positivos es: " + mediaPositivos + "\nLa cantidad de ceros es: " + contCeros);
        }
        if (contNegativos == 0) {
            JOptionPane.showMessageDialog(null, "No se puede sacar la media de los negativos");
        } else {
            mediaNegativos = sumaNegativos / contNegativos;
            JOptionPane.showMessageDialog(null, "La media de los números negativos es: " + mediaNegativos + "\nLa cantidad de ceros es: " + contCeros);
        }
    }
}