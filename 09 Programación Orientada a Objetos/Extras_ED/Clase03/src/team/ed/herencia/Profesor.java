package team.ed.herencia;

public class Profesor extends Persona {

    public Profesor(){
    }

    public Profesor(String n){
    }

    public void ensenar(){
        System.out.println("Soy profesor");
    }

    // Overloading / Sobrecarga de métodos
    // Override / Sobreescritura de métodos

    //      Sobrecarga de métodos:
    // Permite crear varios métodos con el mismo nombre siempre y cuando la firma sea diferente.
    // Se logra cambiando el orden de los parámetros y/o la cantidad de los mismos.
    // Se hace en la misma clase.

    public void ensenar(String materia){
        System.out.println("Enseño la materia de " + materia);
    }

    //      Sobreescritura de métodos:
    // Permite cambiar el comportamiento de un método.
    // Se hace sobre la herencia o el polimorfismo.

    @Override
    public void comer(){
        System.out.println("Como puras cosas sanas");
    }

    @Override
    public void reir(){
        System.out.println("Me rio malvadamente wuajajaja");
    }
}
