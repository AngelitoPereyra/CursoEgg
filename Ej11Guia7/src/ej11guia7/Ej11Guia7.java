/*,
 Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se
puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 */
package ej11guia7;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Agus
 */
public class Ej11Guia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese un dia cualquiera: ");
       int dia=leer.nextInt();
        System.out.println("De un mes entre los doce meses ");
       int mes=leer.nextInt();
        System.out.println("Y un año entre los miles de años");
       int anio=leer.nextInt();
       
       Date fecha= new Date(anio-1900,mes-1,dia);
       Date fechaActual= new Date();
       
       System.out.println("Su fecha seleccionada es: "+ fecha.toString());
        System.out.println("Entre la fecha elegida y la actual hay: " + (fechaActual.getYear()-fecha.getYear())+", "+ (fechaActual.getMonth()-fecha.getMonth()) +", "+ (fechaActual.getDate()- fecha.getDate()));
       
    }
    
}
