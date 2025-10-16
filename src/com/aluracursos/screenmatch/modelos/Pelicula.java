package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmatch.calculos.Calificacion;

public class Pelicula extends Titulo implements Calificacion {
   private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getCalificacion() {
        return (int) calculaMedia()/2;
    }
}

