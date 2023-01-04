import javax.swing.JOptionPane;

/* Ejercicio 14
    Pedir 10 sueldos.
    Mostrar su suma y cuántos hay mayores de $1000
*/

public class Ejercicio14 {
    public static void main(String[] args) {
        float sueldo, suma = 0, mayores = 0;

        for (int i = 1; i <= 10; i++) {
            sueldo = Float.parseFloat(JOptionPane.showInputDialog("Digite el sueldo (" + i + "): "));
            if (sueldo >= 1000) {
                mayores++;
            }
            suma += sueldo;
        }
        JOptionPane.showMessageDialog(null, "La suma de los sueldos es: " + suma + "\nHay " + mayores + " sueldo(s) mayores de $1000");
    }
}