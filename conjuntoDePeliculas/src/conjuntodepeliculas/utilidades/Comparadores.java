/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conjuntodepeliculas.utilidades;

import conjuntodepeliculas.entidades.Pelicula;
import java.util.Comparator;

/**
 * 
 * @author crist
 */
public class Comparadores {
    
    /**
     * de mayor a menor
     */
    public static Comparator<Pelicula> ordenPeliculasXduracion = new Comparator<Pelicula> () {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t1.getDuracion().compareTo(t.getDuracion());
        }
    };
    
    /**
     * de menor a mayor
     */
    public static Comparator<Pelicula> ordenPeliculasXduracion2 = new Comparator<Pelicula> () {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDuracion().compareTo(t1.getDuracion());
        }
    };
    
     /**
     *  ordenar TITULO alfabeticamente 
     */
    public static Comparator<Pelicula> ordenPeliculasXtitulo = new Comparator<Pelicula> () {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getTitulo().compareTo(t1.getTitulo());
        }
    };
    
    /**
     *  ordenar DIRECTOR alfabeticamente 
     */
    public static Comparator<Pelicula> ordenPeliculasXdirector = new Comparator<Pelicula> () {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getTitulo().compareTo(t1.getTitulo());
        }
    };
    
    
    
}
