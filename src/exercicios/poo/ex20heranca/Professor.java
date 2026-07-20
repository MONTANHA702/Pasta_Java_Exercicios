package exercicios.poo.ex20heranca;

public class Professor extends Pessoa{

    private String departamento;
    private double salario;

    public Professor(String nome, int idade, String sexo) {
        super(nome, idade, sexo);

    }

    public Professor(String departamento, double salario) {
        this.departamento = departamento;
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
