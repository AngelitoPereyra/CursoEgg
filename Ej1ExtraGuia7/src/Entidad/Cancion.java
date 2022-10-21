/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Agus
 */
public class Cancion {
 private String cancion;
 private String autor;

    public Cancion() {
    }

    public Cancion(String cancion, String autor) {
        this.cancion = cancion;
        this.autor = autor;
    }

    public String getCancion() {
        return cancion;
    }

    public void setCancion(String cancion) {
        this.cancion = cancion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Cancion{" + "cancion=" + cancion + ", autor=" + autor + '}';
    }
 
 
 
}
