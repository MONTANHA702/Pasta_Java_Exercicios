package revisao.Poo.DesafioConstrutores;

import java.util.Objects;

public class Participante {

    static final int PONTOS_INICIAIS = 100;

    String nome;
    int saldoDePontos;

    Participante(String nome){
        this(nome, PONTOS_INICIAIS);
    }
    Participante(String nome, int saldoDePontos){
        Objects.requireNonNull(nome, "Necessário colocar nome.");

        if (saldoDePontos <0) {
            throw new IllegalArgumentException("Os pontos não podem ser negativos.");
        }
        this.nome = nome;
        this.saldoDePontos = saldoDePontos;

    }
}
