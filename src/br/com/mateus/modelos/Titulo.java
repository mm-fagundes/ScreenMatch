package br.com.mateus.modelos;

public class Titulo {

    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaAvaliacoes;
    private int totalDeAvaliacoes;
    private double duracaoEmMinutos;

    public Titulo(int anoDeLancamento, String nome) {
        this.anoDeLancamento = anoDeLancamento;
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(double duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public double getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    public void exibeFichaTecnica(){
        System.out.format("""
                Nome: %s
                Ano de Lançamento: %d
                Avaliação: %.1f
                Duração: %.1f
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


}
