/*
 

A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene
sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es
mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.
 */
package ej7guia7;

import Entidad.Persona;
import Servicios.ServiciosPersona;

/**
 *
 * @author Agus
 */
public class Ej7Guia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServiciosPersona Sp = new ServiciosPersona();

        Persona p1 = Sp.crearPersona();
        Sp.CalcularIMC(p1);
        p1.setMayorEdad(Sp.esMayorEdad(p1));

        Persona p2 = Sp.crearPersona();
        Sp.CalcularIMC(p2);
        p2.setMayorEdad(Sp.esMayorEdad(p2));

        Persona p3 = Sp.crearPersona();
        Sp.CalcularIMC(p3);
        p3.setMayorEdad(Sp.esMayorEdad(p3));

        Persona p4 = Sp.crearPersona();
        Sp.CalcularIMC(p4);
        p4.setMayorEdad(Sp.esMayorEdad(p4));

        PromPeso(p1, p2, p3, p4);

        PromEdad(p1, p2, p3, p4);

    }

    public static void PromPeso(Persona p1, Persona p2, Persona p3, Persona p4) {
        int imc1 = p1.getIMC();
        int imc2 = p2.getIMC();
        int imc3 = p3.getIMC();
        int imc4 = p4.getIMC();
        double peso1 = p1.getPeso();
        double peso2 = p2.getPeso();
        double peso3 = p3.getPeso();
        double peso4 = p4.getPeso();
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        switch (imc1) {
            case -1:
                cont1++;
                break;
            case 0:
                cont2++;
                break;
            default:
                cont3++;
                break;
        }
        switch (imc2) {
            case -1:
                cont1++;
                break;
            case 0:
                cont2++;
                break;
            default:
                cont3++;
                break;
        }
        switch (imc3) {
            case -1:
                cont1++;
                break;
            case 0:
                cont2++;
                break;
            default:
                cont3++;
                break;
        }
        switch (imc4) {
            case -1:
                cont1++;
                break;
            case 0:
                cont2++;
                break;
            default:
                cont3++;
                break;
        }
        System.out.println("Hay " + cont1 + "personas con bajo peso");
        System.out.println("Hay " + cont2 + "personas con buen peso");
        System.out.println("Hay " + cont3 + "personas con extra peso");
        System.out.println("El peso promedio es de " + (peso1 + peso2 + peso3 + peso4) / 4);
    }

    public static void PromEdad(Persona p1, Persona p2, Persona p3, Persona p4) {
        boolean flag1 = p1.isMayorEdad();
        boolean flag2 = p2.isMayorEdad();
        boolean flag3 = p3.isMayorEdad();
        boolean flag4 = p4.isMayorEdad();
        int cont1 = 0;
        int cont2 = 0;

        if (flag1 == true) {
            cont1++;
        } else {
            cont2++;
        }
        if (flag2 == true) {
            cont1++;
        } else {
            cont2++;
            if (flag1 == true) {
                cont1++;
            } else {
                cont2++;
            }
            if (flag2 == true) {
            }
            if (flag3 == true) {
                cont1++;
            } else {
                cont2++;
            }
            if (flag4 == true) {
                cont1++;
            } else {
                cont2++;
            }
            int e1 = p1.getEdad();
            int e2 = p2.getEdad();
            int e3 = p3.getEdad();
            int e4 = p4.getEdad();
            System.out.println("Hay" + cont1 + " cantidad de adultos");
            System.out.println("Hay" + cont2 + " cantidad de menores");
            System.out.println("El promedio de edad es de " + (e1 + e2 + e3 + e4) / 4);
        }
    }
}