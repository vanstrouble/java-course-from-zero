/**
    Try catch para excepciones NO verificadas
 */

public class pruebaExcepciones {
    
    public void operaciones() {
        int num1 = 5, num2 = 0;

        int resultado = num1 / num2;

        System.out.println(resultado);
    }

    public void operaciones2() {
        try {
            operaciones();
        } catch (ArithmeticException a) {
            System.out.println("Ha ocurrido un error. Intentó dividir un número entero entre cero");
        }
        
        System.out.println("Programa terminado");
    }
    
    public static void main(String[] args) {
        pruebaExcepciones prueba = new pruebaExcepciones();

        prueba.operaciones2();
    }
    
}