public class Arreglo {

        /* 
                ARREGLOS:
        1. Tamaño fijo.
        2. Solo puede contener elementos de un mismo tipo.
        Puede almacenar tipos de datos primitivos o referencias a objetos.

            Conceptos base:
        Posición o índice:
        Los índices en los arreglos comienzan con 0.

        Grupo de elementos enteros:
        5, 3, 9, 28, 45
        índice 0 = 5
        índice 1 = 3
        índice 2 = 9
        índice 3 = 28
        índice 4 = 45

            Declaración de arreglos:
        int numeros[];
        numeros = new int[5];       Forma clásica

        int numeros[] = new int[5];     Forma principal

        int a[] = new int [5], int b[] = new int[3];        Forma alternativa, pero no limpia la sintaxis

        int a[] = {3,64,-1,20,55};      Asignación de valores dentro del arreglo

        int a[] = new int[3];       Ejemplo de asignación de valores
        a[0] = 19;
        a[1] = 33;
        a[2] = 79;

        Obtener los valores
        int x = a[0];
        System.out.println(x);
        System.out.println(a[1]);

            Excepciones
        Índice fuera del arreglo
        */

    public static void main(String[] args) {
        
        // Declaración del arreglo
        int a[] = new int[5];

        // Poblar el arreglo
        a[0] = 99;
        a[1] = 79;
        a[2] = 13;
        a[3] = 45;
        a[4] = 22;

        // Mostrar por consola el arreglo
        // for (int v : a){
        //     System.out.println(v);
        // }

        // for (int i = 0; i < a.length; i++){
        //     System.out.println(a[i]);
        // }

        boolean b[] = new boolean[3];
        for (boolean v : b){
            System.out.println(v);
        }
    }
}