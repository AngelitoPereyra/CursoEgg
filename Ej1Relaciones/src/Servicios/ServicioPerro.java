/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
package Servicios;

import Entidades.Perro;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Agus
 */
public class ServicioPerro {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Perro> listaPerros = new ArrayList();
    public void menuPerro(){
    //cargar Perro
    Perro nuevo = nuevoPerro();
    listaPerros.add(nuevo);
    //mostrar Lista
    
    }
    

    public Perro nuevoPerro() {
        Perro newPerro = new Perro();
        System.out.println("Ingrese el nombre del Perro: ");
        newPerro.setNombre(leer.next());
        System.out.println("Ingrese la raza del Perro: ");
        newPerro.setRaza(leer.next());
        System.out.println("Ingrese la edad del Perro: ");
        newPerro.setEdad(leer.nextInt());
        System.out.println("Ingrese el tamaño del Perro: ");
        newPerro.setTamaño(leer.nextDouble());

        return newPerro;
    }

    public void mostrarLista(ArrayList p){
        Iterator<Perro> it = p.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("\t");
    }
}
