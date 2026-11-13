package revisao.streamsapi.ex01stringapi;

import java.util.List;
import java.util.stream.Stream;

public class Main2Filter {
    public static void main(String[] args) {

        CadastroProduto cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();


        System.out.println("--------");
        System.out.println("Pipeline é um conjunto de operações realizadas em sequência\n" +
                "que serão executadas em um Stream em algum momento.");
        System.out.println("--------");

        //criando uma pipeline
        //operacoes intermediárias
        Stream<Produto> produtoStream = produtos.stream();

        Stream<Produto> produtosEmEstoque = produtoStream.filter(produto ->  produto.getQuantidade() > 50);

        Stream<Produto> produtosEmEstoqueInativo = produtosEmEstoque.filter(Produto::isInativo);

        //operação terminal
        produtosEmEstoqueInativo.forEach(System.out::println);
    }
}
