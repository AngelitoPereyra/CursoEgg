/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej5guia7;

import Entidad.Cuenta;
import Servicios.ServiciosCuenta;
import java.util.Scanner;

/**
 *
 * @author Agus
 */
public class Ej5Guia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServiciosCuenta serviciosCuenta = new ServiciosCuenta();
        Cuenta cuenta = serviciosCuenta.NuevaCuenta();
        boolean salida = false;
        Scanner leer = new Scanner(System.in);

        while (salida == false) {
            System.out.println("Que desea hacer?: ");
            System.out.println("1- Ingresar Dinero");
            System.out.println("2- Extraer Dinero");
            System.out.println("3- Extraccion Rapida");
            System.out.println("4- Consultar Saldo");
            System.out.println("5- Consultar Datos");
            System.out.println("6- Salir");
            int menu = leer.nextInt();
            switch (menu) {
                case 1:
                    serviciosCuenta.IngresarDinero(cuenta);
                    
                    break;
                case 2:
                    serviciosCuenta.Retirar(cuenta);
                    break;
                case 3:
                    serviciosCuenta.ExtraccionRapida(cuenta);
                case 4:
                    serviciosCuenta.ConsultarSaldo(cuenta);
                    break;
                case 5:
                    serviciosCuenta.ConsultadDatos(cuenta);
                    break;
                case 6:
                    salida = true;
                    break;

            }
        }
    }

}
