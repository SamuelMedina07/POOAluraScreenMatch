package com.aluracursos.starwarsapi.modelos;

public class Titulo {
    private int codigo;
    private String nombre;
    private String director;
    private String fechaDeEstreno;

    public Titulo(TituloSWAPI miTituloSWAPI){
        this.codigo = miTituloSWAPI.id();
        this.nombre = miTituloSWAPI.title();
        this.director = miTituloSWAPI.director();
        this.fechaDeEstreno = miTituloSWAPI.release_date();

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getFechaDeEstreno() {
        return fechaDeEstreno;
    }

    public void setFechaDeEstreno(String fechaDeEstreno) {
        this.fechaDeEstreno = fechaDeEstreno;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return  "Numero: " + codigo +
                "\nPelicula: " + nombre +
                "\nDirector: " + director +
                "\nFecha de Estreno: " + fechaDeEstreno ;
    }
}
