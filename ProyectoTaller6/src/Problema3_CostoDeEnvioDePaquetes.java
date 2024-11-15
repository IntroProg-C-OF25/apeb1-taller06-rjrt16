
/** Un servicio de envío cobra diferentes tarifas según la región y el peso del paquete.
 * Si el peso es menor de 5 kg y la región es "local", el costo es de $5.
 * Si pesa entre 5 y 10 kg, el costo es de $10 para la región "nacional".
 * Para cualquier otro caso, el costo es de $15.
 *
 * @author Ricardo Rosales
 */
import java.util.Scanner;

public class Problema3_CostoDeEnvioDePaquetes {

    public static void main(String[] args) {
        Scanner an = new Scanner(System.in);
        int peso;
        double costo;
        String region;
        System.out.print("Dame el peso del producto: ");
        peso = an.nextInt();
        System.out.print("Dame la region para el envio: ");
        region = an.next();
        if ((peso < 5) && (region.equals("local"))) {
            costo = 5;
            System.out.println("Tarifa por compra = " + costo);
        } else {
            if ((peso >= 5) && (peso <= 10) && (region.equals("nacional"))) {
                costo = 10;
                System.out.println("Tarifa por compra = " + costo);
            } else {
                costo = 15;
                System.out.println("Tarifa por compra = " + costo);
            }
        }

    }
}
/* run:
Dame el peso del producto: 3
Dame la region para el envio: local
Tarifa por compra = 5.0
*/