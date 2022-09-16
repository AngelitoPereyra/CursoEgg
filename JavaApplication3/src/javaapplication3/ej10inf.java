/*
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
 */
package javaapplication3;
import java.util.Scanner;
/**
 *
 * @author Agus
 */
public class ej10inf {
    public static void main(String[] Args){
        System.out.println("Ingrese un numero del 1 al 20 ");
        Scanner leer = new Scanner(System.in);
      
        int n1 = leer.nextInt();
        do{
        if (n1<1 || n1>20){
            System.out.println("Ingrese un numero del 1 al 20 ");
            n1 = leer.nextInt(); }
        }while(n1<1 || n1>20);
        int n2 = leer.nextInt();
        do{
        if (n2<1 || n2>20){
            System.out.println("Ingrese un numero del 1 al 20 ");
            n2 = leer.nextInt();}
        }while(n2<1 || n2>20);
        int n3 = leer.nextInt();
        do{
        if (n3<1 || n3>20){
            System.out.println("Ingrese un numero del 1 al 20 ");
            n3 = leer.nextInt();}
        }while(n3<1 || n3>20);
        int n4 = leer.nextInt();
        do{
        if (n4<1 || n4>20){
            System.out.println("Ingrese un numero del 1 al 20 ");
            n4 = leer.nextInt();}
        }while(n4<1 || n4>20);
        
        System.out.print(n1);
        for (int i = 0; i < n1; i++) {
            System.out.print("*");
            }
             System.out.println("");
             
        System.out.print(n2);
        for (int i = 0; i < n2; i++) {
            System.out.print("*");
            }
             System.out.println("");
            
        System.out.print(n3);
        for (int i = 0; i < n3; i++) {
            System.out.print("*");
            }
             System.out.println("");
            
        System.out.print(n4);
        for (int i = 0; i < n4; i++) {
            System.out.print("*");
            }
             System.out.println("");
        }

}

