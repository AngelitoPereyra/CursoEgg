/*
Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del
jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado (indica
si está mojado o no el jugador). El número de jugadores será decidido por el usuario, pero
debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
 */
package Entidad;

/**
 *
 * @author Agus
 */
public class Jugador {
    private Integer id;
    
    private Boolean mojado;

    public Jugador() {
    }

    public Jugador(Integer id, Boolean mojado) {
        this.id = id;
        this.mojado = mojado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getMojado() {
        return mojado;
    }

    public void setMojado(Boolean mojado) {
        this.mojado = mojado;
    }

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", mojado=" + mojado + '}';
    }
    
    
}
/*
public void crearPJ(){
        System.out.println("----CREAR PERSONAJE----\n"
                + "*Ingrese cuantas PJ creara");
        int n = leer.nextInt();
      
        if(n<1 || n>6){
            n=6;
        }
        
        for (int i = 1; i < n+1; i++) {
              RuletaJugadorEnt player = new RuletaJugadorEnt();
        
        System.out.println("Ingrese su nombre ");
        player.setNombre(leer.next());
        player.setId(i);
        player.setMojado(false);
        jugadores.add(player);
        }
        System.out.println("cantidad"+jugadores.size());
    }

*/