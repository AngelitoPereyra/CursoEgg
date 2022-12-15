/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Agus
 */
public class Animal {

    protected String nombre ;
    protected String alimento ;
    protected int edad ;
    protected String razaAnimal ;

    public Animal() {
    }

    public Animal(String nombre, String alimento, int edad, String razaAnimal) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.razaAnimal = razaAnimal;
    }
    
    public String seAlimenta(){
            return "Se alimenta de: "+ this.alimento;
}
    
    
    
      
}
