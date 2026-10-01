package revisao.excecoes.ex05criandoexcecoes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Produto produto = new Produto("Apple Watch");
        produto.setQuantidadeEstoque(10);

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

            } catch (ProdutoInativoException e) {

                System.out.println("Erro na compra: " + e.getMessage());
                System.out.println("Deseja ativar o produto? true/false");
                if(sc.nextBoolean()) {
                    produto.ativar();
                    System.out.println("Ok. Produto ativado com sucesso!");
                } else {
                    System.out.println("Ok. Compra não realizada.");
                    break;
                }
            } catch (ProdutoSemEstoqueException e) {
                System.out.println("Erro na compra: " + e.getMessage());
            }


        } while (true);
    }

    private static void efetuarBaixaEstoque(Produto produto, int quantidade) {

        produto.retirarEstoque(quantidade);
        System.out.printf("%d unidades retiradas do estoque. Estoque atual: %d%n",
                quantidade, produto.getQuantidadeEstoque());
    }
}


