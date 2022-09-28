/*
Crear un programa que dibuje una escalera de números, donde cada línea de números
comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
usuario al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123
 */
package javaapplication3;
import java.util.Scanner;
/**
 *
 * @author Agus
 */
public class ej13extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de escalones que desea en su escalera numerica");
        int n=leer.nextInt(); 
        int c=1;
        int[] cont=new int[n];
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= c; j++) {
                System.out.print(j);
               
            }
            System.out.println("");
            c++;
            
        }
    }
    
}
