import javax.swing.JOptionPane;

/* Ejercicio 22
    Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso.
*/

public class Ejercicio22 {
    public static void main(String[] args) {
        float calificaciones = 0;
        byte reprobaron = 0;

        for (int i = 1; i <= 5; i++) {
            do {
                calificaciones = Integer.parseInt(JOptionPane.showInputDialog("Digite la calificación (" + i + "): "));
            } while (calificaciones < 0 || calificaciones > 10);
            if (calificaciones < 7) {
                reprobaron++;
            } 
        }
        if (reprobaron > 0) {
            JOptionPane.showMessageDialog(null, reprobaron + " alumnos reprobaron");
        } else {
            JOptionPane.showMessageDialog(null, "Ningún alumno reprobó");
        }
    }
}