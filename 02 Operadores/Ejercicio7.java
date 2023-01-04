import java.util.Scanner;

/* Ejercicio 7. Construir un programa que dado un número total de horas, devuelva el número de 
semanas, días y horas equivalentes. Por ejemplo, dado un total de 1000 horas debe mostrar 5 
semanas, 6 días y 16 horas. */

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int horasTotales, semanas, días, horas;

        System.out.println("\tNÚMERO DE HORAS\n");

        System.out.print("Digite el número de horas: ");
        horasTotales = entry.nextInt();

        semanas = horasTotales / 168;
        días = horasTotales % 168 / 24;   // horasTotales % 168 nos da el residuo que debemos usar
        horas = horasTotales % 24;

        System.out.println("\nEl equivalente es...");

        System.out.println(semanas + " semana(s), " + días + " día(s) y " + horas + " hora(s)");

        entry.close();
    }
}