public class Principal{


    public static void main(String[] args) {

        Filme meuFilme = new Filme();
        meuFilme.nome = "O Poderoso Chefão";
        meuFilme.anoDeLancamento = 1970;
        meuFilme.duracaoEmMinutos = 180;
        meuFilme.somaAvaliacoes = 5;
        meuFilme.totalDeAvaliacoes = 105;
        meuFilme.incluidoNoPlano = true;

        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        meuFilme.exibeFichaTecnica();
        meuFilme.verNumAvaliacoes();

    }
}
