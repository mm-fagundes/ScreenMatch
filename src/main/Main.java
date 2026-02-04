package main;

import br.com.mateus.modelos.Episodio;
import br.com.mateus.modelos.Filme;
import br.com.mateus.modelos.Serie;
import calculo.CalculadoraTempo;
import calculo.FiltroRecomendacao;
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {

        Filme meuFilme = new Filme();
        meuFilme.setNome("The Godfather");
        meuFilme.setAnoDeLancamento(1990);
        meuFilme.setDuracaoEmMinutos(120);
        meuFilme.setIncluidoNoPlano(true);
        meuFilme.setDiretor("James Gunn");

        Serie serie1 = new Serie();
        serie1.setNome("Lost");
        serie1.setAnoDeLancamento(2008);
        serie1.setTemporadas(5);
        serie1.setAtiva(true);
        serie1.setEpisodiosPorTemporada(10);
        serie1.setMinutosPorEpisodio(50);
        serie1.setIncluidoNoPlano(true);

        serie1.exibeFichaTecnica();
        System.out.println(serie1.getDuracaoEmMinutos());

        CalculadoraTempo calculadora = new CalculadoraTempo();
        calculadora.inclui(meuFilme);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serie1);
        episodio.setTotalVizualicacoes(300);
        filtro.filtra(episodio);

        var filmeMateus = new Filme();
        filmeMateus.setNome("Planeta dos Macacos");
        filmeMateus.setDuracaoEmMinutos(200);
        filmeMateus.setAnoDeLancamento(2003);
        filmeMateus.avalia(10);

        var filmeAlany = new Filme();
        filmeAlany.setNome("O incrivel Mundo De Gumaball: O filme");
        filmeAlany.setDuracaoEmMinutos(90);
        filmeAlany.setAnoDeLancamento(2026);
        filmeAlany.setDiretor("Gumball");

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeAlany);
        listaDeFilmes.add(filmeMateus);
        listaDeFilmes.add(meuFilme);

        for(int i = 0; i < listaDeFilmes.size(); i ++){
            System.out.println(listaDeFilmes.get(i));
        }
    }
}
