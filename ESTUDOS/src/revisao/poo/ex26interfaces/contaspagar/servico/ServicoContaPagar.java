package revisao.poo.ex26interfaces.contaspagar.servico;

import revisao.poo.ex26interfaces.contaspagar.pagamento.DocumentoPagavel;
import revisao.poo.ex26interfaces.contaspagar.pagamento.MetodoPagamento;


public class ServicoContaPagar {
    //MetodoPagamento metodoPagamento = new Pix();
    //MetodoPagamento metodoPagamento = new Transferencia();
    //Ao invés de instanciar o metodo de pagamento, cria-se uma variavel
    //a isso chama-se INJECAO DE DEPENDENCIA
    private MetodoPagamento metodoPagamento;

    public ServicoContaPagar(MetodoPagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public void pagar(DocumentoPagavel documento) {
        metodoPagamento.pagar(documento);

    }
}
