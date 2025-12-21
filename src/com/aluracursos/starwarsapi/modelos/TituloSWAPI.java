package com.aluracursos.starwarsapi.modelos;

import com.google.gson.annotations.SerializedName;

public record TituloSWAPI(
        @SerializedName("id")
        int id,
        @SerializedName("title")
        String title,
        @SerializedName("director")
        String director,
        @SerializedName("release_date")
        String release_date
)
{ }
