/*
 Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de String)
y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese una frase
que puede ser una palabra o varias palabras separadas por un espacio en blanco y a
través de los métodos set, se guardará la frase y la longitud de manera automática según
la longitud de la frase ingresada. Deberá además implementar los siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase
ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con
una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la
frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package ej8guia7;

import Entidad.Cadena;
import Servicio.ServicioCadena;
import java.util.Scanner;

/**
 *
 * @author Agus
 */
public class Ej8guia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioCadena Sc = new ServicioCadena();
        System.out.println("Ingrese una frase");
        Cadena frase = new Cadena();
        frase.setFrase(leer.next());
        frase.setLongitud(frase.getFrase().length());
        boolean flag=false;
        int menu;
        do {
            System.out.println("Ingrese la opcion que desea: ");
            System.out.println("1- Contar Vocales");
            System.out.println("2- Invertir frase");
            System.out.println("3- Veces Repetido");
            System.out.println("4- Comparar longitud");
            System.out.println("5- Unir Frases");
            System.out.println("6- Reemplazar");
            System.out.println("7- Contiene");
            System.out.println("8- Salir");
            menu = leer.nextInt();
            switch (menu) {
                case 1:
                    Sc.ContarVocales(frase);
                    break;
                case 2:
                    Sc.InvertirFrase(frase);
                    break;
                case 3:
                    Sc.VecesRepetido(frase);
                    break;
                case 4:
                    Sc.CompararLong(frase);
                    break;
                case 5:
                    Sc.unirFrases(frase);
                    break;
                case 6:
                    Sc.reemplazar(frase);
                    break;
                case 7:
                    Sc.contiene(frase);
                    break;
                case 8:
                    flag=true;
                    break;

            }
        } while (flag==false);

    }

}
