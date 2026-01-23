import br.com.mateus.modelos.Filme;

public class Principal{


    public static void main(String[] args) {

        Filme meuFilme = new Filme();
        meuFilme.setNome("The Godfather");
        meuFilme.setAnoDeLancamento(1990);
        meuFilme.setDuracaoEmMinutos(120);
        meuFilme.setIncluidoNoPlano(true);

        System.out.format("""
                Nome do Filme: %s
                Ano de Lançamento: %d
                Duração: %d
                Incluido no Plano: %b%n
                """, meuFilme.getNome(), meuFilme.getAnoDeLancamento(), meuFilme.getDuracaoEmMinutos(), meuFilme.isIncluidoNoPlano());

        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        meuFilme.exibeFichaTecnica();
        System.out.println("O total de avaliações é: "+meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

    }
}
