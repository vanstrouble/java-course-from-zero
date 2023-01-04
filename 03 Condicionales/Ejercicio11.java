import javax.swing.JOptionPane;

/* Ejercicio 11
    Consrtruir un programa que simule el funcionamiento de una calculadora que puede realizar las cuatro operaciones 
    aritméticas básicas (suma, resta, división y multiplicación) con los valores numéricos enteros. El usuario debe 
    especificar la operación con el primer caracter del primer parametro de la línea de comandos: 
    S o s para suma,
    R o r para resta,
    M o m para multiplicación y
    D o d para división.
*/

public class Ejercicio11 {
    public static void main(String[] args) {
        float numero1, numero2, resultado;
        char operacion;

        numero1 = Float.parseFloat(JOptionPane.showInputDialog("CALCULADORA BÁSICA\n" + "\nDigite el primer valor: "));
        numero2 = Float.parseFloat(JOptionPane.showInputDialog("CALCULADORA BÁSICA\n" + "\nDigite el segundo valor: "));
        operacion = JOptionPane.showInputDialog("\nCALCULADORA BÁSICA\n" + "Suma = 'S' o 's'" + "\nResta = 'R' o 'r'" + "\nMultiplicación = 'M' o 'm'" + "\nDivisión = 'D' o 'd'" + "\n\nDigite la operación de desea: ").charAt(0);

        if (operacion == 'S' || operacion == 's'){
            resultado = numero1 + numero2;
            JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + resultado);
        } 
        else if (operacion == 'R' || operacion == 'r'){
            resultado = numero1 - numero2;
            JOptionPane.showMessageDialog(null, "El resultado de la resta es: " + resultado);
        }
        else if (operacion == 'M' || operacion == 'm'){
            resultado = numero1 * numero2;
            JOptionPane.showMessageDialog(null, "El resultado de la multiplicación es: " + resultado);
        }
        else if (operacion == 'D' || operacion == 'd'){
            resultado = numero1 / numero2;
            JOptionPane.showMessageDialog(null, "El resultado de la división es: " + resultado);
        } else {
            JOptionPane.showMessageDialog(null, "Operación no válida");
        }
    }
}