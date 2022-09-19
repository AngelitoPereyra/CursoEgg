/*
Crear un programa que dado un numero determine si es par o impar.
 */
package javaapplication3;
import java.util.Scanner;
/**
 *
 * @author Agus
 */
public class ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print ("Ingrese un numero");
        Scanner leer = new Scanner(System.in);
        int n = leer.nextInt();
        if (n%2==0){
            System.out.println("Su numero es par");}
        else 
            System.out.println("Su numero es impar");
    }
    
}
