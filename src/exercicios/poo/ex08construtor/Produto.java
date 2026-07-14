package exercicios.poo.ex08construtor;

public class Produto {
    String nome;
    double preco;
    int quantidadeEstoque;

    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    double valorTotalEstoque(){

        return preco*quantidadeEstoque;
    }

    void exibirDados(){
        System.out.println("=== DADOS DO PRODUTO ===");
        System.out.println("Nome: " + nome);
        System.out.printf("Preco: R$ %.2f%n",preco);
        System.out.printf("Quantidade em estoque: %d unidades.%n",quantidadeEstoque);
    }

}
