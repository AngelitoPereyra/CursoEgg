/*
 Crear un método para cargar un libro pidiendo los datos al usuario
 */
package Servicios;

import entidad.Libros;
import java.util.Scanner;

/**
 *
 * @author Agus
 */
public class ServiciosLibros {
    
    public Libros NewAutor(){
        Scanner leer = new Scanner(System.in,"ISO-8859-1").useDelimiter("\n");
        Libros Autor=new Libros();
        System.out.println("Ingrese el ISBN: ");
        Autor.setISBN(leer.nextInt());
        System.out.println("Ingrese el Titulo del Libro");
        Autor.setTitulo(leer.next());
        System.out.println("Ingrese Nombre del Autor: ");
        Autor.setAutor(leer.next());
        System.out.println("Ingrese numero de paginas: ");
        Autor.setNumeroPaginas(leer.nextInt());
        
        return Autor;
    }
    
  
}
