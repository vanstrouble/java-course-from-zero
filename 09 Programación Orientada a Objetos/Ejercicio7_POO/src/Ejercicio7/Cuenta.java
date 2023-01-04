package Ejercicio7;

public class Cuenta {
    private int numeroCuenta;
    private double saldo;

    // Método Constructor
    public Cuenta(int numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    // Métodos Getter
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void ingresarDinero(double cantidad) {
        saldo += cantidad;
    }
    public void retirarDinero(double cantidad) {
        saldo -= cantidad;
    }
}
