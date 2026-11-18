package revisao.streamsapi.ex01stringapi;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main23MapsParticionadosPartitioningBy {
    public static void main(String[] args) {

        CadastroProduto cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        //Enquanto o groupingBy podemos formar um Map com qualquer tipo de chave-valor
        //no partitioningBy sempre a forma será Map<Boolean, List>

        Map<Boolean, List<Produto>> estoqueProdutos = produtos.stream()
                .collect(Collectors.partitioningBy(Produto::temEstoque));

        estoqueProdutos.forEach((chave, valor) ->{
            System.out.println();
            System.out.println(chave);
            System.out.println("-----");
            System.out.println(valor);
        });
    }
}
