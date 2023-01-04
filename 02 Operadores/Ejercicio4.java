import java.util.Scanner;

/* Ejercicio 4. Una compañía de venta de autos usados, paga a su personal de ventas un salario 
de $1000 mensuales más una comisión de $150 por cada carro vendido, más el 5% del valor de la 
venta por el carro. Cada mes el capturista de la empresa ingresa en la computadora los datos 
pertinentes. Hacer un programa que calcule e imprima el salario mensual de un vendedor. */

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        final float salarioMensual = 1000f;
        final float comision = 150f;
        float comisionCinco = 0;
        float salarioTotal = salarioMensual;
        int autosVendidos;
        float valorAuto = 0;
        String nombre;

        System.out.println("\tCalcule el salario mensual de su trabajador\n");

        System.out.print("Digite el nombre del trabajador: ");
        nombre = entry.nextLine();
        System.out.print("Digite el número de autos vendidos: ");
        autosVendidos = entry.nextInt();
        for (int i = 1; i <= autosVendidos; i++){
            System.out.print("Digite el precio del auto " + i + ": ");
            valorAuto = entry.nextFloat();
            comisionCinco = (float)((valorAuto * 0.05));
            valorAuto += valorAuto;
        }

        salarioTotal = salarioMensual + (autosVendidos * comision) +  comisionCinco;

        System.out.println("\n\tDatos salario empleado");
        System.out.println("Nombre: " + nombre);
        System.out.println("Autos vendidos: " + autosVendidos);
        System.out.println("Salario Total: $" + salarioTotal);
    
        entry.close();
    }
}