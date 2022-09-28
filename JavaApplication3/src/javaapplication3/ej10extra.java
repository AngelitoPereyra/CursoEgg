/*
Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
 */
package javaapplication3;
import java.util.Scanner;
/**
 *
 * @author Agus
 */
public class ej10extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int n1=(int)(Math.random()*10);
        int n2=(int)(Math.random()*10);
        int n3=n1*n2;
        int cont = 0;
        System.out.println("La maquina a generado dos numeros del 1 al 10 aleatoriamente \ny los a multiplicado.\nSerás capaz de adivinar el resultado?");
        System.out.println("Ingrese el resultdo de la misteriosa multiplicacion"+n3);
        int n = leer.nextInt();
        while (n3!=n){
            cont++;
            if(n<n3){
                System.out.println("Aun falta mucho camino por recorrer");
                System.out.println("Ingrese nuevamente un numero, usted ah fallado "+ cont +" veces");
                n = leer.nextInt();}
            if(n>n3){
                System.out.println("nunca le ah pasado que va distraído y se pasa de su destino?");
                System.out.println("Ingrese nuevamente un numero, usted ah fallado "+ cont +" veces");
                n= leer.nextInt();
            }
        }
        if(n==n3){
            System.out.println("Usted acaba de adivinar una multiplicacion imposible!!    "+n1+" * "+n2+" = "+n3+ "\nFelicitacioones!!");
            System.out.println("Y lo ah logrado en tan solo "+ cont + " intentos!!!");
        }
    }
    
}
