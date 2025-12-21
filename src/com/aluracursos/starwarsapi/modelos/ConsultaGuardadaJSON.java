package com.aluracursos.starwarsapi.modelos;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class ConsultaGuardadaJSON {

    public void GuardarJSON(Titulo peli) throws IOException {

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        FileWriter escritura = new FileWriter(peli.getNombre() + ".json");
        escritura.write(gson.toJson(peli));
        escritura.close();

    }
}
