package exercicios.poo.ex21contabancariaheranca;

import java.util.Calendar;
import java.util.Scanner;

public class ContaPoupanca extends ContaBancaria {

    private int diaRendimento; //aniversário da poupança


    public ContaPoupanca(String nomeCliente, String numConta, double saldo) {
        super(nomeCliente, numConta, saldo);


    }

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public boolean calcularNovoSaldo(double taxa) {

        taxa = taxa/100;

        Calendar hoje = Calendar.getInstance();
        if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
            this.setSaldo(this.getSaldo()*(1 + taxa));
            return true;
        }
        return false;
    }


}
