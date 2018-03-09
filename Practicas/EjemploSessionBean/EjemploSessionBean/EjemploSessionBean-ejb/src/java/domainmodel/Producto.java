/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domainmodel;

import java.io.Serializable;

public class Producto implements Serializable {

    public String nombre;
    private double precio;
    private int nUnidades;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getnUnidades() {
        return nUnidades;
    }

    public void setnUnidades(int nUnidades) {
        this.nUnidades = nUnidades;
    }
}
