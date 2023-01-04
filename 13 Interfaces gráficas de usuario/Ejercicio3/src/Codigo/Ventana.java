package Codigo;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class Ventana extends JFrame {
    private JPanel panel;
    private JLabel etiqueta;
    private JButton botonRojo, botonVerde, botonAzul;
    private int pulsado = 0, contadorRojo = 0, contadorVerde = 0, contadorAzul = 0;

    public Ventana() {
        setSize(600, 400);
        setTitle("Ejercicio 3");
        setLocationRelativeTo(null);

        iniciarComponentes();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void iniciarComponentes() {
        colocarPanel();
        colocarEtiqueta();
        colocarBotones();
    }

    private void colocarPanel() {
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);

        eventoDeRuedaRaton();
    }

    private void colocarEtiqueta() {
        etiqueta = new JLabel();
        etiqueta.setBounds(100,30,450,50);
        etiqueta.setText("Color (Rojo, Verde, Azul)");
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta.setFont(new Font("San Francisco", 1, 20));

        panel.add(etiqueta);
    }

    private void colocarBotones() {
        /*
            pulsado = 1 -> boton rojo
            pulsado = 2 -> boton verde
            pulsado = 3 -> boton azul
         */
        botonRojo = new JButton("Rojo");
        botonRojo.setBounds(50, 230, 130, 50);
        botonRojo.setForeground(Color.RED);
        botonRojo.setFont(new Font("San Francisco", 1, 20));

        panel.add(botonRojo);

        botonRojo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pulsado = 1;
            }
        });

        botonVerde = new JButton("Verde");
        botonVerde.setBounds(225, 230, 130, 50);
        botonVerde.setForeground(Color.GREEN);
        botonVerde.setFont(new Font("San Francisco", 1, 20));

        panel.add(botonVerde);

        botonVerde.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pulsado = 2;
            }
        });

        botonAzul = new JButton("Azul");
        botonAzul.setBounds(400, 230, 130, 50);
        botonAzul.setForeground(Color.BLUE);
        botonAzul.setFont(new Font("San Francisco", 1, 20));

        panel.add(botonAzul);

        botonAzul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pulsado = 3;
            }
        });
    }
    
    private void eventoDeRuedaRaton( ) {
        MouseWheelListener eventoRueda = new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                if (pulsado != 0) { // Si se ha pulsado algún botón
                    if (pulsado == 1) { // Se ha pulsado el botón rojo
                        contadorRojo += e.getWheelRotation();
                        if (contadorRojo < 0) {
                            contadorRojo = 0;
                        } else if (contadorRojo > 255) {
                            contadorRojo = 255;
                        }
                    } else if (pulsado == 2) { // Se ha pulsado el botón verde
                        contadorVerde += e.getWheelRotation();
                        if (contadorVerde < 0) {
                            contadorVerde = 0;
                        } else if (contadorVerde > 255) {
                            contadorVerde = 255;
                        }
                    } else { // Se ha pulsado el botón azul
                        contadorAzul += e.getWheelRotation();
                        if (contadorAzul < 0) {
                            contadorAzul = 0;
                        } else if (contadorAzul > 255) {
                            contadorAzul = 255;
                        }
                    }
                }
                etiqueta.setText("Color (Rojo = " + contadorRojo + ", Verde = " + contadorVerde + ", Azul = " + contadorAzul + ")");
                panel.setBackground(new Color(contadorRojo, contadorVerde, contadorAzul));
            }
        };
        panel.addMouseWheelListener(eventoRueda);
    }
}
