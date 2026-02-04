package br.com.mateus.modelos;

import calculo.Classificavel;

public class Episodio implements Classificavel {
    private int numero;
    private String nome;
    private Serie serie;
    private int totalVizualicacoes;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getTotalVizualicacoes() {
        return totalVizualicacoes;
    }

    public void setTotalVizualicacoes(int totalVizualicacoes) {
        this.totalVizualicacoes = totalVizualicacoes;
    }

    @Override
    public int getClassificacao() {
        if(getTotalVizualicacoes() > 100){
            return 4;
        } else{
            return 2;
        }
    }



}
