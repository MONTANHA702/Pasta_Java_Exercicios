package revisao.Poo.Ex20CriandoConstrutores;

public class Produto {

    static final int QUANTIDADE_EM_ESTOQUE_INICIAL = 100;

    String nome;
    int quantidadeEmEstoque;

    Produto() {

    }

    Produto(String nome) {
        this.nome = nome;
        this.quantidadeEmEstoque = QUANTIDADE_EM_ESTOQUE_INICIAL;
    }
    Produto(String nome, int quantidadeEmEstoque) {
        this.nome = nome;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }
}
