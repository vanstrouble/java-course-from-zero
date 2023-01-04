import javax.swing.JOptionPane;

/* Ejercicio 12
    Pedir una nota de 0 a 10 y mopstrarla de forma: 
    insuficiente, Suficiente, Bien, Notable, Sobresaliente.
*/

public class Ejercicio12 {
    public static void main(String[] args) {
        float nota;

        nota = Float.parseFloat(JOptionPane.showInputDialog("Digite una nota (0 - 10): "));

        if (nota >= 0 && nota < 7){
            JOptionPane.showMessageDialog(null, "Insuficiente");
        } 
        else if (nota >= 7 && nota < 8){
            JOptionPane.showMessageDialog(null, "Bien");
        }
        else if (nota >= 8 && nota < 10){
            JOptionPane.showMessageDialog(null, "Notable");
        }
        else if (nota == 10){
            JOptionPane.showMessageDialog(null, "Sobresaliente");
        } else{
            JOptionPane.showMessageDialog(null, "Nota fuera de rango");
        }
    }
}