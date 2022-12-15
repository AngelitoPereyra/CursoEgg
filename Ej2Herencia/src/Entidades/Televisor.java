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
public class Televisor extends Electrodoméstico{
    
    protected int resolucion;
    protected boolean TDT;

    public Televisor() {
    }

  
    public Televisor(int resolucion, boolean TDT, int precio, String color, char consumoEnergetico, int peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.TDT = TDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }
    
    public void crearTelevisor(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        super.crearElectrodomestico();
        System.out.println("Ingrese la resolucion de la tv");
        this.resolucion = leer.nextInt();
        System.out.println("el televisor contiene TDT? S/N");
        String flag = leer.next();
        this.TDT = flag.equalsIgnoreCase("s");  
        precioFinal();
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if(resolucion>=40){
            super.precio+=precio*0.3;
        }
        if(TDT){
            super.precio+=500;
        }
    }

    @Override
    public String toString() {
        return super.toString()+ "resolucion"+this.resolucion + "TDT" + this.TDT;
    }
    
    
}
