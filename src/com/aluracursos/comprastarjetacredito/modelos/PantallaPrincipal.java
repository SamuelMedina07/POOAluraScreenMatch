package com.aluracursos.comprastarjetacredito.modelos;
import com.aluracursos.comprastarjetacredito.modelos.Tarjeta;

import java.util.Scanner;

public class PantallaPrincipal {
    Scanner lectura = new Scanner(System.in);
    private Tarjeta tarjeta;

    public void Welcome(){
        System.out.println("Bienvenido al Sistema de Limites de Compras!");

    }

    public void Main(){

        System.out.println("Escriba el límite de la tarjeta:");
        double limite = lectura.nextDouble();
        var tarjeta = new Tarjeta(limite);
    }

    public void Shopping(){

        int salir = 1;
        while(salir != 0) {
            System.out.println("Escriba el articulo de la compra:");
            String nombre = lectura.next();

            System.out.println("Escriba el valor de la compra:");
            double precio = Double.valueOf(lectura.next());

            Compra compra = new Compra(nombre, precio);
            boolean compraRealizada = tarjeta.lanzarCompra(compra);

            if (compraRealizada) {
                System.out.println("Compra realizada!");
                System.out.println("Escriba 0 para salir o 1 para continuar");
                salir = lectura.nextInt();
            } else {
                System.out.println("Saldo insuficiente!");
                salir = 0;
            }
        }
    }

    public void Exit(){

        System.out.println("***********************");
        System.out.println("COMPRAS REALIZADAS:\n");
        for (Compra compra : tarjeta.getListaDeCompras()) {
            System.out.println(compra.getNombre() + " - " +compra.getPrecio());
        }
        System.out.println("\n***********************");
        System.out.println("\nSaldo de la tarjeta: " +tarjeta.getSaldo());
    }




}
