package revisao.poo.ex27interfaces2;

public class Funcionario implements ClienteFinanciavel, PessoaBonificavel {

    public static final int FATOR_AJUSTE_CONCESSAO_LIMITE = 5;

    private double salarioMensal;
    private String nome;

    public Funcionario(String nome,double salarioMensal) {
        this.salarioMensal = salarioMensal;
        this.nome = nome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public double calcularLimiteAprovado() {
        return getSalarioMensal() * FATOR_AJUSTE_CONCESSAO_LIMITE;
    }

    @Override
    public double calcularBonus(double percentualMetaAlcancada) {
        return getSalarioMensal() * percentualMetaAlcancada  / 100;
    }

    @Override
    public String toString() {
        return nome;
    }
}
