/*
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.
 */
package Servicios;

import Entidad.Baraja;
import Entidad.Carta;
import java.util.Scanner;

/**
 *
 * @author Agus
 */
public class ServicioBaraja {
Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void menu(Baraja b1) {
        int menu = 0 ;
        boolean flag = false;
        do {
            System.out.println("1- Barajar");
            System.out.println("2- Siguiente Carta");
            System.out.println("3- Cartas Disponibles");
            System.out.println("4- Dar Cartas");
            System.out.println("5- Cartas del Monton");
            System.out.println("6- Mostrar Barajas");
            System.out.println("7- Salir");
            menu=leer.nextInt();
            switch (menu){
                case 1:
                    b1.Barajar();
                    break;
                case 2:
                    b1.siguienteCarta();
                    break;
                case 3:
                    b1.cartasMazo();
                    break;
                case 4:
                    b1.darCarta();
                    break;
                case 5:
                    b1.cartasMonton();
                    break;
                case 6:
                    System.out.println(b1.toString());
                    break;
                case 7:
                    flag=true;
                    break;
            }
           
        } while (flag == false);
       
    }
    
    
}
