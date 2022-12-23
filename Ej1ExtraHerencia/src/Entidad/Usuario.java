/*
el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución,
 */
package Entidad;

import java.time.Duration;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Agus
 */
public class Usuario {

    protected String nombre;
    protected long documento;
    protected String fechaInicio;
    protected String fechaDevolucion;

    public Usuario() {
    }

    public Usuario(String nombre, long documento, String fechaInicio, String fechaDevolucion) {
        this.nombre = nombre;
        this.documento = documento;
        this.fechaInicio = fechaInicio;
        this.fechaDevolucion = fechaDevolucion;
    }

    public void nuevoUsuario() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("¡Alquile su barco!");
        System.out.println("Ingrese su nombre");
        this.nombre = leer.next();
        System.out.println("Ingrese su documento: ");
        this.documento = leer.nextLong();
        System.out.println("Ingrese la fecha de inicio: YYYY-MM-DD ");
        this.fechaInicio = leer.next();
        System.out.println("Ingrese la fecha de devolucion: YYYY-MM-DD");
        this.fechaDevolucion = leer.next();
        diasAlquilado();
    }

public long diasAlquilado(){
        
        LocalDate inicio = LocalDate.parse(fechaInicio);
        LocalDate fin = LocalDate.parse(fechaDevolucion);
        
        Duration tiempoAlqui = Duration.between(inicio.atStartOfDay(), fin.atStartOfDay());
        
        return tiempoAlqui.toDays();
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", documento=" + documento + ", fechaInicio=" + fechaInicio + ", fechaDevolucion=" + fechaDevolucion + '}';
    }

}
