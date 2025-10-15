package com.aluracursos.screenmatch.modelos;

public class Titulo {

        private String nombre;
        private int fechaDeLanzamiento;
        private int duracionEnMinutos;
        private boolean incluidoEnElPlan;
        private double sumaDeLasEvaluaciones;
        private int totalDelasEvaluaciones;
        public   int getTotalDelasEvaluaciones;



        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
            this.fechaDeLanzamiento = fechaDeLanzamiento;
        }

        public void setDuracionEnMinutos(int duracionEnMinutos) {
            this.duracionEnMinutos = duracionEnMinutos;
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
}
