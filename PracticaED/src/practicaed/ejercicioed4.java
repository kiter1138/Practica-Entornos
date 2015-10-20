package practicaed;
import java.util.Scanner;
/**
 *
 * @author bacabanillasv01
 */
public class ejercicioed4 {
    
    void ejercicioed4(){
        
        int dinero; 
        
        Scanner teclado = new Scanner(System.in);  
        
        System.out.print("Por favor, indique una cantidad de dinero: ");
        
        dinero=teclado.nextInt();
        
        int cincuenta=dinero/50;
        int veinte=(dinero%50)/20;
        int diez=((dinero%50)%20)/10;
        int cinco=(((dinero%50)%20)%10)/5;
        int dos=((((dinero%50)%20)%10)%5)/2;
        int uno=((((dinero%50)%20)%10)%5)%2;
        
        System.out.println(+ dinero + " euros se descomponen en " + cincuenta + " billete/s de 50€, " + veinte + " billete/s de 20€, " + diez + " billete/s de 10€, " + cinco + " billete/s de 5€, " + dos + " moneda/s de 2€ y " + uno + " moneda/s de 1€.");
        
    }
    
}
