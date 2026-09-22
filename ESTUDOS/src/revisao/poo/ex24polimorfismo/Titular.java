package revisao.poo.ex24polimorfismo;

import java.util.Objects;

public class Titular {

    private String nome;
    private String cpf;

    public Titular(String nome, String cpf) {
        Objects.requireNonNull(nome);
        Objects.requireNonNull(cpf);
        this.nome = nome;
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }


    public String toString() {
        return "[" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ']';
    }
}
