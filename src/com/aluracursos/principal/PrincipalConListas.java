package com.aluracursos.principal;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalConListas {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Nemo",2006);
        miPelicula.evalua(9);
        Pelicula otraPelicula = new Pelicula("Megamente",2021);
        otraPelicula.evalua(10);
        var peliculaSamuel = new Pelicula("Lost",2015);
        peliculaSamuel.evalua(8);
        Serie casaDragon = new Serie("La casa del dragon",2022);
        casaDragon.evalua(4);

        //seleccionar varios Shift + f6
        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(peliculaSamuel);
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(casaDragon);
        for(Titulo Item: lista){
            System.out.println(Item);
            //Casting para poder entrar al metodo de clasificacion en Peliucas
            Pelicula pelicula = (Pelicula) Item;
            System.out.println(pelicula.getCalificacion());

        }
    }
}
