package revisao.excecoes.ex03capturando;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Produto produto = new Produto("Apple watch");
        //produto.ativar();
        produto.adicionarEstoque(20);

        comprar(produto);
    }

    private static void comprar(Produto produto) {
        Scanner sc = new Scanner(System.in);

        do {
            try {

                System.out.println("Digite a quantidade para compra: ");
                int quantidade = sc.nextInt();

                efetuarBaixaEstoque(produto, quantidade);

                System.out.println("Compra realizada com sucesso!");

                break;

            } catch (IllegalArgumentException e) {
                //e.printStackTrace(); se quiser visualizar a pilha
                System.out.println("Erro na compra: " + e.getMessage());

            } catch (IllegalStateException e) {

                System.out.println("Erro na compra: " + e.getMessage());
                System.out.println("Deseja ativar o produto? true/false");
                if(sc.nextBoolean()) {
                    produto.ativar();
                    System.out.println("Ok. Produto ativado com sucesso!");
                } else {
                    System.out.println("Ok. Compra não realizada.");
                    break;
                }
            }


        } while (true);
    }

    private static void efetuarBaixaEstoque(Produto produto, int quantidade) {

        produto.retirarEstoque(quantidade);
        System.out.printf("%d unidades retiradas do estoque. Estoque atual: %d%n",
                quantidade, produto.getQuantidadeEstoque());
    }
}

