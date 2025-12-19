package com.aluracursos.comprastarjetacredito.modelos;

public class Compra {
    private String nombre;
    private double precio;

    public Compra(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Compra: valor=" + precio +
                ", Articulo=" + nombre;
    }
}
