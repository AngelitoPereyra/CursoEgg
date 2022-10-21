/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Cancion;
import java.util.Scanner;

/**
 *
 * @author Agus
 */
public class ServiciosCancion {
    
    
    public Cancion nuevaCancion(){
        Cancion nueva = new Cancion();
        Scanner leer= new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el nombre de la cancion: ");
        nueva.setCancion(leer.next());
        System.out.println("Ingrese el autor: ");
        nueva.setAutor(leer.next());
        System.out.println(nueva.toString());
        
        return nueva;
        
        
        
    }
}
