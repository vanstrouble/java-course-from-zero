package Herencia;

public class Estudiante extends Persona{
    private int codigoEstudiante;
    private float notaFinal;

    // Constructor de la clase Estudiante
    public Estudiante(String nombre, String apellidos, int edad, int codigoEstudiante, float notaFinal) {
        super(nombre, apellidos, edad);
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + getNombre() +
                            "\nApellidos: " + getApellidos() +
                            "\nEdad: " + getEdad() +
                            "\nCódigo del estudiante: " + codigoEstudiante +
                            "\nNota final: " + notaFinal);
    }
}
