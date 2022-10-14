/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3guia7;

import Entidad.Operacion;
import Servicios.ServiciosOperaciones;

/**
 *
 * @author Agus
 */
public class Ej3Guia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServiciosOperaciones SO=new ServiciosOperaciones();
        Operacion Ope1=SO.CargarDatos();
        SO.Suma(Ope1);
        SO.Resta(Ope1);
        SO.Multiplicacion(Ope1);
        SO.Division(Ope1);
        
        
    }
    
}
