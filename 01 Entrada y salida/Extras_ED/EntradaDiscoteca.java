public class EntradaDiscoteca {
    public static void main(String[] args) {
        int edad = 17;
        try {
            validar(edad);
        } catch (ExcepcionMayorEdad eme){
            System.out.println(eme.getMessage());
        }
        System.out.println("Proceso terminado");
    }

    public static void validar(int edad) throws ExcepcionMayorEdad{
        if (edad < 18){
            throw new ExcepcionMayorEdad("No te puedo dejar entrar");
        } else{
            System.out.println("Bienvenido a la disco");
        }
    }
}