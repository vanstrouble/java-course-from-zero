public class CicloFor {
    public static void main(String[] args) {
        
        /* for (inicialización; expresión booleana; incremento){
            sentecnia
        }
        break
        continue
        */

        for (int i = 0; i < 10; i++){
            System.out.println(i);
            if (i % 2 == 0){
                // break;
                continue;
            }
            // Aquí hace otro proceso muy largo.
            System.out.println("Trabajando muy duro.");
        }
    }
}