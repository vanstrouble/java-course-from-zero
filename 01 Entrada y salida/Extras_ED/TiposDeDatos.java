import java.util.Vector;

public class Main {

    public static void main(String[] args){

        Vector vector = new Vector(30);
        vector.add("José");
        vector.add("María");
        vector.add("Pokemon");
        vector.insertElementAt("Hola mundo", 0);
        vector.removeElementAt(2);
    }
}
