package revisao.poo.desafiopacotesemodificadoresacesso.br.com.algamilhas;

public class Participante {

    private static final int PONTOS_INICIAIS = 100;

    private String nome;
    private int saldoDePontos;

    public Participante(String nome) {
        this(nome, PONTOS_INICIAIS);
    }

    private Participante(String nome, int saldoDePontos) {
        this.nome = nome;
        this.saldoDePontos = saldoDePontos;
    }

    public void creditarPontos(int pontos) {
        this.saldoDePontos = pontos + PONTOS_INICIAIS;
    }
    public void mostrarStatus() {
        System.out.println("---------------");
        System.out.println("Nome:" + nome);
        System.out.println("Saldo de pontos: " + saldoDePontos);
        System.out.println("---------------");
    }

}
