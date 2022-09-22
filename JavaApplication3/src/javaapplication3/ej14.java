/*
Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
package javaapplication3;
import java.util.Scanner;
/**
 *
 * @author Agus
 */
public class ej14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("ingrese la cantidad de euros a convertir: ");
        double n1 = leer.nextDouble();
        System.out.println("El cambio de divisas es: ");
        System.out.println("\"* 0.86 libras es un 1 €\\n\"");
        System.out.println("\"* 1.28611 $ es un 1 €\\n\"");
        System.out.println("\"* 129.852 yenes es un 1 €\")");
        System.out.println("A que moneda desea cambiar? ");
        String moneda = leer.nextLine();
        cambio(moneda,n1);
        
    }


public static void cambio(String moneda, double n1){
    
 
    
    switch(moneda){
        case "libras":
            System.out.println("Su valor en libras es :" + n1*0.86 + moneda);
            break;
        case "dolar":
            System.out.println("su valor en dolar es : " + n1*1.28611 + moneda);
            break;
        case "yenes":
            System.out.println("su valor en yenes es : " + n1*129.852 + moneda);
            break;
             
    
        }
      
}

}




