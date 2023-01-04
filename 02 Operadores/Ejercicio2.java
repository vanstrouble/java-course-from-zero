import java.util.Scanner;

/* Ejercicio 2. Hacer un programa que calcule e imprima el salario semanal de un empleado 
a partir de sus horas semanales trabajadas y de su salario por hora. */

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float horasSemanales, salarioHora, pago = 0;

        System.out.println("\tCalcule el salario del Godinez\n");

        System.out.print("Digite las horas semanales trabajadas: ");
        horasSemanales = entrada.nextFloat();
        System.out.print("Digite el salario x hora: ");
        salarioHora = entrada.nextFloat();

        pago = horasSemanales * salarioHora;

        System.out.println("\nUsted debe pagar: " + pago);

        System.out.println("\n\n\tPrograma para dueños de empresas gg");
    
        entrada.close();
    }
}