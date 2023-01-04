package Proyecto;

public class AeropuertoPrivado extends Aeropuerto {
    private String listaEmpresas[] = new String[10];
    private int numeroEmpresas;

    public AeropuertoPrivado(String nombre, String ciudad, String pais) {
        super(nombre, ciudad, pais);
    }

    public AeropuertoPrivado(String nombre, String ciudad, String pais, Compañia[] c, String e[]) {
        super(nombre, ciudad, pais, c);
        this.listaEmpresas = e;
        numeroEmpresas = e.length;
    }

    public void insertarEmpresas(String e[]) {
        this.listaEmpresas = e;
        this.numeroEmpresas = e.length;
    }

    public void insertarEmpresa (String e) {
        listaEmpresas[numeroEmpresas] = e;
        numeroEmpresas++;
    }

    public String[] getListaEmpresas() {
        return listaEmpresas;
    }

    public void setListaEmpresas(String[] listaEmpresas) {
        this.listaEmpresas = listaEmpresas;
    }

    public int getNumeroEmpresas() {
        return numeroEmpresas;
    }

    public void setNumeroEmpresas(int numeroEmpresas) {
        this.numeroEmpresas = numeroEmpresas;
    }
}
