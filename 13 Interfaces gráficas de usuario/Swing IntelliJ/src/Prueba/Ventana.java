package Prueba;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame {
    private JPanel panel1;
    private JLabel etiquetaUsuario;
    private JTextField textoUsuario;
    private JLabel etiquetaPassword;
    private JTextField textoPassword;
    private JButton botonSaludar;
    private JButton botonSalir;

    private JMenuBar menuBar;
    private JMenu archivo;
    private JMenuItem salir;

    public Ventana() {
        super("Prueba Swing con IntelliJ");

        setContentPane(panel1);

        menuBar = new JMenuBar();
        archivo = new JMenu("Archivo");
        salir = new JMenuItem("Salir");

        menuBar.add(archivo);
        archivo.add(salir);

        setJMenuBar(menuBar);
        botonSaludar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Bienvenido a Swing");
            }
        });
        botonSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                System.exit(0);
            }
        });
    }
}
