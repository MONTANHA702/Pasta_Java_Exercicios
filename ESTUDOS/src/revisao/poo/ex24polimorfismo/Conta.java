package revisao.poo.ex24polimorfismo;

public class Conta {

    private Titular titular;

    private int agencia;
    private int numero;
    private double saldo;

    public Conta(Titular titular, int agencia, int numero) {
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
    }

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

    protected void validarSaldoParaSaque(double valorSaque) {
        if(getSaldo() < valorSaque) {
            throw new IllegalArgumentException("Saldo insuficiente para saque");
        }
    }

    public void sacar(double valorSaque) {
        if(valorSaque <= 0) {
            throw new IllegalArgumentException("O valor deve ser maior que zero.");
        }
        validarSaldoParaSaque(valorSaque);

        saldo -= valorSaque;
    }

    public void depositar(double valorDeposito) {
        if(valorDeposito <= 0) {
            throw new IllegalArgumentException("O valor do de deposito deve ser maior que zero.");
        }
        saldo += valorDeposito;
    }

    public void imprimirDemonstrativo() {
        System.out.println("=====Demonstrativo=====");
        System.out.println("Titular: " + getTitular().getNome());
        System.out.println("Agencia: " + getAgencia());
        System.out.println("Conta: " + getNumero());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("=======================");
    }

    @Override
    public String toString() {
        return "[" +
                titular +
                ']';
    }
}
