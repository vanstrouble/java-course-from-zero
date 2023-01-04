import java.util.Scanner;

/* Ejercicio 16
    Queremos desarrollar una aplicación que nos ayude a gestionar las notas de un centrro educativo. 
    Cada grupo (o clase) está compueo por 5 alumnos. Se pide leer las notyas del primer, segundo y 
    tercer trimestre de un grupo. Debemos mostrar al final: la nota media del grupo en cada trimestre, 
    y la media del alumno que se encuentra en la posición N (N se lee por teclado).
*/

public class Ejercicio16 {
    public static void main(String[] args) {
        java.util.Scanner entry = new Scanner(System.in);

        float primero[], segundo[], tercero[];
        float sumaPrimero = 0, sumaSegundo = 0, sumaTercero = 0, sumaAlumno = 0;
        float promedioPrimero = 0, promedioSegundo = 0, promedioTercero = 0, promedioAlumno = 0;
        byte posicion;

        primero = new float[5];
        segundo = new float[5];
        tercero = new float[5];

        System.out.println("Digite las notas del primer trimestre");
        for (int i = 0; i < 5; i++) {
            System.out.print("Alumno " + i + ": ");
            primero[i] = entry.nextFloat();

            sumaPrimero += primero[i];  // Sumamos todas las notas del primer trimestre
        }
        System.out.println("\nDigite las notas del segundo trimestre");
        for (int i = 0; i < 5; i++) {
            System.out.print("Alumno " + i + ": ");
            segundo[i] = entry.nextFloat();

            sumaSegundo += segundo[i];  // Sumamos todas las notas del segundo trimestre
        }
        System.out.println("\nDigite las notas del tercer trimestre");
        for (int i = 0; i < 5; i++) {
            System.out.print("Alumno " + i + ": ");
            tercero[i] = entry.nextFloat();

            sumaTercero += tercero[i];  // Sumamos todas las notas del tercer trimestre
        }

        // Sacamos los promedios de cada trimestre
        promedioPrimero = sumaPrimero / 5;
        promedioSegundo = sumaSegundo / 5;
        promedioTercero = sumaTercero / 5;

        // Ahora pedimos la posición del alumno N para sacar su promedio
        do {
            System.out.print("\nDigite la posición del alumno (0-4) para obtener su promedio: ");
            posicion = entry.nextByte();
        } while (posicion < 0 || posicion > 4);

        // Sacamos la suma de las notas del alumno
        sumaAlumno = primero[posicion] + segundo[posicion] + tercero[posicion];
        promedioAlumno = sumaAlumno / 3;

        System.out.println("\nDatos requeridos");
        System.out.println("Promedio del Primer trimestre: " + promedioPrimero);
        System.out.println("Promedio del Segundo trimestre: " + promedioSegundo);
        System.out.println("Promedio del Tercer trimestre: " + promedioTercero);
        System.out.println("Promedio del Alumno: " + promedioAlumno);

        entry.close();
    }
}