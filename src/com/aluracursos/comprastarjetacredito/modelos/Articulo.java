package com.aluracursos.comprastarjetacredito.modelos;

public class Articulo{
    private String nombre;
    private int precio;

    public Articulo(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

}
