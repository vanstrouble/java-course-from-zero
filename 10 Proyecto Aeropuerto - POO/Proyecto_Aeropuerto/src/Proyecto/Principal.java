package Proyecto;

import java.util.Scanner;

public class Principal {
    static Scanner entrada = new Scanner(System.in);
    final static int num = 4; // Número de aeropuertos
    static Aeropuerto aeropuerto[] = new Aeropuerto[num];

    public static void main(String[] args) {
        // Insertar datos de los aeropuertos
        insertarDatosAeropuerto(aeropuerto);
        menu();
    }

    public static void insertarDatosAeropuerto(Aeropuerto aero[]) {
        aero[0] = new AeropuertoPublico("Jorge Chavez", "Lima", "Perú", 80000000);
        aero[0].insertarCompañia(new Compañia("AeroPerú"));
        aero[0].insertarCompañia(new Compañia("LATAM"));
        aero[0].getCompañia("AeroPerú").insertarVuelo(new Vuelo("IB20", "Lima", "México", 150.90, 150));;
        aero[0].getCompañia("AeroPerú").insertarVuelo(new Vuelo("IB21", "Lima", "Buenos Aires", 180.99, 120));
        aero[0].getCompañia("LATAM").insertarVuelo(new Vuelo("FC12", "Lima", "Londres", 500.90, 180));
        aero[0].getCompañia("AeroPerú").getVuelo("IB20").insertarPasajero(new Pasajero("Pedro", "20BGHP", "Mexicano"));
        aero[0].getCompañia("AeroPerú").getVuelo("IB20").insertarPasajero(new Pasajero("María", "BJKL20", "Peruana"));
        aero[0].getCompañia("LATAM").getVuelo("FC12").insertarPasajero(new Pasajero("Raul", "JH2KL", "Argentino"));

        aero[1] = new AeropuertoPrivado("Central Ciudad Real","Ciudad Real","España");
        aero[1].insertarCompañia(new Compañia("AirEuropa"));
        String empresas[] = {"Cobresol","Anguila34"};
        ((AeropuertoPrivado)aero[1]).insertarEmpresas(empresas);
        aero[1].getCompañia("AirEuropa").insertarVuelo(new Vuelo("AE025","Madrid","Buenos Aires",150.50,120));
        aero[1].getCompañia("AirEuropa").getVuelo("AE025").insertarPasajero(new Pasajero("Juan Pablo","EA384794","Mexicana"));
        
        aero[2] = new AeropuertoPublico("Colombia", "Aeropuerto Bogota", "Bogota", 20000000);
        aero[2].insertarCompañia(new Compañia("AirAmerica"));
        aero[2].insertarCompañia(new Compañia("VuelaBogota"));
        aero[2].getCompañia("AirAmerica").insertarVuelo(new Vuelo("AE030","Bogota","Lima",130.90,110));
        aero[2].getCompañia("AirAmerica").getVuelo("AE030").insertarPasajero(new Pasajero("Damaris","000AA4G5","Colombiana"));
        
        aero[3] = new AeropuertoPublico("Mexico", "Aeropuerto Mexico", "Mexico", 40000000);
        aero[3].insertarCompañia(new Compañia("AeroMexico"));
        aero[3].getCompañia("AeroMexico").insertarVuelo(new Vuelo("IB2040","Mexico","Nueva York",130.90,140));
        aero[3].getCompañia("AeroMexico").insertarVuelo(new Vuelo("IB2042","Mexico","Lima",100.80,150));
        aero[3].getCompañia("AeroMexico").getVuelo("IB2040").insertarPasajero(new Pasajero("Maria","AA4794H","Inglesa"));
    }

    public static void menu() {
        String nombreAeropuerto, nombreCompañia, origen, destino;
        byte opcion;
        Aeropuerto aeropuerto1;
        Compañia compañia;

        do {
            System.out.println("\t.:MENU:.\n");
            System.out.println("1. Ver Aeropuertos gestionados (Públicos o Privados)");
            System.out.println("2. Ver empresas (Privado) o subvención (Público)");
            System.out.println("3. Lista de compañías de un Aeropuerto");
            System.out.println("4. Lista de vuelos por compañía");
            System.out.println("5. Listar posibles de origen a destino");
            System.out.println("6. Salir");
            System.out.print("Opción: ");
            opcion = entrada.nextByte();

            switch (opcion) {
                case 1:
                    System.out.println();
                    mostrarDatosAeropuertos(aeropuerto);
                    break;
                case 2: 
                    System.out.println();
                    mostrarPatrocinio(aeropuerto);
                    break;
                case 3: 
                    entrada.nextLine();
                    System.out.print("\nDigite el nombre del Aeropuerto: ");
                    nombreAeropuerto = entrada.nextLine();
                    aeropuerto1 = buscarAeropuerto(nombreAeropuerto, aeropuerto);
                    if (aeropuerto1 == null) {
                        System.out.println("El aeropuerto no existe\n");
                    } else {
                        mostrarCompañias(aeropuerto1);
                    }
                    break;
                case 4: 
                    entrada.nextLine();
                    System.out.print("\nDigite el nombre del Aeropuerto: ");
                    nombreAeropuerto = entrada.nextLine();
                    aeropuerto1 = buscarAeropuerto(nombreAeropuerto, aeropuerto);
                    if (aeropuerto1 == null) {
                        System.out.println("El aeropuerto no existe\n");
                    } else {
                        System.out.print("Digite el nombre de la compañía: ");
                        nombreCompañia = entrada.nextLine();
                        compañia = aeropuerto1.getCompañia(nombreCompañia);
                        System.out.println();
                        mostrarVuelos(compañia);
                    }
                    break;
                case 5: 
                    entrada.nextLine();
                    System.out.print("\nDigite la ciudad Origen: ");
                    origen = entrada.nextLine();
                    System.out.print("Digite la ciudad Destino: ");
                    destino = entrada.nextLine();
                    mostrarVueloOrigenDestino(origen, destino, aeropuerto);
                    break;
                case 6: 
                    break;

                default:
                    System.out.println("Error. Digite una opción válida");
                    break;
            }
        } while (opcion != 6);
    }

    public static void mostrarDatosAeropuertos(Aeropuerto aeropuertos[]) {
        for (int i = 0; i < aeropuertos.length; i++) {
            if (aeropuertos[i] instanceof AeropuertoPrivado) {
                System.out.println("Aeropuerto Privado");
                System.out.println("Nombre: " + aeropuertos[i].getNombre());
                System.out.println("Ciudad: " + aeropuertos[i].getCiudad());
                System.out.println("País: " + aeropuertos[i].getPais());
            } else {
                System.out.println("Aeropuerto Público");
                System.out.println("Nombre: " + aeropuertos[i].getNombre());
                System.out.println("Ciudad: " + aeropuertos[i].getCiudad());
                System.out.println("País: " + aeropuertos[i].getPais());
            }
            System.out.println();
        }
    }

    public static void mostrarPatrocinio(Aeropuerto aeropuertos[]) {
        String empresas[];

        for (int i = 0; i < aeropuertos.length; i++) {
            if (aeropuertos[i] instanceof AeropuertoPrivado) {
                System.out.println("Aeropuerto Privado: " + aeropuertos[i].getNombre());
                empresas = ((AeropuertoPrivado)aeropuertos[i]).getListaEmpresas();
                System.out.println("Empresas: ");
                for (int j = 0; j < empresas.length; j++) {
                    System.out.println(empresas[j]);
                }
            } else {
                System.out.println("Aeropuerto Público: " + aeropuertos[i].getNombre());
                System.out.println("Subvención: " + ((AeropuertoPublico)aeropuertos[i]).getSubvencion());
            }
            System.out.println();
        }
    }

    public static Aeropuerto buscarAeropuerto(String nombre, Aeropuerto aeropuertos[]) {
        boolean encontrado = false;
        int i = 0;
        Aeropuerto aero = null;

        while (!encontrado && i < aeropuertos.length) {
            if (nombre.equals(aeropuertos[i].getNombre())) {
                encontrado = true;
                aero = aeropuertos[i];
            }
            i++;
        }
        return aero;
    }

    public static void mostrarCompañias(Aeropuerto aeropuerto) {
        System.out.println("\nLas compañías del aeropuerto: " + aeropuerto.getNombre());
        for (int i = 0; i < aeropuerto.getNumeroCompañia(); i++) {
            System.out.println(aeropuerto.getCompañia(i).getNombre());
        }
    }

    public static void mostrarVuelos(Compañia compañia) {
        Vuelo vuelo;

        System.out.println("Los vuelos de la compañía: " + compañia.getNombre());
        for (int i = 0; i < compañia.getNumeroVuelo(); i++) {
            vuelo = compañia.getVuelo(i);
            System.out.println("Identificador: " + vuelo.getIdentificador());
            System.out.println("Ciudad Origen: " + vuelo.getCiudadOrigen());
            System.out.println("Ciudad Destino: " + vuelo.getCiudadDestino());
            System.out.println("Precio: $" + vuelo.getPrecio());
            System.out.println();
        }
    }

    public static Vuelo[] buscarVuelosOrigenDestino(String origen, String destino, Aeropuerto aeropuertos[]) {
        Vuelo vuelo;
        int contador = 0;
        Vuelo listaVuelos[];

        for (int i = 0; i < aeropuertos.length; i++) { // Recorremos aeropuertos
            for (int j = 0; j < aeropuertos[i].getNumeroCompañia(); j++) { // Recorremos compañias
                for (int k = 0; k < aeropuertos[i].getCompañia(j).getNumeroVuelo(); k++) { // Recorremos los vuelos
                    vuelo = aeropuertos[i].getCompañia(j).getVuelo(k);
                    if ((origen.equals(vuelo.getCiudadOrigen())) && (destino.equals(vuelo.getCiudadDestino()))) {
                        contador++;
                    }
                }
            }
        }

        listaVuelos = new Vuelo[contador];
        int q = 0;

        for (int i = 0; i < aeropuertos.length; i++) {
            for (int j = 0; j < aeropuertos[i].getNumeroCompañia(); j++) {
                for (int k = 0; k < aeropuertos[i].getCompañia(j).getNumeroVuelo(); k++) {
                    vuelo = aeropuertos[i].getCompañia(j).getVuelo(k);
                    if ((origen.equals(vuelo.getCiudadOrigen())) && (destino.equals(vuelo.getCiudadDestino()))) {
                        listaVuelos[q] = vuelo;
                        q++;
                    }
                }
            }
        }
        return listaVuelos;
    }

    public static void mostrarVueloOrigenDestino(String origen, String destino, Aeropuerto aeropuertos[]) {
        Vuelo vuelos[];
        vuelos = buscarVuelosOrigenDestino(origen, destino, aeropuertos);
        if (vuelos.length == 0) {
            System.out.println("No existen vuelos de esa ciudad origen a destino\n");
        } else {
            System.out.println("Vuelos encontrados: ");
            for (int i = 0; i < vuelos.length; i++) {
                System.out.println("Identificador: " + vuelos[i].getIdentificador());
                System.out.println("Ciudad Origen: " + vuelos[i].getCiudadOrigen());
                System.out.println("Ciudad Destino: " + vuelos[i].getCiudadDestino());
                System.out.println("Precio: $" + vuelos[i].getPrecio());
                System.out.println();
            }
        }
    }
}
