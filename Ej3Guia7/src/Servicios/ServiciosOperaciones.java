/*
 d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda en
los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. Si
no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
una división por cero, el método devuelve 0 y se le informa al usuario el error se le
informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
 */
package Servicios;

import Entidad.Operacion;
import java.util.Scanner;

/**
 *
 * @author Agus
 */
public class ServiciosOperaciones {

    public Operacion CargarDatos(){
        Scanner leer=new Scanner(System.in);
        Operacion Ope = new Operacion();
        System.out.println("Ingrese el primer numero a operar");
        Ope.setN1(leer.nextInt());
        System.out.println("Ingrese el segundo numero a operar");
        Ope.setN2(leer.nextInt());
        
        
        return Ope;
    }
    
    public void Suma(Operacion Ope){
        int Suma= Ope.getN1()+Ope.getN2();
        System.out.println("La suma es: " + Suma);
        
    }
    
    public void Resta(Operacion Ope){
        int resta= Ope.getN1()- Ope.getN2();
        System.out.println("La resta es: " + resta);
    }
    public void Multiplicacion(Operacion Ope){
        int Multi;
        if(Ope.getN1()==0 || Ope.getN2()==0){
            Multi=0;
            System.out.println("Su multiplicacion da 0 porque todo numero multiplicado por 0 da como resultado, 0. Osea, la culpa es tuya...");
            }
        else if (Ope.getN1()!=0 && Ope.getN2()!=0){
            Multi= Ope.getN1() * Ope.getN2();
            System.out.println("La Multiplicacion da:" + Multi);
        }
    }
    
    public void Division(Operacion Ope){
        int Divi;
        if(Ope.getN1()==0 || Ope.getN2()==0){
            Divi=0;
            System.out.println("Su division da 0 porque todo numero dividido por 0 da como resultado, 0. Osea, la culpa es tuya...");
            }
        else if (Ope.getN1()!=0 && Ope.getN2()!=0){
            Divi= Ope.getN1() / Ope.getN2();
            System.out.println("La Division da:" + Divi);
        }
    }
}
