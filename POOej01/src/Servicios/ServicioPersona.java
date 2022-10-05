/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;
import Entidad.Persona;
import java.util.Scanner;


/**
 *
 * @author Agus
 */
public class ServicioPersona {
    
    
    public Persona PersonaNueva (){
        Scanner leer=new Scanner(System.in);
        Persona p1=new Persona();
        
        System.out.println("Ingrese su nombre: ");
        p1.setNombre(leer.next());
        System.out.println("Ingrese su documento: ");
        p1.setDocumento(leer.nextInt());
        System.out.println("Ingrese su Edad");
        p1.setEdad(leer.nextInt());
               
        
        return p1;
    }

   
}
