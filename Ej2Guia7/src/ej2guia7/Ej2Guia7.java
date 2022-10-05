/*
 Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (���� = � ∗ ������).
e) Método perimetro(): para calcular el perímetro (��������� = � ∗ � ∗ �����).

 */
package ej2guia7;

import Entidad.Circunferencia;
import Servicios.ServiciosCircunferencia;

/**
 *
 * @author Agus
 */
public class Ej2Guia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     ServiciosCircunferencia SC=new ServiciosCircunferencia();
     Circunferencia nC=SC.CrearCircunferencia();
     SC.area(nC);
     SC.perimetro(nC);
    }
    
}
