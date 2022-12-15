/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import Interface.CalculosForma;

/**
 *
 * @author Agus
 */
public class Circulo implements CalculosForma{
    protected double radio;
    protected double diametro;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
        this.diametro = radio*2;
    }

    @Override
    public double perimetro() {
        return pi * diametro;
    }

    @Override
    public double area() {
      return pi*(radio*radio);  
    }
    
    
    
    
}
