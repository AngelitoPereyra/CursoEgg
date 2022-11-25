/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.HashMap;
import java.util.Scanner;
import Entidades.Tienda;
import java.util.Map;

/**
 *
 * @author Agus
 */
public class ServiciosTienda {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashMap<String, Double> listaPrecios = new HashMap();

    public void menu() {
        int menu = 0;
        boolean flag = false;
        do {
            System.out.println("Que desea hacer?");
            System.out.println("1- Ingresar Producto");
            System.out.println("2- mostrar Lista");
            System.out.println("3- modificar Precio");
            System.out.println("4- Eliminar Producto");
            System.out.println("5- Salir");
            menu = leer.nextInt();
            switch (menu) {
                case 1:
                    Tienda productoListo = nuevoProducto();
                    listaPrecios.put(productoListo.getProducto(), productoListo.getPrecio());
                    break;
                case 2:
                    mostrarLista();
                    break;
                case 3:
                    modificarPrecio();
                    break;
                case 4:
                    eliminarProducto();
                    break;
                case 5:
                    flag = true;
                    break;

            }

        } while (flag == false);

    }

    public Tienda nuevoProducto() {
        Tienda producto = new Tienda();
        System.out.println("Ingrese el nombre del producto");
        producto.setProducto(leer.next());
        System.out.println("Ingrese el precio del producto");
        producto.setPrecio(leer.nextDouble());

        return producto;

    }

    public void mostrarLista() {

        for (Map.Entry<String, Double> variableDeTransito : listaPrecios.entrySet()) {
            System.out.println("El producto  " + variableDeTransito.getKey() + " tiene el valor de " + variableDeTransito.getValue());
        }
    }

    public void modificarPrecio() {

        System.out.println("Ingrese el producto a modificar");
        String productoModificado = leer.next();
        for (Map.Entry<String, Double> entry : listaPrecios.entrySet()) {
            if (entry.getKey().equalsIgnoreCase(productoModificado)) {
                System.out.println("Ingrese el nuevo precio");
                Double nuevoPrecio = leer.nextDouble();
                entry.setValue(nuevoPrecio);
                
            }

        }
    }

    public void eliminarProducto() {
        System.out.println("Ingrese el producto a eliminar");
        String nombre = leer.next();
        if (listaPrecios.containsKey(nombre)) {
            listaPrecios.remove(nombre);

        } else {
            System.out.println("el producto no se encontro");
        }
    }
}
