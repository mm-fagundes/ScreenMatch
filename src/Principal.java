import br.com.mateus.modelos.Filme;

public class Principal{


    public static void main(String[] args) {

        Filme meuFilme = new Filme();
        meuFilme.nome = "O Poderoso Chefão";
        meuFilme.anoDeLancamento = 1970;
        meuFilme.duracaoEmMinutos = 180;
        meuFilme.incluidoNoPlano = true;

        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        meuFilme.exibeFichaTecnica();
        System.out.println("O total de avaliações é: "+meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

    }
}
