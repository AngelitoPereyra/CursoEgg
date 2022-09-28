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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
       boolean l=true;
        System.out.println("¿Acaso tu eres mi madre?, Dime tu nombre!");
       String nombre = leer.nextLine();
       do{
           System.out.println("vos no sos mi mama  "+nombre);
           
           nombre = leer.nextLine();
           if (nombre.equals("irene")){
               l=false;
           }
       }while(l==true);
        System.out.println("hola mamaa");
    }
    
}
