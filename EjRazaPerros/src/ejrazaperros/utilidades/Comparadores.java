/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejrazaperros.utilidades;

import ejrazaperros.entidades.RazaPerro;
import java.util.Comparator;

/**
 *
 * @author crist
 */
public class Comparadores {
    public static Comparator<RazaPerro> ordenAlfabeticoDescDeRazas = new Comparator<RazaPerro> () {
        @Override
        public int compare(RazaPerro t, RazaPerro t1) {
            return t1.getRaza().compareTo(t.getRaza());
        }
    };
}
