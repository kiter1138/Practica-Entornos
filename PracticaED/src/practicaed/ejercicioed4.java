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
        
        int b50=dinero/50;
        int b20=(dinero%50)/20;
        int b10=((dinero%50)%20)/10;
        int b5=(((dinero%50)%20)%10)/5;
        int m2=((((dinero%50)%20)%10)%5)/2;
        int m1=((((dinero%50)%20)%10)%5)%2;
        
        System.out.println(+ dinero + " euros se descomponen en " + b50 + " billete/s de 50€, " + b20 + " billete/s de 20€, " + b10 + " billete/s de 10€, " + b5 + " billete/s de 5€, " + m2 + " moneda/s de 2€ y " + m1 + " moneda/s de 1€.");
        
    }
    
}
