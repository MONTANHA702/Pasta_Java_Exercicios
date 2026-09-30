package revisao.excecoes.ex02lancamentoexcecoes.estoque;

import java.util.Objects;

public class Produto {

    private String nome;
    private int quantidadeEstoque;
    private boolean ativo;

    public Produto(String nome) {
        setNome(nome);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        Objects.requireNonNull(nome, "Nome deve ser informado");
        this.nome = nome;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void ativar() {
        this.ativo = true;
    }
    public void desativar() {
        this.ativo = false;
    }

    //criei um metodo isInativo p ficar mais amigável
    public boolean isInativo() {
        return !isAtivo();
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }


    //se colocar número negativo viola regra de negócio
    //por isso deve-se lancar uma exceção.
    public void retirarEstoque(int quantidade) {
        if (quantidade < 0) {
            throw new IllegalArgumentException("Quantidade deve ser positiva e diferente de zero.");
        }
        if (isInativo()) {
            throw new IllegalStateException("Retirada no estoque não pode ser realizada" +
                    "em produto inativo.");
        }
        if( this.quantidadeEstoque - quantidade < 0) {
            throw new IllegalArgumentException("Quantidade insuficiente do produto.");
        }

        this.quantidadeEstoque -= quantidade;
    }

    public void adicionarEstoque(int quantidade) {
        this.quantidadeEstoque += quantidade;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", quantidadeEstoque=" + quantidadeEstoque +
                ", ativo=" + ativo +
                '}';
    }
}
