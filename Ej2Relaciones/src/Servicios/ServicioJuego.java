/*
Clase Juego: 
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.

10
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
 */
package Servicios;

import Entidad.Juego;
import Entidad.Jugador;
import Entidad.RevolverAgua;
import java.util.ArrayList;

/**
 *
 * @author Agus
 */
public class ServicioJuego {

    Juego nuevoJuego = new Juego();

    public void llenarJuego(ArrayList<Jugador> jugadores, RevolverAgua r) {
        nuevoJuego.setParticipantes(jugadores);
        nuevoJuego.setPistola(r);
    }

    public void ronda() {
        ServicioJugador Sj = new ServicioJugador();
        ServicioRevolverAgua pist = new ServicioRevolverAgua();
       
        boolean flag = false;
        do{
        for (Jugador participante : nuevoJuego.getParticipantes()) {
           Sj.disparo1(participante, nuevoJuego.getPistola());
           if(participante.getMojado()==true){
               System.out.println("Se la pego");
               flag=true;
               break;
           }else{
               
               pist.siguienteChorro(nuevoJuego.getPistola());
               System.out.println("siguiente chorro"+ nuevoJuego.getPistola());
           }
        }
        }while(flag==false);
        System.out.println(nuevoJuego.getParticipantes());
        
    }
    
    public RevolverAgua datosPistola(){
        
        return nuevoJuego.getPistola();
    }
}

       