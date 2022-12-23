/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidad.Alquiler;
import Entidad.Barco;
import Entidad.Usuario;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Agus
 */
public class ServicioAlquiler {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ServicioBarco puerto = new ServicioBarco();
    Usuario nuevoUsuario = new Usuario();
    Alquiler nuevoAlquiler = new Alquiler();
    ArrayList<Barco> a1 = new ArrayList();

    public void menuAlquiler() {
        boolean flag = false;
        int menu = 0;
        a1=puerto.listaBarcos;
        do {
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
                    nuevoAlquiler.setBarco(puerto.listaBarcos.get(nuevoAlquiler.getPosicionAmarre()-1));
                    cierreDeContrato();
                    flag = true;
                }
                case 3 ->
                    flag = true;
            }
        } while (flag == false);
    }

    public void cierreDeContrato() {
        System.out.println(nuevoAlquiler);

    }

    public void MostrarBarcos() {
        for (Barco barco : a1) {
           
            System.out.println(barco.toString());
        }
    }

    @Override
    public String toString() {
        return "ServicioAlquiler{" + "leer=" + leer + ", puerto=" + puerto + ", nuevoUsuario=" + nuevoUsuario + ", nuevoAlquiler=" + nuevoAlquiler + ", a1=" + a1 + '}';
    }

}
