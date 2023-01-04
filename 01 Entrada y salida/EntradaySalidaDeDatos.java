import java.util.Scanner;

public class EntradaySalidaDeDatos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        float numeroFloat;
        double numeroDouble;
        String cadena;
        String cadenaLarga;
        char letra;

                // Entrada de números
        // Entero
        System.out.print("Digite un número: ");
        numero = entrada.nextInt();

        // Float / Flotante
        System.out.print("Digite un número tipo flotante: ");
        numeroFloat = entrada.nextFloat();

        // Double
        System.out.print("Digite un número double: ");
        numeroDouble = entrada.nextDouble();

        // limpiar el buffer
        entrada.nextLine();

                // Entrada de cadenas
        // String / Cadena de texto
        System.out.print("Digite una cadena: ");
        cadena = entrada.next();    // Solo captura hasta donde encuentre un espacio

        // String / Cadena de texto larga
        System.out.print("Digite su nombre y apellidos: ");
        cadenaLarga = entrada.nextLine();   // Puede almacenar más allá del espacio

        // String / Caracter
        System.out.print("Digite una letra: ");
        letra = entrada.next().charAt(0);   // Captura la letra el índice que se seleccione




        // Impresiones en pantalla / números
        System.out.println("\nEl número entero es: " + numero);
        System.out.println("El número flotante es: " + numeroFloat);
        System.out.println("El número double es: " + numeroDouble);

        // Impresión en pantalla / strings
        System.out.println("La palabra es: " + cadena);
        System.out.println("El nombre es: " + cadenaLarga);
        System.out.println("La cadena es: " + letra);
    }
}