import java.util.Scanner;

/* Ejercicio 5. La calificación final de un estudiante de informática se calcula con base a las 
calificaciones de cuatro aspectos de su rendimiento académico: 
- participación
- primer examen parcial
- segundo examen parcial
- examen final
Sabiendo que las calificaciones anteriores entran a la. calificación final con ponderaciones del 
10%, 25%, 25%, y 40%, hacer un programa que calcule e imprima la calificación final obtenida por 
un estudiante. */

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        float participacion = 0, examen1, examen2, examen3, calFinal;
        boolean x;
        String nombre;

        System.out.println("\tCALCULADORA DE CALIFICACIONES\n");

        System.out.print("Digite el nombre del alumno: ");
        nombre = entry.nextLine();

        System.out.print("Digite la calificacion del PRIMER examen: ");
        examen1 = entry.nextFloat();
        System.out.print("Digite la calificación del SEGUNDO examen: ");
        examen2 = entry.nextFloat();
        System.out.print("Digite la calificaión del TERCER examen: ");
        examen3 = entry.nextFloat();
        System.out.print("\nParticipación (true/false): ");
        x = entry.nextBoolean();
        if (x == true) {
            participacion = 1;
        } else {
            participacion = 0;
        }

        calFinal = (float)((examen1 * 0.25) + (examen2 * 0.25) + (examen3 * 0.4) + participacion);

        System.out.println("\n\tDatos del alumno");
        System.out.println("Nombre: "+ nombre);
        System.out.println("La calificación final del alumno es: " + calFinal);
        
        entry.close();
    }
}