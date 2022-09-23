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
public class ej12extranohacks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][][] matriz = new int[1000][100][10];
        String[][][] E = new String[1000][100][10];
        int c=0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    matriz[i][j][k]=c;
                    c++;
                   
                }                
            }            
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                   E[i][j][k]=Integer.toString(matriz[i][j][k]);
                   if(E[i][j][k].substring(i).contains("3")){
                       E[i][j][k].substring(i).contains("3").c
                       
                      
                       
                   }
                    System.out.println(E[i][j][k]);
                }
    }
    
}
    }
}
