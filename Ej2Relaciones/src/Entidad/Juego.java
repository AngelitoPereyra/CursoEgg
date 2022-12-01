/*
esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
Revolver
 */
package Entidad;

import java.util.ArrayList;

/**
 *
 * @author Agus
 */
public class Juego {
    Jugador nuevoJugador = new Jugador();
    
    private ArrayList <Jugador> participantes;
    private RevolverAgua pistola;

    public Juego() {
    }

    public Juego(ArrayList<Jugador> participantes, RevolverAgua pistola) {
        this.participantes = participantes;
        this.pistola = pistola;
    }

    public Jugador getNuevoJugador() {
        return nuevoJugador;
    }

    public void setNuevoJugador(Jugador nuevoJugador) {
        this.nuevoJugador = nuevoJugador;
    }

    public ArrayList<Jugador> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(ArrayList<Jugador> participantes) {
        this.participantes = participantes;
    }

    public RevolverAgua getPistola() {
        return pistola;
    }

    public void setPistola(RevolverAgua pistola) {
        this.pistola = pistola;
    }

    @Override
    public String toString() {
        return "Juego{" + "nuevoJugador=" + nuevoJugador + ", participantes=" + participantes + ", pistola=" + pistola + '}';
    }
    
    
    
}
