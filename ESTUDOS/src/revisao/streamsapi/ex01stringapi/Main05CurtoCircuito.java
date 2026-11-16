package revisao.streamsapi.ex01stringapi;


import java.util.List;
import java.util.Optional;


//operacao de curto-circuito ocorre quando o stream
//já encontra a condição que satisfaz a lógica
//então ele encerra sem continuar percorrendo a lista
public class Main05CurtoCircuito {
    public static void main(String[] args) {

        CadastroProduto cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();


        //quero encontrar o primeiro
        Optional<Produto> produtoOptional = produtos.stream()
                .filter(Produto::temEstoque)
                .filter(Produto::isInativo)
                .findFirst();//findFirst é uma operacao terminal e retorna um Optional.
//.findAny procura sem se preocupar com a ordem

        Produto produto = produtoOptional.orElseThrow(
                () -> new RuntimeException("Produto não encontrado"));

        System.out.println(produto);

    }
}
