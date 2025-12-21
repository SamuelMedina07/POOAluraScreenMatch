package com.aluracursos.starwarsapi.modelos;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.Gson;

public class ConsultaAPI {

    public Titulo ConsultaPeliculaAPI(int numero){
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://swapi.online/api/films/" + numero))
                .build();

        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            var respuesta = new Gson().fromJson(response.body(), TituloSWAPI.class);


            return new Titulo(respuesta);

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }




    }

    
}
