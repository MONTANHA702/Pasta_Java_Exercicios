package revisao.poo.desafioimplementandoheranca;

public class Programador extends Funcionario {

    private double valorBonus;

    public Programador(String nome, double valorHora) {
        super(nome, valorHora);
    }

    public double getValorBonus() {
        return valorBonus;
    }

    public void setValorBonus(double valorBonus) {
        this.valorBonus = valorBonus;
    }

    @Override
    public final double calcularSalario(int horasTrabalhadas) {
        return  getValorBonus() + super.calcularSalario(horasTrabalhadas);
    }

    @Override
    public Holerite gerarHolerite(int horasTrabalhadas, String mesAno) {
        return new Holerite(getNome(), mesAno, calcularSalario(horasTrabalhadas));

    }
    @Override
    public String toString() {
        return "Programador\n" +
                "[Nome='" + getNome() + '\'' +
                "\nValorBonus " + String.format("R$ %.2f",getValorBonus()) +
                ",\nValorHora " + String.format("R$ %.2f",getValorHora()) +
                ']';
    }
}
