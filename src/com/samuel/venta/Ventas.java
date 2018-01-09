package com.samuel.venta;

import exemplo_paquetes.Coches;

public class Ventas {
    
    private Coches coche;
    private int precio;
    private String marca;
    
    // Constructor

    public Ventas(Coches coche, int precio, String marca) {
        this.coche = coche;
        this.precio = precio;
        this.marca = marca;
    }
    
    public Ventas() {
        
    }
    
    // Set's y Get's

    public Coches getCoche() {
        return coche;
    }

    public void setCoche(Coches coche) {
        this.coche = coche;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    // To String

    @Override
    public String toString() {
        return "Ventas { " + coche + ", Precio: " + precio + ", Marca: " + marca + " }";
    }
    
    
}
