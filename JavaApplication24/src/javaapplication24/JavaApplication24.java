
package javaapplication24;

import Entidad.Objeto;
import Servicios.ServicioObjeto;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author AgustinP
 */
public class JavaApplication24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creacion de ArrayList
        
        ArrayList<String> nuevaLista = new ArrayList ();
        
        //(Los conjuntos o en ingles Set modelan una colección de objetos de una misma clase donde cada elemento aparece solo una vez)
        
        //creacion de Hashset (desordenado)
        
        HashSet<String> nuevoHash = new HashSet();
        
         //LinkedHashSet (Se implementa como una tabla hash con una lista vinculada que se ejecuta a través de ella, por lo que proporciona el orden de inserción.)
         
        LinkedHashSet<String> nuevoHashSet = new LinkedHashSet();
        
        //Creacion de TreeSet (ordenado) (mas lento para agregar o quitar que el hash)
        
        TreeSet<String> nuevoTree = new TreeSet();
       
        //Mapas
        // Los mapas modelan un objeto a través de una llave y un valor.
        //HashMap (las llaves se almacenan utilizando un algoritmo de hash solo para las llaves y evitar que se repitan.)
        
        HashMap<Integer, String> nuevoHashMap = new HashMap();
        
        //TreeMap (Es un mapa que ordena los elementos de manera ascendente a través de las llaves.)
        
        TreeMap <Integer, String> nuevoTreeMap = new TreeMap();
        
        //LinkedHashMap (Es un HashMap que conserva el orden de inserción.)
        
        LinkedHashMap <Integer, String> nuevoLinkedHashMap = new LinkedHashMap();
        
        
        //Añadir elementos
        
        //Los conjuntos utilizan la funcion .add
        
        nuevaLista.add("Dato");
        
        //Sólo en el caso de los mapas vamos a utilizar la función put(llave,valor).
        
        nuevoTreeMap.put(0, "Dato");
        
        //Eliminar Elementos
        /* 
        LISTAS
        Las listas constan de dos métodos:
            • remove(int índice): Este método remueve un elemento de un índice especifico. Esto mueve
                los elementos, de manera que no queden índices sin elementos.*/
        
        nuevaLista.remove(0);
        /*
            • remove(elemento): Este método remueve la primera aparición de un elemento a borrar en una lista  */
        
        nuevaLista.remove("Dato");
        
        /*
        CONJUNTOS
        Ya que los conjuntos no constan de índices, solo se puede borrar por elemento.
        remove(elemento): Este método remueve la primera aparición de un elemento a borrar en un conjunto */
        
        nuevoHash.remove(args);
        
        /*
        MAPAS
            La parte más importante de los elementos de un mapa es la llave del elemento, que es la que
            hace el elemento único, por eso en los mapas solo podemos remover un elemento por su llave.
            • remove(llave): Este método remueve la primera aparición de la llave de un elemento a borrar en un mapa */
        
        nuevoTreeMap.remove(args, args);//con , se agregan varias llaves como argumentos a borrar
        
        /*
         RECORRER UNA COLECCION
        For Each:
        for (Tipo de dato variableVacia : Colección){
        }
         */
        
        for (String variableDeTransicion : nuevaLista){
        }
        
        /*
        MAPAS
        Para recorrer mapas vamos a tener que usar el objeto Map.Entry en el for each. A través del entry
        vamos a traer los valores y las llaves, si no, podemos tener un for each para cada parte de nuestro
        mapa sin utilizar el objeto Map.Entry.
        */
        
        for (Map.Entry<Integer, String> variableDeTransito : nuevoTreeMap.entrySet()){
            System.out.println("Explicacion del dato 'key' "+ variableDeTransito.getKey()+"Explicacion del dato 'element'"+ variableDeTransito.getValue());
        }
        
        //para mostrar individualmente los datos
        
        for (Integer variableDeTransicion : nuevoTreeMap.keySet()){
            System.out.println("Explicacion del dato 'key' "+ variableDeTransicion);
        }
        
         for (String variableDeTransicion : nuevoTreeMap.values()){
            System.out.println("Explicacion del dato 'key' "+ variableDeTransicion);
        }
         
        /*
         ITERATOR
         
         nos permite recorrer, acceder a la información y eliminar algún elemento de una colección. Gracias al Iterator podemos
         eliminar un elemento, mientras recorremos la colección.
         Para poder usar el Iterator es importante crear el objeto de tipo Iterator, con el mismo tipo de dato
         que nuestra colección.
         El Iterator contiene tres métodos muy útiles para lograr esto:
         
         1. boolean hasNext(): Retorna verdadero si al iterator le quedan elementos por iterar
        2. Object next(): Devuelve el siguiente elemento en la colección, mientras le método
            hasNext() retorne true. Este método es el que nos sirve para mostrar el elemento,
        3. void remove(): Elimina el elemento actual de la colección.         */
        
        //Creamos el objeto Iterator (se crea el objeto sobre una coleccion 'simil al service')
        
        Iterator<String> nuevoIterator = nuevaLista.iterator();
        Iterator<String> nuevoIt = nuevoHash.iterator();
        
        //MOSTRAR
        //bucle HasNext() en while mientras queden elementos por mostrar
        
        while (nuevoIterator.hasNext()){
        System.out.print(nuevoIterator + " "); //el Print es sin el ln
    }
        System.out.println("");
        
        //ELIMINAR (Los mapas son los únicos que no podemos eliminar mientras las iteramos.)
        //listas
        
        while(nuevoIterator.hasNext()){
            if(nuevoIterator.next().equals(args)){
                nuevoIterator.remove();
            }
        }
       
        //CONJUNTOS
        
        while (nuevoIt.hasNext()){
            if(nuevoIt.equals(args)){
                nuevoIt.remove();
            }
        }
        
        
        /* ORDENAR COLECCIONES
        
        vamos a tener que utilizar la función Collections.sort(colección). La
        función, que es parte de la clase Collections, recibe la colección y la ordena para después poder
        mostrarla ordenada de manera ascendente.
        Algunas colecciones, como los conjuntos o los mapas no pueden utilizar el sort().
        Entonces, para ordenar los conjuntos, deberemos convertirlos a listas, para poder ordenar esa
        lista por sus elementos. Y a la hora de ordenar un mapa como tenemos dos datos para ordenar,
        vamos a convertir el HashMap a un TreeMap.        
        */
        //LISTAS
        
        Collections.sort(nuevaLista);
        
        //Conjuntos
        
        ArrayList<String> pasoHashALista = new ArrayList(nuevoHash);
        Collections.sort(pasoHashALista);
        
        //MAPAS
        //convertimos en treeMap porque se ordena solo :)
        
        TreeMap<Integer, String> pasoHashATree = new TreeMap(nuevoHashMap);
        
    
    
    /*
    COLECCIONES DE OBJETOS CREADOS POR NOSOTRES
    
    AÑADIR UN OBJETO A UNA COLECCIÓN
    Para añadir un objeto a una colección tenemos que primero crear el objeto que queremos trabajar
    y después crear una colección donde su tipo de dato sea dicho objeto.
    
    Las colecciones Tree, ya sean TreeSet o TreeMap, son las únicas que no vamos a poder agregar
    como siempre. Para solucionar esto, vamos a necesitar un Comparator, este, le dará la pauta de como ordenarse
    y sobre que atributo.
    */
    
    //LISTA
    
    ArrayList<Objeto> nuevoObjeto = new ArrayList();
    Objeto objeto = new Objeto();
    nuevoObjeto.add(objeto);
    
    //CONJUNTOS
    
    HashSet<Objeto> nuevoObjetoHash = new HashSet();
    Objeto objetoHash = new Objeto();
    nuevoObjetoHash.add(objetoHash);
    
    //MAPAS
    
    HashMap<Integer, Objeto> nuevoObjetoMap = new HashMap();
    Objeto objetoMap = new Objeto();
    ServicioObjeto So = new ServicioObjeto();
    objetoMap = So.CrearObjeto();
    nuevoObjetoMap.put(objetoMap.getN1(), objetoMap);
    
    
    /*  RECORRER COLECCION CON OBJETOS
    Vamos a seguir utilizando los métodos que conocemos, el for each o el iterator. Pero funciona si la entidad contiene el OVERRIDE, osea, el constructor ToString.
    
    */
    
    for (Objeto muestra : nuevoObjeto){//retomo objeto creado en la linea 216
        System.out.println(muestra);
    }
    
    /*   COMPARATOR
    utilizamos la interfaz Comparator con su
    función compare() dentro de nuestra clase entidad. 
    significa crear una clase dentro de la entidad que se llame comarador (ver entidad)
    */
    
    //LISTA
    
    nuevoObjeto.sort(Objeto.compararNumeros);//retomamos la lista de la linea 216
    
    //CONJUNTOS
    //primero se pasa el conjunto del objeto a un arraylist y luego se hace el sort
    ArrayList <Objeto> nuevaListaHash;//retomo el objetoHash creado 
        nuevaListaHash = new ArrayList(nuevoObjetoHash);
        nuevaListaHash.sort(Objeto.compararNumeros);
        
     //TREESET
     //hay que declarar en la creacion del tree la clase compare
     
     TreeSet <Objeto> nuevoTreeObj = new TreeSet(Objeto.compararNumeros);
     Objeto nuevoObjetoTree = new Objeto();
     nuevoTreeObj.add(nuevoObjetoTree);
    
    //MAPAS
    
    
    
    
    
    
    
}
}
