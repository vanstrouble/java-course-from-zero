import java.util.Scanner;

public class CicloFor {
    public static void main(String[] args) {
        Scanner entrScanner = new Scanner(System.in);

        int contador;

        System.out.print("Digite la cantidad de términos: ");
        contador = entrScanner.nextInt();

        for (int i = 1; i <= contador; i++){
            System.out.println(i);
        }

        entrScanner.close();
    }
}