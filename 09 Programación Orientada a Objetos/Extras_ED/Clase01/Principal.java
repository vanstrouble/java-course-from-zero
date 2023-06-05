class Principal {
    public static void main(String[] args) {
        Persona persona = new Persona();
        Persona otrapersona = new Persona("Brenda Janitzi");
        Persona terceraPersona = new Persona("Alejandra Balderas", 22);

        // persona.nombre = "Pedro Antonio";
        // persona.edad = 21;
        // persona.peso = 70f;
        // persona.estatura = 1.75f;
        persona.setNombre("Pedro Antonio");
        persona.setEdad(21);

        // System.out.println("Nombre: " + persona.getNombre());
        // System.out.println("Edad: " + persona.getEdad());
        // System.out.println("Nombre de la otra persona: " + otrapersona.getNombre());
        // System.out.println("Nombre de la tercera persona: " + terceraPersona.getNombre());
        // System.out.println("Edad de la tercera persona: " + terceraPersona.getEdad());
        // persona.saludar();
        // otrapersona.saludar();
        // terceraPersona.saludar();
        // System.out.println("Edad: " + persona.edad);
        // System.out.println("Peso: " + persona.peso);
        // System.out.println("Estatura: " + persona.estatura);
    }    
}