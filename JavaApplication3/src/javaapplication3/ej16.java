/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Agus
 */
public class ej16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); 
        Random entero = new Random();
        int n=leer.nextInt();
        int[] vector = new int[n];
        for (int i = 0; i < vector.length; i++) {                   
            vector[i]=entero.nextInt(100);
            System.out.println("Vector"+"["+(i+1)+"]: "+vector[i]);
        }
        System.out.println("Que numero desea buscar");
        int n1=leer.nextInt();
        
         for (int i = 0; i < vector.length; i++) {
            if(vector[i]==n1){
                System.out.println("se encuentra en la pocision: " + (i+1));
            }
        }
            
        }
     
        
    }
    

