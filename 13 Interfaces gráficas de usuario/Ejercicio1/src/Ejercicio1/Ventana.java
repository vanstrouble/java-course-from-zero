package Ejercicio1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame {
    private JPanel panel;
    private JLabel etiqueta;
    private JButton boton;
    private int contador = 0;

    public Ventana() {
        setSize(400, 400); // Tamaño de la ventana
        setTitle("Ejercicio 1"); // Titulo de la ventana
        setLocationRelativeTo(null); // Ventana al centro de la pantalla

        iniciarComponentes();

        setDefaultCloseOperation(EXIT_ON_CLOSE); // Cerrar la ventana con la X
    }

    private void iniciarComponentes() {
        colocarPanel();
        colocarEtiqueta();
        colocarBoton();
    }

    private void colocarPanel() {
        panel = new JPanel();
        panel.setLayout(null); // Dashabilitamos el diseño del panel para manipular objetos
        this.add(panel);
    }

    private void colocarEtiqueta() {
        etiqueta = new JLabel();
        etiqueta.setBounds(0, 50, 400, 40);
        etiqueta.setText("Pulsa el botón");
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta.setFont(new Font("San Francisco", 0, 20));

        panel.add(etiqueta);
    }

    private void colocarBoton() {
        boton = new JButton();
        boton.setBounds(100, 250, 200, 50);
        boton.setText("Presióname");
        boton.setFont(new Font("San Francisco", 1, 15));

        panel.add(boton);

        eventoDeAccion();
    }

    private void eventoDeAccion() {
        ActionListener eventoAccion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contador++;
                if (contador == 1) {
                    etiqueta.setText("Has presionado el botón 1 vez");
                } else {
                    etiqueta.setText("Has presionado el botón " + contador + " veces");
                }
            }
        };

        boton.addActionListener(eventoAccion);
    }
}
