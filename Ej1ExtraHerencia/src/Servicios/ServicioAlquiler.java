/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidad.Alquiler;
import Entidad.Barco;
import Entidad.Motor;
import Entidad.Usuario;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Agus
 */
public class ServicioAlquiler {

    ServicioBarco puerto;

    public ServicioAlquiler(ServicioBarco puerto) {
        this.puerto = puerto;
    }

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    Usuario nuevoUsuario = new Usuario();
    Alquiler nuevoAlquiler = new Alquiler();
    ArrayList<Barco> a1 = new ArrayList();

    public void menuAlquiler() {
        boolean flag = false;
        int menu = 0;
        a1 = puerto.listaBarcos;
         while (flag == false) {
            System.out.println("Alquilame este bote!!!");
            System.out.println("1- Ver barcos disponibles");
            System.out.println("2- Alquilar un barco");
            System.out.println("3- Salir");
            menu = leer.nextInt();
            switch (menu) {
                case 1 ->
                    MostrarBarcos();
                case 2 -> {
                    nuevoUsuario.nuevoUsuario();
                    nuevoAlquiler.setCliente(nuevoUsuario);
                    System.out.println("Ingrese la posicion del amarre");
                    nuevoAlquiler.setPosicionAmarre(leer.nextInt());
                    nuevoAlquiler.setBarco(puerto.listaBarcos.get(nuevoAlquiler.getPosicionAmarre() - 1));
                    cierreDeContrato();
                    System.out.println(nuevoAlquiler.getBarco().PrecioFinal());
                    flag = true;
                }
                case 3 ->
                    flag = true;
            }
            
            a1.add(Motor.nuevaFuncion());
            
        }
         
    }

    public void cierreDeContrato() {
        System.out.println(nuevoAlquiler);

    }

    public void MostrarBarcos() {
        for (Barco barco : puerto.listaBarcos) {

            System.out.println(barco.toString());
        }
    }

    @Override
    public String toString() {
        return "ServicioAlquiler{" + "leer=" + leer + ", puerto=" + puerto + ", nuevoUsuario=" + nuevoUsuario + ", nuevoAlquiler=" + nuevoAlquiler + ", a1=" + a1 + '}';
    }

}
