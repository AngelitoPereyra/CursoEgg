/*
Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
 */
package javaapplication3;
import java.util.Scanner;
/**
 *
 * @author Agus
 */
public class ej11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros enteros");
        int n = leer.nextInt();
        int n1 = leer.nextInt();
        boolean logico = true;
        
        do{
            System.out.println("Ingrese una opcion");
            System.out.println("1= Sumar");
            System.out.println("2= Restar");
            System.out.println("3= Multiplicar");
            System.out.println("4= Dividir");
            System.out.println("5= Salir");
            int n2 = leer.nextInt();                         
            switch(n2){
                case 1:
                    System.out.println("La suma de su numero es " + (n + n1));
                    break;
                case 2:
                    System.out.println("La resta de su numero es " + (n - n1));
                    break;
                case 3:
                    System.out.println("La multiplicacion de su numero es igual a " +(n*n1));
                    break;
                case 4:
                    System.out.println("La division de su numero es igual a "+(n/n1));
                    break;
                case 5:
                    System.out.println("Esta seguro? S/N");
                    String c = leer.next();
                    if (c.equals("S")){
                        logico = false;
                        break;}
                    else{
                        break;}
             
            }
                
          
        }while(logico==true);
        
    }
    
}
