package revisao.excecoes.ex05criandoexcecoes;

public class ProdutoInativoException extends RuntimeException {

    public ProdutoInativoException(String mensagem) {
        super(mensagem);
    }
}
