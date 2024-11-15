
/**
 *La empresa inicialmente venderá solo 2 tipos de productos distintos, a costos variantes.
 * Al costo total de la factura, se debe incluir los gastos por concepto de transporte/envío del paquete,
 * del cual no se aplican ningún tipo de descuentos o impuestos dada la excepción descrita en el punto 3.b.
 * El objetivo es presentar al usuario los detalles de su compra: costos, impuestos, descuentos,
 * monto final dadas las siguientes condiciones: a. Si el subtotal de la compra (sin descuentos o gastos de envío),
 * supera los $1000, se le otorga un 20% de descuento; y si es al menos los $1000 el descuento es como mínimo 5%. b.
 * Adicional, si la compra es mayor a $5000, el envío será gratuito.
 * c. El IVA del 10% se debe aplicar a todos los artículos antes de agregar cualquier tipo de descuesto o promoción.
 *
 * @author Ricardo Rosales
 */
import java.util.Scanner;

public class Problema1_FacturaciónDe2Productos {

    public static void main(String[] args) {
        Scanner an = new Scanner(System.in);
        double costoProd1, costoProd2, costoEnvio, costoFinal, iva, subTotal, descuento;

        System.out.print("Ingrese el costo del producto 1: ");
        costoProd1 = an.nextDouble();

        System.out.print("Ingrese el costo del producto 2: ");
        costoProd2 = an.nextDouble();

        System.out.print("Ingrese el costo de envio: ");
        costoEnvio = an.nextDouble();

        iva = (costoProd1 + costoProd2) * 0.1;
        subTotal = iva + (costoProd1 + costoProd2);
        descuento = subTotal * 0.05;

        if ((subTotal >= 1000) && (subTotal < 5000)) {
            System.out.println("Tiene descuento del 20%");
            descuento = (subTotal * 0.2);
            costoFinal = subTotal - descuento + costoEnvio;
            System.out.println("Costo final = " + costoFinal);
        } else {
            System.out.println("Tiene descuento del 20% y el envio es gratuito");
            descuento = (subTotal * 0.2);
            costoFinal = subTotal - descuento;
            System.out.println("Costo final = " + costoFinal);
        }
    }
}
/*run:
Ingrese el costo del producto 1: 1000
Ingrese el costo del producto 2: 1000
Ingrese el costo de envio: 100
Tiene descuento del 20%
Costo final = 1860.0
*/