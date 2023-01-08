/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionalumnos;

import operacionalumnos.servicios.ServicioAlumno;

/**
 *
 * @author crist
 */
public class OperacionAlumnos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
//alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
//con sus 3 notas.
//En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
//toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
//pregunta al usuario si quiere crear otro Alumno o no.
//Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
//Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
//final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
//del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
//promedio final, devuelto por el método y mostrado en el main.

        ServicioAlumno sa = new ServicioAlumno();
        sa.crearAlumno();

        double n1 = sa.notaFinal();
        if (n1 > 0) {
            System.out.println("Alumno encontrado");
            System.out.println("Su nota final es: " + n1);
        } else {
            System.out.println("Alumno no encontrado :(");
        }
    }

}
