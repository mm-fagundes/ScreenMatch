public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

    void exibeFichaTecnica(){

        System.out.format("""
                Nome: %s
                Ano de Lançamento: %d
                Avaliação: %.1f
                Duração: %d
                Total de Avaliações: %d
                """ ,nome,anoDeLancamento, somaAvaliacoes,duracaoEmMinutos, totalDeAvaliacoes);
    }

    void avalia(double nota){
        somaAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

}
