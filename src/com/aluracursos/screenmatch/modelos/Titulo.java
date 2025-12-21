package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmatch.exception.ErrorEnConversionDeDuracionException;

public class Titulo implements Comparable <Titulo> {


        private String nombre;
        private int fechaDeLanzamiento;
        private int duracionEnMinutos;
        private boolean incluidoEnElPlan;
        private double sumaDeLasEvaluaciones;
        private int totalDelasEvaluaciones;
        public   int getTotalDelasEvaluaciones;

        public Titulo(String nombre, int fechaDeLanzamiento){
            this.nombre = nombre;
            this.fechaDeLanzamiento = fechaDeLanzamiento;
        }

    public Titulo(TituloOmdb miTituloOmdb) {
            this.nombre = miTituloOmdb.title();
            //this.fechaDeLanzamiento = Integer.valueOf(miTituloOmdb.year());
            this.fechaDeLanzamiento = Integer.parseInt(miTituloOmdb.year());
            if (miTituloOmdb.runtime().contains("N/A"))
            {
                throw new ErrorEnConversionDeDuracionException("No pude convertir la duracion por que contiene un N/A");
            }
            //el subtring nos toma de la posion 0 a 3 del string
            this.duracionEnMinutos = Integer.parseInt(miTituloOmdb.runtime().substring(0,3).replace(" ",""));
    }


    public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
            this.fechaDeLanzamiento = fechaDeLanzamiento;
        }

        public void setDuracionEnMinutos(int duracionEnMinutos) {
            this.duracionEnMinutos = duracionEnMinutos;
        }

    public String getNombre() {
        return nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
            this.incluidoEnElPlan = incluidoEnElPlan;
        }

        public int getTotalDelasEvaluaciones(){

            return totalDelasEvaluaciones;
        }

        public void muestraFichaTecnica(){
            System.out.println("El nombre de la película es: " + nombre);
            System.out.println("Su fecha de lanzamiento es: " + fechaDeLanzamiento);
            System.out.println("Duración en minutos: "+ getDuracionEnMinutos());
        }

        public void evalua(double nota){
            sumaDeLasEvaluaciones += nota;
            totalDelasEvaluaciones++;
        }

        public double calculaMedia(){
            return sumaDeLasEvaluaciones / totalDelasEvaluaciones;
        }

        @Override
        public int compareTo(Titulo otroTitulo){
            return this.getNombre().compareTo(otroTitulo.getNombre());
        }

    @Override
    public String toString() {
        return
                "(nombre=" + nombre  +
                ", fechaDeLanzamiento=" + fechaDeLanzamiento+
                ", duracion=" + duracionEnMinutos + ")";
    }
}
