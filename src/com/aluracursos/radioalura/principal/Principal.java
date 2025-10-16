package com.aluracursos.radioalura.principal;

import com.aluracursos.radioalura.modelos.Cancion;
import com.aluracursos.radioalura.modelos.MisFavoritos;
import com.aluracursos.radioalura.modelos.Podcast;

public class Principal {

    public static void main(String[] args) {
        Cancion cancion = new Cancion();

        cancion.setTitulo("Endless Praise");
        cancion.setAlbum("Endless Praise");
        cancion.setCantante("PlanetShakers");
        cancion.setGenero("Gospel,Pop");
        for (int i = 0; i < 70; i++) {
            cancion.reproduce();
            cancion.meGusta();
        }

        System.out.println(cancion.getTotalDeReproducciones());

        Podcast miPodcast = new Podcast();
        miPodcast.setPresentador("Gabriela Aguiar");
        miPodcast.setTitulo("Cafe.Tech");
        // podcast
        for (int i = 0; i < 100; i++) {
            miPodcast.meGusta();
        }
        for (int i = 0; i < 8000; i++) {
            miPodcast.reproduce();
        }

        MisFavoritos favoritos = new MisFavoritos();
        favoritos.adicione(miPodcast);
        favoritos.adicione(cancion);


    }
}
