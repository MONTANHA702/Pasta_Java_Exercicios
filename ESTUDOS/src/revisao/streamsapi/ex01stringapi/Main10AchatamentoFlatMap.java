package revisao.streamsapi.ex01stringapi;

import java.util.List;

public class Main10AchatamentoFlatMap {
    public static void main(String[] args) {

        CadastroProduto cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        //queremos produtos em estoque e saber a categoria desses produtos
        //a categoria é um stream de stream já que categoria é um Set
        //para isso temos o flatMap
        produtos.stream()
                .filter(Produto::temEstoque)
                .flatMap(produto -> produto.getCategorias().stream())
                .distinct()
                .forEach(System.out::println);
    }
}
