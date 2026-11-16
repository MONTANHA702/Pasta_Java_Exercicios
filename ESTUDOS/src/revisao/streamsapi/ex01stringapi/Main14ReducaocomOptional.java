package revisao.streamsapi.ex01stringapi;

import java.util.List;
import java.util.OptionalInt;

public class Main14ReducaocomOptional {
    public static void main(String[] args) {

        CadastroProduto cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        //e se não tiver algo para retornar?

        OptionalInt maiorQuantidadeOptional = produtos.stream()
                .mapToInt(Produto::getQuantidade)
                .reduce(Integer::max);//observe que só tem um parâmetro

        int maiorQuantidade = maiorQuantidadeOptional.orElseThrow(
                () -> new RuntimeException("Quantidade não encontrada")
        );
        System.out.println(maiorQuantidade);



    }
}
