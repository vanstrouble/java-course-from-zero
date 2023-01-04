package Ejercicio2;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class Ventana extends JFrame {
    private JPanel panel;
    private JLabel etiqueta, imagen;
    private JRadioButton radioBoton1, radioBoton2, radioBoton3, radioBoton4, radioBoton5;

    public Ventana() {
        setSize(750, 450);
        setTitle("Ejercicio 2");
        setLocationRelativeTo(null);

        iniciarComponentes();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void iniciarComponentes() {
        colocarPanel();
        colocarEtiqueta();
        colocarRadioBotones();
    }

    private void colocarPanel() {
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);
    }

    private void colocarEtiqueta() {
        etiqueta = new JLabel();
        etiqueta.setBounds(20, 10, 350, 40);
        etiqueta.setText("Seleccione su equipo favorito");
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta.setFont(new Font("San Francisco", 1, 20));
        
        panel.add(etiqueta);
    }

    private void colocarRadioBotones() { 
        radioBoton1 = new JRadioButton();
        radioBoton1.setBounds(50, 100, 200, 50);
        radioBoton1.setEnabled(true);
        radioBoton1.setText("Barcelona");
        radioBoton1.setFont(new Font("San Francisco", 0, 15));
        panel.add(radioBoton1);

        radioBoton2 = new JRadioButton();
        radioBoton2.setBounds(50, 150, 200, 50);
        radioBoton2.setEnabled(true);
        radioBoton2.setText("Real Madrid");
        radioBoton2.setFont(new Font("San Francisco", 0, 15));
        panel.add(radioBoton2);

        radioBoton3 = new JRadioButton();
        radioBoton3.setBounds(50, 200, 200, 50);
        radioBoton3.setEnabled(true);
        radioBoton3.setText("Juventus");
        radioBoton3.setFont(new Font("San Francisco", 0, 15));
        panel.add(radioBoton3);

        radioBoton4 = new JRadioButton();
        radioBoton4.setBounds(50, 250, 200, 50);
        radioBoton4.setEnabled(true);
        radioBoton4.setText("Bayern Munich");
        radioBoton4.setFont(new Font("San Francisco", 0, 15));
        panel.add(radioBoton4);

        radioBoton5 = new JRadioButton();
        radioBoton5.setBounds(50, 300, 200, 50);
        radioBoton5.setEnabled(true);
        radioBoton5.setText("Liverpool");
        radioBoton5.setFont(new Font("San Francisco", 0, 15));
        panel.add(radioBoton5);

        ButtonGroup grupo = new ButtonGroup();
        grupo.add(radioBoton1);
        grupo.add(radioBoton2);
        grupo.add(radioBoton3);
        grupo.add(radioBoton4);
        grupo.add(radioBoton5);

        eventoDeAccion();
    }

    private void eventoDeAccion(){
        imagen = new JLabel();
        imagen.setBounds(250, 120, 400, 220);
        panel.add(imagen);

        final ImageIcon imagenBarcelona = new ImageIcon(getClass().getResource("/Imagenes/barcelona.jpg"));
        final ImageIcon imagenMadrid = new ImageIcon(getClass().getResource("/Imagenes/realMadrid.jpg"));
        final ImageIcon imagenJuventus = new ImageIcon(getClass().getResource("/Imagenes/juventus.jpg"));
        final ImageIcon imagenBayern = new ImageIcon(getClass().getResource("/Imagenes/bayern.jpg"));
        final ImageIcon imagenLiverpool = new ImageIcon(getClass().getResource("/Imagenes/liverpool.jpg"));

        ActionListener eventoAccion1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                imagen.setIcon(new ImageIcon(imagenBarcelona.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH)));
            }
        };
        radioBoton1.addActionListener(eventoAccion1);

        ActionListener eventoAccion2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                imagen.setIcon(new ImageIcon(imagenMadrid.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH)));
            }
        };
        radioBoton2.addActionListener(eventoAccion2);


        ActionListener eventoAccion3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                imagen.setIcon(new ImageIcon(imagenJuventus.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH)));
            }
        };
        radioBoton3.addActionListener(eventoAccion3);

        ActionListener eventoAccion4 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                imagen.setIcon(new ImageIcon(imagenBayern.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH)));
            }
        };
        radioBoton4.addActionListener(eventoAccion4);

        ActionListener eventoAccion5 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                imagen.setIcon(new ImageIcon(imagenLiverpool.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH)));
            }
        };
        radioBoton5.addActionListener(eventoAccion5);
    }
}