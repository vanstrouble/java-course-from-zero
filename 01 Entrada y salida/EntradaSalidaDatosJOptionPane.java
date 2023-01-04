import javax.swing.JOptionPane;

public class EntradaSalidaDatosJOptionPane {
    public static void main(String[] args) {
        String cadena;
        int entero;
        char letra;
        double decimal;

        cadena = JOptionPane.showInputDialog("Digite una cadena: ");
        entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un entero: "));
        letra = JOptionPane.showInputDialog("Digite un caracter: ").charAt(0);
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite decimal: "));
        
        JOptionPane.showMessageDialog(null, "La cadena es: " + cadena);
        JOptionPane.showMessageDialog(null, "El número entero es: " + entero);
        JOptionPane.showMessageDialog(null, "La letra es: " + letra);
        JOptionPane.showMessageDialog(null, "El número decimal es: " + decimal);

    }
}


// De esta forma podemos usar ventanas para capturar los datos al igual que mostrarlos.