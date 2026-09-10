package revisao.poo.ex21encapsulamento.servico;

import revisao.poo.ex21encapsulamento.Cartao;
import revisao.poo.ex21encapsulamento.Recibo;

public class SevicoDeDepositoPix {

    public Recibo efetuarDeposito(Cartao cartao, double valorDeposito) {

        cartao.depositar(valorDeposito);

        return new Recibo(cartao.getTitular(), "Depósito", valorDeposito);
    }
}
