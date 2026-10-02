package revisao.generics.ex04criandoclassesgenerics;

public class Main {
    public static void main(String[] args) {

//        //se nao parametrizar a classe pilha ela aceita qq coisa
//        Pilha pilha = new Pilha();
//        pilha.colocar("A");
//        pilha.colocar("B");
//        pilha.colocar(new Produto("Arroz"));
//        pilha.colocar(new Produto("Feijão"));

        //agora só aceita tipos Produto
        //mudando o parametro <> ela passa a aceitar somente o tipo parametrizado
        Pilha<Produto> pilha = new Pilha<>();
        pilha.colocar(new Produto("Arroz"));
        pilha.colocar(new Produto("Feijão"));

        Produto produto = pilha.retirar();
        System.out.println(produto.getDescricao());

        produto =  pilha.retirar();
        System.out.println(produto.getDescricao());

        produto = pilha.retirar();
        System.out.println(produto.getDescricao());

    }
}
