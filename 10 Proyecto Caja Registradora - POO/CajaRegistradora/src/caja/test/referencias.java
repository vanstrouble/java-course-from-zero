package caja.test;

public class referencias {
    public static void main(String[] args) {
        persona persona = new persona();  
        persona.nombre = "Pedro";
        persona.edad = 22;

        persona otraPersona = persona;
        otraPersona.nombre = "Aideé";
        otraPersona.edad = 23;

        persona segundaPersona = new persona();
        // segundapPersona.nombre = persona.nombre;
        // segundapPersona.edad = otraPersona.edad;

        try {
            segundaPersona = persona.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        // segundapPersona.edad = 15;

        System.out.println(persona.nombre);
        System.out.println(persona.edad);
        System.out.println(otraPersona.nombre);
        System.out.println(otraPersona.edad);
        System.out.println(segundaPersona.nombre);
        System.out.println(segundaPersona.edad);
    }
}
