package com.inforcap.clases;

public class Bus extends Vehiculo{

    protected int cantidadAsientos;

    public Bus(){}

    public Bus(String patente, String color, int cantidadAsientos) {
        super(patente, color);
        this.cantidadAsientos = cantidadAsientos;
    }

    private int getCantidadAsientos() {
        return cantidadAsientos;
    }

    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    public int asientosDisponibles(){
        return getCantidadAsientos();
    }


}
