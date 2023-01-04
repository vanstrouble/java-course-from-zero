/* Ejercicio 1
    Construir un programa que calcule el área y el perímetro de un cuadrilatero dada la longitud de sus dos lados.
    Los valores de la longitud deberá introducirse por línea de órdenes. Si es un cuadrado, sólo se proporcionará la
    longitud de uno de los lados del constructor.
 */

package Ejercicio1;

public class Cuadrilatero {
    // Atributos
    private float lado1;
    private float lados2;

    // Métodos Constructo 1 (CUadrilatero)
    public Cuadrilatero(float lado1, float lados2) {
        this.lado1 = lado1;
        this.lados2 = lados2;
    }

    // Método Constructor 2 (Cuadrado)
    public Cuadrilatero(float lado1) {
        this.lado1 = this.lados2 = lado1;
    }

    public float getPerimetro() {
        float perimetro = 2 * (lado1 + lados2);
        return perimetro;
    }
    public float getArea() {
        float area = (lado1 * lados2);
        return area;
    }
}
