package main;

import br.com.mateus.modelos.Filme;
import br.com.mateus.modelos.Serie;
import calculo.CalculadoraTempo;

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


    }
}
