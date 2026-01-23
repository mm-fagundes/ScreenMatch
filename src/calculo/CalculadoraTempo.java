package calculo;

import br.com.mateus.modelos.Filme;
import br.com.mateus.modelos.Serie;
import br.com.mateus.modelos.Titulo;

public class CalculadoraTempo {

    private double tempoTotal;

    public double getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(Titulo t){
        tempoTotal = (tempoTotal + t.getDuracaoEmMinutos()) / 60;
    }



}
