/*
 Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package ej9guia7;

import Entidad.Matematica;
import Servicios.ServiciosMatematica;
import java.util.Scanner;

/**
 *
 * @author Agus
 */
public class Ej9Guia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       ServiciosMatematica Sm = new ServiciosMatematica();
       Matematica numeros = new Matematica();
       //numeros.setNum1((int) (Math.random() * 100));
       //numeros.setNum2((int) (Math.random() * 100));
        numeros.setNum1(50);
       numeros.setNum2(50);
       boolean flag= true;
       int menu;
       do{
           System.out.println("Que desea hacer?:");
           System.out.println("1- Devolver el mayor");
           System.out.println("2- Calcular potencia del mayor numero");
           System.out.println("3- Calcular la raiz cuadrada del menor");
           System.out.println("4- Salir");
           menu=leer.nextInt();
           switch(menu){
               case 1:
                   Sm.devolverMayor(numeros);
                   break;
               case 2:
                   Sm.calcularPotencia(numeros);
                   break;
               case 3:
                   Sm.CalcularRaiz(numeros);
                   break;
               case 4:
                   flag=false;
                   break;
           }
       }while (flag==true);
    }
    
}
1