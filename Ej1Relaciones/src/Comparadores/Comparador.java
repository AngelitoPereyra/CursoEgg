/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comparadores;

import java.util.Comparator;

/**
 *
 * @author Agus
 */
public class Comparador {
    
    public class comparadorPaises {
    
    public static Comparator<Pais> peliculasMayor = new Comparator<Pais>() {
        @Override
        public int compare(Pais o1, Pais o2) {
            return o1.getPais().compareTo(o2.getPais());
        }
    };
}
