/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conjuntopaises.servicios;

import conjuntopaises.entidades.Pais;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author crist
 */
public class ServicioPaises {

    Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    TreeSet<Pais> conjuntoDePaises = new TreeSet();

    public Pais crearPais() {
        System.out.println("Ingrese nombre del Pais: ");
        String nombrePais = leer.next();

        return new Pais(nombrePais);
    }

    public void agregarPais(Pais p) {
        conjuntoDePaises.add(p);
    }

    /**
     *  crea y agrega a un conjunto una cantidad deseada de elementos
     */
    public void crearVariosPaises() {
        String opcion;

        do {
            Pais r = crearPais();
            agregarPais(r);
            System.out.println(r.toString());
            System.out.println("----------------------------------------");
            System.out.println("elija opcion");
            System.out.println("1- Salir");
            System.out.println("2- Agregar otro Pais");
            System.out.println("----------------------------------------");

            opcion = leer.next();

        } while (!opcion.equals("1"));
    }

    /**
     * muestra los elementos y la cantidad del conjunto
     */
    public void mostrarPaises() {
        System.out.println("----------------------------------------");
        System.out.println("Los Paises dentro en el conjunto son: ");

        for (Pais elemento : conjuntoDePaises) {
            System.out.println(elemento.toString());
        }
        System.out.println("Cantidad: " + conjuntoDePaises.size());
        System.out.println("----------------------------------------");
    }

    /**
     * busca y elimina un elemento
     */
    public void eliminarPais() {
        System.out.println("----------------------------------------");
        System.out.println("ingrese pais a eliminar: ");
        String buscarPais = leer.next();
        boolean marca = false;

        Iterator<Pais> it = conjuntoDePaises.iterator();
        while (it.hasNext()) {

            Pais next = it.next();

            if (buscarPais.equalsIgnoreCase(next.getNombrePais())) {         
               //conjuntoDePaises.remove(next); ESTO NO ES POSIBLE (concurrent modification exception ERROR)
               it.remove();
               marca=true;
            }
        }
        
        if (marca){
            System.out.println("Se ha removido con exito el pais :D");
        }else{
            System.out.println("Pais no se ha encontrado :(");
        }

        System.out.println("----------------------------------------");
    }

}
