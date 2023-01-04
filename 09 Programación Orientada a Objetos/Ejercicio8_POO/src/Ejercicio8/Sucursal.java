package Ejercicio8;

public class Sucursal {
    private int numeroSucursal;
    private String direccion;
    private String ciudad;

    public Sucursal(int numeroSucursal, String direccion, String ciudad) {
        this.numeroSucursal = numeroSucursal;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    public int getNumeroSucursal() {
        return numeroSucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String mostrarDatosSucursal() {
        return "Numero sucursal: " + numeroSucursal + "\nDirección de la sucursal: " + direccion + "\nCiudad de la sucursal: " + ciudad;
    }

    public double calcularPrecio(Paquete t) {
        double precio;
        precio = t.getPeso();
        if (t.getPrioridad() == 1) {
            precio += 10;
        } else if (t.getPrioridad() == 2) {
            precio += 20;
        }
        return precio;
    }
}
