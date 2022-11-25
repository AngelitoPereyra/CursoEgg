/*
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:

22

• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package Servicios;

import Entidad.Pelicula;
import java.util.Collections;
import java.util.Scanner;
import comparator.Comparador;
import java.util.ArrayList;

/**
 *
 * @author Agus
 */
public class ServiciosPelicula {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Pelicula> listaPeliculas = new ArrayList();

    public void agregarPelicula() {
        Pelicula pelicula = new Pelicula();
        boolean flag = true;
        do {
            System.out.println("Ingrese el nombre de la Pelicula");
            pelicula.setTitulo(leer.next());
            System.out.println("Ingrese el director de la Pelicula");
            pelicula.setDirector(leer.next());
            System.out.println("Ingrese la duracion de la pelicula en hs");
            pelicula.setDuracion(leer.nextInt());

            listaPeliculas.add(pelicula);

            System.out.println("Desea ingresar otra pelicula al listado? S/N");
            if (leer.next().equalsIgnoreCase("N")) {
                flag = false;
            }

        } while (flag == true);
        
        System.out.println("Su lista es: ");
        mostrarLista();
        System.out.println("Peliculas con duracion mayor a 1 hs: ");
        ListaMayor1();
        System.out.println("Orden de mayor a menor");
        ordenarMasAMenos();
        System.out.println("Orden por titulo: ");
        ordenarTitulo();
        System.out.println("Ordenar por director: ");
        ordenarDirector();
    }

    public void mostrarLista() {

        for (Pelicula listaPelicula : listaPeliculas) {
            System.out.println(listaPelicula);

        }
    }

    public void ListaMayor1() {
        for (Pelicula listaPelicula : listaPeliculas) {
            if (listaPelicula.getDuracion() > 1) {
                System.out.println(listaPelicula);
            }
        }
    }

    public void ordenarMasAMenos() {

        Collections.sort(listaPeliculas, Comparador.peliculasMayor);

    }
    public void ordenarTitulo() {

        Collections.sort(listaPeliculas, Comparador.peliculasTitulo);

    }
    
    public void ordenarDirector() {

        Collections.sort(listaPeliculas, Comparador.peliculasDirector);
    }
}

