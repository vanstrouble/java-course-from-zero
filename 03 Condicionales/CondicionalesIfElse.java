import javax.swing.JOptionPane;

public class CondicionalesIfElse {
    public static void main(String[] args) {
        int numero, dato = 5;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite el número: "));

        if (numero <= dato){
            JOptionPane.showMessageDialog(null, "El número es 5 o menor");
        } else {
            JOptionPane.showMessageDialog(null, "EL número es mayor a 5");
        }
    }
}