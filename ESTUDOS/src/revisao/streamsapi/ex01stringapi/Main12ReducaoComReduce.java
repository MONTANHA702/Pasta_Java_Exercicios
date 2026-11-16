package revisao.streamsapi.ex01stringapi;

import java.util.List;

public class Main12ReducaoComReduce {
    public static void main(String[] args) {

        CadastroProduto cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        //queremos um resultado final, seja soma, média, etc

        int totalEstoque = produtos.stream()
                .mapToInt(Produto::getQuantidade)
                .reduce(0, Integer::sum);
        System.out.println("Total de estoque do produto: " + totalEstoque);

        System.out.println("-----");

        int maximoEmEstoque = produtos.stream()
                .mapToInt(Produto::getQuantidade)
                .reduce(0, Integer::max);
        System.out.println(maximoEmEstoque);

        System.out.println("-----");

        double minimoEmEstoque = produtos.stream()
                .mapToDouble(Produto::getQuantidade)
                .reduce(0, Double::min);
        System.out.println(minimoEmEstoque);


    }
}
