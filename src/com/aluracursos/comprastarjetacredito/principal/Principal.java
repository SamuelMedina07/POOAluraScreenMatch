package com.aluracursos.comprastarjetacredito.principal;

import com.aluracursos.comprastarjetacredito.modelos.Articulo;
import com.aluracursos.comprastarjetacredito.modelos.Compra;
import com.aluracursos.comprastarjetacredito.modelos.PantallaPrincipal;
import com.aluracursos.comprastarjetacredito.modelos.Tarjeta;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        PantallaPrincipal pantalla = new PantallaPrincipal();

        pantalla.Welcome();
        pantalla.Main();
        pantalla.Shopping();

    }
}
