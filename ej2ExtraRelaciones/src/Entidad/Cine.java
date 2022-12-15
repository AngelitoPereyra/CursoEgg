/*
De Cine nos interesa conocer la película que se está reproduciendo, la
sala con los espectadores y el precio de la entrada.
 */
package Entidad;

/**
 *
 * @author Agus
 */
public class Cine {
    private Pelicula peli = new Pelicula();
    private double precio = 200;
    private String sala[][] = new String [6][8];

    public Cine() {
    }

    public Pelicula getPeli() {
        return peli;
    }

    public void setPeli(Pelicula peli) {
        this.peli = peli;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String[][] getSala() {
        return sala;
    }

    public void setSala(String[][] sala) {
        this.sala = sala;
    }
    
    public void crearSala(){
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                this.sala[i][j] = "| "+" |";
            }
            
        }
    }

    @Override
    public String toString() {
        return "Cine{" + "peli=" + peli + ", precio=" + precio + ", sala=" + sala + '}';
    }
    
    
}
