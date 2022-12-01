/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
package ej1relaciones;

import Entidades.Perro;
import Entidades.Persona;
import Servicios.ServicioPerro;
import Servicios.ServicioPersona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Agus
 */
public class Ej1Relaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioPerro sp = new ServicioPerro();
        ServicioPersona ServPer = new ServicioPersona();
        ArrayList<Perro> listaAdoptiva = new ArrayList();
        ArrayList<Persona> listaDefinitiva = new ArrayList();
        int menu;
        boolean flag = false;
        do {
            System.out.println("que desea hacer: ");
            System.out.println("1 - Ingresar un perro a la lista de adopcion.");
            System.out.println("2 - Mostrar lista de perros disponibles");
            System.out.println("3 - Adoptar un perro");
            System.out.println("4- Salir");
            menu = leer.nextInt();
            switch (menu) {
                case 1:
                    listaAdoptiva.add(sp.nuevoPerro());
                    break;
                case 2:
                    sp.mostrarLista(listaAdoptiva);
                    break;
                case 3:
                    Persona p1 = ServPer.nuevaPersona();
                    ServPer.adoptarPerro(p1, listaAdoptiva);
                    System.out.println(p1.toString());
                    listaDefinitiva.add(p1);
                    break;
                case 4:
                    flag=true;
                    break;

            }

        } while (flag == false);
    }

}
