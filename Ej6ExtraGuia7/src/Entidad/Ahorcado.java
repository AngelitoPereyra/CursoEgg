/*
 Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener como
atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la cantidad
jugadas máximas que puede realizar el usuario. Definir los siguientes métodos con los
parámetros que sean necesarios:
• Constructores, tanto el vacío como el parametrizado.
 */
package Entidad;

/**
 *
 * @author Agus
 */
public class Ahorcado {

    private char[] palabra;
    private char[] muestra;
    private int cantLetras;
    private int jugadasMax;
    private int cantEncontradas;

    //constructores
    public Ahorcado() {
    }

    public Ahorcado(char[] palabra,char[] muestra, int cantLetras, int jugadasMax, int cantEncontradas) {
        this.palabra = palabra;
        this.muestra = muestra;
        this.cantLetras = cantLetras;
        this.jugadasMax = jugadasMax;
        this.cantEncontradas = cantEncontradas;
    }

    //Getters and Setters
    public int getCantEncontradas() {
        return cantEncontradas;
    }

    public void setCantEncontradas(int cantEncontradas) {
        this.cantEncontradas = cantEncontradas;
    }

    public char[] getPalabra() {
        return palabra;
    }

    public void setPalabra(char[] palabra) {
        this.palabra = palabra;
    }

    public int getCantLetras() {
        return cantLetras;
    }

    public void setCantLetras(int cantLetras) {
        this.cantLetras = cantLetras;
    }

    public int getJugadasMax() {
        return jugadasMax;
    }

    public void setJugadasMax(int jugadasMax) {
        this.jugadasMax = jugadasMax;
    }

    public char[] getMuestra() {
        return muestra;
    }

    public void setMuestra(char[] muestra) {
        this.muestra = muestra;
    }

}
