import javax.swing.JOptionPane;

/* Ejercicio 3. Programa que lea un caracter por teclado y compruebe si es una letra mayúscula. */

public class Ejercicio3 {
    public static void main(String[] args) {
        char letra;

        letra = JOptionPane.showInputDialog("Digite una letra: ").charAt(0);

        if (letra >= 65 && letra <= 90){
            JOptionPane.showMessageDialog(null, "La letra es mayúscula");
        } else if (letra >= 97 && letra <= 122){
            JOptionPane.showMessageDialog(null, "La letra es minúscula");
        } else {
            JOptionPane.showMessageDialog(null, "No es una letra");
        }
    }
}