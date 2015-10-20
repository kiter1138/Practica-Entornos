package practicaed;

/**
 *
 * @author jafrancom01
 */
public class ejercicioed3 {
     void ejercicioed3() {
        int a=3, b=6, c;
        c= a / b;
        System.out.println("El valor de c es: " + c); //C vale 0 porque la division solo da decimales y hemos declarado la variable como int
        c= a % b;
        System.out.println("El valor de c es: " + c); //C vale 3 porque es el modulo de dividir 3 entre 6
        a++;
        System.out.println("El valor de a es: " + a); //A vale 4 porque al poner a++ se incrementa en 1 el valor del numero
        ++a;
        System.out.println("El valor de a es: " + a); //A vale 5 porque al poner ++a se incrementa su valor en 1
        c= ++ a + b++;
        System.out.println("El valor de a es: " + a); //A vale 6 porque en la suma anterior al poner ++a se incremento su valor en 1
        System.out.println("El valor de a es: " + b); //B vale 7 porque en la suma anterior al poner b++ se incremento su valor en 1
        System.out.println("El valor de a es: " + c); //C vale 12 porque el valor de a se incrementa durante la operacion de suma y su valor es 6 mientras que el de b se incrementa despues de realizar la operacion de suma y es 7
        
        c= ++a + ++b;
        System.out.println("El valor de a es: " + a); //A vale 7 porque en la suma anterior al poner ++a se incremento su valor en 1
        System.out.println("El valor de a es: " + b); //B vale 8 porque en la suma anterior al poner ++b se incrementa su valor en 1
        System.out.println("El valor de a es: " + c); //C vale 15 porque durante la suma de a y b se les incrementa a cada uno su valor en 1
        
    }
}
