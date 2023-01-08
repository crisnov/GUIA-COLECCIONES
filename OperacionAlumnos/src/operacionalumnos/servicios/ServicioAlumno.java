/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionalumnos.servicios;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import operacionalumnos.entidades.Alumnos;

/**
 *
 * @author crist
 */
public class ServicioAlumno {

    Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    private ArrayList<Alumnos> TodosAlumnos = new ArrayList();

    public void crearAlumno() {
        String opcion;
        do {
            System.out.println("ingrese nombre del alumno: ");
            String nombre = leer.next();

            ArrayList<Integer> notas = new ArrayList();

            System.out.println("Ingresar las 3 notas: ");
            notas.add(leer.nextInt());
            notas.add(leer.nextInt());
            notas.add(leer.nextInt());

            Alumnos a1 = new Alumnos();
            a1.setNombre(nombre);
            a1.setNotas(notas);

            TodosAlumnos.add(a1);

            System.out.println("elija opcion");
            System.out.println("1- Salir");
            System.out.println("2- Agregar otro alumno");

            opcion = leer.next();

        } while (!opcion.equals("1"));

    }

    public double notaFinal() {
        System.out.println("Ingrese nombre del alumno para calcular su nota final: ");
        String nombreBuscar = leer.next();

        double suma = 0;
        
        for (Alumnos CadaAlumno : TodosAlumnos) {
            if (nombreBuscar.equalsIgnoreCase(CadaAlumno.getNombre())) {
                for (Integer CadaNota : CadaAlumno.getNotas()) {
                    suma += CadaNota;
                }

            }

        }
        double prom = (suma / 3);
        return prom;
    }
}
