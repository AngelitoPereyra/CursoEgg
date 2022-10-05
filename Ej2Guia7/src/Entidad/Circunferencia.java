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
package Entidad;

/**
 *
 * @author Agus
 */
public class Circunferencia {
    
    private Double radio;
   
    
    //Constructor

    public Circunferencia(Double radio) {
        this.radio = radio;
    }
    
    // getter

    public Double getRadio() {
        return radio;
    }
    
    //Setter

    public void setRadio(Double radio) {
        this.radio = radio;
    }
    
    
    
}
