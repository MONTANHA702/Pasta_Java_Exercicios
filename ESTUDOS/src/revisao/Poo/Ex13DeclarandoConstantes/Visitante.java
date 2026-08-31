package revisao.Poo.Ex13DeclarandoConstantes;

public class Visitante {

    static final int IDADE_MINIMA_DE_ACESSO = 18;

    int idade;
    String nome;



    boolean possuiAcessoRestritoPorIdade() {
        return idade < IDADE_MINIMA_DE_ACESSO;
    }


}
