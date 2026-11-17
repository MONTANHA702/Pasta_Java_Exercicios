package revisao.streamsapi.ex01stringapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.toList;

public class Main18CollectPadrao {
    public static void main(String[] args) {

        CadastroProduto cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        List<Categoria> categorias = produtos.stream()
                .filter(Produto::temEstoque)
                .flatMap(produto -> produto.getCategorias().stream())
                .distinct()
                //toList não garante qual é a implementação da lista
//                .collect(toList());//option+enter para reduzir Collerctors.toList()
                //Collectors.toCollection garante qual é a implementação
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(categorias);
    }
}
