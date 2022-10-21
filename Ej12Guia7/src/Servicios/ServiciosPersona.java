/*
Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes
métodos:
• Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.
• Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.
• Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.
 */
package Servicios;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Agus
 */
public class ServiciosPersona {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Date fecha = new Date();

    public Persona newPersona() {
        Persona pers = new Persona();
        System.out.println("Ingrese su nombre: ");
        pers.setNombre(leer.next());
        System.out.println("Ingrese su fecha de nacimiento: AAAA/MM/DD");
        Date fecha = new Date(leer.nextInt() - 1900, leer.nextInt() - 1, leer.nextInt());
        pers.setFechaNacimiento(fecha);
        return pers;

    }

    public void calcularEdad(Persona pers) {
        pers.setEdad((fecha.getYear() - pers.getFechaNacimiento().getYear()));
        System.out.println("Su edad es: " + pers.getEdad());
    }

    public void menorQue(Persona pers) {
        boolean flag = true;
        System.out.println("Ingrese una edad a comparar: ");
        int edad = leer.nextInt();
        if (edad < pers.getEdad()) {
            flag = false;
        }
        System.out.println("Usted es mayor que nuestro objeto?: " + flag);
        
    }

    public void mostrarPersona(Persona pers) {

        System.out.println(pers.toString());
    }
}
