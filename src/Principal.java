import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendacion;
import com.aluracursos.screenmatch.modelos.Episodio;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Nemo",2006);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        miPelicula.evalua(7.8);
        System.out.println(miPelicula.getTotalDelasEvaluaciones());
        System.out.println("Média de evaluaciones de la película: " + miPelicula.calculaMedia());

        Pelicula otraPelicula = new Pelicula("Megamente",2021);
        otraPelicula.setDuracionEnMinutos(200);
        otraPelicula.setIncluidoEnElPlan(true);


        Serie casaDragon = new Serie("La casa del dragon",2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporada(10);
        casaDragon.muestraFichaTecnica();
        System.out.println(casaDragon.getDuracionEnMinutos());

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otraPelicula);
        System.out.println(calculadora.getTiempoTotal());

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtra(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("La casa Targaryen");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(50);

        filtroRecomendacion.filtra(episodio);

        //Inferencia del tipo de dato (usar var), en lugar de escribir Pelicula peliculaSamuel = new Pelicula();
        var peliculaSamuel = new Pelicula("Lost",2015);

        peliculaSamuel.setDuracionEnMinutos(180);
        peliculaSamuel.setFechaDeLanzamiento(2015);

        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(peliculaSamuel);
        listaDePeliculas.add(miPelicula);
        listaDePeliculas.add(otraPelicula);
        System.out.println("Tamano de lista:" + listaDePeliculas.size());
        System.out.println("La primera pelicula es:" + listaDePeliculas.get(0).getNombre());

        System.out.println("toString de la pelicula: "+listaDePeliculas);


    }
}
