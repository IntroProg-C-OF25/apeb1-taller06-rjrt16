
/**
 *Dado un número del 1 al 4 que representa una operación matemática básica
 * (suma, resta, multiplicación, división),
 * muestra el nombre de la operación correspondiente.
 * Por ejemplo, si el usuario ingresa 1, debe mostrar "Suma"; si ingresa 2, debe mostrar "Resta", y así sucesivamente.
 *
 * @author Ricardo Rosales
 */
import java.util.Scanner;

public class Problema5_DeterminarElTipoDeOperacionMatematica {

    public static void main(String[] args) {
        Scanner an = new Scanner(System.in);
        int operador;
        System.out.print("Dame un numero del 1 al 4: ");
        operador = an.nextInt();
        switch (operador) {
            case 1:
                System.out.println("Suma");
                break;
            case 2:
                System.out.println("Resta");
                break;
            case 3:
                System.out.println("Multiplicacion");
                break;
            case 4:
                System.out.println("Division");
                break;
            default:
                System.out.println("Error");
                break;

        }
    }
}
