package revisao.streamsapi.ex01stringapi;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main22MapsagrupadosValoresAgregados {
    public static void main(String[] args) {

        CadastroProduto cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        //criar uma lista com o fabricante e numero dos tipos de produtos
        //Collerctors.grooupingBy(chave, valor)
//        Map<String, Long> produtosPorFabricante = produtos.stream()
//                .filter(Produto::temEstoque)
//                .collect(Collectors.groupingBy(produto -> produto.getFabricante().nome(),
//                        Collectors.counting()));
//        System.out.println(produtosPorFabricante);

        Map<String, Integer> estoquePorFabricante = produtos.stream()
                .filter(Produto::temEstoque)
                .collect(Collectors.groupingBy(produto -> produto.getFabricante().nome(),
                        Collectors.summingInt(Produto::getQuantidade)));
        System.out.println(estoquePorFabricante);

    }
}
