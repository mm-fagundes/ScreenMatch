package br.com.mateus.modelos;

import calculo.Classificavel;
import org.w3c.dom.ls.LSOutput;

public class Filme extends Titulo implements Classificavel {

    private String diretor;

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getDiretor() {
        return diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }

    @Override
    public String toString() {
        return getNome() +" (" + getAnoDeLancamento()+")";
    }
}
