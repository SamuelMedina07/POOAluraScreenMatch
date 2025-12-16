package com.aluracursos.principal;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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
       
        for(Titulo Item: lista){
            System.out.println(Item);
            //Casting para poder entrar al metodo de clasificacion en Peliucas
            Pelicula pelicula = (Pelicula) Item;
            System.out.println(pelicula.getCalificacion());

        }

        Pelicula favorita = new Pelicula("El señor de los anillos", 2001);
        favorita.evalua(10);

        Pelicula otra = new Pelicula("John Wick", 2014);
        otra.evalua(9);

        Serie serie = new Serie("La Casa de Papel", 2017);

        ArrayList<Titulo> lista2 = new ArrayList<>();
        lista2.add(favorita);
        lista2.add(otra);
        lista2.add(serie);

        for(Titulo item : lista2) {
            System.out.println("Nombre: " +item.getNombre());
            if (item instanceof Pelicula pelicula && pelicula.getCalificacion() > 2) {
                System.out.println("Clasificacion: " +pelicula.getCalificacion());
            }
        }

        ArrayList<String> listaDeArtistas = new ArrayList<>();
        listaDeArtistas.add("Penelope Cruz");
        listaDeArtistas.add("Antonio Banderas");
        listaDeArtistas.add("Ricardo Darin");

        Collections.sort(listaDeArtistas);
        System.out.println("Lista de Artistas Ordenadas:" + listaDeArtistas);

        lista2.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        System.out.println("Lista ordenada por fecha:"+lista2);
    }



}
