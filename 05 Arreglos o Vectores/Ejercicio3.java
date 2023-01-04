import java.util.Scanner;

/* Ejercicio 3
    Leer 5 números por teclado, almacenarlos en un arreglo y a continuación realizar 
    la media de los números positivos, la media de los números negativos y contar el 
    número de ceros.
*/ 

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        float numeros[] = new float[5], mediaPos = 0, contPos = 0, mediaNeg = 0, contNeg = 0, contCeros = 0;

        System.out.println("\tDigite 5 números");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite el número [" + (i + 1) + "]: ");
            numeros[i] = entry.nextFloat();

            if (numeros[i] > 0) {
                contPos++;
                mediaPos += numeros[i];
            } else if (numeros[i] < 0) {
                contNeg++;
                mediaNeg += numeros[i];
            } else {
                contCeros++;
            }
        }

        System.out.println();

        if (mediaPos != 0) {
            mediaPos = mediaPos / contPos;
            System.out.println("La media de los números positivos es: " + mediaPos);
        } else {
            System.out.println("No se digitaron valores positivos");
        }
        if (mediaNeg != 0) {
            mediaNeg = mediaNeg / contNeg;
            System.out.println("La media de los números negativos es: " + mediaNeg);
        } else {
            System.out.println("No se digitaron valores negativos");
        }
        if (contCeros != 0) {
            System.out.println("La cantidad de ceros ingresados es: " + contCeros);
        } else {
            System.out.println("No se digitaron ceros");
        }
        
        entry.close();
    }
}