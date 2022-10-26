/*
 • Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con
la palabra del usuario, pone la longitud de la palabra, como la longitud del vector.
Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la
palabra en un índice del vector. Y también, guarda en cantidad de jugadas máximas, el
valor que ingresó el usuario y encontradas en 0.
• Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
buscar como se usa el vector.length.
• Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
• Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
busque una letra que no esté, se le restará uno a sus oportunidades.
• Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
• Método juego(): el método juego se encargará de llamar todos los métodos
previamente mencionados e informará cuando el usuario descubra toda la palabra o
se quede sin intentos. Este método se llamará en el main.
 */
package Servicios;

import Entidad.Ahorcado;
import java.util.Arrays;

import java.util.Scanner;

/**
 *
 * @author Agus
 */
public class ServicioAhorcado {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Ahorcado crearJuego() {
        Ahorcado nuevaPalabra = new Ahorcado();

        System.out.println("Ingrese la palabra a adivinar");
        String palabra = leer.next();
        char[] vector = new char[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            vector[i] = palabra.charAt(i);
            
        }
        nuevaPalabra.setPalabra(vector);
        System.out.println("Ingrese la cantidad de jugadas maximas permitidas: ");
        nuevaPalabra.setJugadasMax(leer.nextInt());
        nuevaPalabra.setCantLetras(palabra.length());
        nuevaPalabra.setCantEncontradas(0);
        

        return nuevaPalabra;
    }

    public void mostrarLongitud(Ahorcado nuevaPalabra) {
        char letra = '_';
         char[] vector = new char[nuevaPalabra.getPalabra().length];
        
        System.out.println("La longitud de la palabra es: " + nuevaPalabra.getPalabra().length);
        for (int i = 0; i < nuevaPalabra.getPalabra().length; i++) {
            System.out.print("_ ");
        }
        System.out.println("");

    }

    public boolean buscarLetra(Ahorcado nuevaPalabra) {
        boolean flag = false;
        System.out.println("Ingrese una letra a buscar:");
        char letra = leer.next().charAt(0);
        char guion = '_';
        int contP = 0;
        int contN = 0;
        char[] vector = new char[nuevaPalabra.getPalabra().length];
        

        for (int i = 0; i < nuevaPalabra.getPalabra().length; i++) {
            if (nuevaPalabra.getPalabra()[i] == letra) {
                Arrays.fill(vector, i, i+1, letra);
                contP++;
                flag = true;
                
                //agregar vector de muestra nuevo
            } else {
               Arrays.fill(vector, i, i+1, guion);
                contN++;

            }
            
        }
        System.out.println(vector);
        
        if (contP > 0) {
            System.out.println("La letra ingresada se encuentra en la palabra " + contP + " cantidad de veces");
            nuevaPalabra.setCantEncontradas(nuevaPalabra.getCantEncontradas() + contP);
            nuevaPalabra.setMuestra(vector);
        } else {
            System.out.println("La letra ingresada no corresponde a un abonado en servicio, intentelo de nuevo mas tarde");
            nuevaPalabra.setJugadasMax(nuevaPalabra.getJugadasMax() - 1);
        }

        return flag;
    }

    public void encontradas(Ahorcado nuevaPalabra) {

        System.out.println(buscarLetra(nuevaPalabra));
        System.out.println("La cantidad de letras encontradas hasta el momentos es de: " + nuevaPalabra.getCantEncontradas());

    }

    public void intentos(Ahorcado nuevaPalabra) {
        System.out.println("A usted le quedan: " + nuevaPalabra.getJugadasMax() + " no se apure, ni pierda el tiempo");
    }

    public void juego(Ahorcado nuevaPalabra) {
        boolean flag = false;
        int menu;
       
        //crearJuego();
        do {
            
            System.out.println("Que desea hacer? ");
            System.out.println("1- Mostrar longitud ");
            System.out.println("2- Buscar letra");
            System.out.println("3- Intentos Restantes");
            System.out.println("4- finalizar");
            menu = leer.nextInt();
            switch (menu) {
                case 1:
                    mostrarLongitud(nuevaPalabra);
                    break;
                case 2:
                    encontradas(nuevaPalabra);
                    break;
                case 3:
                    intentos(nuevaPalabra);
                    break;
                case 4:
                    flag = true;
                    break;
            }

        } while ((flag == false) && (nuevaPalabra.getCantEncontradas() != nuevaPalabra.getCantLetras() ) && (nuevaPalabra.getJugadasMax()!=0));
    }
}

// Vector[i] = palabra.charAt(i);

