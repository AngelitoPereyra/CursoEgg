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
import Servicios.ServicioPerro;
import Entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Agus
 */
public class ServicioPersona {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ServicioPerro Sp = new ServicioPerro();

    public Persona nuevaPersona() {
        Persona nuevaPersona = new Persona();
        System.out.println("Ingrese su nombre: ");
        nuevaPersona.setNombre(leer.next());
        System.out.println("Ingrese su apellido: ");
        nuevaPersona.setApellido(leer.next());
        System.out.println("Ingrese su edad: ");
        nuevaPersona.setEdad(leer.nextInt());
        System.out.println("Ingrese su numero de documento: ");
        nuevaPersona.setDocumento(leer.nextLong());

        return nuevaPersona;
    }

    public void adoptarPerro(Persona p, ArrayList<Perro> p1) {
        System.out.println("Ingrese el nombre del perro a adoptar: ");
        String nombre = leer.next();
        for (Perro perro : p1) {
            if (perro.getNombre().equalsIgnoreCase(nombre)) {
                p.setPerro(perro);
                p1.remove(perro);
            }

        }

    }
}
