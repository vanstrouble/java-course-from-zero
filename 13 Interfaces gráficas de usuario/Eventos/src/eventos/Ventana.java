
package eventos;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ventana extends JFrame{
    private JPanel panel;
    private JLabel saludo; 
    private JTextField cajaTexto;
    private JButton boton;
    private JTextArea areaTexto;
    
    public Ventana(){
        setBounds(50, 50, 500, 500); //Posicion y tamaño de la ventana
        setTitle("Eventos"); //Título de la ventana
        
        iniciarComponentes();
        
        setDefaultCloseOperation(EXIT_ON_CLOSE); //Que se detenga la ejecución al cerrar
    }
    
    private void iniciarComponentes(){
        colocarPanel();
        // colocarEtiqueta();
        colocarCajaDeTexto();
        colocarAreaTexto();
        // colocarBoton();
    }
    
    private void colocarPanel(){
        panel = new JPanel();
        panel.setLayout(null); //Desactivamos el diseño del panel
        this.add(panel);
        
        // eventoDeMovimientoRaton();
        // eventoRuedaDelRaton();
    }

    private void colocarEtiqueta(){
        JLabel etiqueta = new JLabel("Ingrese su nombre: ");
        etiqueta.setBounds(30, 10, 200, 30);
        etiqueta.setFont(new Font("San Francisco",0,17));
        panel.add(etiqueta);
    }

    private void colocarCajaDeTexto(){
        cajaTexto = new JTextField();
        cajaTexto.setBounds(20, 30, 150, 30);
        panel.add(cajaTexto);
        
        eventosDelTeclado();
    }

    private void colocarAreaTexto(){
        areaTexto = new JTextArea();
        areaTexto.setBounds(230,30,200,300);
        panel.add(areaTexto);
        
        JScrollPane scroll = new JScrollPane(areaTexto,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setBounds(230,20,200,300);
        panel.add(scroll);
    }
    
    private void colocarBoton(){
        boton = new JButton("¡Pulsa aquí!");
        boton.setBounds(150, 350, 150, 40);
        boton.setFont(new Font("arial",0,15));
        panel.add(boton);

        // saludo = new JLabel();
        // saludo.setBounds(50, 200, 300, 40);
        // saludo.setFont(new Font("Arial", 1, 20));
        // panel.add(saludo);

        //eventoOyenteDeAccion();
        // eventoOyenteDeRaton();

    }

    private void eventoOyenteDeAccion(){
        //Agregando Evento de tipo ActionListener
        ActionListener oyenteDeAccion = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                saludo.setText("Hola " + cajaTexto.getText());
            }
        };
        
        boton.addActionListener(oyenteDeAccion);
    }

    private void eventoOyenteDeRaton() {
        // Agregando oyente de Ratón - MouseListener
        // Se pueden implementar con cualquier componente

        MouseListener oyenteDeRaton = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) { // Presionar dentro del botón
                // areaTexto.append("mouseClicked\n");
                if (e.isAltDown()) {
                    areaTexto.append("Alt or Opt\n");
                } else if (e.isControlDown()) {
                    areaTexto.append("Control\n");
                } else if (e.isShiftDown()) {
                    areaTexto.append("Shift\n");
                } else if (e.isMetaDown()) {
                    areaTexto.append("Clic derecho\n");
                } else {
                    areaTexto.append("Clic izquierdo\n");
                }

                if (e.getClickCount() == 2) {
                    areaTexto.append("Doble clic\n");
                }
            }

            @Override
            public void mousePressed(MouseEvent e) { // Entrar en el botón
                // areaTexto.append("mousePressed\n");
            }

            @Override
            public void mouseReleased(MouseEvent e) { // Presionar y soltar dentro o fuera del botón
                // areaTexto.append("mouseReleased\n");
            }

            @Override
            public void mouseEntered(MouseEvent e) { // Entrar en el botón
                // areaTexto.append("mouseEntered\n");
            }

            @Override
            public void mouseExited(MouseEvent e) { // Salir del botón
                // areaTexto.append("mouseExited\n");
            }
        };

        boton.addMouseListener(oyenteDeRaton);
    }

    private void eventoDeMovimientoRaton() {
        MouseMotionListener oyenteMovimientoRaton = new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                areaTexto.append("mouseDragged\n");
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                areaTexto.append("mouseMoved\n");
            }
        };

        panel.addMouseMotionListener(oyenteMovimientoRaton);
    }

    private void eventoRuedaDelRaton() {
        MouseWheelListener ruedaRaton = new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                // areaTexto.append("Moviendo la rueda del ratón\n");
                if (e.getPreciseWheelRotation() == -1) {
                    areaTexto.append("Rueda hacia arriba\n");
                } else if (e.getPreciseWheelRotation() == 1) {
                    areaTexto.append("Rueda hacia abajo\n");
                }
            }
        };

        panel.addMouseWheelListener(ruedaRaton);
    }

    private void eventosDelTeclado() {
        KeyListener eventoTeclado = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) { // Presionar alguna tecla que no sea de función
                // areaTexto.append("keyTyped\n");
            }

            @Override
            public void keyPressed(KeyEvent e) { // Presionar cualquier tecla
                // areaTexto.append("KeyPressed\n");
            }

            @Override
            public void keyReleased(KeyEvent e) { // Presionar y soltar cualquier tecla
                // areaTexto.append("keyReleased\n");
                if (e.getKeyChar() == 'p') { // Indicar qué letra queremos que marque al ejecutarse
                    areaTexto.append("Letra p");
                } else if (e.getKeyChar() == '\n') {
                    areaTexto.append("Enter\n");
                } else if (e.getKeyChar() == ' ') {
                    areaTexto.append("Espacio\n");
                }
            }
        };

        cajaTexto.addKeyListener(eventoTeclado);
    }

    /*
    
    private void eventoRuedaDelRaton(){
        MouseWheelListener ruedaRaton = new MouseWheelListener() {

            @Override
            public void mouseWheelMoved(MouseWheelEvent mwe) {
                if(mwe.getPreciseWheelRotation() == -1){
                    areaTexto.append("Rueda hacia arriba\n");
                }
                if(mwe.getPreciseWheelRotation() == 1){
                    areaTexto.append("Rueda hacia abajo\n");
                }
            }
        };
        
        panel.addMouseWheelListener(ruedaRaton);
    }
    
    private void eventosDelTeclado(){
        KeyListener eventoTeclado = new KeyListener() {

            @Override
            public void keyTyped(KeyEvent ke) {
                //areaTexto.append("keyTyped\n");
            }

            @Override
            public void keyPressed(KeyEvent ke) {
                //areaTexto.append("keyPressed\n");
            }

            @Override
            public void keyReleased(KeyEvent ke) {
                //areaTexto.append("keyReleased\n");
                if(ke.getKeyChar() == 'p'){
                    areaTexto.append("Letra p\n");
                }
                if(ke.getKeyChar() == '\n'){
                    areaTexto.append("Enter\n");
                }
                if(ke.getKeyChar() == ' '){
                    areaTexto.append("Espacio\n");
                }
            }
        };
        
        cajaTexto.addKeyListener(eventoTeclado);
    }

     */
}
