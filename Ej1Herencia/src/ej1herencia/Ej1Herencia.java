/*
gjgsdtbnaratafa
 */
package ej1herencia;

import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;

/**
 *
 * @author Agus
 */
public class Ej1Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Animal perro1 = new Perro("Stich", "Carnivoro", 15, "Doberman");
        
        System.out.println(perro1.seAlimenta());

        Animal perro2 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
        System.out.println(perro2.seAlimenta());

        Animal gato = new Gato("pelusa", "Galletas", 10, "Siamés");
        System.out.println(gato.seAlimenta());

        Animal caballo = new Caballo("Spark", "Pasto", 25, "fino");
        System.out.println(caballo.seAlimenta());
    }
}
