/*
 Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.
 */
package javaapplication3;
    import java.util.Scanner;
/**
 *
 * @author Agus
 */
public class ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        System.out.print("Escriba su nombre");
        String nombre = Leer.next();
        System.out.println("Su nombre es : " + nombre);
    }
    
}
