package revisao.excecoes.ex05criandoexcecoes;


//se for necessário, podemos construir exceções com
//atributos necessários ao melhor desempenho.
public class ProdutoSemEstoqueComVariavelException  extends RuntimeException{

    private final int estoqueDisponivel;
    private final int estoqueNecessario;

    public ProdutoSemEstoqueComVariavelException(String message, int estoqueDisponivel, int estoqueNecessario) {
        super(message);
        this.estoqueDisponivel = estoqueDisponivel;
        this.estoqueNecessario = estoqueNecessario;
    }

    public int getEstoqueDisponivel() {
        return estoqueDisponivel;
    }

    public int getEstoqueNecessario() {
        return estoqueNecessario;
    }
}
