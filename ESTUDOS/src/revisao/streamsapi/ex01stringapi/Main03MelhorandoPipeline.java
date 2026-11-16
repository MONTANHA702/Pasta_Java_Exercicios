package revisao.streamsapi.ex01stringapi;

import java.util.List;

public class Main03MelhorandoPipeline {
    public static void main(String[] args) {

        CadastroProduto cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();


        //comandos separados
//    Stream<Produto> stream = produtos.stream();
//    Stream<Produto> streamComEstoque = stream.filter(Produto::temEstoque);
//    Stream<Produto> streamComEstoqueInativa = streamComEstoque.filter(Produto::isInativo);

        //encadeamento
        produtos.stream()
                .filter(Produto::temEstoque)
                .filter(Produto::isInativo)
                .forEach(produto -> {
                    produto.ativar();
                    System.out.println("Ativando " + produto);

                });

        System.out.println("Partes de uma pipeline:");
        System.out.println("1 - Fonte de dados (no caso é a List<Produtos> produtos;");
        System.out.println("2 - Operações intermediárias (pode ter zero, uma, várias), nesse caso são os filters;");
        System.out.println("3 - Operação terminal, no caso é o .forEach.");
        System.out.println("Se não houver operação terminal as intermediárias não executam.");


    }
}
