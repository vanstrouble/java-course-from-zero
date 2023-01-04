import java.util.Scanner;

// Hacer un programa que calcule e imprima la suma de tres calificaciones.

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float cal1, cal2, cal3, suma = 0;

        // Pedimos y guardamos las 3 calificaciones
        System.out.println("Digite 3 calificaciones: ");
        cal1 = entrada.nextFloat();
        cal2 = entrada.nextFloat();
        cal3 = entrada.nextFloat();

        // Suma de las 3 calificaciones
        suma = cal1 + cal2 + cal3;

        System.out.println("\nLa suma es: " + suma);
        
        entrada.close();
    }
}