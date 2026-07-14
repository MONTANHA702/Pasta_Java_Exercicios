package exercicios.poo.ex08construtor;

public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Mouse Pad", 224.30, 12);
        Produto produto2 = new Produto("Impressora", 1034.30, 6);

        produto1.exibirDados();
        double precoEstoque = produto1.valorTotalEstoque();
        System.out.printf("Valor total do estoque de %s: R$ %.2f%n", produto1.nome, precoEstoque);

        produto2.exibirDados();
        double valorTotalImpressoras = produto2.valorTotalEstoque();
        System.out.printf("Valor total do estoque de %s: R$ %.2f%n", produto2.nome, valorTotalImpressoras);
    }

}
