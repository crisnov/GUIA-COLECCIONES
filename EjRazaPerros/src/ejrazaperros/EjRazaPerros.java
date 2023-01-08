/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejrazaperros;


import ejrazaperros.servicio.ServicioRazaPerro;




/**
 *
 * @author crist
 */
public class EjRazaPerros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList. */
        
        ServicioRazaPerro rp = new ServicioRazaPerro();
        
       
        rp.crearRazas2();
        rp.mostrarRaza();
        rp.actualizarRaza();
        rp.mostrarRaza();
        rp.ordenarRazasDesc();
        rp.mostrarRaza();
        
        
    }
    
}
