/*
Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo.
 */
package Entidad;

/**
 *
 * @author Agus
 */
public class Carta {

    private int numero;
    private String palo;

    public Carta(int numero, String palo) {
        if (numero >= 8 && numero <= 9) {
        } else {
            this.numero = numero;
            this.palo= palo;
        }
    }

    public Carta() {
        
    }

    public int getNumero() {
        return numero;
    }

    public String getPalo() {
        return palo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "Carta{" + "numero= " + numero + ", palo= " + palo + '}';
    }

}