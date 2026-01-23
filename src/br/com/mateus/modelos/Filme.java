package br.com.mateus.modelos;

public class Filme {
    public String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaAvaliacoes;
    private int totalDeAvaliacoes;
    int duracaoEmMinutos;

    public void exibeFichaTecnica(){
        System.out.format("""
                Nome: %s
                Ano de Lançamento: %d
                Avaliação: %.1f
                Duração: %d
                Total de Avaliações: %d
                """ ,nome,anoDeLancamento, somaAvaliacoes,duracaoEmMinutos, totalDeAvaliacoes);
    }

    public void avalia(double nota){
        somaAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia(){
        return somaAvaliacoes /totalDeAvaliacoes;
    }

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }
}
