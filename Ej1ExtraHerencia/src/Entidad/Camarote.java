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
public class Camarote extends Motor {
    protected int camarotes;

    public Camarote() {
    }

    public Camarote(int camarotes) {
        this.camarotes = camarotes;
    }

    public Camarote(int camarotes, int cv) {
        super(cv);
        this.camarotes = camarotes;
    }

    public Camarote(int camarotes, int cv, String matricula, int eslora, int añoFabricacion, int posicionAmarre) {
        super(cv, matricula, eslora, añoFabricacion, posicionAmarre);
        this.camarotes = camarotes;
    }

    @Override
    public int PrecioFinal() {
        return super.PrecioFinal() + camarotes; 
    }

    @Override
    public void crearBarco() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        super.crearBarco(); 
        System.out.println("Ingrese la cantidad de camarotes: ");
        this.camarotes = leer.nextInt();
        
    }

    @Override
    public String toString() {
        return super.toString() + "Camarote{" + "camarotes=" + camarotes + '}';
    }
    
    
}
