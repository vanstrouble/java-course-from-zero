import javax.swing.JOptionPane;

/* Ejercicio 9
    Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. 
    Suponiendo que todos los meses tienen 30 días.
*/

public class Ejercicio9 {
    public static void main(String[] args) {
        int dia, mes, año;

        dia = Integer.parseInt(JOptionPane.showInputDialog("Digite el día: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Digite el mes: "));
        año = Integer.parseInt(JOptionPane.showInputDialog("Digite el año: "));

        if ((dia >= 1) && (dia <=30)){
            if (mes > 1 && mes <= 12){
                if (año != 0){
                    JOptionPane.showMessageDialog(null, "FECHA CORRECTA");
                } else {
                    JOptionPane.showMessageDialog(null, "La fecha es incorrecta, año incorrecto");
                }
            } else{
                JOptionPane.showMessageDialog(null, "La fecha es incorrecta, mes incorrecto");
            }
        } else{
            JOptionPane.showMessageDialog(null, "La fecha es incorrecta, día incorrecto");
        }
    }
}