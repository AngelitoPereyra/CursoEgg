/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Agus
 */
public class Motor extends Barco{
    protected int cv;

    public Motor() {
    }

    public Motor(int cv) {
        this.cv = cv;
    }

    public Motor(int cv, String matricula, int eslora, int añoFabricacion, int posicionAmarre) {
        super(matricula, eslora, añoFabricacion, posicionAmarre);
        this.cv = cv;
    }

    @Override
    public void crearBarco() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        super.crearBarco();
        System.out.println("Ingrese los CV del motor: ");
        this.cv = leer.nextInt();
        
    }

    
    @Override
    public int PrecioFinal() {
        return super.PrecioFinal()+cv; 
    }

    @Override
    public String toString() {
        return super.toString()+ "Motor{" + "cv=" + cv + '}';
    }

  public static Barco nuevaFuncion(){
      Barco n1 = new Motor();
      return n1;
  }

    
    
    
}
