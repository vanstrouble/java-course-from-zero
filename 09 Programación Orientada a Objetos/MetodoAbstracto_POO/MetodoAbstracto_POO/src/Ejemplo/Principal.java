public class Principal {
    public static void main(String[] args) throws Exception {
        Planta planta = new Planta();
        AnimalCarnivoro animalC = new AnimalCarnivoro();
        AnimalHerbivoro animalH = new AnimalHerbivoro();

        planta.alimentarse();
        animalC.alimentarse();
        animalH.alimentarse();
    }
}
