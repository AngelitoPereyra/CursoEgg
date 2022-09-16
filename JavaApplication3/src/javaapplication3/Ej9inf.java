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
public class Ej9inf {

    public static void main(String[] Args){
        
        Scanner leer = new Scanner(System.in);
        int cont = 0;
        int sum = 0;
        int n1 = 0;
        do{
            System.out.print("Escribir un numero ");
         n1 = leer.nextInt();
        cont = cont+1 ;
        sum = sum + n1;
        if (n1 == 0){
           // System.out.println("La suma total es" + sum);
            System.out.println("usted ingreso el 0, nos vimo ");
            break;
        }
        } while(cont <= 19);
        
        System.out.println("La suma total es " + sum);

    }
}