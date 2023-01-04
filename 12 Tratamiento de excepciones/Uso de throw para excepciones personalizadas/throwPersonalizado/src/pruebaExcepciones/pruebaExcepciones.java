import java.util.Scanner;

/**
    Uso de throw para excepciones personalizadas
 */
public class pruebaExcepciones {
    private int numero;
    private Scanner leer;

    public void introducirNumeros() throws Excepcion0 {
        leer = new Scanner(System.in);
        do {
            System.out.print("Digite un número: ");
            numero = leer.nextInt();

            if (numero == 0) { // Quiero que se produzca una excepción personalizada
                throw new Excepcion0();
            }
        } while (numero != 0 && numero != 1);
    }


    public static void main(String[] args) throws Excepcion0 {
        pruebaExcepciones prueba = new pruebaExcepciones();

        try {
            prueba.introducirNumeros();
        } catch (Excepcion0 e) {
            System.out.println("Ha introducido el número cero");
        }

        System.out.println("Programa terminado");
        
    }
    
}