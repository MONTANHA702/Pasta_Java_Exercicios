package revisao.poo.ex23heranca.heranca4;

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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

}
