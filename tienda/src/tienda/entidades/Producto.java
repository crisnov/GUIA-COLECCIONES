/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.entidades;

import java.util.Objects;

/**
 *
 * @author crist
 */
public class Producto implements Comparable<Producto> {

    private String nombreProducto;
    private Double precioProducto;

    public Producto() {
    }

    public Producto(String nombreProducto, Double precioProducto) {
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public Double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(Double precioProducto) {
        this.precioProducto = precioProducto;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        if (!Objects.equals(this.nombreProducto, other.nombreProducto)) {
            return false;
        }
        if (!Objects.equals(this.precioProducto, other.precioProducto)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombreProducto = " + nombreProducto + ", precioProducto = $" + precioProducto + '}';
    }

    @Override
    public int compareTo(Producto t) {
        return this.nombreProducto.compareTo(t.getNombreProducto());       
    }
}
