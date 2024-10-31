package com.inforcap.clases;

public class Taxi extends Vehiculo{

    private int valorPasaje;

    public Taxi(){}

    public Taxi(String patente, String color, int valorPasaje) {
        super(patente, color);
        this.valorPasaje = valorPasaje;
    }

    public int getValorPasaje() {
        return valorPasaje;
    }

    public void setValorPasaje(int valorPasaje) {
        this.valorPasaje = valorPasaje;
    }

    public int pagarPasaje(int pasaje){
        int vuelto = 0;

        if (valorPasaje <= pasaje){
            vuelto = pasaje - valorPasaje;
            return vuelto;
        }
        else {
            return pasaje;
        }

    }

}
