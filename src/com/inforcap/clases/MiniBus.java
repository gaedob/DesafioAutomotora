package com.inforcap.clases;

public class MiniBus extends Bus{

    private String tipoViaje;

    public MiniBus(){}

    public MiniBus(String patente, String color, int cantidadAsientos, String tipoViaje) {
        super(patente, color, cantidadAsientos);
        this.tipoViaje = tipoViaje;
    }

    public String getTipoViaje() {
        return tipoViaje;
    }

    public void setTipoViaje(String tipoViaje) {
        this.tipoViaje = tipoViaje;
    }

    public String imprimeBus(){
        return "Patente: " + getPatente() + "\nColor: " + color + "\nCantidad Asientos: " + cantidadAsientos + "\nTipo Viaje: " + tipoViaje;
    }

}
