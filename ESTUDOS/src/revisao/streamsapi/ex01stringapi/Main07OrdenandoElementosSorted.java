package revisao.streamsapi.ex01stringapi;

import java.util.Comparator;
import java.util.List;

public class Main07OrdenandoElementosSorted {
    public static void main(String[] args) {

        CadastroProduto cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        //sorted é uma operação intermediária com statefull
        //isto é, passa por todos os elementos
        produtos.stream()
                .filter(Produto::temEstoque)
//                .sorted() só funciona se implementar o Comparable na classe produto
                .sorted(Comparator.comparingInt(Produto::getQuantidade))
                .forEach(produto -> System.out.printf("%S - %d unidades%n",
                        produto.getNome(), produto.getQuantidade()));


    }
}
