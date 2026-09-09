package revisao.poo.ex13declarandoconstantes;

public class Visitante {

    static final int IDADE_MINIMA_DE_ACESSO = 18;

    int idade;
    String nome;



    boolean possuiAcessoRestritoPorIdade() {
        return idade < IDADE_MINIMA_DE_ACESSO;
    }


}
