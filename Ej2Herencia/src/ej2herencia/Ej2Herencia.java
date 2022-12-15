/*
 Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar
el precio final de los dos electrodomésticos.
 */
package ej2herencia;

import Entidades.Electrodoméstico;
import Entidades.Lavadora;
import Entidades.Televisor;
import java.util.ArrayList;

/**
 *
 * @author Agus
 */
public class Ej2Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Electrodoméstico> productos = new ArrayList();
        int suma = 0;
        for (int i = 0; i < 2; i++) {
            Lavadora newLavadora = new Lavadora();
            newLavadora.crearLavadora();
            productos.add(newLavadora);
            System.out.println(newLavadora.toString());
            Televisor newTelevisor = new Televisor();
            newTelevisor.crearTelevisor();
            productos.add(newTelevisor);
            System.out.println(newTelevisor.toString());
            }
        for (Electrodoméstico producto : productos) {
                suma += producto.getPrecio();
            }
        System.out.println("El valor total de sus productos es de : "+ suma);
    }

}
