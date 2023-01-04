import java.io.Serializable;

public class persona implements Serializable {

    private static final long serialVersionUID = 1L;
    private String nombre;
    private Integer edad;

    public persona(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println();
    }
}
