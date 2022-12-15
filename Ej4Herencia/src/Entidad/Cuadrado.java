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
public class Cuadrado implements CalculosForma {

    protected double base;
    protected double altura;

    public Cuadrado() {
    }

    public Cuadrado(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double perimetro() {
        return (base + altura)*2;
    }

    @Override
    public double area() {
        return base * altura;
    }

}
