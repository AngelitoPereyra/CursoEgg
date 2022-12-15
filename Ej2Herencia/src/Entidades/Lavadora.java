/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Agus
 */
public class Lavadora extends Electrodoméstico{

    protected int carga;
    
    public Lavadora() {
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public Lavadora(int carga) {
        this.carga = carga;
    }

    public Lavadora(int precio, String color, char consumoEnergetico, int peso) {
        super(precio, color, consumoEnergetico, peso);
    }
    
    public void crearLavadora(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        super.crearElectrodomestico();
        System.out.println("Ingrese la capacidad de carga en Kg");
        this.carga = leer.nextInt();
        precioFinal();
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if(this.carga>30){
            super.precio+=500;
        }
    }

    @Override
    public String toString() {
        return super.toString()+ "carga=" + carga;
    }

    
   
}
