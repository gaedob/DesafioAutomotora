package com.inforcap.clases;

public class Tienda {

    private String nombreTienda;
    private Vendedor vendedor;
    private Cliente cliente;
    private int stock;

    public Tienda(){}

    public Tienda(String nombreTienda, Vendedor vendedor, Cliente cliente, int stock) {
        this.nombreTienda = nombreTienda;
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.stock = stock;
    }

    public String getNombreTienda() {
        return nombreTienda;
    }

    public void setNombreTienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String exiteStock(){
        return "Cantidad de Stock es: " + stock;
    }

}
