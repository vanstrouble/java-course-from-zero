import java.util.Map;
import java.util.HashMap;

class CicloForEachMap {
    public static void main(String[] args) {
        
        Map<Integer, String> nombres = new HashMap<>();
        nombres.put(13, "Aideé");
        nombres.put(15, "Berenice");
        nombres.put(6, "Pedro");
        nombres.put(9, "Antonio");
        nombres.put(6, "Brenda");
        nombres.put(41, "Janitzi");

        nombres.forEach((id, name) -> {
            System.out.println("ID: "+ id + " Nombre: " + name);
        });
    }
}