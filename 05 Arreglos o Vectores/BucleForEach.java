// Bucle For Each

public class BucleForEach {
    public static void main(String[] args) {
        String[] nombres = {"Aideé", "Pedro", "Berenice", "Antonio", "Francis", "José", "Gati", "Alejandra", "Poli", "Carmen"};

        //      FOR CLÁSICO - uso de length
        // for (int i = 0; i < nombres.length; i++) {
        //     System.out.println(nombres[i]);
        // }

        //      FOR EACH
        System.out.println("\tPersonas bonitas\n");
        for (String i : nombres) {
            System.out.println("Nombre: " + i);
        }
    }
}