package revisao.poo.desafiopolimorfismo;

public class EmpresaLucroReal extends PessoaJuridica{

    public static final double ALIQUOTA_IMPOSTO_LUCRO = 0.25;


    public EmpresaLucroReal(String nome, double faturamentoAnual, double despesaAnual) {
        super(nome, faturamentoAnual, despesaAnual);
    }

    @Override
    public double calcularImposto() {
        double imposto = getLucroAnual() * ALIQUOTA_IMPOSTO_LUCRO;

        if (getFaturamentoAnual() < getDespesaAnual()) {
            imposto = 0;
        }
        return imposto;
    }
}
