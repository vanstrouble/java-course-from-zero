import javax.swing.JOptionPane;

/* Ejercicio 20
    Pedir un número N, introducir N sueldos y mostrar el sueldo máximo.
*/

public class Ejercicio20 {
    public static void main(String[] args) {
        int nSueldos, sueldo, max = 0;

        nSueldos = Integer.parseInt(JOptionPane.showInputDialog("SUELDO MÁXIMO\n" + "\n¿Cuántos sueldos quiere introducir? "));

        for (int i = 1; i <= nSueldos; i++) {
            sueldo = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad del sueldo (" + i + "): "));
            if (sueldo > max) {
                max = sueldo;
            }
        }
        JOptionPane.showMessageDialog(null, "El sueldo más alto es: " + max);
    }
}