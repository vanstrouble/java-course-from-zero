package Ejercicio7;

public class Cliente {
    private String nombre;
    private String apellidos;
    private String dni;
    Cuenta cuentas[];

    // Método Constructor
    public Cliente(String nombre, String apellidos, String dni, Cuenta[] cuentas) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.cuentas = cuentas;
    }

    // Métodos Getter para todo excepto el arreglo de cuentas
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDni() {
        return dni;
    }

    public double consultar_saldo (int n) {
        return cuentas[n].getSaldo();
    }

    public void ingresar_dinero(int n, double cantidad) {
        cuentas[n].ingresarDinero(cantidad);
    }

    public void retirar_dinero(int n, double cantidad) {
        cuentas[n].retirarDinero(cantidad);
    }
}
