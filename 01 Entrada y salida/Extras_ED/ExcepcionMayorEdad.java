public class ExcepcionMayorEdad extends RuntimeException {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public ExcepcionMayorEdad(String str) {
        super(str + " no eres mayor de edad");
    }

    public ExcepcionMayorEdad(){
        this("Lo lamento, no puedes entrar porque");
    }
}