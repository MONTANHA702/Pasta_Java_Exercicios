package revisao.poo.desafiointerface;

public class ImovelResidencial implements BemSeguravel{

    public static final double TAXA_CALCULO_VALOR_SEGURO = 0.01;
    public static final double VALOR_POR_METRO_CONSTRUIDO = 0.3;

    private String tipo;
    private double valorMercado;
    private int areaConstruida;

    public ImovelResidencial(double valorMercado, int areaConstruida, String tipo) {
        this.valorMercado = valorMercado;
        this.areaConstruida = areaConstruida;
        this.tipo = tipo;
    }
    public String getTipo() {
        return tipo;
    }

    public double getValorMercado() {
        return valorMercado;
    }

    public int getAreaConstruida() {
        return areaConstruida;
    }

    @Override
    public double calcularValorPremio() {
        return (getValorMercado() * TAXA_CALCULO_VALOR_SEGURO) +
                (getAreaConstruida() * VALOR_POR_METRO_CONSTRUIDO);
    }

    @Override
    public String descrever() {
        return String.format("%S com %d metros2 de área construída. Valor de mercado: R$ %.2f",
                getTipo(), getAreaConstruida(), getValorMercado());
    }
}
