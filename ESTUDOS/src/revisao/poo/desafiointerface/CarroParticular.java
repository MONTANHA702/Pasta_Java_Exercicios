package revisao.poo.desafiointerface;

public class CarroParticular extends VeiculoAutomotor implements BemSeguravel{

    public static final double TAXA_CALCULO_VALOR_SEGURO = 0.04;
    public static final double TAXA_ACRESCIMO_ANO_VEICULO_INFERIOR_2000 = 1.05;

    public CarroParticular(String modelo, double valorMercado, int anoFabricacao) {
        super(modelo, valorMercado, anoFabricacao);
    }


    @Override
    public double calcularValorPremio() {
        double seguro = getValorMercado() * TAXA_CALCULO_VALOR_SEGURO;
        if (getAnoFabricacao() < 2000) {
            seguro = seguro * TAXA_ACRESCIMO_ANO_VEICULO_INFERIOR_2000;
        }
        return seguro;
    }

    @Override
    public String descrever() {
        return String.format("%S ano %d - valor de mercado R$ %.2f",
                getModelo(), getAnoFabricacao(), getValorMercado());
    }
}
