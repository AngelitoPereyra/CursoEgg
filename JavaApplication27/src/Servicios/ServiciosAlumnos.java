/*
 Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
package Servicios;

import Entidad.Alumnos;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Agus
 */
public class ServiciosAlumnos {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Alumnos> listaAlumnos = new ArrayList();

    public void crearObjeto() {
        String flag;
        do {
            Alumnos nuevoAlumno = new Alumnos();
            System.out.println("Ingrese el nombre del alumno: ");
            nuevoAlumno.setNombre(leer.next());
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese la nota " + (i + 1));
                nuevoAlumno.getNotas().add(leer.nextInt());

            }
            listaAlumnos.add(nuevoAlumno);

            System.out.println("Desea Ingresar otro alumno?: S/N");
            flag = leer.next();
        } while (flag.equalsIgnoreCase("S"));
    }

    public void notaFinal() {

        System.out.println("Ingrese en nombre del alumno: ");
        String nombre = leer.next();
        int notaFinal= 0;
        int coincidencias = 0;
        for (Alumnos alumno : listaAlumnos) {
            if (alumno.getNombre().equalsIgnoreCase(nombre)) {
                coincidencias++;
                if (coincidencias > 0) {
                    int suma = 0;
                    for (Integer nota : alumno.getNotas()) {
                        suma= suma + nota;
                        
                    }
                    notaFinal=suma/3;
                    
                }
                System.out.println("La nota final del alumno es :" + notaFinal);
            }

        }

    }

}
