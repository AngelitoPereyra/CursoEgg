/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Objeto;
import java.util.Scanner;

/**
 *
 * @author Agus
 */
public class ServicioObjeto {
   
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Objeto CrearObjeto(){
        Objeto palabra = new Objeto();
        palabra.setP1(leer.next());
        palabra.setN1(leer.nextInt());
        
        return palabra;
    }
           
    
}
