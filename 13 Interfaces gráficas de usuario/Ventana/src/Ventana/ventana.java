package Ventana;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.Arrays;

public class ventana extends JFrame {
    public JPanel panel;

    public ventana () {
        this.setSize(500, 500); // Establecemos el tamaño de la ventana
        this.setTitle("Mi ventana"); // Establecemos el titulo de la ventana
        // this.setLocation(300, 300); // Establecemos la posición inicial de la ventana
        // this.setBounds(100, 200, 500, 500); // Establecemos la ubicación inicial y el tamaño de ventana
        this.setLocationRelativeTo(null); // Establecemos la venytana en el centro de la pantalla

        // this.setResizable(false); // Bloquear el redimencionamiento de a ventana
        this.setMinimumSize(new Dimension(200, 200)); // Redimencionar la ventana a un tamaño mínimo

        // this.getContentPane().setBackground(Color.WHITE); // Cambiar el color de fondo de la ventana

        iniciarComponentes();

        this.setDefaultCloseOperation(EXIT_ON_CLOSE); // Cerrar la ventana y cerrar el programa
    }

    private void iniciarComponentes () {
        colocarPaneles();
        // colocarEtiquetas();
        // colocarBotones();
        // colocarRadioBotones();
        // colocarBotonesDeActivacion();
        // colocarCajasDeTexto();
        // colocarAreasDeTexto();
        // colocarCasillasDeVerificacion();
        // colocarListasDesplegables();
        // colocarCampoDeContraseña();
        // colocarTablas();
        colocarListas();
    }

    private void colocarPaneles() {
        panel = new JPanel(); // Creación de un panel
        panel.setLayout(null); // Desactivando el diseño

        this.setBackground(Color.GRAY); // Establecemos el color del panel
        this.getContentPane().add(panel); // Agregamos el panel a la ventana
    }

    private void colocarEtiquetas() {
        JLabel etiqueta = new JLabel(); // Creación de etiquetas  
        // JLabel etiqueta = new JLabel("Aideé", SwingConstants.CENTER); // Iniciamos el texto y elegimos la ubicación dentro de la etiqueta
        etiqueta.setText("Se lo dedico a Aideé"); // Establecemos el texto de la etiqueta
        etiqueta.setBounds(10, 10, 150, 30); // Modificar la posición de la etiqueta
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER); // Establecemos la alineación horizontal del texto de la etiqueta
        etiqueta.setForeground(Color.PINK); // Cambiar el color de la letra
        etiqueta.setOpaque(true); // Le damos permiso para modificar el fondo de la etiqueta
        etiqueta.setBackground(Color.darkGray); // Cambiamos el color de fondo de la etiqueta
        etiqueta.setFont(new Font("arial", Font.BOLD, 15)); // Establecemos la fuente del texto
        panel.add(etiqueta); // ar la etiqueta al panel

        // Etiqueta 2 - etiqueta tipo imagen
        ImageIcon imagen = new ImageIcon("Fondo.jpg");
        JLabel etiqueta2 = new JLabel();
        etiqueta2.setBounds(10, 80, 400, 400);
        etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_SMOOTH))); // Modificar el escalado de la imagen
        panel.add(etiqueta2);
    }

    private void colocarBotones() {
        // Botón 1 - botón de texto
        JButton boton1 = new JButton();
        boton1.setText("Presiona"); // Establecemos un texto en el boton
        boton1.setBounds(100, 100, 100, 40);
        boton1.setEnabled(true); // Establecemos el encendido del boton
        boton1.setMnemonic('a'); // Establecemos alt + letra
        boton1.setForeground(Color.ORANGE); // Establecemos el color de la letra del botón
        boton1.setFont(new Font("arial", Font.BOLD, 20)); // Establecemos la fuente de la letra del botón
        panel.add(boton1);

        // Botón 2 - botón de imagen
        JButton boton2 = new JButton();
        // boton2.setText("No presioanr");
        boton2.setBounds(100, 200, 100, 40);
        ImageIcon presione = new ImageIcon("botonImagen.jpg");
        boton2.setIcon(new ImageIcon(presione.getImage().getScaledInstance(boton2.getWidth(), boton2.getHeight(), Image.SCALE_SMOOTH)));
        // boton2.setBackground(Color.BLACK); // Establecemos el color de fondo del botón
        panel.add(boton2);
        
        // Botón 3 - botón de bordes
        JButton boton3 = new JButton();
        boton3.setBounds(100, 300, 110, 50);
        boton3.setBorder(BorderFactory.createLineBorder(Color.RED, 3, true));
        // boton3.setEnabled(true);
        panel.add(boton3);
    }

    private void colocarRadioBotones() {
        JRadioButton radioBoton1 = new JRadioButton("Opcion 1", false);
        radioBoton1.setBounds(50, 100, 200, 50);
        radioBoton1.setEnabled(true);
        radioBoton1.setText("Programación");
        radioBoton1.setFont(new Font("arial", 0, 20));
        panel.add(radioBoton1);

        JRadioButton radioBoton2 = new JRadioButton("Opcion 2", false);
        radioBoton2.setBounds(50, 150, 100, 50);
        panel.add(radioBoton2);

        JRadioButton radioBoton3 = new JRadioButton("Opcion 3", false);
        radioBoton3.setBounds(50, 200, 100, 50);
        panel.add(radioBoton3);

        ButtonGroup grupoRadioBotones = new ButtonGroup();
        grupoRadioBotones.add(radioBoton1);
        grupoRadioBotones.add(radioBoton2);
        grupoRadioBotones.add(radioBoton3);
    }

    private void colocarBotonesDeActivacion() {
        JToggleButton botonActivacion1 = new JToggleButton("Opción 1", true);
        botonActivacion1.setBounds(50, 100, 100, 40);
        panel.add(botonActivacion1);

        JToggleButton botonActivacion2 = new JToggleButton("Opción 2", true);
        botonActivacion2.setBounds(50, 150, 100, 40);
        panel.add(botonActivacion2);

        JToggleButton botonActivacion3 = new JToggleButton("Opción 3", true);
        botonActivacion3.setBounds(50, 200, 100, 40);
        panel.add(botonActivacion3);

        ButtonGroup grupoBotonesActivados = new ButtonGroup();
        grupoBotonesActivados.add(botonActivacion1);
        grupoBotonesActivados.add(botonActivacion2);
        grupoBotonesActivados.add(botonActivacion3);
    }

    private void colocarCajasDeTexto() {
        JTextField cajaTexto = new JTextField();
        cajaTexto.setBounds(50, 50, 100, 30);
        cajaTexto.setText("Escribe algo…");
        System.out.println("Texto en la caja: " + cajaTexto.getText()); // Obtenemos e imprimimos en la consola el texto de la caja
        panel.add(cajaTexto);
    }

    private void colocarAreasDeTexto() {
        JTextArea areaTexto = new JTextArea();
        areaTexto.setBounds(20, 20, 300, 200);
        areaTexto.setText("Escriba aquí…");
        areaTexto.append("\nContinúa"); // Añade más texto al area
        areaTexto.setEditable(true); // Permitir editar el área de texto

        System.out.println("El texto es: " + areaTexto.getText()); // Imprimir el texto del área

        panel.add(areaTexto);

        // Barras de desplazamiento
        JScrollPane barrasDesplazamiento = new JScrollPane(areaTexto);
        barrasDesplazamiento.setBounds(20, 20, 300, 200);
        barrasDesplazamiento.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        barrasDesplazamiento.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        panel.add(barrasDesplazamiento);
    }

    private void colocarCasillasDeVerificacion() {
        JCheckBox casillaDeVerificacion1 = new JCheckBox("Aideé", true);
        casillaDeVerificacion1.setEnabled(true); // Habilitar la casilla
        casillaDeVerificacion1.setBounds(20, 20, 100, 40);
        panel.add(casillaDeVerificacion1);

        JCheckBox casillaDeVerificacion2 = new JCheckBox("Berenice");
        casillaDeVerificacion2.setBounds(20, 50, 100, 40);
        panel.add(casillaDeVerificacion2);
        
        JCheckBox casillaDeVerificacion3 = new JCheckBox("Francis");
        casillaDeVerificacion3.setBounds(20, 80, 100, 40);
        panel.add(casillaDeVerificacion3);

        JCheckBox casillaDeVerificacion4 = new JCheckBox("José");
        casillaDeVerificacion4.setBounds(20, 110, 100, 40);
        panel.add(casillaDeVerificacion4);
    }

    private void colocarListasDesplegables() {
        /* String paises[] = {"Aideé", "Berenice", "Francis", "José"};
        
        JComboBox listaDesplegable = new JComboBox(paises);
        listaDesplegable.setBounds(20, 20, 160, 30);
        listaDesplegable.addItem("Poli"); // Añadir objetos a la lista desplegable
        listaDesplegable.setSelectedItem("Berenice"); // Seleccionar el primer objeto visto

        panel.add(listaDesplegable);

        */

        persona persona1 = new persona("Pedro", 21, "Mexicano");
        persona persona2 = new persona("Aideé", 23, "Mexicana");

        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        JComboBox listaDesplegable = new JComboBox(modelo);

        modelo.addElement(persona1);
        modelo.addElement(persona2);

        listaDesplegable.setBounds(20, 20, 200, 30);
        panel.add(listaDesplegable);
    }

    private void colocarCampoDeContraseña() {
        JPasswordField campoContraseña = new JPasswordField();

        campoContraseña.setBounds(20, 20, 150, 30);
        campoContraseña.setText("Aideé es la niña más bonita");

        panel.add(campoContraseña);

        String contraseña = ""; // Se crea una variable para almacenar la contraseña
        for (int i = 0; i < campoContraseña.getPassword().length; i++) { // Obteniendo contraseña
            contraseña += campoContraseña.getPassword()[i]; // Unir los datos de la contraseña
        }
        System.out.println("Contraseña: " + contraseña);
    }

    private void colocarTablas() {
        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("Nombre");
        modelo.addColumn("Edad");
        modelo.addColumn("Nacionalidad");

        String persona1[] = {"Alejandra", "22", "Mexicana"};
        String persona2[] = {"Carmen", "45", "Mexicana"};
        String persona3[] = {"Poli", "50", "Mexicana"};

        modelo.addRow(persona1);
        modelo.addRow(persona2);
        modelo.addRow(persona3);

        JTable tabla = new JTable(modelo);

        tabla.setBounds(20, 20, 300, 200);

        panel.add(tabla);

        JScrollPane scroll = new JScrollPane(tabla, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setBounds(20, 20, 300, 200);
        panel.add(scroll);
    }

    private void colocarListas() {
        DefaultListModel modelo = new DefaultListModel();

        modelo.addElement(new persona("José", 50, "Mexicano"));
        modelo.addElement(new persona("Francis", 50, "Mexicana"));
        modelo.addElement(new persona("Aideé", 23, "Mexicana"));
        modelo.addElement(new persona("Pedro", 50, "Mexicana"));
        modelo.addElement(new persona("Belén", 50, "Mexicana"));
        modelo.addElement(new persona("Antonio", 22, "Estadpunidense"));

        JList lista = new JList(modelo);

        lista.setBounds(20, 20, 200, 300);

        panel.add(lista);

        JScrollPane scroll = new JScrollPane(lista, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setBounds(20, 20, 200, 300);
        panel.add(scroll);
    }
}
