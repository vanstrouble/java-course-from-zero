package Ejemplo;

public class Principal {
    public static void main(String[] args) throws Exception {
        Vehiculo misVehiculos[] = new Vehiculo[4];


        misVehiculos[0] = new Vehiculo("GH67", "Ferrari", "A89");
        misVehiculos[1] = new VehiculoTurismo("78HJ", "Audi", "P14", 4);
        misVehiculos[2] = new VehiculoDeportivo("45GH", "Toyota", "KJ8", 500);
        misVehiculos[3] = new VehiculoFurgoneta("JI8", "Toyota", "J9", 2000);

        for (Vehiculo vehiculos: misVehiculos) {
            System.out.println(vehiculos.mostrarDatos());
            System.out.println();
        }

        // Conversión ascendente de tipos (Upcasting)
        Vehiculo vehiculo = misVehiculos[1];
        
        System.out.println(vehiculo);
        System.out.println();

        // Conversión descendente de tipos (Downcasting)
        Vehiculo vehiculo2 = new VehiculoTurismo("GT67", "Ferrari", "A89", 4);

        VehiculoTurismo nuevoVehiculo = (VehiculoTurismo) vehiculo2;

        System.out.println(nuevoVehiculo);
        System.out.println();
    }
}
