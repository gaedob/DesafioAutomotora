package com.inforcap.clases;

public class Main {

    public static void main(String[] args) {

        Persona p1;
        p1 = new Persona("111-1","Armando Mochas");
        Vendedor v1 = new Vendedor("111-1","Armando Mochas","En algun lugar de la mancha 5555, Narnia");

        System.out.println(p1);
        System.out.println(v1);s

        Vehiculo ve1 = new Vehiculo("XDFT45","Azul");

        Cliente c1 = new Cliente("1111-1","Elba Lazo",34);

        LibroVenta lv = new LibroVenta("ventas2.txt","01102020");

        lv.guardarVenta(c1,ve1);

    }
}
