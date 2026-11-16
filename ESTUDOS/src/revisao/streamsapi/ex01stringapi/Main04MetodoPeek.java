package revisao.streamsapi.ex01stringapi;


import java.util.List;


//.peek é usado para alterar estados
//usado também como um debug
public class Main04MetodoPeek {
    public static void main(String[] args) {

        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        produtos.stream()
                .peek(produto -> produto.setNome(produto.getNome().toUpperCase()))
                .peek(produto -> System.out.println("Antes do tem estoque " + produto.getNome()))
                .filter(Produto::temEstoque)
                .peek(produto -> System.out.println("Depois do tem estoque " + produto.getNome()))
                .filter(Produto::isInativo)
                .forEach(produto -> {
                    produto.ativar();
                    System.out.println("Ativando... " + produto.getNome());
                });

    }
}
