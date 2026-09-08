package revisao.Poo.Ex20CriandoConstrutores;

public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Arroz");//esse vem com a constante implícita
        Produto produto2 = new Produto("Feijão", 200);

        System.out.println(produto1.nome);
        System.out.println(produto1.quantidadeEmEstoque);

        System.out.println(produto2.nome);
        System.out.println(produto2.quantidadeEmEstoque);

        Produto produto3 = new Produto();

        System.out.println(produto3.nome);
        System.out.println(produto3.quantidadeEmEstoque);
    }
}
