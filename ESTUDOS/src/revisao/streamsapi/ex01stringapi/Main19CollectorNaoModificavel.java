package revisao.streamsapi.ex01stringapi;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toUnmodifiableList;

public class Main19CollectorNaoModificavel {
    public static void main(String[] args) {

        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        List<Categoria> categorias = produtos.stream()
                .filter(Produto::temEstoque)
                .flatMap(produto -> produto.getCategorias().stream())
                .distinct()
                        .toList();//lista não modificável
//                .collect(toUnmodifiableList());
        System.out.println(categorias);
    }
}
