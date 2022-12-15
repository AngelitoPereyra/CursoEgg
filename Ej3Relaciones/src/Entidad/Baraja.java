/*
La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
 */
package Entidad;

import java.util.ArrayList;
import java.util.Collections;

import java.util.Scanner;

/**
 *
 * @author Agus
 */
public class Baraja {

    private ArrayList<Carta> nuevaBaraja;
    private ArrayList<Carta> barajaEliminada;

    public Baraja(ArrayList<Carta> nuevaBaraja, ArrayList<Carta> barajaEliminada) {
        this.nuevaBaraja = nuevaBaraja;
        this.barajaEliminada = barajaEliminada;
    }

    public ArrayList<Carta> getBarajaEliminada() {
        return barajaEliminada;
    }

    public void setBarajaEliminada(ArrayList<Carta> barajaEliminada) {
        this.barajaEliminada = barajaEliminada;
    }

    public Baraja() {
        barajaEliminada=new ArrayList();
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
        return "Baraja{" + "nuevaBaraja=" + nuevaBaraja + ", barajaEliminada=" + barajaEliminada + '}';
    }

    

    public void crearBaraja() {
        ArrayList <Carta> newBaraja = new ArrayList();
        for (int i = 1; i < 13; i++) {
            
            if (i==8|| i==9){
                
            }else{
                Carta c = new Carta(i, "Espada");
                newBaraja.add(c);
                Carta d = new Carta(i, "Basto");
                newBaraja.add(d);
                Carta e = new Carta(i, "Oro");
                newBaraja.add(e);
                Carta f = new Carta(i, "Copa");
                newBaraja.add(f);
            }
        }
        
        for (Carta carta : newBaraja) {
            System.out.println(carta);}
        nuevaBaraja=newBaraja;
        
        
    
        }
    
    
    public void Barajar(){
        
        System.out.println("---------=========--------=======");
        Collections.shuffle(nuevaBaraja);
        for (Carta carta : nuevaBaraja) {
            System.out.println(carta);}
    }
            
        

public void siguienteCarta(){
    if(nuevaBaraja.size()>0){
    System.out.println(nuevaBaraja.get(0));
    barajaEliminada.add(nuevaBaraja.get(0));
    nuevaBaraja.remove(0);
    }else{
        System.out.println("Usted se ah quedado sin cartas en el mazo"); 
        
    }
}
public void cartasMonton(){
    for (Carta carta : barajaEliminada) {
            System.out.println(carta);}
    }
public void cartasMazo(){
    for (Carta carta : nuevaBaraja) {
            System.out.println(carta);}
    }
public void darCarta(){
    Scanner leer = new Scanner (System.in);
    System.out.println("Cuantas cartas desea recibir?");
    int cartas= leer.nextInt();
    if(nuevaBaraja.size()>=cartas){
    for (int i = 0; i < cartas; i++) {
        System.out.println(nuevaBaraja.get(0));
    barajaEliminada.add(nuevaBaraja.get(0));
    nuevaBaraja.remove(0);
    }
    }else{
        System.out.println("Usted se ah quedado sin cartas en el mazo");
    }
}
       
}
