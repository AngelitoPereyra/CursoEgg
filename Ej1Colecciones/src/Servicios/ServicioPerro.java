/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
 */
package Servicios;

import Entidad.Perro;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Agus
 */
public class ServicioPerro {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Perro nuevoPerro = new Perro();
    ArrayList <String> raza = new ArrayList();
    
    public void Menu(){
        int menu=0;
        do{
            System.out.println("Que desea hacer?");
            System.out.println("1- Ingresar Raza");
            System.out.println("2- Mostrar Razas");
            System.out.println("3- Salir");
            menu=leer.nextInt();
            switch(menu){
                case 1 :
                    IngresarRaza();
                    break;
                case 2 :
                    MostrarRazas();
                    break;
                case 3:
                    break;
            }
        }while(menu!=3);
    }
    
    public void IngresarRaza(){
        String menu="S";
        boolean flag= false;
        
        do{
            System.out.println("Ingrese la raza del perro");
            raza.add(leer.next());
            System.out.println("Desea ingresar otra raza? S/N");
            menu=leer.next();
            if(menu.equals("N")){
                flag=true;
            }
            
        }while(flag== false);
        
        nuevoPerro.setRazaPerro(raza);
    }
    
    public void MostrarRazas(){
        
        for (String muestra : nuevoPerro.getRazaPerro()){
            System.out.println(muestra);
        }
    }
    
}
