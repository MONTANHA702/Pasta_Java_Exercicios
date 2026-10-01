package revisao.excecoes.ex05criandoexcecoes;

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

    public boolean isInativo() {
        return !isAtivo();
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }



    public void retirarEstoque(int quantidade) {
        if (quantidade < 0) {
            throw new IllegalArgumentException("Quantidade deve ser positiva e diferente de zero.");
        }
        //inserindo uma excecao criada por nós
        if (isInativo()) {
            throw new ProdutoInativoException("Retirada no estoque não pode ser realizada em produto inativo.");
        }
        if( this.quantidadeEstoque - quantidade < 0) {
            throw new ProdutoSemEstoqueException(String.format("Quantidade insuficiente do produto. Estoque <%d>", getQuantidadeEstoque()));
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
