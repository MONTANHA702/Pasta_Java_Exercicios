package revisao.streamsapi.ex01stringapi;

import java.util.ArrayList;
import java.util.List;

public class Main17Collect {
    public static void main(String[] args) {

        CadastroProduto cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        //quero uma lista de categoria de produtos
        List<Categoria> categorias = produtos.stream()
                .filter(Produto::temEstoque)
                .flatMap(produto -> produto.getCategorias().stream())
                .distinct()
//                .collect(() -> new ArrayList<>(),
//                        (lista, elemento) -> lista.add(elemento),
//                        (lista1, lista2) -> lista1.addAll(lista2));
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        System.out.println(categorias);

    }
}
