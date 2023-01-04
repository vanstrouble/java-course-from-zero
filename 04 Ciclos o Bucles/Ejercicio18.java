import javax.swing.JOptionPane;

/* Ejercicio 18
    Hacer modificaciones al ejercicio anterior suponiendo que no se introduce el precio por litro.
    Solo existen tres productos con precios: 
    1. 0.6 $/litro
    2. 3 $/litro
    3. 1.25 $/litro 
*/

public class Ejercicio18 {
    public static void main(String[] args) {
        int codigo, litros, litrosArticulo1 = 0, conteoMas600 = 0;
        float precioLitro = 0, importeFactura, facturaTotal = 0;

        for (int i = 1; i <= 5; i++) {
            
            do {
                codigo = Integer.parseInt(JOptionPane.showInputDialog("Factura Nº: " + i + "\nDigite el código: "));
            } while (codigo < 1 || codigo > 3);

            litros = Integer.parseInt(JOptionPane.showInputDialog("Factura Nº: " + i + "\nDigite la cantidad de litrros: "));

            switch (codigo) {
                case 1: precioLitro = 0.6f;
                    break;
                case 2: precioLitro = 3f;
                    break;
                case 3: precioLitro = 1.25f;
                    break;
            }

            importeFactura = (float)(litros * precioLitro); // Importe x factura
            facturaTotal += importeFactura;  // Suma iterativa  de las facturas

            if (codigo == 1) {
                litrosArticulo1 += litros;
            }
            if (importeFactura > 600) {
                conteoMas600++;
            }
        }
        System.out.println("Resumen de ventas");
        System.out.println("Facturación total: " + facturaTotal);
        System.out.println("Cantidad en litros vendidos del artículo 1: " + litrosArticulo1);
        System.out.println("Cantidad de facturas mayores a $600: " + conteoMas600);
    }
}