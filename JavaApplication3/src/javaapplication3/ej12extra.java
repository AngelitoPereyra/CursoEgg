/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author Agus
 */
public class ej12extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][][] matriz = new int[1000][1000][10];
        int c=0;
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 100; j++) {
                for (int k = 0; k < 10; k++) {
                    matriz[i][j][k]=c++;
                    System.out.println(matriz[i]+"-"+matriz[j]+"-"+matriz[k]);
                }
                
            }
            
        }
        
    }
    
}
