/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejrazaperros.entidades;

/**
 *
 * @author crist
 */
public class RazaPerro {
    private String raza;

    public RazaPerro() {
    }

    public RazaPerro(String raza) {
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "RazaPerro{" + "raza=" + raza + '}';
    }
    
    
    
}
