package revisao.streamsapi.ex01stringapi;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main16MinMax {
    public static void main(String[] args) {

        CadastroProduto cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        int menorQuantidade = produtos.stream()
                .filter(Produto::temEstoque)
                .mapToInt(Produto::getQuantidade)
                .min()
                .orElse(0);
        System.out.println("Menor quantidade: " + menorQuantidade);

        System.out.println("-----");

        int maiorQuantidade = produtos.stream()
                .filter(Produto::temEstoque)
                .mapToInt(Produto::getQuantidade)
                .max()
                .orElseThrow(() -> new RuntimeException("Não encontrado"));
        System.out.println("Maior quantidade: " + maiorQuantidade);

        System.out.println("-----");

        BigDecimal maiorPreco = produtos.stream()
                .filter(Produto::temEstoque)
                .map(Produto::getPreco)
                .max(Comparator.comparing(BigDecimal::doubleValue))
                .orElseThrow(() -> new RuntimeException("Não foi encontrado"));
        System.out.println("Maior Preco: " + maiorPreco);


        System.out.println("-----");


        Produto produtoMaisCaro = produtos.stream()
                .filter(Produto::temEstoque)
                .max(Comparator.comparing(Produto::getPreco))
                .orElseThrow(RuntimeException::new);
        System.out.println("Produto Mais caro: " + produtoMaisCaro.getNome());




    }
}
