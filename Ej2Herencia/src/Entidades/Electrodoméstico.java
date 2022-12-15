/*
 Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
consumo energético (letras entre A y F) y peso.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Agus
 */
public class Electrodoméstico {

    protected int precio;
    protected String color;
    protected char consumoEnergetico;
    protected int peso;

    public Electrodoméstico() {
    }

    public Electrodoméstico(int precio, String color, char consumoEnergetico, int peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void comprobarConsumoEnergetico(char c) {
        switch (c) {
            case 'a':
                this.consumoEnergetico = c;
                break;
            case 'b':
                this.consumoEnergetico = c;
                break;
            case 'c':
                this.consumoEnergetico = c;
                break;
            case 'd':
                this.consumoEnergetico = c;
                break;
            case 'e':
                this.consumoEnergetico = c;
                break;
            case 'f':
                this.consumoEnergetico = c;
                break;
            case default:
                this.consumoEnergetico = 'f';
                break;
        }

    }

    public void comprobarColor(String color) {
        switch(color){
            case "blanco":
                this.color = color;
                break;
            case "negro":
                this.color = color;
                break;
            case "rojo":
                this.color = color;
                break;
            case "azul":
                this.color = color;
                break;
            case "gris":
                this.color = color;
                break;
            case default:
                this.color = "blanco";
                break;
                
        }
    }

    public void crearElectrodomestico() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el consumo electrico del Electrodomestico: ");
        char consumo= leer.next().charAt(0);
        comprobarConsumoEnergetico(consumo);
        System.out.println("Ingrese el color del electrodomestico: ");
        String color=leer.next();
        System.out.println("Ingrese el peso del producto: ");
        this.peso=leer.nextInt();
        comprobarColor(color);
        precioFinal();
       
    }

    public void precioFinal() {
        switch (consumoEnergetico) {
            case 'a' -> this.precio = 1000;
            case 'b' -> this.precio = 800;
            case 'c' -> this.precio = 600;
            case 'd' -> this.precio = 500;
            case 'e' -> this.precio = 300;
            case 'f' -> this.precio = 100;
        }
        if(peso>0&&peso<20){
            this.precio= precio + 100;
        }else if (peso>=20 && peso<50){
            this.precio = precio + 500;
        }else if(peso>=50 && peso<80){
            this.precio = precio + 800;
        }else if(precio>=80){
            this.precio = precio + 1000;
        }
        this.precio+=1000;
    }

    @Override
    public String toString() {
        return "Electrodomestico" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso;
    }

}
