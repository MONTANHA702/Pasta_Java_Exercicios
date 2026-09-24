package revisao.poo.desafiopolimorfismo;

public class GestorDeImpostos {

    private double valorTotalImpostos;

    public double getValorTotalImpostos() {
        return valorTotalImpostos;
    }

    public void adicionar(Pessoa pessoas) {

        System.out.printf("Contribuinte: %S - Imposto a pagar: R$ %.2f\n", pessoas.getNome(), pessoas.calcularImposto());

        valorTotalImpostos += pessoas.calcularImposto();

    }

}
