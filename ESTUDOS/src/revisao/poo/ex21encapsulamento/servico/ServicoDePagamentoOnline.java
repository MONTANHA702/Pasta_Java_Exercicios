package revisao.poo.ex21encapsulamento.servico;

import revisao.poo.ex21encapsulamento.Cartao;
import revisao.poo.ex21encapsulamento.Estabelecimento;
import revisao.poo.ex21encapsulamento.Recibo;

public class ServicoDePagamentoOnline {

    public Recibo efetuarPagamento(Estabelecimento estabelecimento,
                                   Cartao cartao, double valorDebito) {

        cartao.debitar(valorDebito);

        return new Recibo(cartao.getTitular(), "Pagamento", valorDebito);
    }
}
