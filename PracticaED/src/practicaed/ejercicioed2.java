package practicaed;

/**
 *
 * @author bacabanillasv01
 */
import java.util.Scanner;

public class ejercicioed2 {

    void ejercicioed2() {

        Scanner teclado = new Scanner(System.in);

        int num;

        System.out.print("\t Introduce un número de cuatro cifras: ");

        num = teclado.nextInt();

        int primer = num / 1000;
        int segundo = (num % 1000) / 100;
        int tercer = ((num % 1000) % 100) / 10;
        int cuarto = ((num % 1000) % 100) % 10;

        System.out.println("El primer dígito del numero introducido es: " + primer);
        System.out.println("El segundo dígito del numero introducido es: " + segundo);
        System.out.println("El tercer dígito del numero introducido es: " + tercer);
        System.out.println("El cuarto dígito del numero introducido es: " + cuarto);
    }

}
