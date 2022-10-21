/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
 */
package ej10guia7;

import java.util.Arrays;

/**
 *
 * @author Agus
 */
public class Ej10Guia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        int[] arregloA = new int[50];
        int[] arregloB = new int[20];

        for (int i = 0; i < arregloA.length; i++) {
            arregloA[i] = (int) (Math.random() * 100);
            System.out.print("[ " + arregloA[i] + " ]");

           
        }
        Arrays.sort(arregloA);
        
        //Copia de un vector a otro desde la posición indicada
        System.arraycopy(arregloA, 0, arregloB, 0, 10);
        //rellena el vector desde una posición A a una B con el valor indicado
        Arrays.fill(arregloB, 10, 20, 1);
        
        System.out.println(Arrays.toString(arregloA));
        System.out.println(Arrays.toString(arregloB));
        
       
        }
    }


/*System.out.println(Arrays.toString(a));
      
        //Ordena de mayor a menor los valores del vector
        Arrays.sort(a);
        System.out.println("Ahora ordenados");
        System.out.println(Arrays.toString(a));
        //Copia de un vector a otro desde la posición indicada
        System.arraycopy(a, 0, b, 0, 10);
        //rellena el vector desde una posición A a una B con el valor indicado
        Arrays.fill(b, 10, 20, 0.5);
        System.out.println(Arrays.toString(b));
*/