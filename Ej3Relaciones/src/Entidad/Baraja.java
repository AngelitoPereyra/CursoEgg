/*
La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
 */
package Entidad;

import java.util.ArrayList;

/**
 *
 * @author Agus
 */
public class Baraja {

    private ArrayList<Carta> nuevaBaraja;

    public Baraja() {
    }

    public Baraja(ArrayList<Carta> nuevaBaraja) {
        this.nuevaBaraja = nuevaBaraja;
    }

    public ArrayList<Carta> getNuevaBaraja() {
        return nuevaBaraja;
    }

    public void setNuevaBaraja(ArrayList<Carta> nuevaBaraja) {
        this.nuevaBaraja = nuevaBaraja;
    }

    @Override
    public String toString() {
        return "Baraja{" + "nuevaBaraja=" + nuevaBaraja + '}';
    }

    public Baraja crearBaraja() {
        
        Baraja b = new Baraja();
        ArrayList <Carta> newBaraja = new ArrayList();
        Carta c = new Carta();
        String palo = "Espada";
        for (int i = 1; i < 13; i++) {
            c.llenarCarta(i, palo);
            newBaraja.add(c);  
        }
        for (int i = 1; i < 13; i++) {
            c.llenarCarta(i, "Basto");
            newBaraja.add(c);
        }
        for (int i = 1; i < 13; i++) {
            c.llenarCarta(i, "Oro");
            newBaraja.add(c);
        }

        for (int i = 1; i < 13; i++) {
            c.llenarCarta(i, "Copas");
            newBaraja.add(c);
        }
        b.setNuevaBaraja(newBaraja);
        
        for (Carta carta : newBaraja) {
            System.out.println(carta);
        }
        return b;
    }
}
        
    
