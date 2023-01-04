import javax.swing.JOptionPane;

/* Ejercicio 2. Pedir dos números y decir cual es el mayor o si son iguales. */

public class Ejercicio2 {
    public static void main(String[] args) {
       int n1, n2;
       
       n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer valor: "));
       n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo valor: "));

       if (n1 > n2) {
           JOptionPane.showMessageDialog(null, "El número " + n1 + " es mayor que " + n2);
       } else if (n1 == n2) {
            JOptionPane.showMessageDialog(null, "Los números son iguales");
       } else {
            JOptionPane.showMessageDialog(null, "El número " + n2 + " es mayor que " + n1);
       }
    }
}