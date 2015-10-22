package practicaed;

/**
 *
 * @author jafrancom01
 */
public class ejercicioed3 {
     void ejercicioed3() {
        int a=3, b=6, c;
        c= a / b;
        System.out.println("El valor de c es: " + c);
        c= a % b;
        System.out.println("El valor de c es: " + c); 
        a++;
        System.out.println("El valor de a es: " + a); 
        ++a;
        System.out.println("El valor de a es: " + a); 
        c= ++ a + b++;
        System.out.println("El valor de a es: " + a); 
        
        System.out.println("El valor de a es: " + b); 
        System.out.println("El valor de a es: " + c); 
        
        c= ++a + ++b;
        System.out.println("El valor de a es: " + a); 
        System.out.println("El valor de a es: " + b); 
        System.out.println("El valor de a es: " + c); 
        
    }
}
