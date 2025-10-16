package com.aluracursos.screenmatch.calculos;

public class FiltroRecomendacion {
    public void filtra(Calificacion calificacion){
        if(calificacion.getCalificacion() >=4 ){

            System.out.println("Muy bien evaluado en el momento");
        } else if (calificacion.getCalificacion() >=2) {
            System.out.println("Popular en el momento");
        }else{
            System.out.println("Colocalo para verlo despues");
        }

    }
}
