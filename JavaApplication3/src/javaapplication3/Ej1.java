/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;
    import java.util.Scanner;
/**
 *
 * @author Agus
 */
public class Ej1 {
    
    public static void main(String[] Args){
      System.out.print("Escriba un numero del 1 al 10  ");
        Scanner leer = new Scanner(System.in);
        int num = leer.nextInt();
        while(num>10 || num<0){
            System.out.print("Ingrese un numero correcto del 1 al 10 ");
            num = leer.nextInt();
        if (num>=1 && num<=10){
            System.out.println("Su numero es el ------ " + num);
        }
        }
    }
}
