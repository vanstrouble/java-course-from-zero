import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class añadirContenido extends ObjectOutputStream {

    public añadirContenido(OutputStream out) throws IOException {
        super(out);
    }

    public añadirContenido() throws IOException, SecurityException {
    }
    
    @Override
    public void writeStreamHeader() throws IOException {
        reset();
    }
}
