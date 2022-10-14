/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad
actual de café que hay en la cafetera). Implemente, al menos, los siguientes métodos:
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
package Servicios;

import Entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Agus
 */
public class ServicioCafetera {

    Scanner leer = new Scanner(System.in);

    public Cafetera llenarCafetera() {
        Cafetera cafe = new Cafetera();
        cafe.setCantidadActual(cafe.getCapacidadMaxima());
        return cafe;
    }

    public void ServirTaza(Cafetera cafe) {
        System.out.println("Indique el tamaño de taza que desea utilizar: ");
        System.out.println(" 1- Chica \n 2- Mediana \n 3- Grande");
        int taza = leer.nextInt();
        switch (taza) {
            case 1:
                if (cafe.getCantidadActual() > 10.0) {
                    cafe.setCantidadActual(cafe.getCantidadActual() - 10.0);
                    System.out.println("Disfrute su cafe");
                } else {
                    System.out.println("No dispone de la suficiente cantidad para llenar la taza, por favor rellene la maquina. Se le han servido las sobras :)");
                    cafe.setCantidadActual(0.0);
                }
                break;
            case 2:
                if (cafe.getCantidadActual() > 15.0) {
                    cafe.setCantidadActual(cafe.getCantidadActual() - 15.0);
                    System.out.println("Disfrute su cafe");
                } else {
                    System.out.println("No dispone de la suficiente cantidad para llenar la taza, por favor rellene la maquina. Se le han servido las sobras :)");
                    cafe.setCantidadActual(0.0);
                }
                break;
            case 3:
                if (cafe.getCantidadActual() > 20.0) {
                    cafe.setCantidadActual(cafe.getCantidadActual() - 20.0);
                    System.out.println("Disfrute su cafe");
                } else {
                    System.out.println("No dispone de la suficiente cantidad para llenar la taza, por favor rellene la maquina. Se le han servido las sobras :)");
                    cafe.setCantidadActual(0.0);
                }
                break;
        }
    }

    public void VaciarCafetera(Cafetera cafe) {

        cafe.setCantidadActual(0.0);
    }
    public void LlenarCafetera(Cafetera cafe) {
        System.out.println("Ingrese la cantidad de cafe que quiere ingresar a la maquina: ");
        cafe.setCantidadActual(leer.nextDouble());
    }
}
