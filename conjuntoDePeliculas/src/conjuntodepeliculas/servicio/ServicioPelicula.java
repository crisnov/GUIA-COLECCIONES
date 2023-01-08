/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conjuntodepeliculas.servicio;

import conjuntodepeliculas.entidades.Pelicula;
import conjuntodepeliculas.utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class ServicioPelicula {

    Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    private List<Pelicula> listaDePeliculas;

    public ServicioPelicula() {
        this.listaDePeliculas = new ArrayList();
    }

    public Pelicula crearPelicula() {

        System.out.println("Ingrese Título de la pelicula: ");
        String titulo = leer.next();

        System.out.println("Ingrese Director de la pelicula: ");
        String director = leer.next();

        System.out.println("Ingrese Duracion (en hrs) de la pelicula: ");
        Integer duracion = leer.nextInt();

        return new Pelicula(titulo, director, duracion);
    }

    public void agregarPelicula(Pelicula p) {
        listaDePeliculas.add(p);
    }

    public void crearVariasPeliculas() {

        boolean exit = false;

        do {

            Pelicula r = crearPelicula();
            agregarPelicula(r);
            System.out.println(r.toString());
            System.out.println(" ");
            System.out.println("elija opcion");
            System.out.println("1- Salir");
            System.out.println("2- Crear y agregar otra pelicula");

            String opcion = leer.next();

            if (opcion.equalsIgnoreCase("1")) {
                exit = true;
            } else {
            }

        } while (!exit);
    }
    
    public void mostrarPeliculas() {
        System.out.println("Las peliculas ingresadas en la lista son: ");

        for (Pelicula aux : listaDePeliculas) {
            System.out.println(aux.toString());
        }
        System.out.println("Cantidad: " + listaDePeliculas.size());
    }
    
    public void mostrarPeliculas2() {
        System.out.println("Las peliculas, con duracion mayor a 1h, ingresadas en la lista son: ");

        for (int i = 0; i < listaDePeliculas.size(); i++) {
            if (listaDePeliculas.get(i).getDuracion() > 1) {
                System.out.println(listaDePeliculas.get(i));
            }
        }
        
        System.out.println("Cantidad TOTAL: " + listaDePeliculas.size());
    }
    
    public void ordenarPeliculasXduracion() {
        Collections.sort(listaDePeliculas, Comparadores.ordenPeliculasXduracion);
    }
    
    public void ordenarPeliculasXduracion2() {
        Collections.sort(listaDePeliculas, Comparadores.ordenPeliculasXduracion2);
    }
    
    public void ordenarPeliculasXtitulo() {
        Collections.sort(listaDePeliculas, Comparadores.ordenPeliculasXtitulo);
    }
    
    public void ordenarPeliculasXdirector() {
        Collections.sort(listaDePeliculas, Comparadores.ordenPeliculasXdirector);
    }
}
