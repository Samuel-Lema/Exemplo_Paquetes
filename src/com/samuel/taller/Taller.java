package com.samuel.taller;

import exemplo_paquetes.Coches;

public class Taller {
    
    private Coches matricula;
    private float factura;
    
    // Constructor

    public Taller(Coches matricula, float factura) {
        this.matricula = matricula;
        this.factura = factura;
    }

    public Taller() {
        
    }
    
    // Set's y Get's

    public Coches getMatricula() {
        return matricula;
    }

    public void setMatricula(Coches matricula) {
        this.matricula = matricula;
    }

    public float getFactura() {
        return factura;
    }

    public void setFactura(float factura) {
        this.factura = factura;
    }
    
    // Funciones
    
    public void cobrar(Coches coche){
        
        if (coche.getMatricula() == this.matricula.getMatricula()){
            
            factura = factura - (factura * 20 / 100);
            
        } else {} 
    }
    
    // To String

    @Override public String toString() {
        return "Taller { " + matricula + ", Factura: " + factura + " }";
    }
    
    
}
