import javax.swing.JOptionPane;

/* 
 * Búsqueda Binaria 
*/

public class BusquedaBinaria {
    public static void main(String[] args) {
        int arreglo[] = {1, 2, 3, 4, 5};
        int dato, inferior, superior, mitad, i;
        boolean band = false;

        dato = Integer.parseInt(JOptionPane.showInputDialog("Digite el número a buscar: "));

        // Búsqueda Binaria
        inferior = 0;
        superior = 5;
        i = 0;

        mitad = (inferior + superior) / 2;
        while (i <= superior && i < 5) {
            if (arreglo[mitad] == dato) {
                band = true;
                break;
            } else if (arreglo[mitad] > dato) {
                superior = mitad;
                mitad = (inferior + superior) / 2;
            } else if (arreglo[mitad] < dato) {
                inferior = mitad;
                mitad = (inferior + superior) / 2;
            }
            i++;
        }

        if (band == true) {
            JOptionPane.showMessageDialog(null, "El número ha sido encontrado en la posición " + mitad);
        } else {
            JOptionPane.showMessageDialog(null, "El número no está dentro del arreglo");
        }
    }
}