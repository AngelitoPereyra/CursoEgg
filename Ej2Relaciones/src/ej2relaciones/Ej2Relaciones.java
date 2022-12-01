/*
Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el juego se trata de
un número de jugadores, que, con un revolver de agua, el cual posee una sola carga de agua,
se dispara y se moja. Las clases por hacer del juego son las siguientes:



Métodos:


 */
package ej2relaciones;

import Servicios.ServicioJuego;
import Servicios.ServicioJugador;
import Servicios.ServicioRevolverAgua;

/**
 *
 * @author Agus
 */
public class Ej2Relaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioJuego Sj = new ServicioJuego();
        ServicioJugador ServJ = new ServicioJugador();
        ServicioRevolverAgua Sra = new ServicioRevolverAgua();
        
 
        Sj.llenarJuego(ServJ.retornarLista(), Sra.llenarRevolver() );
        Sj.ronda();
    }
    
}
