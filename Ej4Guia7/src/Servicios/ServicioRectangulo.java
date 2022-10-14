/*
 Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo con
los datos del Rectángulo dados por el usuario. También incluirá un método para calcular la
superficie del rectángulo y un método para calcular el perímetro del rectángulo. Por último,
tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la
altura. Se deberán además definir los métodos getters, setters y constructores
correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package Servicios;

import Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Agus
 */
public class ServicioRectangulo {

    public Rectangulo CrearRectangulo() {
        Scanner leer = new Scanner(System.in);
        Rectangulo r1 = new Rectangulo();
        System.out.println("Ingrese la base del Rectangulo: ");
        r1.setBase(leer.nextInt());
        System.out.println("Ingrese la altura del Rectangulo: ");
        r1.setAltura(leer.nextInt());

        return r1;
    }

    public void Superficie(Rectangulo r1) {
        int Superficie = r1.getBase() * r1.getAltura();
        System.out.println("Su superficie es de " + Superficie);
    }

    public void Perimetro(Rectangulo r1) {
        int perimetro = (r1.getBase() + r1.getAltura() * 2);
        System.out.println("Su Perimetro es de: " + perimetro);

    }

    public void MostrarRectangulo(Rectangulo r1) {
        for (int i = 0; i < r1.getAltura(); i++) {
            for (int j = 0; j < r1.getBase(); j++) {
                if ((i == 0 || i == r1.getAltura() - 1) || (j == 0 || j == r1.getBase()-1)) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");

                }

            }
            System.out.println("");
        }
    }
}
