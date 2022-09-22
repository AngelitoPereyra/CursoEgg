/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
 */
package javaapplication3;
import java.util.Scanner;
/**
 *
 * @author Agus
 */
public class ej13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i,j;
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el tamaño de los lados");
        int l =leer.nextInt();
        for (i=0;i<=l-1;i++){
            for(j=0;j<=l-1;j++){
                if((i>0)&&(i<l-1)&&(j>0)&&(j<l-1)){
                    System.out.print(" ");
                }
                else
                    System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}
