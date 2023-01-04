import java.util.Scanner;

public class CicloDoWhile {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        int i = 1, contador;

        System.out.print("Digite la cantidad de términos: ");
        contador = entry.nextInt();

        do {
            System.out.println(i);
            i++;
        } while (i <= contador);

        entry.close();
    }
}