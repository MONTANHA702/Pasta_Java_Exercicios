package revisao.poo.desafiopolimorfismo;

public class PessoaFisica extends Pessoa {

    public static final double RECEITA_ANUAL_ISENCAO = 50_000;
    public static final double IMPOSTO_RENDA = 0.2;

    private double receitaAnual;

    public PessoaFisica(String nome, double receitaAnual) {
        super(nome);
        this.receitaAnual = receitaAnual;
    }

    public double getReceitaAnual() {
        return receitaAnual;

    }

    @Override
    public double calcularImposto() {
        double imposto = getReceitaAnual() * IMPOSTO_RENDA;

        if(isIsento()) {
            imposto = 0;
        }

        return imposto;
    }

    private boolean isIsento() {
        return receitaAnual < RECEITA_ANUAL_ISENCAO;
    }


}
