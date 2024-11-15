
/** Dado tres valores que representan las longitudes de los lados de un triángulo,
 * determinar su tipo
 *
 * @author Ricardo Rosales
 */
import java.util.Scanner;

public class Problema2_ClasificaciónDeUnTriángulo {

    public static void main(String[] args) {
        Scanner an = new Scanner(System.in);
        int lado1, lado2, lado3, sumaLados;
        System.out.print("Dame el lado 1 del trinagulo: ");
        lado1 = an.nextInt();
        System.out.print("Dame el lado 2 del triangulo: ");
        lado2 = an.nextInt();
        System.out.print("Dame el lado 3 del triangulo: ");
        lado3 = an.nextInt();
        sumaLados = lado1 + lado2;
        if ((lado1 == lado2) && (lado1 == lado3)) {
            System.out.println("El triangulo es equilatero");
        } else {
            if ((lado1 != lado2) && (lado1 == lado3)) {
                System.out.print("El triangulo es isoceles");
            } else {
            }
            if ((lado1 == lado2) && (lado1 != lado3)) {
                System.out.print("El triangulo es isoceles");
            } else {
                if (sumaLados != lado3) {
                    System.out.print("No es triangulo");
                } else {
                    if ((lado1 != lado2) && (lado1 != lado3)) {
                        System.out.print("El triangulo es escaleno");
                    } else {

                    }
                }
            }
        }
    }
}
