package practicaed;

/**
 *
 * @author bacabanillasv01
 */
import java.util.Scanner;

public class ejercicioed2 {

    void ejercicioed2() {

        Scanner teclado = new Scanner(System.in);

        int numero;

        System.out.print("\t Introduce un número de cuatro cifras: ");

        numero = teclado.nextInt();

        int primer = numero / 1000;
        int segundo = (numero % 1000) / 100;
        int tercer = ((numero % 1000) % 100) / 10;
        int cuarto = ((numero % 1000) % 100) % 10;

        System.out.println("El primer dígito es: " + primer);
        System.out.println("El segundo dígito es: " + segundo);
        System.out.println("El tercer dígito es: " + tercer);
        System.out.println("El cuarto dígito es: " + cuarto);
    }

}
