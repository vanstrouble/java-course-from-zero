public class Burbuja {
    public static void main(String[] args) {
        
        // Declaración del arreglo
        int a[] = new int[10];

        // Poblado del arreglo con números aleatorios
        for(int i = 0; i < a.length; i++){
            a[i] = (int) (Math.random() * 99);
        }

        // Mostrar el arreglo por consola
        for (int v : a){
            System.out.println(v + " ");
        }
        System.out.println();

        // Ordenar por el método burbuja
        // 1. Recorrer eñ arreglo tantas veces como elementos contenga menos 1.
        // Ejemplo: Si el arreglo tiene 10 elementos, voy a recorrerlo 9 veces.
        // 2. En cada recorrido comparo el elemento actual con el elemento siguiente para saber si están ordenados, si no lo están, entonces los ordeno.

        // Código método burbuja
        for (int recorrido = 0; recorrido < a.length - 1; recorrido++){
            for (int elemento = 0; elemento < a.length - 1; elemento++){
                if (a[elemento] > a[elemento + 1]){
                    int t = a[elemento];
                    a[elemento] = a[elemento + 1];
                    a[elemento + 1] = t;
                }
            }
        }
        // Mostramos el arreglo ya ordenado
        for (int v : a){
            System.out.println(v + " ");
        }
        System.out.println();
    }
}