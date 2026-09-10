package revisao.poo.ex21encapsulamento;

//para uma classer ser considerada padrao JavaBeans:
//Possuir um construtor vazio
//Metodos getters e setters
//implementar uma interface Serializable

import java.io.Serializable;

public class Cartao implements Serializable {

    public static final double TARIFA_DEPOSITO = 0.10;
    public static final double VALOR_MINIMO_DEPOSITO = 50;

    private String titular;
    private double getSaldo;

    public Cartao(){
    }

    public Cartao(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return getSaldo;
    }

    public void debitar(double valorDebito) {
        if (getSaldo < valorDebito) {
            throw new RuntimeException("saldo insuficiente para pagamento.");
        }
        getSaldo -= valorDebito;
    }

    public void depositar(double valorDeposito) {
        if (valorDeposito < Cartao.VALOR_MINIMO_DEPOSITO) {
            throw new IllegalArgumentException(
                    String.format("Valor de depósito não pode ser menor que %.2f", Cartao.VALOR_MINIMO_DEPOSITO));
        }
        getSaldo += valorDeposito - TARIFA_DEPOSITO;
    }


}
