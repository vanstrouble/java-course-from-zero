import javax.swing.JOptionPane;

/* Ejercicio13
    Hacer un programa que simule un cajero automático con un saldo inicial de 1000 dólares, 
    con el siguiente menú de opciones:
    1. Ingresar dinero.
    2. Retirar dinero.
    3. Salir.
 */

public class Ejercicio13 {
    public static void main(String[] args) {
        float saldo = 1000f, ingreso, retiro;
        int opc;

        do {
            opc = Integer.parseInt(JOptionPane.showInputDialog("Cajero automático\n" + "\nOpciones:\n" + "\n1. Consultar su saldo" + "\n2. Ingresar dinero" + "\n3. Retirar dinero" + "\n4. Salir\n\n" + "Digite la opción que necesite: "));

            if (opc >= 1 && opc <= 4){
                switch (opc) {
                    case 1: JOptionPane.showMessageDialog(null, "Su saldo actual es: " + saldo);
                        break;
                    case 2: ingreso = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad a ingresar: "));
                            saldo += ingreso;
                            JOptionPane.showMessageDialog(null, "El saldo ahora es: " + saldo);
                        break;
                    case 3: retiro = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad a retirar: "));
                            if (retiro > saldo){
                                JOptionPane.showMessageDialog(null, "No tiene el suficiente saldo para realizar la operación");
                            } else {
                                saldo -= retiro;
                                JOptionPane.showMessageDialog(null, "El saldo ahora es: " + saldo);
                            }
                        break;
                    
                    default: JOptionPane.showMessageDialog(null, "Gracias por visitar SuCajero");
                        break;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Opción fuera de rango" + "\nIngrese una opción válida");
            }
            
        } while (opc != 4);
    }
}