import java.util.Scanner;

/* Ejercicio 3. Guillermo tiene N dólares. Luis tiene la mitad de lo que posee Guillermo. 
Juan tiene la mitad de lo que poseen Luis y Guillermo juntos. 
Hacer un programa que calcule e imprima la cantidad de dinero que tienen entre los 3. */

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        float dolaresGuillermo, dolaresLuis, dolaresJuan, suma = 0;
        
        System.out.print("Digite los dolares de Guillermo: ");
        dolaresGuillermo = entry.nextFloat();

        System.out.println("\nLuis tiene la mitad de los de Guillermo 🤔...");
        System.out.println("Juan tiene la mitad de los de Luis y Memo juntos 🧐...\n");

        dolaresLuis = dolaresGuillermo / 2;
        dolaresJuan = (dolaresGuillermo + dolaresLuis) / 2;

        suma = dolaresGuillermo + dolaresLuis + dolaresJuan;

        System.out.println("Los dolares que tiene cada uno son:");
        System.out.println("Guillermo: $" + dolaresGuillermo);
        System.out.println("Luis: $" + dolaresLuis);
        System.out.println("Juan: $" + dolaresJuan);

        System.out.println("\nEntre los tres tienen: $" + suma + " 🤑");
        System.out.println("¡Que se arme la peda! 😎🍻");
        
        entry.close();
    }
}