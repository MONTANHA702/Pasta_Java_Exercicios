package revisao.streamsapi.ex01stringapi;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main21MapsGroupingBy {
    public static void main(String[] args) {

        CadastroProduto cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        //para cada fabricante uma lista de produtos
        Map<Fabricante, List<Produto>> produtosPorFabricante = produtos.stream()
                .filter(Produto::temEstoque)
                .collect(Collectors.groupingBy(Produto::getFabricante));

        produtosPorFabricante.forEach((fabricante, produtosDoFabricante) -> {
            System.out.println("-----");
            System.out.println(fabricante.nome());
            System.out.println(produtosDoFabricante);
        });
    }
}
