package com.aluracursos.starwarsapi.principal;

import com.aluracursos.starwarsapi.modelos.ConsultaAPI;
import com.aluracursos.starwarsapi.modelos.ConsultaGuardadaJSON;
import com.aluracursos.starwarsapi.modelos.TituloSWAPI;
import com.aluracursos.starwarsapi.modelos.Titulo;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Escriba el numero de la pelicula de SW para mostar informacion...:");

        int busqueda = lectura.nextInt();

       ConsultaAPI consulta = new ConsultaAPI();
       var Peli = consulta.ConsultaPeliculaAPI(busqueda);
        System.out.println(Peli);

        ConsultaGuardadaJSON guardar = new ConsultaGuardadaJSON();
        try {
            guardar.GuardarJSON(Peli);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
