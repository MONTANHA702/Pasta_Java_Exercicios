package revisao.poo.ex21encapsulamento;

import revisao.poo.ex21encapsulamento.servico.ServicoDePagamentoOnline;
import revisao.poo.ex21encapsulamento.servico.SevicoDeDepositoPix;

public class Main {

    public static void main(String[] args) {

        var supermercado = new Estabelecimento("Supermercado do Zé");
        var cartao = new Cartao("Joaozinho");

        var servicoDeDeposito = new SevicoDeDepositoPix();

        Recibo reciboDeposito = servicoDeDeposito.efetuarDeposito(cartao, 500);
        reciboDeposito.imprimir();

        var servicoDePagamento = new ServicoDePagamentoOnline();
        Recibo reciboPagamento = servicoDePagamento.efetuarPagamento(supermercado, cartao, 100);
        reciboPagamento.imprimir();

        System.out.println("Titular: " + cartao.getTitular());
        System.out.printf("Saldo: R$ %.2f%n", cartao.getSaldo());
    }
}
