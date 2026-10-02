package revisao.excecoes.desafio;

import java.util.Objects;

public class ContaCorrente {
    private String numero;
    private double saldo;
    private boolean ativa;

    public ContaCorrente(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public boolean isInativa() {
        return !isAtiva();
    }

    public void ativar() {
        this.ativa = true;
    }

    public void inativar() {
        this.ativa = false;
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor deve ser maior que zero!");
        }

        if (valor > this.saldo) {
           throw new SaldoInsuficienteException(
                   String.format("Saldo insuficiente! Valor atual <R$%.2f>", getSaldo()));
        }

        if (isInativa()) {
            throw new ContaInativaException("A conta está inativa. Você deve ativá-la.");
        }

        this.saldo -= valor;

    }

    public void depositar(double valor) {
        if (valor <= 0) {
           throw new IllegalArgumentException("Valor de depósito deve ser maior que 0");
        }

        if (isInativa()) {
           throw new ContaInativaException("Conta inativa. Para realizar operações " +
                   "você deve ativá-la.");
        }

        this.saldo += valor;
    }

    public void transferir(ContaCorrente contaDestino, double valor) {
        Objects.requireNonNull(contaDestino, "Conta deve ser informado!");
        if (contaDestino.isInativa()) {
            throw new ContaInativaException("Conta inativa. " +
                    "Para realizar operações você deve ativá-la");
        }

        sacar(valor);
        contaDestino.depositar(valor);
    }
}
