import javax.swing.JOptionPane;

/* Ejercicio 14
    Hacer un programa que pase de Kg a otra unidad de medida de masa, 
    mostrar en pantalla un menú con las opciones disponibles. 
 */

public class Ejercicio14 {
    public static void main(String[] args) {
        byte opc;
        float kilos = 0, conversion = 0;


        do {
            kilos = Float.parseFloat(JOptionPane.showInputDialog("\tCONVERSOR DE KILOGRAMOS\n\n" + "Digite los Kilogramos: "));
            opc = Byte.parseByte(JOptionPane.showInputDialog("\tCONVERSOR DE KILOGRAMOS\n\n" 
            + "1. Hectogramos" 
            + "\n2. Decagramos" 
            + "\n3. Gramos" 
            + "\n4. Decigramos" 
            + "\n5. Centigramo" 
            + "\n6. Miligramo" 
            + "\n7. Libras"
            + "\n8. Toneladas"
            + "\n9. Newtons"
            + "\n\n0. Cancelar y salir"
            + "\nDigite la opción "));

            if (opc >= 0 && opc <= 9){
                switch (opc) {
                    case 1: conversion = kilos * 10;
                            JOptionPane.showMessageDialog(null, "\tConversión éxitosa\n" + "Son " + conversion + " hectogramo(s)");
                        break;
                    case 2: conversion = kilos * 100;
                            JOptionPane.showMessageDialog(null, "\tConversión éxitosa\n" + "Son " + conversion + " decagramo(s)");
                        break;
                    case 3: conversion = kilos * 1000;
                            JOptionPane.showMessageDialog(null, "\tConversión éxitosa\n" + "Son " + conversion + " gramo(s)");
                        break;
                    case 4: conversion = kilos * 10000;
                            JOptionPane.showMessageDialog(null, "\tConversión éxitosa\n" + "Son " + conversion + " decigramo(s)");
                        break;
                    case 5: conversion = kilos * 100000;
                            JOptionPane.showMessageDialog(null, "\tConversión éxitosa\n" + "Son " + conversion + " centigramo(s)");
                        break;
                    case 6: conversion = kilos * 1000000;
                            JOptionPane.showMessageDialog(null, "\tConversión éxitosa\n" + "Son " + conversion + " miligramo(s)");
                        break;
                    case 7: conversion = kilos * 2.2046f;
                            JOptionPane.showMessageDialog(null, "\tConversión éxitosa\n" + "Son " + conversion + " libra(s)");
                        break;
                    case 8: conversion = kilos / 1000;
                            JOptionPane.showMessageDialog(null, "\tConversión éxitosa\n" + "Son " + conversion + " tonelada(s)");
                        break;
                    case 9: conversion = kilos * 9.80665f;
                            JOptionPane.showMessageDialog(null, "\tConversión éxitosa\n" + "Son " + conversion + " Newtons(s)");
                        break;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Opción fuera de rango" + "\nIngrese una opción válida");
            }
        } while (opc != 0);
    }
}