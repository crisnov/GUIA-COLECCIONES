/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.servicios;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import tienda.entidades.Producto;

/**
 *
 * @author crist
 */
public class ServicioProducto {

    Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    HashMap<String, Double> conjuntoProductos = new HashMap();

    public Producto crearProducto() {

        System.out.println("Ingrese nombre del Producto: ");
        String nombreP = leer.next();
        System.out.println("Ingrese precio del Producto: ");
        Double precioP = leer.nextDouble();

        return new Producto(nombreP, precioP);
    }

    public void agregarProducto(Producto p) {
        conjuntoProductos.put(p.getNombreProducto(), p.getPrecioProducto());
    }

    public void crearVariosProductos() {
        String opcion;

        do {
            System.out.println("----------------------------------------");
            Producto r = crearProducto();
            agregarProducto(r);
            System.out.println(r.toString());
            System.out.println("----------------------------------------");
            System.out.println("elija opcion");
            System.out.println("1- Salir");
            System.out.println("2- Agregar otro Producto");
            System.out.println("----------------------------------------");

            opcion = leer.next();

        } while (!opcion.equals("1"));
    }

    public void mostrarProducto() {
        System.out.println("----------------------------------------");
        System.out.println("Los Productos ingresados son: ");

        for (Map.Entry<String, Double> entry : conjuntoProductos.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();
            System.out.println("Nombre: " + key + " | " + "Precio: $" + value);
        }
        System.out.println(" ");
        System.out.println("Cantidad: " + conjuntoProductos.size());
        System.out.println("----------------------------------------");
    }

    public void eliminarProducto() {

        System.out.println("Ingrese producto a eliminar");
        String eliminar = leer.next();

        if (conjuntoProductos.containsKey(eliminar)) {
            conjuntoProductos.remove(eliminar);
        } else {
            System.out.println("El producto ingresado no existe :(");
        }
    }

    public void modificarProducto() {

        System.out.println("Ingrese nombre del producto para modificiar su precio");
        String modificar = leer.next();
        
        if (conjuntoProductos.containsKey(modificar)) {
            System.out.println("ingrese nuevo precio");
            Double nuevoPrecio = leer.nextDouble();
            conjuntoProductos.replace(modificar, nuevoPrecio);

        } else {
            System.out.println("El producto ingresado no existe :(");
        }
    }
    
    

}
