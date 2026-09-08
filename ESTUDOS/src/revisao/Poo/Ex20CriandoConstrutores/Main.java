package revisao.Poo.Ex20CriandoConstrutores;

public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Arroz");
        Produto produto2 = new Produto("Feijão");

        System.out.println(produto1.nome);
        System.out.println(produto1.quantidadeEmEstoque);

        System.out.println(produto2.nome);
        System.out.println(produto2.quantidadeEmEstoque);
    }
}
