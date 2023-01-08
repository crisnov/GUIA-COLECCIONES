/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejrazaperros.servicio;

import ejrazaperros.entidades.RazaPerro;
import ejrazaperros.utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class ServicioRazaPerro {

    Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    private List<RazaPerro> razas = new ArrayList();

    public RazaPerro crearRaza() {

        System.out.println("Ingrese nombre de la raza de perro: ");
        String raza = leer.next();

        //RazaPerro n = new RazaPerro(raza);
        //n.setRaza(raza);
        // razas.add(n);
        return new RazaPerro(raza);
    }

    public void agregarRaza(RazaPerro r) {
        razas.add(r);
    }

    public void mostrarRaza() {
        System.out.println("Las razas ingresadas en la lista son: ");

        for (RazaPerro aux : razas) {
            System.out.println(aux.toString());
        }
        System.out.println("Cantidad: " + razas.size());
    }

    public void crearRazas(int cantidad) {

        for (int i = 0; i < cantidad; i++) {
            RazaPerro r = crearRaza();

            agregarRaza(r);

            System.out.println(r.toString());
        }

    }

    public void crearRazas2() {

        boolean exit = false;

        do {

            RazaPerro r = crearRaza();
            agregarRaza(r);
            System.out.println(r.toString());
            System.out.println(" ");
            System.out.println("elija opcion");
            System.out.println("1- Salir");
            System.out.println("2- Agregar otra raza de perro");

            int opcion = leer.nextInt();

            if (opcion == 1) {
                exit = true;
            }

        } while (!exit);
        
    }

    public void actualizarRaza() {
        RazaPerro r = crearRaza();

        System.out.println("ingrese el indice en el cual desea actualizar/modificar la raza de perro");
        int index = leer.nextInt();

        razas.set(index, r);
    }

    public void eliminarRaza() {
        System.out.println("ingrese indice a eliminar: ");
        int index = leer.nextInt();
        razas.remove(index);
    }

    public void eliminarRazaPorNombre() {
        System.out.println("ingrese nombre a eliminar: ");
        String nombre = leer.next();

        for (int i = 0; i < razas.size(); i++) {
            RazaPerro r = razas.get(i);
            if (r.getRaza().equals(nombre)) {
                razas.remove(i);
            }
        }
    }

    public void actualizarRazaPorNombre() {
        System.out.println("ingrese nombre a buscar: ");
        String nombreAnterior = leer.next();

        System.out.println("ingrese nombre a modificar: ");
        String nombrePosterior = leer.next();

        for (int i = 0; i < razas.size(); i++) {
            RazaPerro r = razas.get(i);
            if (r.getRaza().equals(nombreAnterior)) {
                r.setRaza(nombrePosterior);
            }
        }
    }

    public void ordenarRazasDesc() {
        Collections.sort(razas, Comparadores.ordenAlfabeticoDescDeRazas);
    }
}
