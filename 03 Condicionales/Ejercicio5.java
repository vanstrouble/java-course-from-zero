import javax.swing.JOptionPane;

/* Ejercicio 5.
Un obrero necesita calcular su salario, el cual se obtiene de la siguiente manera:
- Si trabaja 40 horas o menos se le paga $16 por hora.
- Si trabaja más de 40 horas se le paga $16 por cada una de las primeras 40 horas y $20 por cada hora extra.
*/

public class Ejercicio5 {
    public static void main(String[] args) {
        final float pagoHora = 16f;
        final float horaExtra = 20f;
        float horasTrabajadas, salarioSemanal = 0;
        
        horasTrabajadas = Float.parseFloat(JOptionPane.showInputDialog("CALCULADORA DE HORAS TRABAJADAS\n" + "\nDigite el total de horas: "));

        if (horasTrabajadas <= 40){
            salarioSemanal = horasTrabajadas * pagoHora;
            JOptionPane.showMessageDialog(null, "Salario semanal: " + salarioSemanal);
        } else {
            salarioSemanal = (40 * pagoHora) + ((horasTrabajadas - 40) * horaExtra);
            JOptionPane.showMessageDialog(null, "Se trabajaron horas extra\n" + "Salario semanal: " + salarioSemanal);
        }
    }
}