/*
 Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos. Para conocer como
calcular la distancia entre dos puntos consulte el siguiente link:
 */
package Servicios;

import Entidad.Puntos;
import java.util.Scanner;

/**
 *
 * @author Agus
 */
public class ServiciosPuntos {
    Scanner leer = new Scanner(System.in);
    
    public Puntos crearPuntos(){
        Puntos coord  = new Puntos();
        System.out.println("Ingrese el eje x del primer punto: ");
        coord.setX1(leer.nextInt());
         System.out.println("Ingrese el eje y del primer punto: ");
        coord.setY1(leer.nextInt());
         System.out.println("Ingrese el eje x del segundo punto: ");
        coord.setX2(leer.nextInt());
         System.out.println("Ingrese el eje y del segundo punto: ");
        coord.setY2(leer.nextInt());
        
        return coord;       
        
    }
    
    public void calcularDistancia(Puntos coord){
        
        
        System.out.println("La distancia del punto A al punto B es de: "+ Math.sqrt(Math.pow((coord.getX2()-coord.getX1()), 2)+ Math.pow((coord.getY2()-coord.getY1()), 2)));
    }
}
