import javax.swing.JOptionPane;

public class OperadorTernario {
    public static void main(String[] args) {
        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));

        JOptionPane.showMessageDialog(null, (numero % 2 == 0) ? "Es par" : "Es impar");
    }
}