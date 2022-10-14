/*
 Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). Las
operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la
restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el
saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package Servicios;

import Entidad.Cuenta;
import java.util.Scanner;

/**
 *
 * @author Agus
 */
public class ServiciosCuenta {

    Scanner leer = new Scanner(System.in);

    public Cuenta NuevaCuenta() {
        Cuenta cuenta = new Cuenta();

        System.out.println("Ingrese su Numero de cuenta; ");
        cuenta.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese su DNI: ");
        cuenta.setDNI(leer.nextInt());

        return cuenta;
    }

    public void IngresarDinero(Cuenta cuenta) {
        
        
        System.out.println("Cuanta plata desea ingresar?: ");
        Double dinero = leer.nextDouble();
        dinero+=cuenta.getSaldoActual();
        cuenta.setSaldoActual(dinero);
        System.out.println("Su saldo acutal es de " + cuenta.getSaldoActual());
        
    }

    public void Retirar(Cuenta cuenta) {
        System.out.println("Ingrese la cantidad a retirar: ");
        Double retiro = leer.nextDouble();
        if (cuenta.getSaldoActual() < retiro) {
            System.out.println("Usted ah retirado " + cuenta.getSaldoActual());
            cuenta.setSaldoActual(0.0);
        } else {
            cuenta.setSaldoActual(cuenta.getSaldoActual() - retiro);
        }
        System.out.println("Su retiro ah sido exitoso!");

    }

    public void ExtraccionRapida(Cuenta cuenta) {
        System.out.println("Ingrese la cantidad a retirar: ");
        Double retiro = leer.nextDouble();
        while (retiro > cuenta.getSaldoActual() * 0.2) {
            System.out.println("No puede retirar mas del 20% de su sueldo actual, que es de " + cuenta.getSaldoActual());
            retiro = leer.nextDouble();
        }
        System.out.println("Su retiro ah sido exitoso");

    }
    
    public void ConsultarSaldo(Cuenta cuenta){
        System.out.println("Su Saldo actual es de: "+ cuenta.getSaldoActual());
    }
    
    public void ConsultadDatos(Cuenta cuenta){
        System.out.println(cuenta.toString());
    }
}
