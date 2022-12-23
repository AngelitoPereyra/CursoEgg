/*
 Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Agus
 */
public class Barco {
    protected String matricula;
    protected int eslora;
    protected int añoFabricacion;
    protected int posicionAmarre;

    public Barco() {
    }

    public Barco(String matricula, int eslora, int añoFabricacion, int posicionAmarre) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.añoFabricacion = añoFabricacion;
        this.posicionAmarre = posicionAmarre;
        
    }

    public String getMatricula() {
        return matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public int getPosicionAmarre() {
        return posicionAmarre;
    }
    

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    public void setPosicionAmarre(int posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }
    

    
    
    public void crearBarco(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("El barco esta amarrando al puerto...");
        System.out.println("Ingrese la matricula del vehiculo; ");
        this.matricula = leer.next();
        System.out.println("Ingrese el largo del barco: ");
        this.eslora = leer.nextInt();
        System.out.println("Ingrese el año de fabricacion: ");
        this.añoFabricacion = leer.nextInt();
        System.out.println("Ingrese la posicion del amarre");
        this.posicionAmarre = leer.nextInt();
    }
    
    public int PrecioFinal(){
        return eslora*10;
    }

    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", eslora=" + eslora + ", a\u00f1oFabricacion=" + añoFabricacion + ", posicionAmarre=" + posicionAmarre + '}';
    }
    
    
}
