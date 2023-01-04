import java.util.Scanner;

/* Ciclo While
 */
public class CicloWhile {

    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int i = 0, contador;

        System.out.print("Digite cuántos números quiere en pantalla: ");
        contador = entry.nextInt();

        while (i <= contador){
            System.out.println(i);
            i += 2;
        }
        entry.close();
    }
}