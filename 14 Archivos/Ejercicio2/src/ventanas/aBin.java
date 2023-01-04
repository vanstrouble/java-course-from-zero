/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 *
 * @author pedrovazquezg
 */
public class aBin extends ObjectOutputStream {

    public aBin(OutputStream out) throws IOException {
        super(out);
    }

    public aBin() throws IOException, SecurityException {
    }
    
    @Override
    public void writeStreamHeader() throws IOException {
        File archivo = new File("registroAtletas.bin");
        
        if (archivo.length() == 0) { // Si el archivo está vacío
            super.writeStreamHeader();
        } else {
            reset();
        }
    }
}
