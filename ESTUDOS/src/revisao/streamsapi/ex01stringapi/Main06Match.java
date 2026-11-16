package revisao.streamsapi.ex01stringapi;

import java.util.List;

public class Main06Match {
    public static void main(String[] args) {

        CadastroProduto cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        //anyMatch pelo menos um tem no estoque

//        boolean temProdutoEmEstoque = produtos.stream()
//                .peek(System.out::println)
//                .anyMatch(Produto::temEstoque);
//        System.out.println(temProdutoEmEstoque);

        //allMatch se todos tem no estoque

//        boolean NenhumProdutoTemNoEstoque = produtos.stream()
//                .peek(System.out::println)
//                .allMatch(Produto::temEstoque);
//        System.out.println(NenhumProdutoTemNoEstoque);

        //noneMatch nenhum produto no estoque
        boolean NenhumProdutoTemNoEstoque = produtos.stream()
                .peek(System.out::println)
                .noneMatch(Produto::temEstoque);
        System.out.println(NenhumProdutoTemNoEstoque);
    }
}
