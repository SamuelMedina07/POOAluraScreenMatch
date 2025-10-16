package com.aluracursos.radioalura.modelos;

public class MisFavoritos {
    public void adicione(Audio audio){
        if(audio.getCalificacion() >= 8){
            System.out.println(audio.getTitulo() + "Es uno de los favoritos del momento");
        } else {
            System.out.println(audio.getTitulo() + "También es uno de los favoritos");
        }
    }
}