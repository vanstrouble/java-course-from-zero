public class Condicionales {
    public static void main(String[] args) {
        
        // Condicionales se ejecutan con la palabra 
        // reservada if
        // if (condición){
        // verdadeda 
        //}

        int edad = 15;

        if (edad >= 0 && edad < 18){
            System.out.println("Estás en la niñez o adolescencia.");
        } else if (edad >= 18 && edad < 65){
            System.out.println("Estás en la adultez.");
        } else if (edad > 65) {
            System.out.println("Estás en la vejez.");
        } else {
            System.out.println("Edad errada.");
        }
        System.out.println("Proceso terminado.");
    }
}