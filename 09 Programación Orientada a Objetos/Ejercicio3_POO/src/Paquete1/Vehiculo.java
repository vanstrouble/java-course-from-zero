/*
    Ejercicio 3. Construir un programa que dada una serie de vehículos caracterizados por su marca, modelo y precio,
    imprima las propiedades del vehículo más barato. Para ello, se deberán leer por teclado las características de
    cada vehículo y crear una clase que represente a cada uno de ellos.
 */

package Paquete1;

public class Vehiculo {
    private String marca;
    private String modelo;
    private double precio;

    // Constructor
    public Vehiculo(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    // Método Getter para precio
    public double getPrecio() {
        return precio;
    }

    public String mostrarDatos() {
        return "Marca: " + marca +  "\nModelo: " + modelo + "\nPrecio: $" + precio;
    }
}