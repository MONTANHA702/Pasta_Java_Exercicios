package revisao.excecoes.ex02lancamentoexcecoes;

import revisao.excecoes.ex02lancamentoexcecoes.estoque.Produto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Produto produto = new Produto("Apple Watch");
        produto.adicionarEstoque(10);
        System.out.printf("Estoque: %d%n", produto.getQuantidadeEstoque());

        produto.ativar();
        produto.retirarEstoque(4);
        System.out.println(produto);
    }
}
