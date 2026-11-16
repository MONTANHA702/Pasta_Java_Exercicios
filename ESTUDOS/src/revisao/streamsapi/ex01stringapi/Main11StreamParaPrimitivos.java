package revisao.streamsapi.ex01stringapi;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main11StreamParaPrimitivos {
    public static void main(String[] args) {

        CadastroProduto cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        //se usar um stream de Integer em grandes quantidades
        //pode ocorrer vários boxing e unboxing
        //isso pode afetar a performance do sistema
//        Stream<Integer> stream = produtos.stream()
//                .filter(Produto::temEstoque)
//                .map(Produto::getQuantidade);
//        stream.forEach(p -> System.out.println(p*2));



        IntStream stream = produtos.stream()
                .filter(Produto::temEstoque)
                .mapToInt(Produto::getQuantidade)
                        .sorted();

        stream.forEach(produto -> System.out.println(produto*2));




    }
}
