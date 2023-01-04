import javax.swing.JOptionPane;

/* Ejercicio 4. En MegaPlaza se hace un 20% de descuento a los clientes cuya compra supere los $300.
¿Cuál será la cantidad que pagará una persona por su compra? */

public class Ejercicio4 {
    public static void main(String[] args) {
        float compra, compraDescuento;

        compra = Float.parseFloat(JOptionPane.showInputDialog("Digite la compra: "));

        if (compra >= 300){
            compraDescuento = compra * 0.80f;
            JOptionPane.showMessageDialog(null, "Aplica descuento de 20%\n" + "Cantidad a pagar: " + compraDescuento);
        } else {
            JOptionPane.showMessageDialog(null, "No aplica descuento\n" + "Cantidad a pagar: " + compra);
        }
    }
}