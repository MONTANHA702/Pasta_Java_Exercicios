package revisao.streamsapi.ex01stringapi;

import java.math.BigDecimal;
import java.util.List;

public class Main13ReducaoComBigDecimal {
    public static void main(String[] args) {

        CadastroProduto cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        //calcular o valor total do estoque
        BigDecimal valorEmEstoque = produtos.stream()
                .map(produto -> produto.getPreco()
                        .multiply(new BigDecimal(produto.getQuantidade())))
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        System.out.println("Valor total do estoque: " + valorEmEstoque);


    }
}
