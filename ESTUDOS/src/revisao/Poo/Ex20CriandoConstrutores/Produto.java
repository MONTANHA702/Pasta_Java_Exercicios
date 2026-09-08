package revisao.Poo.Ex20CriandoConstrutores;

import java.util.Objects;

public class Produto {

    static final int QUANTIDADE_EM_ESTOQUE_INICIAL = 100;

    String nome;
    int quantidadeEmEstoque;

    //é uma boa prática validar os construtores, da mesma forma que validamos o métodos

    /*Produto() {

    }
    Produto(String nome) {
        Objects.requireNonNull(nome, "Nome é obrigatório.");
        this.nome = nome;
        this.quantidadeEmEstoque = QUANTIDADE_EM_ESTOQUE_INICIAL;
    }
    Produto(String nome, int quantidadeEmEstoque) {
        Objects.requireNonNull(nome, "Nome é obrigatório.");
        if(quantidadeEmEstoque < 0) {
            throw new IllegalArgumentException("O estoque não pode ser negativo.");
        }
        this.nome = nome;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }
*/

    //encadeamento de chamadas de construtores

    Produto() {
        this("Sem nome");//chama o construtor de baixo, só que no nome fica sem nome.

    }
    Produto(String nome) {
        this(nome, QUANTIDADE_EM_ESTOQUE_INICIAL);//pega o construtor de baixo, mas coloca
                                                    //a quantidade padrã0 (100)
    }
    Produto(String nome, int quantidadeEmEstoque) {
        Objects.requireNonNull(nome, "Nome é obrigatório.");
        if (quantidadeEmEstoque < 0) {
            throw new IllegalArgumentException("O estoque não pode ser negativo.");
        }
        this.nome = nome;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }


}
