package com.inforcap.clases;

public class Vehiculo {

    protected String patente;
    protected String color;

    public Vehiculo(){}

    public Vehiculo(String patente, String color) {
        this.patente = patente;
        this.color = color;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
