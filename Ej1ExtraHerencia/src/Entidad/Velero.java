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
public class Velero extends Barco{
    protected int cantVelas;
    
    
     public Velero() {
    }

    public Velero(int cantVelas) {
        this.cantVelas = cantVelas;
    }

    public Velero(int cantVelas, String matricula, int eslora, int añoFabricacion, int posicionAmarre) {
        super(matricula, eslora, añoFabricacion, posicionAmarre);
        this.cantVelas = cantVelas;
    }

    @Override
    public void crearBarco() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        super.crearBarco();
        System.out.println("Ingrese la cantidad de velas: ");
        this.cantVelas = leer.nextInt();
    }
    

    @Override
    public int PrecioFinal() {
        return super.PrecioFinal()+cantVelas;
    }

    @Override
    public String toString() {
        return super.toString() + "Velero{" + "cantVelas=" + cantVelas + '}';
    }

    
   
    
}
