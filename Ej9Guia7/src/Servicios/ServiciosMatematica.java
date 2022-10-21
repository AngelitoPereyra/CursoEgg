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
package Servicios;

import Entidad.Matematica;

import java.util.Scanner;

/**
 *
 * @author Agus
 */
public class ServiciosMatematica {
    Scanner leer = new Scanner (System.in);
    public void devolverMayor(Matematica numeros){
        
        System.out.println("Entre los numeros"+ numeros.getNum1()+" y " +numeros.getNum2());
        if(numeros.getNum1()>numeros.getNum2()){
            System.out.println("El primero es el mayor");}
        else if(numeros.getNum1()<numeros.getNum2()){
            System.out.println("El segundo es el mayor");}
        else if(numeros.getNum1()==numeros.getNum2()){
            System.out.println("Son tristemente iguales y me caga el codigo, asique le vas a cambiar el valor por uno mas alto asi no me rompe los huevos mas tarde :)");
            numeros.setNum1(leer.nextInt());
            // Math.max(numeros.getNum1(),numeros.getNum2());
            
        }
    }
    
    public void calcularPotencia(Matematica numeros){
        
    double pote = Math.pow(Math.max(numeros.getNum1(), numeros.getNum2()), Math.min(numeros.getNum1(),numeros.getNum2()));
        System.out.println("El mayor elevado al menor es "+pote);
    }
    
    


   public void CalcularRaiz(Matematica numeros){
        double raiz = Math.sqrt(Math.abs(Math.min(numeros.getNum1(),numeros.getNum2())));
        System.out.println("La raiz cuadrada del menor de los valores es "+raiz);
    }

}
