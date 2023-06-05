public class Lineal {
    public static void main(String[] args) {
        
        // Declaración del arreglo
        int a[] = new int[10];

        // Poblado del arreglo con números aleatorios
        for(int i = 0; i < a.length; i++){
            a[i] = (int) (Math.random() * 99);
        }
        a[9] = 50;

        // Mostrar el arreglo por consola
        for (int v : a){
            System.out.println(v + " ");
        }
        System.out.println();

        int x = 50;

        // Búsqueda lineal
        for (int i = 0; i < a.length; i++){
            if (a[i] == x){
                System.out.println("El número : "+ x +" está en el índice: " + i);
                break;
            }
        }
    }
}