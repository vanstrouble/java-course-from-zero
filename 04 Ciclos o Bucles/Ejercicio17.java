import javax.swing.JOptionPane;

/* Ejercicio 17
    Una empresa que se dedica a la venta de desinfectantes necesita un programa para gestionar las facturas. 
    En cada factura figura: el código del artículo, la cantidad vendida en litros y el precio por litro. 
    Se pide de 5 facturas introducidad: 
    - Facturación total,
    - cantidad en litros vendidos del artículo 1 y
    - cuántas facturas se emitieron de más de $600.
*/

public class Ejercicio17 {
    public static void main(String[] args) {
        int codigo, litros, litrosArticulo1 = 0, conteoMas600 = 0;
        float precioLitro, importeFactura, facturaTotal = 0;

        for (int i = 1; i <= 5; i++) {
            codigo = Integer.parseInt(JOptionPane.showInputDialog("Factura Nº: " + i + "\nDigite el código: "));
            litros = Integer.parseInt(JOptionPane.showInputDialog("Factura Nº: " + i + "\nDigite la cantidad de litrros: "));
            precioLitro = Float.parseFloat(JOptionPane.showInputDialog("Digite el precio x litro: "));

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