/*
Vamos a realizar una clase llamada Raices, donde representaremos los valores de una
ecuación de 2o grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b y c.
Hay que insertar estos 3 valores para construir el objeto a través de un método
constructor. Luego, las operaciones que se podrán realizar son las siguientes:
• Método getDiscriminante(): devuelve el valor del discriminante (double). El
discriminante tiene la siguiente formula: (b^2)-4*a*c
• Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
que esto ocurra, el discriminante debe ser mayor o igual que 0.
• Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
que esto ocurra, el discriminante debe ser igual que 0.
• Método obtenerRaices(): llama a tieneRaíces() y si devolvió́true, imprime las 2 posibles
soluciones.
• Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́true imprime una única raíz. Es
en el caso en que se tenga una única solución posible.
• Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
de no existir solución, se mostrará un mensaje.
Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo delante de -b
 */
package ServiciosRaices;

import Entidad.Raices;
import java.util.Scanner;

/**
 *
 * @author Agus
 */
public class ServiciosRaices {

    Scanner leer = new Scanner(System.in);

    public Raices nuevaRaiz() {
        Raices raiz = new Raices();
        System.out.println("Ingrese los valores de los atriburos");
        System.out.println("Atriburo A:");
        raiz.setA(leer.nextDouble());
        System.out.println("Atriburo B:");
        raiz.setB(leer.nextDouble());
        System.out.println("Atriburo C:");
        raiz.setC(leer.nextDouble());
        return raiz;

    }

    public void getDiscrimintante(Raices raiz) {
        //(b^2)-4*a*c
        raiz.setDiscrimintante(((Math.pow(raiz.getB(), 2)) - (4 * raiz.getA() * raiz.getC())));
        System.out.println("El discrimintante es :" + ((Math.pow(raiz.getB(), 2)) - (4 * raiz.getA() * raiz.getC())));
    }

    public boolean tieneRaices(Raices raiz){
        boolean flag=false;
        if(raiz.getDiscrimintante()>0){
            flag=true;
            
        }
        System.out.println("Tiene raices?: "+ flag);
        return flag;
        
    }
    public boolean tieneRaiz(Raices raiz){
        boolean flag=false;
        if(raiz.getDiscrimintante()==0){
            flag=true;
            
        }
        System.out.println("Tiene raices?: "+ flag);
        return flag;
    }
    
    public void obtenerRaices(Raices raiz){
        double vascara;
        if(tieneRaices(raiz)){
            vascara=-raiz.getB()+Math.sqrt((Math.pow(raiz.getB(),2)-(4*raiz.getA()*raiz.getC())/(2*raiz.getA())));
            System.out.println("La raiz positiva es :"+ vascara);
            vascara=-raiz.getB()-Math.sqrt((Math.pow(raiz.getB(),2)-(4*raiz.getA()*raiz.getC())/(2*raiz.getA())));
            System.out.println("La raiz negativa es :"+ vascara);
            
        }
        
    }
    public void obtenerRaiz(Raices raiz){
        double vascara;
        if(tieneRaiz(raiz)){
            vascara=-raiz.getB()+Math.sqrt((Math.pow(raiz.getB(),2)-(4*raiz.getA()*raiz.getC())/(2*raiz.getA())));
            System.out.println("La raiz positiva es :"+ vascara);
            vascara=-raiz.getB()-Math.sqrt((Math.pow(raiz.getB(),2)-(4*raiz.getA()*raiz.getC())/(2*raiz.getA())));
            System.out.println("La raiz negativa es :"+ vascara);
            
        }
        
    }
    
    public void calcularRaices(Raices raiz){
        if(tieneRaices(raiz)){
            obtenerRaices(raiz);
        }
        else if(tieneRaiz(raiz)){
            obtenerRaiz(raiz);
    }
    }
    
    
    
}
//-raiz.getB()+-Math.sqrt((Math.pow(raiz.getB(),2)-(4*raiz.getA()*raiz.getC())/(2*raiz.getA())))
