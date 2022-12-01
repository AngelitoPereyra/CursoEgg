/*
Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)
 */
package Servicios;


import Entidad.RevolverAgua;
import java.util.Objects;
import java.util.Random;

/**
 *
 * @author Agus
 */
public class ServicioRevolverAgua {

    RevolverAgua pistola = new RevolverAgua();

    public RevolverAgua llenarRevolver() {
        Random aleatorio = new Random();
        RevolverAgua pist = new RevolverAgua();
        pistola.setPosicionActual(aleatorio.nextInt(6)+1);
        pistola.setPosicionAgua(aleatorio.nextInt(6)+1);
        System.out.println(pistola.toString());
        pist.setPosicionActual(pistola.getPosicionActual());
        pist.setPosicionAgua(pistola.getPosicionAgua());
        return pist;
    }

    public boolean mojar(RevolverAgua p1) {
                
        return Objects.equals(p1.getPosicionActual(), p1.getPosicionAgua());
    }
    
    public void siguienteChorro(RevolverAgua p1){
        
        if(p1.getPosicionActual()==6){
            p1.setPosicionActual(1);}
        else{
            p1.setPosicionActual(p1.getPosicionActual()+1);}
        }
  
    }

