/*
Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
 */
package Servicios;

import Comparador.comparadorPaises;
import Entidad.Pais;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Agus
 */
public class ServiciosPais {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashSet<Pais> listaPaises = new HashSet();

    public void menu() {
        boolean flag = true;
        String menu = "";

        do {

            System.out.println("Desea ingresar un pais? S/N");
            if (leer.next().equalsIgnoreCase("s")) {
                listaPaises.add(agregarPais());
            } else {
                flag = false;
            }

        } while (flag == true);

        mostrarPaises();
        mostrarPaisesOrdenados();
        eliminarPaises();

    }

    public Pais agregarPais() {
        Pais nuevoPais = new Pais();
        System.out.println("Ingrese el nombre de un pais: ");
        nuevoPais.setPais(leer.next());

        return nuevoPais;
    }

    public void mostrarPaises() {

        for (Pais listaPaise : listaPaises) {
            System.out.println(listaPaise);

        }
    }

    public void mostrarPaisesOrdenados() {
        ArrayList<Pais> lista = new ArrayList(listaPaises);
        Collections.sort(lista, comparadorPaises.peliculasMayor);
        for (Pais pais : lista) {
            System.out.println(pais);
        }

    }

    public void eliminarPaises() {
        Iterator<Pais> nuevoIterator = listaPaises.iterator();
        System.out.println("Ingrese el pais que desea eliminar");
        String pa = leer.next();
        while (nuevoIterator.hasNext()) {
            if (nuevoIterator.next().getPais().equalsIgnoreCase(pa)) {
                nuevoIterator.remove();
            }
        }

        mostrarPaisesOrdenados();

    }
}
