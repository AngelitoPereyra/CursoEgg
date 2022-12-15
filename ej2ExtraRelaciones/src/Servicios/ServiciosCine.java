/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidad.Cine;

/**
 *
 * @author Agus
 */
public class ServiciosCine {
    Cine newCine = new Cine();
    
    
    public void nuevaSala(){
    
    newCine.crearSala();
    
   
    
    }
      public void crearSala(){
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                newCine.getSala()[i][j] = "| "+" |";
                System.out.print(newCine.getSala()[i][j]);
            }
            System.out.println("");
        }
    }

}
