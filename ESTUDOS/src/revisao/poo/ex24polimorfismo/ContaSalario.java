package revisao.poo.ex24polimorfismo;

public class ContaSalario extends Conta {

    private double salario;

    public ContaSalario(Titular titular, int agencia, int numero, double salario) {
        super(titular, agencia, numero);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
