package revisao.streamsapi.ex01stringapi;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main20ColetandoEmMaps {
    public static void main(String[] args) {

        CadastroProduto cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        //uso to Collectors.toMap recebe 2 parametros: chave, valor

        Map<String, Integer> estoque = produtos.stream()
                .filter(Produto::temEstoque)
                .collect(Collectors.toMap(Produto::getNome, Produto::getQuantidade));

        System.out.println(estoque);
    }
}
