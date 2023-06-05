class Persona {
    // Atributos
    private String nombre;
    private int edad;
    private float peso;
    private float estatura;

    // Constructores
    public Persona(){
        // Sirve para inicializar los valores por defecto de un objeto instanciado.
        this.nombre = "Aideé Berenice";
        this.edad = 22;
        this.peso = 50f;
        this.estatura = 1.45f;
    }

    // Segundo constructor
    // Sobrecarga: escribir un método con el mismo nombre, pero con diferente firma
    public Persona(String n){
        this.nombre = n;
        this.saludar();
    }

    // Tercer constructor
    public Persona(String n, int e){
        this.nombre = n;
        this.edad = e;
    }

    // Getter y Setter
    // Get obtener valores
    // Set asignar valores

    // Métodos
    void setNombre(String n) {
        this.nombre = n;
    }
    String getNombre() {
        return this.nombre;
    }

    void setEdad(int e){
        if (e < 0 || e > 150){
            System.out.println("La edad no es válida");
        } else {
            this.edad = e;
        }
    }
    int getEdad(){
        return this.edad;
    }

    void saludar() {
        System.out.println("Hola, mi nombre es: " + this.nombre);
    }
}