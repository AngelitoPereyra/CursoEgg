/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */
package javaapplication3;
import java.util.Scanner;
/**
 *
 * @author Agus
 */
public class ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba un numero maximo");
        int n = leer.nextInt();
        int c = 0, n1 = 0;
        do{
        System.out.print("Escriba numeros para sumar");
        n1=leer.nextInt();
        c= c + n1;
        }while (c<n);
            
    }
    
}
