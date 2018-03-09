/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.domain;

/**
 *
 * @author Angelo
 */
public class Register {

    private int noSerie;
    private String marca;
    private String modelo;
    private String color;
    private String maestro;

    public void setNoSerie(int noSerie) {
        this.noSerie = noSerie;
    }

    public int getNoSerie() {
        return noSerie;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setMaestro(String maestro) {
        this.maestro = maestro;
    }

    public String getMaestro() {
        return maestro;
    }

}
