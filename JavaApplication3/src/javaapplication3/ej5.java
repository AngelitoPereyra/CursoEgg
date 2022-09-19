/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 */
package javaapplication3;
import java.util.Scanner;
/**
 *
 * @author Agus
 */
public class ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int n = leer.nextInt();
        System.out.println("tu numero es "+n+", multiplicado x2 " + n*2 + ", multix3 " + n*3 + ", Raiz cuadrada " + Math.sqrt(n) );
    }
    
}
