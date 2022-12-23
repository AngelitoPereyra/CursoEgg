/*
 En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.
 */
package Entidad;



/**
 *
 * @author Agus
 */
public class Alquiler {
    protected Usuario cliente;
    protected Barco barco;
    protected int posicionAmarre;

    public Alquiler() {
        
    }

    public Alquiler(Usuario cliente, Barco barco, int posicionAmarre) {
        this.cliente = cliente;
        this.barco = barco;
        this.posicionAmarre = posicionAmarre;
    }

    public Usuario getCliente() {
        return cliente;
    }

    public void setCliente(Usuario cliente) {
        this.cliente = cliente;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    public int getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(int posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }
    

    @Override
    public String toString() {
        return "Alquiler{" + "cliente=" + cliente + ", barco=" + barco + '}';
    }
    
    
    
}
