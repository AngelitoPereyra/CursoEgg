/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej12guia7;

import java.util.Arrays;
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
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese una palabra");
        String palabra=leer.next();
        
        
        
        char[] Vector=new char[palabra.length()];
        
        for (int i = 0; i < palabra.length(); i++) {
            Vector[i]=palabra.charAt(i);
            
        }
        System.out.println(Arrays.toString(Vector));
    }
    
}