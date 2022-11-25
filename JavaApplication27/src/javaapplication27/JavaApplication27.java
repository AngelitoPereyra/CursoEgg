/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication27;

import Servicios.ServiciosAlumnos;
import java.util.Scanner;

/**
 *
 * @author Agus
 */
public class JavaApplication27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServiciosAlumnos Sa = new ServiciosAlumnos();
        Scanner leer = new Scanner(System.in);
        boolean flag= false;
        int menu;
        do{
            System.out.println("Que desea hacer?");
            System.out.println("1- Ingresar alumnos");
            System.out.println("2- Calcular nota final");
            System.out.println("3- Salir");
            menu= leer.nextInt();
            switch (menu){
                case 1:
                    Sa.crearObjeto();
                    break;
                case 2:
                    Sa.notaFinal();
                    break;
                case 3:
                    flag=true;
                    break;
            
        }
        }while (flag==false);
        
    }
    
}
