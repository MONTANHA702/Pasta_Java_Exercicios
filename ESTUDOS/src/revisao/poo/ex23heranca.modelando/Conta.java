package revisao.poo.ex23heranca.modelando;

public class Conta {

    public static final int NORMAL = 0;
    public static final int INVESTIMENTO = 1;
    public static final int ESPECIAL = 2;

    private Titular titular;
    private int agencia;
    private int numero;
    private double saldo;
    private int tipoConta = NORMAL;

    //conta investimento
    private double valorTotalRendimentos;

    //conta especial
    private double tarifaMensal;
    private double limiteChequeEspecial;


    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getSaldoDisponivel() {
        return getSaldo() + getLimiteChequeEspecial();
    }

    public int getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(int tipoConta) {
        if (tipoConta != NORMAL && tipoConta != INVESTIMENTO  && tipoConta != ESPECIAL) {
            throw new IllegalArgumentException("Tipo inválido: " + tipoConta);
        }
        if (tipoConta != ESPECIAL) {
            this.limiteChequeEspecial = 0;
        }
        this.tipoConta = tipoConta;
    }

    public double getValorTotalRendimentos() {
        return valorTotalRendimentos;
    }

    public double getTarifaMensal() {
        return tarifaMensal;
    }

    public void setTarifaMensal(double tarifaMensal) {
        this.tarifaMensal = tarifaMensal;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        if(getTipoConta() != ESPECIAL) {
            throw new RuntimeException("Este tipo de conta não permite limite especial");
        }
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public void creditarRendimentos(double percentualJuros) {
        if(getTipoConta() == ESPECIAL || getTipoConta() == INVESTIMENTO) {
            double valorRendimentos = getSaldo() * percentualJuros / 100;
            this.valorTotalRendimentos += valorRendimentos;
            depositar(valorRendimentos);
        }  else {
            throw new RuntimeException("Não pode creditar rendimentos neste tipo de conta");
        }
    }

    public void sacar(double valorSaque) {
        if(valorSaque <= 0) {
            throw new IllegalArgumentException("Valor do saque deve ser maior que 0");
        }
        if(getSaldoDisponivel() < valorSaque) {
            throw new IllegalArgumentException("Saldo insuficiente para saque");
        }
        saldo -= valorSaque;
    }

    public void depositar(double valorDeposito) {
        if(valorDeposito <= 0) {
            throw new IllegalArgumentException("Valor do depósito deve ser maior que 0");
        }
        saldo += valorDeposito;
    }

    public void imprimirDemonstrativo() {
        System.out.println();
        System.out.println("===DEMONSTRATIVO===");
        System.out.printf("Agência: %d%n", getAgencia());
        System.out.printf("Conta: %d%n", getNumero());
        System.out.printf("Titular: %s%n", getTitular().getNome());
        System.out.printf("Saldo: R$ %.2f%n", getSaldo());
        System.out.printf("Saldo disponível: R$ %.2f%n", getSaldoDisponivel());
        System.out.println("====================");
    }

    public void debitarTarifaMensal() {
        if (getTipoConta() == ESPECIAL) {
            sacar(getTarifaMensal());
        } else {
            throw new RuntimeException("Não pode debitar tarifa mensal neste tipo de conta");
        }
    }
}
