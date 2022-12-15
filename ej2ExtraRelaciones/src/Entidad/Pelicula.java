/*
Luego, de las películas nos interesa saber
el título, duración, edad mínima y director.
 */
package Entidad;

/**
 *
 * @author Agus
 */
public class Pelicula {
    private String titulo = "Jamas aprendere a programar";
    private int duracion = 3;
    private int edadMinima=18;
    private String director="Agustin Pereyra";

    public Pelicula() {
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", duracion=" + duracion + ", edadMinima=" + edadMinima + ", director=" + director + '}';
    }
    
    
    
}
