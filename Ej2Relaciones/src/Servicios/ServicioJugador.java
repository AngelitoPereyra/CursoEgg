/*
 • disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
devuelve true, sino false.
 */
package Servicios;

import Entidad.Jugador;
import Entidad.RevolverAgua;
import Servicios.ServicioRevolverAgua;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Agus
 */
public class ServicioJugador {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Jugador> listaJugadores = new ArrayList();
    int cont = 1;

    public void menu() {
           
        System.out.println("----CREAR PERSONAJE----\n"
                + "*Ingrese cuantos jugadores creara");
        int n = leer.nextInt();

        if (n < 1 || n > 6) {
            n = 6;
        }
        for (int i = 1; i < n + 1; i++) {
            listaJugadores.add(nuevoJugador());

        }
    }

    public Jugador nuevoJugador() {

        Jugador newPlayer = new Jugador();

        newPlayer.setId(cont);
        cont++;
        newPlayer.setMojado(false);
        return newPlayer;
    }

   
    public ArrayList<Jugador> retornarLista(){
        menu();
        return listaJugadores;
    }
    
    public void disparo1(Jugador p1, RevolverAgua p2) {
        ServicioJuego Sj = new ServicioJuego();
        ServicioRevolverAgua Sra = new ServicioRevolverAgua();
        
        p1.setMojado(Sra.mojar(p2));
        
    }
    
}
