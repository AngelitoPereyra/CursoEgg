/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package javaapplication3;
import java.util.Scanner;
/**
 *
 * @author Agus
 */
public class ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        System.out.println("Tu palabra ");
        String Palabra = Leer.nextLine();
        System.out.println("Tu palabra en mayusculas " + Palabra.toUpperCase());
        System.out.println("Tu palabra en minusculas " + Palabra.toLowerCase());
    }
    
}
