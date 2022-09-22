/*
 Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package javaapplication3;
import java.util.Scanner;
/**
 *
 * @author Agus
 */
public class ej17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la dimension del vector");
        int n=leer.nextInt();
        int[] vec = new int [n];
        int c=0, c1=0,c2=0,c3=0,c4=0;
        for (int i = 0; i < vec.length; i++) {
            vec[i]= (int)(Math.random()*100000);            
        }
        for (int i = 0; i < vec.length; i++) {
            if (vec[i]<10){
                c++;        
            }
            else if((vec[i]>10)&&(vec[i]<100)){
                    c1++;
        }
               else if((vec[i]>100)&&(vec[i]<1000)){
                    c2++;
        }    
            else if((vec[i]>1000)&&(vec[i]<10000)){
                    c3++;
        }
            else if((vec[i]>10000)&&(vec[i]<100000)){
                    c4++;
        }
        }
        System.out.println("Numeros de 1 digito: "+c);
        System.out.println("Numeros de 2 digito: "+c1);
        System.out.println("Numeros de 3 digito: "+c2);
        System.out.println("Numeros de 4 digito: "+c3);
        System.out.println("Numeros de 5 digito: "+c4);
        
       

}
}