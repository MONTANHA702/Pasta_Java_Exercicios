package revisao.collections.listas.desafio;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        CadastroPacoteViagem cadastro = new CadastroPacoteViagem();

        cadastro.adicionar("Istambul e Capadócia (20 noites)", 18_000);
        cadastro.adicionar("Neve em Bariloche (10 noites)", 11_000);
        cadastro.adicionar("Disney (10 noites)", 20_000);
        cadastro.adicionar("Natal Luz em Gramado (5 noites)", 8_500);

        //cadastro.removerPorDescricaoAlternativo("Disney (10 noites)");
        //cadastro.removerPorDescricao("Disney (10 noites)");

//        List <PacoteViagem> pacotes = cadastro.obterTodos();
//        imprimirPacotes(pacotes);

        PacoteViagem buscarPacote = cadastro.buscarPorDescricao("Disney (10 noites)");
        System.out.println(buscarPacote);

    }

    private static void imprimirPacotes(List<PacoteViagem> pacotes) {
        for (PacoteViagem pacote : pacotes) {
            System.out.printf("%S -> R$ %.2f%n",
                    pacote.getDescricao(), pacote.getPrecoPorPessoa());
        }
    }

}
