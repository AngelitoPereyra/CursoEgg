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
package ej6guia7;

import Entidad.Cafetera;
import Servicios.ServicioCafetera;
import java.util.Scanner;
/**
 *
 * @author Agus
 */
public class Ej6Guia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioCafetera Sc = new ServicioCafetera();
        Cafetera cafe = Sc.llenarCafetera();
        Scanner leer=new Scanner(System.in);
        int menu=0;
        while (menu != 4) {
            System.out.println("Que desea hacer?: ");
            System.out.println("1 - Servir Taza");
            System.out.println("2 - Vaciar Cafetera");
            System.out.println("3 - Agregar Cafe");
            System.out.println("4 - Salir");
            menu=leer.nextInt(); 
            switch (menu){
                case 1:
                    Sc.ServirTaza(cafe);
                    break;
                case 2:
                    Sc.VaciarCafetera(cafe);
                    break;
                case 3:
                    Sc.LlenarCafetera(cafe);
                    break;
                case 4:
                    break;
            }
        }
        
        
        
        
        
    }

}
