package revisao.poo.desafiointerface;

public class Caminhao extends VeiculoAutomotor implements BemSeguravel{

    public static final double TAXA_CALCULO_VALOR_SEGURO = 0.02;
    public static final int TAXA_POR_NUMERO_DE_EIXOS = 50;

    private int quantidadeEixos;


    public Caminhao(String modelo, double valorMercado, int anoFabricacao, int quantidadeEixos) {
        super(modelo, valorMercado, anoFabricacao);
        this.quantidadeEixos = quantidadeEixos;
    }
    public int getQuantidadeEixos() {
        return quantidadeEixos;
    }

    @Override
    public double calcularValorPremio() {
        return (getValorMercado() * TAXA_CALCULO_VALOR_SEGURO) +
                (getQuantidadeEixos() * TAXA_POR_NUMERO_DE_EIXOS);
    }

    @Override
    public String descrever() {
        return String.format("%S %d eixos, ano %d - valor de mercado R$ %.2f",
                getModelo(), getQuantidadeEixos(),getAnoFabricacao(), getValorMercado());
    }
}
