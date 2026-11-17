package revisao.streamsapi.ex01stringapi;

import java.util.List;
import java.util.OptionalDouble;

//operações especiais de redução
public class Main15SumAverageCount {
    public static void main(String[] args) {

        CadastroProduto cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        int soma = produtos.stream()
                .mapToInt(Produto::getQuantidade)
                .sum();
        System.out.println("Soma: " + soma);

        System.out.println("-----");

        double media = produtos.stream()
                .mapToInt(Produto::getQuantidade)
                .average()
                .orElseThrow(() -> new RuntimeException("Não foi possível calcular a média"));
        System.out.printf("Media: %.3f%n", media);

        System.out.println("-------");

        long totalProdutosEmEstoque = produtos.stream()
                .filter(Produto::temEstoque)
                .count();
        System.out.println("Total de produtos em estoque: " + totalProdutosEmEstoque);


    }
}
