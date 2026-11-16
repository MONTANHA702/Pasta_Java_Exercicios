package revisao.streamsapi.ex01stringapi;

import java.util.List;


//para exibir elementos distintos (sem repetição)
//usamos o método .distinct(), mas para ele funcionar
//o método equals deve estar implementado.
//Nas classes record esse método é nativo,
//nos outros tipos de classe temos que verificar e implementar
public class Main09ElementosDistintosComDistinct {
    public static void main(String[] args) {

        CadastroProduto cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        produtos.stream()
                .filter(Produto::temEstoque)
                .map(Produto::getFabricante)
                .distinct() //operação com statefull (todos os elementos são percorridos)
                .forEach(System.out::println);
    }
}
