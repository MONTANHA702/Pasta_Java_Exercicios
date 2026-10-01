package revisao.excecoes.ex05criandoexcecoes;

public class ProdutoSemEstoqueException extends RuntimeException {

    public ProdutoSemEstoqueException(String mensagem){
        super(mensagem);
    }
}
