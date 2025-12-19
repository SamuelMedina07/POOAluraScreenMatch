package com.aluracursos.comprastarjetacredito.modelos;


import java.util.ArrayList;
import java.util.List;

public class Tarjeta {

    private double limite;
    private double saldo;
    private List<Compra> listaDeCompras;

    public Tarjeta(double limite){
        this.limite = limite;
        this.saldo = limite;
        this.listaDeCompras = new ArrayList<>();
    }

//    public void setLimite(double limite) {
//        this.limite = limite;
//    }

    public boolean lanzarCompra(Compra compra){
    if(compra.getPrecio() <= saldo){
        saldo -= compra.getPrecio();
        this.listaDeCompras.add(compra);
        return true;
    }
    return false;

    }


    public double getLimite() {
        return limite;

    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getListaDeCompras() {
        return listaDeCompras;
    }
}
