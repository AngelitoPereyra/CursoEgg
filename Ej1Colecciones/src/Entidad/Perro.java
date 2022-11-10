/*
 Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
 */
package Entidad;

import java.util.ArrayList;

/**
 *
 * @author Agus
 */
public class Perro {
    private ArrayList <String> razaPerro;

    public Perro() {
    }

    public Perro(ArrayList<String> razaPerro) {
        this.razaPerro = razaPerro;
    }

    public ArrayList<String> getRazaPerro() {
        return razaPerro;
    }

    public void setRazaPerro(ArrayList<String> razaPerro) {
        this.razaPerro = razaPerro;
    }

    @Override
    public String toString() {
        return "Perro{" + "razaPerro=" + razaPerro + '}';
    }
    
    
    
    
}
