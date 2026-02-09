package main;

import br.com.mateus.modelos.Filme;
import br.com.mateus.modelos.Serie;
import br.com.mateus.modelos.Titulo;

import java.util.*;

public class MainComListas {
    static void main(String[] args) {

        var meuFilme = new Filme(1990, "The Godfather");
        meuFilme.setAnoDeLancamento(1990);
        meuFilme.setDuracaoEmMinutos(120);
        meuFilme.setIncluidoNoPlano(true);

        var filmeMateus = new Filme(2003, "Planeta dos Macacos");
        filmeMateus.setDuracaoEmMinutos(200);
        filmeMateus.setAnoDeLancamento(2003);
        filmeMateus.avalia(10);

        var filmeAlany = new Filme(2026, "O Incrivel Mundo de Gumball: O Filme");
        filmeAlany.setDuracaoEmMinutos(90);
        filmeAlany.setAnoDeLancamento(2026);
        filmeAlany.setDiretor("Gumball");

        Serie serie1 = new Serie(2008, "Lost");
        serie1.setTemporadas(5);
        serie1.setAtiva(true);
        serie1.setEpisodiosPorTemporada(10);
        serie1.setMinutosPorEpisodio(50);
        serie1.setIncluidoNoPlano(true);

        List<Titulo> lista = new LinkedList<>();
        lista.add(filmeAlany);
        filmeAlany.avalia(9);
        lista.add(filmeMateus);
        filmeMateus.avalia(6);
        lista.add(meuFilme);
        meuFilme.avalia(10);
        lista.add(serie1);

        for (Titulo item: lista){
            System.out.println(item.getNome());
            if(item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classificação " + filme.getClassificacao());
            }else {
                System.out.println("Não classificado.");
            }

        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Mateus");
        buscaPorArtista.add("Alany");
        System.out.println(buscaPorArtista);
        Collections.sort(buscaPorArtista);
        System.out.println(buscaPorArtista);

        Collections.sort(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));

        System.out.println(lista);

    }
}
