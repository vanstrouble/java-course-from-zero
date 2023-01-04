import javax.swing.JOptionPane;

/* Ejercicio 5
    Realizar un juego para adivinar un número. 
    Para ello generar un número aleatorio entre 0-100, y luego ir pidiendo números indicando "es mayor" o "es menor" 
    según sea mayor o mayor o menor con respecto a N. El proceso termina cuando el usuario acierta y mostrar el 
    número de intentos.
*/

public class Ejercicio5 {
    public static void main(String[] args) {
        int numero, Random;
        int intentos = 0;

        numero = Integer.parseInt(JOptionPane.showInputDialog("\tADIVINA EL NÚMERO\n\n" + "Digita un número: "));
        Random = (int)(Math.random() * 100);
        
        do {
            intentos ++;
            if (numero > Random) {
                JOptionPane.showMessageDialog(null, "Es menor");
            } else {
                JOptionPane.showMessageDialog(null, "Es mayor");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digita un número: "));
        } while (numero != Random);

        JOptionPane.showMessageDialog(null, "\tFelicidades, adivinaste el número" + "\n\nNúmero de intentos: " + intentos + "\nNúmero a encontrar: " + Random);
    }
}