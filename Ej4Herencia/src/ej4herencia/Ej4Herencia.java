/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej4herencia;

import Entidad.Circulo;
import Entidad.Cuadrado;

/**
 *
 * @author Agus
 */
public class Ej4Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuadrado c = new Cuadrado (2, 2);
        Circulo cir = new Circulo (2);
        System.out.println("El area del cuadrado es de : "+ c.area()+" y el perimetro es de : "+ c.perimetro());
        System.out.println("El area del circulo es de : "+ cir.area()+" y el perimetro es de : "+ cir.perimetro());
    }
    
}
