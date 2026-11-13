package revisao.streamsapi.ex01stringapi;

import java.util.List;
import java.util.stream.Stream;

public class Main1Introducao {
    public static void main(String[] args) {

        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

//        for (Produto produto : produtos) {
//            produto.ativar();
//            System.out.println(produto);
//        }

//        for (int i = 0; i < produtos.size(); i++) {
//            Produto produto = produtos.get(i);
//            produto.ativar();
//            System.out.printf("%d - %s%n", (i+1), produto);
//    }

//        produtos.forEach(produto -> {
//            produto.ativar();
//            System.out.println(produto);});
//

        Stream<Produto> produtoStream = produtos.stream();
        produtoStream.forEach(produto -> {
            produto.ativar();
            System.out.println(produto);
        });
    }
}
