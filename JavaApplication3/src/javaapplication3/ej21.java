/*
 Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
la matriz M en la cual empieza el primer elemento de la submatriz P.
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author Agus
 */
public class ej21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] M = new int[10][10];
        int[][] P = new int[3][3];

        Relleno(M, P);
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (ComparacionFilas(M, P, i, j)) {
                    System.out.println("La matriz se encuentra alojada en la pocision[" + i + "][" + j + "]");
                } else {
                    System.out.println("No se encuentra");
                }
            }
        }
    }

    public static void Relleno(int[][] M, int[][] P) {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                M[i][j] = (int) (Math.random() * 10);
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                P[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    public static boolean ComparacionFilas(int[][] M, int[][] P, int f, int n) {
        boolean flag = true;
        int fila = 0;
        int columna = 0;
        for (int i = f; i < f + 3; i++) {
            for (int j = n; j < n + 3; j++) {
                if (M[i][j] != P[fila][columna]) {
                    flag = false;
                }
                columna++;

            }
            columna = 0;
            fila++;
        }
        return flag;
    }
}
