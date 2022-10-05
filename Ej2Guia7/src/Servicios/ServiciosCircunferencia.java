/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author Agus
 */
public class ServiciosCircunferencia {
    
    
    
    
 public Circunferencia CrearCircunferencia(){   
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
     System.out.println("Ingrese el radio de la circunferencia: ");
    Circunferencia c1=new Circunferencia(leer.nextDouble());
    
    
    return c1;
}
     public void area(Circunferencia c1){
        Double Area;
        Area=3.14*c1.getRadio()*c1.getRadio();
         System.out.println("El Area de su circunferencia es de :"+ Area);
         
        
    }
    
     public void perimetro(Circunferencia c1){
         Double Perimetro;
         Perimetro=2+3.14*c1.getRadio();
         System.out.println("El Perimetro de su circunferencia es de " + Perimetro);
         
         
     }
}
