import javax.swing.JOptionPane;

/* Ejercicio 7.
 * Pedir tres números y mostrarlos ordenados de mayor a menor.
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        
        int numero1, numero2, numero3;

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el número 1: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el número 2: "));
        numero3 = Integer.parseInt(JOptionPane.showInputDialog("Digite el número 3: "));

        if (numero1 > numero2 && numero1 > numero3){
            if (numero2 > numero3){
                JOptionPane.showMessageDialog(null, "Primero: " + numero1 + ", Segundo: " + numero2 + ", Tercero: " + numero3);
            } else{
                JOptionPane.showMessageDialog(null, "Primero" + numero1 + "Segundo: " + numero3 + "Tercero: " + numero2);
            }
        }
        if (numero2 > numero1 && numero2 > numero3){
            if (numero1 > numero3){
                JOptionPane.showMessageDialog(null, "Primero: " + numero2 + ", Segundo: " + numero1 + ", Tercero: " + numero3);
            } else {
                JOptionPane.showMessageDialog(null, "Primero: " + numero2 + ", Segundo: " + numero3 + ", Tercero: "+ numero1);
            }
        }
        if (numero3 > numero1 && numero3 > numero2){
            if (numero1 > numero2){
                JOptionPane.showMessageDialog(null, "Primero: " + numero3 + ", Segundo: " + numero1 + ", Tercero: " + numero2);
            } else {
                JOptionPane.showMessageDialog(null, "Primero: " +  numero3 + ", Segundo: " +  numero2 + ", Tercero: " + numero1);
            }
        }
    }
}