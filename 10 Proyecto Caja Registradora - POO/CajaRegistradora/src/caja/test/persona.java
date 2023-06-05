package caja.test;

public class persona implements Cloneable {
    public String nombre;
    public int edad;

    public persona clone() throws CloneNotSupportedException {
        return (persona) super.clone();
    }
}
