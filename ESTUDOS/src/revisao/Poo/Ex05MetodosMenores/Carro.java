package revisao.Poo.Ex05MetodosMenores;

public class Carro {

    String fabricante;
    String modelo;
    String cor;
    double precoCompra;
    int anoFabricacao;


    //Metodo

    void imprimirResumoDepreciacao() {
        System.out.println("Tempo de uso (anos): " + calcularTempoDeUso());
        System.out.printf("O valor de revenda do carro %S ano %d é R$ %.2f e o IPVA vale R$ %.2f%n",
                modelo,
                anoFabricacao,
                calcularValorRevenda(),
                calcularIpva());
    }

    double calcularIpva() {
        if (calcularTempoDeUso() > 15) {
            return 0;
        }
        return calcularValorRevenda() * 0.03;
    }

    int calcularTempoDeUso() {
        return 2026 - anoFabricacao;
    }

    double calcularValorRevenda() {
        int vidaUtilEmAnos = 20;
        int tempoUso = calcularTempoDeUso();

        double valorRevenda = (precoCompra / vidaUtilEmAnos) * (vidaUtilEmAnos - tempoUso);

        if (valorRevenda < 0) {
            valorRevenda = 0;
        }

        return valorRevenda;

    }
}
