/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_extra_java;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jeron
 */
public class Extra_23 {

    public static void main(String[] args){
        Random aleatorio = new Random();
        Scanner sc = new Scanner(System.in);
        String frase,letra;
        String[][] matriz = new String[20][20];
        int num, cord1 = 0, cord2 = 0;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                matriz[i][j] = " ";
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("------------");
            System.out.println("Ingresa la palabra " + (i + 1));
            frase = sc.nextLine();
            if (frase.length() <= 5 && frase.length() >= 3) {
                cord1 = aleatorio.nextInt(20 - 0 + 1) + 0;
                cord2 = aleatorio.nextInt(15 - 0 + 1) + 0;
                for (int j = 0; j < frase.length(); j++) {
                    letra = frase.substring(j, j+1);
                    matriz[cord1][cord2] = letra;
                    cord2++;
                }
            } else {
                System.out.println("La palabra debe ser minimo de 3 o maximo de 5 caracteres");
                i -= 1;
            }
        }
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (matriz[i][j].equals(" ")) {
                    num = (int) (Math.random() * 10);
                    matriz[i][j] = num + "";
                }
            }
        }
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }
}
