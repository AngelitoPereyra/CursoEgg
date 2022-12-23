/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidad.Alquiler;
import Entidad.Barco;
import Entidad.Camarote;
import Entidad.Motor;
import Entidad.Velero;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Agus
 */
public class ServicioBarco {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Barco> listaBarcos = new ArrayList();

    public void menuBarco() {
        boolean flag = false;
        int menu = 0;
        do {
            System.out.println("que tipo de barco esta amarrando al puerto? ");
            System.out.println("1- velero");
            System.out.println("2- Barco con motor");
            System.out.println("3- Yate");
            System.out.println("4- Lista de Barcos disponibles");
            System.out.println("5- Salir");
            menu = leer.nextInt();
            switch (menu) {
                case 1:
                    Barco velero = new Velero();
                    velero.crearBarco();
                    listaBarcos.add(velero);
                    System.out.println(velero);
                    break;
                case 2:
                    Barco motor = new Motor();
                    motor.crearBarco();
                    listaBarcos.add(motor);
                    break;
                case 3:
                    Barco camarote = new Camarote();
                    camarote.crearBarco();
                    listaBarcos.add(camarote);
                    break;
                case 4:
                    for (Barco listaBarco : listaBarcos) {
                        System.out.println(listaBarco);
                        break;
                    }
                case 5:
                    flag = true;
                    break;
            }

        } while (flag == false);
    }

    public ArrayList <Barco> mostrarBarcos() {
        
        return listaBarcos;
    }
}
