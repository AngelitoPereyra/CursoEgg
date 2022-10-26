/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej6extraguia7;

import Entidad.Ahorcado;
import Servicios.ServicioAhorcado;

/**
 *
 * @author Agus
 */
public class Ej6ExtraGuia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioAhorcado Sa=new ServicioAhorcado();
        Ahorcado nuevaPalabra=Sa.crearJuego();
        Sa.juego(nuevaPalabra);
    }
    
}
