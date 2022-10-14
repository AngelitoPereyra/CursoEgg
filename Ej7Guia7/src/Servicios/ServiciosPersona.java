/*
Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad, sexo
('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
atributo, puede hacerlo. Los métodos que se implementarán son:
• Un constructor por defecto.
• Un constructor con todos los atributos como parámetro.
• Métodos getters y setters de cada atributo.
 • Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O.
Si no es correcto se deberá mostrar un mensaje
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve
un booleano.
 */
package Servicios;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Agus
 */
public class ServiciosPersona {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {
        boolean flag = true;
        Persona persona = new Persona();
        System.out.println("Ingrese el nombre de la persona: ");
        persona.setNombre(leer.next());
        System.out.println("Ingrese la edad de la persona: ");
        persona.setEdad(leer.nextInt());
        String sexo = "";
        do {
            System.out.println("ingrese el sexo:   H/M/O ");
            sexo = leer.next();
            if (sexo.equalsIgnoreCase("M") || (sexo.equalsIgnoreCase("H")) || (sexo.equalsIgnoreCase("O"))) {
                persona.setSexo(sexo);
                flag = true;
            } else {
                System.out.println("Su sexo no es correcto, valla a la iglesia");
                flag = false;
            }
        } while (flag == false);
        
        System.out.println("Ingrese el peso de la persona: ");
        persona.setPeso(leer.nextDouble());
        System.out.println("Ingrese la altura de la persona: ");
        persona.setAltura(leer.nextDouble());
               
        return persona;
    }
    
    public void CalcularIMC(Persona persona){
       
        Double imc1= (persona.getPeso())/(persona.getAltura()*(persona.getAltura()));

        if (imc1<20){
            persona.setIMC(-1);
            System.out.println("Le falta comidita");
            }
            else if ((imc1>19)&&(imc1<26)){
                persona.setIMC(0);
                System.out.println("Estas bien");
                }
                else if (imc1>25){
                    persona.setIMC(1);
                    System.out.println("Pasadito de comida");
                        }
    
    }
    
    
    public boolean esMayorEdad(Persona persona){
        boolean flag=true;
        if(persona.getEdad()<18){
            flag=false;
            System.out.println("Usted es mayor de edad??   "+flag);
            
        }
        else{
            System.out.println("Usted es mayor de edad???     "+ flag);}
        persona.setMayorEdad(flag);
        return flag;
        
    }
}
