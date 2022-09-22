/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
 */
package javaapplication3;
import java.util.Scanner;
/**
 *
 * @author Agus
 */
public class ej12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        boolean logic = true;
        int c = 0, c1=0;
        String cadena = "", exit ="&&&&&";
        while(logic == true){
            System.out.print("Escriba un codigo correcto: ");
            cadena = leer.next();
            if ((cadena.substring(0,1).equals("X")) && (cadena.substring(cadena.length()-1, cadena.length()).equals("O"))){
               c=c+1;     }
            else{
                c1=c1+1;    }
            if (cadena.equals(exit)){
                logic=false;   }
        }
        
        System.out.println("Usted ingreso " + c + " codigos correctos");
        System.out.println("Usted ingreso " + c1 + " codigos correctos");
    }
    
}
