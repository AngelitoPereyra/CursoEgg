/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comparador;

import Entidad.Pais;
import java.util.Comparator;

/**
 *
 * @author Agus
 */
public class comparadorPaises {
    
    public static Comparator<Pais> peliculasMayor = new Comparator<Pais>() {
        @Override
        public int compare(Pais o1, Pais o2) {
            return o1.getPais().compareTo(o2.getPais());
        }
    };
    
}
