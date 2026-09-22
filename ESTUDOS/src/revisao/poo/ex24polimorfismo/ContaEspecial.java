package revisao.poo.ex24polimorfismo;

public class ContaEspecial extends ContaInvestimento{

    private double tarifaMensal;
    private double limiteChequeEspecial;

    public ContaEspecial(Titular titular, int agencia, int numero) {
        super(titular, agencia, numero);
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
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public double getSaldoDisponivel() {
        return getSaldo() + getLimiteChequeEspecial() - getTarifaMensal();
    }

    protected void validarSaldoParaSaque(double valorSaque) {
        if (getSaldoDisponivel() < valorSaque) {
            throw new IllegalArgumentException("Saldo insuficiente para saque");
        }
    }

//    public void debitarTarifaMensal() {
//        sacar(getTarifaMensal());
//    }

    @Override
    public void imprimirDemonstrativo() {
       super.imprimirDemonstrativo();
        System.out.printf("Saldo disponível: R$ %.2f%n", getSaldoDisponivel());
        System.out.println("====================");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
