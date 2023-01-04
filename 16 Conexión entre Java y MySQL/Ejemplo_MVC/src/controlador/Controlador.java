package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Modelo;
import vista.Vista;

/**
 *
 * @author pedrovazquezg
 */
public class Controlador implements ActionListener {
    private Vista vista;
    private Modelo modelo;

    public Controlador(Vista vista, Modelo modelo) {
        this.vista = vista;
        this.modelo = modelo;
        vista.botonSumar.addActionListener(this);
    }
    
    public void iniciar() {
        vista.setTitle("MVC Sumar");
        vista.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        modelo.setNumero1(Integer.parseInt(vista.boxNum1.getText()));
        modelo.setNumero2(Integer.parseInt(vista.boxNum2.getText()));
        modelo.sumar();
        
        vista.boxResultado.setText(String.valueOf(modelo.getResultado()));
    }
}
