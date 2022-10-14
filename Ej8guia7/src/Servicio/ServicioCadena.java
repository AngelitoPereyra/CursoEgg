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
package Servicio;

import Entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author Agus
 */
public class ServicioCadena {
    Scanner leer=new Scanner(System.in).useDelimiter("\n");
    
    public int ContarVocales(Cadena frase){
        frase.setLongitud(frase.getFrase().length());
        int cont=0;
        for (int i = 0; i < frase.getLongitud(); i++) {
            if ((frase.getFrase().substring(i, i+1).equalsIgnoreCase("A"))||(frase.getFrase().substring(i, i+1).equalsIgnoreCase("E"))||(frase.getFrase().substring(i, i+1).equalsIgnoreCase("I"))||(frase.getFrase().substring(i, i+1).equalsIgnoreCase("O"))||(frase.getFrase().substring(i, i+1).equalsIgnoreCase("U"))){
                cont++;
            }
        }
        System.out.println("Su frase contiene "+ cont + " vocales");
        
        return cont;
    }
    
    public void InvertirFrase(Cadena frase){
        
        char letra;
        System.out.println(frase.getLongitud());
        for (int i = frase.getLongitud()-1; i >= 0; i--) {
            letra=frase.getFrase().charAt(i);
            System.out.print(letra);
        }
        System.out.println("");
    }
    
    
    public void VecesRepetido(Cadena frase){
        System.out.println("Ingrese una letra a buscar: ");
        String letra=leer.next();        
        int cont=0;
        for (int i = 0; i < frase.getLongitud(); i++) {
            if(frase.getFrase().substring(i, i+1).equalsIgnoreCase(letra)){
                cont++;
            }
        }
        System.out.println("Su letra esta"+ cont+ " veces");
    }
    
    public void CompararLong(Cadena frase){
        System.out.println("Ingrese una frase para comparar longitudes: ");
        String fras2=leer.next();
         
        if (frase.getLongitud()<fras2.length()){
            System.out.println("La frase original es mas corta que la nueva");        }
        else if (frase.getLongitud()==fras2.length()){
            System.out.println("Las frases contienen la misma cantidad de caracteres");        }
        else if(frase.getLongitud()==fras2.length()){
            System.out.println("La frase secundaria es mas larga que la principal");
        }
    }
    
    
    
    public void reemplazar(Cadena frase){
         System.out.println("Ingrese una letra a reemplazar ");
        String fras2=leer.next();
         System.out.println("Ingrese la letra a ingresar en reemplazo ");
        String letra=leer.next();
        String nuevaCadena = frase.getFrase().replace(fras2, letra);
        
        System.out.println(nuevaCadena);
    }

    
    public boolean contiene(Cadena frase){
        System.out.println("Ingrese la letra a buscar en la frase ");
        String letra=leer.next();
        boolean res = frase.getFrase().contains(letra);       
        System.out.println(res);
        return res;
    }

    
    public void unirFrases(Cadena frase){
         System.out.println("Ingrese una frase para concatenar: ");
        String fras2=leer.next();
        String cadenaUnida = frase.getFrase() +" "+fras2;
        
        System.out.println(cadenaUnida);
    }

}



