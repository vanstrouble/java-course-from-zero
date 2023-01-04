import javax.swing.JOptionPane;

/* Ejercicio 15
    Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media, la cantidad de 
    alumnos mayores de 18 años y la cantidad de alumnos que miden más de 1.75.
*/

public class Ejercicio15 {
    public static void main(String[] args) {
        int edad, alumnosMayores = 0, alumnosAltos = 0;
        float altura, estaturaMedia = 0, mediaEdades = 0;

        for (int i = 1; i <= 5; i++) {
            edad = Integer.parseInt(JOptionPane.showInputDialog("Digite la edad (" + i + "): "));
            if (edad >= 18) {
                alumnosMayores++;
            }
            mediaEdades += edad;
        }
        for (int i = 1; i <= 5; i++) {
            altura = Float.parseFloat(JOptionPane.showInputDialog("Digite la altura (" + i + "): "));
            if (altura >= 1.75) {
                alumnosAltos++;
            }
            estaturaMedia += altura;
        }
        mediaEdades /= 5;
        estaturaMedia /= 5;
        JOptionPane.showMessageDialog(null, "La media de edad es: " + mediaEdades 
        + "\nLa estatura media es: " + estaturaMedia
        + "\nLos alumnos mayores de 18 años son: " + alumnosMayores
        + "\nLos alumnos que miden más de 1.75 son: " + alumnosAltos);
    }
}